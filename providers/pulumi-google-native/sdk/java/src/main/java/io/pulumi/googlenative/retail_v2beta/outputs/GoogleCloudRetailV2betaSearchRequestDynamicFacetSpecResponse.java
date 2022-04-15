// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse {
    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
     */
    private final String mode;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse(@CustomType.Parameter("mode") String mode) {
        this.mode = mode;
    }

    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
    */
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }        public GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse build() {
            return new GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecResponse(mode);
        }
    }
}
