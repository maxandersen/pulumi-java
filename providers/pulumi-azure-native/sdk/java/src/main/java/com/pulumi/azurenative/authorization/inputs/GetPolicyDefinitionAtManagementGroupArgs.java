// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyDefinitionAtManagementGroupArgs extends InvokeArgs {

    public static final GetPolicyDefinitionAtManagementGroupArgs Empty = new GetPolicyDefinitionAtManagementGroupArgs();

    /**
     * The ID of the management group.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private String managementGroupId;

    /**
     * @return The ID of the management group.
     * 
     */
    public String managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the policy definition to get.
     * 
     */
    @Import(name="policyDefinitionName", required=true)
    private String policyDefinitionName;

    /**
     * @return The name of the policy definition to get.
     * 
     */
    public String policyDefinitionName() {
        return this.policyDefinitionName;
    }

    private GetPolicyDefinitionAtManagementGroupArgs() {}

    private GetPolicyDefinitionAtManagementGroupArgs(GetPolicyDefinitionAtManagementGroupArgs $) {
        this.managementGroupId = $.managementGroupId;
        this.policyDefinitionName = $.policyDefinitionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDefinitionAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDefinitionAtManagementGroupArgs $;

        public Builder() {
            $ = new GetPolicyDefinitionAtManagementGroupArgs();
        }

        public Builder(GetPolicyDefinitionAtManagementGroupArgs defaults) {
            $ = new GetPolicyDefinitionAtManagementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementGroupId The ID of the management group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param policyDefinitionName The name of the policy definition to get.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionName(String policyDefinitionName) {
            $.policyDefinitionName = policyDefinitionName;
            return this;
        }

        public GetPolicyDefinitionAtManagementGroupArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.policyDefinitionName = Objects.requireNonNull($.policyDefinitionName, "expected parameter 'policyDefinitionName' to be non-null");
            return $;
        }
    }

}
