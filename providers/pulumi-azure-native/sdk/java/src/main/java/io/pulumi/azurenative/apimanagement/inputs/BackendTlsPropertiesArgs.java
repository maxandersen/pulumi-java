// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties controlling TLS Certificate Validation.
 * 
 */
public final class BackendTlsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendTlsPropertiesArgs Empty = new BackendTlsPropertiesArgs();

    /**
     * Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @Import(name="validateCertificateChain")
      private final @Nullable Output<Boolean> validateCertificateChain;

    public Output<Boolean> validateCertificateChain() {
        return this.validateCertificateChain == null ? Codegen.empty() : this.validateCertificateChain;
    }

    /**
     * Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @Import(name="validateCertificateName")
      private final @Nullable Output<Boolean> validateCertificateName;

    public Output<Boolean> validateCertificateName() {
        return this.validateCertificateName == null ? Codegen.empty() : this.validateCertificateName;
    }

    public BackendTlsPropertiesArgs(
        @Nullable Output<Boolean> validateCertificateChain,
        @Nullable Output<Boolean> validateCertificateName) {
        this.validateCertificateChain = validateCertificateChain == null ? Codegen.ofNullable(true) : validateCertificateChain;
        this.validateCertificateName = validateCertificateName == null ? Codegen.ofNullable(true) : validateCertificateName;
    }

    private BackendTlsPropertiesArgs() {
        this.validateCertificateChain = Codegen.empty();
        this.validateCertificateName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendTlsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> validateCertificateChain;
        private @Nullable Output<Boolean> validateCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendTlsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.validateCertificateChain = defaults.validateCertificateChain;
    	      this.validateCertificateName = defaults.validateCertificateName;
        }

        public Builder validateCertificateChain(@Nullable Output<Boolean> validateCertificateChain) {
            this.validateCertificateChain = validateCertificateChain;
            return this;
        }
        public Builder validateCertificateChain(@Nullable Boolean validateCertificateChain) {
            this.validateCertificateChain = Codegen.ofNullable(validateCertificateChain);
            return this;
        }
        public Builder validateCertificateName(@Nullable Output<Boolean> validateCertificateName) {
            this.validateCertificateName = validateCertificateName;
            return this;
        }
        public Builder validateCertificateName(@Nullable Boolean validateCertificateName) {
            this.validateCertificateName = Codegen.ofNullable(validateCertificateName);
            return this;
        }        public BackendTlsPropertiesArgs build() {
            return new BackendTlsPropertiesArgs(validateCertificateChain, validateCertificateName);
        }
    }
}
