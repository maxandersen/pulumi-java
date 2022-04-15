// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class X12ProcessingSettingsResponse {
    /**
     * The value indicating whether to convert numerical type to implied decimal.
     * 
     */
    private final Boolean convertImpliedDecimal;
    /**
     * The value indicating whether to create empty xml tags for trailing separators.
     * 
     */
    private final Boolean createEmptyXmlTagsForTrailingSeparators;
    /**
     * The value indicating whether to mask security information.
     * 
     */
    private final Boolean maskSecurityInfo;
    /**
     * The value indicating whether to preserve interchange.
     * 
     */
    private final Boolean preserveInterchange;
    /**
     * The value indicating whether to suspend interchange on error.
     * 
     */
    private final Boolean suspendInterchangeOnError;
    /**
     * The value indicating whether to use dot as decimal separator.
     * 
     */
    private final Boolean useDotAsDecimalSeparator;

    @CustomType.Constructor
    private X12ProcessingSettingsResponse(
        @CustomType.Parameter("convertImpliedDecimal") Boolean convertImpliedDecimal,
        @CustomType.Parameter("createEmptyXmlTagsForTrailingSeparators") Boolean createEmptyXmlTagsForTrailingSeparators,
        @CustomType.Parameter("maskSecurityInfo") Boolean maskSecurityInfo,
        @CustomType.Parameter("preserveInterchange") Boolean preserveInterchange,
        @CustomType.Parameter("suspendInterchangeOnError") Boolean suspendInterchangeOnError,
        @CustomType.Parameter("useDotAsDecimalSeparator") Boolean useDotAsDecimalSeparator) {
        this.convertImpliedDecimal = convertImpliedDecimal;
        this.createEmptyXmlTagsForTrailingSeparators = createEmptyXmlTagsForTrailingSeparators;
        this.maskSecurityInfo = maskSecurityInfo;
        this.preserveInterchange = preserveInterchange;
        this.suspendInterchangeOnError = suspendInterchangeOnError;
        this.useDotAsDecimalSeparator = useDotAsDecimalSeparator;
    }

    /**
     * The value indicating whether to convert numerical type to implied decimal.
     * 
    */
    public Boolean convertImpliedDecimal() {
        return this.convertImpliedDecimal;
    }
    /**
     * The value indicating whether to create empty xml tags for trailing separators.
     * 
    */
    public Boolean createEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }
    /**
     * The value indicating whether to mask security information.
     * 
    */
    public Boolean maskSecurityInfo() {
        return this.maskSecurityInfo;
    }
    /**
     * The value indicating whether to preserve interchange.
     * 
    */
    public Boolean preserveInterchange() {
        return this.preserveInterchange;
    }
    /**
     * The value indicating whether to suspend interchange on error.
     * 
    */
    public Boolean suspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }
    /**
     * The value indicating whether to use dot as decimal separator.
     * 
    */
    public Boolean useDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ProcessingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean convertImpliedDecimal;
        private Boolean createEmptyXmlTagsForTrailingSeparators;
        private Boolean maskSecurityInfo;
        private Boolean preserveInterchange;
        private Boolean suspendInterchangeOnError;
        private Boolean useDotAsDecimalSeparator;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ProcessingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convertImpliedDecimal = defaults.convertImpliedDecimal;
    	      this.createEmptyXmlTagsForTrailingSeparators = defaults.createEmptyXmlTagsForTrailingSeparators;
    	      this.maskSecurityInfo = defaults.maskSecurityInfo;
    	      this.preserveInterchange = defaults.preserveInterchange;
    	      this.suspendInterchangeOnError = defaults.suspendInterchangeOnError;
    	      this.useDotAsDecimalSeparator = defaults.useDotAsDecimalSeparator;
        }

        public Builder convertImpliedDecimal(Boolean convertImpliedDecimal) {
            this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal);
            return this;
        }
        public Builder createEmptyXmlTagsForTrailingSeparators(Boolean createEmptyXmlTagsForTrailingSeparators) {
            this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators);
            return this;
        }
        public Builder maskSecurityInfo(Boolean maskSecurityInfo) {
            this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo);
            return this;
        }
        public Builder preserveInterchange(Boolean preserveInterchange) {
            this.preserveInterchange = Objects.requireNonNull(preserveInterchange);
            return this;
        }
        public Builder suspendInterchangeOnError(Boolean suspendInterchangeOnError) {
            this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError);
            return this;
        }
        public Builder useDotAsDecimalSeparator(Boolean useDotAsDecimalSeparator) {
            this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator);
            return this;
        }        public X12ProcessingSettingsResponse build() {
            return new X12ProcessingSettingsResponse(convertImpliedDecimal, createEmptyXmlTagsForTrailingSeparators, maskSecurityInfo, preserveInterchange, suspendInterchangeOnError, useDotAsDecimalSeparator);
        }
    }
}
