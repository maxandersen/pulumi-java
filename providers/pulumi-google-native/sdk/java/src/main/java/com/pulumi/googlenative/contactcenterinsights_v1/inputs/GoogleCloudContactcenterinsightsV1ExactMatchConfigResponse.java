// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Exact match configuration.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse Empty = new GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse();

    /**
     * Whether to consider case sensitivity when performing an exact match.
     * 
     */
    @Import(name="caseSensitive", required=true)
      private final Boolean caseSensitive;

    public Boolean caseSensitive() {
        return this.caseSensitive;
    }

    public GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse(Boolean caseSensitive) {
        this.caseSensitive = Objects.requireNonNull(caseSensitive, "expected parameter 'caseSensitive' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse() {
        this.caseSensitive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean caseSensitive;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            this.caseSensitive = Objects.requireNonNull(caseSensitive);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse build() {
            return new GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse(caseSensitive);
        }
    }
}
