// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleResponse {
    /**
     * A crontab-like specification that the schedule uses to take snapshots.
     * 
     */
    private final String crontabSpec;
    /**
     * A list of snapshot names created in this schedule.
     * 
     */
    private final String prefix;
    /**
     * The maximum number of snapshots to retain in this schedule.
     * 
     */
    private final Integer retentionCount;

    @CustomType.Constructor
    private ScheduleResponse(
        @CustomType.Parameter("crontabSpec") String crontabSpec,
        @CustomType.Parameter("prefix") String prefix,
        @CustomType.Parameter("retentionCount") Integer retentionCount) {
        this.crontabSpec = crontabSpec;
        this.prefix = prefix;
        this.retentionCount = retentionCount;
    }

    /**
     * A crontab-like specification that the schedule uses to take snapshots.
     * 
    */
    public String crontabSpec() {
        return this.crontabSpec;
    }
    /**
     * A list of snapshot names created in this schedule.
     * 
    */
    public String prefix() {
        return this.prefix;
    }
    /**
     * The maximum number of snapshots to retain in this schedule.
     * 
    */
    public Integer retentionCount() {
        return this.retentionCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String crontabSpec;
        private String prefix;
        private Integer retentionCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crontabSpec = defaults.crontabSpec;
    	      this.prefix = defaults.prefix;
    	      this.retentionCount = defaults.retentionCount;
        }

        public Builder crontabSpec(String crontabSpec) {
            this.crontabSpec = Objects.requireNonNull(crontabSpec);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder retentionCount(Integer retentionCount) {
            this.retentionCount = Objects.requireNonNull(retentionCount);
            return this;
        }        public ScheduleResponse build() {
            return new ScheduleResponse(crontabSpec, prefix, retentionCount);
        }
    }
}
