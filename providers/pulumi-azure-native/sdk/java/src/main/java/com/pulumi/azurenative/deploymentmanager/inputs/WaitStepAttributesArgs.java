// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters for the wait step.
 * 
 */
public final class WaitStepAttributesArgs extends ResourceArgs {

    public static final WaitStepAttributesArgs Empty = new WaitStepAttributesArgs();

    /**
     * The duration in ISO 8601 format of how long the wait should be.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return The duration in ISO 8601 format of how long the wait should be.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    private WaitStepAttributesArgs() {}

    private WaitStepAttributesArgs(WaitStepAttributesArgs $) {
        this.duration = $.duration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitStepAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitStepAttributesArgs $;

        public Builder() {
            $ = new WaitStepAttributesArgs();
        }

        public Builder(WaitStepAttributesArgs defaults) {
            $ = new WaitStepAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The duration in ISO 8601 format of how long the wait should be.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The duration in ISO 8601 format of how long the wait should be.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public WaitStepAttributesArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            return $;
        }
    }

}
