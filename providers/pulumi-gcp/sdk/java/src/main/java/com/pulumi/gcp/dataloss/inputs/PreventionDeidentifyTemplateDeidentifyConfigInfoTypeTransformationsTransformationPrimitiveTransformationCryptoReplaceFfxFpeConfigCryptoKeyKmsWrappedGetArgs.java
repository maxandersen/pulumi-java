// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs();

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
     * A base64-encoded string.
     * 
     */
    @Import(name="wrappedKey", required=true)
    private Output<String> wrappedKey;

    public Output<String> wrappedKey() {
        return this.wrappedKey;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs $) {
        this.cryptoKeyName = $.cryptoKeyName;
        this.wrappedKey = $.wrappedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs(Objects.requireNonNull(defaults));
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

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedGetArgs build() {
            $.cryptoKeyName = Objects.requireNonNull($.cryptoKeyName, "expected parameter 'cryptoKeyName' to be non-null");
            $.wrappedKey = Objects.requireNonNull($.wrappedKey, "expected parameter 'wrappedKey' to be non-null");
            return $;
        }
    }

}
