// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.ManagementPolicyRuleResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
 * 
 */
public final class ManagementPolicySchemaResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementPolicySchemaResponse Empty = new ManagementPolicySchemaResponse();

    /**
     * The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    @Import(name="rules", required=true)
      private final List<ManagementPolicyRuleResponse> rules;

    public List<ManagementPolicyRuleResponse> rules() {
        return this.rules;
    }

    public ManagementPolicySchemaResponse(List<ManagementPolicyRuleResponse> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private ManagementPolicySchemaResponse() {
        this.rules = List.of();
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
