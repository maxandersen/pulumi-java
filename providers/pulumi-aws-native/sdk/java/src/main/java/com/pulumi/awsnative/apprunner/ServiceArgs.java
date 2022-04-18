// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner;

import com.pulumi.awsnative.apprunner.inputs.ServiceEncryptionConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceHealthCheckConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceInstanceConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceSourceConfigurationArgs;
import com.pulumi.awsnative.apprunner.inputs.ServiceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Autoscaling configuration ARN
     * 
     */
    @Import(name="autoScalingConfigurationArn")
      private final @Nullable Output<String> autoScalingConfigurationArn;

    public Output<String> autoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn == null ? Codegen.empty() : this.autoScalingConfigurationArn;
    }

    @Import(name="encryptionConfiguration")
      private final @Nullable Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration;

    public Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration() {
        return this.encryptionConfiguration == null ? Codegen.empty() : this.encryptionConfiguration;
    }

    @Import(name="healthCheckConfiguration")
      private final @Nullable Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration;

    public Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration() {
        return this.healthCheckConfiguration == null ? Codegen.empty() : this.healthCheckConfiguration;
    }

    @Import(name="instanceConfiguration")
      private final @Nullable Output<ServiceInstanceConfigurationArgs> instanceConfiguration;

    public Output<ServiceInstanceConfigurationArgs> instanceConfiguration() {
        return this.instanceConfiguration == null ? Codegen.empty() : this.instanceConfiguration;
    }

    /**
     * The AppRunner Service Name.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName == null ? Codegen.empty() : this.serviceName;
    }

    @Import(name="sourceConfiguration", required=true)
      private final Output<ServiceSourceConfigurationArgs> sourceConfiguration;

    public Output<ServiceSourceConfigurationArgs> sourceConfiguration() {
        return this.sourceConfiguration;
    }

    @Import(name="tags")
      private final @Nullable Output<List<ServiceTagArgs>> tags;

    public Output<List<ServiceTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ServiceArgs(
        @Nullable Output<String> autoScalingConfigurationArn,
        @Nullable Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration,
        @Nullable Output<ServiceInstanceConfigurationArgs> instanceConfiguration,
        @Nullable Output<String> serviceName,
        Output<ServiceSourceConfigurationArgs> sourceConfiguration,
        @Nullable Output<List<ServiceTagArgs>> tags) {
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
        this.encryptionConfiguration = encryptionConfiguration;
        this.healthCheckConfiguration = healthCheckConfiguration;
        this.instanceConfiguration = instanceConfiguration;
        this.serviceName = serviceName;
        this.sourceConfiguration = Objects.requireNonNull(sourceConfiguration, "expected parameter 'sourceConfiguration' to be non-null");
        this.tags = tags;
    }

    private ServiceArgs() {
        this.autoScalingConfigurationArn = Codegen.empty();
        this.encryptionConfiguration = Codegen.empty();
        this.healthCheckConfiguration = Codegen.empty();
        this.instanceConfiguration = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.sourceConfiguration = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoScalingConfigurationArn;
        private @Nullable Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration;
        private @Nullable Output<ServiceInstanceConfigurationArgs> instanceConfiguration;
        private @Nullable Output<String> serviceName;
        private Output<ServiceSourceConfigurationArgs> sourceConfiguration;
        private @Nullable Output<List<ServiceTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingConfigurationArn = defaults.autoScalingConfigurationArn;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.healthCheckConfiguration = defaults.healthCheckConfiguration;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.serviceName = defaults.serviceName;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder autoScalingConfigurationArn(@Nullable Output<String> autoScalingConfigurationArn) {
            this.autoScalingConfigurationArn = autoScalingConfigurationArn;
            return this;
        }
        public Builder autoScalingConfigurationArn(@Nullable String autoScalingConfigurationArn) {
            this.autoScalingConfigurationArn = Codegen.ofNullable(autoScalingConfigurationArn);
            return this;
        }
        public Builder encryptionConfiguration(@Nullable Output<ServiceEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable ServiceEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Codegen.ofNullable(encryptionConfiguration);
            return this;
        }
        public Builder healthCheckConfiguration(@Nullable Output<ServiceHealthCheckConfigurationArgs> healthCheckConfiguration) {
            this.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }
        public Builder healthCheckConfiguration(@Nullable ServiceHealthCheckConfigurationArgs healthCheckConfiguration) {
            this.healthCheckConfiguration = Codegen.ofNullable(healthCheckConfiguration);
            return this;
        }
        public Builder instanceConfiguration(@Nullable Output<ServiceInstanceConfigurationArgs> instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }
        public Builder instanceConfiguration(@Nullable ServiceInstanceConfigurationArgs instanceConfiguration) {
            this.instanceConfiguration = Codegen.ofNullable(instanceConfiguration);
            return this;
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Codegen.ofNullable(serviceName);
            return this;
        }
        public Builder sourceConfiguration(Output<ServiceSourceConfigurationArgs> sourceConfiguration) {
            this.sourceConfiguration = Objects.requireNonNull(sourceConfiguration);
            return this;
        }
        public Builder sourceConfiguration(ServiceSourceConfigurationArgs sourceConfiguration) {
            this.sourceConfiguration = Output.of(Objects.requireNonNull(sourceConfiguration));
            return this;
        }
        public Builder tags(@Nullable Output<List<ServiceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ServiceTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ServiceTagArgs... tags) {
            return tags(List.of(tags));
        }        public ServiceArgs build() {
            return new ServiceArgs(autoScalingConfigurationArn, encryptionConfiguration, healthCheckConfiguration, instanceConfiguration, serviceName, sourceConfiguration, tags);
        }
    }
}
