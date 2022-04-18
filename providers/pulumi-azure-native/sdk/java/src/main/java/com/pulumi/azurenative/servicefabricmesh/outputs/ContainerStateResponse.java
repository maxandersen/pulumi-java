// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerStateResponse {
    /**
     * Human-readable status of this state.
     * 
     */
    private final @Nullable String detailStatus;
    /**
     * The container exit code.
     * 
     */
    private final @Nullable String exitCode;
    /**
     * Date/time when the container state finished.
     * 
     */
    private final @Nullable String finishTime;
    /**
     * Date/time when the container state started.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The state of this container
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private ContainerStateResponse(
        @CustomType.Parameter("detailStatus") @Nullable String detailStatus,
        @CustomType.Parameter("exitCode") @Nullable String exitCode,
        @CustomType.Parameter("finishTime") @Nullable String finishTime,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("state") @Nullable String state) {
        this.detailStatus = detailStatus;
        this.exitCode = exitCode;
        this.finishTime = finishTime;
        this.startTime = startTime;
        this.state = state;
    }

    /**
     * Human-readable status of this state.
     * 
    */
    public Optional<String> detailStatus() {
        return Optional.ofNullable(this.detailStatus);
    }
    /**
     * The container exit code.
     * 
    */
    public Optional<String> exitCode() {
        return Optional.ofNullable(this.exitCode);
    }
    /**
     * Date/time when the container state finished.
     * 
    */
    public Optional<String> finishTime() {
        return Optional.ofNullable(this.finishTime);
    }
    /**
     * Date/time when the container state started.
     * 
    */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The state of this container
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String detailStatus;
        private @Nullable String exitCode;
        private @Nullable String finishTime;
        private @Nullable String startTime;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detailStatus = defaults.detailStatus;
    	      this.exitCode = defaults.exitCode;
    	      this.finishTime = defaults.finishTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder detailStatus(@Nullable String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public Builder exitCode(@Nullable String exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Builder finishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public ContainerStateResponse build() {
            return new ContainerStateResponse(detailStatus, exitCode, finishTime, startTime, state);
        }
    }
}
