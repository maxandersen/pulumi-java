// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.AutomationRulePropertyValuesConditionConditionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an automation rule condition that evaluates a property&#39;s value
 * 
 */
public final class AutomationRulePropertyValuesConditionArgs extends ResourceArgs {

    public static final AutomationRulePropertyValuesConditionArgs Empty = new AutomationRulePropertyValuesConditionArgs();

    /**
     * The configuration of the automation rule condition
     * 
     */
    @Import(name="conditionProperties", required=true)
    private Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties;

    /**
     * @return The configuration of the automation rule condition
     * 
     */
    public Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties() {
        return this.conditionProperties;
    }

    /**
     * The type of the automation rule condition
     * Expected value is &#39;Property&#39;.
     * 
     */
    @Import(name="conditionType", required=true)
    private Output<String> conditionType;

    /**
     * @return The type of the automation rule condition
     * Expected value is &#39;Property&#39;.
     * 
     */
    public Output<String> conditionType() {
        return this.conditionType;
    }

    private AutomationRulePropertyValuesConditionArgs() {}

    private AutomationRulePropertyValuesConditionArgs(AutomationRulePropertyValuesConditionArgs $) {
        this.conditionProperties = $.conditionProperties;
        this.conditionType = $.conditionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRulePropertyValuesConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRulePropertyValuesConditionArgs $;

        public Builder() {
            $ = new AutomationRulePropertyValuesConditionArgs();
        }

        public Builder(AutomationRulePropertyValuesConditionArgs defaults) {
            $ = new AutomationRulePropertyValuesConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionProperties The configuration of the automation rule condition
         * 
         * @return builder
         * 
         */
        public Builder conditionProperties(Output<AutomationRulePropertyValuesConditionConditionPropertiesArgs> conditionProperties) {
            $.conditionProperties = conditionProperties;
            return this;
        }

        /**
         * @param conditionProperties The configuration of the automation rule condition
         * 
         * @return builder
         * 
         */
        public Builder conditionProperties(AutomationRulePropertyValuesConditionConditionPropertiesArgs conditionProperties) {
            return conditionProperties(Output.of(conditionProperties));
        }

        /**
         * @param conditionType The type of the automation rule condition
         * Expected value is &#39;Property&#39;.
         * 
         * @return builder
         * 
         */
        public Builder conditionType(Output<String> conditionType) {
            $.conditionType = conditionType;
            return this;
        }

        /**
         * @param conditionType The type of the automation rule condition
         * Expected value is &#39;Property&#39;.
         * 
         * @return builder
         * 
         */
        public Builder conditionType(String conditionType) {
            return conditionType(Output.of(conditionType));
        }

        public AutomationRulePropertyValuesConditionArgs build() {
            $.conditionProperties = Objects.requireNonNull($.conditionProperties, "expected parameter 'conditionProperties' to be non-null");
            $.conditionType = Codegen.stringProp("conditionType").output().arg($.conditionType).require();
            return $;
        }
    }

}
