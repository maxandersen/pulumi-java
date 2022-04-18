// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelAction;
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
public final class DetectorModelTransitionEvent extends com.pulumi.resources.InvokeArgs {

    public static final DetectorModelTransitionEvent Empty = new DetectorModelTransitionEvent();

    /**
     * The actions to be performed.
     * 
     */
    @Import(name="actions")
      private final @Nullable List<DetectorModelAction> actions;

    public List<DetectorModelAction> actions() {
        return this.actions == null ? List.of() : this.actions;
    }

    /**
     * A Boolean expression that when `TRUE` causes the `actions` to be performed and the `nextState` to be entered.
     * 
     */
    @Import(name="condition", required=true)
      private final String condition;

    public String condition() {
        return this.condition;
    }

    /**
     * The name of the event.
     * 
     */
    @Import(name="eventName", required=true)
      private final String eventName;

    public String eventName() {
        return this.eventName;
    }

    /**
     * The next state to enter.
     * 
     */
    @Import(name="nextState", required=true)
      private final String nextState;

    public String nextState() {
        return this.nextState;
    }

    public DetectorModelTransitionEvent(
        @Nullable List<DetectorModelAction> actions,
        String condition,
        String eventName,
        String nextState) {
        this.actions = actions;
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.eventName = Objects.requireNonNull(eventName, "expected parameter 'eventName' to be non-null");
        this.nextState = Objects.requireNonNull(nextState, "expected parameter 'nextState' to be non-null");
    }

    private DetectorModelTransitionEvent() {
        this.actions = List.of();
        this.condition = null;
        this.eventName = null;
        this.nextState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelTransitionEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelAction> actions;
        private String condition;
        private String eventName;
        private String nextState;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelTransitionEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.eventName = defaults.eventName;
    	      this.nextState = defaults.nextState;
        }

        public Builder actions(@Nullable List<DetectorModelAction> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(DetectorModelAction... actions) {
            return actions(List.of(actions));
        }
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder eventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }
        public Builder nextState(String nextState) {
            this.nextState = Objects.requireNonNull(nextState);
            return this;
        }        public DetectorModelTransitionEvent build() {
            return new DetectorModelTransitionEvent(actions, condition, eventName, nextState);
        }
    }
}
