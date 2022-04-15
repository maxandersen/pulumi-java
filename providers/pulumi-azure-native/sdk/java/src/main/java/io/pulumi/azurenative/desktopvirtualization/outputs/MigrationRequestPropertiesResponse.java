// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationRequestPropertiesResponse {
    /**
     * The path to the legacy object to migrate.
     * 
     */
    private final @Nullable String migrationPath;
    /**
     * The type of operation for migration.
     * 
     */
    private final @Nullable String operation;

    @CustomType.Constructor
    private MigrationRequestPropertiesResponse(
        @CustomType.Parameter("migrationPath") @Nullable String migrationPath,
        @CustomType.Parameter("operation") @Nullable String operation) {
        this.migrationPath = migrationPath;
        this.operation = operation;
    }

    /**
     * The path to the legacy object to migrate.
     * 
    */
    public Optional<String> migrationPath() {
        return Optional.ofNullable(this.migrationPath);
    }
    /**
     * The type of operation for migration.
     * 
    */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationRequestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String migrationPath;
        private @Nullable String operation;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationRequestPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrationPath = defaults.migrationPath;
    	      this.operation = defaults.operation;
        }

        public Builder migrationPath(@Nullable String migrationPath) {
            this.migrationPath = migrationPath;
            return this;
        }
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }        public MigrationRequestPropertiesResponse build() {
            return new MigrationRequestPropertiesResponse(migrationPath, operation);
        }
    }
}
