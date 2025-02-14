// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.awsnative.lightsail.outputs.CertificateTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    private final @Nullable String certificateArn;
    /**
     * @return The validation status of the certificate.
     * 
     */
    private final @Nullable String status;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<CertificateTag> tags;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("certificateArn") @Nullable String certificateArn,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("tags") @Nullable List<CertificateTag> tags) {
        this.certificateArn = certificateArn;
        this.status = status;
        this.tags = tags;
    }

    public Optional<String> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }
    /**
     * @return The validation status of the certificate.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<CertificateTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateArn;
        private @Nullable String status;
        private @Nullable List<CertificateTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable List<CertificateTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(CertificateTag... tags) {
            return tags(List.of(tags));
        }        public GetCertificateResult build() {
            return new GetCertificateResult(certificateArn, status, tags);
        }
    }
}
