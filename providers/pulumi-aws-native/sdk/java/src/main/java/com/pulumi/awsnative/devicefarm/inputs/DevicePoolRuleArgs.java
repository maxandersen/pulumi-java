// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.inputs;

import com.pulumi.awsnative.devicefarm.enums.DevicePoolRuleAttribute;
import com.pulumi.awsnative.devicefarm.enums.DevicePoolRuleOperator;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a condition for a device pool.
 * 
 */
public final class DevicePoolRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePoolRuleArgs Empty = new DevicePoolRuleArgs();

    /**
     * The rule&#39;s stringified attribute.
     * 
     */
    @Import(name="attribute")
      private final @Nullable Output<DevicePoolRuleAttribute> attribute;

    public Output<DevicePoolRuleAttribute> attribute() {
        return this.attribute == null ? Codegen.empty() : this.attribute;
    }

    /**
     * Specifies how Device Farm compares the rule&#39;s attribute to the value.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<DevicePoolRuleOperator> operator;

    public Output<DevicePoolRuleOperator> operator() {
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
        @Nullable Output<DevicePoolRuleAttribute> attribute,
        @Nullable Output<DevicePoolRuleOperator> operator,
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
        private @Nullable Output<DevicePoolRuleAttribute> attribute;
        private @Nullable Output<DevicePoolRuleOperator> operator;
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

        public Builder attribute(@Nullable Output<DevicePoolRuleAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }
        public Builder attribute(@Nullable DevicePoolRuleAttribute attribute) {
            this.attribute = Codegen.ofNullable(attribute);
            return this;
        }
        public Builder operator(@Nullable Output<DevicePoolRuleOperator> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable DevicePoolRuleOperator operator) {
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
