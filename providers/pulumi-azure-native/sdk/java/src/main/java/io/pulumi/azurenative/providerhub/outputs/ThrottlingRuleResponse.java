// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.ThrottlingMetricResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ThrottlingRuleResponse {
    private final String action;
    private final List<ThrottlingMetricResponse> metrics;
    private final @Nullable List<String> requiredFeatures;

    @CustomType.Constructor
    private ThrottlingRuleResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("metrics") List<ThrottlingMetricResponse> metrics,
        @CustomType.Parameter("requiredFeatures") @Nullable List<String> requiredFeatures) {
        this.action = action;
        this.metrics = metrics;
        this.requiredFeatures = requiredFeatures;
    }

    public String action() {
        return this.action;
    }
    public List<ThrottlingMetricResponse> metrics() {
        return this.metrics;
    }
    public List<String> requiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThrottlingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<ThrottlingMetricResponse> metrics;
        private @Nullable List<String> requiredFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(ThrottlingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.metrics = defaults.metrics;
    	      this.requiredFeatures = defaults.requiredFeatures;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder metrics(List<ThrottlingMetricResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(ThrottlingMetricResponse... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }
        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }        public ThrottlingRuleResponse build() {
            return new ThrottlingRuleResponse(action, metrics, requiredFeatures);
        }
    }
}
