// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceVirtualNetworkRuleArgs extends InvokeArgs {

    public static final GetNamespaceVirtualNetworkRuleArgs Empty = new GetNamespaceVirtualNetworkRuleArgs();

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The Namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group within the azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Virtual Network Rule name.
     * 
     */
    @Import(name="virtualNetworkRuleName", required=true)
    private String virtualNetworkRuleName;

    /**
     * @return The Virtual Network Rule name.
     * 
     */
    public String virtualNetworkRuleName() {
        return this.virtualNetworkRuleName;
    }

    private GetNamespaceVirtualNetworkRuleArgs() {}

    private GetNamespaceVirtualNetworkRuleArgs(GetNamespaceVirtualNetworkRuleArgs $) {
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkRuleName = $.virtualNetworkRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceVirtualNetworkRuleArgs $;

        public Builder() {
            $ = new GetNamespaceVirtualNetworkRuleArgs();
        }

        public Builder(GetNamespaceVirtualNetworkRuleArgs defaults) {
            $ = new GetNamespaceVirtualNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceName The Namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualNetworkRuleName The Virtual Network Rule name.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRuleName(String virtualNetworkRuleName) {
            $.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }

        public GetNamespaceVirtualNetworkRuleArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkRuleName = Objects.requireNonNull($.virtualNetworkRuleName, "expected parameter 'virtualNetworkRuleName' to be non-null");
            return $;
        }
    }

}
