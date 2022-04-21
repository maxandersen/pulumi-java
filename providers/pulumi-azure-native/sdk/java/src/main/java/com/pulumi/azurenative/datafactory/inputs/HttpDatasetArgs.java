// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AvroFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetCompressionArgs;
import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.JsonFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.OrcFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.ParquetFormatArgs;
import com.pulumi.azurenative.datafactory.inputs.TextFormatArgs;
import com.pulumi.core.Output;
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
 * A file in an HTTP web server.
 * 
 */
public final class HttpDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpDatasetArgs Empty = new HttpDatasetArgs();

    /**
     * The headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
    private @Nullable Output<Object> additionalHeaders;

    public Optional<Output<Object>> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The data compression method used on files.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<DatasetCompressionArgs> compression;

    public Optional<Output<DatasetCompressionArgs>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<DatasetFolderArgs> folder;

    public Optional<Output<DatasetFolderArgs>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The format of files.
     * 
     */
    @Import(name="format")
    private @Nullable Output<Object> format;

    public Optional<Output<Object>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="relativeUrl")
    private @Nullable Output<Object> relativeUrl;

    public Optional<Output<Object>> relativeUrl() {
        return Optional.ofNullable(this.relativeUrl);
    }

    /**
     * The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestBody")
    private @Nullable Output<Object> requestBody;

    public Optional<Output<Object>> requestBody() {
        return Optional.ofNullable(this.requestBody);
    }

    /**
     * The HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Output<Object> requestMethod;

    public Optional<Output<Object>> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<Object> schema;

    public Optional<Output<Object>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
    private @Nullable Output<Object> structure;

    public Optional<Output<Object>> structure() {
        return Optional.ofNullable(this.structure);
    }

    /**
     * Type of dataset.
     * Expected value is &#39;HttpFile&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private HttpDatasetArgs() {}

    private HttpDatasetArgs(HttpDatasetArgs $) {
        this.additionalHeaders = $.additionalHeaders;
        this.annotations = $.annotations;
        this.compression = $.compression;
        this.description = $.description;
        this.folder = $.folder;
        this.format = $.format;
        this.linkedServiceName = $.linkedServiceName;
        this.parameters = $.parameters;
        this.relativeUrl = $.relativeUrl;
        this.requestBody = $.requestBody;
        this.requestMethod = $.requestMethod;
        this.schema = $.schema;
        this.structure = $.structure;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpDatasetArgs $;

        public Builder() {
            $ = new HttpDatasetArgs();
        }

        public Builder(HttpDatasetArgs defaults) {
            $ = new HttpDatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalHeaders(@Nullable Output<Object> additionalHeaders) {
            $.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder additionalHeaders(Object additionalHeaders) {
            return additionalHeaders(Output.of(additionalHeaders));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder compression(@Nullable Output<DatasetCompressionArgs> compression) {
            $.compression = compression;
            return this;
        }

        public Builder compression(DatasetCompressionArgs compression) {
            return compression(Output.of(compression));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            $.folder = folder;
            return this;
        }

        public Builder folder(DatasetFolderArgs folder) {
            return folder(Output.of(folder));
        }

        public Builder format(@Nullable Output<Object> format) {
            $.format = format;
            return this;
        }

        public Builder format(Object format) {
            return format(Output.of(format));
        }

        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder relativeUrl(@Nullable Output<Object> relativeUrl) {
            $.relativeUrl = relativeUrl;
            return this;
        }

        public Builder relativeUrl(Object relativeUrl) {
            return relativeUrl(Output.of(relativeUrl));
        }

        public Builder requestBody(@Nullable Output<Object> requestBody) {
            $.requestBody = requestBody;
            return this;
        }

        public Builder requestBody(Object requestBody) {
            return requestBody(Output.of(requestBody));
        }

        public Builder requestMethod(@Nullable Output<Object> requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        public Builder requestMethod(Object requestMethod) {
            return requestMethod(Output.of(requestMethod));
        }

        public Builder schema(@Nullable Output<Object> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(Object schema) {
            return schema(Output.of(schema));
        }

        public Builder structure(@Nullable Output<Object> structure) {
            $.structure = structure;
            return this;
        }

        public Builder structure(Object structure) {
            return structure(Output.of(structure));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public HttpDatasetArgs build() {
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
