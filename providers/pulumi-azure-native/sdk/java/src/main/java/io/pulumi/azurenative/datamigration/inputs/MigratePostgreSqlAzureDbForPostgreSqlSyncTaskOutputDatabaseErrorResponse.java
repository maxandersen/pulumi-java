// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SyncMigrationDatabaseErrorEventResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse();

    /**
     * Error message
     * 
     */
    @Import(name="errorMessage")
      private final @Nullable String errorMessage;

    public Optional<String> errorMessage() {
        return this.errorMessage == null ? Optional.empty() : Optional.ofNullable(this.errorMessage);
    }

    /**
     * List of error events.
     * 
     */
    @Import(name="events")
      private final @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;

    public List<SyncMigrationDatabaseErrorEventResponse> events() {
        return this.events == null ? List.of() : this.events;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'DatabaseLevelErrorOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse(
        @Nullable String errorMessage,
        @Nullable List<SyncMigrationDatabaseErrorEventResponse> events,
        String id,
        String resultType) {
        this.errorMessage = errorMessage;
        this.events = events;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse() {
        this.errorMessage = null;
        this.events = List.of();
        this.id = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.events = defaults.events;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Builder events(@Nullable List<SyncMigrationDatabaseErrorEventResponse> events) {
            this.events = events;
            return this;
        }
        public Builder events(SyncMigrationDatabaseErrorEventResponse... events) {
            return events(List.of(events));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputDatabaseErrorResponse(errorMessage, events, id, resultType);
        }
    }
}
