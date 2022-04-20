// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticbeanstalk.ConfigurationTemplateArgs;
import com.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateState;
import com.pulumi.aws.elasticbeanstalk.outputs.ConfigurationTemplateSetting;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Beanstalk Configuration Template, which are associated with
 * a specific application and are used to deploy different versions of the
 * application with the same configuration settings.
 * 
 * ## Example Usage
 * ## Option Settings
 * 
 * The `setting` field supports the following format:
 * 
 * * `namespace` - unique namespace identifying the option&#39;s associated AWS resource
 * * `name` - name of the configuration option
 * * `value` - value for the configuration option
 * * `resource` - (Optional) resource name for [scheduled action](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options-general.html#command-options-general-autoscalingscheduledaction)
 * 
 */
@ResourceType(type="aws:elasticbeanstalk/configurationTemplate:ConfigurationTemplate")
public class ConfigurationTemplate extends com.pulumi.resources.CustomResource {
    /**
     * name of the application to associate with this configuration template
     * 
     */
    @Export(name="application", type=String.class, parameters={})
    private Output<String> application;

    /**
     * @return name of the application to associate with this configuration template
     * 
     */
    public Output<String> application() {
        return this.application;
    }
    /**
     * Short description of the Template
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Short description of the Template
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The ID of the environment used with this configuration template
     * 
     */
    @Export(name="environmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentId;

    /**
     * @return The ID of the environment used with this configuration template
     * 
     */
    public Output</* @Nullable */ String> environmentId() {
        return this.environmentId;
    }
    /**
     * A unique name for this Template.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for this Template.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @Export(name="settings", type=List.class, parameters={ConfigurationTemplateSetting.class})
    private Output<List<ConfigurationTemplateSetting>> settings;

    /**
     * @return Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    public Output<List<ConfigurationTemplateSetting>> settings() {
        return this.settings;
    }
    /**
     * A solution stack to base your Template
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @Export(name="solutionStackName", type=String.class, parameters={})
    private Output</* @Nullable */ String> solutionStackName;

    /**
     * @return A solution stack to base your Template
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    public Output</* @Nullable */ String> solutionStackName() {
        return this.solutionStackName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationTemplate(String name) {
        this(name, ConfigurationTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationTemplate(String name, ConfigurationTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationTemplate(String name, ConfigurationTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticbeanstalk/configurationTemplate:ConfigurationTemplate", name, args == null ? ConfigurationTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationTemplate(String name, Output<String> id, @Nullable ConfigurationTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticbeanstalk/configurationTemplate:ConfigurationTemplate", name, state, makeResourceOptions(options, id));
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
    public static ConfigurationTemplate get(String name, Output<String> id, @Nullable ConfigurationTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationTemplate(name, id, state, options);
    }
}
