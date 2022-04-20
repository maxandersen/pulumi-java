// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoKeyArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
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
      private final @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet;

    public Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet() {
        return this.commonAlphabet == null ? Codegen.empty() : this.commonAlphabet;
    }

    /**
     * The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used. If the context is set but: 1. there is no record present when transforming a given value or 1. the field is not present when transforming a given value, a default tweak will be used. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string. The tweak is constructed as a sequence of bytes in big endian byte order such that: - a 64 bit integer is encoded followed by a single byte of value 1 - a string is encoded in UTF-8 format followed by a single byte of value 2
     * 
     */
    @Import(name="context")
      private final @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context;

    public Output<GooglePrivacyDlpV2FieldIdArgs> context() {
        return this.context == null ? Codegen.empty() : this.context;
    }

    /**
     * The key used by the encryption algorithm.
     * 
     */
    @Import(name="cryptoKey", required=true)
      private final Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;

    public Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey() {
        return this.cryptoKey;
    }

    /**
     * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range [2, 95]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is: 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|\:;&#34;&#39;&lt;,&gt;.?/
     * 
     */
    @Import(name="customAlphabet")
      private final @Nullable Output<String> customAlphabet;

    public Output<String> customAlphabet() {
        return this.customAlphabet == null ? Codegen.empty() : this.customAlphabet;
    }

    /**
     * The native way to select the alphabet. Must be in the range [2, 95].
     * 
     */
    @Import(name="radix")
      private final @Nullable Output<Integer> radix;

    public Output<Integer> radix() {
        return this.radix == null ? Codegen.empty() : this.radix;
    }

    /**
     * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info_type_name(surrogate_character_count):surrogate For example, if the name of custom infoType is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY_TOKEN_INFO_TYPE(3):abc&#39; This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text. In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
     * 
     */
    @Import(name="surrogateInfoType")
      private final @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType;

    public Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType() {
        return this.surrogateInfoType == null ? Codegen.empty() : this.surrogateInfoType;
    }

    public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs(
        @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet,
        @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context,
        Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey,
        @Nullable Output<String> customAlphabet,
        @Nullable Output<Integer> radix,
        @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType) {
        this.commonAlphabet = commonAlphabet;
        this.context = context;
        this.cryptoKey = Objects.requireNonNull(cryptoKey, "expected parameter 'cryptoKey' to be non-null");
        this.customAlphabet = customAlphabet;
        this.radix = radix;
        this.surrogateInfoType = surrogateInfoType;
    }

    private GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs() {
        this.commonAlphabet = Codegen.empty();
        this.context = Codegen.empty();
        this.cryptoKey = Codegen.empty();
        this.customAlphabet = Codegen.empty();
        this.radix = Codegen.empty();
        this.surrogateInfoType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet;
        private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context;
        private Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;
        private @Nullable Output<String> customAlphabet;
        private @Nullable Output<Integer> radix;
        private @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAlphabet = defaults.commonAlphabet;
    	      this.context = defaults.context;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.customAlphabet = defaults.customAlphabet;
    	      this.radix = defaults.radix;
    	      this.surrogateInfoType = defaults.surrogateInfoType;
        }

        public Builder commonAlphabet(@Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet> commonAlphabet) {
            this.commonAlphabet = commonAlphabet;
            return this;
        }
        public Builder commonAlphabet(@Nullable GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigCommonAlphabet commonAlphabet) {
            this.commonAlphabet = Codegen.ofNullable(commonAlphabet);
            return this;
        }
        public Builder context(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context) {
            this.context = context;
            return this;
        }
        public Builder context(@Nullable GooglePrivacyDlpV2FieldIdArgs context) {
            this.context = Codegen.ofNullable(context);
            return this;
        }
        public Builder cryptoKey(Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }
        public Builder cryptoKey(GooglePrivacyDlpV2CryptoKeyArgs cryptoKey) {
            this.cryptoKey = Output.of(Objects.requireNonNull(cryptoKey));
            return this;
        }
        public Builder customAlphabet(@Nullable Output<String> customAlphabet) {
            this.customAlphabet = customAlphabet;
            return this;
        }
        public Builder customAlphabet(@Nullable String customAlphabet) {
            this.customAlphabet = Codegen.ofNullable(customAlphabet);
            return this;
        }
        public Builder radix(@Nullable Output<Integer> radix) {
            this.radix = radix;
            return this;
        }
        public Builder radix(@Nullable Integer radix) {
            this.radix = Codegen.ofNullable(radix);
            return this;
        }
        public Builder surrogateInfoType(@Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType) {
            this.surrogateInfoType = surrogateInfoType;
            return this;
        }
        public Builder surrogateInfoType(@Nullable GooglePrivacyDlpV2InfoTypeArgs surrogateInfoType) {
            this.surrogateInfoType = Codegen.ofNullable(surrogateInfoType);
            return this;
        }        public GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs build() {
            return new GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs(commonAlphabet, context, cryptoKey, customAlphabet, radix, surrogateInfoType);
        }
    }
}
