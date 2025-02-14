// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This defines the format used to record keys used in the software supply chain. An in-toto link is attested using one or more keys defined in the in-toto layout. An example of this is: { &#34;key_id&#34;: &#34;776a00e29f3559e0141b3b096f696abc6cfb0c657ab40f441132b345b0...&#34;, &#34;key_type&#34;: &#34;rsa&#34;, &#34;public_key_value&#34;: &#34;-----BEGIN PUBLIC KEY-----\nMIIBojANBgkqhkiG9w0B...&#34;, &#34;key_scheme&#34;: &#34;rsassa-pss-sha256&#34; } The format for in-toto&#39;s key definition can be found in section 4.2 of the in-toto specification.
 * 
 */
public final class SigningKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SigningKeyArgs Empty = new SigningKeyArgs();

    /**
     * key_id is an identifier for the signing key.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return key_id is an identifier for the signing key.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * This field contains the corresponding signature scheme. Eg: &#34;rsassa-pss-sha256&#34;.
     * 
     */
    @Import(name="keyScheme")
    private @Nullable Output<String> keyScheme;

    /**
     * @return This field contains the corresponding signature scheme. Eg: &#34;rsassa-pss-sha256&#34;.
     * 
     */
    public Optional<Output<String>> keyScheme() {
        return Optional.ofNullable(this.keyScheme);
    }

    /**
     * This field identifies the specific signing method. Eg: &#34;rsa&#34;, &#34;ed25519&#34;, and &#34;ecdsa&#34;.
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<String> keyType;

    /**
     * @return This field identifies the specific signing method. Eg: &#34;rsa&#34;, &#34;ed25519&#34;, and &#34;ecdsa&#34;.
     * 
     */
    public Optional<Output<String>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * This field contains the actual public key.
     * 
     */
    @Import(name="publicKeyValue")
    private @Nullable Output<String> publicKeyValue;

    /**
     * @return This field contains the actual public key.
     * 
     */
    public Optional<Output<String>> publicKeyValue() {
        return Optional.ofNullable(this.publicKeyValue);
    }

    private SigningKeyArgs() {}

    private SigningKeyArgs(SigningKeyArgs $) {
        this.keyId = $.keyId;
        this.keyScheme = $.keyScheme;
        this.keyType = $.keyType;
        this.publicKeyValue = $.publicKeyValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningKeyArgs $;

        public Builder() {
            $ = new SigningKeyArgs();
        }

        public Builder(SigningKeyArgs defaults) {
            $ = new SigningKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId key_id is an identifier for the signing key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId key_id is an identifier for the signing key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param keyScheme This field contains the corresponding signature scheme. Eg: &#34;rsassa-pss-sha256&#34;.
         * 
         * @return builder
         * 
         */
        public Builder keyScheme(@Nullable Output<String> keyScheme) {
            $.keyScheme = keyScheme;
            return this;
        }

        /**
         * @param keyScheme This field contains the corresponding signature scheme. Eg: &#34;rsassa-pss-sha256&#34;.
         * 
         * @return builder
         * 
         */
        public Builder keyScheme(String keyScheme) {
            return keyScheme(Output.of(keyScheme));
        }

        /**
         * @param keyType This field identifies the specific signing method. Eg: &#34;rsa&#34;, &#34;ed25519&#34;, and &#34;ecdsa&#34;.
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Output<String> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType This field identifies the specific signing method. Eg: &#34;rsa&#34;, &#34;ed25519&#34;, and &#34;ecdsa&#34;.
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param publicKeyValue This field contains the actual public key.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyValue(@Nullable Output<String> publicKeyValue) {
            $.publicKeyValue = publicKeyValue;
            return this;
        }

        /**
         * @param publicKeyValue This field contains the actual public key.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyValue(String publicKeyValue) {
            return publicKeyValue(Output.of(publicKeyValue));
        }

        public SigningKeyArgs build() {
            return $;
        }
    }

}
