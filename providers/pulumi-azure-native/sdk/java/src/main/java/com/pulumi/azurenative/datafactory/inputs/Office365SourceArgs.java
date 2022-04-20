// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for an Office 365 service.
 * 
 */
public final class Office365SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final Office365SourceArgs Empty = new Office365SourceArgs();

    /**
     * The groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="allowedGroups")
      private final @Nullable Output<Object> allowedGroups;

    public Output<Object> allowedGroups() {
        return this.allowedGroups == null ? Codegen.empty() : this.allowedGroups;
    }

    /**
     * The Column to apply the &lt;paramref name=&#34;StartTime&#34;/&gt; and &lt;paramref name=&#34;EndTime&#34;/&gt;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dateFilterColumn")
      private final @Nullable Output<Object> dateFilterColumn;

    public Output<Object> dateFilterColumn() {
        return this.dateFilterColumn == null ? Codegen.empty() : this.dateFilterColumn;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> disableMetricsCollection() {
        return this.disableMetricsCollection == null ? Codegen.empty() : this.disableMetricsCollection;
    }

    /**
     * End time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<Object> endTime;

    public Output<Object> endTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Codegen.empty() : this.maxConcurrentConnections;
    }

    /**
     * The columns to be read out from the Office 365 table. Type: array of objects (or Expression with resultType array of objects). Example: [ { &#34;name&#34;: &#34;Id&#34; }, { &#34;name&#34;: &#34;CreatedDateTime&#34; } ]
     * 
     */
    @Import(name="outputColumns")
      private final @Nullable Output<Object> outputColumns;

    public Output<Object> outputColumns() {
        return this.outputColumns == null ? Codegen.empty() : this.outputColumns;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> sourceRetryCount() {
        return this.sourceRetryCount == null ? Codegen.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> sourceRetryWait() {
        return this.sourceRetryWait == null ? Codegen.empty() : this.sourceRetryWait;
    }

    /**
     * Start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<Object> startTime;

    public Output<Object> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Copy source type.
     * Expected value is &#39;Office365Source&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The user scope uri. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userScopeFilterUri")
      private final @Nullable Output<Object> userScopeFilterUri;

    public Output<Object> userScopeFilterUri() {
        return this.userScopeFilterUri == null ? Codegen.empty() : this.userScopeFilterUri;
    }

    public Office365SourceArgs(
        @Nullable Output<Object> allowedGroups,
        @Nullable Output<Object> dateFilterColumn,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> endTime,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> outputColumns,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        @Nullable Output<Object> startTime,
        Output<String> type,
        @Nullable Output<Object> userScopeFilterUri) {
        this.allowedGroups = allowedGroups;
        this.dateFilterColumn = dateFilterColumn;
        this.disableMetricsCollection = disableMetricsCollection;
        this.endTime = endTime;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.outputColumns = outputColumns;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.startTime = startTime;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userScopeFilterUri = userScopeFilterUri;
    }

    private Office365SourceArgs() {
        this.allowedGroups = Codegen.empty();
        this.dateFilterColumn = Codegen.empty();
        this.disableMetricsCollection = Codegen.empty();
        this.endTime = Codegen.empty();
        this.maxConcurrentConnections = Codegen.empty();
        this.outputColumns = Codegen.empty();
        this.sourceRetryCount = Codegen.empty();
        this.sourceRetryWait = Codegen.empty();
        this.startTime = Codegen.empty();
        this.type = Codegen.empty();
        this.userScopeFilterUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Office365SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> allowedGroups;
        private @Nullable Output<Object> dateFilterColumn;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> endTime;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> outputColumns;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private @Nullable Output<Object> startTime;
        private Output<String> type;
        private @Nullable Output<Object> userScopeFilterUri;

        public Builder() {
    	      // Empty
        }

        public Builder(Office365SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedGroups = defaults.allowedGroups;
    	      this.dateFilterColumn = defaults.dateFilterColumn;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.endTime = defaults.endTime;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.outputColumns = defaults.outputColumns;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
    	      this.userScopeFilterUri = defaults.userScopeFilterUri;
        }

        public Builder allowedGroups(@Nullable Output<Object> allowedGroups) {
            this.allowedGroups = allowedGroups;
            return this;
        }
        public Builder allowedGroups(@Nullable Object allowedGroups) {
            this.allowedGroups = Codegen.ofNullable(allowedGroups);
            return this;
        }
        public Builder dateFilterColumn(@Nullable Output<Object> dateFilterColumn) {
            this.dateFilterColumn = dateFilterColumn;
            return this;
        }
        public Builder dateFilterColumn(@Nullable Object dateFilterColumn) {
            this.dateFilterColumn = Codegen.ofNullable(dateFilterColumn);
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Codegen.ofNullable(disableMetricsCollection);
            return this;
        }
        public Builder endTime(@Nullable Output<Object> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable Object endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Codegen.ofNullable(maxConcurrentConnections);
            return this;
        }
        public Builder outputColumns(@Nullable Output<Object> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public Builder outputColumns(@Nullable Object outputColumns) {
            this.outputColumns = Codegen.ofNullable(outputColumns);
            return this;
        }
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Codegen.ofNullable(sourceRetryCount);
            return this;
        }
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Codegen.ofNullable(sourceRetryWait);
            return this;
        }
        public Builder startTime(@Nullable Output<Object> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable Object startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userScopeFilterUri(@Nullable Output<Object> userScopeFilterUri) {
            this.userScopeFilterUri = userScopeFilterUri;
            return this;
        }
        public Builder userScopeFilterUri(@Nullable Object userScopeFilterUri) {
            this.userScopeFilterUri = Codegen.ofNullable(userScopeFilterUri);
            return this;
        }        public Office365SourceArgs build() {
            return new Office365SourceArgs(allowedGroups, dateFilterColumn, disableMetricsCollection, endTime, maxConcurrentConnections, outputColumns, sourceRetryCount, sourceRetryWait, startTime, type, userScopeFilterUri);
        }
    }
}
