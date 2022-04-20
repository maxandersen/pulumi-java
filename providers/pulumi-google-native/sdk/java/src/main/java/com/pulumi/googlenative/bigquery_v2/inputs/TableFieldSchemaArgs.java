// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaCategoriesArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaPolicyTagsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableFieldSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableFieldSchemaArgs Empty = new TableFieldSchemaArgs();

    /**
     * [Optional] The categories attached to this field, used for field-level access control.
     * 
     */
    @Import(name="categories")
      private final @Nullable Output<TableFieldSchemaCategoriesArgs> categories;

    public Output<TableFieldSchemaCategoriesArgs> categories() {
        return this.categories == null ? Codegen.empty() : this.categories;
    }

    /**
     * Optional. Collation specification of the field. It only can be set on string type field.
     * 
     */
    @Import(name="collationSpec")
      private final @Nullable Output<String> collationSpec;

    public Output<String> collationSpec() {
        return this.collationSpec == null ? Codegen.empty() : this.collationSpec;
    }

    /**
     * [Optional] The field description. The maximum length is 1,024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * [Optional] Describes the nested schema fields if the type property is set to RECORD.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<TableFieldSchemaArgs>> fields;

    public Output<List<TableFieldSchemaArgs>> fields() {
        return this.fields == null ? Codegen.empty() : this.fields;
    }

    /**
     * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = &#34;STRING&#34;, then max_length represents the maximum UTF-8 length of strings in this field. If type = &#34;BYTES&#34;, then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type ≠ &#34;STRING&#34; and ≠ &#34;BYTES&#34;.
     * 
     */
    @Import(name="maxLength")
      private final @Nullable Output<String> maxLength;

    public Output<String> maxLength() {
        return this.maxLength == null ? Codegen.empty() : this.maxLength;
    }

    /**
     * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="policyTags")
      private final @Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags;

    public Output<TableFieldSchemaPolicyTagsArgs> policyTags() {
        return this.policyTags == null ? Codegen.empty() : this.policyTags;
    }

    /**
     * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type ≠ &#34;NUMERIC&#34; and ≠ &#34;BIGNUMERIC&#34;. If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = &#34;NUMERIC&#34;: 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = &#34;BIGNUMERIC&#34;: 1 ≤ precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = &#34;NUMERIC&#34;: 1 ≤ precision ≤ 29. - If type = &#34;BIGNUMERIC&#34;: 1 ≤ precision ≤ 38. If scale is specified but not precision, then it is invalid.
     * 
     */
    @Import(name="precision")
      private final @Nullable Output<String> precision;

    public Output<String> precision() {
        return this.precision == null ? Codegen.empty() : this.precision;
    }

    /**
     * [Optional] See documentation for precision.
     * 
     */
    @Import(name="scale")
      private final @Nullable Output<String> scale;

    public Output<String> scale() {
        return this.scale == null ? Codegen.empty() : this.scale;
    }

    /**
     * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public TableFieldSchemaArgs(
        @Nullable Output<TableFieldSchemaCategoriesArgs> categories,
        @Nullable Output<String> collationSpec,
        @Nullable Output<String> description,
        @Nullable Output<List<TableFieldSchemaArgs>> fields,
        @Nullable Output<String> maxLength,
        @Nullable Output<String> mode,
        @Nullable Output<String> name,
        @Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags,
        @Nullable Output<String> precision,
        @Nullable Output<String> scale,
        @Nullable Output<String> type) {
        this.categories = categories;
        this.collationSpec = collationSpec;
        this.description = description;
        this.fields = fields;
        this.maxLength = maxLength;
        this.mode = mode;
        this.name = name;
        this.policyTags = policyTags;
        this.precision = precision;
        this.scale = scale;
        this.type = type;
    }

    private TableFieldSchemaArgs() {
        this.categories = Codegen.empty();
        this.collationSpec = Codegen.empty();
        this.description = Codegen.empty();
        this.fields = Codegen.empty();
        this.maxLength = Codegen.empty();
        this.mode = Codegen.empty();
        this.name = Codegen.empty();
        this.policyTags = Codegen.empty();
        this.precision = Codegen.empty();
        this.scale = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TableFieldSchemaCategoriesArgs> categories;
        private @Nullable Output<String> collationSpec;
        private @Nullable Output<String> description;
        private @Nullable Output<List<TableFieldSchemaArgs>> fields;
        private @Nullable Output<String> maxLength;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> name;
        private @Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags;
        private @Nullable Output<String> precision;
        private @Nullable Output<String> scale;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.collationSpec = defaults.collationSpec;
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.maxLength = defaults.maxLength;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.policyTags = defaults.policyTags;
    	      this.precision = defaults.precision;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder categories(@Nullable Output<TableFieldSchemaCategoriesArgs> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(@Nullable TableFieldSchemaCategoriesArgs categories) {
            this.categories = Codegen.ofNullable(categories);
            return this;
        }
        public Builder collationSpec(@Nullable Output<String> collationSpec) {
            this.collationSpec = collationSpec;
            return this;
        }
        public Builder collationSpec(@Nullable String collationSpec) {
            this.collationSpec = Codegen.ofNullable(collationSpec);
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
        public Builder fields(@Nullable Output<List<TableFieldSchemaArgs>> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(@Nullable List<TableFieldSchemaArgs> fields) {
            this.fields = Codegen.ofNullable(fields);
            return this;
        }
        public Builder fields(TableFieldSchemaArgs... fields) {
            return fields(List.of(fields));
        }
        public Builder maxLength(@Nullable Output<String> maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Builder maxLength(@Nullable String maxLength) {
            this.maxLength = Codegen.ofNullable(maxLength);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder policyTags(@Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags) {
            this.policyTags = policyTags;
            return this;
        }
        public Builder policyTags(@Nullable TableFieldSchemaPolicyTagsArgs policyTags) {
            this.policyTags = Codegen.ofNullable(policyTags);
            return this;
        }
        public Builder precision(@Nullable Output<String> precision) {
            this.precision = precision;
            return this;
        }
        public Builder precision(@Nullable String precision) {
            this.precision = Codegen.ofNullable(precision);
            return this;
        }
        public Builder scale(@Nullable Output<String> scale) {
            this.scale = scale;
            return this;
        }
        public Builder scale(@Nullable String scale) {
            this.scale = Codegen.ofNullable(scale);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public TableFieldSchemaArgs build() {
            return new TableFieldSchemaArgs(categories, collationSpec, description, fields, maxLength, mode, name, policyTags, precision, scale, type);
        }
    }
}
