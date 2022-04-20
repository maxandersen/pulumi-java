// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerStateTerminated {
    /**
     * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;
     * 
     */
    private final @Nullable String containerID;
    /**
     * Exit status from the last termination of the container
     * 
     */
    private final Integer exitCode;
    /**
     * Time at which the container last terminated
     * 
     */
    private final @Nullable String finishedAt;
    /**
     * Message regarding the last termination of the container
     * 
     */
    private final @Nullable String message;
    /**
     * (brief) reason from the last termination of the container
     * 
     */
    private final @Nullable String reason;
    /**
     * Signal from the last termination of the container
     * 
     */
    private final @Nullable Integer signal;
    /**
     * Time at which previous execution of the container started
     * 
     */
    private final @Nullable String startedAt;

    @CustomType.Constructor
    private ContainerStateTerminated(
        @CustomType.Parameter("containerID") @Nullable String containerID,
        @CustomType.Parameter("exitCode") Integer exitCode,
        @CustomType.Parameter("finishedAt") @Nullable String finishedAt,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("signal") @Nullable Integer signal,
        @CustomType.Parameter("startedAt") @Nullable String startedAt) {
        this.containerID = containerID;
        this.exitCode = exitCode;
        this.finishedAt = finishedAt;
        this.message = message;
        this.reason = reason;
        this.signal = signal;
        this.startedAt = startedAt;
    }

    /**
     * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;
     * 
    */
    public Optional<String> containerID() {
        return Optional.ofNullable(this.containerID);
    }
    /**
     * Exit status from the last termination of the container
     * 
    */
    public Integer exitCode() {
        return this.exitCode;
    }
    /**
     * Time at which the container last terminated
     * 
    */
    public Optional<String> finishedAt() {
        return Optional.ofNullable(this.finishedAt);
    }
    /**
     * Message regarding the last termination of the container
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * (brief) reason from the last termination of the container
     * 
    */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * Signal from the last termination of the container
     * 
    */
    public Optional<Integer> signal() {
        return Optional.ofNullable(this.signal);
    }
    /**
     * Time at which previous execution of the container started
     * 
    */
    public Optional<String> startedAt() {
        return Optional.ofNullable(this.startedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateTerminated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerID;
        private Integer exitCode;
        private @Nullable String finishedAt;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable Integer signal;
        private @Nullable String startedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateTerminated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerID = defaults.containerID;
    	      this.exitCode = defaults.exitCode;
    	      this.finishedAt = defaults.finishedAt;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.signal = defaults.signal;
    	      this.startedAt = defaults.startedAt;
        }

        public Builder containerID(@Nullable String containerID) {
            this.containerID = containerID;
            return this;
        }
        public Builder exitCode(Integer exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }
        public Builder finishedAt(@Nullable String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder signal(@Nullable Integer signal) {
            this.signal = signal;
            return this;
        }
        public Builder startedAt(@Nullable String startedAt) {
            this.startedAt = startedAt;
            return this;
        }        public ContainerStateTerminated build() {
            return new ContainerStateTerminated(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
        }
    }
}
