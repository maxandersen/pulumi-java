// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleConditionQueryStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionQueryStringArgs Empty = new ListenerRuleConditionQueryStringArgs();

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

    private ListenerRuleConditionQueryStringArgs() {}

    private ListenerRuleConditionQueryStringArgs(ListenerRuleConditionQueryStringArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleConditionQueryStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleConditionQueryStringArgs $;

        public Builder() {
            $ = new ListenerRuleConditionQueryStringArgs();
        }

        public Builder(ListenerRuleConditionQueryStringArgs defaults) {
            $ = new ListenerRuleConditionQueryStringArgs(Objects.requireNonNull(defaults));
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

        public ListenerRuleConditionQueryStringArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
