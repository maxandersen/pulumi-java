// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleVpcConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringScheduleNetworkConfig {
    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    private final @Nullable Boolean enableInterContainerTrafficEncryption;
    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    private final @Nullable Boolean enableNetworkIsolation;
    private final @Nullable MonitoringScheduleVpcConfig vpcConfig;

    @CustomType.Constructor
    private MonitoringScheduleNetworkConfig(
        @CustomType.Parameter("enableInterContainerTrafficEncryption") @Nullable Boolean enableInterContainerTrafficEncryption,
        @CustomType.Parameter("enableNetworkIsolation") @Nullable Boolean enableNetworkIsolation,
        @CustomType.Parameter("vpcConfig") @Nullable MonitoringScheduleVpcConfig vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
    */
    public Optional<Boolean> enableInterContainerTrafficEncryption() {
        return Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }
    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
    */
    public Optional<Boolean> enableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }
    public Optional<MonitoringScheduleVpcConfig> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInterContainerTrafficEncryption;
        private @Nullable Boolean enableNetworkIsolation;
        private @Nullable MonitoringScheduleVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder enableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }
        public Builder vpcConfig(@Nullable MonitoringScheduleVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }        public MonitoringScheduleNetworkConfig build() {
            return new MonitoringScheduleNetworkConfig(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
