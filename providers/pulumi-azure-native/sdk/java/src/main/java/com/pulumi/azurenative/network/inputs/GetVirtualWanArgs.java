// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualWanArgs extends InvokeArgs {

    public static final GetVirtualWanArgs Empty = new GetVirtualWanArgs();

    /**
     * The resource group name of the VirtualWan.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name of the VirtualWan.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualWAN being retrieved.
     * 
     */
    @Import(name="virtualWANName", required=true)
    private String virtualWANName;

    /**
     * @return The name of the VirtualWAN being retrieved.
     * 
     */
    public String virtualWANName() {
        return this.virtualWANName;
    }

    private GetVirtualWanArgs() {}

    private GetVirtualWanArgs(GetVirtualWanArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualWANName = $.virtualWANName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualWanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualWanArgs $;

        public Builder() {
            $ = new GetVirtualWanArgs();
        }

        public Builder(GetVirtualWanArgs defaults) {
            $ = new GetVirtualWanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualWan.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param virtualWANName The name of the VirtualWAN being retrieved.
         * 
         * @return builder
         * 
         */
        public Builder virtualWANName(String virtualWANName) {
            $.virtualWANName = virtualWANName;
            return this;
        }

        public GetVirtualWanArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualWANName = Objects.requireNonNull($.virtualWANName, "expected parameter 'virtualWANName' to be non-null");
            return $;
        }
    }

}
