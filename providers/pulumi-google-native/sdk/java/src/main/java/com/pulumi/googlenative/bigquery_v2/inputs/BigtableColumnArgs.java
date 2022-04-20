// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BigtableColumnArgs extends com.pulumi.resources.ResourceArgs {

    public static final BigtableColumnArgs Empty = new BigtableColumnArgs();

    /**
     * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. &#39;encoding&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;encoding&#39; is set at both levels.
     * 
     */
    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> encoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
    }

    /**
     * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
     * 
     */
    @Import(name="fieldName")
      private final @Nullable Output<String> fieldName;

    public Output<String> fieldName() {
        return this.fieldName == null ? Codegen.empty() : this.fieldName;
    }

    /**
     * [Optional] If this is set, only the latest version of value in this column are exposed. &#39;onlyReadLatest&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;onlyReadLatest&#39; is set at both levels.
     * 
     */
    @Import(name="onlyReadLatest")
      private final @Nullable Output<Boolean> onlyReadLatest;

    public Output<Boolean> onlyReadLatest() {
        return this.onlyReadLatest == null ? Codegen.empty() : this.onlyReadLatest;
    }

    /**
     * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
     * 
     */
    @Import(name="qualifierEncoded")
      private final @Nullable Output<String> qualifierEncoded;

    public Output<String> qualifierEncoded() {
        return this.qualifierEncoded == null ? Codegen.empty() : this.qualifierEncoded;
    }

    @Import(name="qualifierString")
      private final @Nullable Output<String> qualifierString;

    public Output<String> qualifierString() {
        return this.qualifierString == null ? Codegen.empty() : this.qualifierString;
    }

    /**
     * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. &#39;type&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;type&#39; is set at both levels.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public BigtableColumnArgs(
        @Nullable Output<String> encoding,
        @Nullable Output<String> fieldName,
        @Nullable Output<Boolean> onlyReadLatest,
        @Nullable Output<String> qualifierEncoded,
        @Nullable Output<String> qualifierString,
        @Nullable Output<String> type) {
        this.encoding = encoding;
        this.fieldName = fieldName;
        this.onlyReadLatest = onlyReadLatest;
        this.qualifierEncoded = qualifierEncoded;
        this.qualifierString = qualifierString;
        this.type = type;
    }

    private BigtableColumnArgs() {
        this.encoding = Codegen.empty();
        this.fieldName = Codegen.empty();
        this.onlyReadLatest = Codegen.empty();
        this.qualifierEncoded = Codegen.empty();
        this.qualifierString = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigtableColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encoding;
        private @Nullable Output<String> fieldName;
        private @Nullable Output<Boolean> onlyReadLatest;
        private @Nullable Output<String> qualifierEncoded;
        private @Nullable Output<String> qualifierString;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BigtableColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldName = defaults.fieldName;
    	      this.onlyReadLatest = defaults.onlyReadLatest;
    	      this.qualifierEncoded = defaults.qualifierEncoded;
    	      this.qualifierString = defaults.qualifierString;
    	      this.type = defaults.type;
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = Codegen.ofNullable(encoding);
            return this;
        }
        public Builder fieldName(@Nullable Output<String> fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public Builder fieldName(@Nullable String fieldName) {
            this.fieldName = Codegen.ofNullable(fieldName);
            return this;
        }
        public Builder onlyReadLatest(@Nullable Output<Boolean> onlyReadLatest) {
            this.onlyReadLatest = onlyReadLatest;
            return this;
        }
        public Builder onlyReadLatest(@Nullable Boolean onlyReadLatest) {
            this.onlyReadLatest = Codegen.ofNullable(onlyReadLatest);
            return this;
        }
        public Builder qualifierEncoded(@Nullable Output<String> qualifierEncoded) {
            this.qualifierEncoded = qualifierEncoded;
            return this;
        }
        public Builder qualifierEncoded(@Nullable String qualifierEncoded) {
            this.qualifierEncoded = Codegen.ofNullable(qualifierEncoded);
            return this;
        }
        public Builder qualifierString(@Nullable Output<String> qualifierString) {
            this.qualifierString = qualifierString;
            return this;
        }
        public Builder qualifierString(@Nullable String qualifierString) {
            this.qualifierString = Codegen.ofNullable(qualifierString);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public BigtableColumnArgs build() {
            return new BigtableColumnArgs(encoding, fieldName, onlyReadLatest, qualifierEncoded, qualifierString, type);
        }
    }
}
