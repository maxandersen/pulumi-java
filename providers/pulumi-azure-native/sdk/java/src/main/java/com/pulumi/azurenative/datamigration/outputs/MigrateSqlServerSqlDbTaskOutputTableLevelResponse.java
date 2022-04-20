// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MigrateSqlServerSqlDbTaskOutputTableLevelResponse {
    /**
     * Migration end time
     * 
     */
    private final String endedOn;
    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
     */
    private final String errorPrefix;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Number of successfully completed items
     * 
     */
    private final Double itemsCompletedCount;
    /**
     * Number of items
     * 
     */
    private final Double itemsCount;
    /**
     * Name of the item
     * 
     */
    private final String objectName;
    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    private final String resultPrefix;
    /**
     * Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
     */
    private final String resultType;
    /**
     * Migration start time
     * 
     */
    private final String startedOn;
    /**
     * Current state of migration
     * 
     */
    private final String state;
    /**
     * Status message
     * 
     */
    private final String statusMessage;

    @CustomType.Constructor
    private MigrateSqlServerSqlDbTaskOutputTableLevelResponse(
        @CustomType.Parameter("endedOn") String endedOn,
        @CustomType.Parameter("errorPrefix") String errorPrefix,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("itemsCompletedCount") Double itemsCompletedCount,
        @CustomType.Parameter("itemsCount") Double itemsCount,
        @CustomType.Parameter("objectName") String objectName,
        @CustomType.Parameter("resultPrefix") String resultPrefix,
        @CustomType.Parameter("resultType") String resultType,
        @CustomType.Parameter("startedOn") String startedOn,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statusMessage") String statusMessage) {
        this.endedOn = endedOn;
        this.errorPrefix = errorPrefix;
        this.id = id;
        this.itemsCompletedCount = itemsCompletedCount;
        this.itemsCount = itemsCount;
        this.objectName = objectName;
        this.resultPrefix = resultPrefix;
        this.resultType = resultType;
        this.startedOn = startedOn;
        this.state = state;
        this.statusMessage = statusMessage;
    }

    /**
     * Migration end time
     * 
    */
    public String endedOn() {
        return this.endedOn;
    }
    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
    */
    public String errorPrefix() {
        return this.errorPrefix;
    }
    /**
     * Result identifier
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Number of successfully completed items
     * 
    */
    public Double itemsCompletedCount() {
        return this.itemsCompletedCount;
    }
    /**
     * Number of items
     * 
    */
    public Double itemsCount() {
        return this.itemsCount;
    }
    /**
     * Name of the item
     * 
    */
    public String objectName() {
        return this.objectName;
    }
    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
    */
    public String resultPrefix() {
        return this.resultPrefix;
    }
    /**
     * Result type
     * Expected value is &#39;TableLevelOutput&#39;.
     * 
    */
    public String resultType() {
        return this.resultType;
    }
    /**
     * Migration start time
     * 
    */
    public String startedOn() {
        return this.startedOn;
    }
    /**
     * Current state of migration
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Status message
     * 
    */
    public String statusMessage() {
        return this.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String errorPrefix;
        private String id;
        private Double itemsCompletedCount;
        private Double itemsCount;
        private String objectName;
        private String resultPrefix;
        private String resultType;
        private String startedOn;
        private String state;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.id = defaults.id;
    	      this.itemsCompletedCount = defaults.itemsCompletedCount;
    	      this.itemsCount = defaults.itemsCount;
    	      this.objectName = defaults.objectName;
    	      this.resultPrefix = defaults.resultPrefix;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder errorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder itemsCompletedCount(Double itemsCompletedCount) {
            this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
            return this;
        }
        public Builder itemsCount(Double itemsCount) {
            this.itemsCount = Objects.requireNonNull(itemsCount);
            return this;
        }
        public Builder objectName(String objectName) {
            this.objectName = Objects.requireNonNull(objectName);
            return this;
        }
        public Builder resultPrefix(String resultPrefix) {
            this.resultPrefix = Objects.requireNonNull(resultPrefix);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }        public MigrateSqlServerSqlDbTaskOutputTableLevelResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputTableLevelResponse(endedOn, errorPrefix, id, itemsCompletedCount, itemsCount, objectName, resultPrefix, resultType, startedOn, state, statusMessage);
        }
    }
}
