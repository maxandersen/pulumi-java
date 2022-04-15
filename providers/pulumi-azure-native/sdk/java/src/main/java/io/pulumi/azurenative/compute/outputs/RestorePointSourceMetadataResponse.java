// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.compute.outputs.OSProfileResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointSourceVMStorageProfileResponse;
import io.pulumi.azurenative.compute.outputs.SecurityProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RestorePointSourceMetadataResponse {
    /**
     * Gets the diagnostics profile.
     * 
     */
    private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;
    /**
     * Gets the hardware profile.
     * 
     */
    private final @Nullable HardwareProfileResponse hardwareProfile;
    /**
     * Gets the license type, which is for bring your own license scenario.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * Location of the VM from which the restore point was created.
     * 
     */
    private final @Nullable String location;
    /**
     * Gets the OS profile.
     * 
     */
    private final @Nullable OSProfileResponse osProfile;
    /**
     * Gets the security profile.
     * 
     */
    private final @Nullable SecurityProfileResponse securityProfile;
    /**
     * Gets the storage profile.
     * 
     */
    private final @Nullable RestorePointSourceVMStorageProfileResponse storageProfile;
    /**
     * Gets the virtual machine unique id.
     * 
     */
    private final @Nullable String vmId;

    @CustomType.Constructor
    private RestorePointSourceMetadataResponse(
        @CustomType.Parameter("diagnosticsProfile") @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @CustomType.Parameter("hardwareProfile") @Nullable HardwareProfileResponse hardwareProfile,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("osProfile") @Nullable OSProfileResponse osProfile,
        @CustomType.Parameter("securityProfile") @Nullable SecurityProfileResponse securityProfile,
        @CustomType.Parameter("storageProfile") @Nullable RestorePointSourceVMStorageProfileResponse storageProfile,
        @CustomType.Parameter("vmId") @Nullable String vmId) {
        this.diagnosticsProfile = diagnosticsProfile;
        this.hardwareProfile = hardwareProfile;
        this.licenseType = licenseType;
        this.location = location;
        this.osProfile = osProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.vmId = vmId;
    }

    /**
     * Gets the diagnostics profile.
     * 
    */
    public Optional<DiagnosticsProfileResponse> diagnosticsProfile() {
        return Optional.ofNullable(this.diagnosticsProfile);
    }
    /**
     * Gets the hardware profile.
     * 
    */
    public Optional<HardwareProfileResponse> hardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }
    /**
     * Gets the license type, which is for bring your own license scenario.
     * 
    */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * Location of the VM from which the restore point was created.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets the OS profile.
     * 
    */
    public Optional<OSProfileResponse> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * Gets the security profile.
     * 
    */
    public Optional<SecurityProfileResponse> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    /**
     * Gets the storage profile.
     * 
    */
    public Optional<RestorePointSourceVMStorageProfileResponse> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * Gets the virtual machine unique id.
     * 
    */
    public Optional<String> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private @Nullable String licenseType;
        private @Nullable String location;
        private @Nullable OSProfileResponse osProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable RestorePointSourceVMStorageProfileResponse storageProfile;
        private @Nullable String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.osProfile = defaults.osProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.vmId = defaults.vmId;
        }

        public Builder diagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }
        public Builder hardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder osProfile(@Nullable OSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }
        public Builder securityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }
        public Builder storageProfile(@Nullable RestorePointSourceVMStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }        public RestorePointSourceMetadataResponse build() {
            return new RestorePointSourceMetadataResponse(diagnosticsProfile, hardwareProfile, licenseType, location, osProfile, securityProfile, storageProfile, vmId);
        }
    }
}
