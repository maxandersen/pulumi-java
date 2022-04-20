// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DevicePoolRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePoolRuleArgs Empty = new DevicePoolRuleArgs();

    /**
     * The rule&#39;s stringified attribute. Valid values are: `APPIUM_VERSION`, `ARN`, `AVAILABILITY`, `FLEET_TYPE`, `FORM_FACTOR`, `INSTANCE_ARN`, `INSTANCE_LABELS`, `MANUFACTURER`, `MODEL`, `OS_VERSION`, `PLATFORM`, `REMOTE_ACCESS_ENABLED`, `REMOTE_DEBUG_ENABLED`.
     * 
     */
    @Import(name="attribute")
      private final @Nullable Output<String> attribute;

    public Output<String> attribute() {
        return this.attribute == null ? Codegen.empty() : this.attribute;
    }

    /**
     * Specifies how Device Farm compares the rule&#39;s attribute to the value. For the operators that are supported by each attribute. Valid values are: `EQUALS`, `NOT_IN`, `IN`, `GREATER_THAN`, `GREATER_THAN_OR_EQUALS`, `LESS_THAN`, `LESS_THAN_OR_EQUALS`, `CONTAINS`.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<String> operator;

    public Output<String> operator() {
        return this.operator == null ? Codegen.empty() : this.operator;
    }

    /**
     * The rule&#39;s value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public DevicePoolRuleArgs(
        @Nullable Output<String> attribute,
        @Nullable Output<String> operator,
        @Nullable Output<String> value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    private DevicePoolRuleArgs() {
        this.attribute = Codegen.empty();
        this.operator = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attribute;
        private @Nullable Output<String> operator;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder attribute(@Nullable Output<String> attribute) {
            this.attribute = attribute;
            return this;
        }
        public Builder attribute(@Nullable String attribute) {
            this.attribute = Codegen.ofNullable(attribute);
            return this;
        }
        public Builder operator(@Nullable Output<String> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = Codegen.ofNullable(operator);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public DevicePoolRuleArgs build() {
            return new DevicePoolRuleArgs(attribute, operator, value);
        }
    }
}
