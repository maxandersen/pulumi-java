// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ValueFrequencyResponse {
    /**
     * How many times the value is contained in the field.
     * 
     */
    private final String count;
    /**
     * A value contained in the field in question.
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse value;

    @CustomType.Constructor
    private GooglePrivacyDlpV2ValueFrequencyResponse(
        @CustomType.Parameter("count") String count,
        @CustomType.Parameter("value") GooglePrivacyDlpV2ValueResponse value) {
        this.count = count;
        this.value = value;
    }

    /**
     * How many times the value is contained in the field.
     * 
    */
    public String count() {
        return this.count;
    }
    /**
     * A value contained in the field in question.
     * 
    */
    public GooglePrivacyDlpV2ValueResponse value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ValueFrequencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String count;
        private GooglePrivacyDlpV2ValueResponse value;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ValueFrequencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.value = defaults.value;
        }

        public Builder count(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder value(GooglePrivacyDlpV2ValueResponse value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GooglePrivacyDlpV2ValueFrequencyResponse build() {
            return new GooglePrivacyDlpV2ValueFrequencyResponse(count, value);
        }
    }
}
