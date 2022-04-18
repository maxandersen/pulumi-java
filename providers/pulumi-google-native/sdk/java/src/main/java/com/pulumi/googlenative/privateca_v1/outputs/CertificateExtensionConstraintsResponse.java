// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1.outputs.ObjectIdResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CertificateExtensionConstraintsResponse {
    /**
     * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
     * 
     */
    private final List<ObjectIdResponse> additionalExtensions;
    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    private final List<String> knownExtensions;

    @CustomType.Constructor
    private CertificateExtensionConstraintsResponse(
        @CustomType.Parameter("additionalExtensions") List<ObjectIdResponse> additionalExtensions,
        @CustomType.Parameter("knownExtensions") List<String> knownExtensions) {
        this.additionalExtensions = additionalExtensions;
        this.knownExtensions = knownExtensions;
    }

    /**
     * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
     * 
    */
    public List<ObjectIdResponse> additionalExtensions() {
        return this.additionalExtensions;
    }
    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
    */
    public List<String> knownExtensions() {
        return this.knownExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateExtensionConstraintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ObjectIdResponse> additionalExtensions;
        private List<String> knownExtensions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateExtensionConstraintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.knownExtensions = defaults.knownExtensions;
        }

        public Builder additionalExtensions(List<ObjectIdResponse> additionalExtensions) {
            this.additionalExtensions = Objects.requireNonNull(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(ObjectIdResponse... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder knownExtensions(List<String> knownExtensions) {
            this.knownExtensions = Objects.requireNonNull(knownExtensions);
            return this;
        }
        public Builder knownExtensions(String... knownExtensions) {
            return knownExtensions(List.of(knownExtensions));
        }        public CertificateExtensionConstraintsResponse build() {
            return new CertificateExtensionConstraintsResponse(additionalExtensions, knownExtensions);
        }
    }
}
