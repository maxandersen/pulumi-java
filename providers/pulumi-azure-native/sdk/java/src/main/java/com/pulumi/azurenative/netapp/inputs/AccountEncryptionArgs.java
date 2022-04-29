// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption settings
 * 
 */
public final class AccountEncryptionArgs extends ResourceArgs {

    public static final AccountEncryptionArgs Empty = new AccountEncryptionArgs();

    /**
     * Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;.
     * 
     */
    @Import(name="keySource")
    private @Nullable Output<String> keySource;

    /**
     * @return Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;.
     * 
     */
    public Optional<Output<String>> keySource() {
        return Optional.ofNullable(this.keySource);
    }

    private AccountEncryptionArgs() {}

    private AccountEncryptionArgs(AccountEncryptionArgs $) {
        this.keySource = $.keySource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountEncryptionArgs $;

        public Builder() {
            $ = new AccountEncryptionArgs();
        }

        public Builder(AccountEncryptionArgs defaults) {
            $ = new AccountEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keySource Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;.
         * 
         * @return builder
         * 
         */
        public Builder keySource(@Nullable Output<String> keySource) {
            $.keySource = keySource;
            return this;
        }

        /**
         * @param keySource Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;.
         * 
         * @return builder
         * 
         */
        public Builder keySource(String keySource) {
            return keySource(Output.of(keySource));
        }

        public AccountEncryptionArgs build() {
            return $;
        }
    }

}
