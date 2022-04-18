// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.inputs.JobStatisticOverride;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobStatisticsConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final JobStatisticsConfiguration Empty = new JobStatisticsConfiguration();

    @Import(name="includedStatistics")
      private final @Nullable List<String> includedStatistics;

    public List<String> includedStatistics() {
        return this.includedStatistics == null ? List.of() : this.includedStatistics;
    }

    @Import(name="overrides")
      private final @Nullable List<JobStatisticOverride> overrides;

    public List<JobStatisticOverride> overrides() {
        return this.overrides == null ? List.of() : this.overrides;
    }

    public JobStatisticsConfiguration(
        @Nullable List<String> includedStatistics,
        @Nullable List<JobStatisticOverride> overrides) {
        this.includedStatistics = includedStatistics;
        this.overrides = overrides;
    }

    private JobStatisticsConfiguration() {
        this.includedStatistics = List.of();
        this.overrides = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> includedStatistics;
        private @Nullable List<JobStatisticOverride> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedStatistics = defaults.includedStatistics;
    	      this.overrides = defaults.overrides;
        }

        public Builder includedStatistics(@Nullable List<String> includedStatistics) {
            this.includedStatistics = includedStatistics;
            return this;
        }
        public Builder includedStatistics(String... includedStatistics) {
            return includedStatistics(List.of(includedStatistics));
        }
        public Builder overrides(@Nullable List<JobStatisticOverride> overrides) {
            this.overrides = overrides;
            return this;
        }
        public Builder overrides(JobStatisticOverride... overrides) {
            return overrides(List.of(overrides));
        }        public JobStatisticsConfiguration build() {
            return new JobStatisticsConfiguration(includedStatistics, overrides);
        }
    }
}
