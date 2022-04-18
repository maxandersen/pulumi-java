// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetGroupHealthCheck {
    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
     * 
     */
    private final @Nullable Integer healthyThreshold;
    /**
     * Approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * Response codes to use when checking for a healthy responses from a target. You can specify multiple values (for example, "200,202" for HTTP(s) or "0,12" for GRPC) or a range of values (for example, "200-299" or "0-99"). Required for HTTP/HTTPS/GRPC ALB. Only applies to Application Load Balancers (i.e., HTTP/HTTPS/GRPC) not Network Load Balancers (i.e., TCP).
     * 
     */
    private final @Nullable String matcher;
    /**
     * Destination for the health check request. Required for HTTP/HTTPS ALB and HTTP NLB. Only applies to HTTP/HTTPS.
     * 
     */
    private final @Nullable String path;
    /**
     * Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
     */
    private final @Nullable String port;
    /**
     * Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
     */
    private final @Nullable String protocol;
    /**
     * Amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * Number of consecutive health check failures required before considering the target unhealthy. For Network Load Balancers, this value must be the same as the `healthy_threshold`. Defaults to 3.
     * 
     */
    private final @Nullable Integer unhealthyThreshold;

    @CustomType.Constructor
    private TargetGroupHealthCheck(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("healthyThreshold") @Nullable Integer healthyThreshold,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("matcher") @Nullable String matcher,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("port") @Nullable String port,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("unhealthyThreshold") @Nullable Integer unhealthyThreshold) {
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

    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
     * 
    */
    public Optional<Integer> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }
    /**
     * Approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
     * 
    */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * Response codes to use when checking for a healthy responses from a target. You can specify multiple values (for example, "200,202" for HTTP(s) or "0,12" for GRPC) or a range of values (for example, "200-299" or "0-99"). Required for HTTP/HTTPS/GRPC ALB. Only applies to Application Load Balancers (i.e., HTTP/HTTPS/GRPC) not Network Load Balancers (i.e., TCP).
     * 
    */
    public Optional<String> matcher() {
        return Optional.ofNullable(this.matcher);
    }
    /**
     * Destination for the health check request. Required for HTTP/HTTPS ALB and HTTP NLB. Only applies to HTTP/HTTPS.
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
    */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
     * 
    */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Number of consecutive health check failures required before considering the target unhealthy. For Network Load Balancers, this value must be the same as the `healthy_threshold`. Defaults to 3.
     * 
    */
    public Optional<Integer> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer interval;
        private @Nullable String matcher;
        private @Nullable String path;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable Integer timeout;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupHealthCheck defaults) {
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

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder matcher(@Nullable String matcher) {
            this.matcher = matcher;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }        public TargetGroupHealthCheck build() {
            return new TargetGroupHealthCheck(enabled, healthyThreshold, interval, matcher, path, port, protocol, timeout, unhealthyThreshold);
        }
    }
}
