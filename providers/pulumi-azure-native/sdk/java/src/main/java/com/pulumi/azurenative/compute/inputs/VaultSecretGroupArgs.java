// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.azurenative.compute.inputs.VaultCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a set of certificates which are all in the same Key Vault.
 * 
 */
public final class VaultSecretGroupArgs extends ResourceArgs {

    public static final VaultSecretGroupArgs Empty = new VaultSecretGroupArgs();

    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    @Import(name="sourceVault")
    private @Nullable Output<SubResourceArgs> sourceVault;

    /**
     * @return The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    public Optional<Output<SubResourceArgs>> sourceVault() {
        return Optional.ofNullable(this.sourceVault);
    }

    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
     */
    @Import(name="vaultCertificates")
    private @Nullable Output<List<VaultCertificateArgs>> vaultCertificates;

    /**
     * @return The list of key vault references in SourceVault which contain certificates.
     * 
     */
    public Optional<Output<List<VaultCertificateArgs>>> vaultCertificates() {
        return Optional.ofNullable(this.vaultCertificates);
    }

    private VaultSecretGroupArgs() {}

    private VaultSecretGroupArgs(VaultSecretGroupArgs $) {
        this.sourceVault = $.sourceVault;
        this.vaultCertificates = $.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultSecretGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultSecretGroupArgs $;

        public Builder() {
            $ = new VaultSecretGroupArgs();
        }

        public Builder(VaultSecretGroupArgs defaults) {
            $ = new VaultSecretGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceVault The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(@Nullable Output<SubResourceArgs> sourceVault) {
            $.sourceVault = sourceVault;
            return this;
        }

        /**
         * @param sourceVault The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
         * 
         * @return builder
         * 
         */
        public Builder sourceVault(SubResourceArgs sourceVault) {
            return sourceVault(Output.of(sourceVault));
        }

        /**
         * @param vaultCertificates The list of key vault references in SourceVault which contain certificates.
         * 
         * @return builder
         * 
         */
        public Builder vaultCertificates(@Nullable Output<List<VaultCertificateArgs>> vaultCertificates) {
            $.vaultCertificates = vaultCertificates;
            return this;
        }

        /**
         * @param vaultCertificates The list of key vault references in SourceVault which contain certificates.
         * 
         * @return builder
         * 
         */
        public Builder vaultCertificates(List<VaultCertificateArgs> vaultCertificates) {
            return vaultCertificates(Output.of(vaultCertificates));
        }

        /**
         * @param vaultCertificates The list of key vault references in SourceVault which contain certificates.
         * 
         * @return builder
         * 
         */
        public Builder vaultCertificates(VaultCertificateArgs... vaultCertificates) {
            return vaultCertificates(List.of(vaultCertificates));
        }

        public VaultSecretGroupArgs build() {
            return $;
        }
    }

}
