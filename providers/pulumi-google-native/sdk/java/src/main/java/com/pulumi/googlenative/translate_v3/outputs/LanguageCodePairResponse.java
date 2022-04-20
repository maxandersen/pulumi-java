// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LanguageCodePairResponse {
    /**
     * The BCP-47 language code of the input text, for example, &#34;en-US&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    private final String sourceLanguageCode;
    /**
     * The BCP-47 language code for translation output, for example, &#34;zh-CN&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    private final String targetLanguageCode;

    @CustomType.Constructor
    private LanguageCodePairResponse(
        @CustomType.Parameter("sourceLanguageCode") String sourceLanguageCode,
        @CustomType.Parameter("targetLanguageCode") String targetLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * The BCP-47 language code of the input text, for example, &#34;en-US&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
    */
    public String sourceLanguageCode() {
        return this.sourceLanguageCode;
    }
    /**
     * The BCP-47 language code for translation output, for example, &#34;zh-CN&#34;. Expected to be an exact match for GlossaryTerm.language_code.
     * 
    */
    public String targetLanguageCode() {
        return this.targetLanguageCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageCodePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceLanguageCode;
        private String targetLanguageCode;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageCodePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceLanguageCode = defaults.sourceLanguageCode;
    	      this.targetLanguageCode = defaults.targetLanguageCode;
        }

        public Builder sourceLanguageCode(String sourceLanguageCode) {
            this.sourceLanguageCode = Objects.requireNonNull(sourceLanguageCode);
            return this;
        }
        public Builder targetLanguageCode(String targetLanguageCode) {
            this.targetLanguageCode = Objects.requireNonNull(targetLanguageCode);
            return this;
        }        public LanguageCodePairResponse build() {
            return new LanguageCodePairResponse(sourceLanguageCode, targetLanguageCode);
        }
    }
}
