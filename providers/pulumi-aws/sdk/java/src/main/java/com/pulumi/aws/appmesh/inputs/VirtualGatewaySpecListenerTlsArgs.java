// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsCertificateArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerTlsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsArgs Empty = new VirtualGatewaySpecListenerTlsArgs();

    /**
     * The listener&#39;s TLS certificate.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<VirtualGatewaySpecListenerTlsCertificateArgs> certificate;

    public Output<VirtualGatewaySpecListenerTlsCertificateArgs> certificate() {
        return this.certificate;
    }

    /**
     * The listener&#39;s TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    public Output<String> mode() {
        return this.mode;
    }

    /**
     * The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    @Import(name="validation")
    private @Nullable Output<VirtualGatewaySpecListenerTlsValidationArgs> validation;

    public Optional<Output<VirtualGatewaySpecListenerTlsValidationArgs>> validation() {
        return Optional.ofNullable(this.validation);
    }

    private VirtualGatewaySpecListenerTlsArgs() {}

    private VirtualGatewaySpecListenerTlsArgs(VirtualGatewaySpecListenerTlsArgs $) {
        this.certificate = $.certificate;
        this.mode = $.mode;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecListenerTlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerTlsArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecListenerTlsArgs();
        }

        public Builder(VirtualGatewaySpecListenerTlsArgs defaults) {
            $ = new VirtualGatewaySpecListenerTlsArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(Output<VirtualGatewaySpecListenerTlsCertificateArgs> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(VirtualGatewaySpecListenerTlsCertificateArgs certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder validation(@Nullable Output<VirtualGatewaySpecListenerTlsValidationArgs> validation) {
            $.validation = validation;
            return this;
        }

        public Builder validation(VirtualGatewaySpecListenerTlsValidationArgs validation) {
            return validation(Output.of(validation));
        }

        public VirtualGatewaySpecListenerTlsArgs build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
