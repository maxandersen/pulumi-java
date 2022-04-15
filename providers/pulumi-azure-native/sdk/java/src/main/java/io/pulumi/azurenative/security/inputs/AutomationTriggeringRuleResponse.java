// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule which is evaluated upon event interception. The rule is configured by comparing a specific value from the event model to an expected value. This comparison is done by using one of the supported operators set.
 * 
 */
public final class AutomationTriggeringRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationTriggeringRuleResponse Empty = new AutomationTriggeringRuleResponse();

    /**
     * The expected value.
     * 
     */
    @Import(name="expectedValue")
      private final @Nullable String expectedValue;

    public Optional<String> expectedValue() {
        return this.expectedValue == null ? Optional.empty() : Optional.ofNullable(this.expectedValue);
    }

    /**
     * A valid comparer operator to use. A case-insensitive comparison will be applied for String PropertyType.
     * 
     */
    @Import(name="operator")
      private final @Nullable String operator;

    public Optional<String> operator() {
        return this.operator == null ? Optional.empty() : Optional.ofNullable(this.operator);
    }

    /**
     * The JPath of the entity model property that should be checked.
     * 
     */
    @Import(name="propertyJPath")
      private final @Nullable String propertyJPath;

    public Optional<String> propertyJPath() {
        return this.propertyJPath == null ? Optional.empty() : Optional.ofNullable(this.propertyJPath);
    }

    /**
     * The data type of the compared operands (string, integer, floating point number or a boolean [true/false]]
     * 
     */
    @Import(name="propertyType")
      private final @Nullable String propertyType;

    public Optional<String> propertyType() {
        return this.propertyType == null ? Optional.empty() : Optional.ofNullable(this.propertyType);
    }

    public AutomationTriggeringRuleResponse(
        @Nullable String expectedValue,
        @Nullable String operator,
        @Nullable String propertyJPath,
        @Nullable String propertyType) {
        this.expectedValue = expectedValue;
        this.operator = operator;
        this.propertyJPath = propertyJPath;
        this.propertyType = propertyType;
    }

    private AutomationTriggeringRuleResponse() {
        this.expectedValue = null;
        this.operator = null;
        this.propertyJPath = null;
        this.propertyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationTriggeringRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expectedValue;
        private @Nullable String operator;
        private @Nullable String propertyJPath;
        private @Nullable String propertyType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationTriggeringRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedValue = defaults.expectedValue;
    	      this.operator = defaults.operator;
    	      this.propertyJPath = defaults.propertyJPath;
    	      this.propertyType = defaults.propertyType;
        }

        public Builder expectedValue(@Nullable String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder propertyJPath(@Nullable String propertyJPath) {
            this.propertyJPath = propertyJPath;
            return this;
        }
        public Builder propertyType(@Nullable String propertyType) {
            this.propertyType = propertyType;
            return this;
        }        public AutomationTriggeringRuleResponse build() {
            return new AutomationTriggeringRuleResponse(expectedValue, operator, propertyJPath, propertyType);
        }
    }
}
