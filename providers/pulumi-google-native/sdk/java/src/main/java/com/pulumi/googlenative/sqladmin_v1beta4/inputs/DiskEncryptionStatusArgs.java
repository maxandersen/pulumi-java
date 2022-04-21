// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Disk encryption status for an instance.
 * 
 */
public final class DiskEncryptionStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionStatusArgs Empty = new DiskEncryptionStatusArgs();

    /**
     * This is always `sql#diskEncryptionStatus`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * KMS key version used to encrypt the Cloud SQL instance resource
     * 
     */
    @Import(name="kmsKeyVersionName")
    private @Nullable Output<String> kmsKeyVersionName;

    public Optional<Output<String>> kmsKeyVersionName() {
        return Optional.ofNullable(this.kmsKeyVersionName);
    }

    private DiskEncryptionStatusArgs() {}

    private DiskEncryptionStatusArgs(DiskEncryptionStatusArgs $) {
        this.kind = $.kind;
        this.kmsKeyVersionName = $.kmsKeyVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskEncryptionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskEncryptionStatusArgs $;

        public Builder() {
            $ = new DiskEncryptionStatusArgs();
        }

        public Builder(DiskEncryptionStatusArgs defaults) {
            $ = new DiskEncryptionStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder kmsKeyVersionName(@Nullable Output<String> kmsKeyVersionName) {
            $.kmsKeyVersionName = kmsKeyVersionName;
            return this;
        }

        public Builder kmsKeyVersionName(String kmsKeyVersionName) {
            return kmsKeyVersionName(Output.of(kmsKeyVersionName));
        }

        public DiskEncryptionStatusArgs build() {
            return $;
        }
    }

}
