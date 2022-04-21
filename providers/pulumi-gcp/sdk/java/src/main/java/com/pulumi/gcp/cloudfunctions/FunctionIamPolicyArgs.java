// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionIamPolicyArgs Empty = new FunctionIamPolicyArgs();

    @Import(name="cloudFunction", required=true)
    private Output<String> cloudFunction;

    public Output<String> cloudFunction() {
        return this.cloudFunction;
    }

    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private FunctionIamPolicyArgs() {}

    private FunctionIamPolicyArgs(FunctionIamPolicyArgs $) {
        this.cloudFunction = $.cloudFunction;
        this.policyData = $.policyData;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionIamPolicyArgs $;

        public Builder() {
            $ = new FunctionIamPolicyArgs();
        }

        public Builder(FunctionIamPolicyArgs defaults) {
            $ = new FunctionIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudFunction(Output<String> cloudFunction) {
            $.cloudFunction = cloudFunction;
            return this;
        }

        public Builder cloudFunction(String cloudFunction) {
            return cloudFunction(Output.of(cloudFunction));
        }

        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public FunctionIamPolicyArgs build() {
            $.cloudFunction = Objects.requireNonNull($.cloudFunction, "expected parameter 'cloudFunction' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
