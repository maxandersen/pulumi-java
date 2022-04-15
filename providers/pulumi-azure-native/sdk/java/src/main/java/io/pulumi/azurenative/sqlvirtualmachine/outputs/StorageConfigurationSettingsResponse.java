// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.azurenative.sqlvirtualmachine.outputs.SQLStorageSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageConfigurationSettingsResponse {
    /**
     * Disk configuration to apply to SQL Server.
     * 
     */
    private final @Nullable String diskConfigurationType;
    /**
     * SQL Server Data Storage Settings.
     * 
     */
    private final @Nullable SQLStorageSettingsResponse sqlDataSettings;
    /**
     * SQL Server Log Storage Settings.
     * 
     */
    private final @Nullable SQLStorageSettingsResponse sqlLogSettings;
    /**
     * SQL Server TempDb Storage Settings.
     * 
     */
    private final @Nullable SQLStorageSettingsResponse sqlTempDbSettings;
    /**
     * Storage workload type.
     * 
     */
    private final @Nullable String storageWorkloadType;

    @CustomType.Constructor
    private StorageConfigurationSettingsResponse(
        @CustomType.Parameter("diskConfigurationType") @Nullable String diskConfigurationType,
        @CustomType.Parameter("sqlDataSettings") @Nullable SQLStorageSettingsResponse sqlDataSettings,
        @CustomType.Parameter("sqlLogSettings") @Nullable SQLStorageSettingsResponse sqlLogSettings,
        @CustomType.Parameter("sqlTempDbSettings") @Nullable SQLStorageSettingsResponse sqlTempDbSettings,
        @CustomType.Parameter("storageWorkloadType") @Nullable String storageWorkloadType) {
        this.diskConfigurationType = diskConfigurationType;
        this.sqlDataSettings = sqlDataSettings;
        this.sqlLogSettings = sqlLogSettings;
        this.sqlTempDbSettings = sqlTempDbSettings;
        this.storageWorkloadType = storageWorkloadType;
    }

    /**
     * Disk configuration to apply to SQL Server.
     * 
    */
    public Optional<String> diskConfigurationType() {
        return Optional.ofNullable(this.diskConfigurationType);
    }
    /**
     * SQL Server Data Storage Settings.
     * 
    */
    public Optional<SQLStorageSettingsResponse> sqlDataSettings() {
        return Optional.ofNullable(this.sqlDataSettings);
    }
    /**
     * SQL Server Log Storage Settings.
     * 
    */
    public Optional<SQLStorageSettingsResponse> sqlLogSettings() {
        return Optional.ofNullable(this.sqlLogSettings);
    }
    /**
     * SQL Server TempDb Storage Settings.
     * 
    */
    public Optional<SQLStorageSettingsResponse> sqlTempDbSettings() {
        return Optional.ofNullable(this.sqlTempDbSettings);
    }
    /**
     * Storage workload type.
     * 
    */
    public Optional<String> storageWorkloadType() {
        return Optional.ofNullable(this.storageWorkloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageConfigurationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskConfigurationType;
        private @Nullable SQLStorageSettingsResponse sqlDataSettings;
        private @Nullable SQLStorageSettingsResponse sqlLogSettings;
        private @Nullable SQLStorageSettingsResponse sqlTempDbSettings;
        private @Nullable String storageWorkloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageConfigurationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigurationType = defaults.diskConfigurationType;
    	      this.sqlDataSettings = defaults.sqlDataSettings;
    	      this.sqlLogSettings = defaults.sqlLogSettings;
    	      this.sqlTempDbSettings = defaults.sqlTempDbSettings;
    	      this.storageWorkloadType = defaults.storageWorkloadType;
        }

        public Builder diskConfigurationType(@Nullable String diskConfigurationType) {
            this.diskConfigurationType = diskConfigurationType;
            return this;
        }
        public Builder sqlDataSettings(@Nullable SQLStorageSettingsResponse sqlDataSettings) {
            this.sqlDataSettings = sqlDataSettings;
            return this;
        }
        public Builder sqlLogSettings(@Nullable SQLStorageSettingsResponse sqlLogSettings) {
            this.sqlLogSettings = sqlLogSettings;
            return this;
        }
        public Builder sqlTempDbSettings(@Nullable SQLStorageSettingsResponse sqlTempDbSettings) {
            this.sqlTempDbSettings = sqlTempDbSettings;
            return this;
        }
        public Builder storageWorkloadType(@Nullable String storageWorkloadType) {
            this.storageWorkloadType = storageWorkloadType;
            return this;
        }        public StorageConfigurationSettingsResponse build() {
            return new StorageConfigurationSettingsResponse(diskConfigurationType, sqlDataSettings, sqlLogSettings, sqlTempDbSettings, storageWorkloadType);
        }
    }
}
