// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetBillingRoleAssignmentByBillingAccountArgs extends InvokeArgs {

    public static final GetBillingRoleAssignmentByBillingAccountArgs Empty = new GetBillingRoleAssignmentByBillingAccountArgs();

    /**
     * The ID that uniquely identifies a billing account.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private String billingAccountName;

    /**
     * @return The ID that uniquely identifies a billing account.
     * 
     */
    public String billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The ID that uniquely identifies a role assignment.
     * 
     */
    @Import(name="billingRoleAssignmentName", required=true)
    private String billingRoleAssignmentName;

    /**
     * @return The ID that uniquely identifies a role assignment.
     * 
     */
    public String billingRoleAssignmentName() {
        return this.billingRoleAssignmentName;
    }

    private GetBillingRoleAssignmentByBillingAccountArgs() {}

    private GetBillingRoleAssignmentByBillingAccountArgs(GetBillingRoleAssignmentByBillingAccountArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.billingRoleAssignmentName = $.billingRoleAssignmentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBillingRoleAssignmentByBillingAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBillingRoleAssignmentByBillingAccountArgs $;

        public Builder() {
            $ = new GetBillingRoleAssignmentByBillingAccountArgs();
        }

        public Builder(GetBillingRoleAssignmentByBillingAccountArgs defaults) {
            $ = new GetBillingRoleAssignmentByBillingAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountName The ID that uniquely identifies a billing account.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(String billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        /**
         * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
         * 
         * @return builder
         * 
         */
        public Builder billingRoleAssignmentName(String billingRoleAssignmentName) {
            $.billingRoleAssignmentName = billingRoleAssignmentName;
            return this;
        }

        public GetBillingRoleAssignmentByBillingAccountArgs build() {
            $.billingAccountName = Objects.requireNonNull($.billingAccountName, "expected parameter 'billingAccountName' to be non-null");
            $.billingRoleAssignmentName = Objects.requireNonNull($.billingRoleAssignmentName, "expected parameter 'billingRoleAssignmentName' to be non-null");
            return $;
        }
    }

}
