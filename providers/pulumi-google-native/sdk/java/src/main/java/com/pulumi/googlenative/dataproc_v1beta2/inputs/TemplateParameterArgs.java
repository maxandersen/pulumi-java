// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.ParameterValidationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configurable parameter that replaces one or more fields in the template. Parameterizable fields: - Labels - File uris - Job properties - Job arguments - Script variables - Main class (in HadoopJob and SparkJob) - Zone (in ClusterSelector)
 * 
 */
public final class TemplateParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateParameterArgs Empty = new TemplateParameterArgs();

    /**
     * Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter's list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template's cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels'key' placement.clusterSelector.clusterLabels'key' placement.managedCluster.labels'key' placement.clusterSelector.clusterLabels'key' jobs'step-id'.labels'key' Jobs in the jobs list can be referenced by step-id: jobs'step-id'.hadoopJob.mainJarFileUri jobs'step-id'.hiveJob.queryFileUri jobs'step-id'.pySparkJob.mainPythonFileUri jobs'step-id'.hadoopJob.jarFileUris0 jobs'step-id'.hadoopJob.archiveUris0 jobs'step-id'.hadoopJob.fileUris0 jobs'step-id'.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs'step-id'.sparkJob.args0 Other examples: jobs'step-id'.hadoopJob.properties'key' jobs'step-id'.hadoopJob.args0 jobs'step-id'.hiveJob.scriptVariables'key' jobs'step-id'.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs'step-id'.sparkJob.args
     * 
     */
    @Import(name="fields", required=true)
      private final Output<List<String>> fields;

    public Output<List<String>> fields() {
        return this.fields;
    }

    /**
     * Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Optional. Validation rules to be applied to this parameter's value.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<ParameterValidationArgs> validation;

    public Output<ParameterValidationArgs> validation() {
        return this.validation == null ? Codegen.empty() : this.validation;
    }

    public TemplateParameterArgs(
        @Nullable Output<String> description,
        Output<List<String>> fields,
        Output<String> name,
        @Nullable Output<ParameterValidationArgs> validation) {
        this.description = description;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.validation = validation;
    }

    private TemplateParameterArgs() {
        this.description = Codegen.empty();
        this.fields = Codegen.empty();
        this.name = Codegen.empty();
        this.validation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<String>> fields;
        private Output<String> name;
        private @Nullable Output<ParameterValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.validation = defaults.validation;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fields(Output<List<String>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(List<String> fields) {
            this.fields = Output.of(Objects.requireNonNull(fields));
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder validation(@Nullable Output<ParameterValidationArgs> validation) {
            this.validation = validation;
            return this;
        }
        public Builder validation(@Nullable ParameterValidationArgs validation) {
            this.validation = Codegen.ofNullable(validation);
            return this;
        }        public TemplateParameterArgs build() {
            return new TemplateParameterArgs(description, fields, name, validation);
        }
    }
}
