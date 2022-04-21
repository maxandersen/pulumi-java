// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.enums.ServiceHealthCheckConfigurationProtocol;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Health check configuration
 * 
 */
public final class ServiceHealthCheckConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final ServiceHealthCheckConfiguration Empty = new ServiceHealthCheckConfiguration();

    /**
     * Health check Healthy Threshold
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Integer healthyThreshold;

    public Optional<Integer> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * Health check Interval
     * 
     */
    @Import(name="interval")
    private @Nullable Integer interval;

    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Health check Path
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Health Check Protocol
     * 
     */
    @Import(name="protocol")
    private @Nullable ServiceHealthCheckConfigurationProtocol protocol;

    public Optional<ServiceHealthCheckConfigurationProtocol> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Health check Timeout
     * 
     */
    @Import(name="timeout")
    private @Nullable Integer timeout;

    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Health check Unhealthy Threshold
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Integer unhealthyThreshold;

    public Optional<Integer> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private ServiceHealthCheckConfiguration() {}

    private ServiceHealthCheckConfiguration(ServiceHealthCheckConfiguration $) {
        this.healthyThreshold = $.healthyThreshold;
        this.interval = $.interval;
        this.path = $.path;
        this.protocol = $.protocol;
        this.timeout = $.timeout;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHealthCheckConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHealthCheckConfiguration $;

        public Builder() {
            $ = new ServiceHealthCheckConfiguration();
        }

        public Builder(ServiceHealthCheckConfiguration defaults) {
            $ = new ServiceHealthCheckConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            $.interval = interval;
            return this;
        }

        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        public Builder protocol(@Nullable ServiceHealthCheckConfigurationProtocol protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder timeout(@Nullable Integer timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public ServiceHealthCheckConfiguration build() {
            return $;
        }
    }

}
