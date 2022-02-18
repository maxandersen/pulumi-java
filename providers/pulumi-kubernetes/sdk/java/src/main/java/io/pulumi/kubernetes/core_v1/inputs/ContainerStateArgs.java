// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateRunningArgs;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateTerminatedArgs;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStateWaitingArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 * 
 */
public final class ContainerStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStateArgs Empty = new ContainerStateArgs();

    /**
     * Details about a running container
     * 
     */
    @InputImport(name="running")
    private final @Nullable Input<ContainerStateRunningArgs> running;

    public Input<ContainerStateRunningArgs> getRunning() {
        return this.running == null ? Input.empty() : this.running;
    }

    /**
     * Details about a terminated container
     * 
     */
    @InputImport(name="terminated")
    private final @Nullable Input<ContainerStateTerminatedArgs> terminated;

    public Input<ContainerStateTerminatedArgs> getTerminated() {
        return this.terminated == null ? Input.empty() : this.terminated;
    }

    /**
     * Details about a waiting container
     * 
     */
    @InputImport(name="waiting")
    private final @Nullable Input<ContainerStateWaitingArgs> waiting;

    public Input<ContainerStateWaitingArgs> getWaiting() {
        return this.waiting == null ? Input.empty() : this.waiting;
    }

    public ContainerStateArgs(
        @Nullable Input<ContainerStateRunningArgs> running,
        @Nullable Input<ContainerStateTerminatedArgs> terminated,
        @Nullable Input<ContainerStateWaitingArgs> waiting) {
        this.running = running;
        this.terminated = terminated;
        this.waiting = waiting;
    }

    private ContainerStateArgs() {
        this.running = Input.empty();
        this.terminated = Input.empty();
        this.waiting = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContainerStateRunningArgs> running;
        private @Nullable Input<ContainerStateTerminatedArgs> terminated;
        private @Nullable Input<ContainerStateWaitingArgs> waiting;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.running = defaults.running;
    	      this.terminated = defaults.terminated;
    	      this.waiting = defaults.waiting;
        }

        public Builder setRunning(@Nullable Input<ContainerStateRunningArgs> running) {
            this.running = running;
            return this;
        }

        public Builder setRunning(@Nullable ContainerStateRunningArgs running) {
            this.running = Input.ofNullable(running);
            return this;
        }

        public Builder setTerminated(@Nullable Input<ContainerStateTerminatedArgs> terminated) {
            this.terminated = terminated;
            return this;
        }

        public Builder setTerminated(@Nullable ContainerStateTerminatedArgs terminated) {
            this.terminated = Input.ofNullable(terminated);
            return this;
        }

        public Builder setWaiting(@Nullable Input<ContainerStateWaitingArgs> waiting) {
            this.waiting = waiting;
            return this;
        }

        public Builder setWaiting(@Nullable ContainerStateWaitingArgs waiting) {
            this.waiting = Input.ofNullable(waiting);
            return this;
        }

        public ContainerStateArgs build() {
            return new ContainerStateArgs(running, terminated, waiting);
        }
    }
}
