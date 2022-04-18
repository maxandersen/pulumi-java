// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.websecurityscanner_v1alpha.enums.ScanRunExecutionState;
import com.pulumi.googlenative.websecurityscanner_v1alpha.enums.ScanRunResultState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A ScanRun is a output-only resource representing an actual run of the scan.
 * 
 */
public final class ScanRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScanRunArgs Empty = new ScanRunArgs();

    /**
     * The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime == null ? Codegen.empty() : this.endTime;
    }

    /**
     * The execution state of the ScanRun.
     * 
     */
    @Import(name="executionState")
      private final @Nullable Output<ScanRunExecutionState> executionState;

    public Output<ScanRunExecutionState> executionState() {
        return this.executionState == null ? Codegen.empty() : this.executionState;
    }

    /**
     * Whether the scan run has found any vulnerabilities.
     * 
     */
    @Import(name="hasVulnerabilities")
      private final @Nullable Output<Boolean> hasVulnerabilities;

    public Output<Boolean> hasVulnerabilities() {
        return this.hasVulnerabilities == null ? Codegen.empty() : this.hasVulnerabilities;
    }

    /**
     * The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated by the system.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
     * 
     */
    @Import(name="progressPercent")
      private final @Nullable Output<Integer> progressPercent;

    public Output<Integer> progressPercent() {
        return this.progressPercent == null ? Codegen.empty() : this.progressPercent;
    }

    /**
     * The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED".
     * 
     */
    @Import(name="resultState")
      private final @Nullable Output<ScanRunResultState> resultState;

    public Output<ScanRunResultState> resultState() {
        return this.resultState == null ? Codegen.empty() : this.resultState;
    }

    /**
     * The time at which the ScanRun started.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
     * 
     */
    @Import(name="urlsCrawledCount")
      private final @Nullable Output<String> urlsCrawledCount;

    public Output<String> urlsCrawledCount() {
        return this.urlsCrawledCount == null ? Codegen.empty() : this.urlsCrawledCount;
    }

    /**
     * The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
     * 
     */
    @Import(name="urlsTestedCount")
      private final @Nullable Output<String> urlsTestedCount;

    public Output<String> urlsTestedCount() {
        return this.urlsTestedCount == null ? Codegen.empty() : this.urlsTestedCount;
    }

    public ScanRunArgs(
        @Nullable Output<String> endTime,
        @Nullable Output<ScanRunExecutionState> executionState,
        @Nullable Output<Boolean> hasVulnerabilities,
        @Nullable Output<String> name,
        @Nullable Output<Integer> progressPercent,
        @Nullable Output<ScanRunResultState> resultState,
        @Nullable Output<String> startTime,
        @Nullable Output<String> urlsCrawledCount,
        @Nullable Output<String> urlsTestedCount) {
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

    private ScanRunArgs() {
        this.endTime = Codegen.empty();
        this.executionState = Codegen.empty();
        this.hasVulnerabilities = Codegen.empty();
        this.name = Codegen.empty();
        this.progressPercent = Codegen.empty();
        this.resultState = Codegen.empty();
        this.startTime = Codegen.empty();
        this.urlsCrawledCount = Codegen.empty();
        this.urlsTestedCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTime;
        private @Nullable Output<ScanRunExecutionState> executionState;
        private @Nullable Output<Boolean> hasVulnerabilities;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> progressPercent;
        private @Nullable Output<ScanRunResultState> resultState;
        private @Nullable Output<String> startTime;
        private @Nullable Output<String> urlsCrawledCount;
        private @Nullable Output<String> urlsTestedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunArgs defaults) {
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

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = Codegen.ofNullable(endTime);
            return this;
        }
        public Builder executionState(@Nullable Output<ScanRunExecutionState> executionState) {
            this.executionState = executionState;
            return this;
        }
        public Builder executionState(@Nullable ScanRunExecutionState executionState) {
            this.executionState = Codegen.ofNullable(executionState);
            return this;
        }
        public Builder hasVulnerabilities(@Nullable Output<Boolean> hasVulnerabilities) {
            this.hasVulnerabilities = hasVulnerabilities;
            return this;
        }
        public Builder hasVulnerabilities(@Nullable Boolean hasVulnerabilities) {
            this.hasVulnerabilities = Codegen.ofNullable(hasVulnerabilities);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder progressPercent(@Nullable Output<Integer> progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }
        public Builder progressPercent(@Nullable Integer progressPercent) {
            this.progressPercent = Codegen.ofNullable(progressPercent);
            return this;
        }
        public Builder resultState(@Nullable Output<ScanRunResultState> resultState) {
            this.resultState = resultState;
            return this;
        }
        public Builder resultState(@Nullable ScanRunResultState resultState) {
            this.resultState = Codegen.ofNullable(resultState);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder urlsCrawledCount(@Nullable Output<String> urlsCrawledCount) {
            this.urlsCrawledCount = urlsCrawledCount;
            return this;
        }
        public Builder urlsCrawledCount(@Nullable String urlsCrawledCount) {
            this.urlsCrawledCount = Codegen.ofNullable(urlsCrawledCount);
            return this;
        }
        public Builder urlsTestedCount(@Nullable Output<String> urlsTestedCount) {
            this.urlsTestedCount = urlsTestedCount;
            return this;
        }
        public Builder urlsTestedCount(@Nullable String urlsTestedCount) {
            this.urlsTestedCount = Codegen.ofNullable(urlsTestedCount);
            return this;
        }        public ScanRunArgs build() {
            return new ScanRunArgs(endTime, executionState, hasVulnerabilities, name, progressPercent, resultState, startTime, urlsCrawledCount, urlsTestedCount);
        }
    }
}
