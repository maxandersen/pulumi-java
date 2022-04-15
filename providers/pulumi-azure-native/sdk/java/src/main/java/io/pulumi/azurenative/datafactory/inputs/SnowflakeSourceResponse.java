// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SnowflakeExportCopyCommandResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity snowflake source.
 * 
 */
public final class SnowflakeSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SnowflakeSourceResponse Empty = new SnowflakeSourceResponse();

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
     * Snowflake export settings.
     * 
     */
    @Import(name="exportSettings")
      private final @Nullable SnowflakeExportCopyCommandResponse exportSettings;

    public Optional<SnowflakeExportCopyCommandResponse> exportSettings() {
        return this.exportSettings == null ? Optional.empty() : Optional.ofNullable(this.exportSettings);
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
     * Snowflake Sql query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
      private final @Nullable Object query;

    public Optional<Object> query() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
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
     * Expected value is 'SnowflakeSource'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SnowflakeSourceResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable SnowflakeExportCopyCommandResponse exportSettings,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object query,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.exportSettings = exportSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SnowflakeSourceResponse() {
        this.disableMetricsCollection = null;
        this.exportSettings = null;
        this.maxConcurrentConnections = null;
        this.query = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnowflakeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable SnowflakeExportCopyCommandResponse exportSettings;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object query;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SnowflakeSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.exportSettings = defaults.exportSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder exportSettings(@Nullable SnowflakeExportCopyCommandResponse exportSettings) {
            this.exportSettings = exportSettings;
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
        }        public SnowflakeSourceResponse build() {
            return new SnowflakeSourceResponse(disableMetricsCollection, exportSettings, maxConcurrentConnections, query, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
