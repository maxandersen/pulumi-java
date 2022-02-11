// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.LimitResponse;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LimitedPriorityLevelConfiguration {
    private final @Nullable Integer assuredConcurrencyShares;
    private final @Nullable LimitResponse limitResponse;

    @OutputCustomType.Constructor({"assuredConcurrencyShares","limitResponse"})
    private LimitedPriorityLevelConfiguration(
        @Nullable Integer assuredConcurrencyShares,
        @Nullable LimitResponse limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.limitResponse = limitResponse;
    }

    public Optional<Integer> getAssuredConcurrencyShares() {
        return Optional.ofNullable(this.assuredConcurrencyShares);
    }
    public Optional<LimitResponse> getLimitResponse() {
        return Optional.ofNullable(this.limitResponse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer assuredConcurrencyShares;
        private @Nullable LimitResponse limitResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitedPriorityLevelConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredConcurrencyShares = defaults.assuredConcurrencyShares;
    	      this.limitResponse = defaults.limitResponse;
        }

        public Builder setAssuredConcurrencyShares(@Nullable Integer assuredConcurrencyShares) {
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        public Builder setLimitResponse(@Nullable LimitResponse limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }

        public LimitedPriorityLevelConfiguration build() {
            return new LimitedPriorityLevelConfiguration(assuredConcurrencyShares, limitResponse);
        }
    }
}
