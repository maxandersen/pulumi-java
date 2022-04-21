// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPolicySetDefinitionAtManagementGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicySetDefinitionAtManagementGroupArgs Empty = new GetPolicySetDefinitionAtManagementGroupArgs();

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
     * The name of the policy set definition to get.
     * 
     */
    @Import(name="policySetDefinitionName", required=true)
    private String policySetDefinitionName;

    public String policySetDefinitionName() {
        return this.policySetDefinitionName;
    }

    private GetPolicySetDefinitionAtManagementGroupArgs() {}

    private GetPolicySetDefinitionAtManagementGroupArgs(GetPolicySetDefinitionAtManagementGroupArgs $) {
        this.managementGroupId = $.managementGroupId;
        this.policySetDefinitionName = $.policySetDefinitionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicySetDefinitionAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicySetDefinitionAtManagementGroupArgs $;

        public Builder() {
            $ = new GetPolicySetDefinitionAtManagementGroupArgs();
        }

        public Builder(GetPolicySetDefinitionAtManagementGroupArgs defaults) {
            $ = new GetPolicySetDefinitionAtManagementGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder managementGroupId(String managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        public Builder policySetDefinitionName(String policySetDefinitionName) {
            $.policySetDefinitionName = policySetDefinitionName;
            return this;
        }

        public GetPolicySetDefinitionAtManagementGroupArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.policySetDefinitionName = Objects.requireNonNull($.policySetDefinitionName, "expected parameter 'policySetDefinitionName' to be non-null");
            return $;
        }
    }

}
