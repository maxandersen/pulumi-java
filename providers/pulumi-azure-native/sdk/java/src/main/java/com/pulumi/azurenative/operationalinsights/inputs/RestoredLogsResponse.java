// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Restore parameters.
 * 
 */
public final class RestoredLogsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestoredLogsResponse Empty = new RestoredLogsResponse();

    /**
     * The timestamp to end the restore by (UTC).
     * 
     */
    @Import(name="endRestoreTime")
      private final @Nullable String endRestoreTime;

    public Optional<String> endRestoreTime() {
        return this.endRestoreTime == null ? Optional.empty() : Optional.ofNullable(this.endRestoreTime);
    }

    /**
     * The table to restore data from.
     * 
     */
    @Import(name="sourceTable", required=true)
      private final String sourceTable;

    public String sourceTable() {
        return this.sourceTable;
    }

    /**
     * The timestamp to start the restore from (UTC).
     * 
     */
    @Import(name="startRestoreTime")
      private final @Nullable String startRestoreTime;

    public Optional<String> startRestoreTime() {
        return this.startRestoreTime == null ? Optional.empty() : Optional.ofNullable(this.startRestoreTime);
    }

    public RestoredLogsResponse(
        @Nullable String endRestoreTime,
        String sourceTable,
        @Nullable String startRestoreTime) {
        this.endRestoreTime = endRestoreTime;
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
        this.startRestoreTime = startRestoreTime;
    }

    private RestoredLogsResponse() {
        this.endRestoreTime = null;
        this.sourceTable = null;
        this.startRestoreTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestoredLogsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endRestoreTime;
        private String sourceTable;
        private @Nullable String startRestoreTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RestoredLogsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endRestoreTime = defaults.endRestoreTime;
    	      this.sourceTable = defaults.sourceTable;
    	      this.startRestoreTime = defaults.startRestoreTime;
        }

        public Builder endRestoreTime(@Nullable String endRestoreTime) {
            this.endRestoreTime = endRestoreTime;
            return this;
        }
        public Builder sourceTable(String sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }
        public Builder startRestoreTime(@Nullable String startRestoreTime) {
            this.startRestoreTime = startRestoreTime;
            return this;
        }        public RestoredLogsResponse build() {
            return new RestoredLogsResponse(endRestoreTime, sourceTable, startRestoreTime);
        }
    }
}
