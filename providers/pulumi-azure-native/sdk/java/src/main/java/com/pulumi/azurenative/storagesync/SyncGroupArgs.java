// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncGroupArgs extends ResourceArgs {

    public static final SyncGroupArgs Empty = new SyncGroupArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @Import(name="storageSyncServiceName", required=true)
    private Output<String> storageSyncServiceName;

    /**
     * @return Name of Storage Sync Service resource.
     * 
     */
    public Output<String> storageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @Import(name="syncGroupName")
    private @Nullable Output<String> syncGroupName;

    /**
     * @return Name of Sync Group resource.
     * 
     */
    public Optional<Output<String>> syncGroupName() {
        return Optional.ofNullable(this.syncGroupName);
    }

    private SyncGroupArgs() {}

    private SyncGroupArgs(SyncGroupArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.storageSyncServiceName = $.storageSyncServiceName;
        this.syncGroupName = $.syncGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyncGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyncGroupArgs $;

        public Builder() {
            $ = new SyncGroupArgs();
        }

        public Builder(SyncGroupArgs defaults) {
            $ = new SyncGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageSyncServiceName Name of Storage Sync Service resource.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(Output<String> storageSyncServiceName) {
            $.storageSyncServiceName = storageSyncServiceName;
            return this;
        }

        /**
         * @param storageSyncServiceName Name of Storage Sync Service resource.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(String storageSyncServiceName) {
            return storageSyncServiceName(Output.of(storageSyncServiceName));
        }

        /**
         * @param syncGroupName Name of Sync Group resource.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(@Nullable Output<String> syncGroupName) {
            $.syncGroupName = syncGroupName;
            return this;
        }

        /**
         * @param syncGroupName Name of Sync Group resource.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(String syncGroupName) {
            return syncGroupName(Output.of(syncGroupName));
        }

        public SyncGroupArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageSyncServiceName = Objects.requireNonNull($.storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
            return $;
        }
    }

}
