// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.BackupScheduleResponse;
import io.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppBackupConfigurationResult {
    /**
     * Name of the backup.
     * 
     */
    private final @Nullable String backupName;
    /**
     * Schedule for the backup if it is executed periodically.
     * 
     */
    private final @Nullable BackupScheduleResponse backupSchedule;
    /**
     * Databases included in the backup.
     * 
     */
    private final @Nullable List<DatabaseBackupSettingResponse> databases;
    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * SAS URL to the container.
     * 
     */
    private final String storageAccountUrl;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListWebAppBackupConfigurationResult(
        @CustomType.Parameter("backupName") @Nullable String backupName,
        @CustomType.Parameter("backupSchedule") @Nullable BackupScheduleResponse backupSchedule,
        @CustomType.Parameter("databases") @Nullable List<DatabaseBackupSettingResponse> databases,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccountUrl") String storageAccountUrl,
        @CustomType.Parameter("type") String type) {
        this.backupName = backupName;
        this.backupSchedule = backupSchedule;
        this.databases = databases;
        this.enabled = enabled;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.storageAccountUrl = storageAccountUrl;
        this.type = type;
    }

    /**
     * Name of the backup.
     * 
    */
    public Optional<String> backupName() {
        return Optional.ofNullable(this.backupName);
    }
    /**
     * Schedule for the backup if it is executed periodically.
     * 
    */
    public Optional<BackupScheduleResponse> backupSchedule() {
        return Optional.ofNullable(this.backupSchedule);
    }
    /**
     * Databases included in the backup.
     * 
    */
    public List<DatabaseBackupSettingResponse> databases() {
        return this.databases == null ? List.of() : this.databases;
    }
    /**
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be disabled.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * SAS URL to the container.
     * 
    */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppBackupConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupName;
        private @Nullable BackupScheduleResponse backupSchedule;
        private @Nullable List<DatabaseBackupSettingResponse> databases;
        private @Nullable Boolean enabled;
        private String id;
        private @Nullable String kind;
        private String name;
        private String storageAccountUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppBackupConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupName = defaults.backupName;
    	      this.backupSchedule = defaults.backupSchedule;
    	      this.databases = defaults.databases;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
    	      this.type = defaults.type;
        }

        public Builder backupName(@Nullable String backupName) {
            this.backupName = backupName;
            return this;
        }
        public Builder backupSchedule(@Nullable BackupScheduleResponse backupSchedule) {
            this.backupSchedule = backupSchedule;
            return this;
        }
        public Builder databases(@Nullable List<DatabaseBackupSettingResponse> databases) {
            this.databases = databases;
            return this;
        }
        public Builder databases(DatabaseBackupSettingResponse... databases) {
            return databases(List.of(databases));
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ListWebAppBackupConfigurationResult build() {
            return new ListWebAppBackupConfigurationResult(backupName, backupSchedule, databases, enabled, id, kind, name, storageAccountUrl, type);
        }
    }
}
