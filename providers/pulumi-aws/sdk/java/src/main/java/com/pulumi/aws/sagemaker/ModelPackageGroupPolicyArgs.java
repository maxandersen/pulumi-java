// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelPackageGroupPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupPolicyArgs Empty = new ModelPackageGroupPolicyArgs();

    /**
     * The name of the model package group.
     * 
     */
    @Import(name="modelPackageGroupName", required=true)
    private Output<String> modelPackageGroupName;

    public Output<String> modelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    @Import(name="resourcePolicy", required=true)
    private Output<String> resourcePolicy;

    public Output<String> resourcePolicy() {
        return this.resourcePolicy;
    }

    private ModelPackageGroupPolicyArgs() {}

    private ModelPackageGroupPolicyArgs(ModelPackageGroupPolicyArgs $) {
        this.modelPackageGroupName = $.modelPackageGroupName;
        this.resourcePolicy = $.resourcePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelPackageGroupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelPackageGroupPolicyArgs $;

        public Builder() {
            $ = new ModelPackageGroupPolicyArgs();
        }

        public Builder(ModelPackageGroupPolicyArgs defaults) {
            $ = new ModelPackageGroupPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder modelPackageGroupName(Output<String> modelPackageGroupName) {
            $.modelPackageGroupName = modelPackageGroupName;
            return this;
        }

        public Builder modelPackageGroupName(String modelPackageGroupName) {
            return modelPackageGroupName(Output.of(modelPackageGroupName));
        }

        public Builder resourcePolicy(Output<String> resourcePolicy) {
            $.resourcePolicy = resourcePolicy;
            return this;
        }

        public Builder resourcePolicy(String resourcePolicy) {
            return resourcePolicy(Output.of(resourcePolicy));
        }

        public ModelPackageGroupPolicyArgs build() {
            $.modelPackageGroupName = Objects.requireNonNull($.modelPackageGroupName, "expected parameter 'modelPackageGroupName' to be non-null");
            $.resourcePolicy = Objects.requireNonNull($.resourcePolicy, "expected parameter 'resourcePolicy' to be non-null");
            return $;
        }
    }

}
