// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2TimePartConfigResponse {
    /**
     * The part of the time to keep.
     * 
     */
    private final String partToExtract;

    @CustomType.Constructor
    private GooglePrivacyDlpV2TimePartConfigResponse(@CustomType.Parameter("partToExtract") String partToExtract) {
        this.partToExtract = partToExtract;
    }

    /**
     * The part of the time to keep.
     * 
    */
    public String partToExtract() {
        return this.partToExtract;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimePartConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partToExtract;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TimePartConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partToExtract = defaults.partToExtract;
        }

        public Builder partToExtract(String partToExtract) {
            this.partToExtract = Objects.requireNonNull(partToExtract);
            return this;
        }        public GooglePrivacyDlpV2TimePartConfigResponse build() {
            return new GooglePrivacyDlpV2TimePartConfigResponse(partToExtract);
        }
    }
}
