// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.ModelContainerGetArgs;
import com.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigGetArgs;
import com.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerGetArgs;
import com.pulumi.aws.sagemaker.inputs.ModelVpcConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelState extends com.pulumi.resources.ResourceArgs {

    public static final ModelState Empty = new ModelState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this model.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
     * 
     */
    @Import(name="containers")
      private final @Nullable Output<List<ModelContainerGetArgs>> containers;

    public Output<List<ModelContainerGetArgs>> containers() {
        return this.containers == null ? Codegen.empty() : this.containers;
    }

    /**
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * 
     */
    @Import(name="enableNetworkIsolation")
      private final @Nullable Output<Boolean> enableNetworkIsolation;

    public Output<Boolean> enableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Codegen.empty() : this.enableNetworkIsolation;
    }

    /**
     * A role that SageMaker can assume to access model artifacts and docker images for deployment.
     * 
     */
    @Import(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn == null ? Codegen.empty() : this.executionRoleArn;
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
     * 
     */
    @Import(name="inferenceExecutionConfig")
      private final @Nullable Output<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig;

    public Output<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig() {
        return this.inferenceExecutionConfig == null ? Codegen.empty() : this.inferenceExecutionConfig;
    }

    /**
     * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * 
     */
    @Import(name="primaryContainer")
      private final @Nullable Output<ModelPrimaryContainerGetArgs> primaryContainer;

    public Output<ModelPrimaryContainerGetArgs> primaryContainer() {
        return this.primaryContainer == null ? Codegen.empty() : this.primaryContainer;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<ModelVpcConfigGetArgs> vpcConfig;

    public Output<ModelVpcConfigGetArgs> vpcConfig() {
        return this.vpcConfig == null ? Codegen.empty() : this.vpcConfig;
    }

    public ModelState(
        @Nullable Output<String> arn,
        @Nullable Output<List<ModelContainerGetArgs>> containers,
        @Nullable Output<Boolean> enableNetworkIsolation,
        @Nullable Output<String> executionRoleArn,
        @Nullable Output<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig,
        @Nullable Output<String> name,
        @Nullable Output<ModelPrimaryContainerGetArgs> primaryContainer,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<ModelVpcConfigGetArgs> vpcConfig) {
        this.arn = arn;
        this.containers = containers;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.executionRoleArn = executionRoleArn;
        this.inferenceExecutionConfig = inferenceExecutionConfig;
        this.name = name;
        this.primaryContainer = primaryContainer;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcConfig = vpcConfig;
    }

    private ModelState() {
        this.arn = Codegen.empty();
        this.containers = Codegen.empty();
        this.enableNetworkIsolation = Codegen.empty();
        this.executionRoleArn = Codegen.empty();
        this.inferenceExecutionConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.primaryContainer = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpcConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<ModelContainerGetArgs>> containers;
        private @Nullable Output<Boolean> enableNetworkIsolation;
        private @Nullable Output<String> executionRoleArn;
        private @Nullable Output<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<ModelPrimaryContainerGetArgs> primaryContainer;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<ModelVpcConfigGetArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.containers = defaults.containers;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.inferenceExecutionConfig = defaults.inferenceExecutionConfig;
    	      this.name = defaults.name;
    	      this.primaryContainer = defaults.primaryContainer;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder containers(@Nullable Output<List<ModelContainerGetArgs>> containers) {
            this.containers = containers;
            return this;
        }
        public Builder containers(@Nullable List<ModelContainerGetArgs> containers) {
            this.containers = Codegen.ofNullable(containers);
            return this;
        }
        public Builder containers(ModelContainerGetArgs... containers) {
            return containers(List.of(containers));
        }
        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Codegen.ofNullable(enableNetworkIsolation);
            return this;
        }
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Codegen.ofNullable(executionRoleArn);
            return this;
        }
        public Builder inferenceExecutionConfig(@Nullable Output<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig) {
            this.inferenceExecutionConfig = inferenceExecutionConfig;
            return this;
        }
        public Builder inferenceExecutionConfig(@Nullable ModelInferenceExecutionConfigGetArgs inferenceExecutionConfig) {
            this.inferenceExecutionConfig = Codegen.ofNullable(inferenceExecutionConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder primaryContainer(@Nullable Output<ModelPrimaryContainerGetArgs> primaryContainer) {
            this.primaryContainer = primaryContainer;
            return this;
        }
        public Builder primaryContainer(@Nullable ModelPrimaryContainerGetArgs primaryContainer) {
            this.primaryContainer = Codegen.ofNullable(primaryContainer);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<ModelVpcConfigGetArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable ModelVpcConfigGetArgs vpcConfig) {
            this.vpcConfig = Codegen.ofNullable(vpcConfig);
            return this;
        }        public ModelState build() {
            return new ModelState(arn, containers, enableNetworkIsolation, executionRoleArn, inferenceExecutionConfig, name, primaryContainer, tags, tagsAll, vpcConfig);
        }
    }
}
