// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1AnalysisResultResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAnalysisResult {
    /**
     * The result of the analysis, which is populated when the analysis finishes.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult;
    /**
     * The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
     */
    private final String createTime;
    /**
     * Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    private final String name;
    /**
     * The time at which the analysis was requested.
     * 
     */
    private final String requestTime;

    @CustomType.Constructor
    private GetAnalysisResult(
        @CustomType.Parameter("analysisResult") GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requestTime") String requestTime) {
        this.analysisResult = analysisResult;
        this.createTime = createTime;
        this.name = name;
        this.requestTime = requestTime;
    }

    /**
     * The result of the analysis, which is populated when the analysis finishes.
     * 
    */
    public GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult() {
        return this.analysisResult;
    }
    /**
     * The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The time at which the analysis was requested.
     * 
    */
    public String requestTime() {
        return this.requestTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalysisResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult;
        private String createTime;
        private String name;
        private String requestTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalysisResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisResult = defaults.analysisResult;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.requestTime = defaults.requestTime;
        }

        public Builder analysisResult(GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult) {
            this.analysisResult = Objects.requireNonNull(analysisResult);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder requestTime(String requestTime) {
            this.requestTime = Objects.requireNonNull(requestTime);
            return this;
        }        public GetAnalysisResult build() {
            return new GetAnalysisResult(analysisResult, createTime, name, requestTime);
        }
    }
}
