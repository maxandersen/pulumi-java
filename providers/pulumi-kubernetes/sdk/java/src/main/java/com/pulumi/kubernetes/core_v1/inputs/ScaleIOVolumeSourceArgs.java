// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 * 
 */
public final class ScaleIOVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleIOVolumeSourceArgs Empty = new ScaleIOVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;.
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> fsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * The host address of the ScaleIO API Gateway.
     * 
     */
    @Import(name="gateway", required=true)
      private final Output<String> gateway;

    public Output<String> gateway() {
        return this.gateway;
    }

    /**
     * The name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    @Import(name="protectionDomain")
      private final @Nullable Output<String> protectionDomain;

    public Output<String> protectionDomain() {
        return this.protectionDomain == null ? Codegen.empty() : this.protectionDomain;
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    @Import(name="secretRef", required=true)
      private final Output<LocalObjectReferenceArgs> secretRef;

    public Output<LocalObjectReferenceArgs> secretRef() {
        return this.secretRef;
    }

    /**
     * Flag to enable/disable SSL communication with Gateway, default false
     * 
     */
    @Import(name="sslEnabled")
      private final @Nullable Output<Boolean> sslEnabled;

    public Output<Boolean> sslEnabled() {
        return this.sslEnabled == null ? Codegen.empty() : this.sslEnabled;
    }

    /**
     * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    @Import(name="storageMode")
      private final @Nullable Output<String> storageMode;

    public Output<String> storageMode() {
        return this.storageMode == null ? Codegen.empty() : this.storageMode;
    }

    /**
     * The ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    @Import(name="storagePool")
      private final @Nullable Output<String> storagePool;

    public Output<String> storagePool() {
        return this.storagePool == null ? Codegen.empty() : this.storagePool;
    }

    /**
     * The name of the storage system as configured in ScaleIO.
     * 
     */
    @Import(name="system", required=true)
      private final Output<String> system;

    public Output<String> system() {
        return this.system;
    }

    /**
     * The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    @Import(name="volumeName")
      private final @Nullable Output<String> volumeName;

    public Output<String> volumeName() {
        return this.volumeName == null ? Codegen.empty() : this.volumeName;
    }

    public ScaleIOVolumeSourceArgs(
        @Nullable Output<String> fsType,
        Output<String> gateway,
        @Nullable Output<String> protectionDomain,
        @Nullable Output<Boolean> readOnly,
        Output<LocalObjectReferenceArgs> secretRef,
        @Nullable Output<Boolean> sslEnabled,
        @Nullable Output<String> storageMode,
        @Nullable Output<String> storagePool,
        Output<String> system,
        @Nullable Output<String> volumeName) {
        this.fsType = fsType;
        this.gateway = Objects.requireNonNull(gateway, "expected parameter 'gateway' to be non-null");
        this.protectionDomain = protectionDomain;
        this.readOnly = readOnly;
        this.secretRef = Objects.requireNonNull(secretRef, "expected parameter 'secretRef' to be non-null");
        this.sslEnabled = sslEnabled;
        this.storageMode = storageMode;
        this.storagePool = storagePool;
        this.system = Objects.requireNonNull(system, "expected parameter 'system' to be non-null");
        this.volumeName = volumeName;
    }

    private ScaleIOVolumeSourceArgs() {
        this.fsType = Codegen.empty();
        this.gateway = Codegen.empty();
        this.protectionDomain = Codegen.empty();
        this.readOnly = Codegen.empty();
        this.secretRef = Codegen.empty();
        this.sslEnabled = Codegen.empty();
        this.storageMode = Codegen.empty();
        this.storagePool = Codegen.empty();
        this.system = Codegen.empty();
        this.volumeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleIOVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private Output<String> gateway;
        private @Nullable Output<String> protectionDomain;
        private @Nullable Output<Boolean> readOnly;
        private Output<LocalObjectReferenceArgs> secretRef;
        private @Nullable Output<Boolean> sslEnabled;
        private @Nullable Output<String> storageMode;
        private @Nullable Output<String> storagePool;
        private Output<String> system;
        private @Nullable Output<String> volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleIOVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.gateway = defaults.gateway;
    	      this.protectionDomain = defaults.protectionDomain;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.storageMode = defaults.storageMode;
    	      this.storagePool = defaults.storagePool;
    	      this.system = defaults.system;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
            return this;
        }
        public Builder gateway(Output<String> gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }
        public Builder gateway(String gateway) {
            this.gateway = Output.of(Objects.requireNonNull(gateway));
            return this;
        }
        public Builder protectionDomain(@Nullable Output<String> protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }
        public Builder protectionDomain(@Nullable String protectionDomain) {
            this.protectionDomain = Codegen.ofNullable(protectionDomain);
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
        public Builder secretRef(Output<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }
        public Builder secretRef(LocalObjectReferenceArgs secretRef) {
            this.secretRef = Output.of(Objects.requireNonNull(secretRef));
            return this;
        }
        public Builder sslEnabled(@Nullable Output<Boolean> sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }
        public Builder sslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = Codegen.ofNullable(sslEnabled);
            return this;
        }
        public Builder storageMode(@Nullable Output<String> storageMode) {
            this.storageMode = storageMode;
            return this;
        }
        public Builder storageMode(@Nullable String storageMode) {
            this.storageMode = Codegen.ofNullable(storageMode);
            return this;
        }
        public Builder storagePool(@Nullable Output<String> storagePool) {
            this.storagePool = storagePool;
            return this;
        }
        public Builder storagePool(@Nullable String storagePool) {
            this.storagePool = Codegen.ofNullable(storagePool);
            return this;
        }
        public Builder system(Output<String> system) {
            this.system = Objects.requireNonNull(system);
            return this;
        }
        public Builder system(String system) {
            this.system = Output.of(Objects.requireNonNull(system));
            return this;
        }
        public Builder volumeName(@Nullable Output<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public Builder volumeName(@Nullable String volumeName) {
            this.volumeName = Codegen.ofNullable(volumeName);
            return this;
        }        public ScaleIOVolumeSourceArgs build() {
            return new ScaleIOVolumeSourceArgs(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
        }
    }
}
