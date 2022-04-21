// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.forecast.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionConfigProperties extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigProperties Empty = new EncryptionConfigProperties();

    @Import(name="kmsKeyArn")
    private @Nullable String kmsKeyArn;

    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    @Import(name="roleArn")
    private @Nullable String roleArn;

    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private EncryptionConfigProperties() {}

    private EncryptionConfigProperties(EncryptionConfigProperties $) {
        this.kmsKeyArn = $.kmsKeyArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigProperties $;

        public Builder() {
            $ = new EncryptionConfigProperties();
        }

        public Builder(EncryptionConfigProperties defaults) {
            $ = new EncryptionConfigProperties(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public EncryptionConfigProperties build() {
            return $;
        }
    }

}
