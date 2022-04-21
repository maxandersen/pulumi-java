// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkManagerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkManagerArgs Empty = new GetNetworkManagerArgs();

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private String networkManagerName;

    public String networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNetworkManagerArgs() {}

    private GetNetworkManagerArgs(GetNetworkManagerArgs $) {
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkManagerArgs $;

        public Builder() {
            $ = new GetNetworkManagerArgs();
        }

        public Builder(GetNetworkManagerArgs defaults) {
            $ = new GetNetworkManagerArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkManagerName(String networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNetworkManagerArgs build() {
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
