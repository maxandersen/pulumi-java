// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.KnownSyslogDataSourceFacilityNames;
import com.pulumi.azurenative.insights.enums.KnownSyslogDataSourceLogLevels;
import com.pulumi.azurenative.insights.enums.KnownSyslogDataSourceStreams;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of which syslog data will be collected and how it will be collected.
 * Only collected from Linux machines.
 * 
 */
public final class SyslogDataSourceArgs extends ResourceArgs {

    public static final SyslogDataSourceArgs Empty = new SyslogDataSourceArgs();

    /**
     * The list of facility names.
     * 
     */
    @Import(name="facilityNames")
    private @Nullable Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames;

    /**
     * @return The list of facility names.
     * 
     */
    public Optional<Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>>> facilityNames() {
        return Optional.ofNullable(this.facilityNames);
    }

    /**
     * The log levels to collect.
     * 
     */
    @Import(name="logLevels")
    private @Nullable Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels;

    /**
     * @return The log levels to collect.
     * 
     */
    public Optional<Output<List<Either<String,KnownSyslogDataSourceLogLevels>>>> logLevels() {
        return Optional.ofNullable(this.logLevels);
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @Import(name="streams")
    private @Nullable Output<List<Either<String,KnownSyslogDataSourceStreams>>> streams;

    /**
     * @return List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    public Optional<Output<List<Either<String,KnownSyslogDataSourceStreams>>>> streams() {
        return Optional.ofNullable(this.streams);
    }

    private SyslogDataSourceArgs() {}

    private SyslogDataSourceArgs(SyslogDataSourceArgs $) {
        this.facilityNames = $.facilityNames;
        this.logLevels = $.logLevels;
        this.name = $.name;
        this.streams = $.streams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyslogDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyslogDataSourceArgs $;

        public Builder() {
            $ = new SyslogDataSourceArgs();
        }

        public Builder(SyslogDataSourceArgs defaults) {
            $ = new SyslogDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facilityNames The list of facility names.
         * 
         * @return builder
         * 
         */
        public Builder facilityNames(@Nullable Output<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames) {
            $.facilityNames = facilityNames;
            return this;
        }

        /**
         * @param facilityNames The list of facility names.
         * 
         * @return builder
         * 
         */
        public Builder facilityNames(List<Either<String,KnownSyslogDataSourceFacilityNames>> facilityNames) {
            return facilityNames(Output.of(facilityNames));
        }

        /**
         * @param facilityNames The list of facility names.
         * 
         * @return builder
         * 
         */
        public Builder facilityNames(Either<String,KnownSyslogDataSourceFacilityNames>... facilityNames) {
            return facilityNames(List.of(facilityNames));
        }

        /**
         * @param logLevels The log levels to collect.
         * 
         * @return builder
         * 
         */
        public Builder logLevels(@Nullable Output<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels) {
            $.logLevels = logLevels;
            return this;
        }

        /**
         * @param logLevels The log levels to collect.
         * 
         * @return builder
         * 
         */
        public Builder logLevels(List<Either<String,KnownSyslogDataSourceLogLevels>> logLevels) {
            return logLevels(Output.of(logLevels));
        }

        /**
         * @param logLevels The log levels to collect.
         * 
         * @return builder
         * 
         */
        public Builder logLevels(Either<String,KnownSyslogDataSourceLogLevels>... logLevels) {
            return logLevels(List.of(logLevels));
        }

        /**
         * @param name A friendly name for the data source.
         * This name should be unique across all data sources (regardless of type) within the data collection rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name for the data source.
         * This name should be unique across all data sources (regardless of type) within the data collection rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param streams List of streams that this data source will be sent to.
         * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder streams(@Nullable Output<List<Either<String,KnownSyslogDataSourceStreams>>> streams) {
            $.streams = streams;
            return this;
        }

        /**
         * @param streams List of streams that this data source will be sent to.
         * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder streams(List<Either<String,KnownSyslogDataSourceStreams>> streams) {
            return streams(Output.of(streams));
        }

        /**
         * @param streams List of streams that this data source will be sent to.
         * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder streams(Either<String,KnownSyslogDataSourceStreams>... streams) {
            return streams(List.of(streams));
        }

        public SyslogDataSourceArgs build() {
            return $;
        }
    }

}
