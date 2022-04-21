// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceLogConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceLogConfigGetArgs Empty = new BackendServiceLogConfigGetArgs();

    /**
     * Whether to enable logging for the load balancer traffic served by this backend service.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
     * where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
     * The default value is 1.0.
     * 
     */
    @Import(name="sampleRate")
    private @Nullable Output<Double> sampleRate;

    public Optional<Output<Double>> sampleRate() {
        return Optional.ofNullable(this.sampleRate);
    }

    private BackendServiceLogConfigGetArgs() {}

    private BackendServiceLogConfigGetArgs(BackendServiceLogConfigGetArgs $) {
        this.enable = $.enable;
        this.sampleRate = $.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceLogConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceLogConfigGetArgs $;

        public Builder() {
            $ = new BackendServiceLogConfigGetArgs();
        }

        public Builder(BackendServiceLogConfigGetArgs defaults) {
            $ = new BackendServiceLogConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder sampleRate(@Nullable Output<Double> sampleRate) {
            $.sampleRate = sampleRate;
            return this;
        }

        public Builder sampleRate(Double sampleRate) {
            return sampleRate(Output.of(sampleRate));
        }

        public BackendServiceLogConfigGetArgs build() {
            return $;
        }
    }

}
