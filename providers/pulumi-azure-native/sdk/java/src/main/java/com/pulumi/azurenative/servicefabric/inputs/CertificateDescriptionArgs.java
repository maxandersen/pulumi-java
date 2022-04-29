// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the certificate details.
 * 
 */
public final class CertificateDescriptionArgs extends ResourceArgs {

    public static final CertificateDescriptionArgs Empty = new CertificateDescriptionArgs();

    /**
     * Thumbprint of the primary certificate.
     * 
     */
    @Import(name="thumbprint", required=true)
    private Output<String> thumbprint;

    /**
     * @return Thumbprint of the primary certificate.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    /**
     * Thumbprint of the secondary certificate.
     * 
     */
    @Import(name="thumbprintSecondary")
    private @Nullable Output<String> thumbprintSecondary;

    /**
     * @return Thumbprint of the secondary certificate.
     * 
     */
    public Optional<Output<String>> thumbprintSecondary() {
        return Optional.ofNullable(this.thumbprintSecondary);
    }

    /**
     * The local certificate store location.
     * 
     */
    @Import(name="x509StoreName")
    private @Nullable Output<String> x509StoreName;

    /**
     * @return The local certificate store location.
     * 
     */
    public Optional<Output<String>> x509StoreName() {
        return Optional.ofNullable(this.x509StoreName);
    }

    private CertificateDescriptionArgs() {}

    private CertificateDescriptionArgs(CertificateDescriptionArgs $) {
        this.thumbprint = $.thumbprint;
        this.thumbprintSecondary = $.thumbprintSecondary;
        this.x509StoreName = $.x509StoreName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateDescriptionArgs $;

        public Builder() {
            $ = new CertificateDescriptionArgs();
        }

        public Builder(CertificateDescriptionArgs defaults) {
            $ = new CertificateDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param thumbprint Thumbprint of the primary certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint Thumbprint of the primary certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        /**
         * @param thumbprintSecondary Thumbprint of the secondary certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintSecondary(@Nullable Output<String> thumbprintSecondary) {
            $.thumbprintSecondary = thumbprintSecondary;
            return this;
        }

        /**
         * @param thumbprintSecondary Thumbprint of the secondary certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprintSecondary(String thumbprintSecondary) {
            return thumbprintSecondary(Output.of(thumbprintSecondary));
        }

        /**
         * @param x509StoreName The local certificate store location.
         * 
         * @return builder
         * 
         */
        public Builder x509StoreName(@Nullable Output<String> x509StoreName) {
            $.x509StoreName = x509StoreName;
            return this;
        }

        /**
         * @param x509StoreName The local certificate store location.
         * 
         * @return builder
         * 
         */
        public Builder x509StoreName(String x509StoreName) {
            return x509StoreName(Output.of(x509StoreName));
        }

        public CertificateDescriptionArgs build() {
            $.thumbprint = Objects.requireNonNull($.thumbprint, "expected parameter 'thumbprint' to be non-null");
            return $;
        }
    }

}
