// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * The integration account RosettaNet ProcessConfiguration Acknowledgement settings.
 * 
 */
public final class RosettaNetPipAcknowledgmentOfReceiptSettingsArgs extends ResourceArgs {

    public static final RosettaNetPipAcknowledgmentOfReceiptSettingsArgs Empty = new RosettaNetPipAcknowledgmentOfReceiptSettingsArgs();

    /**
     * The non-repudiation is required or not.
     * 
     */
    @Import(name="isNonRepudiationRequired", required=true)
    private Output<Boolean> isNonRepudiationRequired;

    /**
     * @return The non-repudiation is required or not.
     * 
     */
    public Output<Boolean> isNonRepudiationRequired() {
        return this.isNonRepudiationRequired;
    }

    /**
     * The time to acknowledge in seconds.
     * 
     */
    @Import(name="timeToAcknowledgeInSeconds", required=true)
    private Output<Integer> timeToAcknowledgeInSeconds;

    /**
     * @return The time to acknowledge in seconds.
     * 
     */
    public Output<Integer> timeToAcknowledgeInSeconds() {
        return this.timeToAcknowledgeInSeconds;
    }

    private RosettaNetPipAcknowledgmentOfReceiptSettingsArgs() {}

    private RosettaNetPipAcknowledgmentOfReceiptSettingsArgs(RosettaNetPipAcknowledgmentOfReceiptSettingsArgs $) {
        this.isNonRepudiationRequired = $.isNonRepudiationRequired;
        this.timeToAcknowledgeInSeconds = $.timeToAcknowledgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RosettaNetPipAcknowledgmentOfReceiptSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RosettaNetPipAcknowledgmentOfReceiptSettingsArgs $;

        public Builder() {
            $ = new RosettaNetPipAcknowledgmentOfReceiptSettingsArgs();
        }

        public Builder(RosettaNetPipAcknowledgmentOfReceiptSettingsArgs defaults) {
            $ = new RosettaNetPipAcknowledgmentOfReceiptSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isNonRepudiationRequired The non-repudiation is required or not.
         * 
         * @return builder
         * 
         */
        public Builder isNonRepudiationRequired(Output<Boolean> isNonRepudiationRequired) {
            $.isNonRepudiationRequired = isNonRepudiationRequired;
            return this;
        }

        /**
         * @param isNonRepudiationRequired The non-repudiation is required or not.
         * 
         * @return builder
         * 
         */
        public Builder isNonRepudiationRequired(Boolean isNonRepudiationRequired) {
            return isNonRepudiationRequired(Output.of(isNonRepudiationRequired));
        }

        /**
         * @param timeToAcknowledgeInSeconds The time to acknowledge in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeToAcknowledgeInSeconds(Output<Integer> timeToAcknowledgeInSeconds) {
            $.timeToAcknowledgeInSeconds = timeToAcknowledgeInSeconds;
            return this;
        }

        /**
         * @param timeToAcknowledgeInSeconds The time to acknowledge in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeToAcknowledgeInSeconds(Integer timeToAcknowledgeInSeconds) {
            return timeToAcknowledgeInSeconds(Output.of(timeToAcknowledgeInSeconds));
        }

        public RosettaNetPipAcknowledgmentOfReceiptSettingsArgs build() {
            $.isNonRepudiationRequired = Objects.requireNonNull($.isNonRepudiationRequired, "expected parameter 'isNonRepudiationRequired' to be non-null");
            $.timeToAcknowledgeInSeconds = Objects.requireNonNull($.timeToAcknowledgeInSeconds, "expected parameter 'timeToAcknowledgeInSeconds' to be non-null");
            return $;
        }
    }

}
