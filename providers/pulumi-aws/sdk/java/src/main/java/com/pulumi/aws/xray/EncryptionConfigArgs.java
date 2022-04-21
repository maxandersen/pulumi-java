// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.xray;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * An AWS KMS customer master key (CMK) ARN.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private EncryptionConfigArgs() {}

    private EncryptionConfigArgs(EncryptionConfigArgs $) {
        this.keyId = $.keyId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigArgs $;

        public Builder() {
            $ = new EncryptionConfigArgs();
        }

        public Builder(EncryptionConfigArgs defaults) {
            $ = new EncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public EncryptionConfigArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
