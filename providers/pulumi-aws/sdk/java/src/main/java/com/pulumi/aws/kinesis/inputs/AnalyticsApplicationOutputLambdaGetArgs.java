// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationOutputLambdaGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputLambdaGetArgs Empty = new AnalyticsApplicationOutputLambdaGetArgs();

    /**
     * The ARN of the Lambda function.
     * 
     */
    @Import(name="resourceArn", required=true)
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     * The ARN of the IAM Role used to access the Lambda function.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    private AnalyticsApplicationOutputLambdaGetArgs() {}

    private AnalyticsApplicationOutputLambdaGetArgs(AnalyticsApplicationOutputLambdaGetArgs $) {
        this.resourceArn = $.resourceArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationOutputLambdaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationOutputLambdaGetArgs $;

        public Builder() {
            $ = new AnalyticsApplicationOutputLambdaGetArgs();
        }

        public Builder(AnalyticsApplicationOutputLambdaGetArgs defaults) {
            $ = new AnalyticsApplicationOutputLambdaGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceArn(Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public AnalyticsApplicationOutputLambdaGetArgs build() {
            $.resourceArn = Objects.requireNonNull($.resourceArn, "expected parameter 'resourceArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
