// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement;

import com.pulumi.azurenative.costmanagement.inputs.CostAllocationRulePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CostAllocationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostAllocationRuleArgs Empty = new CostAllocationRuleArgs();

    /**
     * BillingAccount ID
     * 
     */
    @Import(name="billingAccountId", required=true)
    private Output<String> billingAccountId;

    /**
     * @return BillingAccount ID
     * 
     */
    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Cost allocation rule properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<CostAllocationRulePropertiesArgs> properties;

    /**
     * @return Cost allocation rule properties
     * 
     */
    public Optional<Output<CostAllocationRulePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    private CostAllocationRuleArgs() {}

    private CostAllocationRuleArgs(CostAllocationRuleArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.properties = $.properties;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostAllocationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostAllocationRuleArgs $;

        public Builder() {
            $ = new CostAllocationRuleArgs();
        }

        public Builder(CostAllocationRuleArgs defaults) {
            $ = new CostAllocationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountId BillingAccount ID
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        /**
         * @param billingAccountId BillingAccount ID
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        /**
         * @param properties Cost allocation rule properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<CostAllocationRulePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Cost allocation rule properties
         * 
         * @return builder
         * 
         */
        public Builder properties(CostAllocationRulePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param ruleName Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public CostAllocationRuleArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            return $;
        }
    }

}
