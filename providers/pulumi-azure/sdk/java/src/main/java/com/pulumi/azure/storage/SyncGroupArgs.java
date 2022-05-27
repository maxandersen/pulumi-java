// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyncGroupArgs Empty = new SyncGroupArgs();

    /**
     * The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
     * 
     */
    @Import(name="storageSyncId", required=true)
    private Output<String> storageSyncId;

    /**
     * @return The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
     * 
     */
    public Output<String> storageSyncId() {
        return this.storageSyncId;
    }

    private SyncGroupArgs() {}

    private SyncGroupArgs(SyncGroupArgs $) {
        this.name = $.name;
        this.storageSyncId = $.storageSyncId;
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
         * @param name The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Storage Sync Group. Changing this forces a new Storage Sync Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageSyncId The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncId(Output<String> storageSyncId) {
            $.storageSyncId = storageSyncId;
            return this;
        }

        /**
         * @param storageSyncId The resource ID of the Storage Sync where this Storage Sync Group is. Changing this forces a new Storage Sync Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncId(String storageSyncId) {
            return storageSyncId(Output.of(storageSyncId));
        }

        public SyncGroupArgs build() {
            $.storageSyncId = Objects.requireNonNull($.storageSyncId, "expected parameter 'storageSyncId' to be non-null");
            return $;
        }
    }

}
