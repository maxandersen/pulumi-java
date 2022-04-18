// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.outputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class KubeClientSettingsArgs {
    /**
     * Maximum burst for throttle. Default value is 10.
     * 
     */
    private final @Nullable Output<Integer> burst;
    /**
     * Maximum queries per second (QPS) to the API server from this client. Default value is 5.
     * 
     */
    private final @Nullable Output<Double> qps;

    @CustomType.Constructor
    private KubeClientSettingsArgs(
        @CustomType.Parameter("burst") @Nullable Output<Integer> burst,
        @CustomType.Parameter("qps") @Nullable Output<Double> qps) {
        this.burst = burst;
        this.qps = qps;
    }

    /**
     * Maximum burst for throttle. Default value is 10.
     * 
    */
    public @Nullable Output<Integer> burst() {
        return this.burst;
    }
    /**
     * Maximum queries per second (QPS) to the API server from this client. Default value is 5.
     * 
    */
    public @Nullable Output<Double> qps() {
        return this.qps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeClientSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> burst;
        private @Nullable Output<Double> qps;

        public Builder() {
    	      // Empty
        }

        public Builder(KubeClientSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.qps = defaults.qps;
        }

        public Builder burst(@Nullable Output<Integer> burst) {
            this.burst = burst;
            return this;
        }
        public Builder qps(@Nullable Output<Double> qps) {
            this.qps = qps;
            return this;
        }        public KubeClientSettingsArgs build() {
            return new KubeClientSettingsArgs(burst, qps);
        }
    }
}
