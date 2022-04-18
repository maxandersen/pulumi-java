// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.azurenative.portal.outputs.StorageProfileResponse;
import com.pulumi.azurenative.portal.outputs.TerminalSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserPropertiesResponse {
    /**
     * The preferred location of the cloud shell.
     * 
     */
    private final String preferredLocation;
    /**
     * The operating system type of the cloud shell. Deprecated, use preferredShellType.
     * 
     */
    private final String preferredOsType;
    /**
     * The shell type of the cloud shell.
     * 
     */
    private final String preferredShellType;
    /**
     * The storage profile of the user settings.
     * 
     */
    private final StorageProfileResponse storageProfile;
    /**
     * Settings for terminal appearance.
     * 
     */
    private final TerminalSettingsResponse terminalSettings;

    @CustomType.Constructor
    private UserPropertiesResponse(
        @CustomType.Parameter("preferredLocation") String preferredLocation,
        @CustomType.Parameter("preferredOsType") String preferredOsType,
        @CustomType.Parameter("preferredShellType") String preferredShellType,
        @CustomType.Parameter("storageProfile") StorageProfileResponse storageProfile,
        @CustomType.Parameter("terminalSettings") TerminalSettingsResponse terminalSettings) {
        this.preferredLocation = preferredLocation;
        this.preferredOsType = preferredOsType;
        this.preferredShellType = preferredShellType;
        this.storageProfile = storageProfile;
        this.terminalSettings = terminalSettings;
    }

    /**
     * The preferred location of the cloud shell.
     * 
    */
    public String preferredLocation() {
        return this.preferredLocation;
    }
    /**
     * The operating system type of the cloud shell. Deprecated, use preferredShellType.
     * 
    */
    public String preferredOsType() {
        return this.preferredOsType;
    }
    /**
     * The shell type of the cloud shell.
     * 
    */
    public String preferredShellType() {
        return this.preferredShellType;
    }
    /**
     * The storage profile of the user settings.
     * 
    */
    public StorageProfileResponse storageProfile() {
        return this.storageProfile;
    }
    /**
     * Settings for terminal appearance.
     * 
    */
    public TerminalSettingsResponse terminalSettings() {
        return this.terminalSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String preferredLocation;
        private String preferredOsType;
        private String preferredShellType;
        private StorageProfileResponse storageProfile;
        private TerminalSettingsResponse terminalSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredLocation = defaults.preferredLocation;
    	      this.preferredOsType = defaults.preferredOsType;
    	      this.preferredShellType = defaults.preferredShellType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.terminalSettings = defaults.terminalSettings;
        }

        public Builder preferredLocation(String preferredLocation) {
            this.preferredLocation = Objects.requireNonNull(preferredLocation);
            return this;
        }
        public Builder preferredOsType(String preferredOsType) {
            this.preferredOsType = Objects.requireNonNull(preferredOsType);
            return this;
        }
        public Builder preferredShellType(String preferredShellType) {
            this.preferredShellType = Objects.requireNonNull(preferredShellType);
            return this;
        }
        public Builder storageProfile(StorageProfileResponse storageProfile) {
            this.storageProfile = Objects.requireNonNull(storageProfile);
            return this;
        }
        public Builder terminalSettings(TerminalSettingsResponse terminalSettings) {
            this.terminalSettings = Objects.requireNonNull(terminalSettings);
            return this;
        }        public UserPropertiesResponse build() {
            return new UserPropertiesResponse(preferredLocation, preferredOsType, preferredShellType, storageProfile, terminalSettings);
        }
    }
}
