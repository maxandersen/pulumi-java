// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateParameterArgs Empty = new WorkflowTemplateParameterArgs();

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
     * Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths. A field path is similar in syntax to a .sparkJob.args
     * 
     */
    @Import(name="fields", required=true)
      private final Output<List<String>> fields;

    public Output<List<String>> fields() {
        return this.fields;
    }

    /**
     * Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Optional. Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<WorkflowTemplateParameterValidationArgs> validation;

    public Output<WorkflowTemplateParameterValidationArgs> validation() {
        return this.validation == null ? Codegen.empty() : this.validation;
    }

    public WorkflowTemplateParameterArgs(
        @Nullable Output<String> description,
        Output<List<String>> fields,
        Output<String> name,
        @Nullable Output<WorkflowTemplateParameterValidationArgs> validation) {
        this.description = description;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.validation = validation;
    }

    private WorkflowTemplateParameterArgs() {
        this.description = Codegen.empty();
        this.fields = Codegen.empty();
        this.name = Codegen.empty();
        this.validation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<String>> fields;
        private Output<String> name;
        private @Nullable Output<WorkflowTemplateParameterValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterArgs defaults) {
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
        public Builder validation(@Nullable Output<WorkflowTemplateParameterValidationArgs> validation) {
            this.validation = validation;
            return this;
        }
        public Builder validation(@Nullable WorkflowTemplateParameterValidationArgs validation) {
            this.validation = Codegen.ofNullable(validation);
            return this;
        }        public WorkflowTemplateParameterArgs build() {
            return new WorkflowTemplateParameterArgs(description, fields, name, validation);
        }
    }
}
