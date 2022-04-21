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
 * Specifies the `actions` to be performed when the `condition` evaluates to `TRUE`.
 * 
 */
public final class DetectorModelEventArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorModelEventArgs Empty = new DetectorModelEventArgs();

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
     * The Boolean expression that, when `TRUE`, causes the `actions` to be performed. If not present, the `actions` are performed (=`TRUE`). If the expression result is not a `Boolean` value, the `actions` are not performed (=`FALSE`).
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
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

    private DetectorModelEventArgs() {}

    private DetectorModelEventArgs(DetectorModelEventArgs $) {
        this.actions = $.actions;
        this.condition = $.condition;
        this.eventName = $.eventName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelEventArgs $;

        public Builder() {
            $ = new DetectorModelEventArgs();
        }

        public Builder(DetectorModelEventArgs defaults) {
            $ = new DetectorModelEventArgs(Objects.requireNonNull(defaults));
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

        public Builder condition(@Nullable Output<String> condition) {
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

        public DetectorModelEventArgs build() {
            $.eventName = Objects.requireNonNull($.eventName, "expected parameter 'eventName' to be non-null");
            return $;
        }
    }

}
