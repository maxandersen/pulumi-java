// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3LocationResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.FileServerLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.FtpServerLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.HdfsLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.HttpServerLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageLocationResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SftpLocationResponse;
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
 * Json dataset.
 * 
 */
public final class JsonDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final JsonDatasetResponse Empty = new JsonDatasetResponse();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The data compression method used for the json dataset.
     * 
     */
    @Import(name="compression")
    private @Nullable DatasetCompressionResponse compression;

    public Optional<DatasetCompressionResponse> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The code page name of the preferred encoding. If not specified, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encodingName")
    private @Nullable Object encodingName;

    public Optional<Object> encodingName() {
        return Optional.ofNullable(this.encodingName);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The location of the json data storage.
     * 
     */
    @Import(name="location", required=true)
    private Object location;

    public Object location() {
        return this.location;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Object schema;

    public Optional<Object> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Object structure;

    public Optional<Object> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;Json&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private JsonDatasetResponse() {}

    private JsonDatasetResponse(JsonDatasetResponse $) {
        this.annotations = $.annotations;
        this.compression = $.compression;
        this.description = $.description;
        this.encodingName = $.encodingName;
        this.folder = $.folder;
        this.linkedServiceName = $.linkedServiceName;
        this.location = $.location;
        this.parameters = $.parameters;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonDatasetResponse $;

        public Builder() {
            $ = new JsonDatasetResponse();
        }

        public Builder(JsonDatasetResponse defaults) {
            $ = new JsonDatasetResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            $.compression = compression;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder encodingName(@Nullable Object encodingName) {
            $.encodingName = encodingName;
            return this;
        }

        public Builder folder(@Nullable DatasetResponseFolder folder) {
            $.folder = folder;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder location(Object location) {
            $.location = location;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            $.schema = schema;
            return this;
        }

        public Builder structure(@Nullable Object structure) {
            $.structure = structure;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public JsonDatasetResponse build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
