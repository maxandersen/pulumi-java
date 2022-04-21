// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the ` actions  `performed and the next `state` entered when a `condition` evaluates to `TRUE`.
 * 
 */
public final class DetectorModelTransitionEventArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelTransitionEventArgs Empty = new DetectorModelTransitionEventArgs();

    /**
     * The actions to be performed.
     * 
     */
    @Import(name="actions")
    private @Nullable Output<List<DetectorModelActionArgs>> actions;

    public Optional<Output<List<DetectorModelActionArgs>>> actions() {
        return Optional.ofNullable(this.actions);
    }

    /**
     * A Boolean expression that when `TRUE` causes the `actions` to be performed and the `nextState` to be entered.
     * 
     */
    @Import(name="condition", required=true)
    private Output<String> condition;

    public Output<String> condition() {
        return this.condition;
    }

    /**
     * The name of the event.
     * 
     */
    @Import(name="eventName", required=true)
    private Output<String> eventName;

    public Output<String> eventName() {
        return this.eventName;
    }

    /**
     * The next state to enter.
     * 
     */
    @Import(name="nextState", required=true)
    private Output<String> nextState;

    public Output<String> nextState() {
        return this.nextState;
    }

    private DetectorModelTransitionEventArgs() {}

    private DetectorModelTransitionEventArgs(DetectorModelTransitionEventArgs $) {
        this.actions = $.actions;
        this.condition = $.condition;
        this.eventName = $.eventName;
        this.nextState = $.nextState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelTransitionEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelTransitionEventArgs $;

        public Builder() {
            $ = new DetectorModelTransitionEventArgs();
        }

        public Builder(DetectorModelTransitionEventArgs defaults) {
            $ = new DetectorModelTransitionEventArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(@Nullable Output<List<DetectorModelActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<DetectorModelActionArgs> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(DetectorModelActionArgs... actions) {
            return actions(List.of(actions));
        }

        public Builder condition(Output<String> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public Builder eventName(Output<String> eventName) {
            $.eventName = eventName;
            return this;
        }

        public Builder eventName(String eventName) {
            return eventName(Output.of(eventName));
        }

        public Builder nextState(Output<String> nextState) {
            $.nextState = nextState;
            return this;
        }

        public Builder nextState(String nextState) {
            return nextState(Output.of(nextState));
        }

        public DetectorModelTransitionEventArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.eventName = Objects.requireNonNull($.eventName, "expected parameter 'eventName' to be non-null");
            $.nextState = Objects.requireNonNull($.nextState, "expected parameter 'nextState' to be non-null");
            return $;
        }
    }

}
