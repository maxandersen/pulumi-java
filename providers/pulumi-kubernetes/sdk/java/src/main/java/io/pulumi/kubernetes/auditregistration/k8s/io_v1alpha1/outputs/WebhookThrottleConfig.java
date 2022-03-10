// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookThrottleConfig {
    /**
     * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
     */
    private final @Nullable Integer burst;
    /**
     * ThrottleQPS maximum number of batches per second default 10 QPS
     * 
     */
    private final @Nullable Integer qps;

    @OutputCustomType.Constructor
    private WebhookThrottleConfig(
        @OutputCustomType.Parameter("burst") @Nullable Integer burst,
        @OutputCustomType.Parameter("qps") @Nullable Integer qps) {
        this.burst = burst;
        this.qps = qps;
    }

    /**
     * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
     * 
    */
    public Optional<Integer> getBurst() {
        return Optional.ofNullable(this.burst);
    }
    /**
     * ThrottleQPS maximum number of batches per second default 10 QPS
     * 
    */
    public Optional<Integer> getQps() {
        return Optional.ofNullable(this.qps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookThrottleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer burst;
        private @Nullable Integer qps;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookThrottleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.qps = defaults.qps;
        }

        public Builder setBurst(@Nullable Integer burst) {
            this.burst = burst;
            return this;
        }

        public Builder setQps(@Nullable Integer qps) {
            this.qps = qps;
            return this;
        }
        public WebhookThrottleConfig build() {
            return new WebhookThrottleConfig(burst, qps);
        }
    }
}
