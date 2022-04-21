// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.ContainerIdentityInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container extended information
 * 
 */
public final class GenericContainerExtendedInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GenericContainerExtendedInfoArgs Empty = new GenericContainerExtendedInfoArgs();

    /**
     * Container identity information
     * 
     */
    @Import(name="containerIdentityInfo")
    private @Nullable Output<ContainerIdentityInfoArgs> containerIdentityInfo;

    public Optional<Output<ContainerIdentityInfoArgs>> containerIdentityInfo() {
        return Optional.ofNullable(this.containerIdentityInfo);
    }

    /**
     * Public key of container cert
     * 
     */
    @Import(name="rawCertData")
    private @Nullable Output<String> rawCertData;

    public Optional<Output<String>> rawCertData() {
        return Optional.ofNullable(this.rawCertData);
    }

    /**
     * Azure Backup Service Endpoints for the container
     * 
     */
    @Import(name="serviceEndpoints")
    private @Nullable Output<Map<String,String>> serviceEndpoints;

    public Optional<Output<Map<String,String>>> serviceEndpoints() {
        return Optional.ofNullable(this.serviceEndpoints);
    }

    private GenericContainerExtendedInfoArgs() {}

    private GenericContainerExtendedInfoArgs(GenericContainerExtendedInfoArgs $) {
        this.containerIdentityInfo = $.containerIdentityInfo;
        this.rawCertData = $.rawCertData;
        this.serviceEndpoints = $.serviceEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenericContainerExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericContainerExtendedInfoArgs $;

        public Builder() {
            $ = new GenericContainerExtendedInfoArgs();
        }

        public Builder(GenericContainerExtendedInfoArgs defaults) {
            $ = new GenericContainerExtendedInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerIdentityInfo(@Nullable Output<ContainerIdentityInfoArgs> containerIdentityInfo) {
            $.containerIdentityInfo = containerIdentityInfo;
            return this;
        }

        public Builder containerIdentityInfo(ContainerIdentityInfoArgs containerIdentityInfo) {
            return containerIdentityInfo(Output.of(containerIdentityInfo));
        }

        public Builder rawCertData(@Nullable Output<String> rawCertData) {
            $.rawCertData = rawCertData;
            return this;
        }

        public Builder rawCertData(String rawCertData) {
            return rawCertData(Output.of(rawCertData));
        }

        public Builder serviceEndpoints(@Nullable Output<Map<String,String>> serviceEndpoints) {
            $.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public Builder serviceEndpoints(Map<String,String> serviceEndpoints) {
            return serviceEndpoints(Output.of(serviceEndpoints));
        }

        public GenericContainerExtendedInfoArgs build() {
            return $;
        }
    }

}
