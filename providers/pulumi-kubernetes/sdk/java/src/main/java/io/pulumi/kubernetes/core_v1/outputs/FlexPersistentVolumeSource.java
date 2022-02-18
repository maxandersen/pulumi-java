// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexPersistentVolumeSource {
    /**
     * Driver is the name of the driver to use for this volume.
     * 
     */
    private final String driver;
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     * 
     */
    private final @Nullable String fsType;
    /**
     * Optional: Extra command options if any.
     * 
     */
    private final @Nullable Map<String,String> options;
    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    private final @Nullable SecretReference secretRef;

    @OutputCustomType.Constructor({"driver","fsType","options","readOnly","secretRef"})
    private FlexPersistentVolumeSource(
        String driver,
        @Nullable String fsType,
        @Nullable Map<String,String> options,
        @Nullable Boolean readOnly,
        @Nullable SecretReference secretRef) {
        this.driver = Objects.requireNonNull(driver);
        this.fsType = fsType;
        this.options = options;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
    }

    /**
     * Driver is the name of the driver to use for this volume.
     * 
     */
    public String getDriver() {
        return this.driver;
    }
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
     * 
     */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * Optional: Extra command options if any.
     * 
     */
    public Map<String,String> getOptions() {
        return this.options == null ? Map.of() : this.options;
    }
    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
     * 
     */
    public Optional<SecretReference> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String driver;
        private @Nullable String fsType;
        private @Nullable Map<String,String> options;
        private @Nullable Boolean readOnly;
        private @Nullable SecretReference secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.options = defaults.options;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder setDriver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setOptions(@Nullable Map<String,String> options) {
            this.options = options;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretRef(@Nullable SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public FlexPersistentVolumeSource build() {
            return new FlexPersistentVolumeSource(driver, fsType, options, readOnly, secretRef);
        }
    }
}
