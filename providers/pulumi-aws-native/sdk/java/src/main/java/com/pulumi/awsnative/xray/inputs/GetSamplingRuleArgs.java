// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSamplingRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSamplingRuleArgs Empty = new GetSamplingRuleArgs();

    @Import(name="ruleARN", required=true)
    private String ruleARN;

    public String ruleARN() {
        return this.ruleARN;
    }

    private GetSamplingRuleArgs() {}

    private GetSamplingRuleArgs(GetSamplingRuleArgs $) {
        this.ruleARN = $.ruleARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSamplingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSamplingRuleArgs $;

        public Builder() {
            $ = new GetSamplingRuleArgs();
        }

        public Builder(GetSamplingRuleArgs defaults) {
            $ = new GetSamplingRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleARN(String ruleARN) {
            $.ruleARN = ruleARN;
            return this;
        }

        public GetSamplingRuleArgs build() {
            $.ruleARN = Objects.requireNonNull($.ruleARN, "expected parameter 'ruleARN' to be non-null");
            return $;
        }
    }

}
