// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Types of validations to run after the migration
 * 
 */
public final class MigrationValidationOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrationValidationOptionsArgs Empty = new MigrationValidationOptionsArgs();

    /**
     * Allows to perform a checksum based data integrity validation between source and target for the selected database / tables .
     * 
     */
    @Import(name="enableDataIntegrityValidation")
      private final @Nullable Output<Boolean> enableDataIntegrityValidation;

    public Output<Boolean> enableDataIntegrityValidation() {
        return this.enableDataIntegrityValidation == null ? Codegen.empty() : this.enableDataIntegrityValidation;
    }

    /**
     * Allows to perform a quick and intelligent query analysis by retrieving queries from the source database and executes them in the target. The result will have execution statistics for executions in source and target databases for the extracted queries.
     * 
     */
    @Import(name="enableQueryAnalysisValidation")
      private final @Nullable Output<Boolean> enableQueryAnalysisValidation;

    public Output<Boolean> enableQueryAnalysisValidation() {
        return this.enableQueryAnalysisValidation == null ? Codegen.empty() : this.enableQueryAnalysisValidation;
    }

    /**
     * Allows to compare the schema information between source and target.
     * 
     */
    @Import(name="enableSchemaValidation")
      private final @Nullable Output<Boolean> enableSchemaValidation;

    public Output<Boolean> enableSchemaValidation() {
        return this.enableSchemaValidation == null ? Codegen.empty() : this.enableSchemaValidation;
    }

    public MigrationValidationOptionsArgs(
        @Nullable Output<Boolean> enableDataIntegrityValidation,
        @Nullable Output<Boolean> enableQueryAnalysisValidation,
        @Nullable Output<Boolean> enableSchemaValidation) {
        this.enableDataIntegrityValidation = enableDataIntegrityValidation;
        this.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
        this.enableSchemaValidation = enableSchemaValidation;
    }

    private MigrationValidationOptionsArgs() {
        this.enableDataIntegrityValidation = Codegen.empty();
        this.enableQueryAnalysisValidation = Codegen.empty();
        this.enableSchemaValidation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationValidationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableDataIntegrityValidation;
        private @Nullable Output<Boolean> enableQueryAnalysisValidation;
        private @Nullable Output<Boolean> enableSchemaValidation;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationValidationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDataIntegrityValidation = defaults.enableDataIntegrityValidation;
    	      this.enableQueryAnalysisValidation = defaults.enableQueryAnalysisValidation;
    	      this.enableSchemaValidation = defaults.enableSchemaValidation;
        }

        public Builder enableDataIntegrityValidation(@Nullable Output<Boolean> enableDataIntegrityValidation) {
            this.enableDataIntegrityValidation = enableDataIntegrityValidation;
            return this;
        }
        public Builder enableDataIntegrityValidation(@Nullable Boolean enableDataIntegrityValidation) {
            this.enableDataIntegrityValidation = Codegen.ofNullable(enableDataIntegrityValidation);
            return this;
        }
        public Builder enableQueryAnalysisValidation(@Nullable Output<Boolean> enableQueryAnalysisValidation) {
            this.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
            return this;
        }
        public Builder enableQueryAnalysisValidation(@Nullable Boolean enableQueryAnalysisValidation) {
            this.enableQueryAnalysisValidation = Codegen.ofNullable(enableQueryAnalysisValidation);
            return this;
        }
        public Builder enableSchemaValidation(@Nullable Output<Boolean> enableSchemaValidation) {
            this.enableSchemaValidation = enableSchemaValidation;
            return this;
        }
        public Builder enableSchemaValidation(@Nullable Boolean enableSchemaValidation) {
            this.enableSchemaValidation = Codegen.ofNullable(enableSchemaValidation);
            return this;
        }        public MigrationValidationOptionsArgs build() {
            return new MigrationValidationOptionsArgs(enableDataIntegrityValidation, enableQueryAnalysisValidation, enableSchemaValidation);
        }
    }
}
