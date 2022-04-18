// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.LinuxUserConfigurationResponse;
import com.pulumi.azurenative.batch.inputs.WindowsUserConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserAccountResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAccountResponse Empty = new UserAccountResponse();

    /**
     * nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    @Import(name="elevationLevel")
      private final @Nullable String elevationLevel;

    public Optional<String> elevationLevel() {
        return this.elevationLevel == null ? Optional.empty() : Optional.ofNullable(this.elevationLevel);
    }

    /**
     * This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
     */
    @Import(name="linuxUserConfiguration")
      private final @Nullable LinuxUserConfigurationResponse linuxUserConfiguration;

    public Optional<LinuxUserConfigurationResponse> linuxUserConfiguration() {
        return this.linuxUserConfiguration == null ? Optional.empty() : Optional.ofNullable(this.linuxUserConfiguration);
    }

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="password", required=true)
      private final String password;

    public String password() {
        return this.password;
    }

    /**
     * This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
     */
    @Import(name="windowsUserConfiguration")
      private final @Nullable WindowsUserConfigurationResponse windowsUserConfiguration;

    public Optional<WindowsUserConfigurationResponse> windowsUserConfiguration() {
        return this.windowsUserConfiguration == null ? Optional.empty() : Optional.ofNullable(this.windowsUserConfiguration);
    }

    public UserAccountResponse(
        @Nullable String elevationLevel,
        @Nullable LinuxUserConfigurationResponse linuxUserConfiguration,
        String name,
        String password,
        @Nullable WindowsUserConfigurationResponse windowsUserConfiguration) {
        this.elevationLevel = elevationLevel;
        this.linuxUserConfiguration = linuxUserConfiguration;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.windowsUserConfiguration = windowsUserConfiguration;
    }

    private UserAccountResponse() {
        this.elevationLevel = null;
        this.linuxUserConfiguration = null;
        this.name = null;
        this.password = null;
        this.windowsUserConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String elevationLevel;
        private @Nullable LinuxUserConfigurationResponse linuxUserConfiguration;
        private String name;
        private String password;
        private @Nullable WindowsUserConfigurationResponse windowsUserConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.linuxUserConfiguration = defaults.linuxUserConfiguration;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.windowsUserConfiguration = defaults.windowsUserConfiguration;
        }

        public Builder elevationLevel(@Nullable String elevationLevel) {
            this.elevationLevel = elevationLevel;
            return this;
        }
        public Builder linuxUserConfiguration(@Nullable LinuxUserConfigurationResponse linuxUserConfiguration) {
            this.linuxUserConfiguration = linuxUserConfiguration;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder windowsUserConfiguration(@Nullable WindowsUserConfigurationResponse windowsUserConfiguration) {
            this.windowsUserConfiguration = windowsUserConfiguration;
            return this;
        }        public UserAccountResponse build() {
            return new UserAccountResponse(elevationLevel, linuxUserConfiguration, name, password, windowsUserConfiguration);
        }
    }
}
