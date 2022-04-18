// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Attributes credit by computing the Aumann-Shapley value taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1703.01365
 * 
 */
public final class GoogleCloudMlV1__IntegratedGradientsAttributionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__IntegratedGradientsAttributionResponse Empty = new GoogleCloudMlV1__IntegratedGradientsAttributionResponse();

    /**
     * Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range.
     * 
     */
    @Import(name="numIntegralSteps", required=true)
      private final Integer numIntegralSteps;

    public Integer numIntegralSteps() {
        return this.numIntegralSteps;
    }

    public GoogleCloudMlV1__IntegratedGradientsAttributionResponse(Integer numIntegralSteps) {
        this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps, "expected parameter 'numIntegralSteps' to be non-null");
    }

    private GoogleCloudMlV1__IntegratedGradientsAttributionResponse() {
        this.numIntegralSteps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__IntegratedGradientsAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numIntegralSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__IntegratedGradientsAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numIntegralSteps = defaults.numIntegralSteps;
        }

        public Builder numIntegralSteps(Integer numIntegralSteps) {
            this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps);
            return this;
        }        public GoogleCloudMlV1__IntegratedGradientsAttributionResponse build() {
            return new GoogleCloudMlV1__IntegratedGradientsAttributionResponse(numIntegralSteps);
        }
    }
}
