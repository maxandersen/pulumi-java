// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.glue;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.glue.SchemaArgs;
import com.pulumi.awsnative.glue.enums.SchemaCompatibility;
import com.pulumi.awsnative.glue.enums.SchemaDataFormat;
import com.pulumi.awsnative.glue.outputs.SchemaRegistry;
import com.pulumi.awsnative.glue.outputs.SchemaTag;
import com.pulumi.awsnative.glue.outputs.SchemaVersion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource represents a schema of Glue Schema Registry.
 * 
 */
@ResourceType(type="aws-native:glue:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name for the Schema.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name for the Schema.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="checkpointVersion", type=SchemaVersion.class, parameters={})
    private Output</* @Nullable */ SchemaVersion> checkpointVersion;

    public Output</* @Nullable */ SchemaVersion> checkpointVersion() {
        return this.checkpointVersion;
    }
    /**
     * Compatibility setting for the schema.
     * 
     */
    @Export(name="compatibility", type=SchemaCompatibility.class, parameters={})
    private Output<SchemaCompatibility> compatibility;

    /**
     * @return Compatibility setting for the schema.
     * 
     */
    public Output<SchemaCompatibility> compatibility() {
        return this.compatibility;
    }
    /**
     * Data format name to use for the schema. Accepted values: &#39;AVRO&#39;, &#39;JSON&#39;, &#39;PROTOBUF&#39;
     * 
     */
    @Export(name="dataFormat", type=SchemaDataFormat.class, parameters={})
    private Output<SchemaDataFormat> dataFormat;

    /**
     * @return Data format name to use for the schema. Accepted values: &#39;AVRO&#39;, &#39;JSON&#39;, &#39;PROTOBUF&#39;
     * 
     */
    public Output<SchemaDataFormat> dataFormat() {
        return this.dataFormat;
    }
    /**
     * A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Represents the version ID associated with the initial schema version.
     * 
     */
    @Export(name="initialSchemaVersionId", type=String.class, parameters={})
    private Output<String> initialSchemaVersionId;

    /**
     * @return Represents the version ID associated with the initial schema version.
     * 
     */
    public Output<String> initialSchemaVersionId() {
        return this.initialSchemaVersionId;
    }
    /**
     * Name of the schema.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the schema.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="registry", type=SchemaRegistry.class, parameters={})
    private Output</* @Nullable */ SchemaRegistry> registry;

    public Output</* @Nullable */ SchemaRegistry> registry() {
        return this.registry;
    }
    /**
     * Definition for the initial schema version in plain-text.
     * 
     */
    @Export(name="schemaDefinition", type=String.class, parameters={})
    private Output<String> schemaDefinition;

    /**
     * @return Definition for the initial schema version in plain-text.
     * 
     */
    public Output<String> schemaDefinition() {
        return this.schemaDefinition;
    }
    /**
     * List of tags to tag the schema
     * 
     */
    @Export(name="tags", type=List.class, parameters={SchemaTag.class})
    private Output</* @Nullable */ List<SchemaTag>> tags;

    /**
     * @return List of tags to tag the schema
     * 
     */
    public Output</* @Nullable */ List<SchemaTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:Schema", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Schema get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, options);
    }
}
