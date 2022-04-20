// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.EncryptionSettingsElementResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption settings for disk or snapshot
 * 
 */
public final class EncryptionSettingsCollectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionSettingsCollectionResponse Empty = new EncryptionSettingsCollectionResponse();

    /**
     * Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * A collection of encryption settings, one for each disk volume.
     * 
     */
    @Import(name="encryptionSettings")
      private final @Nullable List<EncryptionSettingsElementResponse> encryptionSettings;

    public List<EncryptionSettingsElementResponse> encryptionSettings() {
        return this.encryptionSettings == null ? List.of() : this.encryptionSettings;
    }

    /**
     * Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. &#39;1.0&#39; corresponds to Azure Disk Encryption with AAD app.&#39;1.1&#39; corresponds to Azure Disk Encryption.
     * 
     */
    @Import(name="encryptionSettingsVersion")
      private final @Nullable String encryptionSettingsVersion;

    public Optional<String> encryptionSettingsVersion() {
        return this.encryptionSettingsVersion == null ? Optional.empty() : Optional.ofNullable(this.encryptionSettingsVersion);
    }

    public EncryptionSettingsCollectionResponse(
        Boolean enabled,
        @Nullable List<EncryptionSettingsElementResponse> encryptionSettings,
        @Nullable String encryptionSettingsVersion) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.encryptionSettings = encryptionSettings;
        this.encryptionSettingsVersion = encryptionSettingsVersion;
    }

    private EncryptionSettingsCollectionResponse() {
        this.enabled = null;
        this.encryptionSettings = List.of();
        this.encryptionSettingsVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionSettingsCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable List<EncryptionSettingsElementResponse> encryptionSettings;
        private @Nullable String encryptionSettingsVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionSettingsCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.encryptionSettingsVersion = defaults.encryptionSettingsVersion;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder encryptionSettings(@Nullable List<EncryptionSettingsElementResponse> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }
        public Builder encryptionSettings(EncryptionSettingsElementResponse... encryptionSettings) {
            return encryptionSettings(List.of(encryptionSettings));
        }
        public Builder encryptionSettingsVersion(@Nullable String encryptionSettingsVersion) {
            this.encryptionSettingsVersion = encryptionSettingsVersion;
            return this;
        }        public EncryptionSettingsCollectionResponse build() {
            return new EncryptionSettingsCollectionResponse(enabled, encryptionSettings, encryptionSettingsVersion);
        }
    }
}
