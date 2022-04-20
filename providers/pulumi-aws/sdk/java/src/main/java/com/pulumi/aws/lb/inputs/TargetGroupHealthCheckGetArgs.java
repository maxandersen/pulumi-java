// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupHealthCheckGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetGroupHealthCheckGetArgs Empty = new TargetGroupHealthCheckGetArgs();

    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> healthyThreshold() {
        return this.healthyThreshold == null ? Codegen.empty() : this.healthyThreshold;
    }

    /**
     * Approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<Integer> interval;

    public Output<Integer> interval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    /**
     * Response codes to use when checking for a healthy responses from a target. You can specify multiple values (for example, &#34;200,202&#34; for HTTP(s) or &#34;0,12&#34; for GRPC) or a range of values (for example, &#34;200-299&#34; or &#34;0-99&#34;). Required for HTTP/HTTPS/GRPC ALB. Only applies to Application Load Balancers (i.e., HTTP/HTTPS/GRPC) not Network Load Balancers (i.e., TCP).
     * 
     */
    @Import(name="matcher")
      private final @Nullable Output<String> matcher;

    public Output<String> matcher() {
        return this.matcher == null ? Codegen.empty() : this.matcher;
    }

    /**
     * Destination for the health check request. Required for HTTP/HTTPS ALB and HTTP NLB. Only applies to HTTP/HTTPS.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<String> port;

    public Output<String> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * Amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * Number of consecutive health check failures required before considering the target unhealthy. For Network Load Balancers, this value must be the same as the `healthy_threshold`. Defaults to 3.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> unhealthyThreshold() {
        return this.unhealthyThreshold == null ? Codegen.empty() : this.unhealthyThreshold;
    }

    public TargetGroupHealthCheckGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> healthyThreshold,
        @Nullable Output<Integer> interval,
        @Nullable Output<String> matcher,
        @Nullable Output<String> path,
        @Nullable Output<String> port,
        @Nullable Output<String> protocol,
        @Nullable Output<Integer> timeout,
        @Nullable Output<Integer> unhealthyThreshold) {
        this.enabled = enabled;
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.matcher = matcher;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private TargetGroupHealthCheckGetArgs() {
        this.enabled = Codegen.empty();
        this.healthyThreshold = Codegen.empty();
        this.interval = Codegen.empty();
        this.matcher = Codegen.empty();
        this.path = Codegen.empty();
        this.port = Codegen.empty();
        this.protocol = Codegen.empty();
        this.timeout = Codegen.empty();
        this.unhealthyThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupHealthCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> healthyThreshold;
        private @Nullable Output<Integer> interval;
        private @Nullable Output<String> matcher;
        private @Nullable Output<String> path;
        private @Nullable Output<String> port;
        private @Nullable Output<String> protocol;
        private @Nullable Output<Integer> timeout;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupHealthCheckGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.matcher = defaults.matcher;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Codegen.ofNullable(healthyThreshold);
            return this;
        }
        public Builder interval(@Nullable Output<Integer> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }
        public Builder matcher(@Nullable Output<String> matcher) {
            this.matcher = matcher;
            return this;
        }
        public Builder matcher(@Nullable String matcher) {
            this.matcher = Codegen.ofNullable(matcher);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder port(@Nullable Output<String> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable String port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Codegen.ofNullable(unhealthyThreshold);
            return this;
        }        public TargetGroupHealthCheckGetArgs build() {
            return new TargetGroupHealthCheckGetArgs(enabled, healthyThreshold, interval, matcher, path, port, protocol, timeout, unhealthyThreshold);
        }
    }
}
