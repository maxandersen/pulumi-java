// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetContainerArgs extends InvokeArgs {

    public static final GetContainerArgs Empty = new GetContainerArgs();

    /**
     * The container Name
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    /**
     * @return The container Name
     * 
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return The device name.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Storage Account Name
     * 
     */
    @Import(name="storageAccountName", required=true)
    private String storageAccountName;

    /**
     * @return The Storage Account Name
     * 
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    private GetContainerArgs() {}

    private GetContainerArgs(GetContainerArgs $) {
        this.containerName = $.containerName;
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerArgs $;

        public Builder() {
            $ = new GetContainerArgs();
        }

        public Builder(GetContainerArgs defaults) {
            $ = new GetContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName The container Name
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param deviceName The device name.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param storageAccountName The Storage Account Name
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public GetContainerArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            return $;
        }
    }

}
