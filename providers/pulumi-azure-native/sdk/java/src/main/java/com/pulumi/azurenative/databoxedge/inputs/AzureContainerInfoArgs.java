// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.enums.AzureContainerDataFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Azure container mapping of the endpoint.
 * 
 */
public final class AzureContainerInfoArgs extends ResourceArgs {

    public static final AzureContainerInfoArgs Empty = new AzureContainerInfoArgs();

    /**
     * Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * Storage format used for the file represented by the share.
     * 
     */
    @Import(name="dataFormat", required=true)
    private Output<Either<String,AzureContainerDataFormat>> dataFormat;

    /**
     * @return Storage format used for the file represented by the share.
     * 
     */
    public Output<Either<String,AzureContainerDataFormat>> dataFormat() {
        return this.dataFormat;
    }

    /**
     * ID of the storage account credential used to access storage.
     * 
     */
    @Import(name="storageAccountCredentialId", required=true)
    private Output<String> storageAccountCredentialId;

    /**
     * @return ID of the storage account credential used to access storage.
     * 
     */
    public Output<String> storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    private AzureContainerInfoArgs() {}

    private AzureContainerInfoArgs(AzureContainerInfoArgs $) {
        this.containerName = $.containerName;
        this.dataFormat = $.dataFormat;
        this.storageAccountCredentialId = $.storageAccountCredentialId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureContainerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureContainerInfoArgs $;

        public Builder() {
            $ = new AzureContainerInfoArgs();
        }

        public Builder(AzureContainerInfoArgs defaults) {
            $ = new AzureContainerInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param dataFormat Storage format used for the file represented by the share.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(Output<Either<String,AzureContainerDataFormat>> dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        /**
         * @param dataFormat Storage format used for the file represented by the share.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(Either<String,AzureContainerDataFormat> dataFormat) {
            return dataFormat(Output.of(dataFormat));
        }

        /**
         * @param dataFormat Storage format used for the file represented by the share.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(String dataFormat) {
            return dataFormat(Either.ofLeft(dataFormat));
        }

        /**
         * @param dataFormat Storage format used for the file represented by the share.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(AzureContainerDataFormat dataFormat) {
            return dataFormat(Either.ofRight(dataFormat));
        }

        /**
         * @param storageAccountCredentialId ID of the storage account credential used to access storage.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountCredentialId(Output<String> storageAccountCredentialId) {
            $.storageAccountCredentialId = storageAccountCredentialId;
            return this;
        }

        /**
         * @param storageAccountCredentialId ID of the storage account credential used to access storage.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountCredentialId(String storageAccountCredentialId) {
            return storageAccountCredentialId(Output.of(storageAccountCredentialId));
        }

        public AzureContainerInfoArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.dataFormat = Objects.requireNonNull($.dataFormat, "expected parameter 'dataFormat' to be non-null");
            $.storageAccountCredentialId = Objects.requireNonNull($.storageAccountCredentialId, "expected parameter 'storageAccountCredentialId' to be non-null");
            return $;
        }
    }

}
