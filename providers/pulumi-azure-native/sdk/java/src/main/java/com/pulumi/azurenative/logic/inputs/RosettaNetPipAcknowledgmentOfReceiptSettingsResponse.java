// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * The integration account RosettaNet ProcessConfiguration Acknowledgement settings.
 * 
 */
public final class RosettaNetPipAcknowledgmentOfReceiptSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RosettaNetPipAcknowledgmentOfReceiptSettingsResponse Empty = new RosettaNetPipAcknowledgmentOfReceiptSettingsResponse();

    /**
     * The non-repudiation is required or not.
     * 
     */
    @Import(name="isNonRepudiationRequired", required=true)
      private final Boolean isNonRepudiationRequired;

    public Boolean isNonRepudiationRequired() {
        return this.isNonRepudiationRequired;
    }

    /**
     * The time to acknowledge in seconds.
     * 
     */
    @Import(name="timeToAcknowledgeInSeconds", required=true)
      private final Integer timeToAcknowledgeInSeconds;

    public Integer timeToAcknowledgeInSeconds() {
        return this.timeToAcknowledgeInSeconds;
    }

    public RosettaNetPipAcknowledgmentOfReceiptSettingsResponse(
        Boolean isNonRepudiationRequired,
        Integer timeToAcknowledgeInSeconds) {
        this.isNonRepudiationRequired = Objects.requireNonNull(isNonRepudiationRequired, "expected parameter 'isNonRepudiationRequired' to be non-null");
        this.timeToAcknowledgeInSeconds = Objects.requireNonNull(timeToAcknowledgeInSeconds, "expected parameter 'timeToAcknowledgeInSeconds' to be non-null");
    }

    private RosettaNetPipAcknowledgmentOfReceiptSettingsResponse() {
        this.isNonRepudiationRequired = null;
        this.timeToAcknowledgeInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipAcknowledgmentOfReceiptSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isNonRepudiationRequired;
        private Integer timeToAcknowledgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipAcknowledgmentOfReceiptSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isNonRepudiationRequired = defaults.isNonRepudiationRequired;
    	      this.timeToAcknowledgeInSeconds = defaults.timeToAcknowledgeInSeconds;
        }

        public Builder isNonRepudiationRequired(Boolean isNonRepudiationRequired) {
            this.isNonRepudiationRequired = Objects.requireNonNull(isNonRepudiationRequired);
            return this;
        }
        public Builder timeToAcknowledgeInSeconds(Integer timeToAcknowledgeInSeconds) {
            this.timeToAcknowledgeInSeconds = Objects.requireNonNull(timeToAcknowledgeInSeconds);
            return this;
        }        public RosettaNetPipAcknowledgmentOfReceiptSettingsResponse build() {
            return new RosettaNetPipAcknowledgmentOfReceiptSettingsResponse(isNonRepudiationRequired, timeToAcknowledgeInSeconds);
        }
    }
}
