// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.personalize;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.personalize.DatasetArgs;
import com.pulumi.awsnative.personalize.enums.DatasetType;
import com.pulumi.awsnative.personalize.outputs.DatasetImportJob;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Personalize::Dataset.
 * 
 */
@ResourceType(type="aws-native:personalize:Dataset")
public class Dataset extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the dataset
     * 
     */
    @Export(name="datasetArn", type=String.class, parameters={})
    private Output<String> datasetArn;

    /**
     * @return The ARN of the dataset
     * 
     */
    public Output<String> datasetArn() {
        return this.datasetArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset to
     * 
     */
    @Export(name="datasetGroupArn", type=String.class, parameters={})
    private Output<String> datasetGroupArn;

    /**
     * @return The Amazon Resource Name (ARN) of the dataset group to add the dataset to
     * 
     */
    public Output<String> datasetGroupArn() {
        return this.datasetGroupArn;
    }
    @Export(name="datasetImportJob", type=DatasetImportJob.class, parameters={})
    private Output</* @Nullable */ DatasetImportJob> datasetImportJob;

    public Output<Optional<DatasetImportJob>> datasetImportJob() {
        return Codegen.optional(this.datasetImportJob);
    }
    /**
     * The type of dataset
     * 
     */
    @Export(name="datasetType", type=DatasetType.class, parameters={})
    private Output<DatasetType> datasetType;

    /**
     * @return The type of dataset
     * 
     */
    public Output<DatasetType> datasetType() {
        return this.datasetType;
    }
    /**
     * The name for the dataset
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the dataset
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * 
     */
    @Export(name="schemaArn", type=String.class, parameters={})
    private Output<String> schemaArn;

    /**
     * @return The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
     * 
     */
    public Output<String> schemaArn() {
        return this.schemaArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, DatasetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:personalize:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dataset(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:personalize:Dataset", name, null, makeResourceOptions(options, id));
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
    public static Dataset get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, options);
    }
}
