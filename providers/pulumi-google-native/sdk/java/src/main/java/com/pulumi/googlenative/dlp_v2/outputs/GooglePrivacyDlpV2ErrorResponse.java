// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ErrorResponse {
    /**
     * Detailed error codes and messages.
     * 
     */
    private final GoogleRpcStatusResponse details;
    /**
     * The times the error occurred.
     * 
     */
    private final List<String> timestamps;

    @CustomType.Constructor
    private GooglePrivacyDlpV2ErrorResponse(
        @CustomType.Parameter("details") GoogleRpcStatusResponse details,
        @CustomType.Parameter("timestamps") List<String> timestamps) {
        this.details = details;
        this.timestamps = timestamps;
    }

    /**
     * Detailed error codes and messages.
     * 
    */
    public GoogleRpcStatusResponse details() {
        return this.details;
    }
    /**
     * The times the error occurred.
     * 
    */
    public List<String> timestamps() {
        return this.timestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleRpcStatusResponse details;
        private List<String> timestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.timestamps = defaults.timestamps;
        }

        public Builder details(GoogleRpcStatusResponse details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder timestamps(List<String> timestamps) {
            this.timestamps = Objects.requireNonNull(timestamps);
            return this;
        }
        public Builder timestamps(String... timestamps) {
            return timestamps(List.of(timestamps));
        }        public GooglePrivacyDlpV2ErrorResponse build() {
            return new GooglePrivacyDlpV2ErrorResponse(details, timestamps);
        }
    }
}
