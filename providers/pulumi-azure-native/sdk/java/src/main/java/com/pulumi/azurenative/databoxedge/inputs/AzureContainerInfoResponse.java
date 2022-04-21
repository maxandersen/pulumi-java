// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Azure container mapping of the endpoint.
 * 
 */
public final class AzureContainerInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureContainerInfoResponse Empty = new AzureContainerInfoResponse();

    /**
     * Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    public String containerName() {
        return this.containerName;
    }

    /**
     * Storage format used for the file represented by the share.
     * 
     */
    @Import(name="dataFormat", required=true)
    private String dataFormat;

    public String dataFormat() {
        return this.dataFormat;
    }

    /**
     * ID of the storage account credential used to access storage.
     * 
     */
    @Import(name="storageAccountCredentialId", required=true)
    private String storageAccountCredentialId;

    public String storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    private AzureContainerInfoResponse() {}

    private AzureContainerInfoResponse(AzureContainerInfoResponse $) {
        this.containerName = $.containerName;
        this.dataFormat = $.dataFormat;
        this.storageAccountCredentialId = $.storageAccountCredentialId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureContainerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureContainerInfoResponse $;

        public Builder() {
            $ = new AzureContainerInfoResponse();
        }

        public Builder(AzureContainerInfoResponse defaults) {
            $ = new AzureContainerInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder dataFormat(String dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        public Builder storageAccountCredentialId(String storageAccountCredentialId) {
            $.storageAccountCredentialId = storageAccountCredentialId;
            return this;
        }

        public AzureContainerInfoResponse build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.dataFormat = Objects.requireNonNull($.dataFormat, "expected parameter 'dataFormat' to be non-null");
            $.storageAccountCredentialId = Objects.requireNonNull($.storageAccountCredentialId, "expected parameter 'storageAccountCredentialId' to be non-null");
            return $;
        }
    }

}
