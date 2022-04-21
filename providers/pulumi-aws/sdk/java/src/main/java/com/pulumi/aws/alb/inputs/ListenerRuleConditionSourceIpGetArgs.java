// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleConditionSourceIpGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionSourceIpGetArgs Empty = new ListenerRuleConditionSourceIpGetArgs();

    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private ListenerRuleConditionSourceIpGetArgs() {}

    private ListenerRuleConditionSourceIpGetArgs(ListenerRuleConditionSourceIpGetArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleConditionSourceIpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleConditionSourceIpGetArgs $;

        public Builder() {
            $ = new ListenerRuleConditionSourceIpGetArgs();
        }

        public Builder(ListenerRuleConditionSourceIpGetArgs defaults) {
            $ = new ListenerRuleConditionSourceIpGetArgs(Objects.requireNonNull(defaults));
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

        public ListenerRuleConditionSourceIpGetArgs build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
