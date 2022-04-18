// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


/**
 * Message for detecting output from deidentification transformations such as [`CryptoReplaceFfxFpeConfig`](https://cloud.google.com/dlp/docs/reference/rest/v2/organizations.deidentifyTemplates#cryptoreplaceffxfpeconfig). These types of transformations are those that perform pseudonymization, thereby producing a "surrogate" as output. This should be used in conjunction with a field on the transformation such as `surrogate_info_type`. This CustomInfoType does not support the use of `detection_rules`.
 * 
 */
public final class GooglePrivacyDlpV2SurrogateTypeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2SurrogateTypeResponse Empty = new GooglePrivacyDlpV2SurrogateTypeResponse();

    public GooglePrivacyDlpV2SurrogateTypeResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2SurrogateTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2SurrogateTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GooglePrivacyDlpV2SurrogateTypeResponse build() {
            return new GooglePrivacyDlpV2SurrogateTypeResponse();
        }
    }
}
