// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScanRunResponse {
    /**
     * @return The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
     * 
     */
    private final String endTime;
    /**
     * @return The execution state of the ScanRun.
     * 
     */
    private final String executionState;
    /**
     * @return Whether the scan run has found any vulnerabilities.
     * 
     */
    private final Boolean hasVulnerabilities;
    /**
     * @return The resource name of the ScanRun. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}&#39;. The ScanRun IDs are generated by the system.
     * 
     */
    private final String name;
    /**
     * @return The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
     * 
     */
    private final Integer progressPercent;
    /**
     * @return The result state of the ScanRun. This field is only available after the execution state reaches &#34;FINISHED&#34;.
     * 
     */
    private final String resultState;
    /**
     * @return The time at which the ScanRun started.
     * 
     */
    private final String startTime;
    /**
     * @return The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
     * 
     */
    private final String urlsCrawledCount;
    /**
     * @return The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
     * 
     */
    private final String urlsTestedCount;

    @CustomType.Constructor
    private ScanRunResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("executionState") String executionState,
        @CustomType.Parameter("hasVulnerabilities") Boolean hasVulnerabilities,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("progressPercent") Integer progressPercent,
        @CustomType.Parameter("resultState") String resultState,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("urlsCrawledCount") String urlsCrawledCount,
        @CustomType.Parameter("urlsTestedCount") String urlsTestedCount) {
        this.endTime = endTime;
        this.executionState = executionState;
        this.hasVulnerabilities = hasVulnerabilities;
        this.name = name;
        this.progressPercent = progressPercent;
        this.resultState = resultState;
        this.startTime = startTime;
        this.urlsCrawledCount = urlsCrawledCount;
        this.urlsTestedCount = urlsTestedCount;
    }

    /**
     * @return The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The execution state of the ScanRun.
     * 
     */
    public String executionState() {
        return this.executionState;
    }
    /**
     * @return Whether the scan run has found any vulnerabilities.
     * 
     */
    public Boolean hasVulnerabilities() {
        return this.hasVulnerabilities;
    }
    /**
     * @return The resource name of the ScanRun. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}&#39;. The ScanRun IDs are generated by the system.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
     * 
     */
    public Integer progressPercent() {
        return this.progressPercent;
    }
    /**
     * @return The result state of the ScanRun. This field is only available after the execution state reaches &#34;FINISHED&#34;.
     * 
     */
    public String resultState() {
        return this.resultState;
    }
    /**
     * @return The time at which the ScanRun started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
     * 
     */
    public String urlsCrawledCount() {
        return this.urlsCrawledCount;
    }
    /**
     * @return The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
     * 
     */
    public String urlsTestedCount() {
        return this.urlsTestedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String executionState;
        private Boolean hasVulnerabilities;
        private String name;
        private Integer progressPercent;
        private String resultState;
        private String startTime;
        private String urlsCrawledCount;
        private String urlsTestedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.executionState = defaults.executionState;
    	      this.hasVulnerabilities = defaults.hasVulnerabilities;
    	      this.name = defaults.name;
    	      this.progressPercent = defaults.progressPercent;
    	      this.resultState = defaults.resultState;
    	      this.startTime = defaults.startTime;
    	      this.urlsCrawledCount = defaults.urlsCrawledCount;
    	      this.urlsTestedCount = defaults.urlsTestedCount;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder executionState(String executionState) {
            this.executionState = Objects.requireNonNull(executionState);
            return this;
        }
        public Builder hasVulnerabilities(Boolean hasVulnerabilities) {
            this.hasVulnerabilities = Objects.requireNonNull(hasVulnerabilities);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder progressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }
        public Builder resultState(String resultState) {
            this.resultState = Objects.requireNonNull(resultState);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder urlsCrawledCount(String urlsCrawledCount) {
            this.urlsCrawledCount = Objects.requireNonNull(urlsCrawledCount);
            return this;
        }
        public Builder urlsTestedCount(String urlsTestedCount) {
            this.urlsTestedCount = Objects.requireNonNull(urlsTestedCount);
            return this;
        }        public ScanRunResponse build() {
            return new ScanRunResponse(endTime, executionState, hasVulnerabilities, name, progressPercent, resultState, startTime, urlsCrawledCount, urlsTestedCount);
        }
    }
}
