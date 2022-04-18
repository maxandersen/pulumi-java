// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class TimePartitioningResponse extends com.pulumi.resources.InvokeArgs {

    public static final TimePartitioningResponse Empty = new TimePartitioningResponse();

    /**
     * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
     * 
     */
    @Import(name="expirationMs", required=true)
      private final String expirationMs;

    public String expirationMs() {
        return this.expirationMs;
    }

    /**
     * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * 
     */
    @Import(name="field", required=true)
      private final String field;

    public String field() {
        return this.field;
    }

    @Import(name="requirePartitionFilter", required=true)
      private final Boolean requirePartitionFilter;

    public Boolean requirePartitionFilter() {
        return this.requirePartitionFilter;
    }

    /**
     * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public TimePartitioningResponse(
        String expirationMs,
        String field,
        Boolean requirePartitionFilter,
        String type) {
        this.expirationMs = Objects.requireNonNull(expirationMs, "expected parameter 'expirationMs' to be non-null");
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter, "expected parameter 'requirePartitionFilter' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TimePartitioningResponse() {
        this.expirationMs = null;
        this.field = null;
        this.requirePartitionFilter = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimePartitioningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationMs;
        private String field;
        private Boolean requirePartitionFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TimePartitioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder expirationMs(String expirationMs) {
            this.expirationMs = Objects.requireNonNull(expirationMs);
            return this;
        }
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder requirePartitionFilter(Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TimePartitioningResponse build() {
            return new TimePartitioningResponse(expirationMs, field, requirePartitionFilter, type);
        }
    }
}
