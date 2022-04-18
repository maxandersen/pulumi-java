// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryRunConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CanaryRunConfigArgs Empty = new CanaryRunConfigArgs();

    /**
     * Whether this canary is to use active AWS X-Ray tracing when it runs. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
     * 
     */
    @Import(name="activeTracing")
      private final @Nullable Output<Boolean> activeTracing;

    public Output<Boolean> activeTracing() {
        return this.activeTracing == null ? Codegen.empty() : this.activeTracing;
    }

    /**
     * Maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
     * 
     */
    @Import(name="memoryInMb")
      private final @Nullable Output<Integer> memoryInMb;

    public Output<Integer> memoryInMb() {
        return this.memoryInMb == null ? Codegen.empty() : this.memoryInMb;
    }

    /**
     * Number of seconds the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used, up to a maximum of 840 (14 minutes).
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Output<Integer> timeoutInSeconds;

    public Output<Integer> timeoutInSeconds() {
        return this.timeoutInSeconds == null ? Codegen.empty() : this.timeoutInSeconds;
    }

    public CanaryRunConfigArgs(
        @Nullable Output<Boolean> activeTracing,
        @Nullable Output<Integer> memoryInMb,
        @Nullable Output<Integer> timeoutInSeconds) {
        this.activeTracing = activeTracing;
        this.memoryInMb = memoryInMb;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private CanaryRunConfigArgs() {
        this.activeTracing = Codegen.empty();
        this.memoryInMb = Codegen.empty();
        this.timeoutInSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryRunConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> activeTracing;
        private @Nullable Output<Integer> memoryInMb;
        private @Nullable Output<Integer> timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryRunConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTracing = defaults.activeTracing;
    	      this.memoryInMb = defaults.memoryInMb;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder activeTracing(@Nullable Output<Boolean> activeTracing) {
            this.activeTracing = activeTracing;
            return this;
        }
        public Builder activeTracing(@Nullable Boolean activeTracing) {
            this.activeTracing = Codegen.ofNullable(activeTracing);
            return this;
        }
        public Builder memoryInMb(@Nullable Output<Integer> memoryInMb) {
            this.memoryInMb = memoryInMb;
            return this;
        }
        public Builder memoryInMb(@Nullable Integer memoryInMb) {
            this.memoryInMb = Codegen.ofNullable(memoryInMb);
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Codegen.ofNullable(timeoutInSeconds);
            return this;
        }        public CanaryRunConfigArgs build() {
            return new CanaryRunConfigArgs(activeTracing, memoryInMb, timeoutInSeconds);
        }
    }
}
