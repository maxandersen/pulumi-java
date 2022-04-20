// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.lightsail.inputs.LoadBalancerTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * The names of the instances attached to the load balancer.
     * 
     */
    @Import(name="attachedInstances")
      private final @Nullable Output<List<String>> attachedInstances;

    public Output<List<String>> attachedInstances() {
        return this.attachedInstances == null ? Codegen.empty() : this.attachedInstances;
    }

    /**
     * The path you provided to perform the load balancer health check. If you didn&#39;t specify a health check path, Lightsail uses the root path of your website (e.g., &#34;/&#34;).
     * 
     */
    @Import(name="healthCheckPath")
      private final @Nullable Output<String> healthCheckPath;

    public Output<String> healthCheckPath() {
        return this.healthCheckPath == null ? Codegen.empty() : this.healthCheckPath;
    }

    /**
     * The instance port where you&#39;re creating your load balancer.
     * 
     */
    @Import(name="instancePort", required=true)
      private final Output<Integer> instancePort;

    public Output<Integer> instancePort() {
        return this.instancePort;
    }

    /**
     * The IP address type for the load balancer. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6. The default value is dualstack.
     * 
     */
    @Import(name="ipAddressType")
      private final @Nullable Output<String> ipAddressType;

    public Output<String> ipAddressType() {
        return this.ipAddressType == null ? Codegen.empty() : this.ipAddressType;
    }

    /**
     * The name of your load balancer.
     * 
     */
    @Import(name="loadBalancerName")
      private final @Nullable Output<String> loadBalancerName;

    public Output<String> loadBalancerName() {
        return this.loadBalancerName == null ? Codegen.empty() : this.loadBalancerName;
    }

    /**
     * Configuration option to enable session stickiness.
     * 
     */
    @Import(name="sessionStickinessEnabled")
      private final @Nullable Output<Boolean> sessionStickinessEnabled;

    public Output<Boolean> sessionStickinessEnabled() {
        return this.sessionStickinessEnabled == null ? Codegen.empty() : this.sessionStickinessEnabled;
    }

    /**
     * Configuration option to adjust session stickiness cookie duration parameter.
     * 
     */
    @Import(name="sessionStickinessLBCookieDurationSeconds")
      private final @Nullable Output<String> sessionStickinessLBCookieDurationSeconds;

    public Output<String> sessionStickinessLBCookieDurationSeconds() {
        return this.sessionStickinessLBCookieDurationSeconds == null ? Codegen.empty() : this.sessionStickinessLBCookieDurationSeconds;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<LoadBalancerTagArgs>> tags;

    public Output<List<LoadBalancerTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LoadBalancerArgs(
        @Nullable Output<List<String>> attachedInstances,
        @Nullable Output<String> healthCheckPath,
        Output<Integer> instancePort,
        @Nullable Output<String> ipAddressType,
        @Nullable Output<String> loadBalancerName,
        @Nullable Output<Boolean> sessionStickinessEnabled,
        @Nullable Output<String> sessionStickinessLBCookieDurationSeconds,
        @Nullable Output<List<LoadBalancerTagArgs>> tags) {
        this.attachedInstances = attachedInstances;
        this.healthCheckPath = healthCheckPath;
        this.instancePort = Objects.requireNonNull(instancePort, "expected parameter 'instancePort' to be non-null");
        this.ipAddressType = ipAddressType;
        this.loadBalancerName = loadBalancerName;
        this.sessionStickinessEnabled = sessionStickinessEnabled;
        this.sessionStickinessLBCookieDurationSeconds = sessionStickinessLBCookieDurationSeconds;
        this.tags = tags;
    }

    private LoadBalancerArgs() {
        this.attachedInstances = Codegen.empty();
        this.healthCheckPath = Codegen.empty();
        this.instancePort = Codegen.empty();
        this.ipAddressType = Codegen.empty();
        this.loadBalancerName = Codegen.empty();
        this.sessionStickinessEnabled = Codegen.empty();
        this.sessionStickinessLBCookieDurationSeconds = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> attachedInstances;
        private @Nullable Output<String> healthCheckPath;
        private Output<Integer> instancePort;
        private @Nullable Output<String> ipAddressType;
        private @Nullable Output<String> loadBalancerName;
        private @Nullable Output<Boolean> sessionStickinessEnabled;
        private @Nullable Output<String> sessionStickinessLBCookieDurationSeconds;
        private @Nullable Output<List<LoadBalancerTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedInstances = defaults.attachedInstances;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.instancePort = defaults.instancePort;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.sessionStickinessEnabled = defaults.sessionStickinessEnabled;
    	      this.sessionStickinessLBCookieDurationSeconds = defaults.sessionStickinessLBCookieDurationSeconds;
    	      this.tags = defaults.tags;
        }

        public Builder attachedInstances(@Nullable Output<List<String>> attachedInstances) {
            this.attachedInstances = attachedInstances;
            return this;
        }
        public Builder attachedInstances(@Nullable List<String> attachedInstances) {
            this.attachedInstances = Codegen.ofNullable(attachedInstances);
            return this;
        }
        public Builder attachedInstances(String... attachedInstances) {
            return attachedInstances(List.of(attachedInstances));
        }
        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public Builder healthCheckPath(@Nullable String healthCheckPath) {
            this.healthCheckPath = Codegen.ofNullable(healthCheckPath);
            return this;
        }
        public Builder instancePort(Output<Integer> instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }
        public Builder instancePort(Integer instancePort) {
            this.instancePort = Output.of(Objects.requireNonNull(instancePort));
            return this;
        }
        public Builder ipAddressType(@Nullable Output<String> ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }
        public Builder ipAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = Codegen.ofNullable(ipAddressType);
            return this;
        }
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Codegen.ofNullable(loadBalancerName);
            return this;
        }
        public Builder sessionStickinessEnabled(@Nullable Output<Boolean> sessionStickinessEnabled) {
            this.sessionStickinessEnabled = sessionStickinessEnabled;
            return this;
        }
        public Builder sessionStickinessEnabled(@Nullable Boolean sessionStickinessEnabled) {
            this.sessionStickinessEnabled = Codegen.ofNullable(sessionStickinessEnabled);
            return this;
        }
        public Builder sessionStickinessLBCookieDurationSeconds(@Nullable Output<String> sessionStickinessLBCookieDurationSeconds) {
            this.sessionStickinessLBCookieDurationSeconds = sessionStickinessLBCookieDurationSeconds;
            return this;
        }
        public Builder sessionStickinessLBCookieDurationSeconds(@Nullable String sessionStickinessLBCookieDurationSeconds) {
            this.sessionStickinessLBCookieDurationSeconds = Codegen.ofNullable(sessionStickinessLBCookieDurationSeconds);
            return this;
        }
        public Builder tags(@Nullable Output<List<LoadBalancerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<LoadBalancerTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(LoadBalancerTagArgs... tags) {
            return tags(List.of(tags));
        }        public LoadBalancerArgs build() {
            return new LoadBalancerArgs(attachedInstances, healthCheckPath, instancePort, ipAddressType, loadBalancerName, sessionStickinessEnabled, sessionStickinessLBCookieDurationSeconds, tags);
        }
    }
}
