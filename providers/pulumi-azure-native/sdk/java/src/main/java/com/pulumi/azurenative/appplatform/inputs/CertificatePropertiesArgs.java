// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Certificate resource payload.
 * 
 */
public final class CertificatePropertiesArgs extends ResourceArgs {

    public static final CertificatePropertiesArgs Empty = new CertificatePropertiesArgs();

    /**
     * The certificate version of key vault.
     * 
     */
    @Import(name="certVersion")
    private @Nullable Output<String> certVersion;

    /**
     * @return The certificate version of key vault.
     * 
     */
    public Optional<Output<String>> certVersion() {
        return Optional.ofNullable(this.certVersion);
    }

    /**
     * The certificate name of key vault.
     * 
     */
    @Import(name="keyVaultCertName", required=true)
    private Output<String> keyVaultCertName;

    /**
     * @return The certificate name of key vault.
     * 
     */
    public Output<String> keyVaultCertName() {
        return this.keyVaultCertName;
    }

    /**
     * The vault uri of user key vault.
     * 
     */
    @Import(name="vaultUri", required=true)
    private Output<String> vaultUri;

    /**
     * @return The vault uri of user key vault.
     * 
     */
    public Output<String> vaultUri() {
        return this.vaultUri;
    }

    private CertificatePropertiesArgs() {}

    private CertificatePropertiesArgs(CertificatePropertiesArgs $) {
        this.certVersion = $.certVersion;
        this.keyVaultCertName = $.keyVaultCertName;
        this.vaultUri = $.vaultUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificatePropertiesArgs $;

        public Builder() {
            $ = new CertificatePropertiesArgs();
        }

        public Builder(CertificatePropertiesArgs defaults) {
            $ = new CertificatePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certVersion The certificate version of key vault.
         * 
         * @return builder
         * 
         */
        public Builder certVersion(@Nullable Output<String> certVersion) {
            $.certVersion = certVersion;
            return this;
        }

        /**
         * @param certVersion The certificate version of key vault.
         * 
         * @return builder
         * 
         */
        public Builder certVersion(String certVersion) {
            return certVersion(Output.of(certVersion));
        }

        /**
         * @param keyVaultCertName The certificate name of key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultCertName(Output<String> keyVaultCertName) {
            $.keyVaultCertName = keyVaultCertName;
            return this;
        }

        /**
         * @param keyVaultCertName The certificate name of key vault.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultCertName(String keyVaultCertName) {
            return keyVaultCertName(Output.of(keyVaultCertName));
        }

        /**
         * @param vaultUri The vault uri of user key vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultUri(Output<String> vaultUri) {
            $.vaultUri = vaultUri;
            return this;
        }

        /**
         * @param vaultUri The vault uri of user key vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultUri(String vaultUri) {
            return vaultUri(Output.of(vaultUri));
        }

        public CertificatePropertiesArgs build() {
            $.keyVaultCertName = Objects.requireNonNull($.keyVaultCertName, "expected parameter 'keyVaultCertName' to be non-null");
            $.vaultUri = Objects.requireNonNull($.vaultUri, "expected parameter 'vaultUri' to be non-null");
            return $;
        }
    }

}
