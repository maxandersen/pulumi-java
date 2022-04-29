// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetServiceEndpointPolicyDefinitionArgs extends InvokeArgs {

    public static final GetServiceEndpointPolicyDefinitionArgs Empty = new GetServiceEndpointPolicyDefinitionArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service endpoint policy definition name.
     * 
     */
    @Import(name="serviceEndpointPolicyDefinitionName", required=true)
    private String serviceEndpointPolicyDefinitionName;

    /**
     * @return The name of the service endpoint policy definition name.
     * 
     */
    public String serviceEndpointPolicyDefinitionName() {
        return this.serviceEndpointPolicyDefinitionName;
    }

    /**
     * The name of the service endpoint policy name.
     * 
     */
    @Import(name="serviceEndpointPolicyName", required=true)
    private String serviceEndpointPolicyName;

    /**
     * @return The name of the service endpoint policy name.
     * 
     */
    public String serviceEndpointPolicyName() {
        return this.serviceEndpointPolicyName;
    }

    private GetServiceEndpointPolicyDefinitionArgs() {}

    private GetServiceEndpointPolicyDefinitionArgs(GetServiceEndpointPolicyDefinitionArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceEndpointPolicyDefinitionName = $.serviceEndpointPolicyDefinitionName;
        this.serviceEndpointPolicyName = $.serviceEndpointPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceEndpointPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceEndpointPolicyDefinitionArgs $;

        public Builder() {
            $ = new GetServiceEndpointPolicyDefinitionArgs();
        }

        public Builder(GetServiceEndpointPolicyDefinitionArgs defaults) {
            $ = new GetServiceEndpointPolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceEndpointPolicyDefinitionName The name of the service endpoint policy definition name.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyDefinitionName(String serviceEndpointPolicyDefinitionName) {
            $.serviceEndpointPolicyDefinitionName = serviceEndpointPolicyDefinitionName;
            return this;
        }

        /**
         * @param serviceEndpointPolicyName The name of the service endpoint policy name.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpointPolicyName(String serviceEndpointPolicyName) {
            $.serviceEndpointPolicyName = serviceEndpointPolicyName;
            return this;
        }

        public GetServiceEndpointPolicyDefinitionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceEndpointPolicyDefinitionName = Objects.requireNonNull($.serviceEndpointPolicyDefinitionName, "expected parameter 'serviceEndpointPolicyDefinitionName' to be non-null");
            $.serviceEndpointPolicyName = Objects.requireNonNull($.serviceEndpointPolicyName, "expected parameter 'serviceEndpointPolicyName' to be non-null");
            return $;
        }
    }

}
