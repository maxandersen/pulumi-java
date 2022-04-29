// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
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
public final class EdifactAcknowledgementSettingsArgs extends ResourceArgs {

    public static final EdifactAcknowledgementSettingsArgs Empty = new EdifactAcknowledgementSettingsArgs();

    /**
     * The acknowledgement control number lower bound.
     * 
     */
    @Import(name="acknowledgementControlNumberLowerBound", required=true)
    private Output<Integer> acknowledgementControlNumberLowerBound;

    /**
     * @return The acknowledgement control number lower bound.
     * 
     */
    public Output<Integer> acknowledgementControlNumberLowerBound() {
        return this.acknowledgementControlNumberLowerBound;
    }

    /**
     * The acknowledgement control number prefix.
     * 
     */
    @Import(name="acknowledgementControlNumberPrefix")
    private @Nullable Output<String> acknowledgementControlNumberPrefix;

    /**
     * @return The acknowledgement control number prefix.
     * 
     */
    public Optional<Output<String>> acknowledgementControlNumberPrefix() {
        return Optional.ofNullable(this.acknowledgementControlNumberPrefix);
    }

    /**
     * The acknowledgement control number suffix.
     * 
     */
    @Import(name="acknowledgementControlNumberSuffix")
    private @Nullable Output<String> acknowledgementControlNumberSuffix;

    /**
     * @return The acknowledgement control number suffix.
     * 
     */
    public Optional<Output<String>> acknowledgementControlNumberSuffix() {
        return Optional.ofNullable(this.acknowledgementControlNumberSuffix);
    }

    /**
     * The acknowledgement control number upper bound.
     * 
     */
    @Import(name="acknowledgementControlNumberUpperBound", required=true)
    private Output<Integer> acknowledgementControlNumberUpperBound;

    /**
     * @return The acknowledgement control number upper bound.
     * 
     */
    public Output<Integer> acknowledgementControlNumberUpperBound() {
        return this.acknowledgementControlNumberUpperBound;
    }

    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
     */
    @Import(name="batchFunctionalAcknowledgements", required=true)
    private Output<Boolean> batchFunctionalAcknowledgements;

    /**
     * @return The value indicating whether to batch functional acknowledgements.
     * 
     */
    public Output<Boolean> batchFunctionalAcknowledgements() {
        return this.batchFunctionalAcknowledgements;
    }

    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
     */
    @Import(name="batchTechnicalAcknowledgements", required=true)
    private Output<Boolean> batchTechnicalAcknowledgements;

    /**
     * @return The value indicating whether to batch the technical acknowledgements.
     * 
     */
    public Output<Boolean> batchTechnicalAcknowledgements() {
        return this.batchTechnicalAcknowledgements;
    }

    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
     */
    @Import(name="needFunctionalAcknowledgement", required=true)
    private Output<Boolean> needFunctionalAcknowledgement;

    /**
     * @return The value indicating whether functional acknowledgement is needed.
     * 
     */
    public Output<Boolean> needFunctionalAcknowledgement() {
        return this.needFunctionalAcknowledgement;
    }

    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
     */
    @Import(name="needLoopForValidMessages", required=true)
    private Output<Boolean> needLoopForValidMessages;

    /**
     * @return The value indicating whether a loop is needed for valid messages.
     * 
     */
    public Output<Boolean> needLoopForValidMessages() {
        return this.needLoopForValidMessages;
    }

    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
     */
    @Import(name="needTechnicalAcknowledgement", required=true)
    private Output<Boolean> needTechnicalAcknowledgement;

    /**
     * @return The value indicating whether technical acknowledgement is needed.
     * 
     */
    public Output<Boolean> needTechnicalAcknowledgement() {
        return this.needTechnicalAcknowledgement;
    }

    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
     */
    @Import(name="rolloverAcknowledgementControlNumber", required=true)
    private Output<Boolean> rolloverAcknowledgementControlNumber;

    /**
     * @return The value indicating whether to rollover acknowledgement control number.
     * 
     */
    public Output<Boolean> rolloverAcknowledgementControlNumber() {
        return this.rolloverAcknowledgementControlNumber;
    }

    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
     */
    @Import(name="sendSynchronousAcknowledgement", required=true)
    private Output<Boolean> sendSynchronousAcknowledgement;

    /**
     * @return The value indicating whether to send synchronous acknowledgement.
     * 
     */
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

        /**
         * @param acknowledgementControlNumberLowerBound The acknowledgement control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberLowerBound(Output<Integer> acknowledgementControlNumberLowerBound) {
            $.acknowledgementControlNumberLowerBound = acknowledgementControlNumberLowerBound;
            return this;
        }

        /**
         * @param acknowledgementControlNumberLowerBound The acknowledgement control number lower bound.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberLowerBound(Integer acknowledgementControlNumberLowerBound) {
            return acknowledgementControlNumberLowerBound(Output.of(acknowledgementControlNumberLowerBound));
        }

        /**
         * @param acknowledgementControlNumberPrefix The acknowledgement control number prefix.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberPrefix(@Nullable Output<String> acknowledgementControlNumberPrefix) {
            $.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
            return this;
        }

        /**
         * @param acknowledgementControlNumberPrefix The acknowledgement control number prefix.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberPrefix(String acknowledgementControlNumberPrefix) {
            return acknowledgementControlNumberPrefix(Output.of(acknowledgementControlNumberPrefix));
        }

        /**
         * @param acknowledgementControlNumberSuffix The acknowledgement control number suffix.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberSuffix(@Nullable Output<String> acknowledgementControlNumberSuffix) {
            $.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
            return this;
        }

        /**
         * @param acknowledgementControlNumberSuffix The acknowledgement control number suffix.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberSuffix(String acknowledgementControlNumberSuffix) {
            return acknowledgementControlNumberSuffix(Output.of(acknowledgementControlNumberSuffix));
        }

        /**
         * @param acknowledgementControlNumberUpperBound The acknowledgement control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberUpperBound(Output<Integer> acknowledgementControlNumberUpperBound) {
            $.acknowledgementControlNumberUpperBound = acknowledgementControlNumberUpperBound;
            return this;
        }

        /**
         * @param acknowledgementControlNumberUpperBound The acknowledgement control number upper bound.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementControlNumberUpperBound(Integer acknowledgementControlNumberUpperBound) {
            return acknowledgementControlNumberUpperBound(Output.of(acknowledgementControlNumberUpperBound));
        }

        /**
         * @param batchFunctionalAcknowledgements The value indicating whether to batch functional acknowledgements.
         * 
         * @return builder
         * 
         */
        public Builder batchFunctionalAcknowledgements(Output<Boolean> batchFunctionalAcknowledgements) {
            $.batchFunctionalAcknowledgements = batchFunctionalAcknowledgements;
            return this;
        }

        /**
         * @param batchFunctionalAcknowledgements The value indicating whether to batch functional acknowledgements.
         * 
         * @return builder
         * 
         */
        public Builder batchFunctionalAcknowledgements(Boolean batchFunctionalAcknowledgements) {
            return batchFunctionalAcknowledgements(Output.of(batchFunctionalAcknowledgements));
        }

        /**
         * @param batchTechnicalAcknowledgements The value indicating whether to batch the technical acknowledgements.
         * 
         * @return builder
         * 
         */
        public Builder batchTechnicalAcknowledgements(Output<Boolean> batchTechnicalAcknowledgements) {
            $.batchTechnicalAcknowledgements = batchTechnicalAcknowledgements;
            return this;
        }

        /**
         * @param batchTechnicalAcknowledgements The value indicating whether to batch the technical acknowledgements.
         * 
         * @return builder
         * 
         */
        public Builder batchTechnicalAcknowledgements(Boolean batchTechnicalAcknowledgements) {
            return batchTechnicalAcknowledgements(Output.of(batchTechnicalAcknowledgements));
        }

        /**
         * @param needFunctionalAcknowledgement The value indicating whether functional acknowledgement is needed.
         * 
         * @return builder
         * 
         */
        public Builder needFunctionalAcknowledgement(Output<Boolean> needFunctionalAcknowledgement) {
            $.needFunctionalAcknowledgement = needFunctionalAcknowledgement;
            return this;
        }

        /**
         * @param needFunctionalAcknowledgement The value indicating whether functional acknowledgement is needed.
         * 
         * @return builder
         * 
         */
        public Builder needFunctionalAcknowledgement(Boolean needFunctionalAcknowledgement) {
            return needFunctionalAcknowledgement(Output.of(needFunctionalAcknowledgement));
        }

        /**
         * @param needLoopForValidMessages The value indicating whether a loop is needed for valid messages.
         * 
         * @return builder
         * 
         */
        public Builder needLoopForValidMessages(Output<Boolean> needLoopForValidMessages) {
            $.needLoopForValidMessages = needLoopForValidMessages;
            return this;
        }

        /**
         * @param needLoopForValidMessages The value indicating whether a loop is needed for valid messages.
         * 
         * @return builder
         * 
         */
        public Builder needLoopForValidMessages(Boolean needLoopForValidMessages) {
            return needLoopForValidMessages(Output.of(needLoopForValidMessages));
        }

        /**
         * @param needTechnicalAcknowledgement The value indicating whether technical acknowledgement is needed.
         * 
         * @return builder
         * 
         */
        public Builder needTechnicalAcknowledgement(Output<Boolean> needTechnicalAcknowledgement) {
            $.needTechnicalAcknowledgement = needTechnicalAcknowledgement;
            return this;
        }

        /**
         * @param needTechnicalAcknowledgement The value indicating whether technical acknowledgement is needed.
         * 
         * @return builder
         * 
         */
        public Builder needTechnicalAcknowledgement(Boolean needTechnicalAcknowledgement) {
            return needTechnicalAcknowledgement(Output.of(needTechnicalAcknowledgement));
        }

        /**
         * @param rolloverAcknowledgementControlNumber The value indicating whether to rollover acknowledgement control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverAcknowledgementControlNumber(Output<Boolean> rolloverAcknowledgementControlNumber) {
            $.rolloverAcknowledgementControlNumber = rolloverAcknowledgementControlNumber;
            return this;
        }

        /**
         * @param rolloverAcknowledgementControlNumber The value indicating whether to rollover acknowledgement control number.
         * 
         * @return builder
         * 
         */
        public Builder rolloverAcknowledgementControlNumber(Boolean rolloverAcknowledgementControlNumber) {
            return rolloverAcknowledgementControlNumber(Output.of(rolloverAcknowledgementControlNumber));
        }

        /**
         * @param sendSynchronousAcknowledgement The value indicating whether to send synchronous acknowledgement.
         * 
         * @return builder
         * 
         */
        public Builder sendSynchronousAcknowledgement(Output<Boolean> sendSynchronousAcknowledgement) {
            $.sendSynchronousAcknowledgement = sendSynchronousAcknowledgement;
            return this;
        }

        /**
         * @param sendSynchronousAcknowledgement The value indicating whether to send synchronous acknowledgement.
         * 
         * @return builder
         * 
         */
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
