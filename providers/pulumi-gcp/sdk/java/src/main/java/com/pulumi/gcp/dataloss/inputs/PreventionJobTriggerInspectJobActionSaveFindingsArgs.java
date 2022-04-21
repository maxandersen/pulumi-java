// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobActionSaveFindingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionSaveFindingsArgs Empty = new PreventionJobTriggerInspectJobActionSaveFindingsArgs();

    /**
     * Information on where to store output
     * Structure is documented below.
     * 
     */
    @Import(name="outputConfig", required=true)
    private Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig;

    public Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig() {
        return this.outputConfig;
    }

    private PreventionJobTriggerInspectJobActionSaveFindingsArgs() {}

    private PreventionJobTriggerInspectJobActionSaveFindingsArgs(PreventionJobTriggerInspectJobActionSaveFindingsArgs $) {
        this.outputConfig = $.outputConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobActionSaveFindingsArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobActionSaveFindingsArgs();
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsArgs defaults) {
            $ = new PreventionJobTriggerInspectJobActionSaveFindingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder outputConfig(Output<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs> outputConfig) {
            $.outputConfig = outputConfig;
            return this;
        }

        public Builder outputConfig(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs outputConfig) {
            return outputConfig(Output.of(outputConfig));
        }

        public PreventionJobTriggerInspectJobActionSaveFindingsArgs build() {
            $.outputConfig = Objects.requireNonNull($.outputConfig, "expected parameter 'outputConfig' to be non-null");
            return $;
        }
    }

}
