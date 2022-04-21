// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.FileServerWriteSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.SftpWriteSettingsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Binary sink.
 * 
 */
public final class BinarySinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final BinarySinkResponse Empty = new BinarySinkResponse();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Object sinkRetryCount;

    public Optional<Object> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Object sinkRetryWait;

    public Optional<Object> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Binary store settings.
     * 
     */
    @Import(name="storeSettings")
    private @Nullable Object storeSettings;

    public Optional<Object> storeSettings() {
        return Optional.ofNullable(this.storeSettings);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;BinarySink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Object writeBatchSize;

    public Optional<Object> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Object writeBatchTimeout;

    public Optional<Object> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    private BinarySinkResponse() {}

    private BinarySinkResponse(BinarySinkResponse $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.storeSettings = $.storeSettings;
        this.type = $.type;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BinarySinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BinarySinkResponse $;

        public Builder() {
            $ = new BinarySinkResponse();
        }

        public Builder(BinarySinkResponse defaults) {
            $ = new BinarySinkResponse(Objects.requireNonNull(defaults));
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder storeSettings(@Nullable Object storeSettings) {
            $.storeSettings = storeSettings;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public BinarySinkResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
