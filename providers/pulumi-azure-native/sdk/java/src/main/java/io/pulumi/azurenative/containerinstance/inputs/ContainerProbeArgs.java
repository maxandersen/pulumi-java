// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ContainerExecArgs;
import io.pulumi.azurenative.containerinstance.inputs.ContainerHttpGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The container probe, for liveness or readiness
 * 
 */
public final class ContainerProbeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerProbeArgs Empty = new ContainerProbeArgs();

    /**
     * The execution command to probe
     * 
     */
    @Import(name="exec")
      private final @Nullable Output<ContainerExecArgs> exec;

    public Output<ContainerExecArgs> exec() {
        return this.exec == null ? Codegen.empty() : this.exec;
    }

    /**
     * The failure threshold.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Output<Integer> failureThreshold;

    public Output<Integer> failureThreshold() {
        return this.failureThreshold == null ? Codegen.empty() : this.failureThreshold;
    }

    /**
     * The Http Get settings to probe
     * 
     */
    @Import(name="httpGet")
      private final @Nullable Output<ContainerHttpGetArgs> httpGet;

    public Output<ContainerHttpGetArgs> httpGet() {
        return this.httpGet == null ? Codegen.empty() : this.httpGet;
    }

    /**
     * The initial delay seconds.
     * 
     */
    @Import(name="initialDelaySeconds")
      private final @Nullable Output<Integer> initialDelaySeconds;

    public Output<Integer> initialDelaySeconds() {
        return this.initialDelaySeconds == null ? Codegen.empty() : this.initialDelaySeconds;
    }

    /**
     * The period seconds.
     * 
     */
    @Import(name="periodSeconds")
      private final @Nullable Output<Integer> periodSeconds;

    public Output<Integer> periodSeconds() {
        return this.periodSeconds == null ? Codegen.empty() : this.periodSeconds;
    }

    /**
     * The success threshold.
     * 
     */
    @Import(name="successThreshold")
      private final @Nullable Output<Integer> successThreshold;

    public Output<Integer> successThreshold() {
        return this.successThreshold == null ? Codegen.empty() : this.successThreshold;
    }

    /**
     * The timeout seconds.
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Output<Integer> timeoutSeconds;

    public Output<Integer> timeoutSeconds() {
        return this.timeoutSeconds == null ? Codegen.empty() : this.timeoutSeconds;
    }

    public ContainerProbeArgs(
        @Nullable Output<ContainerExecArgs> exec,
        @Nullable Output<Integer> failureThreshold,
        @Nullable Output<ContainerHttpGetArgs> httpGet,
        @Nullable Output<Integer> initialDelaySeconds,
        @Nullable Output<Integer> periodSeconds,
        @Nullable Output<Integer> successThreshold,
        @Nullable Output<Integer> timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    private ContainerProbeArgs() {
        this.exec = Codegen.empty();
        this.failureThreshold = Codegen.empty();
        this.httpGet = Codegen.empty();
        this.initialDelaySeconds = Codegen.empty();
        this.periodSeconds = Codegen.empty();
        this.successThreshold = Codegen.empty();
        this.timeoutSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerExecArgs> exec;
        private @Nullable Output<Integer> failureThreshold;
        private @Nullable Output<ContainerHttpGetArgs> httpGet;
        private @Nullable Output<Integer> initialDelaySeconds;
        private @Nullable Output<Integer> periodSeconds;
        private @Nullable Output<Integer> successThreshold;
        private @Nullable Output<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerProbeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder exec(@Nullable Output<ContainerExecArgs> exec) {
            this.exec = exec;
            return this;
        }
        public Builder exec(@Nullable ContainerExecArgs exec) {
            this.exec = Codegen.ofNullable(exec);
            return this;
        }
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Codegen.ofNullable(failureThreshold);
            return this;
        }
        public Builder httpGet(@Nullable Output<ContainerHttpGetArgs> httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public Builder httpGet(@Nullable ContainerHttpGetArgs httpGet) {
            this.httpGet = Codegen.ofNullable(httpGet);
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Builder initialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = Codegen.ofNullable(initialDelaySeconds);
            return this;
        }
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Builder periodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = Codegen.ofNullable(periodSeconds);
            return this;
        }
        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = Codegen.ofNullable(successThreshold);
            return this;
        }
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Codegen.ofNullable(timeoutSeconds);
            return this;
        }        public ContainerProbeArgs build() {
            return new ContainerProbeArgs(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
