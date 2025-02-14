// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SignalRCustomCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final SignalRCustomCertificateArgs Empty = new SignalRCustomCertificateArgs();

    /**
     * Custom certificate name
     * 
     */
    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    /**
     * @return Custom certificate name
     * 
     */
    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * Base uri of the KeyVault that stores certificate.
     * 
     */
    @Import(name="keyVaultBaseUri", required=true)
    private Output<String> keyVaultBaseUri;

    /**
     * @return Base uri of the KeyVault that stores certificate.
     * 
     */
    public Output<String> keyVaultBaseUri() {
        return this.keyVaultBaseUri;
    }

    /**
     * Certificate secret name.
     * 
     */
    @Import(name="keyVaultSecretName", required=true)
    private Output<String> keyVaultSecretName;

    /**
     * @return Certificate secret name.
     * 
     */
    public Output<String> keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Certificate secret version.
     * 
     */
    @Import(name="keyVaultSecretVersion")
    private @Nullable Output<String> keyVaultSecretVersion;

    /**
     * @return Certificate secret version.
     * 
     */
    public Optional<Output<String>> keyVaultSecretVersion() {
        return Optional.ofNullable(this.keyVaultSecretVersion);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private SignalRCustomCertificateArgs() {}

    private SignalRCustomCertificateArgs(SignalRCustomCertificateArgs $) {
        this.certificateName = $.certificateName;
        this.keyVaultBaseUri = $.keyVaultBaseUri;
        this.keyVaultSecretName = $.keyVaultSecretName;
        this.keyVaultSecretVersion = $.keyVaultSecretVersion;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SignalRCustomCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SignalRCustomCertificateArgs $;

        public Builder() {
            $ = new SignalRCustomCertificateArgs();
        }

        public Builder(SignalRCustomCertificateArgs defaults) {
            $ = new SignalRCustomCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName Custom certificate name
         * 
         * @return builder
         * 
         */
        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName Custom certificate name
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param keyVaultBaseUri Base uri of the KeyVault that stores certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultBaseUri(Output<String> keyVaultBaseUri) {
            $.keyVaultBaseUri = keyVaultBaseUri;
            return this;
        }

        /**
         * @param keyVaultBaseUri Base uri of the KeyVault that stores certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultBaseUri(String keyVaultBaseUri) {
            return keyVaultBaseUri(Output.of(keyVaultBaseUri));
        }

        /**
         * @param keyVaultSecretName Certificate secret name.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretName(Output<String> keyVaultSecretName) {
            $.keyVaultSecretName = keyVaultSecretName;
            return this;
        }

        /**
         * @param keyVaultSecretName Certificate secret name.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretName(String keyVaultSecretName) {
            return keyVaultSecretName(Output.of(keyVaultSecretName));
        }

        /**
         * @param keyVaultSecretVersion Certificate secret version.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretVersion(@Nullable Output<String> keyVaultSecretVersion) {
            $.keyVaultSecretVersion = keyVaultSecretVersion;
            return this;
        }

        /**
         * @param keyVaultSecretVersion Certificate secret version.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretVersion(String keyVaultSecretVersion) {
            return keyVaultSecretVersion(Output.of(keyVaultSecretVersion));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public SignalRCustomCertificateArgs build() {
            $.keyVaultBaseUri = Objects.requireNonNull($.keyVaultBaseUri, "expected parameter 'keyVaultBaseUri' to be non-null");
            $.keyVaultSecretName = Objects.requireNonNull($.keyVaultSecretName, "expected parameter 'keyVaultSecretName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
