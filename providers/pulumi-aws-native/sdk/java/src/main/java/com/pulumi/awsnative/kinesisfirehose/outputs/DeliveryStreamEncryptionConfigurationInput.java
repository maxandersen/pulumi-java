// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.outputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationInputKeyType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamEncryptionConfigurationInput {
    private final @Nullable String keyARN;
    private final DeliveryStreamEncryptionConfigurationInputKeyType keyType;

    @CustomType.Constructor
    private DeliveryStreamEncryptionConfigurationInput(
        @CustomType.Parameter("keyARN") @Nullable String keyARN,
        @CustomType.Parameter("keyType") DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
        this.keyARN = keyARN;
        this.keyType = keyType;
    }

    public Optional<String> keyARN() {
        return Optional.ofNullable(this.keyARN);
    }
    public DeliveryStreamEncryptionConfigurationInputKeyType keyType() {
        return this.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfigurationInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyARN;
        private DeliveryStreamEncryptionConfigurationInputKeyType keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfigurationInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyARN = defaults.keyARN;
    	      this.keyType = defaults.keyType;
        }

        public Builder keyARN(@Nullable String keyARN) {
            this.keyARN = keyARN;
            return this;
        }
        public Builder keyType(DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }        public DeliveryStreamEncryptionConfigurationInput build() {
            return new DeliveryStreamEncryptionConfigurationInput(keyARN, keyType);
        }
    }
}
