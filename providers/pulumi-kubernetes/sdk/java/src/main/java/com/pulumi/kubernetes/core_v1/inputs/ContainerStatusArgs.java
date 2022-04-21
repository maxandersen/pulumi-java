// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ContainerStateArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ContainerStatus contains details for the current status of this container.
 * 
 */
public final class ContainerStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerStatusArgs Empty = new ContainerStatusArgs();

    /**
     * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;.
     * 
     */
    @Import(name="containerID")
    private @Nullable Output<String> containerID;

    public Optional<Output<String>> containerID() {
        return Optional.ofNullable(this.containerID);
    }

    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    public Output<String> image() {
        return this.image;
    }

    /**
     * ImageID of the container&#39;s image.
     * 
     */
    @Import(name="imageID", required=true)
    private Output<String> imageID;

    public Output<String> imageID() {
        return this.imageID;
    }

    /**
     * Details about the container&#39;s last termination condition.
     * 
     */
    @Import(name="lastState")
    private @Nullable Output<ContainerStateArgs> lastState;

    public Optional<Output<ContainerStateArgs>> lastState() {
        return Optional.ofNullable(this.lastState);
    }

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies whether the container has passed its readiness probe.
     * 
     */
    @Import(name="ready", required=true)
    private Output<Boolean> ready;

    public Output<Boolean> ready() {
        return this.ready;
    }

    /**
     * The number of times the container has been restarted.
     * 
     */
    @Import(name="restartCount", required=true)
    private Output<Integer> restartCount;

    public Output<Integer> restartCount() {
        return this.restartCount;
    }

    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     * 
     */
    @Import(name="started")
    private @Nullable Output<Boolean> started;

    public Optional<Output<Boolean>> started() {
        return Optional.ofNullable(this.started);
    }

    /**
     * Details about the container&#39;s current condition.
     * 
     */
    @Import(name="state")
    private @Nullable Output<ContainerStateArgs> state;

    public Optional<Output<ContainerStateArgs>> state() {
        return Optional.ofNullable(this.state);
    }

    private ContainerStatusArgs() {}

    private ContainerStatusArgs(ContainerStatusArgs $) {
        this.containerID = $.containerID;
        this.image = $.image;
        this.imageID = $.imageID;
        this.lastState = $.lastState;
        this.name = $.name;
        this.ready = $.ready;
        this.restartCount = $.restartCount;
        this.started = $.started;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStatusArgs $;

        public Builder() {
            $ = new ContainerStatusArgs();
        }

        public Builder(ContainerStatusArgs defaults) {
            $ = new ContainerStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerID(@Nullable Output<String> containerID) {
            $.containerID = containerID;
            return this;
        }

        public Builder containerID(String containerID) {
            return containerID(Output.of(containerID));
        }

        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder imageID(Output<String> imageID) {
            $.imageID = imageID;
            return this;
        }

        public Builder imageID(String imageID) {
            return imageID(Output.of(imageID));
        }

        public Builder lastState(@Nullable Output<ContainerStateArgs> lastState) {
            $.lastState = lastState;
            return this;
        }

        public Builder lastState(ContainerStateArgs lastState) {
            return lastState(Output.of(lastState));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder ready(Output<Boolean> ready) {
            $.ready = ready;
            return this;
        }

        public Builder ready(Boolean ready) {
            return ready(Output.of(ready));
        }

        public Builder restartCount(Output<Integer> restartCount) {
            $.restartCount = restartCount;
            return this;
        }

        public Builder restartCount(Integer restartCount) {
            return restartCount(Output.of(restartCount));
        }

        public Builder started(@Nullable Output<Boolean> started) {
            $.started = started;
            return this;
        }

        public Builder started(Boolean started) {
            return started(Output.of(started));
        }

        public Builder state(@Nullable Output<ContainerStateArgs> state) {
            $.state = state;
            return this;
        }

        public Builder state(ContainerStateArgs state) {
            return state(Output.of(state));
        }

        public ContainerStatusArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.imageID = Objects.requireNonNull($.imageID, "expected parameter 'imageID' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.ready = Objects.requireNonNull($.ready, "expected parameter 'ready' to be non-null");
            $.restartCount = Objects.requireNonNull($.restartCount, "expected parameter 'restartCount' to be non-null");
            return $;
        }
    }

}
