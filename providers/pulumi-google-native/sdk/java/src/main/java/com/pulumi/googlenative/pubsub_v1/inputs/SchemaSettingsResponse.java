// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Settings for validating messages published against a schema.
 * 
 */
public final class SchemaSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchemaSettingsResponse Empty = new SchemaSettingsResponse();

    /**
     * The encoding of messages validated against `schema`.
     * 
     */
    @Import(name="encoding", required=true)
    private String encoding;

    public String encoding() {
        return this.encoding;
    }

    /**
     * The name of the schema that messages published should be validated against. Format is `projects/{project}/schemas/{schema}`. The value of this field will be `_deleted-schema_` if the schema has been deleted.
     * 
     */
    @Import(name="schema", required=true)
    private String schema;

    public String schema() {
        return this.schema;
    }

    private SchemaSettingsResponse() {}

    private SchemaSettingsResponse(SchemaSettingsResponse $) {
        this.encoding = $.encoding;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaSettingsResponse $;

        public Builder() {
            $ = new SchemaSettingsResponse();
        }

        public Builder(SchemaSettingsResponse defaults) {
            $ = new SchemaSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder encoding(String encoding) {
            $.encoding = encoding;
            return this;
        }

        public Builder schema(String schema) {
            $.schema = schema;
            return this;
        }

        public SchemaSettingsResponse build() {
            $.encoding = Objects.requireNonNull($.encoding, "expected parameter 'encoding' to be non-null");
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
