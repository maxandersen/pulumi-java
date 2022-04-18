// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a single certificate reference in a Key Vault, and where the certificate should reside on the role instance.
 * 
 */
public final class CloudServiceVaultCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudServiceVaultCertificateResponse Empty = new CloudServiceVaultCertificateResponse();

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret.
     * 
     */
    @Import(name="certificateUrl")
      private final @Nullable String certificateUrl;

    public Optional<String> certificateUrl() {
        return this.certificateUrl == null ? Optional.empty() : Optional.ofNullable(this.certificateUrl);
    }

    public CloudServiceVaultCertificateResponse(@Nullable String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }

    private CloudServiceVaultCertificateResponse() {
        this.certificateUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }        public CloudServiceVaultCertificateResponse build() {
            return new CloudServiceVaultCertificateResponse(certificateUrl);
        }
    }
}
