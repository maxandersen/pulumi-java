// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Capture storage details for capture description
 * 
 */
public final class DestinationArgs extends ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    @Import(name="archiveNameFormat")
    private @Nullable Output<String> archiveNameFormat;

    /**
     * @return Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
     * 
     */
    public Optional<Output<String>> archiveNameFormat() {
        return Optional.ofNullable(this.archiveNameFormat);
    }

    /**
     * Blob container Name
     * 
     */
    @Import(name="blobContainer")
    private @Nullable Output<String> blobContainer;

    /**
     * @return Blob container Name
     * 
     */
    public Optional<Output<String>> blobContainer() {
        return Optional.ofNullable(this.blobContainer);
    }

    /**
     * Name for capture destination
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for capture destination
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Resource id of the storage account to be used to create the blobs
     * 
     */
    @Import(name="storageAccountResourceId")
    private @Nullable Output<String> storageAccountResourceId;

    /**
     * @return Resource id of the storage account to be used to create the blobs
     * 
     */
    public Optional<Output<String>> storageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }

    private DestinationArgs() {}

    private DestinationArgs(DestinationArgs $) {
        this.archiveNameFormat = $.archiveNameFormat;
        this.blobContainer = $.blobContainer;
        this.name = $.name;
        this.storageAccountResourceId = $.storageAccountResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationArgs $;

        public Builder() {
            $ = new DestinationArgs();
        }

        public Builder(DestinationArgs defaults) {
            $ = new DestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveNameFormat Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
         * 
         * @return builder
         * 
         */
        public Builder archiveNameFormat(@Nullable Output<String> archiveNameFormat) {
            $.archiveNameFormat = archiveNameFormat;
            return this;
        }

        /**
         * @param archiveNameFormat Blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order
         * 
         * @return builder
         * 
         */
        public Builder archiveNameFormat(String archiveNameFormat) {
            return archiveNameFormat(Output.of(archiveNameFormat));
        }

        /**
         * @param blobContainer Blob container Name
         * 
         * @return builder
         * 
         */
        public Builder blobContainer(@Nullable Output<String> blobContainer) {
            $.blobContainer = blobContainer;
            return this;
        }

        /**
         * @param blobContainer Blob container Name
         * 
         * @return builder
         * 
         */
        public Builder blobContainer(String blobContainer) {
            return blobContainer(Output.of(blobContainer));
        }

        /**
         * @param name Name for capture destination
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for capture destination
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountResourceId Resource id of the storage account to be used to create the blobs
         * 
         * @return builder
         * 
         */
        public Builder storageAccountResourceId(@Nullable Output<String> storageAccountResourceId) {
            $.storageAccountResourceId = storageAccountResourceId;
            return this;
        }

        /**
         * @param storageAccountResourceId Resource id of the storage account to be used to create the blobs
         * 
         * @return builder
         * 
         */
        public Builder storageAccountResourceId(String storageAccountResourceId) {
            return storageAccountResourceId(Output.of(storageAccountResourceId));
        }

        public DestinationArgs build() {
            return $;
        }
    }

}
