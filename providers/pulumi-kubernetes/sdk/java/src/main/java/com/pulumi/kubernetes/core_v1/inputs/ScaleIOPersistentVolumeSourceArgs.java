// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.SecretReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
 * 
 */
public final class ScaleIOPersistentVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleIOPersistentVolumeSourceArgs Empty = new ScaleIOPersistentVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Default is &#34;xfs&#34;
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * The host address of the ScaleIO API Gateway.
     * 
     */
    @Import(name="gateway", required=true)
    private Output<String> gateway;

    public Output<String> gateway() {
        return this.gateway;
    }

    /**
     * The name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    @Import(name="protectionDomain")
    private @Nullable Output<String> protectionDomain;

    public Optional<Output<String>> protectionDomain() {
        return Optional.ofNullable(this.protectionDomain);
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    @Import(name="secretRef", required=true)
    private Output<SecretReferenceArgs> secretRef;

    public Output<SecretReferenceArgs> secretRef() {
        return this.secretRef;
    }

    /**
     * Flag to enable/disable SSL communication with Gateway, default false
     * 
     */
    @Import(name="sslEnabled")
    private @Nullable Output<Boolean> sslEnabled;

    public Optional<Output<Boolean>> sslEnabled() {
        return Optional.ofNullable(this.sslEnabled);
    }

    /**
     * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    @Import(name="storageMode")
    private @Nullable Output<String> storageMode;

    public Optional<Output<String>> storageMode() {
        return Optional.ofNullable(this.storageMode);
    }

    /**
     * The ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    @Import(name="storagePool")
    private @Nullable Output<String> storagePool;

    public Optional<Output<String>> storagePool() {
        return Optional.ofNullable(this.storagePool);
    }

    /**
     * The name of the storage system as configured in ScaleIO.
     * 
     */
    @Import(name="system", required=true)
    private Output<String> system;

    public Output<String> system() {
        return this.system;
    }

    /**
     * The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    @Import(name="volumeName")
    private @Nullable Output<String> volumeName;

    public Optional<Output<String>> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    private ScaleIOPersistentVolumeSourceArgs() {}

    private ScaleIOPersistentVolumeSourceArgs(ScaleIOPersistentVolumeSourceArgs $) {
        this.fsType = $.fsType;
        this.gateway = $.gateway;
        this.protectionDomain = $.protectionDomain;
        this.readOnly = $.readOnly;
        this.secretRef = $.secretRef;
        this.sslEnabled = $.sslEnabled;
        this.storageMode = $.storageMode;
        this.storagePool = $.storagePool;
        this.system = $.system;
        this.volumeName = $.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleIOPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleIOPersistentVolumeSourceArgs $;

        public Builder() {
            $ = new ScaleIOPersistentVolumeSourceArgs();
        }

        public Builder(ScaleIOPersistentVolumeSourceArgs defaults) {
            $ = new ScaleIOPersistentVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        public Builder gateway(Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public Builder protectionDomain(@Nullable Output<String> protectionDomain) {
            $.protectionDomain = protectionDomain;
            return this;
        }

        public Builder protectionDomain(String protectionDomain) {
            return protectionDomain(Output.of(protectionDomain));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder secretRef(Output<SecretReferenceArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        public Builder secretRef(SecretReferenceArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        public Builder sslEnabled(@Nullable Output<Boolean> sslEnabled) {
            $.sslEnabled = sslEnabled;
            return this;
        }

        public Builder sslEnabled(Boolean sslEnabled) {
            return sslEnabled(Output.of(sslEnabled));
        }

        public Builder storageMode(@Nullable Output<String> storageMode) {
            $.storageMode = storageMode;
            return this;
        }

        public Builder storageMode(String storageMode) {
            return storageMode(Output.of(storageMode));
        }

        public Builder storagePool(@Nullable Output<String> storagePool) {
            $.storagePool = storagePool;
            return this;
        }

        public Builder storagePool(String storagePool) {
            return storagePool(Output.of(storagePool));
        }

        public Builder system(Output<String> system) {
            $.system = system;
            return this;
        }

        public Builder system(String system) {
            return system(Output.of(system));
        }

        public Builder volumeName(@Nullable Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        public ScaleIOPersistentVolumeSourceArgs build() {
            $.gateway = Objects.requireNonNull($.gateway, "expected parameter 'gateway' to be non-null");
            $.secretRef = Objects.requireNonNull($.secretRef, "expected parameter 'secretRef' to be non-null");
            $.system = Objects.requireNonNull($.system, "expected parameter 'system' to be non-null");
            return $;
        }
    }

}
