// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DenylistCustomAlertRuleResponse {
    /**
     * The values to deny. The format of the values depends on the rule type.
     * 
     */
    private final List<String> denylistValues;
    /**
     * The description of the custom alert.
     * 
     */
    private final String description;
    /**
     * The display name of the custom alert.
     * 
     */
    private final String displayName;
    /**
     * Status of the custom alert.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The type of the custom alert rule.
     * Expected value is 'DenylistCustomAlertRule'.
     * 
     */
    private final String ruleType;
    /**
     * The value type of the items in the list.
     * 
     */
    private final String valueType;

    @CustomType.Constructor
    private DenylistCustomAlertRuleResponse(
        @CustomType.Parameter("denylistValues") List<String> denylistValues,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("ruleType") String ruleType,
        @CustomType.Parameter("valueType") String valueType) {
        this.denylistValues = denylistValues;
        this.description = description;
        this.displayName = displayName;
        this.isEnabled = isEnabled;
        this.ruleType = ruleType;
        this.valueType = valueType;
    }

    /**
     * The values to deny. The format of the values depends on the rule type.
     * 
    */
    public List<String> denylistValues() {
        return this.denylistValues;
    }
    /**
     * The description of the custom alert.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The display name of the custom alert.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Status of the custom alert.
     * 
    */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * The type of the custom alert rule.
     * Expected value is 'DenylistCustomAlertRule'.
     * 
    */
    public String ruleType() {
        return this.ruleType;
    }
    /**
     * The value type of the items in the list.
     * 
    */
    public String valueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenylistCustomAlertRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> denylistValues;
        private String description;
        private String displayName;
        private Boolean isEnabled;
        private String ruleType;
        private String valueType;

        public Builder() {
    	      // Empty
        }

        public Builder(DenylistCustomAlertRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denylistValues = defaults.denylistValues;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.ruleType = defaults.ruleType;
    	      this.valueType = defaults.valueType;
        }

        public Builder denylistValues(List<String> denylistValues) {
            this.denylistValues = Objects.requireNonNull(denylistValues);
            return this;
        }
        public Builder denylistValues(String... denylistValues) {
            return denylistValues(List.of(denylistValues));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder valueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }        public DenylistCustomAlertRuleResponse build() {
            return new DenylistCustomAlertRuleResponse(denylistValues, description, displayName, isEnabled, ruleType, valueType);
        }
    }
}
