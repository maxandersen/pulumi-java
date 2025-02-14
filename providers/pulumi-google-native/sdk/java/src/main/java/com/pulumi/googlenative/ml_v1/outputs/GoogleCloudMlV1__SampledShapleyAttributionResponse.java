// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__SampledShapleyAttributionResponse {
    /**
     * @return The number of feature permutations to consider when approximating the Shapley values.
     * 
     */
    private final Integer numPaths;

    @CustomType.Constructor
    private GoogleCloudMlV1__SampledShapleyAttributionResponse(@CustomType.Parameter("numPaths") Integer numPaths) {
        this.numPaths = numPaths;
    }

    /**
     * @return The number of feature permutations to consider when approximating the Shapley values.
     * 
     */
    public Integer numPaths() {
        return this.numPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__SampledShapleyAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__SampledShapleyAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numPaths = defaults.numPaths;
        }

        public Builder numPaths(Integer numPaths) {
            this.numPaths = Objects.requireNonNull(numPaths);
            return this;
        }        public GoogleCloudMlV1__SampledShapleyAttributionResponse build() {
            return new GoogleCloudMlV1__SampledShapleyAttributionResponse(numPaths);
        }
    }
}
