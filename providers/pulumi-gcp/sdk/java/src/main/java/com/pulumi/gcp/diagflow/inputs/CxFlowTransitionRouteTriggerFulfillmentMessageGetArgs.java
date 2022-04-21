// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs Empty = new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text")
    private @Nullable Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text;

    public Optional<Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs() {}

    private CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs $;

        public Builder() {
            $ = new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs();
        }

        public Builder(CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs defaults) {
            $ = new CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder text(@Nullable Output<CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs> text) {
            $.text = text;
            return this;
        }

        public Builder text(CxFlowTransitionRouteTriggerFulfillmentMessageTextGetArgs text) {
            return text(Output.of(text));
        }

        public CxFlowTransitionRouteTriggerFulfillmentMessageGetArgs build() {
            return $;
        }
    }

}
