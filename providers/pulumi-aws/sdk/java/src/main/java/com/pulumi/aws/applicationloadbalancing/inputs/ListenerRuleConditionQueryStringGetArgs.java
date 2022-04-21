// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleConditionQueryStringGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionQueryStringGetArgs Empty = new ListenerRuleConditionQueryStringGetArgs();

    /**
     * Query string key pattern to match.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Query string value pattern to match.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ListenerRuleConditionQueryStringGetArgs() {}

    private ListenerRuleConditionQueryStringGetArgs(ListenerRuleConditionQueryStringGetArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleConditionQueryStringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleConditionQueryStringGetArgs $;

        public Builder() {
            $ = new ListenerRuleConditionQueryStringGetArgs();
        }

        public Builder(ListenerRuleConditionQueryStringGetArgs defaults) {
            $ = new ListenerRuleConditionQueryStringGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ListenerRuleConditionQueryStringGetArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
