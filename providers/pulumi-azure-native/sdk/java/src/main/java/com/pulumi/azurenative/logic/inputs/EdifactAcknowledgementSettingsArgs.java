// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact agreement acknowledgement settings.
 * 
 */
public final class EdifactAcknowledgementSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactAcknowledgementSettingsArgs Empty = new EdifactAcknowledgementSettingsArgs();

    /**
     * The acknowledgement control number lower bound.
     * 
     */
    @Import(name="acknowledgementControlNumberLowerBound", required=true)
    private Output<Integer> acknowledgementControlNumberLowerBound;

    public Output<Integer> acknowledgementControlNumberLowerBound() {
        return this.acknowledgementControlNumberLowerBound;
    }

    /**
     * The acknowledgement control number prefix.
     * 
     */
    @Import(name="acknowledgementControlNumberPrefix")
    private @Nullable Output<String> acknowledgementControlNumberPrefix;

    public Optional<Output<String>> acknowledgementControlNumberPrefix() {
        return Optional.ofNullable(this.acknowledgementControlNumberPrefix);
    }

    /**
     * The acknowledgement control number suffix.
     * 
     */
    @Import(name="acknowledgementControlNumberSuffix")
    private @Nullable Output<String> acknowledgementControlNumberSuffix;

    public Optional<Output<String>> acknowledgementControlNumberSuffix() {
        return Optional.ofNullable(this.acknowledgementControlNumberSuffix);
    }

    /**
     * The acknowledgement control number upper bound.
     * 
     */
    @Import(name="acknowledgementControlNumberUpperBound", required=true)
    private Output<Integer> acknowledgementControlNumberUpperBound;

    public Output<Integer> acknowledgementControlNumberUpperBound() {
        return this.acknowledgementControlNumberUpperBound;
    }

    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
     */
    @Import(name="batchFunctionalAcknowledgements", required=true)
    private Output<Boolean> batchFunctionalAcknowledgements;

    public Output<Boolean> batchFunctionalAcknowledgements() {
        return this.batchFunctionalAcknowledgements;
    }

    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
     */
    @Import(name="batchTechnicalAcknowledgements", required=true)
    private Output<Boolean> batchTechnicalAcknowledgements;

    public Output<Boolean> batchTechnicalAcknowledgements() {
        return this.batchTechnicalAcknowledgements;
    }

    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
     */
    @Import(name="needFunctionalAcknowledgement", required=true)
    private Output<Boolean> needFunctionalAcknowledgement;

    public Output<Boolean> needFunctionalAcknowledgement() {
        return this.needFunctionalAcknowledgement;
    }

    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
     */
    @Import(name="needLoopForValidMessages", required=true)
    private Output<Boolean> needLoopForValidMessages;

    public Output<Boolean> needLoopForValidMessages() {
        return this.needLoopForValidMessages;
    }

    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
     */
    @Import(name="needTechnicalAcknowledgement", required=true)
    private Output<Boolean> needTechnicalAcknowledgement;

    public Output<Boolean> needTechnicalAcknowledgement() {
        return this.needTechnicalAcknowledgement;
    }

    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
     */
    @Import(name="rolloverAcknowledgementControlNumber", required=true)
    private Output<Boolean> rolloverAcknowledgementControlNumber;

    public Output<Boolean> rolloverAcknowledgementControlNumber() {
        return this.rolloverAcknowledgementControlNumber;
    }

    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
     */
    @Import(name="sendSynchronousAcknowledgement", required=true)
    private Output<Boolean> sendSynchronousAcknowledgement;

    public Output<Boolean> sendSynchronousAcknowledgement() {
        return this.sendSynchronousAcknowledgement;
    }

    private EdifactAcknowledgementSettingsArgs() {}

    private EdifactAcknowledgementSettingsArgs(EdifactAcknowledgementSettingsArgs $) {
        this.acknowledgementControlNumberLowerBound = $.acknowledgementControlNumberLowerBound;
        this.acknowledgementControlNumberPrefix = $.acknowledgementControlNumberPrefix;
        this.acknowledgementControlNumberSuffix = $.acknowledgementControlNumberSuffix;
        this.acknowledgementControlNumberUpperBound = $.acknowledgementControlNumberUpperBound;
        this.batchFunctionalAcknowledgements = $.batchFunctionalAcknowledgements;
        this.batchTechnicalAcknowledgements = $.batchTechnicalAcknowledgements;
        this.needFunctionalAcknowledgement = $.needFunctionalAcknowledgement;
        this.needLoopForValidMessages = $.needLoopForValidMessages;
        this.needTechnicalAcknowledgement = $.needTechnicalAcknowledgement;
        this.rolloverAcknowledgementControlNumber = $.rolloverAcknowledgementControlNumber;
        this.sendSynchronousAcknowledgement = $.sendSynchronousAcknowledgement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactAcknowledgementSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactAcknowledgementSettingsArgs $;

        public Builder() {
            $ = new EdifactAcknowledgementSettingsArgs();
        }

        public Builder(EdifactAcknowledgementSettingsArgs defaults) {
            $ = new EdifactAcknowledgementSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder acknowledgementControlNumberLowerBound(Output<Integer> acknowledgementControlNumberLowerBound) {
            $.acknowledgementControlNumberLowerBound = acknowledgementControlNumberLowerBound;
            return this;
        }

        public Builder acknowledgementControlNumberLowerBound(Integer acknowledgementControlNumberLowerBound) {
            return acknowledgementControlNumberLowerBound(Output.of(acknowledgementControlNumberLowerBound));
        }

        public Builder acknowledgementControlNumberPrefix(@Nullable Output<String> acknowledgementControlNumberPrefix) {
            $.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
            return this;
        }

        public Builder acknowledgementControlNumberPrefix(String acknowledgementControlNumberPrefix) {
            return acknowledgementControlNumberPrefix(Output.of(acknowledgementControlNumberPrefix));
        }

        public Builder acknowledgementControlNumberSuffix(@Nullable Output<String> acknowledgementControlNumberSuffix) {
            $.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
            return this;
        }

        public Builder acknowledgementControlNumberSuffix(String acknowledgementControlNumberSuffix) {
            return acknowledgementControlNumberSuffix(Output.of(acknowledgementControlNumberSuffix));
        }

        public Builder acknowledgementControlNumberUpperBound(Output<Integer> acknowledgementControlNumberUpperBound) {
            $.acknowledgementControlNumberUpperBound = acknowledgementControlNumberUpperBound;
            return this;
        }

        public Builder acknowledgementControlNumberUpperBound(Integer acknowledgementControlNumberUpperBound) {
            return acknowledgementControlNumberUpperBound(Output.of(acknowledgementControlNumberUpperBound));
        }

        public Builder batchFunctionalAcknowledgements(Output<Boolean> batchFunctionalAcknowledgements) {
            $.batchFunctionalAcknowledgements = batchFunctionalAcknowledgements;
            return this;
        }

        public Builder batchFunctionalAcknowledgements(Boolean batchFunctionalAcknowledgements) {
            return batchFunctionalAcknowledgements(Output.of(batchFunctionalAcknowledgements));
        }

        public Builder batchTechnicalAcknowledgements(Output<Boolean> batchTechnicalAcknowledgements) {
            $.batchTechnicalAcknowledgements = batchTechnicalAcknowledgements;
            return this;
        }

        public Builder batchTechnicalAcknowledgements(Boolean batchTechnicalAcknowledgements) {
            return batchTechnicalAcknowledgements(Output.of(batchTechnicalAcknowledgements));
        }

        public Builder needFunctionalAcknowledgement(Output<Boolean> needFunctionalAcknowledgement) {
            $.needFunctionalAcknowledgement = needFunctionalAcknowledgement;
            return this;
        }

        public Builder needFunctionalAcknowledgement(Boolean needFunctionalAcknowledgement) {
            return needFunctionalAcknowledgement(Output.of(needFunctionalAcknowledgement));
        }

        public Builder needLoopForValidMessages(Output<Boolean> needLoopForValidMessages) {
            $.needLoopForValidMessages = needLoopForValidMessages;
            return this;
        }

        public Builder needLoopForValidMessages(Boolean needLoopForValidMessages) {
            return needLoopForValidMessages(Output.of(needLoopForValidMessages));
        }

        public Builder needTechnicalAcknowledgement(Output<Boolean> needTechnicalAcknowledgement) {
            $.needTechnicalAcknowledgement = needTechnicalAcknowledgement;
            return this;
        }

        public Builder needTechnicalAcknowledgement(Boolean needTechnicalAcknowledgement) {
            return needTechnicalAcknowledgement(Output.of(needTechnicalAcknowledgement));
        }

        public Builder rolloverAcknowledgementControlNumber(Output<Boolean> rolloverAcknowledgementControlNumber) {
            $.rolloverAcknowledgementControlNumber = rolloverAcknowledgementControlNumber;
            return this;
        }

        public Builder rolloverAcknowledgementControlNumber(Boolean rolloverAcknowledgementControlNumber) {
            return rolloverAcknowledgementControlNumber(Output.of(rolloverAcknowledgementControlNumber));
        }

        public Builder sendSynchronousAcknowledgement(Output<Boolean> sendSynchronousAcknowledgement) {
            $.sendSynchronousAcknowledgement = sendSynchronousAcknowledgement;
            return this;
        }

        public Builder sendSynchronousAcknowledgement(Boolean sendSynchronousAcknowledgement) {
            return sendSynchronousAcknowledgement(Output.of(sendSynchronousAcknowledgement));
        }

        public EdifactAcknowledgementSettingsArgs build() {
            $.acknowledgementControlNumberLowerBound = Objects.requireNonNull($.acknowledgementControlNumberLowerBound, "expected parameter 'acknowledgementControlNumberLowerBound' to be non-null");
            $.acknowledgementControlNumberUpperBound = Objects.requireNonNull($.acknowledgementControlNumberUpperBound, "expected parameter 'acknowledgementControlNumberUpperBound' to be non-null");
            $.batchFunctionalAcknowledgements = Objects.requireNonNull($.batchFunctionalAcknowledgements, "expected parameter 'batchFunctionalAcknowledgements' to be non-null");
            $.batchTechnicalAcknowledgements = Objects.requireNonNull($.batchTechnicalAcknowledgements, "expected parameter 'batchTechnicalAcknowledgements' to be non-null");
            $.needFunctionalAcknowledgement = Objects.requireNonNull($.needFunctionalAcknowledgement, "expected parameter 'needFunctionalAcknowledgement' to be non-null");
            $.needLoopForValidMessages = Objects.requireNonNull($.needLoopForValidMessages, "expected parameter 'needLoopForValidMessages' to be non-null");
            $.needTechnicalAcknowledgement = Objects.requireNonNull($.needTechnicalAcknowledgement, "expected parameter 'needTechnicalAcknowledgement' to be non-null");
            $.rolloverAcknowledgementControlNumber = Objects.requireNonNull($.rolloverAcknowledgementControlNumber, "expected parameter 'rolloverAcknowledgementControlNumber' to be non-null");
            $.sendSynchronousAcknowledgement = Objects.requireNonNull($.sendSynchronousAcknowledgement, "expected parameter 'sendSynchronousAcknowledgement' to be non-null");
            return $;
        }
    }

}
