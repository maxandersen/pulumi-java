// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSharedPrivateLinkResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedPrivateLinkResourceArgs Empty = new GetSharedPrivateLinkResourceArgs();

    /**
     * The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Cognitive Search service associated with the specified resource group.
     * 
     */
    @Import(name="searchServiceName", required=true)
    private String searchServiceName;

    /**
     * @return The name of the Azure Cognitive Search service associated with the specified resource group.
     * 
     */
    public String searchServiceName() {
        return this.searchServiceName;
    }

    /**
     * The name of the shared private link resource managed by the Azure Cognitive Search service within the specified resource group.
     * 
     */
    @Import(name="sharedPrivateLinkResourceName", required=true)
    private String sharedPrivateLinkResourceName;

    /**
     * @return The name of the shared private link resource managed by the Azure Cognitive Search service within the specified resource group.
     * 
     */
    public String sharedPrivateLinkResourceName() {
        return this.sharedPrivateLinkResourceName;
    }

    private GetSharedPrivateLinkResourceArgs() {}

    private GetSharedPrivateLinkResourceArgs(GetSharedPrivateLinkResourceArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.searchServiceName = $.searchServiceName;
        this.sharedPrivateLinkResourceName = $.sharedPrivateLinkResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedPrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedPrivateLinkResourceArgs $;

        public Builder() {
            $ = new GetSharedPrivateLinkResourceArgs();
        }

        public Builder(GetSharedPrivateLinkResourceArgs defaults) {
            $ = new GetSharedPrivateLinkResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder searchServiceName(String searchServiceName) {
            $.searchServiceName = searchServiceName;
            return this;
        }

        /**
         * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive Search service within the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder sharedPrivateLinkResourceName(String sharedPrivateLinkResourceName) {
            $.sharedPrivateLinkResourceName = sharedPrivateLinkResourceName;
            return this;
        }

        public GetSharedPrivateLinkResourceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.searchServiceName = Objects.requireNonNull($.searchServiceName, "expected parameter 'searchServiceName' to be non-null");
            $.sharedPrivateLinkResourceName = Objects.requireNonNull($.sharedPrivateLinkResourceName, "expected parameter 'sharedPrivateLinkResourceName' to be non-null");
            return $;
        }
    }

}
