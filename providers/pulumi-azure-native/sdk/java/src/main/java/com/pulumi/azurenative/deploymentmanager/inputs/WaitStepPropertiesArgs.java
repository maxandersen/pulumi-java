// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.WaitStepAttributesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties of a Wait step.
 * 
 */
public final class WaitStepPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WaitStepPropertiesArgs Empty = new WaitStepPropertiesArgs();

    /**
     * The Wait attributes
     * 
     */
    @Import(name="attributes", required=true)
    private Output<WaitStepAttributesArgs> attributes;

    public Output<WaitStepAttributesArgs> attributes() {
        return this.attributes;
    }

    /**
     * The type of step.
     * Expected value is &#39;Wait&#39;.
     * 
     */
    @Import(name="stepType", required=true)
    private Output<String> stepType;

    public Output<String> stepType() {
        return this.stepType;
    }

    private WaitStepPropertiesArgs() {}

    private WaitStepPropertiesArgs(WaitStepPropertiesArgs $) {
        this.attributes = $.attributes;
        this.stepType = $.stepType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitStepPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitStepPropertiesArgs $;

        public Builder() {
            $ = new WaitStepPropertiesArgs();
        }

        public Builder(WaitStepPropertiesArgs defaults) {
            $ = new WaitStepPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributes(Output<WaitStepAttributesArgs> attributes) {
            $.attributes = attributes;
            return this;
        }

        public Builder attributes(WaitStepAttributesArgs attributes) {
            return attributes(Output.of(attributes));
        }

        public Builder stepType(Output<String> stepType) {
            $.stepType = stepType;
            return this;
        }

        public Builder stepType(String stepType) {
            return stepType(Output.of(stepType));
        }

        public WaitStepPropertiesArgs build() {
            $.attributes = Objects.requireNonNull($.attributes, "expected parameter 'attributes' to be non-null");
            $.stepType = Codegen.stringProp("stepType").output().arg($.stepType).require();
            return $;
        }
    }

}
