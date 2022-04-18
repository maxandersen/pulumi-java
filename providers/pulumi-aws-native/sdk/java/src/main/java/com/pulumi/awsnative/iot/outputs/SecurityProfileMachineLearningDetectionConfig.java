// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.enums.SecurityProfileMachineLearningDetectionConfigConfidenceLevel;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityProfileMachineLearningDetectionConfig {
    /**
     * The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High.
     * 
     */
    private final @Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel;

    @CustomType.Constructor
    private SecurityProfileMachineLearningDetectionConfig(@CustomType.Parameter("confidenceLevel") @Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    /**
     * The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High.
     * 
    */
    public Optional<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> confidenceLevel() {
        return Optional.ofNullable(this.confidenceLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMachineLearningDetectionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMachineLearningDetectionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceLevel = defaults.confidenceLevel;
        }

        public Builder confidenceLevel(@Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel) {
            this.confidenceLevel = confidenceLevel;
            return this;
        }        public SecurityProfileMachineLearningDetectionConfig build() {
            return new SecurityProfileMachineLearningDetectionConfig(confidenceLevel);
        }
    }
}
