// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventPermissionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventPermissionConditionArgs Empty = new EventPermissionConditionArgs();

    /**
     * Key for the condition. Valid values: `aws:PrincipalOrgID`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Type of condition. Value values: `StringEquals`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Value for the key.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private EventPermissionConditionArgs() {}

    private EventPermissionConditionArgs(EventPermissionConditionArgs $) {
        this.key = $.key;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventPermissionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventPermissionConditionArgs $;

        public Builder() {
            $ = new EventPermissionConditionArgs();
        }

        public Builder(EventPermissionConditionArgs defaults) {
            $ = new EventPermissionConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EventPermissionConditionArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
