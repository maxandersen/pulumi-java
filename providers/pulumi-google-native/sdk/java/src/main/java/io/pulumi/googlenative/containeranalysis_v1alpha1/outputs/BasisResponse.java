// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FingerprintResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BasisResponse {
    /**
     * The fingerprint of the base image.
     * 
     */
    private final FingerprintResponse fingerprint;
    /**
     * The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    private final String resourceUrl;

    @CustomType.Constructor
    private BasisResponse(
        @CustomType.Parameter("fingerprint") FingerprintResponse fingerprint,
        @CustomType.Parameter("resourceUrl") String resourceUrl) {
        this.fingerprint = fingerprint;
        this.resourceUrl = resourceUrl;
    }

    /**
     * The fingerprint of the base image.
     * 
    */
    public FingerprintResponse fingerprint() {
        return this.fingerprint;
    }
    /**
     * The resource_url for the resource representing the basis of associated occurrence images.
     * 
    */
    public String resourceUrl() {
        return this.resourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasisResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FingerprintResponse fingerprint;
        private String resourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(BasisResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.resourceUrl = defaults.resourceUrl;
        }

        public Builder fingerprint(FingerprintResponse fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder resourceUrl(String resourceUrl) {
            this.resourceUrl = Objects.requireNonNull(resourceUrl);
            return this;
        }        public BasisResponse build() {
            return new BasisResponse(fingerprint, resourceUrl);
        }
    }
}
