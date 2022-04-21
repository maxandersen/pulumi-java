// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
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
 * The MongoDB database dataset.
 * 
 */
public final class MongoDbCollectionDatasetResponse extends com.pulumi.resources.InvokeArgs {

    public static final MongoDbCollectionDatasetResponse Empty = new MongoDbCollectionDatasetResponse();

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
     * The table name of the MongoDB database. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="collectionName", required=true)
    private Object collectionName;

    public Object collectionName() {
        return this.collectionName;
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
     * Expected value is &#39;MongoDbCollection&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private MongoDbCollectionDatasetResponse() {}

    private MongoDbCollectionDatasetResponse(MongoDbCollectionDatasetResponse $) {
        this.annotations = $.annotations;
        this.collectionName = $.collectionName;
        this.description = $.description;
        this.folder = $.folder;
        this.linkedServiceName = $.linkedServiceName;
        this.parameters = $.parameters;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MongoDbCollectionDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MongoDbCollectionDatasetResponse $;

        public Builder() {
            $ = new MongoDbCollectionDatasetResponse();
        }

        public Builder(MongoDbCollectionDatasetResponse defaults) {
            $ = new MongoDbCollectionDatasetResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder collectionName(Object collectionName) {
            $.collectionName = collectionName;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
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

        public MongoDbCollectionDatasetResponse build() {
            $.collectionName = Objects.requireNonNull($.collectionName, "expected parameter 'collectionName' to be non-null");
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
