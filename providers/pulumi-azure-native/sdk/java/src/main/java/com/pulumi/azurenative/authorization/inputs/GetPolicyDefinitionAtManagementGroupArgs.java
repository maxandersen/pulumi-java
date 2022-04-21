// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyDefinitionAtManagementGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDefinitionAtManagementGroupArgs Empty = new GetPolicyDefinitionAtManagementGroupArgs();

    /**
     * The ID of the management group.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private String managementGroupId;

    public String managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the policy definition to get.
     * 
     */
    @Import(name="policyDefinitionName", required=true)
    private String policyDefinitionName;

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

        public Builder managementGroupId(String managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

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
