// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties related to a storage container endpoint.
 * 
 */
public final class RoutingStorageContainerPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final RoutingStorageContainerPropertiesResponse Empty = new RoutingStorageContainerPropertiesResponse();

    /**
     * Method used to authenticate against the storage endpoint
     * 
     */
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Time interval at which blobs are written to storage. Value should be between 60 and 720 seconds. Default value is 300 seconds.
     * 
     */
    @Import(name="batchFrequencyInSeconds")
    private @Nullable Integer batchFrequencyInSeconds;

    public Optional<Integer> batchFrequencyInSeconds() {
        return Optional.ofNullable(this.batchFrequencyInSeconds);
    }

    /**
     * The connection string of the storage account.
     * 
     */
    @Import(name="connectionString")
    private @Nullable String connectionString;

    public Optional<String> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The name of storage container in the storage account.
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    public String containerName() {
        return this.containerName;
    }

    /**
     * Encoding that is used to serialize messages to blobs. Supported values are &#39;avro&#39;, &#39;avrodeflate&#39;, and &#39;JSON&#39;. Default value is &#39;avro&#39;.
     * 
     */
    @Import(name="encoding")
    private @Nullable String encoding;

    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The url of the storage endpoint. It must include the protocol https://
     * 
     */
    @Import(name="endpointUri")
    private @Nullable String endpointUri;

    public Optional<String> endpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }

    /**
     * File name format for the blob. Default format is {iothub}/{partition}/{YYYY}/{MM}/{DD}/{HH}/{mm}. All parameters are mandatory but can be reordered.
     * 
     */
    @Import(name="fileNameFormat")
    private @Nullable String fileNameFormat;

    public Optional<String> fileNameFormat() {
        return Optional.ofNullable(this.fileNameFormat);
    }

    /**
     * Id of the storage container endpoint
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Maximum number of bytes for each blob written to storage. Value should be between 10485760(10MB) and 524288000(500MB). Default value is 314572800(300MB).
     * 
     */
    @Import(name="maxChunkSizeInBytes")
    private @Nullable Integer maxChunkSizeInBytes;

    public Optional<Integer> maxChunkSizeInBytes() {
        return Optional.ofNullable(this.maxChunkSizeInBytes);
    }

    /**
     * The name that identifies this endpoint. The name can only include alphanumeric characters, periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:  events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group of the storage account.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable String resourceGroup;

    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The subscription identifier of the storage account.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private RoutingStorageContainerPropertiesResponse() {}

    private RoutingStorageContainerPropertiesResponse(RoutingStorageContainerPropertiesResponse $) {
        this.authenticationType = $.authenticationType;
        this.batchFrequencyInSeconds = $.batchFrequencyInSeconds;
        this.connectionString = $.connectionString;
        this.containerName = $.containerName;
        this.encoding = $.encoding;
        this.endpointUri = $.endpointUri;
        this.fileNameFormat = $.fileNameFormat;
        this.id = $.id;
        this.maxChunkSizeInBytes = $.maxChunkSizeInBytes;
        this.name = $.name;
        this.resourceGroup = $.resourceGroup;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingStorageContainerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingStorageContainerPropertiesResponse $;

        public Builder() {
            $ = new RoutingStorageContainerPropertiesResponse();
        }

        public Builder(RoutingStorageContainerPropertiesResponse defaults) {
            $ = new RoutingStorageContainerPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder batchFrequencyInSeconds(@Nullable Integer batchFrequencyInSeconds) {
            $.batchFrequencyInSeconds = batchFrequencyInSeconds;
            return this;
        }

        public Builder connectionString(@Nullable String connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            $.encoding = encoding;
            return this;
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        public Builder fileNameFormat(@Nullable String fileNameFormat) {
            $.fileNameFormat = fileNameFormat;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder maxChunkSizeInBytes(@Nullable Integer maxChunkSizeInBytes) {
            $.maxChunkSizeInBytes = maxChunkSizeInBytes;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder resourceGroup(@Nullable String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public RoutingStorageContainerPropertiesResponse build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
