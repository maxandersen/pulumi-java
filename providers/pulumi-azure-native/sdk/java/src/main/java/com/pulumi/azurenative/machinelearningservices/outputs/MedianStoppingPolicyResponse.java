// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MedianStoppingPolicyResponse {
    /**
     * @return Number of intervals by which to delay the first evaluation.
     * 
     */
    private final @Nullable Integer delayEvaluation;
    /**
     * @return Interval (number of runs) between policy evaluations.
     * 
     */
    private final @Nullable Integer evaluationInterval;
    /**
     * @return
     * Expected value is &#39;MedianStopping&#39;.
     * 
     */
    private final String policyType;

    @CustomType.Constructor
    private MedianStoppingPolicyResponse(
        @CustomType.Parameter("delayEvaluation") @Nullable Integer delayEvaluation,
        @CustomType.Parameter("evaluationInterval") @Nullable Integer evaluationInterval,
        @CustomType.Parameter("policyType") String policyType) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = policyType;
    }

    /**
     * @return Number of intervals by which to delay the first evaluation.
     * 
     */
    public Optional<Integer> delayEvaluation() {
        return Optional.ofNullable(this.delayEvaluation);
    }
    /**
     * @return Interval (number of runs) between policy evaluations.
     * 
     */
    public Optional<Integer> evaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }
    /**
     * @return
     * Expected value is &#39;MedianStopping&#39;.
     * 
     */
    public String policyType() {
        return this.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MedianStoppingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer delayEvaluation;
        private @Nullable Integer evaluationInterval;
        private String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(MedianStoppingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
        }

        public Builder delayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }
        public Builder evaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }
        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }        public MedianStoppingPolicyResponse build() {
            return new MedianStoppingPolicyResponse(delayEvaluation, evaluationInterval, policyType);
        }
    }
}
