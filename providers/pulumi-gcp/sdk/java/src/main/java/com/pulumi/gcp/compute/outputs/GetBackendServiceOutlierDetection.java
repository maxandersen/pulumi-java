// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceOutlierDetectionBaseEjectionTime;
import com.pulumi.gcp.compute.outputs.GetBackendServiceOutlierDetectionInterval;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceOutlierDetection {
    private final List<GetBackendServiceOutlierDetectionBaseEjectionTime> baseEjectionTimes;
    private final Integer consecutiveErrors;
    private final Integer consecutiveGatewayFailure;
    private final Integer enforcingConsecutiveErrors;
    private final Integer enforcingConsecutiveGatewayFailure;
    private final Integer enforcingSuccessRate;
    private final List<GetBackendServiceOutlierDetectionInterval> intervals;
    private final Integer maxEjectionPercent;
    private final Integer successRateMinimumHosts;
    private final Integer successRateRequestVolume;
    private final Integer successRateStdevFactor;

    @CustomType.Constructor
    private GetBackendServiceOutlierDetection(
        @CustomType.Parameter("baseEjectionTimes") List<GetBackendServiceOutlierDetectionBaseEjectionTime> baseEjectionTimes,
        @CustomType.Parameter("consecutiveErrors") Integer consecutiveErrors,
        @CustomType.Parameter("consecutiveGatewayFailure") Integer consecutiveGatewayFailure,
        @CustomType.Parameter("enforcingConsecutiveErrors") Integer enforcingConsecutiveErrors,
        @CustomType.Parameter("enforcingConsecutiveGatewayFailure") Integer enforcingConsecutiveGatewayFailure,
        @CustomType.Parameter("enforcingSuccessRate") Integer enforcingSuccessRate,
        @CustomType.Parameter("intervals") List<GetBackendServiceOutlierDetectionInterval> intervals,
        @CustomType.Parameter("maxEjectionPercent") Integer maxEjectionPercent,
        @CustomType.Parameter("successRateMinimumHosts") Integer successRateMinimumHosts,
        @CustomType.Parameter("successRateRequestVolume") Integer successRateRequestVolume,
        @CustomType.Parameter("successRateStdevFactor") Integer successRateStdevFactor) {
        this.baseEjectionTimes = baseEjectionTimes;
        this.consecutiveErrors = consecutiveErrors;
        this.consecutiveGatewayFailure = consecutiveGatewayFailure;
        this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
        this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
        this.enforcingSuccessRate = enforcingSuccessRate;
        this.intervals = intervals;
        this.maxEjectionPercent = maxEjectionPercent;
        this.successRateMinimumHosts = successRateMinimumHosts;
        this.successRateRequestVolume = successRateRequestVolume;
        this.successRateStdevFactor = successRateStdevFactor;
    }

    public List<GetBackendServiceOutlierDetectionBaseEjectionTime> baseEjectionTimes() {
        return this.baseEjectionTimes;
    }
    public Integer consecutiveErrors() {
        return this.consecutiveErrors;
    }
    public Integer consecutiveGatewayFailure() {
        return this.consecutiveGatewayFailure;
    }
    public Integer enforcingConsecutiveErrors() {
        return this.enforcingConsecutiveErrors;
    }
    public Integer enforcingConsecutiveGatewayFailure() {
        return this.enforcingConsecutiveGatewayFailure;
    }
    public Integer enforcingSuccessRate() {
        return this.enforcingSuccessRate;
    }
    public List<GetBackendServiceOutlierDetectionInterval> intervals() {
        return this.intervals;
    }
    public Integer maxEjectionPercent() {
        return this.maxEjectionPercent;
    }
    public Integer successRateMinimumHosts() {
        return this.successRateMinimumHosts;
    }
    public Integer successRateRequestVolume() {
        return this.successRateRequestVolume;
    }
    public Integer successRateStdevFactor() {
        return this.successRateStdevFactor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceOutlierDetection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBackendServiceOutlierDetectionBaseEjectionTime> baseEjectionTimes;
        private Integer consecutiveErrors;
        private Integer consecutiveGatewayFailure;
        private Integer enforcingConsecutiveErrors;
        private Integer enforcingConsecutiveGatewayFailure;
        private Integer enforcingSuccessRate;
        private List<GetBackendServiceOutlierDetectionInterval> intervals;
        private Integer maxEjectionPercent;
        private Integer successRateMinimumHosts;
        private Integer successRateRequestVolume;
        private Integer successRateStdevFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceOutlierDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionTimes = defaults.baseEjectionTimes;
    	      this.consecutiveErrors = defaults.consecutiveErrors;
    	      this.consecutiveGatewayFailure = defaults.consecutiveGatewayFailure;
    	      this.enforcingConsecutiveErrors = defaults.enforcingConsecutiveErrors;
    	      this.enforcingConsecutiveGatewayFailure = defaults.enforcingConsecutiveGatewayFailure;
    	      this.enforcingSuccessRate = defaults.enforcingSuccessRate;
    	      this.intervals = defaults.intervals;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.successRateMinimumHosts = defaults.successRateMinimumHosts;
    	      this.successRateRequestVolume = defaults.successRateRequestVolume;
    	      this.successRateStdevFactor = defaults.successRateStdevFactor;
        }

        public Builder baseEjectionTimes(List<GetBackendServiceOutlierDetectionBaseEjectionTime> baseEjectionTimes) {
            this.baseEjectionTimes = Objects.requireNonNull(baseEjectionTimes);
            return this;
        }
        public Builder baseEjectionTimes(GetBackendServiceOutlierDetectionBaseEjectionTime... baseEjectionTimes) {
            return baseEjectionTimes(List.of(baseEjectionTimes));
        }
        public Builder consecutiveErrors(Integer consecutiveErrors) {
            this.consecutiveErrors = Objects.requireNonNull(consecutiveErrors);
            return this;
        }
        public Builder consecutiveGatewayFailure(Integer consecutiveGatewayFailure) {
            this.consecutiveGatewayFailure = Objects.requireNonNull(consecutiveGatewayFailure);
            return this;
        }
        public Builder enforcingConsecutiveErrors(Integer enforcingConsecutiveErrors) {
            this.enforcingConsecutiveErrors = Objects.requireNonNull(enforcingConsecutiveErrors);
            return this;
        }
        public Builder enforcingConsecutiveGatewayFailure(Integer enforcingConsecutiveGatewayFailure) {
            this.enforcingConsecutiveGatewayFailure = Objects.requireNonNull(enforcingConsecutiveGatewayFailure);
            return this;
        }
        public Builder enforcingSuccessRate(Integer enforcingSuccessRate) {
            this.enforcingSuccessRate = Objects.requireNonNull(enforcingSuccessRate);
            return this;
        }
        public Builder intervals(List<GetBackendServiceOutlierDetectionInterval> intervals) {
            this.intervals = Objects.requireNonNull(intervals);
            return this;
        }
        public Builder intervals(GetBackendServiceOutlierDetectionInterval... intervals) {
            return intervals(List.of(intervals));
        }
        public Builder maxEjectionPercent(Integer maxEjectionPercent) {
            this.maxEjectionPercent = Objects.requireNonNull(maxEjectionPercent);
            return this;
        }
        public Builder successRateMinimumHosts(Integer successRateMinimumHosts) {
            this.successRateMinimumHosts = Objects.requireNonNull(successRateMinimumHosts);
            return this;
        }
        public Builder successRateRequestVolume(Integer successRateRequestVolume) {
            this.successRateRequestVolume = Objects.requireNonNull(successRateRequestVolume);
            return this;
        }
        public Builder successRateStdevFactor(Integer successRateStdevFactor) {
            this.successRateStdevFactor = Objects.requireNonNull(successRateStdevFactor);
            return this;
        }        public GetBackendServiceOutlierDetection build() {
            return new GetBackendServiceOutlierDetection(baseEjectionTimes, consecutiveErrors, consecutiveGatewayFailure, enforcingConsecutiveErrors, enforcingConsecutiveGatewayFailure, enforcingSuccessRate, intervals, maxEjectionPercent, successRateMinimumHosts, successRateRequestVolume, successRateStdevFactor);
        }
    }
}
