// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.inputs;

import com.pulumi.azurenative.desktopvirtualization.enums.Operation;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for arm migration.
 * 
 */
public final class MigrationRequestPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrationRequestPropertiesArgs Empty = new MigrationRequestPropertiesArgs();

    /**
     * The path to the legacy object to migrate.
     * 
     */
    @Import(name="migrationPath")
    private @Nullable Output<String> migrationPath;

    public Optional<Output<String>> migrationPath() {
        return Optional.ofNullable(this.migrationPath);
    }

    /**
     * The type of operation for migration.
     * 
     */
    @Import(name="operation")
    private @Nullable Output<Either<String,Operation>> operation;

    public Optional<Output<Either<String,Operation>>> operation() {
        return Optional.ofNullable(this.operation);
    }

    private MigrationRequestPropertiesArgs() {}

    private MigrationRequestPropertiesArgs(MigrationRequestPropertiesArgs $) {
        this.migrationPath = $.migrationPath;
        this.operation = $.operation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationRequestPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationRequestPropertiesArgs $;

        public Builder() {
            $ = new MigrationRequestPropertiesArgs();
        }

        public Builder(MigrationRequestPropertiesArgs defaults) {
            $ = new MigrationRequestPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder migrationPath(@Nullable Output<String> migrationPath) {
            $.migrationPath = migrationPath;
            return this;
        }

        public Builder migrationPath(String migrationPath) {
            return migrationPath(Output.of(migrationPath));
        }

        public Builder operation(@Nullable Output<Either<String,Operation>> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(Either<String,Operation> operation) {
            return operation(Output.of(operation));
        }

        public MigrationRequestPropertiesArgs build() {
            return $;
        }
    }

}
