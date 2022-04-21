// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionHostHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionHostHeaderArgs Empty = new ListenerRuleConditionHostHeaderArgs();

    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private ListenerRuleConditionHostHeaderArgs() {}

    private ListenerRuleConditionHostHeaderArgs(ListenerRuleConditionHostHeaderArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleConditionHostHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleConditionHostHeaderArgs $;

        public Builder() {
            $ = new ListenerRuleConditionHostHeaderArgs();
        }

        public Builder(ListenerRuleConditionHostHeaderArgs defaults) {
            $ = new ListenerRuleConditionHostHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ListenerRuleConditionHostHeaderArgs build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
