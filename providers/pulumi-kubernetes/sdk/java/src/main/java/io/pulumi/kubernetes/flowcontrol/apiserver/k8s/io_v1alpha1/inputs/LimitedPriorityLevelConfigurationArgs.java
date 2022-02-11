// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.LimitResponseArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LimitedPriorityLevelConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LimitedPriorityLevelConfigurationArgs Empty = new LimitedPriorityLevelConfigurationArgs();

    @InputImport(name="assuredConcurrencyShares")
    private final @Nullable Input<Integer> assuredConcurrencyShares;

    public Input<Integer> getAssuredConcurrencyShares() {
        return this.assuredConcurrencyShares == null ? Input.empty() : this.assuredConcurrencyShares;
    }

    @InputImport(name="limitResponse")
    private final @Nullable Input<LimitResponseArgs> limitResponse;

    public Input<LimitResponseArgs> getLimitResponse() {
        return this.limitResponse == null ? Input.empty() : this.limitResponse;
    }

    public LimitedPriorityLevelConfigurationArgs(
        @Nullable Input<Integer> assuredConcurrencyShares,
        @Nullable Input<LimitResponseArgs> limitResponse) {
        this.assuredConcurrencyShares = assuredConcurrencyShares;
        this.limitResponse = limitResponse;
    }

    private LimitedPriorityLevelConfigurationArgs() {
        this.assuredConcurrencyShares = Input.empty();
        this.limitResponse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitedPriorityLevelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> assuredConcurrencyShares;
        private @Nullable Input<LimitResponseArgs> limitResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitedPriorityLevelConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assuredConcurrencyShares = defaults.assuredConcurrencyShares;
    	      this.limitResponse = defaults.limitResponse;
        }

        public Builder setAssuredConcurrencyShares(@Nullable Input<Integer> assuredConcurrencyShares) {
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        public Builder setAssuredConcurrencyShares(@Nullable Integer assuredConcurrencyShares) {
            this.assuredConcurrencyShares = Input.ofNullable(assuredConcurrencyShares);
            return this;
        }

        public Builder setLimitResponse(@Nullable Input<LimitResponseArgs> limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }

        public Builder setLimitResponse(@Nullable LimitResponseArgs limitResponse) {
            this.limitResponse = Input.ofNullable(limitResponse);
            return this;
        }

        public LimitedPriorityLevelConfigurationArgs build() {
            return new LimitedPriorityLevelConfigurationArgs(assuredConcurrencyShares, limitResponse);
        }
    }
}
