// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.VaultPropertiesEncryptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the vault.
 * 
 */
public final class VaultPropertiesArgs extends ResourceArgs {

    public static final VaultPropertiesArgs Empty = new VaultPropertiesArgs();

    /**
     * Customer Managed Key details of the resource.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<VaultPropertiesEncryptionArgs> encryption;

    /**
     * @return Customer Managed Key details of the resource.
     * 
     */
    public Optional<Output<VaultPropertiesEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    private VaultPropertiesArgs() {}

    private VaultPropertiesArgs(VaultPropertiesArgs $) {
        this.encryption = $.encryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultPropertiesArgs $;

        public Builder() {
            $ = new VaultPropertiesArgs();
        }

        public Builder(VaultPropertiesArgs defaults) {
            $ = new VaultPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryption Customer Managed Key details of the resource.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<VaultPropertiesEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption Customer Managed Key details of the resource.
         * 
         * @return builder
         * 
         */
        public Builder encryption(VaultPropertiesEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        public VaultPropertiesArgs build() {
            return $;
        }
    }

}
