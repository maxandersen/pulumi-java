// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryS3Encryption extends com.pulumi.resources.InvokeArgs {

    public static final CanaryS3Encryption Empty = new CanaryS3Encryption();

    /**
     * Encryption mode for encrypting artifacts when uploading to S3. Valid values: SSE_S3 and SSE_KMS.
     * 
     */
    @Import(name="encryptionMode")
    private @Nullable String encryptionMode;

    public Optional<String> encryptionMode() {
        return Optional.ofNullable(this.encryptionMode);
    }

    /**
     * KMS key Arn for encrypting artifacts when uploading to S3. You must specify KMS key Arn for SSE_KMS encryption mode only.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable String kmsKeyArn;

    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    private CanaryS3Encryption() {}

    private CanaryS3Encryption(CanaryS3Encryption $) {
        this.encryptionMode = $.encryptionMode;
        this.kmsKeyArn = $.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanaryS3Encryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanaryS3Encryption $;

        public Builder() {
            $ = new CanaryS3Encryption();
        }

        public Builder(CanaryS3Encryption defaults) {
            $ = new CanaryS3Encryption(Objects.requireNonNull(defaults));
        }

        public Builder encryptionMode(@Nullable String encryptionMode) {
            $.encryptionMode = encryptionMode;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public CanaryS3Encryption build() {
            return $;
        }
    }

}
