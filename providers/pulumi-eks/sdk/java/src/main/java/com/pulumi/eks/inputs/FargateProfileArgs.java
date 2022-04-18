// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks.inputs;

import com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines how Kubernetes pods are executed in Fargate. See aws.eks.FargateProfileArgs for reference.
 * 
 */
public final class FargateProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final FargateProfileArgs Empty = new FargateProfileArgs();

    /**
     * Specify a custom role to use for executing pods in Fargate. Defaults to creating a new role with the `arn:aws:iam::aws:policy/AmazonEKSFargatePodExecutionRolePolicy` policy attached.
     * 
     */
    @Import(name="podExecutionRoleArn")
      private final @Nullable Output<String> podExecutionRoleArn;

    public Output<String> podExecutionRoleArn() {
        return this.podExecutionRoleArn == null ? Codegen.empty() : this.podExecutionRoleArn;
    }

    /**
     * Specify the namespace and label selectors to use for launching pods into Fargate.
     * 
     */
    @Import(name="selectors")
      private final @Nullable Output<List<FargateProfileSelectorArgs>> selectors;

    public Output<List<FargateProfileSelectorArgs>> selectors() {
        return this.selectors == null ? Codegen.empty() : this.selectors;
    }

    /**
     * Specify the subnets in which to execute Fargate tasks for pods. Defaults to the private subnets associated with the cluster.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    public FargateProfileArgs(
        @Nullable Output<String> podExecutionRoleArn,
        @Nullable Output<List<FargateProfileSelectorArgs>> selectors,
        @Nullable Output<List<String>> subnetIds) {
        this.podExecutionRoleArn = podExecutionRoleArn;
        this.selectors = selectors;
        this.subnetIds = subnetIds;
    }

    private FargateProfileArgs() {
        this.podExecutionRoleArn = Codegen.empty();
        this.selectors = Codegen.empty();
        this.subnetIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FargateProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> podExecutionRoleArn;
        private @Nullable Output<List<FargateProfileSelectorArgs>> selectors;
        private @Nullable Output<List<String>> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(FargateProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podExecutionRoleArn = defaults.podExecutionRoleArn;
    	      this.selectors = defaults.selectors;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder podExecutionRoleArn(@Nullable Output<String> podExecutionRoleArn) {
            this.podExecutionRoleArn = podExecutionRoleArn;
            return this;
        }
        public Builder podExecutionRoleArn(@Nullable String podExecutionRoleArn) {
            this.podExecutionRoleArn = Codegen.ofNullable(podExecutionRoleArn);
            return this;
        }
        public Builder selectors(@Nullable Output<List<FargateProfileSelectorArgs>> selectors) {
            this.selectors = selectors;
            return this;
        }
        public Builder selectors(@Nullable List<FargateProfileSelectorArgs> selectors) {
            this.selectors = Codegen.ofNullable(selectors);
            return this;
        }
        public Builder selectors(FargateProfileSelectorArgs... selectors) {
            return selectors(List.of(selectors));
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public FargateProfileArgs build() {
            return new FargateProfileArgs(podExecutionRoleArn, selectors, subnetIds);
        }
    }
}
