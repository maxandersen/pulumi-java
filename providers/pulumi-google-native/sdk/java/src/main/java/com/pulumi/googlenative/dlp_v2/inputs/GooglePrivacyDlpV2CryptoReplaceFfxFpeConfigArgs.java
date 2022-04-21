// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoKeyArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `ReidentifyContent` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See https://cloud.google.com/dlp/docs/pseudonymization to learn more. Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
 * 
 */
public final class GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs Empty = new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs();

    /**
     * Common alphabets.
     * 
     */
    @Import(name="commonAlphabet")
    private @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet;

    public Optional<Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet>> commonAlphabet() {
        return Optional.ofNullable(this.commonAlphabet);
    }

    /**
     * The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used. If the context is set but: 1. there is no record present when transforming a given value or 1. the field is not present when transforming a given value, a default tweak will be used. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string. The tweak is constructed as a sequence of bytes in big endian byte order such that: - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in UTF-8 format followed by a single byte of value 2
     * 
     */
    @Import(name="context")
    private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context;

    public Optional<Output<GooglePrivacyDlpV2FieldIdArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The key used by the encryption algorithm.
     * 
     */
    @Import(name="cryptoKey", required=true)
    private Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;

    public Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey() {
        return this.cryptoKey;
    }

    /**
     * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range [2, 95]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is: 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|\:;&#34;&#39;&lt;,&gt;.?/
     * 
     */
    @Import(name="customAlphabet")
    private @Nullable Output<String> customAlphabet;

    public Optional<Output<String>> customAlphabet() {
        return Optional.ofNullable(this.customAlphabet);
    }

    /**
     * The native way to select the alphabet. Must be in the range [2, 95].
     * 
     */
    @Import(name="radix")
    private @Nullable Output<Integer> radix;

    public Optional<Output<Integer>> radix() {
        return Optional.ofNullable(this.radix);
    }

    /**
     * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info_type_name(surrogate_character_count):surrogate For example, if the name of custom infoType is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY_TOKEN_INFO_TYPE(3):abc&#39; This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text. In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
     * 
     */
    @Import(name="surrogateInfoType")
    private @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType;

    public Optional<Output<GooglePrivacyDlpV2InfoTypeArgs>> surrogateInfoType() {
        return Optional.ofNullable(this.surrogateInfoType);
    }

    private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs() {}

    private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs $) {
        this.commonAlphabet = $.commonAlphabet;
        this.context = $.context;
        this.cryptoKey = $.cryptoKey;
        this.customAlphabet = $.customAlphabet;
        this.radix = $.radix;
        this.surrogateInfoType = $.surrogateInfoType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder commonAlphabet(@Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet) {
            $.commonAlphabet = commonAlphabet;
            return this;
        }

        public Builder commonAlphabet(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet commonAlphabet) {
            return commonAlphabet(Output.of(commonAlphabet));
        }

        public Builder context(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context) {
            $.context = context;
            return this;
        }

        public Builder context(GooglePrivacyDlpV2FieldIdArgs context) {
            return context(Output.of(context));
        }

        public Builder cryptoKey(Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        public Builder cryptoKey(GooglePrivacyDlpV2CryptoKeyArgs cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        public Builder customAlphabet(@Nullable Output<String> customAlphabet) {
            $.customAlphabet = customAlphabet;
            return this;
        }

        public Builder customAlphabet(String customAlphabet) {
            return customAlphabet(Output.of(customAlphabet));
        }

        public Builder radix(@Nullable Output<Integer> radix) {
            $.radix = radix;
            return this;
        }

        public Builder radix(Integer radix) {
            return radix(Output.of(radix));
        }

        public Builder surrogateInfoType(@Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType) {
            $.surrogateInfoType = surrogateInfoType;
            return this;
        }

        public Builder surrogateInfoType(GooglePrivacyDlpV2InfoTypeArgs surrogateInfoType) {
            return surrogateInfoType(Output.of(surrogateInfoType));
        }

        public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs build() {
            $.cryptoKey = Objects.requireNonNull($.cryptoKey, "expected parameter 'cryptoKey' to be non-null");
            return $;
        }
    }

}
