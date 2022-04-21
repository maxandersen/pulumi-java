// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StandardsSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardsSubscriptionArgs Empty = new StandardsSubscriptionArgs();

    /**
     * The ARN of a standard - see below.
     * 
     */
    @Import(name="standardsArn", required=true)
    private Output<String> standardsArn;

    public Output<String> standardsArn() {
        return this.standardsArn;
    }

    private StandardsSubscriptionArgs() {}

    private StandardsSubscriptionArgs(StandardsSubscriptionArgs $) {
        this.standardsArn = $.standardsArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardsSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardsSubscriptionArgs $;

        public Builder() {
            $ = new StandardsSubscriptionArgs();
        }

        public Builder(StandardsSubscriptionArgs defaults) {
            $ = new StandardsSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder standardsArn(Output<String> standardsArn) {
            $.standardsArn = standardsArn;
            return this;
        }

        public Builder standardsArn(String standardsArn) {
            return standardsArn(Output.of(standardsArn));
        }

        public StandardsSubscriptionArgs build() {
            $.standardsArn = Objects.requireNonNull($.standardsArn, "expected parameter 'standardsArn' to be non-null");
            return $;
        }
    }

}
