// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsAcl;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsGid;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsKmsKey;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsMode;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsStorageClass;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsSymlink;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsTemporaryHold;
import com.pulumi.googlenative.storagetransfer_v1.enums.MetadataOptionsUid;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the metadata options for running a transfer.
 * 
 */
public final class MetadataOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataOptionsArgs Empty = new MetadataOptionsArgs();

    /**
     * Specifies how each object&#39;s ACLs should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as ACL_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @Import(name="acl")
      private final @Nullable Output<MetadataOptionsAcl> acl;

    public Output<MetadataOptionsAcl> acl() {
        return this.acl == null ? Codegen.empty() : this.acl;
    }

    /**
     * Specifies how each file&#39;s GID attribute should be handled by the transfer. If unspecified, the default behavior is the same as GID_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="gid")
      private final @Nullable Output<MetadataOptionsGid> gid;

    public Output<MetadataOptionsGid> gid() {
        return this.gid == null ? Codegen.empty() : this.gid;
    }

    /**
     * Specifies how each object&#39;s Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<MetadataOptionsKmsKey> kmsKey;

    public Output<MetadataOptionsKmsKey> kmsKey() {
        return this.kmsKey == null ? Codegen.empty() : this.kmsKey;
    }

    /**
     * Specifies how each file&#39;s mode attribute should be handled by the transfer. If unspecified, the default behavior is the same as MODE_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<MetadataOptionsMode> mode;

    public Output<MetadataOptionsMode> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<MetadataOptionsStorageClass> storageClass;

    public Output<MetadataOptionsStorageClass> storageClass() {
        return this.storageClass == null ? Codegen.empty() : this.storageClass;
    }

    /**
     * Specifies how symlinks should be handled by the transfer. If unspecified, the default behavior is the same as SYMLINK_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="symlink")
      private final @Nullable Output<MetadataOptionsSymlink> symlink;

    public Output<MetadataOptionsSymlink> symlink() {
        return this.symlink == null ? Codegen.empty() : this.symlink;
    }

    /**
     * Specifies how each object&#39;s temporary hold status should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as TEMPORARY_HOLD_PRESERVE.
     * 
     */
    @Import(name="temporaryHold")
      private final @Nullable Output<MetadataOptionsTemporaryHold> temporaryHold;

    public Output<MetadataOptionsTemporaryHold> temporaryHold() {
        return this.temporaryHold == null ? Codegen.empty() : this.temporaryHold;
    }

    /**
     * Specifies how each file&#39;s UID attribute should be handled by the transfer. If unspecified, the default behavior is the same as UID_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<MetadataOptionsUid> uid;

    public Output<MetadataOptionsUid> uid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    public MetadataOptionsArgs(
        @Nullable Output<MetadataOptionsAcl> acl,
        @Nullable Output<MetadataOptionsGid> gid,
        @Nullable Output<MetadataOptionsKmsKey> kmsKey,
        @Nullable Output<MetadataOptionsMode> mode,
        @Nullable Output<MetadataOptionsStorageClass> storageClass,
        @Nullable Output<MetadataOptionsSymlink> symlink,
        @Nullable Output<MetadataOptionsTemporaryHold> temporaryHold,
        @Nullable Output<MetadataOptionsUid> uid) {
        this.acl = acl;
        this.gid = gid;
        this.kmsKey = kmsKey;
        this.mode = mode;
        this.storageClass = storageClass;
        this.symlink = symlink;
        this.temporaryHold = temporaryHold;
        this.uid = uid;
    }

    private MetadataOptionsArgs() {
        this.acl = Codegen.empty();
        this.gid = Codegen.empty();
        this.kmsKey = Codegen.empty();
        this.mode = Codegen.empty();
        this.storageClass = Codegen.empty();
        this.symlink = Codegen.empty();
        this.temporaryHold = Codegen.empty();
        this.uid = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MetadataOptionsAcl> acl;
        private @Nullable Output<MetadataOptionsGid> gid;
        private @Nullable Output<MetadataOptionsKmsKey> kmsKey;
        private @Nullable Output<MetadataOptionsMode> mode;
        private @Nullable Output<MetadataOptionsStorageClass> storageClass;
        private @Nullable Output<MetadataOptionsSymlink> symlink;
        private @Nullable Output<MetadataOptionsTemporaryHold> temporaryHold;
        private @Nullable Output<MetadataOptionsUid> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.gid = defaults.gid;
    	      this.kmsKey = defaults.kmsKey;
    	      this.mode = defaults.mode;
    	      this.storageClass = defaults.storageClass;
    	      this.symlink = defaults.symlink;
    	      this.temporaryHold = defaults.temporaryHold;
    	      this.uid = defaults.uid;
        }

        public Builder acl(@Nullable Output<MetadataOptionsAcl> acl) {
            this.acl = acl;
            return this;
        }
        public Builder acl(@Nullable MetadataOptionsAcl acl) {
            this.acl = Codegen.ofNullable(acl);
            return this;
        }
        public Builder gid(@Nullable Output<MetadataOptionsGid> gid) {
            this.gid = gid;
            return this;
        }
        public Builder gid(@Nullable MetadataOptionsGid gid) {
            this.gid = Codegen.ofNullable(gid);
            return this;
        }
        public Builder kmsKey(@Nullable Output<MetadataOptionsKmsKey> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable MetadataOptionsKmsKey kmsKey) {
            this.kmsKey = Codegen.ofNullable(kmsKey);
            return this;
        }
        public Builder mode(@Nullable Output<MetadataOptionsMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable MetadataOptionsMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder storageClass(@Nullable Output<MetadataOptionsStorageClass> storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public Builder storageClass(@Nullable MetadataOptionsStorageClass storageClass) {
            this.storageClass = Codegen.ofNullable(storageClass);
            return this;
        }
        public Builder symlink(@Nullable Output<MetadataOptionsSymlink> symlink) {
            this.symlink = symlink;
            return this;
        }
        public Builder symlink(@Nullable MetadataOptionsSymlink symlink) {
            this.symlink = Codegen.ofNullable(symlink);
            return this;
        }
        public Builder temporaryHold(@Nullable Output<MetadataOptionsTemporaryHold> temporaryHold) {
            this.temporaryHold = temporaryHold;
            return this;
        }
        public Builder temporaryHold(@Nullable MetadataOptionsTemporaryHold temporaryHold) {
            this.temporaryHold = Codegen.ofNullable(temporaryHold);
            return this;
        }
        public Builder uid(@Nullable Output<MetadataOptionsUid> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable MetadataOptionsUid uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }        public MetadataOptionsArgs build() {
            return new MetadataOptionsArgs(acl, gid, kmsKey, mode, storageClass, symlink, temporaryHold, uid);
        }
    }
}
