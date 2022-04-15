// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class representing the databases solution summary.
 * 
 */
public final class DatabasesSolutionSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabasesSolutionSummaryResponse Empty = new DatabasesSolutionSummaryResponse();

    /**
     * Gets or sets the count of database instances assessed.
     * 
     */
    @Import(name="databaseInstancesAssessedCount")
      private final @Nullable Integer databaseInstancesAssessedCount;

    public Optional<Integer> databaseInstancesAssessedCount() {
        return this.databaseInstancesAssessedCount == null ? Optional.empty() : Optional.ofNullable(this.databaseInstancesAssessedCount);
    }

    /**
     * Gets or sets the count of databases assessed.
     * 
     */
    @Import(name="databasesAssessedCount")
      private final @Nullable Integer databasesAssessedCount;

    public Optional<Integer> databasesAssessedCount() {
        return this.databasesAssessedCount == null ? Optional.empty() : Optional.ofNullable(this.databasesAssessedCount);
    }

    /**
     * Gets the Instance type.
     * Expected value is 'Databases'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Gets or sets the count of databases ready for migration.
     * 
     */
    @Import(name="migrationReadyCount")
      private final @Nullable Integer migrationReadyCount;

    public Optional<Integer> migrationReadyCount() {
        return this.migrationReadyCount == null ? Optional.empty() : Optional.ofNullable(this.migrationReadyCount);
    }

    public DatabasesSolutionSummaryResponse(
        @Nullable Integer databaseInstancesAssessedCount,
        @Nullable Integer databasesAssessedCount,
        String instanceType,
        @Nullable Integer migrationReadyCount) {
        this.databaseInstancesAssessedCount = databaseInstancesAssessedCount;
        this.databasesAssessedCount = databasesAssessedCount;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.migrationReadyCount = migrationReadyCount;
    }

    private DatabasesSolutionSummaryResponse() {
        this.databaseInstancesAssessedCount = null;
        this.databasesAssessedCount = null;
        this.instanceType = null;
        this.migrationReadyCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabasesSolutionSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer databaseInstancesAssessedCount;
        private @Nullable Integer databasesAssessedCount;
        private String instanceType;
        private @Nullable Integer migrationReadyCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabasesSolutionSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseInstancesAssessedCount = defaults.databaseInstancesAssessedCount;
    	      this.databasesAssessedCount = defaults.databasesAssessedCount;
    	      this.instanceType = defaults.instanceType;
    	      this.migrationReadyCount = defaults.migrationReadyCount;
        }

        public Builder databaseInstancesAssessedCount(@Nullable Integer databaseInstancesAssessedCount) {
            this.databaseInstancesAssessedCount = databaseInstancesAssessedCount;
            return this;
        }
        public Builder databasesAssessedCount(@Nullable Integer databasesAssessedCount) {
            this.databasesAssessedCount = databasesAssessedCount;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder migrationReadyCount(@Nullable Integer migrationReadyCount) {
            this.migrationReadyCount = migrationReadyCount;
            return this;
        }        public DatabasesSolutionSummaryResponse build() {
            return new DatabasesSolutionSummaryResponse(databaseInstancesAssessedCount, databasesAssessedCount, instanceType, migrationReadyCount);
        }
    }
}
