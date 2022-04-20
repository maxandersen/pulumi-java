// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Salesforce Service Cloud source.
 * 
 */
public final class SalesforceServiceCloudSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SalesforceServiceCloudSourceResponse Empty = new SalesforceServiceCloudSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Object additionalColumns;

    public Optional<Object> additionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Database query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
      private final @Nullable Object query;

    public Optional<Object> query() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
    }

    /**
     * The read behavior for the operation. Default is Query.
     * 
     */
    @Import(name="readBehavior")
      private final @Nullable String readBehavior;

    public Optional<String> readBehavior() {
        return this.readBehavior == null ? Optional.empty() : Optional.ofNullable(this.readBehavior);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Object sourceRetryCount;

    public Optional<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Object sourceRetryWait;

    public Optional<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;SalesforceServiceCloudSource&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SalesforceServiceCloudSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object query,
        @Nullable String readBehavior,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.readBehavior = readBehavior;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private SalesforceServiceCloudSourceResponse() {
        this.additionalColumns = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.query = null;
        this.readBehavior = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceServiceCloudSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object query;
        private @Nullable String readBehavior;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceServiceCloudSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.readBehavior = defaults.readBehavior;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder query(@Nullable Object query) {
            this.query = query;
            return this;
        }
        public Builder readBehavior(@Nullable String readBehavior) {
            this.readBehavior = readBehavior;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SalesforceServiceCloudSourceResponse build() {
            return new SalesforceServiceCloudSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, query, readBehavior, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
