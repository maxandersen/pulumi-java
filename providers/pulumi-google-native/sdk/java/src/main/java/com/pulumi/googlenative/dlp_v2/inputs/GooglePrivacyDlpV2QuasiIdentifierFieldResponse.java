// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A quasi-identifier column has a custom_tag, used to know which column in the data corresponds to which column in the statistical model.
 * 
 */
public final class GooglePrivacyDlpV2QuasiIdentifierFieldResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2QuasiIdentifierFieldResponse Empty = new GooglePrivacyDlpV2QuasiIdentifierFieldResponse();

    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
     */
    @Import(name="customTag", required=true)
      private final String customTag;

    public String customTag() {
        return this.customTag;
    }

    /**
     * Identifies the column.
     * 
     */
    @Import(name="field", required=true)
      private final GooglePrivacyDlpV2FieldIdResponse field;

    public GooglePrivacyDlpV2FieldIdResponse field() {
        return this.field;
    }

    public GooglePrivacyDlpV2QuasiIdentifierFieldResponse(
        String customTag,
        GooglePrivacyDlpV2FieldIdResponse field) {
        this.customTag = Objects.requireNonNull(customTag, "expected parameter 'customTag' to be non-null");
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
    }

    private GooglePrivacyDlpV2QuasiIdentifierFieldResponse() {
        this.customTag = null;
        this.field = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2QuasiIdentifierFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customTag;
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2QuasiIdentifierFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
        }

        public Builder customTag(String customTag) {
            this.customTag = Objects.requireNonNull(customTag);
            return this;
        }
        public Builder field(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }        public GooglePrivacyDlpV2QuasiIdentifierFieldResponse build() {
            return new GooglePrivacyDlpV2QuasiIdentifierFieldResponse(customTag, field);
        }
    }
}
