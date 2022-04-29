// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetManagedNetworkGroupArgs extends InvokeArgs {

    public static final GetManagedNetworkGroupArgs Empty = new GetManagedNetworkGroupArgs();

    /**
     * The name of the Managed Network Group.
     * 
     */
    @Import(name="managedNetworkGroupName", required=true)
    private String managedNetworkGroupName;

    /**
     * @return The name of the Managed Network Group.
     * 
     */
    public String managedNetworkGroupName() {
        return this.managedNetworkGroupName;
    }

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName", required=true)
    private String managedNetworkName;

    /**
     * @return The name of the Managed Network.
     * 
     */
    public String managedNetworkName() {
        return this.managedNetworkName;
    }

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

    private GetManagedNetworkGroupArgs() {}

    private GetManagedNetworkGroupArgs(GetManagedNetworkGroupArgs $) {
        this.managedNetworkGroupName = $.managedNetworkGroupName;
        this.managedNetworkName = $.managedNetworkName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedNetworkGroupArgs $;

        public Builder() {
            $ = new GetManagedNetworkGroupArgs();
        }

        public Builder(GetManagedNetworkGroupArgs defaults) {
            $ = new GetManagedNetworkGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedNetworkGroupName The name of the Managed Network Group.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkGroupName(String managedNetworkGroupName) {
            $.managedNetworkGroupName = managedNetworkGroupName;
            return this;
        }

        /**
         * @param managedNetworkName The name of the Managed Network.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkName(String managedNetworkName) {
            $.managedNetworkName = managedNetworkName;
            return this;
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

        public GetManagedNetworkGroupArgs build() {
            $.managedNetworkGroupName = Objects.requireNonNull($.managedNetworkGroupName, "expected parameter 'managedNetworkGroupName' to be non-null");
            $.managedNetworkName = Objects.requireNonNull($.managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
