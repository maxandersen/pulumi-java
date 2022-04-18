// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.bigquery_v2.enums.RoutineDeterminismLevel;
import com.pulumi.googlenative.bigquery_v2.enums.RoutineLanguage;
import com.pulumi.googlenative.bigquery_v2.enums.RoutineRoutineType;
import com.pulumi.googlenative.bigquery_v2.inputs.ArgumentArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.RoutineReferenceArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.StandardSqlDataTypeArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.StandardSqlTableTypeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutineArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutineArgs Empty = new RoutineArgs();

    /**
     * Optional.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<List<ArgumentArgs>> arguments;

    public Output<List<ArgumentArgs>> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The body of the routine. For functions, this is the expression in the AS clause. If language=SQL, it is the substring inside (but excluding) the parentheses. For example, for the function created with the following statement: `CREATE FUNCTION JoinLines(x string, y string) as (concat(x, "\n", y))` The definition_body is `concat(x, "\n", y)` (\n is not replaced with linebreak). If language=JAVASCRIPT, it is the evaluated string in the AS clause. For example, for the function created with the following statement: `CREATE FUNCTION f() RETURNS STRING LANGUAGE js AS 'return "\n";\n'` The definition_body is `return "\n";\n` Note that both \n are replaced with linebreaks.
     * 
     */
    @Import(name="definitionBody", required=true)
      private final Output<String> definitionBody;

    public Output<String> definitionBody() {
        return this.definitionBody;
    }

    /**
     * Optional. The description of the routine, if defined.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. The determinism level of the JavaScript UDF, if defined.
     * 
     */
    @Import(name="determinismLevel")
      private final @Nullable Output<RoutineDeterminismLevel> determinismLevel;

    public Output<RoutineDeterminismLevel> determinismLevel() {
        return this.determinismLevel == null ? Codegen.empty() : this.determinismLevel;
    }

    /**
     * Optional. If language = "JAVASCRIPT", this field stores the path of the imported JAVASCRIPT libraries.
     * 
     */
    @Import(name="importedLibraries")
      private final @Nullable Output<List<String>> importedLibraries;

    public Output<List<String>> importedLibraries() {
        return this.importedLibraries == null ? Codegen.empty() : this.importedLibraries;
    }

    /**
     * Optional. Defaults to "SQL".
     * 
     */
    @Import(name="language")
      private final @Nullable Output<RoutineLanguage> language;

    public Output<RoutineLanguage> language() {
        return this.language == null ? Codegen.empty() : this.language;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Can be set only if routine_type = "TABLE_VALUED_FUNCTION". If absent, the return table type is inferred from definition_body at query time in each query that references this routine. If present, then the columns in the evaluated table result will be cast to match the column types specificed in return table type, at query time.
     * 
     */
    @Import(name="returnTableType")
      private final @Nullable Output<StandardSqlTableTypeArgs> returnTableType;

    public Output<StandardSqlTableTypeArgs> returnTableType() {
        return this.returnTableType == null ? Codegen.empty() : this.returnTableType;
    }

    /**
     * Optional if language = "SQL"; required otherwise. Cannot be set if routine_type = "TABLE_VALUED_FUNCTION". If absent, the return type is inferred from definition_body at query time in each query that references this routine. If present, then the evaluated result will be cast to the specified returned type at query time. For example, for the functions created with the following statements: * `CREATE FUNCTION Add(x FLOAT64, y FLOAT64) RETURNS FLOAT64 AS (x + y);` * `CREATE FUNCTION Increment(x FLOAT64) AS (Add(x, 1));` * `CREATE FUNCTION Decrement(x FLOAT64) RETURNS FLOAT64 AS (Add(x, -1));` The return_type is `{type_kind: "FLOAT64"}` for `Add` and `Decrement`, and is absent for `Increment` (inferred as FLOAT64 at query time). Suppose the function `Add` is replaced by `CREATE OR REPLACE FUNCTION Add(x INT64, y INT64) AS (x + y);` Then the inferred return type of `Increment` is automatically changed to INT64 at query time, while the return type of `Decrement` remains FLOAT64.
     * 
     */
    @Import(name="returnType")
      private final @Nullable Output<StandardSqlDataTypeArgs> returnType;

    public Output<StandardSqlDataTypeArgs> returnType() {
        return this.returnType == null ? Codegen.empty() : this.returnType;
    }

    /**
     * Reference describing the ID of this routine.
     * 
     */
    @Import(name="routineReference", required=true)
      private final Output<RoutineReferenceArgs> routineReference;

    public Output<RoutineReferenceArgs> routineReference() {
        return this.routineReference;
    }

    /**
     * The type of routine.
     * 
     */
    @Import(name="routineType", required=true)
      private final Output<RoutineRoutineType> routineType;

    public Output<RoutineRoutineType> routineType() {
        return this.routineType;
    }

    /**
     * Optional. Can be set for procedures only. If true (default), the definition body will be validated in the creation and the updates of the procedure. For procedures with an argument of ANY TYPE, the definition body validtion is not supported at creation/update time, and thus this field must be set to false explicitly.
     * 
     */
    @Import(name="strictMode")
      private final @Nullable Output<Boolean> strictMode;

    public Output<Boolean> strictMode() {
        return this.strictMode == null ? Codegen.empty() : this.strictMode;
    }

    public RoutineArgs(
        @Nullable Output<List<ArgumentArgs>> arguments,
        Output<String> datasetId,
        Output<String> definitionBody,
        @Nullable Output<String> description,
        @Nullable Output<RoutineDeterminismLevel> determinismLevel,
        @Nullable Output<List<String>> importedLibraries,
        @Nullable Output<RoutineLanguage> language,
        @Nullable Output<String> project,
        @Nullable Output<StandardSqlTableTypeArgs> returnTableType,
        @Nullable Output<StandardSqlDataTypeArgs> returnType,
        Output<RoutineReferenceArgs> routineReference,
        Output<RoutineRoutineType> routineType,
        @Nullable Output<Boolean> strictMode) {
        this.arguments = arguments;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.definitionBody = Objects.requireNonNull(definitionBody, "expected parameter 'definitionBody' to be non-null");
        this.description = description;
        this.determinismLevel = determinismLevel;
        this.importedLibraries = importedLibraries;
        this.language = language;
        this.project = project;
        this.returnTableType = returnTableType;
        this.returnType = returnType;
        this.routineReference = Objects.requireNonNull(routineReference, "expected parameter 'routineReference' to be non-null");
        this.routineType = Objects.requireNonNull(routineType, "expected parameter 'routineType' to be non-null");
        this.strictMode = strictMode;
    }

    private RoutineArgs() {
        this.arguments = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.definitionBody = Codegen.empty();
        this.description = Codegen.empty();
        this.determinismLevel = Codegen.empty();
        this.importedLibraries = Codegen.empty();
        this.language = Codegen.empty();
        this.project = Codegen.empty();
        this.returnTableType = Codegen.empty();
        this.returnType = Codegen.empty();
        this.routineReference = Codegen.empty();
        this.routineType = Codegen.empty();
        this.strictMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ArgumentArgs>> arguments;
        private Output<String> datasetId;
        private Output<String> definitionBody;
        private @Nullable Output<String> description;
        private @Nullable Output<RoutineDeterminismLevel> determinismLevel;
        private @Nullable Output<List<String>> importedLibraries;
        private @Nullable Output<RoutineLanguage> language;
        private @Nullable Output<String> project;
        private @Nullable Output<StandardSqlTableTypeArgs> returnTableType;
        private @Nullable Output<StandardSqlDataTypeArgs> returnType;
        private Output<RoutineReferenceArgs> routineReference;
        private Output<RoutineRoutineType> routineType;
        private @Nullable Output<Boolean> strictMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.datasetId = defaults.datasetId;
    	      this.definitionBody = defaults.definitionBody;
    	      this.description = defaults.description;
    	      this.determinismLevel = defaults.determinismLevel;
    	      this.importedLibraries = defaults.importedLibraries;
    	      this.language = defaults.language;
    	      this.project = defaults.project;
    	      this.returnTableType = defaults.returnTableType;
    	      this.returnType = defaults.returnType;
    	      this.routineReference = defaults.routineReference;
    	      this.routineType = defaults.routineType;
    	      this.strictMode = defaults.strictMode;
        }

        public Builder arguments(@Nullable Output<List<ArgumentArgs>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable List<ArgumentArgs> arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder arguments(ArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder definitionBody(Output<String> definitionBody) {
            this.definitionBody = Objects.requireNonNull(definitionBody);
            return this;
        }
        public Builder definitionBody(String definitionBody) {
            this.definitionBody = Output.of(Objects.requireNonNull(definitionBody));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder determinismLevel(@Nullable Output<RoutineDeterminismLevel> determinismLevel) {
            this.determinismLevel = determinismLevel;
            return this;
        }
        public Builder determinismLevel(@Nullable RoutineDeterminismLevel determinismLevel) {
            this.determinismLevel = Codegen.ofNullable(determinismLevel);
            return this;
        }
        public Builder importedLibraries(@Nullable Output<List<String>> importedLibraries) {
            this.importedLibraries = importedLibraries;
            return this;
        }
        public Builder importedLibraries(@Nullable List<String> importedLibraries) {
            this.importedLibraries = Codegen.ofNullable(importedLibraries);
            return this;
        }
        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }
        public Builder language(@Nullable Output<RoutineLanguage> language) {
            this.language = language;
            return this;
        }
        public Builder language(@Nullable RoutineLanguage language) {
            this.language = Codegen.ofNullable(language);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder returnTableType(@Nullable Output<StandardSqlTableTypeArgs> returnTableType) {
            this.returnTableType = returnTableType;
            return this;
        }
        public Builder returnTableType(@Nullable StandardSqlTableTypeArgs returnTableType) {
            this.returnTableType = Codegen.ofNullable(returnTableType);
            return this;
        }
        public Builder returnType(@Nullable Output<StandardSqlDataTypeArgs> returnType) {
            this.returnType = returnType;
            return this;
        }
        public Builder returnType(@Nullable StandardSqlDataTypeArgs returnType) {
            this.returnType = Codegen.ofNullable(returnType);
            return this;
        }
        public Builder routineReference(Output<RoutineReferenceArgs> routineReference) {
            this.routineReference = Objects.requireNonNull(routineReference);
            return this;
        }
        public Builder routineReference(RoutineReferenceArgs routineReference) {
            this.routineReference = Output.of(Objects.requireNonNull(routineReference));
            return this;
        }
        public Builder routineType(Output<RoutineRoutineType> routineType) {
            this.routineType = Objects.requireNonNull(routineType);
            return this;
        }
        public Builder routineType(RoutineRoutineType routineType) {
            this.routineType = Output.of(Objects.requireNonNull(routineType));
            return this;
        }
        public Builder strictMode(@Nullable Output<Boolean> strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Builder strictMode(@Nullable Boolean strictMode) {
            this.strictMode = Codegen.ofNullable(strictMode);
            return this;
        }        public RoutineArgs build() {
            return new RoutineArgs(arguments, datasetId, definitionBody, description, determinismLevel, importedLibraries, language, project, returnTableType, returnType, routineReference, routineType, strictMode);
        }
    }
}
