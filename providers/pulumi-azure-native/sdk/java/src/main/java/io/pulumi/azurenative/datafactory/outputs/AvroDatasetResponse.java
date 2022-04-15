// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3LocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.FileServerLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.FtpServerLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleCloudStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpServerLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleCloudStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SftpLocationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AvroDatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The data avroCompressionCodec. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object avroCompressionCodec;
    private final @Nullable Integer avroCompressionLevel;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    private final @Nullable DatasetResponseFolder folder;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The location of the avro storage.
     * 
     */
    private final Object location;
    /**
     * Parameters for dataset.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    private final @Nullable Object schema;
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    private final @Nullable Object structure;
    /**
     * Type of dataset.
     * Expected value is 'Avro'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AvroDatasetResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("avroCompressionCodec") @Nullable Object avroCompressionCodec,
        @CustomType.Parameter("avroCompressionLevel") @Nullable Integer avroCompressionLevel,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("location") Object location,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("structure") @Nullable Object structure,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.avroCompressionCodec = avroCompressionCodec;
        this.avroCompressionLevel = avroCompressionLevel;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = linkedServiceName;
        this.location = location;
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the Dataset.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The data avroCompressionCodec. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> avroCompressionCodec() {
        return Optional.ofNullable(this.avroCompressionCodec);
    }
    public Optional<Integer> avroCompressionLevel() {
        return Optional.ofNullable(this.avroCompressionLevel);
    }
    /**
     * Dataset description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
    */
    public Optional<DatasetResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * Linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * The location of the avro storage.
     * 
    */
    public Object location() {
        return this.location;
    }
    /**
     * Parameters for dataset.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
    */
    public Optional<Object> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
    */
    public Optional<Object> structure() {
        return Optional.ofNullable(this.structure);
    }
    /**
     * Type of dataset.
     * Expected value is 'Avro'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object avroCompressionCodec;
        private @Nullable Integer avroCompressionLevel;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private Object location;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.avroCompressionCodec = defaults.avroCompressionCodec;
    	      this.avroCompressionLevel = defaults.avroCompressionLevel;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder avroCompressionCodec(@Nullable Object avroCompressionCodec) {
            this.avroCompressionCodec = avroCompressionCodec;
            return this;
        }
        public Builder avroCompressionLevel(@Nullable Integer avroCompressionLevel) {
            this.avroCompressionLevel = avroCompressionLevel;
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
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder location(Object location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
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
        }        public AvroDatasetResponse build() {
            return new AvroDatasetResponse(annotations, avroCompressionCodec, avroCompressionLevel, description, folder, linkedServiceName, location, parameters, schema, structure, type);
        }
    }
}
