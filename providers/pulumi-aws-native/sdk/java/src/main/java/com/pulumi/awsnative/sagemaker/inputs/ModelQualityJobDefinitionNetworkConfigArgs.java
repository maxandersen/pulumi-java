// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class ModelQualityJobDefinitionNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionNetworkConfigArgs Empty = new ModelQualityJobDefinitionNetworkConfigArgs();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @Import(name="enableInterContainerTrafficEncryption")
    private @Nullable Output<Boolean> enableInterContainerTrafficEncryption;

    public Optional<Output<Boolean>> enableInterContainerTrafficEncryption() {
        return Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @Import(name="enableNetworkIsolation")
    private @Nullable Output<Boolean> enableNetworkIsolation;

    public Optional<Output<Boolean>> enableNetworkIsolation() {
        return Optional.ofNullable(this.enableNetworkIsolation);
    }

    @Import(name="vpcConfig")
    private @Nullable Output<ModelQualityJobDefinitionVpcConfigArgs> vpcConfig;

    public Optional<Output<ModelQualityJobDefinitionVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private ModelQualityJobDefinitionNetworkConfigArgs() {}

    private ModelQualityJobDefinitionNetworkConfigArgs(ModelQualityJobDefinitionNetworkConfigArgs $) {
        this.enableInterContainerTrafficEncryption = $.enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = $.enableNetworkIsolation;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelQualityJobDefinitionNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionNetworkConfigArgs $;

        public Builder() {
            $ = new ModelQualityJobDefinitionNetworkConfigArgs();
        }

        public Builder(ModelQualityJobDefinitionNetworkConfigArgs defaults) {
            $ = new ModelQualityJobDefinitionNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableInterContainerTrafficEncryption(@Nullable Output<Boolean> enableInterContainerTrafficEncryption) {
            $.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        public Builder enableInterContainerTrafficEncryption(Boolean enableInterContainerTrafficEncryption) {
            return enableInterContainerTrafficEncryption(Output.of(enableInterContainerTrafficEncryption));
        }

        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            $.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder enableNetworkIsolation(Boolean enableNetworkIsolation) {
            return enableNetworkIsolation(Output.of(enableNetworkIsolation));
        }

        public Builder vpcConfig(@Nullable Output<ModelQualityJobDefinitionVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(ModelQualityJobDefinitionVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public ModelQualityJobDefinitionNetworkConfigArgs build() {
            return $;
        }
    }

}
