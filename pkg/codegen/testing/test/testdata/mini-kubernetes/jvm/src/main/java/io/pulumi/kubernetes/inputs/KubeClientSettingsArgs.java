// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.Utilities;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options for tuning the Kubernetes client used by a Provider.
 * 
 */
public final class KubeClientSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final KubeClientSettingsArgs Empty = new KubeClientSettingsArgs();

    /**
     * Maximum burst for throttle. Default value is 10.
     * 
     */
    @InputImport(name="burst")
    private final @Nullable Input<Integer> burst;

    public Input<Integer> getBurst() {
        return this.burst == null ? Input.empty() : this.burst;
    }

    /**
     * Maximum queries per second (QPS) to the API server from this client. Default value is 5.
     * 
     */
    @InputImport(name="qps")
    private final @Nullable Input<Double> qps;

    public Input<Double> getQps() {
        return this.qps == null ? Input.empty() : this.qps;
    }

    public KubeClientSettingsArgs(
        @Nullable Input<Integer> burst,
        @Nullable Input<Double> qps) {
        this.burst = burst == null ? Input.ofNullable(Utilities.getEnvInteger("PULUMI_K8S_CLIENT_BURST").orElse(null)) : burst;
        this.qps = qps == null ? Input.ofNullable(Utilities.getEnvDouble("PULUMI_K8S_CLIENT_QPS").orElse(null)) : qps;
    }

    private KubeClientSettingsArgs() {
        this.burst = Input.empty();
        this.qps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeClientSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> burst;
        private @Nullable Input<Double> qps;

        public Builder() {
    	      // Empty
        }

        public Builder(KubeClientSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.qps = defaults.qps;
        }

        public Builder setBurst(@Nullable Input<Integer> burst) {
            this.burst = burst;
            return this;
        }

        public Builder setBurst(@Nullable Integer burst) {
            this.burst = Input.ofNullable(burst);
            return this;
        }

        public Builder setQps(@Nullable Input<Double> qps) {
            this.qps = qps;
            return this;
        }

        public Builder setQps(@Nullable Double qps) {
            this.qps = Input.ofNullable(qps);
            return this;
        }

        public KubeClientSettingsArgs build() {
            return new KubeClientSettingsArgs(burst, qps);
        }
    }
}
