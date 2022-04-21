// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.util.Objects;


/**
 * Bucket is represented as a range, along with replacement values.
 * 
 */
public final class GooglePrivacyDlpV2BucketResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2BucketResponse Empty = new GooglePrivacyDlpV2BucketResponse();

    /**
     * Upper bound of the range, exclusive; type must match min.
     * 
     */
    @Import(name="max", required=true)
    private GooglePrivacyDlpV2ValueResponse max;

    public GooglePrivacyDlpV2ValueResponse max() {
        return this.max;
    }

    /**
     * Lower bound of the range, inclusive. Type should be the same as max if used.
     * 
     */
    @Import(name="min", required=true)
    private GooglePrivacyDlpV2ValueResponse min;

    public GooglePrivacyDlpV2ValueResponse min() {
        return this.min;
    }

    /**
     * Replacement value for this bucket.
     * 
     */
    @Import(name="replacementValue", required=true)
    private GooglePrivacyDlpV2ValueResponse replacementValue;

    public GooglePrivacyDlpV2ValueResponse replacementValue() {
        return this.replacementValue;
    }

    private GooglePrivacyDlpV2BucketResponse() {}

    private GooglePrivacyDlpV2BucketResponse(GooglePrivacyDlpV2BucketResponse $) {
        this.max = $.max;
        this.min = $.min;
        this.replacementValue = $.replacementValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2BucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BucketResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2BucketResponse();
        }

        public Builder(GooglePrivacyDlpV2BucketResponse defaults) {
            $ = new GooglePrivacyDlpV2BucketResponse(Objects.requireNonNull(defaults));
        }

        public Builder max(GooglePrivacyDlpV2ValueResponse max) {
            $.max = max;
            return this;
        }

        public Builder min(GooglePrivacyDlpV2ValueResponse min) {
            $.min = min;
            return this;
        }

        public Builder replacementValue(GooglePrivacyDlpV2ValueResponse replacementValue) {
            $.replacementValue = replacementValue;
            return this;
        }

        public GooglePrivacyDlpV2BucketResponse build() {
            $.max = Objects.requireNonNull($.max, "expected parameter 'max' to be non-null");
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            $.replacementValue = Objects.requireNonNull($.replacementValue, "expected parameter 'replacementValue' to be non-null");
            return $;
        }
    }

}
