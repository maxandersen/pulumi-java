// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt For more information, see [Creating a wrapped key] (https://cloud.google.com/dlp/docs/create-wrapped-key). Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
 * 
 */
public final class GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs Empty = new GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs();

    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    @Import(name="cryptoKeyName", required=true)
    private Output<String> cryptoKeyName;

    public Output<String> cryptoKeyName() {
        return this.cryptoKeyName;
    }

    /**
     * The wrapped data crypto key.
     * 
     */
    @Import(name="wrappedKey", required=true)
    private Output<String> wrappedKey;

    public Output<String> wrappedKey() {
        return this.wrappedKey;
    }

    private GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs() {}

    private GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs(GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs $) {
        this.cryptoKeyName = $.cryptoKeyName;
        this.wrappedKey = $.wrappedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs();
        }

        public Builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs defaults) {
            $ = new GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder cryptoKeyName(Output<String> cryptoKeyName) {
            $.cryptoKeyName = cryptoKeyName;
            return this;
        }

        public Builder cryptoKeyName(String cryptoKeyName) {
            return cryptoKeyName(Output.of(cryptoKeyName));
        }

        public Builder wrappedKey(Output<String> wrappedKey) {
            $.wrappedKey = wrappedKey;
            return this;
        }

        public Builder wrappedKey(String wrappedKey) {
            return wrappedKey(Output.of(wrappedKey));
        }

        public GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs build() {
            $.cryptoKeyName = Objects.requireNonNull($.cryptoKeyName, "expected parameter 'cryptoKeyName' to be non-null");
            $.wrappedKey = Objects.requireNonNull($.wrappedKey, "expected parameter 'wrappedKey' to be non-null");
            return $;
        }
    }

}
