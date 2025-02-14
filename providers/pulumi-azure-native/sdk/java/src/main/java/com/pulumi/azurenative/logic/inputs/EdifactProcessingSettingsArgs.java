// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The Edifact agreement protocol settings.
 * 
 */
public final class EdifactProcessingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactProcessingSettingsArgs Empty = new EdifactProcessingSettingsArgs();

    /**
     * The value indicating whether to create empty xml tags for trailing separators.
     * 
     */
    @Import(name="createEmptyXmlTagsForTrailingSeparators", required=true)
    private Output<Boolean> createEmptyXmlTagsForTrailingSeparators;

    /**
     * @return The value indicating whether to create empty xml tags for trailing separators.
     * 
     */
    public Output<Boolean> createEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }

    /**
     * The value indicating whether to mask security information.
     * 
     */
    @Import(name="maskSecurityInfo", required=true)
    private Output<Boolean> maskSecurityInfo;

    /**
     * @return The value indicating whether to mask security information.
     * 
     */
    public Output<Boolean> maskSecurityInfo() {
        return this.maskSecurityInfo;
    }

    /**
     * The value indicating whether to preserve interchange.
     * 
     */
    @Import(name="preserveInterchange", required=true)
    private Output<Boolean> preserveInterchange;

    /**
     * @return The value indicating whether to preserve interchange.
     * 
     */
    public Output<Boolean> preserveInterchange() {
        return this.preserveInterchange;
    }

    /**
     * The value indicating whether to suspend interchange on error.
     * 
     */
    @Import(name="suspendInterchangeOnError", required=true)
    private Output<Boolean> suspendInterchangeOnError;

    /**
     * @return The value indicating whether to suspend interchange on error.
     * 
     */
    public Output<Boolean> suspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }

    /**
     * The value indicating whether to use dot as decimal separator.
     * 
     */
    @Import(name="useDotAsDecimalSeparator", required=true)
    private Output<Boolean> useDotAsDecimalSeparator;

    /**
     * @return The value indicating whether to use dot as decimal separator.
     * 
     */
    public Output<Boolean> useDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    private EdifactProcessingSettingsArgs() {}

    private EdifactProcessingSettingsArgs(EdifactProcessingSettingsArgs $) {
        this.createEmptyXmlTagsForTrailingSeparators = $.createEmptyXmlTagsForTrailingSeparators;
        this.maskSecurityInfo = $.maskSecurityInfo;
        this.preserveInterchange = $.preserveInterchange;
        this.suspendInterchangeOnError = $.suspendInterchangeOnError;
        this.useDotAsDecimalSeparator = $.useDotAsDecimalSeparator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactProcessingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactProcessingSettingsArgs $;

        public Builder() {
            $ = new EdifactProcessingSettingsArgs();
        }

        public Builder(EdifactProcessingSettingsArgs defaults) {
            $ = new EdifactProcessingSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createEmptyXmlTagsForTrailingSeparators The value indicating whether to create empty xml tags for trailing separators.
         * 
         * @return builder
         * 
         */
        public Builder createEmptyXmlTagsForTrailingSeparators(Output<Boolean> createEmptyXmlTagsForTrailingSeparators) {
            $.createEmptyXmlTagsForTrailingSeparators = createEmptyXmlTagsForTrailingSeparators;
            return this;
        }

        /**
         * @param createEmptyXmlTagsForTrailingSeparators The value indicating whether to create empty xml tags for trailing separators.
         * 
         * @return builder
         * 
         */
        public Builder createEmptyXmlTagsForTrailingSeparators(Boolean createEmptyXmlTagsForTrailingSeparators) {
            return createEmptyXmlTagsForTrailingSeparators(Output.of(createEmptyXmlTagsForTrailingSeparators));
        }

        /**
         * @param maskSecurityInfo The value indicating whether to mask security information.
         * 
         * @return builder
         * 
         */
        public Builder maskSecurityInfo(Output<Boolean> maskSecurityInfo) {
            $.maskSecurityInfo = maskSecurityInfo;
            return this;
        }

        /**
         * @param maskSecurityInfo The value indicating whether to mask security information.
         * 
         * @return builder
         * 
         */
        public Builder maskSecurityInfo(Boolean maskSecurityInfo) {
            return maskSecurityInfo(Output.of(maskSecurityInfo));
        }

        /**
         * @param preserveInterchange The value indicating whether to preserve interchange.
         * 
         * @return builder
         * 
         */
        public Builder preserveInterchange(Output<Boolean> preserveInterchange) {
            $.preserveInterchange = preserveInterchange;
            return this;
        }

        /**
         * @param preserveInterchange The value indicating whether to preserve interchange.
         * 
         * @return builder
         * 
         */
        public Builder preserveInterchange(Boolean preserveInterchange) {
            return preserveInterchange(Output.of(preserveInterchange));
        }

        /**
         * @param suspendInterchangeOnError The value indicating whether to suspend interchange on error.
         * 
         * @return builder
         * 
         */
        public Builder suspendInterchangeOnError(Output<Boolean> suspendInterchangeOnError) {
            $.suspendInterchangeOnError = suspendInterchangeOnError;
            return this;
        }

        /**
         * @param suspendInterchangeOnError The value indicating whether to suspend interchange on error.
         * 
         * @return builder
         * 
         */
        public Builder suspendInterchangeOnError(Boolean suspendInterchangeOnError) {
            return suspendInterchangeOnError(Output.of(suspendInterchangeOnError));
        }

        /**
         * @param useDotAsDecimalSeparator The value indicating whether to use dot as decimal separator.
         * 
         * @return builder
         * 
         */
        public Builder useDotAsDecimalSeparator(Output<Boolean> useDotAsDecimalSeparator) {
            $.useDotAsDecimalSeparator = useDotAsDecimalSeparator;
            return this;
        }

        /**
         * @param useDotAsDecimalSeparator The value indicating whether to use dot as decimal separator.
         * 
         * @return builder
         * 
         */
        public Builder useDotAsDecimalSeparator(Boolean useDotAsDecimalSeparator) {
            return useDotAsDecimalSeparator(Output.of(useDotAsDecimalSeparator));
        }

        public EdifactProcessingSettingsArgs build() {
            $.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull($.createEmptyXmlTagsForTrailingSeparators, "expected parameter 'createEmptyXmlTagsForTrailingSeparators' to be non-null");
            $.maskSecurityInfo = Objects.requireNonNull($.maskSecurityInfo, "expected parameter 'maskSecurityInfo' to be non-null");
            $.preserveInterchange = Objects.requireNonNull($.preserveInterchange, "expected parameter 'preserveInterchange' to be non-null");
            $.suspendInterchangeOnError = Objects.requireNonNull($.suspendInterchangeOnError, "expected parameter 'suspendInterchangeOnError' to be non-null");
            $.useDotAsDecimalSeparator = Objects.requireNonNull($.useDotAsDecimalSeparator, "expected parameter 'useDotAsDecimalSeparator' to be non-null");
            return $;
        }
    }

}
