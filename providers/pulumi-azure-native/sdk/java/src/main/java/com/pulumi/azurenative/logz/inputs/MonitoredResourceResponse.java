// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.inputs.SystemDataResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a resource currently being monitored by the Logz monitor resource.
 * 
 */
public final class MonitoredResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final MonitoredResourceResponse Empty = new MonitoredResourceResponse();

    /**
     * The ARM id of the resource.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Reason for why the resource is sending logs (or why it is not sending).
     * 
     */
    @Import(name="reasonForLogsStatus")
    private @Nullable String reasonForLogsStatus;

    public Optional<String> reasonForLogsStatus() {
        return Optional.ofNullable(this.reasonForLogsStatus);
    }

    /**
     * Reason for why the resource is sending metrics (or why it is not sending).
     * 
     */
    @Import(name="reasonForMetricsStatus")
    private @Nullable String reasonForMetricsStatus;

    public Optional<String> reasonForMetricsStatus() {
        return Optional.ofNullable(this.reasonForMetricsStatus);
    }

    /**
     * Flag indicating if resource is sending logs to Logz.
     * 
     */
    @Import(name="sendingLogs")
    private @Nullable Boolean sendingLogs;

    public Optional<Boolean> sendingLogs() {
        return Optional.ofNullable(this.sendingLogs);
    }

    /**
     * Flag indicating if resource is sending metrics to Logz.
     * 
     */
    @Import(name="sendingMetrics")
    private @Nullable Boolean sendingMetrics;

    public Optional<Boolean> sendingMetrics() {
        return Optional.ofNullable(this.sendingMetrics);
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Import(name="systemData", required=true)
    private SystemDataResponse systemData;

    public SystemDataResponse systemData() {
        return this.systemData;
    }

    private MonitoredResourceResponse() {}

    private MonitoredResourceResponse(MonitoredResourceResponse $) {
        this.id = $.id;
        this.reasonForLogsStatus = $.reasonForLogsStatus;
        this.reasonForMetricsStatus = $.reasonForMetricsStatus;
        this.sendingLogs = $.sendingLogs;
        this.sendingMetrics = $.sendingMetrics;
        this.systemData = $.systemData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredResourceResponse $;

        public Builder() {
            $ = new MonitoredResourceResponse();
        }

        public Builder(MonitoredResourceResponse defaults) {
            $ = new MonitoredResourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder reasonForLogsStatus(@Nullable String reasonForLogsStatus) {
            $.reasonForLogsStatus = reasonForLogsStatus;
            return this;
        }

        public Builder reasonForMetricsStatus(@Nullable String reasonForMetricsStatus) {
            $.reasonForMetricsStatus = reasonForMetricsStatus;
            return this;
        }

        public Builder sendingLogs(@Nullable Boolean sendingLogs) {
            $.sendingLogs = sendingLogs;
            return this;
        }

        public Builder sendingMetrics(@Nullable Boolean sendingMetrics) {
            $.sendingMetrics = sendingMetrics;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            $.systemData = systemData;
            return this;
        }

        public MonitoredResourceResponse build() {
            $.systemData = Objects.requireNonNull($.systemData, "expected parameter 'systemData' to be non-null");
            return $;
        }
    }

}
