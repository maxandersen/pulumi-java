// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.DiskEncryptionSettingsResponse;
import com.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskInstanceViewResponse {
    /**
     * Specifies the encryption settings for the OS Disk. <br><br> Minimum api-version: 2015-06-15
     * 
     */
    private final @Nullable List<DiskEncryptionSettingsResponse> encryptionSettings;
    /**
     * The disk name.
     * 
     */
    private final @Nullable String name;
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    @CustomType.Constructor
    private DiskInstanceViewResponse(
        @CustomType.Parameter("encryptionSettings") @Nullable List<DiskEncryptionSettingsResponse> encryptionSettings,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("statuses") @Nullable List<InstanceViewStatusResponse> statuses) {
        this.encryptionSettings = encryptionSettings;
        this.name = name;
        this.statuses = statuses;
    }

    /**
     * Specifies the encryption settings for the OS Disk. <br><br> Minimum api-version: 2015-06-15
     * 
    */
    public List<DiskEncryptionSettingsResponse> encryptionSettings() {
        return this.encryptionSettings == null ? List.of() : this.encryptionSettings;
    }
    /**
     * The disk name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DiskEncryptionSettingsResponse> encryptionSettings;
        private @Nullable String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
        }

        public Builder encryptionSettings(@Nullable List<DiskEncryptionSettingsResponse> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }
        public Builder encryptionSettings(DiskEncryptionSettingsResponse... encryptionSettings) {
            return encryptionSettings(List.of(encryptionSettings));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }        public DiskInstanceViewResponse build() {
            return new DiskInstanceViewResponse(encryptionSettings, name, statuses);
        }
    }
}
