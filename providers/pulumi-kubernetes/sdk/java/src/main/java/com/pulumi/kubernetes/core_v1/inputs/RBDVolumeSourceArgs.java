// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 * 
 */
public final class RBDVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RBDVolumeSourceArgs Empty = new RBDVolumeSourceArgs();

    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> fsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> image() {
        return this.image;
    }

    /**
     * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="keyring")
      private final @Nullable Output<String> keyring;

    public Output<String> keyring() {
        return this.keyring == null ? Codegen.empty() : this.keyring;
    }

    /**
     * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="monitors", required=true)
      private final Output<List<String>> monitors;

    public Output<List<String>> monitors() {
        return this.monitors;
    }

    /**
     * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="pool")
      private final @Nullable Output<String> pool;

    public Output<String> pool() {
        return this.pool == null ? Codegen.empty() : this.pool;
    }

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<LocalObjectReferenceArgs> secretRef;

    public Output<LocalObjectReferenceArgs> secretRef() {
        return this.secretRef == null ? Codegen.empty() : this.secretRef;
    }

    /**
     * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> user() {
        return this.user == null ? Codegen.empty() : this.user;
    }

    public RBDVolumeSourceArgs(
        @Nullable Output<String> fsType,
        Output<String> image,
        @Nullable Output<String> keyring,
        Output<List<String>> monitors,
        @Nullable Output<String> pool,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<LocalObjectReferenceArgs> secretRef,
        @Nullable Output<String> user) {
        this.fsType = fsType;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.keyring = keyring;
        this.monitors = Objects.requireNonNull(monitors, "expected parameter 'monitors' to be non-null");
        this.pool = pool;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.user = user;
    }

    private RBDVolumeSourceArgs() {
        this.fsType = Codegen.empty();
        this.image = Codegen.empty();
        this.keyring = Codegen.empty();
        this.monitors = Codegen.empty();
        this.pool = Codegen.empty();
        this.readOnly = Codegen.empty();
        this.secretRef = Codegen.empty();
        this.user = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RBDVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private Output<String> image;
        private @Nullable Output<String> keyring;
        private Output<List<String>> monitors;
        private @Nullable Output<String> pool;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<LocalObjectReferenceArgs> secretRef;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(RBDVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.image = defaults.image;
    	      this.keyring = defaults.keyring;
    	      this.monitors = defaults.monitors;
    	      this.pool = defaults.pool;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
            return this;
        }
        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }
        public Builder keyring(@Nullable Output<String> keyring) {
            this.keyring = keyring;
            return this;
        }
        public Builder keyring(@Nullable String keyring) {
            this.keyring = Codegen.ofNullable(keyring);
            return this;
        }
        public Builder monitors(Output<List<String>> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }
        public Builder monitors(List<String> monitors) {
            this.monitors = Output.of(Objects.requireNonNull(monitors));
            return this;
        }
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }
        public Builder pool(@Nullable Output<String> pool) {
            this.pool = pool;
            return this;
        }
        public Builder pool(@Nullable String pool) {
            this.pool = Codegen.ofNullable(pool);
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Codegen.ofNullable(readOnly);
            return this;
        }
        public Builder secretRef(@Nullable Output<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder secretRef(@Nullable LocalObjectReferenceArgs secretRef) {
            this.secretRef = Codegen.ofNullable(secretRef);
            return this;
        }
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = Codegen.ofNullable(user);
            return this;
        }        public RBDVolumeSourceArgs build() {
            return new RBDVolumeSourceArgs(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
        }
    }
}
