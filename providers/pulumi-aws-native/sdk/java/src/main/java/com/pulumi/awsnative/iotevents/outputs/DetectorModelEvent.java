// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.DetectorModelAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelEvent {
    /**
     * @return The actions to be performed.
     * 
     */
    private final @Nullable List<DetectorModelAction> actions;
    /**
     * @return The Boolean expression that, when `TRUE`, causes the `actions` to be performed. If not present, the `actions` are performed (=`TRUE`). If the expression result is not a `Boolean` value, the `actions` are not performed (=`FALSE`).
     * 
     */
    private final @Nullable String condition;
    /**
     * @return The name of the event.
     * 
     */
    private final String eventName;

    @CustomType.Constructor
    private DetectorModelEvent(
        @CustomType.Parameter("actions") @Nullable List<DetectorModelAction> actions,
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("eventName") String eventName) {
        this.actions = actions;
        this.condition = condition;
        this.eventName = eventName;
    }

    /**
     * @return The actions to be performed.
     * 
     */
    public List<DetectorModelAction> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * @return The Boolean expression that, when `TRUE`, causes the `actions` to be performed. If not present, the `actions` are performed (=`TRUE`). If the expression result is not a `Boolean` value, the `actions` are not performed (=`FALSE`).
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The name of the event.
     * 
     */
    public String eventName() {
        return this.eventName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelAction> actions;
        private @Nullable String condition;
        private String eventName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.eventName = defaults.eventName;
        }

        public Builder actions(@Nullable List<DetectorModelAction> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(DetectorModelAction... actions) {
            return actions(List.of(actions));
        }
        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder eventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }        public DetectorModelEvent build() {
            return new DetectorModelEvent(actions, condition, eventName);
        }
    }
}
