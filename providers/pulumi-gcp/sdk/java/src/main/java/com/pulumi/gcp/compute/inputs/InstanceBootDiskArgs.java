// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceBootDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceBootDiskArgs Empty = new InstanceBootDiskArgs();

    /**
     * Whether the disk will be auto-deleted when the instance
     * is deleted. Defaults to true.
     * 
     */
    @Import(name="autoDelete")
    private @Nullable Output<Boolean> autoDelete;

    /**
     * @return Whether the disk will be auto-deleted when the instance
     * is deleted. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    /**
     * Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * A 256-bit [customer-supplied encryption key]
     * (&lt;https://cloud.google.com/compute/docs/disks/customer-supplied-encryption&gt;),
     * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
     * 
     */
    @Import(name="diskEncryptionKeyRaw")
    private @Nullable Output<String> diskEncryptionKeyRaw;

    /**
     * @return A 256-bit [customer-supplied encryption key]
     * (&lt;https://cloud.google.com/compute/docs/disks/customer-supplied-encryption&gt;),
     * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
     * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
     * 
     */
    public Optional<Output<String>> diskEncryptionKeyRaw() {
        return Optional.ofNullable(this.diskEncryptionKeyRaw);
    }

    @Import(name="diskEncryptionKeySha256")
    private @Nullable Output<String> diskEncryptionKeySha256;

    public Optional<Output<String>> diskEncryptionKeySha256() {
        return Optional.ofNullable(this.diskEncryptionKeySha256);
    }

    /**
     * Parameters for a new disk that will be created
     * alongside the new instance. Either `initialize_params` or `source` must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="initializeParams")
    private @Nullable Output<InstanceBootDiskInitializeParamsArgs> initializeParams;

    /**
     * @return Parameters for a new disk that will be created
     * alongside the new instance. Either `initialize_params` or `source` must be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceBootDiskInitializeParamsArgs>> initializeParams() {
        return Optional.ofNullable(this.initializeParams);
    }

    /**
     * The self_link of the encryption key that is
     * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
     * and `disk_encryption_key_raw` may be set.
     * 
     */
    @Import(name="kmsKeySelfLink")
    private @Nullable Output<String> kmsKeySelfLink;

    /**
     * @return The self_link of the encryption key that is
     * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
     * and `disk_encryption_key_raw` may be set.
     * 
     */
    public Optional<Output<String>> kmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }

    /**
     * Either &#34;READ_ONLY&#34; or &#34;READ_WRITE&#34;, defaults to &#34;READ_WRITE&#34;
     * If you have a persistent disk with data that you want to share
     * between multiple instances, detach it from any read-write instances and
     * attach it to one or more instances in read-only mode.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Either &#34;READ_ONLY&#34; or &#34;READ_WRITE&#34;, defaults to &#34;READ_WRITE&#34;
     * If you have a persistent disk with data that you want to share
     * between multiple instances, detach it from any read-write instances and
     * attach it to one or more instances in read-only mode.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name or self_link of the disk to attach to this instance.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The name or self_link of the disk to attach to this instance.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private InstanceBootDiskArgs() {}

    private InstanceBootDiskArgs(InstanceBootDiskArgs $) {
        this.autoDelete = $.autoDelete;
        this.deviceName = $.deviceName;
        this.diskEncryptionKeyRaw = $.diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = $.diskEncryptionKeySha256;
        this.initializeParams = $.initializeParams;
        this.kmsKeySelfLink = $.kmsKeySelfLink;
        this.mode = $.mode;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceBootDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceBootDiskArgs $;

        public Builder() {
            $ = new InstanceBootDiskArgs();
        }

        public Builder(InstanceBootDiskArgs defaults) {
            $ = new InstanceBootDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete Whether the disk will be auto-deleted when the instance
         * is deleted. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param autoDelete Whether the disk will be auto-deleted when the instance
         * is deleted. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        /**
         * @param deviceName Name with which the attached disk will be accessible
         * under `/dev/disk/by-id/google-*`
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName Name with which the attached disk will be accessible
         * under `/dev/disk/by-id/google-*`
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param diskEncryptionKeyRaw A 256-bit [customer-supplied encryption key]
         * (&lt;https://cloud.google.com/compute/docs/disks/customer-supplied-encryption&gt;),
         * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
         * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKeyRaw(@Nullable Output<String> diskEncryptionKeyRaw) {
            $.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        /**
         * @param diskEncryptionKeyRaw A 256-bit [customer-supplied encryption key]
         * (&lt;https://cloud.google.com/compute/docs/disks/customer-supplied-encryption&gt;),
         * encoded in [RFC 4648 base64](https://tools.ietf.org/html/rfc4648#section-4)
         * to encrypt this disk. Only one of `kms_key_self_link` and `disk_encryption_key_raw` may be set.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKeyRaw(String diskEncryptionKeyRaw) {
            return diskEncryptionKeyRaw(Output.of(diskEncryptionKeyRaw));
        }

        public Builder diskEncryptionKeySha256(@Nullable Output<String> diskEncryptionKeySha256) {
            $.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder diskEncryptionKeySha256(String diskEncryptionKeySha256) {
            return diskEncryptionKeySha256(Output.of(diskEncryptionKeySha256));
        }

        /**
         * @param initializeParams Parameters for a new disk that will be created
         * alongside the new instance. Either `initialize_params` or `source` must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(@Nullable Output<InstanceBootDiskInitializeParamsArgs> initializeParams) {
            $.initializeParams = initializeParams;
            return this;
        }

        /**
         * @param initializeParams Parameters for a new disk that will be created
         * alongside the new instance. Either `initialize_params` or `source` must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(InstanceBootDiskInitializeParamsArgs initializeParams) {
            return initializeParams(Output.of(initializeParams));
        }

        /**
         * @param kmsKeySelfLink The self_link of the encryption key that is
         * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
         * and `disk_encryption_key_raw` may be set.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            $.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        /**
         * @param kmsKeySelfLink The self_link of the encryption key that is
         * stored in Google Cloud KMS to encrypt this disk. Only one of `kms_key_self_link`
         * and `disk_encryption_key_raw` may be set.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            return kmsKeySelfLink(Output.of(kmsKeySelfLink));
        }

        /**
         * @param mode Either &#34;READ_ONLY&#34; or &#34;READ_WRITE&#34;, defaults to &#34;READ_WRITE&#34;
         * If you have a persistent disk with data that you want to share
         * between multiple instances, detach it from any read-write instances and
         * attach it to one or more instances in read-only mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Either &#34;READ_ONLY&#34; or &#34;READ_WRITE&#34;, defaults to &#34;READ_WRITE&#34;
         * If you have a persistent disk with data that you want to share
         * between multiple instances, detach it from any read-write instances and
         * attach it to one or more instances in read-only mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param source The name or self_link of the disk to attach to this instance.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The name or self_link of the disk to attach to this instance.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public InstanceBootDiskArgs build() {
            return $;
        }
    }

}
