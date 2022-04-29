// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningexperimentation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The properties of a storage account for a machine learning team account.
 * 
 */
public final class StorageAccountPropertiesArgs extends ResourceArgs {

    public static final StorageAccountPropertiesArgs Empty = new StorageAccountPropertiesArgs();

    /**
     * The access key to the storage account.
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return The access key to the storage account.
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * The fully qualified arm Id of the storage account.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return The fully qualified arm Id of the storage account.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private StorageAccountPropertiesArgs() {}

    private StorageAccountPropertiesArgs(StorageAccountPropertiesArgs $) {
        this.accessKey = $.accessKey;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountPropertiesArgs $;

        public Builder() {
            $ = new StorageAccountPropertiesArgs();
        }

        public Builder(StorageAccountPropertiesArgs defaults) {
            $ = new StorageAccountPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key to the storage account.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key to the storage account.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param storageAccountId The fully qualified arm Id of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The fully qualified arm Id of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public StorageAccountPropertiesArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}
