// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.AutomationRulePropertyValuesConditionConditionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an automation rule condition that evaluates a property&#39;s value
 * 
 */
public final class AutomationRulePropertyValuesConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRulePropertyValuesConditionArgs Empty = new AutomationRulePropertyValuesConditionArgs();

    /**
     * The configuration of the automation rule condition
     * 
     */
    @Import(name="conditionProperties", required=true)
      private final Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties;

    public Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties() {
        return this.conditionProperties;
    }

    /**
     * The type of the automation rule condition
     * Expected value is &#39;Property&#39;.
     * 
     */
    @Import(name="conditionType", required=true)
      private final Output<String> conditionType;

    public Output<String> conditionType() {
        return this.conditionType;
    }

    public AutomationRulePropertyValuesConditionArgs(
        Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties,
        Output<String> conditionType) {
        this.conditionProperties = Objects.requireNonNull(conditionProperties, "expected parameter 'conditionProperties' to be non-null");
        this.conditionType = Codegen.stringProp("conditionType").output().arg(conditionType).require();
    }

    private AutomationRulePropertyValuesConditionArgs() {
        this.conditionProperties = Codegen.empty();
        this.conditionType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRulePropertyValuesConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties;
        private Output<String> conditionType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRulePropertyValuesConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionProperties = defaults.conditionProperties;
    	      this.conditionType = defaults.conditionType;
        }

        public Builder conditionProperties(Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties) {
            this.conditionProperties = Objects.requireNonNull(conditionProperties);
            return this;
        }
        public Builder conditionProperties(AutomationRulePropertyValuesConditionConditionPropertiesArgs conditionProperties) {
            this.conditionProperties = Output.of(Objects.requireNonNull(conditionProperties));
            return this;
        }
        public Builder conditionType(Output<String> conditionType) {
            this.conditionType = Objects.requireNonNull(conditionType);
            return this;
        }
        public Builder conditionType(String conditionType) {
            this.conditionType = Output.of(Objects.requireNonNull(conditionType));
            return this;
        }        public AutomationRulePropertyValuesConditionArgs build() {
            return new AutomationRulePropertyValuesConditionArgs(conditionProperties, conditionType);
        }
    }
}
