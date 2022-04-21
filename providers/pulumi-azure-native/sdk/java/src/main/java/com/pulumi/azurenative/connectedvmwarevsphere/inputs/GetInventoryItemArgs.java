// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInventoryItemArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInventoryItemArgs Empty = new GetInventoryItemArgs();

    /**
     * Name of the inventoryItem.
     * 
     */
    @Import(name="inventoryItemName", required=true)
    private String inventoryItemName;

    public String inventoryItemName() {
        return this.inventoryItemName;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vCenter.
     * 
     */
    @Import(name="vcenterName", required=true)
    private String vcenterName;

    public String vcenterName() {
        return this.vcenterName;
    }

    private GetInventoryItemArgs() {}

    private GetInventoryItemArgs(GetInventoryItemArgs $) {
        this.inventoryItemName = $.inventoryItemName;
        this.resourceGroupName = $.resourceGroupName;
        this.vcenterName = $.vcenterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInventoryItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInventoryItemArgs $;

        public Builder() {
            $ = new GetInventoryItemArgs();
        }

        public Builder(GetInventoryItemArgs defaults) {
            $ = new GetInventoryItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder inventoryItemName(String inventoryItemName) {
            $.inventoryItemName = inventoryItemName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder vcenterName(String vcenterName) {
            $.vcenterName = vcenterName;
            return this;
        }

        public GetInventoryItemArgs build() {
            $.inventoryItemName = Objects.requireNonNull($.inventoryItemName, "expected parameter 'inventoryItemName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vcenterName = Objects.requireNonNull($.vcenterName, "expected parameter 'vcenterName' to be non-null");
            return $;
        }
    }

}
