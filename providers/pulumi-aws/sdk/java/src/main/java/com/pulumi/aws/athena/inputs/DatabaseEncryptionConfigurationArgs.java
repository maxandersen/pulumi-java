// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseEncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseEncryptionConfigurationArgs Empty = new DatabaseEncryptionConfigurationArgs();

    /**
     * The type of key; one of `SSE_S3`, `SSE_KMS`, `CSE_KMS`
     * 
     */
    @Import(name="encryptionOption", required=true)
    private Output<String> encryptionOption;

    public Output<String> encryptionOption() {
        return this.encryptionOption;
    }

    /**
     * The KMS key ARN or ID; required for key types `SSE_KMS` and `CSE_KMS`.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    private DatabaseEncryptionConfigurationArgs() {}

    private DatabaseEncryptionConfigurationArgs(DatabaseEncryptionConfigurationArgs $) {
        this.encryptionOption = $.encryptionOption;
        this.kmsKey = $.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseEncryptionConfigurationArgs $;

        public Builder() {
            $ = new DatabaseEncryptionConfigurationArgs();
        }

        public Builder(DatabaseEncryptionConfigurationArgs defaults) {
            $ = new DatabaseEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder encryptionOption(Output<String> encryptionOption) {
            $.encryptionOption = encryptionOption;
            return this;
        }

        public Builder encryptionOption(String encryptionOption) {
            return encryptionOption(Output.of(encryptionOption));
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public DatabaseEncryptionConfigurationArgs build() {
            $.encryptionOption = Objects.requireNonNull($.encryptionOption, "expected parameter 'encryptionOption' to be non-null");
            return $;
        }
    }

}
