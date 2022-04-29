// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The destination information for the delivery of the export. To allow access to a storage account, you must register the account&#39;s subscription with the Microsoft.CostManagementExports resource provider. This is required once per subscription. When creating an export in the Azure portal, it is done automatically, however API users need to register the subscription. For more information see https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-manager-supported-services .
 * 
 */
public final class ExportDeliveryDestinationArgs extends ResourceArgs {

    public static final ExportDeliveryDestinationArgs Empty = new ExportDeliveryDestinationArgs();

    /**
     * The name of the container where exports will be uploaded.
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    /**
     * @return The name of the container where exports will be uploaded.
     * 
     */
    public Output<String> container() {
        return this.container;
    }

    /**
     * The resource id of the storage account where exports will be delivered.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The resource id of the storage account where exports will be delivered.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The name of the directory where exports will be uploaded.
     * 
     */
    @Import(name="rootFolderPath")
    private @Nullable Output<String> rootFolderPath;

    /**
     * @return The name of the directory where exports will be uploaded.
     * 
     */
    public Optional<Output<String>> rootFolderPath() {
        return Optional.ofNullable(this.rootFolderPath);
    }

    private ExportDeliveryDestinationArgs() {}

    private ExportDeliveryDestinationArgs(ExportDeliveryDestinationArgs $) {
        this.container = $.container;
        this.resourceId = $.resourceId;
        this.rootFolderPath = $.rootFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExportDeliveryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExportDeliveryDestinationArgs $;

        public Builder() {
            $ = new ExportDeliveryDestinationArgs();
        }

        public Builder(ExportDeliveryDestinationArgs defaults) {
            $ = new ExportDeliveryDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param container The name of the container where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container The name of the container where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param resourceId The resource id of the storage account where exports will be delivered.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The resource id of the storage account where exports will be delivered.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param rootFolderPath The name of the directory where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder rootFolderPath(@Nullable Output<String> rootFolderPath) {
            $.rootFolderPath = rootFolderPath;
            return this;
        }

        /**
         * @param rootFolderPath The name of the directory where exports will be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder rootFolderPath(String rootFolderPath) {
            return rootFolderPath(Output.of(rootFolderPath));
        }

        public ExportDeliveryDestinationArgs build() {
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
