// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PerfCounterDataSourceResponse {
    /**
     * A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command 'typeperf'.
     * 
     */
    private final @Nullable List<String> counterSpecifiers;
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    private final @Nullable String name;
    /**
     * The number of seconds between consecutive counter measurements (samples).
     * 
     */
    private final @Nullable Integer samplingFrequencyInSeconds;
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    private final @Nullable List<String> streams;

    @CustomType.Constructor
    private PerfCounterDataSourceResponse(
        @CustomType.Parameter("counterSpecifiers") @Nullable List<String> counterSpecifiers,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("samplingFrequencyInSeconds") @Nullable Integer samplingFrequencyInSeconds,
        @CustomType.Parameter("streams") @Nullable List<String> streams) {
        this.counterSpecifiers = counterSpecifiers;
        this.name = name;
        this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
        this.streams = streams;
    }

    /**
     * A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command 'typeperf'.
     * 
    */
    public List<String> counterSpecifiers() {
        return this.counterSpecifiers == null ? List.of() : this.counterSpecifiers;
    }
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The number of seconds between consecutive counter measurements (samples).
     * 
    */
    public Optional<Integer> samplingFrequencyInSeconds() {
        return Optional.ofNullable(this.samplingFrequencyInSeconds);
    }
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
    */
    public List<String> streams() {
        return this.streams == null ? List.of() : this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerfCounterDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> counterSpecifiers;
        private @Nullable String name;
        private @Nullable Integer samplingFrequencyInSeconds;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(PerfCounterDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSpecifiers = defaults.counterSpecifiers;
    	      this.name = defaults.name;
    	      this.samplingFrequencyInSeconds = defaults.samplingFrequencyInSeconds;
    	      this.streams = defaults.streams;
        }

        public Builder counterSpecifiers(@Nullable List<String> counterSpecifiers) {
            this.counterSpecifiers = counterSpecifiers;
            return this;
        }
        public Builder counterSpecifiers(String... counterSpecifiers) {
            return counterSpecifiers(List.of(counterSpecifiers));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder samplingFrequencyInSeconds(@Nullable Integer samplingFrequencyInSeconds) {
            this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
            return this;
        }
        public Builder streams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }
        public Builder streams(String... streams) {
            return streams(List.of(streams));
        }        public PerfCounterDataSourceResponse build() {
            return new PerfCounterDataSourceResponse(counterSpecifiers, name, samplingFrequencyInSeconds, streams);
        }
    }
}
