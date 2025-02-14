// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.ManagementPolicyRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ManagementPolicySchemaResponse {
    /**
     * @return The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    private final List<ManagementPolicyRuleResponse> rules;

    @CustomType.Constructor
    private ManagementPolicySchemaResponse(@CustomType.Parameter("rules") List<ManagementPolicyRuleResponse> rules) {
        this.rules = rules;
    }

    /**
     * @return The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    public List<ManagementPolicyRuleResponse> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicySchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ManagementPolicyRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicySchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<ManagementPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(ManagementPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }        public ManagementPolicySchemaResponse build() {
            return new ManagementPolicySchemaResponse(rules);
        }
    }
}
