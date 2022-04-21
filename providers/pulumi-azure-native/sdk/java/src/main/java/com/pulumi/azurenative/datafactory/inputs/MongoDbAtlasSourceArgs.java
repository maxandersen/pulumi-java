// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.MongoDbCursorMethodsPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for a MongoDB Atlas database.
 * 
 */
public final class MongoDbAtlasSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MongoDbAtlasSourceArgs Empty = new MongoDbAtlasSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * Specifies the number of documents to return in each batch of the response from MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This property&#39;s main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Object> batchSize;

    public Optional<Output<Object>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * Cursor methods for Mongodb query
     * 
     */
    @Import(name="cursorMethods")
    private @Nullable Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods;

    public Optional<Output<MongoDbCursorMethodsPropertiesArgs>> cursorMethods() {
        return Optional.ofNullable(this.cursorMethods);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<Object> filter;

    public Optional<Output<Object>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<Object> queryTimeout;

    public Optional<Output<Object>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;MongoDbAtlasSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private MongoDbAtlasSourceArgs() {}

    private MongoDbAtlasSourceArgs(MongoDbAtlasSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.batchSize = $.batchSize;
        this.cursorMethods = $.cursorMethods;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.filter = $.filter;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.queryTimeout = $.queryTimeout;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MongoDbAtlasSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MongoDbAtlasSourceArgs $;

        public Builder() {
            $ = new MongoDbAtlasSourceArgs();
        }

        public Builder(MongoDbAtlasSourceArgs defaults) {
            $ = new MongoDbAtlasSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        public Builder batchSize(@Nullable Output<Object> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        public Builder batchSize(Object batchSize) {
            return batchSize(Output.of(batchSize));
        }

        public Builder cursorMethods(@Nullable Output<MongoDbCursorMethodsPropertiesArgs> cursorMethods) {
            $.cursorMethods = cursorMethods;
            return this;
        }

        public Builder cursorMethods(MongoDbCursorMethodsPropertiesArgs cursorMethods) {
            return cursorMethods(Output.of(cursorMethods));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder filter(@Nullable Output<Object> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(Object filter) {
            return filter(Output.of(filter));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        public Builder queryTimeout(Object queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MongoDbAtlasSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
