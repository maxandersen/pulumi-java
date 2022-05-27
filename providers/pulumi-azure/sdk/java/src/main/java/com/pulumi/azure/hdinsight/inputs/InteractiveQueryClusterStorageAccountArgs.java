// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InteractiveQueryClusterStorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final InteractiveQueryClusterStorageAccountArgs Empty = new InteractiveQueryClusterStorageAccountArgs();

    /**
     * Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     */
    @Import(name="isDefault", required=true)
    private Output<Boolean> isDefault;

    /**
     * @return Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }

    /**
     * The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountKey", required=true)
    private Output<String> storageAccountKey;

    /**
     * @return The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountKey() {
        return this.storageAccountKey;
    }

    /**
     * The ID of the Storage Container. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageContainerId", required=true)
    private Output<String> storageContainerId;

    /**
     * @return The ID of the Storage Container. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageContainerId() {
        return this.storageContainerId;
    }

    /**
     * The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageResourceId")
    private @Nullable Output<String> storageResourceId;

    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageResourceId() {
        return Optional.ofNullable(this.storageResourceId);
    }

    private InteractiveQueryClusterStorageAccountArgs() {}

    private InteractiveQueryClusterStorageAccountArgs(InteractiveQueryClusterStorageAccountArgs $) {
        this.isDefault = $.isDefault;
        this.storageAccountKey = $.storageAccountKey;
        this.storageContainerId = $.storageContainerId;
        this.storageResourceId = $.storageResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InteractiveQueryClusterStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InteractiveQueryClusterStorageAccountArgs $;

        public Builder() {
            $ = new InteractiveQueryClusterStorageAccountArgs();
        }

        public Builder(InteractiveQueryClusterStorageAccountArgs defaults) {
            $ = new InteractiveQueryClusterStorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isDefault Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param storageAccountKey The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(Output<String> storageAccountKey) {
            $.storageAccountKey = storageAccountKey;
            return this;
        }

        /**
         * @param storageAccountKey The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(String storageAccountKey) {
            return storageAccountKey(Output.of(storageAccountKey));
        }

        /**
         * @param storageContainerId The ID of the Storage Container. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerId(Output<String> storageContainerId) {
            $.storageContainerId = storageContainerId;
            return this;
        }

        /**
         * @param storageContainerId The ID of the Storage Container. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerId(String storageContainerId) {
            return storageContainerId(Output.of(storageContainerId));
        }

        /**
         * @param storageResourceId The ID of the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(@Nullable Output<String> storageResourceId) {
            $.storageResourceId = storageResourceId;
            return this;
        }

        /**
         * @param storageResourceId The ID of the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageResourceId(String storageResourceId) {
            return storageResourceId(Output.of(storageResourceId));
        }

        public InteractiveQueryClusterStorageAccountArgs build() {
            $.isDefault = Objects.requireNonNull($.isDefault, "expected parameter 'isDefault' to be non-null");
            $.storageAccountKey = Objects.requireNonNull($.storageAccountKey, "expected parameter 'storageAccountKey' to be non-null");
            $.storageContainerId = Objects.requireNonNull($.storageContainerId, "expected parameter 'storageContainerId' to be non-null");
            return $;
        }
    }

}
