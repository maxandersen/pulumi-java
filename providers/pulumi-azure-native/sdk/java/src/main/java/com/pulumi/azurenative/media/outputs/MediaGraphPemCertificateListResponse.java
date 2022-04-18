// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MediaGraphPemCertificateListResponse {
    /**
     * PEM formatted public certificates, one per entry.
     * 
     */
    private final List<String> certificates;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphPemCertificateList'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private MediaGraphPemCertificateListResponse(
        @CustomType.Parameter("certificates") List<String> certificates,
        @CustomType.Parameter("odataType") String odataType) {
        this.certificates = certificates;
        this.odataType = odataType;
    }

    /**
     * PEM formatted public certificates, one per entry.
     * 
    */
    public List<String> certificates() {
        return this.certificates;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphPemCertificateList'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphPemCertificateListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificates;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphPemCertificateListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.odataType = defaults.odataType;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }
        public Builder certificates(String... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public MediaGraphPemCertificateListResponse build() {
            return new MediaGraphPemCertificateListResponse(certificates, odataType);
        }
    }
}
