// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AvroFormatResponse;
import com.pulumi.azurenative.datafactory.outputs.DatasetCompressionResponse;
import com.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.outputs.JsonFormatResponse;
import com.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.OrcFormatResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.ParquetFormatResponse;
import com.pulumi.azurenative.datafactory.outputs.TextFormatResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureDataLakeStoreDatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The data compression method used for the item(s) in the Azure Data Lake Store.
     * 
     */
    private final @Nullable DatasetCompressionResponse compression;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the file in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    private final @Nullable DatasetResponseFolder folder;
    /**
     * Path to the folder in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * The format of the Data Lake Store.
     * 
     */
    private final @Nullable Object format;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
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
     * Expected value is &#39;AzureDataLakeStoreFile&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureDataLakeStoreDatasetResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("compression") @Nullable DatasetCompressionResponse compression,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("fileName") @Nullable Object fileName,
        @CustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @CustomType.Parameter("folderPath") @Nullable Object folderPath,
        @CustomType.Parameter("format") @Nullable Object format,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("structure") @Nullable Object structure,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.fileName = fileName;
        this.folder = folder;
        this.folderPath = folderPath;
        this.format = format;
        this.linkedServiceName = linkedServiceName;
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
     * The data compression method used for the item(s) in the Azure Data Lake Store.
     * 
    */
    public Optional<DatasetCompressionResponse> compression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * Dataset description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The name of the file in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> fileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
    */
    public Optional<DatasetResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * Path to the folder in the Azure Data Lake Store. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * The format of the Data Lake Store.
     * 
    */
    public Optional<Object> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
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
     * Expected value is &#39;AzureDataLakeStoreFile&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable Object fileName;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object folderPath;
        private @Nullable Object format;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.fileName = defaults.fileName;
    	      this.folder = defaults.folder;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
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
        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder format(@Nullable Object format) {
            this.format = format;
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
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
        }        public AzureDataLakeStoreDatasetResponse build() {
            return new AzureDataLakeStoreDatasetResponse(annotations, compression, description, fileName, folder, folderPath, format, linkedServiceName, parameters, schema, structure, type);
        }
    }
}
