// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import com.pulumi.azurenative.compute.outputs.DiskEncryptionSettingsResponse;
import com.pulumi.azurenative.compute.outputs.ManagedDiskParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RestorePointSourceVMOSDiskResponse {
    /**
     * Gets the caching type.
     * 
     */
    private final @Nullable String caching;
    /**
     * Gets the disk restore point Id.
     * 
     */
    private final @Nullable ApiEntityReferenceResponse diskRestorePoint;
    /**
     * Gets the disk size in GB.
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * Gets the disk encryption settings.
     * 
     */
    private final @Nullable DiskEncryptionSettingsResponse encryptionSettings;
    /**
     * Gets the managed disk details
     * 
     */
    private final @Nullable ManagedDiskParametersResponse managedDisk;
    /**
     * Gets the disk name.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets the Operating System type.
     * 
     */
    private final @Nullable String osType;

    @CustomType.Constructor
    private RestorePointSourceVMOSDiskResponse(
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("diskRestorePoint") @Nullable ApiEntityReferenceResponse diskRestorePoint,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("encryptionSettings") @Nullable DiskEncryptionSettingsResponse encryptionSettings,
        @CustomType.Parameter("managedDisk") @Nullable ManagedDiskParametersResponse managedDisk,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("osType") @Nullable String osType) {
        this.caching = caching;
        this.diskRestorePoint = diskRestorePoint;
        this.diskSizeGB = diskSizeGB;
        this.encryptionSettings = encryptionSettings;
        this.managedDisk = managedDisk;
        this.name = name;
        this.osType = osType;
    }

    /**
     * Gets the caching type.
     * 
    */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * Gets the disk restore point Id.
     * 
    */
    public Optional<ApiEntityReferenceResponse> diskRestorePoint() {
        return Optional.ofNullable(this.diskRestorePoint);
    }
    /**
     * Gets the disk size in GB.
     * 
    */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * Gets the disk encryption settings.
     * 
    */
    public Optional<DiskEncryptionSettingsResponse> encryptionSettings() {
        return Optional.ofNullable(this.encryptionSettings);
    }
    /**
     * Gets the managed disk details
     * 
    */
    public Optional<ManagedDiskParametersResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * Gets the disk name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets the Operating System type.
     * 
    */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceVMOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private @Nullable ApiEntityReferenceResponse diskRestorePoint;
        private @Nullable Integer diskSizeGB;
        private @Nullable DiskEncryptionSettingsResponse encryptionSettings;
        private @Nullable ManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable String osType;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceVMOSDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.diskRestorePoint = defaults.diskRestorePoint;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        public Builder diskRestorePoint(@Nullable ApiEntityReferenceResponse diskRestorePoint) {
            this.diskRestorePoint = diskRestorePoint;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder encryptionSettings(@Nullable DiskEncryptionSettingsResponse encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }
        public Builder managedDisk(@Nullable ManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }        public RestorePointSourceVMOSDiskResponse build() {
            return new RestorePointSourceVMOSDiskResponse(caching, diskRestorePoint, diskSizeGB, encryptionSettings, managedDisk, name, osType);
        }
    }
}
