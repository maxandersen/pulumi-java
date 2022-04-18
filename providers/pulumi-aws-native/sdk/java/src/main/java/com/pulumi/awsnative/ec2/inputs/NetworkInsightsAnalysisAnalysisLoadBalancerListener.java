// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisAnalysisLoadBalancerListener extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisAnalysisLoadBalancerListener Empty = new NetworkInsightsAnalysisAnalysisLoadBalancerListener();

    @Import(name="instancePort")
      private final @Nullable Integer instancePort;

    public Optional<Integer> instancePort() {
        return this.instancePort == null ? Optional.empty() : Optional.ofNullable(this.instancePort);
    }

    @Import(name="loadBalancerPort")
      private final @Nullable Integer loadBalancerPort;

    public Optional<Integer> loadBalancerPort() {
        return this.loadBalancerPort == null ? Optional.empty() : Optional.ofNullable(this.loadBalancerPort);
    }

    public NetworkInsightsAnalysisAnalysisLoadBalancerListener(
        @Nullable Integer instancePort,
        @Nullable Integer loadBalancerPort) {
        this.instancePort = instancePort;
        this.loadBalancerPort = loadBalancerPort;
    }

    private NetworkInsightsAnalysisAnalysisLoadBalancerListener() {
        this.instancePort = null;
        this.loadBalancerPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisLoadBalancerListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instancePort;
        private @Nullable Integer loadBalancerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisLoadBalancerListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.loadBalancerPort = defaults.loadBalancerPort;
        }

        public Builder instancePort(@Nullable Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Builder loadBalancerPort(@Nullable Integer loadBalancerPort) {
            this.loadBalancerPort = loadBalancerPort;
            return this;
        }        public NetworkInsightsAnalysisAnalysisLoadBalancerListener build() {
            return new NetworkInsightsAnalysisAnalysisLoadBalancerListener(instancePort, loadBalancerPort);
        }
    }
}
