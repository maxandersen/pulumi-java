// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP ECC source.
 * 
 */
public final class SapEccSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SapEccSourceArgs Empty = new SapEccSourceArgs();

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
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:05:00. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="httpRequestTimeout")
    private @Nullable Output<Object> httpRequestTimeout;

    public Optional<Output<Object>> httpRequestTimeout() {
        return Optional.ofNullable(this.httpRequestTimeout);
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
     * SAP ECC OData query. For example, &#34;$top=1&#34;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
    private @Nullable Output<Object> query;

    public Optional<Output<Object>> query() {
        return Optional.ofNullable(this.query);
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
     * Expected value is &#39;SapEccSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private SapEccSourceArgs() {}

    private SapEccSourceArgs(SapEccSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.httpRequestTimeout = $.httpRequestTimeout;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.query = $.query;
        this.queryTimeout = $.queryTimeout;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SapEccSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapEccSourceArgs $;

        public Builder() {
            $ = new SapEccSourceArgs();
        }

        public Builder(SapEccSourceArgs defaults) {
            $ = new SapEccSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder httpRequestTimeout(@Nullable Output<Object> httpRequestTimeout) {
            $.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        public Builder httpRequestTimeout(Object httpRequestTimeout) {
            return httpRequestTimeout(Output.of(httpRequestTimeout));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        public Builder query(@Nullable Output<Object> query) {
            $.query = query;
            return this;
        }

        public Builder query(Object query) {
            return query(Output.of(query));
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

        public SapEccSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
