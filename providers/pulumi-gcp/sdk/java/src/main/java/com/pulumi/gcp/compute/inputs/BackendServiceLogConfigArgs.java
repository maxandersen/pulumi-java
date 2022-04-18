// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceLogConfigArgs Empty = new BackendServiceLogConfigArgs();

    /**
     * Whether to enable logging for the load balancer traffic served by this backend service.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * This field can only be specified if logging is enabled for this backend service. The value of
     * the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer
     * where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported.
     * The default value is 1.0.
     * 
     */
    @Import(name="sampleRate")
      private final @Nullable Output<Double> sampleRate;

    public Output<Double> sampleRate() {
        return this.sampleRate == null ? Codegen.empty() : this.sampleRate;
    }

    public BackendServiceLogConfigArgs(
        @Nullable Output<Boolean> enable,
        @Nullable Output<Double> sampleRate) {
        this.enable = enable;
        this.sampleRate = sampleRate;
    }

    private BackendServiceLogConfigArgs() {
        this.enable = Codegen.empty();
        this.sampleRate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<Double> sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder sampleRate(@Nullable Output<Double> sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Builder sampleRate(@Nullable Double sampleRate) {
            this.sampleRate = Codegen.ofNullable(sampleRate);
            return this;
        }        public BackendServiceLogConfigArgs build() {
            return new BackendServiceLogConfigArgs(enable, sampleRate);
        }
    }
}
