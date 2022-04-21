// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceColumnDefinition specifies a column for server side printing.
 * 
 */
public final class CustomResourceColumnDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceColumnDefinitionArgs Empty = new CustomResourceColumnDefinitionArgs();

    /**
     * description is a human readable description of this column.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
     */
    @Import(name="jsonPath", required=true)
    private Output<String> jsonPath;

    public Output<String> jsonPath() {
        return this.jsonPath;
    }

    /**
     * name is a human readable name for the column.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private CustomResourceColumnDefinitionArgs() {}

    private CustomResourceColumnDefinitionArgs(CustomResourceColumnDefinitionArgs $) {
        this.description = $.description;
        this.format = $.format;
        this.jsonPath = $.jsonPath;
        this.name = $.name;
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceColumnDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceColumnDefinitionArgs $;

        public Builder() {
            $ = new CustomResourceColumnDefinitionArgs();
        }

        public Builder(CustomResourceColumnDefinitionArgs defaults) {
            $ = new CustomResourceColumnDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder jsonPath(Output<String> jsonPath) {
            $.jsonPath = jsonPath;
            return this;
        }

        public Builder jsonPath(String jsonPath) {
            return jsonPath(Output.of(jsonPath));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomResourceColumnDefinitionArgs build() {
            $.jsonPath = Objects.requireNonNull($.jsonPath, "expected parameter 'jsonPath' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
