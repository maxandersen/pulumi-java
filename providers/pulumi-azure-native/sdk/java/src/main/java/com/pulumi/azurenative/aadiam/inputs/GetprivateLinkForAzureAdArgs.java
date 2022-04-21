// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetprivateLinkForAzureAdArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetprivateLinkForAzureAdArgs Empty = new GetprivateLinkForAzureAdArgs();

    /**
     * The name of the private link policy in Azure AD.
     * 
     */
    @Import(name="policyName", required=true)
    private String policyName;

    public String policyName() {
        return this.policyName;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetprivateLinkForAzureAdArgs() {}

    private GetprivateLinkForAzureAdArgs(GetprivateLinkForAzureAdArgs $) {
        this.policyName = $.policyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetprivateLinkForAzureAdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetprivateLinkForAzureAdArgs $;

        public Builder() {
            $ = new GetprivateLinkForAzureAdArgs();
        }

        public Builder(GetprivateLinkForAzureAdArgs defaults) {
            $ = new GetprivateLinkForAzureAdArgs(Objects.requireNonNull(defaults));
        }

        public Builder policyName(String policyName) {
            $.policyName = policyName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetprivateLinkForAzureAdArgs build() {
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
