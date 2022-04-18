// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks;

import com.pulumi.awsnative.eks.inputs.ClusterEncryptionConfigArgs;
import com.pulumi.awsnative.eks.inputs.ClusterKubernetesNetworkConfigArgs;
import com.pulumi.awsnative.eks.inputs.ClusterLoggingArgs;
import com.pulumi.awsnative.eks.inputs.ClusterResourcesVpcConfigArgs;
import com.pulumi.awsnative.eks.inputs.ClusterTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    @Import(name="encryptionConfig")
      private final @Nullable Output<List<ClusterEncryptionConfigArgs>> encryptionConfig;

    public Output<List<ClusterEncryptionConfigArgs>> encryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    @Import(name="kubernetesNetworkConfig")
      private final @Nullable Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig;

    public Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig() {
        return this.kubernetesNetworkConfig == null ? Codegen.empty() : this.kubernetesNetworkConfig;
    }

    @Import(name="logging")
      private final @Nullable Output<ClusterLoggingArgs> logging;

    public Output<ClusterLoggingArgs> logging() {
        return this.logging == null ? Codegen.empty() : this.logging;
    }

    /**
     * The unique name to give to your cluster.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="resourcesVpcConfig", required=true)
      private final Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig;

    public Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ClusterTagArgs>> tags;

    public Output<List<ClusterTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The desired Kubernetes version for your cluster. If you don't specify a value here, the latest version available in Amazon EKS is used.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ClusterArgs(
        @Nullable Output<List<ClusterEncryptionConfigArgs>> encryptionConfig,
        @Nullable Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig,
        @Nullable Output<ClusterLoggingArgs> logging,
        @Nullable Output<String> name,
        Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig,
        Output<String> roleArn,
        @Nullable Output<List<ClusterTagArgs>> tags,
        @Nullable Output<String> version) {
        this.encryptionConfig = encryptionConfig;
        this.kubernetesNetworkConfig = kubernetesNetworkConfig;
        this.logging = logging;
        this.name = name;
        this.resourcesVpcConfig = Objects.requireNonNull(resourcesVpcConfig, "expected parameter 'resourcesVpcConfig' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.version = version;
    }

    private ClusterArgs() {
        this.encryptionConfig = Codegen.empty();
        this.kubernetesNetworkConfig = Codegen.empty();
        this.logging = Codegen.empty();
        this.name = Codegen.empty();
        this.resourcesVpcConfig = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClusterEncryptionConfigArgs>> encryptionConfig;
        private @Nullable Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig;
        private @Nullable Output<ClusterLoggingArgs> logging;
        private @Nullable Output<String> name;
        private Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig;
        private Output<String> roleArn;
        private @Nullable Output<List<ClusterTagArgs>> tags;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.kubernetesNetworkConfig = defaults.kubernetesNetworkConfig;
    	      this.logging = defaults.logging;
    	      this.name = defaults.name;
    	      this.resourcesVpcConfig = defaults.resourcesVpcConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder encryptionConfig(@Nullable Output<List<ClusterEncryptionConfigArgs>> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable List<ClusterEncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder encryptionConfig(ClusterEncryptionConfigArgs... encryptionConfig) {
            return encryptionConfig(List.of(encryptionConfig));
        }
        public Builder kubernetesNetworkConfig(@Nullable Output<ClusterKubernetesNetworkConfigArgs> kubernetesNetworkConfig) {
            this.kubernetesNetworkConfig = kubernetesNetworkConfig;
            return this;
        }
        public Builder kubernetesNetworkConfig(@Nullable ClusterKubernetesNetworkConfigArgs kubernetesNetworkConfig) {
            this.kubernetesNetworkConfig = Codegen.ofNullable(kubernetesNetworkConfig);
            return this;
        }
        public Builder logging(@Nullable Output<ClusterLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }
        public Builder logging(@Nullable ClusterLoggingArgs logging) {
            this.logging = Codegen.ofNullable(logging);
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
        public Builder resourcesVpcConfig(Output<ClusterResourcesVpcConfigArgs> resourcesVpcConfig) {
            this.resourcesVpcConfig = Objects.requireNonNull(resourcesVpcConfig);
            return this;
        }
        public Builder resourcesVpcConfig(ClusterResourcesVpcConfigArgs resourcesVpcConfig) {
            this.resourcesVpcConfig = Output.of(Objects.requireNonNull(resourcesVpcConfig));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<List<ClusterTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ClusterTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ClusterTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ClusterArgs build() {
            return new ClusterArgs(encryptionConfig, kubernetesNetworkConfig, logging, name, resourcesVpcConfig, roleArn, tags, version);
        }
    }
}
