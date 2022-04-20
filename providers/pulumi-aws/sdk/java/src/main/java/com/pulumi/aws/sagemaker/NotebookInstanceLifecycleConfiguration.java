// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.NotebookInstanceLifecycleConfigurationArgs;
import com.pulumi.aws.sagemaker.inputs.NotebookInstanceLifecycleConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a lifecycle configuration for SageMaker Notebook Instances.
 * 
 * ## Import
 * 
 * Models can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/notebookInstanceLifecycleConfiguration:NotebookInstanceLifecycleConfiguration lc foo
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/notebookInstanceLifecycleConfiguration:NotebookInstanceLifecycleConfiguration")
public class NotebookInstanceLifecycleConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
     * 
     */
    @Export(name="onCreate", type=String.class, parameters={})
    private Output</* @Nullable */ String> onCreate;

    /**
     * @return A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
     * 
     */
    public Output</* @Nullable */ String> onCreate() {
        return this.onCreate;
    }
    /**
     * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
     * 
     */
    @Export(name="onStart", type=String.class, parameters={})
    private Output</* @Nullable */ String> onStart;

    /**
     * @return A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
     * 
     */
    public Output</* @Nullable */ String> onStart() {
        return this.onStart;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotebookInstanceLifecycleConfiguration(String name) {
        this(name, NotebookInstanceLifecycleConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotebookInstanceLifecycleConfiguration(String name, @Nullable NotebookInstanceLifecycleConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotebookInstanceLifecycleConfiguration(String name, @Nullable NotebookInstanceLifecycleConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/notebookInstanceLifecycleConfiguration:NotebookInstanceLifecycleConfiguration", name, args == null ? NotebookInstanceLifecycleConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotebookInstanceLifecycleConfiguration(String name, Output<String> id, @Nullable NotebookInstanceLifecycleConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/notebookInstanceLifecycleConfiguration:NotebookInstanceLifecycleConfiguration", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotebookInstanceLifecycleConfiguration get(String name, Output<String> id, @Nullable NotebookInstanceLifecycleConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotebookInstanceLifecycleConfiguration(name, id, state, options);
    }
}
