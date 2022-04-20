// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatResponse;
import com.pulumi.azurenative.datafactory.inputs.TextFormatResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single Amazon Simple Storage Service (S3) object or a set of S3 objects.
 * 
 */
public final class AmazonS3DatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final AmazonS3DatasetResponse Empty = new AmazonS3DatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="bucketName", required=true)
      private final Object bucketName;

    public Object bucketName() {
        return this.bucketName;
    }

    /**
     * The data compression method used for the Amazon S3 object.
     * 
     */
    @Import(name="compression")
      private final @Nullable DatasetCompressionResponse compression;

    public Optional<DatasetCompressionResponse> compression() {
        return this.compression == null ? Optional.empty() : Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> folder() {
        return this.folder == null ? Optional.empty() : Optional.ofNullable(this.folder);
    }

    /**
     * The format of files.
     * 
     */
    @Import(name="format")
      private final @Nullable Object format;

    public Object format() {
        return this.format == null ? null : this.format;
    }

    /**
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="key")
      private final @Nullable Object key;

    public Optional<Object> key() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The end of S3 object&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
      private final @Nullable Object modifiedDatetimeEnd;

    public Optional<Object> modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of S3 object&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
      private final @Nullable Object modifiedDatetimeStart;

    public Optional<Object> modifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="prefix")
      private final @Nullable Object prefix;

    public Optional<Object> prefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Object schema;

    public Optional<Object> schema() {
        return this.schema == null ? Optional.empty() : Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Object structure;

    public Optional<Object> structure() {
        return this.structure == null ? Optional.empty() : Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;AmazonS3Object&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The version for the S3 object. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version")
      private final @Nullable Object version;

    public Optional<Object> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public AmazonS3DatasetResponse(
        @Nullable List<Object> annotations,
        Object bucketName,
        @Nullable DatasetCompressionResponse compression,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        @Nullable Object format,
        @Nullable Object key,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object modifiedDatetimeEnd,
        @Nullable Object modifiedDatetimeStart,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object prefix,
        @Nullable Object schema,
        @Nullable Object structure,
        String type,
        @Nullable Object version) {
        this.annotations = annotations;
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.compression = compression;
        this.description = description;
        this.folder = folder;
        this.format = format;
        this.key = key;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.parameters = parameters;
        this.prefix = prefix;
        this.schema = schema;
        this.structure = structure;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.version = version;
    }

    private AmazonS3DatasetResponse() {
        this.annotations = List.of();
        this.bucketName = null;
        this.compression = null;
        this.description = null;
        this.folder = null;
        this.format = null;
        this.key = null;
        this.linkedServiceName = null;
        this.modifiedDatetimeEnd = null;
        this.modifiedDatetimeStart = null;
        this.parameters = Map.of();
        this.prefix = null;
        this.schema = null;
        this.structure = null;
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3DatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object bucketName;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object format;
        private @Nullable Object key;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object prefix;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3DatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.bucketName = defaults.bucketName;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.format = defaults.format;
    	      this.key = defaults.key;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.parameters = defaults.parameters;
    	      this.prefix = defaults.prefix;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder bucketName(Object bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder folder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder format(@Nullable Object format) {
            this.format = format;
            return this;
        }
        public Builder key(@Nullable Object key) {
            this.key = key;
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder prefix(@Nullable Object prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable Object version) {
            this.version = version;
            return this;
        }        public AmazonS3DatasetResponse build() {
            return new AmazonS3DatasetResponse(annotations, bucketName, compression, description, folder, format, key, linkedServiceName, modifiedDatetimeEnd, modifiedDatetimeStart, parameters, prefix, schema, structure, type, version);
        }
    }
}
