// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTargetGroupHealthCheck {
    private final Boolean enabled;
    private final Integer healthyThreshold;
    private final Integer interval;
    private final String matcher;
    private final String path;
    private final String port;
    private final String protocol;
    private final Integer timeout;
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private GetTargetGroupHealthCheck(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @CustomType.Parameter("interval") Integer interval,
        @CustomType.Parameter("matcher") String matcher,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("timeout") Integer timeout,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
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

    public Boolean enabled() {
        return this.enabled;
    }
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    public Integer interval() {
        return this.interval;
    }
    public String matcher() {
        return this.matcher;
    }
    public String path() {
        return this.path;
    }
    public String port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public Integer timeout() {
        return this.timeout;
    }
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Integer healthyThreshold;
        private Integer interval;
        private String matcher;
        private String path;
        private String port;
        private String protocol;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupHealthCheck defaults) {
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

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder matcher(String matcher) {
            this.matcher = Objects.requireNonNull(matcher);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public GetTargetGroupHealthCheck build() {
            return new GetTargetGroupHealthCheck(enabled, healthyThreshold, interval, matcher, path, port, protocol, timeout, unhealthyThreshold);
        }
    }
}
