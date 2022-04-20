// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse {
    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it&#39;s unset.
     * 
     */
    private final String mode;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse(@CustomType.Parameter("mode") String mode) {
        this.mode = mode;
    }

    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it&#39;s unset.
     * 
    */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }        public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse build() {
            return new GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse(mode);
        }
    }
}
