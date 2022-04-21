// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data stored in JSON format.
 * 
 */
public final class JsonFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final JsonFormatArgs Empty = new JsonFormatArgs();

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deserializer")
    private @Nullable Output<Object> deserializer;

    public Optional<Output<Object>> deserializer() {
        return Optional.ofNullable(this.deserializer);
    }

    /**
     * The code page name of the preferred encoding. If not provided, the default value is &#39;utf-8&#39;, unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the &#39;Name&#39; column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encodingName")
    private @Nullable Output<Object> encodingName;

    public Optional<Output<Object>> encodingName() {
        return Optional.ofNullable(this.encodingName);
    }

    /**
     * File pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is &#39;setOfObjects&#39;. It is case-sensitive.
     * 
     */
    @Import(name="filePattern")
    private @Nullable Output<Object> filePattern;

    public Optional<Output<Object>> filePattern() {
        return Optional.ofNullable(this.filePattern);
    }

    /**
     * The JSONPath of the JSON array element to be flattened. Example: &#34;$.ArrayPath&#34;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="jsonNodeReference")
    private @Nullable Output<Object> jsonNodeReference;

    public Optional<Output<Object>> jsonNodeReference() {
        return Optional.ofNullable(this.jsonNodeReference);
    }

    /**
     * The JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with &#34;$&#34;; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {&#34;Column1&#34;: &#34;$.Column1Path&#34;, &#34;Column2&#34;: &#34;Column2PathInArray&#34;}. Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="jsonPathDefinition")
    private @Nullable Output<Object> jsonPathDefinition;

    public Optional<Output<Object>> jsonPathDefinition() {
        return Optional.ofNullable(this.jsonPathDefinition);
    }

    /**
     * The character used to separate nesting levels. Default value is &#39;.&#39; (dot). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="nestingSeparator")
    private @Nullable Output<Object> nestingSeparator;

    public Optional<Output<Object>> nestingSeparator() {
        return Optional.ofNullable(this.nestingSeparator);
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
    private @Nullable Output<Object> serializer;

    public Optional<Output<Object>> serializer() {
        return Optional.ofNullable(this.serializer);
    }

    /**
     * Type of dataset storage format.
     * Expected value is &#39;JsonFormat&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private JsonFormatArgs() {}

    private JsonFormatArgs(JsonFormatArgs $) {
        this.deserializer = $.deserializer;
        this.encodingName = $.encodingName;
        this.filePattern = $.filePattern;
        this.jsonNodeReference = $.jsonNodeReference;
        this.jsonPathDefinition = $.jsonPathDefinition;
        this.nestingSeparator = $.nestingSeparator;
        this.serializer = $.serializer;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JsonFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JsonFormatArgs $;

        public Builder() {
            $ = new JsonFormatArgs();
        }

        public Builder(JsonFormatArgs defaults) {
            $ = new JsonFormatArgs(Objects.requireNonNull(defaults));
        }

        public Builder deserializer(@Nullable Output<Object> deserializer) {
            $.deserializer = deserializer;
            return this;
        }

        public Builder deserializer(Object deserializer) {
            return deserializer(Output.of(deserializer));
        }

        public Builder encodingName(@Nullable Output<Object> encodingName) {
            $.encodingName = encodingName;
            return this;
        }

        public Builder encodingName(Object encodingName) {
            return encodingName(Output.of(encodingName));
        }

        public Builder filePattern(@Nullable Output<Object> filePattern) {
            $.filePattern = filePattern;
            return this;
        }

        public Builder filePattern(Object filePattern) {
            return filePattern(Output.of(filePattern));
        }

        public Builder jsonNodeReference(@Nullable Output<Object> jsonNodeReference) {
            $.jsonNodeReference = jsonNodeReference;
            return this;
        }

        public Builder jsonNodeReference(Object jsonNodeReference) {
            return jsonNodeReference(Output.of(jsonNodeReference));
        }

        public Builder jsonPathDefinition(@Nullable Output<Object> jsonPathDefinition) {
            $.jsonPathDefinition = jsonPathDefinition;
            return this;
        }

        public Builder jsonPathDefinition(Object jsonPathDefinition) {
            return jsonPathDefinition(Output.of(jsonPathDefinition));
        }

        public Builder nestingSeparator(@Nullable Output<Object> nestingSeparator) {
            $.nestingSeparator = nestingSeparator;
            return this;
        }

        public Builder nestingSeparator(Object nestingSeparator) {
            return nestingSeparator(Output.of(nestingSeparator));
        }

        public Builder serializer(@Nullable Output<Object> serializer) {
            $.serializer = serializer;
            return this;
        }

        public Builder serializer(Object serializer) {
            return serializer(Output.of(serializer));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JsonFormatArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
