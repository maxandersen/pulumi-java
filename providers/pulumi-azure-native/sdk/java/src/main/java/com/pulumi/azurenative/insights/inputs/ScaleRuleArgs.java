// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.MetricTriggerArgs;
import com.pulumi.azurenative.insights.inputs.ScaleActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * A rule that provide the triggers and parameters for the scaling action.
 * 
 */
public final class ScaleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleRuleArgs Empty = new ScaleRuleArgs();

    /**
     * the trigger that results in a scaling action.
     * 
     */
    @Import(name="metricTrigger", required=true)
      private final Output<MetricTriggerArgs> metricTrigger;

    public Output<MetricTriggerArgs> metricTrigger() {
        return this.metricTrigger;
    }

    /**
     * the parameters for the scaling action.
     * 
     */
    @Import(name="scaleAction", required=true)
      private final Output<ScaleActionArgs> scaleAction;

    public Output<ScaleActionArgs> scaleAction() {
        return this.scaleAction;
    }

    public ScaleRuleArgs(
        Output<MetricTriggerArgs> metricTrigger,
        Output<ScaleActionArgs> scaleAction) {
        this.metricTrigger = Objects.requireNonNull(metricTrigger, "expected parameter 'metricTrigger' to be non-null");
        this.scaleAction = Objects.requireNonNull(scaleAction, "expected parameter 'scaleAction' to be non-null");
    }

    private ScaleRuleArgs() {
        this.metricTrigger = Codegen.empty();
        this.scaleAction = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MetricTriggerArgs> metricTrigger;
        private Output<ScaleActionArgs> scaleAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.scaleAction = defaults.scaleAction;
        }

        public Builder metricTrigger(Output<MetricTriggerArgs> metricTrigger) {
            this.metricTrigger = Objects.requireNonNull(metricTrigger);
            return this;
        }
        public Builder metricTrigger(MetricTriggerArgs metricTrigger) {
            this.metricTrigger = Output.of(Objects.requireNonNull(metricTrigger));
            return this;
        }
        public Builder scaleAction(Output<ScaleActionArgs> scaleAction) {
            this.scaleAction = Objects.requireNonNull(scaleAction);
            return this;
        }
        public Builder scaleAction(ScaleActionArgs scaleAction) {
            this.scaleAction = Output.of(Objects.requireNonNull(scaleAction));
            return this;
        }        public ScaleRuleArgs build() {
            return new ScaleRuleArgs(metricTrigger, scaleAction);
        }
    }
}
