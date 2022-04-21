// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanRunErrorTraceResponse;
import com.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanRunWarningTraceResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A ScanRun is a output-only resource representing an actual run of the scan. Next id: 12
 * 
 */
public final class ScanRunResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScanRunResponse Empty = new ScanRunResponse();

    /**
     * The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
     * 
     */
    @Import(name="endTime", required=true)
    private String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * If result_state is an ERROR, this field provides the primary reason for scan&#39;s termination and more details, if such are available.
     * 
     */
    @Import(name="errorTrace", required=true)
    private ScanRunErrorTraceResponse errorTrace;

    public ScanRunErrorTraceResponse errorTrace() {
        return this.errorTrace;
    }

    /**
     * The execution state of the ScanRun.
     * 
     */
    @Import(name="executionState", required=true)
    private String executionState;

    public String executionState() {
        return this.executionState;
    }

    /**
     * Whether the scan run has found any vulnerabilities.
     * 
     */
    @Import(name="hasVulnerabilities", required=true)
    private Boolean hasVulnerabilities;

    public Boolean hasVulnerabilities() {
        return this.hasVulnerabilities;
    }

    /**
     * The resource name of the ScanRun. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}&#39;. The ScanRun IDs are generated by the system.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
     * 
     */
    @Import(name="progressPercent", required=true)
    private Integer progressPercent;

    public Integer progressPercent() {
        return this.progressPercent;
    }

    /**
     * The result state of the ScanRun. This field is only available after the execution state reaches &#34;FINISHED&#34;.
     * 
     */
    @Import(name="resultState", required=true)
    private String resultState;

    public String resultState() {
        return this.resultState;
    }

    /**
     * The time at which the ScanRun started.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
     * 
     */
    @Import(name="urlsCrawledCount", required=true)
    private String urlsCrawledCount;

    public String urlsCrawledCount() {
        return this.urlsCrawledCount;
    }

    /**
     * The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
     * 
     */
    @Import(name="urlsTestedCount", required=true)
    private String urlsTestedCount;

    public String urlsTestedCount() {
        return this.urlsTestedCount;
    }

    /**
     * A list of warnings, if such are encountered during this scan run.
     * 
     */
    @Import(name="warningTraces", required=true)
    private List<ScanRunWarningTraceResponse> warningTraces;

    public List<ScanRunWarningTraceResponse> warningTraces() {
        return this.warningTraces;
    }

    private ScanRunResponse() {}

    private ScanRunResponse(ScanRunResponse $) {
        this.endTime = $.endTime;
        this.errorTrace = $.errorTrace;
        this.executionState = $.executionState;
        this.hasVulnerabilities = $.hasVulnerabilities;
        this.name = $.name;
        this.progressPercent = $.progressPercent;
        this.resultState = $.resultState;
        this.startTime = $.startTime;
        this.urlsCrawledCount = $.urlsCrawledCount;
        this.urlsTestedCount = $.urlsTestedCount;
        this.warningTraces = $.warningTraces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScanRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScanRunResponse $;

        public Builder() {
            $ = new ScanRunResponse();
        }

        public Builder(ScanRunResponse defaults) {
            $ = new ScanRunResponse(Objects.requireNonNull(defaults));
        }

        public Builder endTime(String endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder errorTrace(ScanRunErrorTraceResponse errorTrace) {
            $.errorTrace = errorTrace;
            return this;
        }

        public Builder executionState(String executionState) {
            $.executionState = executionState;
            return this;
        }

        public Builder hasVulnerabilities(Boolean hasVulnerabilities) {
            $.hasVulnerabilities = hasVulnerabilities;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder progressPercent(Integer progressPercent) {
            $.progressPercent = progressPercent;
            return this;
        }

        public Builder resultState(String resultState) {
            $.resultState = resultState;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder urlsCrawledCount(String urlsCrawledCount) {
            $.urlsCrawledCount = urlsCrawledCount;
            return this;
        }

        public Builder urlsTestedCount(String urlsTestedCount) {
            $.urlsTestedCount = urlsTestedCount;
            return this;
        }

        public Builder warningTraces(List<ScanRunWarningTraceResponse> warningTraces) {
            $.warningTraces = warningTraces;
            return this;
        }

        public Builder warningTraces(ScanRunWarningTraceResponse... warningTraces) {
            return warningTraces(List.of(warningTraces));
        }

        public ScanRunResponse build() {
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.errorTrace = Objects.requireNonNull($.errorTrace, "expected parameter 'errorTrace' to be non-null");
            $.executionState = Objects.requireNonNull($.executionState, "expected parameter 'executionState' to be non-null");
            $.hasVulnerabilities = Objects.requireNonNull($.hasVulnerabilities, "expected parameter 'hasVulnerabilities' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.progressPercent = Objects.requireNonNull($.progressPercent, "expected parameter 'progressPercent' to be non-null");
            $.resultState = Objects.requireNonNull($.resultState, "expected parameter 'resultState' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.urlsCrawledCount = Objects.requireNonNull($.urlsCrawledCount, "expected parameter 'urlsCrawledCount' to be non-null");
            $.urlsTestedCount = Objects.requireNonNull($.urlsTestedCount, "expected parameter 'urlsTestedCount' to be non-null");
            $.warningTraces = Objects.requireNonNull($.warningTraces, "expected parameter 'warningTraces' to be non-null");
            return $;
        }
    }

}
