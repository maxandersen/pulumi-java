// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationInputKeyType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfigurationInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamEncryptionConfigurationInputArgs Empty = new DeliveryStreamEncryptionConfigurationInputArgs();

    @Import(name="keyARN")
    private @Nullable Output<String> keyARN;

    public Optional<Output<String>> keyARN() {
        return Optional.ofNullable(this.keyARN);
    }

    @Import(name="keyType", required=true)
    private Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType;

    public Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType() {
        return this.keyType;
    }

    private DeliveryStreamEncryptionConfigurationInputArgs() {}

    private DeliveryStreamEncryptionConfigurationInputArgs(DeliveryStreamEncryptionConfigurationInputArgs $) {
        this.keyARN = $.keyARN;
        this.keyType = $.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamEncryptionConfigurationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamEncryptionConfigurationInputArgs $;

        public Builder() {
            $ = new DeliveryStreamEncryptionConfigurationInputArgs();
        }

        public Builder(DeliveryStreamEncryptionConfigurationInputArgs defaults) {
            $ = new DeliveryStreamEncryptionConfigurationInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyARN(@Nullable Output<String> keyARN) {
            $.keyARN = keyARN;
            return this;
        }

        public Builder keyARN(String keyARN) {
            return keyARN(Output.of(keyARN));
        }

        public Builder keyType(Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder keyType(DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
            return keyType(Output.of(keyType));
        }

        public DeliveryStreamEncryptionConfigurationInputArgs build() {
            $.keyType = Objects.requireNonNull($.keyType, "expected parameter 'keyType' to be non-null");
            return $;
        }
    }

}
