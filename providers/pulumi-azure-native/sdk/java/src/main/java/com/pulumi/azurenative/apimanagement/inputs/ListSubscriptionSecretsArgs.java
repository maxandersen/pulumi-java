// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListSubscriptionSecretsArgs extends InvokeArgs {

    public static final ListSubscriptionSecretsArgs Empty = new ListSubscriptionSecretsArgs();

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
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * 
     */
    @Import(name="sid", required=true)
    private String sid;

    /**
     * @return Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * 
     */
    public String sid() {
        return this.sid;
    }

    private ListSubscriptionSecretsArgs() {}

    private ListSubscriptionSecretsArgs(ListSubscriptionSecretsArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.sid = $.sid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListSubscriptionSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListSubscriptionSecretsArgs $;

        public Builder() {
            $ = new ListSubscriptionSecretsArgs();
        }

        public Builder(ListSubscriptionSecretsArgs defaults) {
            $ = new ListSubscriptionSecretsArgs(Objects.requireNonNull(defaults));
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
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            $.sid = sid;
            return this;
        }

        public ListSubscriptionSecretsArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.sid = Objects.requireNonNull($.sid, "expected parameter 'sid' to be non-null");
            return $;
        }
    }

}
