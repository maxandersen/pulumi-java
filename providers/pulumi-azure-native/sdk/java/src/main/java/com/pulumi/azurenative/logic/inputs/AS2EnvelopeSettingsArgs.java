// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The AS2 agreement envelope settings.
 * 
 */
public final class AS2EnvelopeSettingsArgs extends ResourceArgs {

    public static final AS2EnvelopeSettingsArgs Empty = new AS2EnvelopeSettingsArgs();

    /**
     * The value indicating whether to auto generate file name.
     * 
     */
    @Import(name="autogenerateFileName", required=true)
    private Output<Boolean> autogenerateFileName;

    /**
     * @return The value indicating whether to auto generate file name.
     * 
     */
    public Output<Boolean> autogenerateFileName() {
        return this.autogenerateFileName;
    }

    /**
     * The template for file name.
     * 
     */
    @Import(name="fileNameTemplate", required=true)
    private Output<String> fileNameTemplate;

    /**
     * @return The template for file name.
     * 
     */
    public Output<String> fileNameTemplate() {
        return this.fileNameTemplate;
    }

    /**
     * The message content type.
     * 
     */
    @Import(name="messageContentType", required=true)
    private Output<String> messageContentType;

    /**
     * @return The message content type.
     * 
     */
    public Output<String> messageContentType() {
        return this.messageContentType;
    }

    /**
     * The value indicating whether to suspend message on file name generation error.
     * 
     */
    @Import(name="suspendMessageOnFileNameGenerationError", required=true)
    private Output<Boolean> suspendMessageOnFileNameGenerationError;

    /**
     * @return The value indicating whether to suspend message on file name generation error.
     * 
     */
    public Output<Boolean> suspendMessageOnFileNameGenerationError() {
        return this.suspendMessageOnFileNameGenerationError;
    }

    /**
     * The value indicating whether to transmit file name in mime header.
     * 
     */
    @Import(name="transmitFileNameInMimeHeader", required=true)
    private Output<Boolean> transmitFileNameInMimeHeader;

    /**
     * @return The value indicating whether to transmit file name in mime header.
     * 
     */
    public Output<Boolean> transmitFileNameInMimeHeader() {
        return this.transmitFileNameInMimeHeader;
    }

    private AS2EnvelopeSettingsArgs() {}

    private AS2EnvelopeSettingsArgs(AS2EnvelopeSettingsArgs $) {
        this.autogenerateFileName = $.autogenerateFileName;
        this.fileNameTemplate = $.fileNameTemplate;
        this.messageContentType = $.messageContentType;
        this.suspendMessageOnFileNameGenerationError = $.suspendMessageOnFileNameGenerationError;
        this.transmitFileNameInMimeHeader = $.transmitFileNameInMimeHeader;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2EnvelopeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2EnvelopeSettingsArgs $;

        public Builder() {
            $ = new AS2EnvelopeSettingsArgs();
        }

        public Builder(AS2EnvelopeSettingsArgs defaults) {
            $ = new AS2EnvelopeSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autogenerateFileName The value indicating whether to auto generate file name.
         * 
         * @return builder
         * 
         */
        public Builder autogenerateFileName(Output<Boolean> autogenerateFileName) {
            $.autogenerateFileName = autogenerateFileName;
            return this;
        }

        /**
         * @param autogenerateFileName The value indicating whether to auto generate file name.
         * 
         * @return builder
         * 
         */
        public Builder autogenerateFileName(Boolean autogenerateFileName) {
            return autogenerateFileName(Output.of(autogenerateFileName));
        }

        /**
         * @param fileNameTemplate The template for file name.
         * 
         * @return builder
         * 
         */
        public Builder fileNameTemplate(Output<String> fileNameTemplate) {
            $.fileNameTemplate = fileNameTemplate;
            return this;
        }

        /**
         * @param fileNameTemplate The template for file name.
         * 
         * @return builder
         * 
         */
        public Builder fileNameTemplate(String fileNameTemplate) {
            return fileNameTemplate(Output.of(fileNameTemplate));
        }

        /**
         * @param messageContentType The message content type.
         * 
         * @return builder
         * 
         */
        public Builder messageContentType(Output<String> messageContentType) {
            $.messageContentType = messageContentType;
            return this;
        }

        /**
         * @param messageContentType The message content type.
         * 
         * @return builder
         * 
         */
        public Builder messageContentType(String messageContentType) {
            return messageContentType(Output.of(messageContentType));
        }

        /**
         * @param suspendMessageOnFileNameGenerationError The value indicating whether to suspend message on file name generation error.
         * 
         * @return builder
         * 
         */
        public Builder suspendMessageOnFileNameGenerationError(Output<Boolean> suspendMessageOnFileNameGenerationError) {
            $.suspendMessageOnFileNameGenerationError = suspendMessageOnFileNameGenerationError;
            return this;
        }

        /**
         * @param suspendMessageOnFileNameGenerationError The value indicating whether to suspend message on file name generation error.
         * 
         * @return builder
         * 
         */
        public Builder suspendMessageOnFileNameGenerationError(Boolean suspendMessageOnFileNameGenerationError) {
            return suspendMessageOnFileNameGenerationError(Output.of(suspendMessageOnFileNameGenerationError));
        }

        /**
         * @param transmitFileNameInMimeHeader The value indicating whether to transmit file name in mime header.
         * 
         * @return builder
         * 
         */
        public Builder transmitFileNameInMimeHeader(Output<Boolean> transmitFileNameInMimeHeader) {
            $.transmitFileNameInMimeHeader = transmitFileNameInMimeHeader;
            return this;
        }

        /**
         * @param transmitFileNameInMimeHeader The value indicating whether to transmit file name in mime header.
         * 
         * @return builder
         * 
         */
        public Builder transmitFileNameInMimeHeader(Boolean transmitFileNameInMimeHeader) {
            return transmitFileNameInMimeHeader(Output.of(transmitFileNameInMimeHeader));
        }

        public AS2EnvelopeSettingsArgs build() {
            $.autogenerateFileName = Objects.requireNonNull($.autogenerateFileName, "expected parameter 'autogenerateFileName' to be non-null");
            $.fileNameTemplate = Objects.requireNonNull($.fileNameTemplate, "expected parameter 'fileNameTemplate' to be non-null");
            $.messageContentType = Objects.requireNonNull($.messageContentType, "expected parameter 'messageContentType' to be non-null");
            $.suspendMessageOnFileNameGenerationError = Objects.requireNonNull($.suspendMessageOnFileNameGenerationError, "expected parameter 'suspendMessageOnFileNameGenerationError' to be non-null");
            $.transmitFileNameInMimeHeader = Objects.requireNonNull($.transmitFileNameInMimeHeader, "expected parameter 'transmitFileNameInMimeHeader' to be non-null");
            return $;
        }
    }

}
