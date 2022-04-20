// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsCertificate;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsValidation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerTls {
    /**
     * The listener&#39;s TLS certificate.
     * 
     */
    private final VirtualNodeSpecListenerTlsCertificate certificate;
    /**
     * The listener&#39;s TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
     */
    private final String mode;
    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTlsValidation validation;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTls(
        @CustomType.Parameter("certificate") VirtualNodeSpecListenerTlsCertificate certificate,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("validation") @Nullable VirtualNodeSpecListenerTlsValidation validation) {
        this.certificate = certificate;
        this.mode = mode;
        this.validation = validation;
    }

    /**
     * The listener&#39;s TLS certificate.
     * 
    */
    public VirtualNodeSpecListenerTlsCertificate certificate() {
        return this.certificate;
    }
    /**
     * The listener&#39;s TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
    */
    public String mode() {
        return this.mode;
    }
    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
    */
    public Optional<VirtualNodeSpecListenerTlsValidation> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsCertificate certificate;
        private String mode;
        private @Nullable VirtualNodeSpecListenerTlsValidation validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.mode = defaults.mode;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(VirtualNodeSpecListenerTlsCertificate certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder validation(@Nullable VirtualNodeSpecListenerTlsValidation validation) {
            this.validation = validation;
            return this;
        }        public VirtualNodeSpecListenerTls build() {
            return new VirtualNodeSpecListenerTls(certificate, mode, validation);
        }
    }
}
