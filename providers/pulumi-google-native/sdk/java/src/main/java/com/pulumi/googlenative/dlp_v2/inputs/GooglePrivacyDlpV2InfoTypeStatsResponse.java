// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Statistics regarding a specific InfoType.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeStatsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InfoTypeStatsResponse Empty = new GooglePrivacyDlpV2InfoTypeStatsResponse();

    /**
     * Number of findings for this infoType.
     * 
     */
    @Import(name="count", required=true)
    private String count;

    public String count() {
        return this.count;
    }

    /**
     * The type of finding this stat is for.
     * 
     */
    @Import(name="infoType", required=true)
    private GooglePrivacyDlpV2InfoTypeResponse infoType;

    public GooglePrivacyDlpV2InfoTypeResponse infoType() {
        return this.infoType;
    }

    private GooglePrivacyDlpV2InfoTypeStatsResponse() {}

    private GooglePrivacyDlpV2InfoTypeStatsResponse(GooglePrivacyDlpV2InfoTypeStatsResponse $) {
        this.count = $.count;
        this.infoType = $.infoType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InfoTypeStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InfoTypeStatsResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InfoTypeStatsResponse();
        }

        public Builder(GooglePrivacyDlpV2InfoTypeStatsResponse defaults) {
            $ = new GooglePrivacyDlpV2InfoTypeStatsResponse(Objects.requireNonNull(defaults));
        }

        public Builder count(String count) {
            $.count = count;
            return this;
        }

        public Builder infoType(GooglePrivacyDlpV2InfoTypeResponse infoType) {
            $.infoType = infoType;
            return this;
        }

        public GooglePrivacyDlpV2InfoTypeStatsResponse build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.infoType = Objects.requireNonNull($.infoType, "expected parameter 'infoType' to be non-null");
            return $;
        }
    }

}
