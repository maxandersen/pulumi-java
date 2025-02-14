// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.quicksight.ThemeArgs;
import com.pulumi.awsnative.quicksight.enums.ThemeType;
import com.pulumi.awsnative.quicksight.outputs.ThemeConfiguration;
import com.pulumi.awsnative.quicksight.outputs.ThemeResourcePermission;
import com.pulumi.awsnative.quicksight.outputs.ThemeTag;
import com.pulumi.awsnative.quicksight.outputs.ThemeVersion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::Theme Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:Theme")
public class Theme extends com.pulumi.resources.CustomResource {
    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the theme.&lt;/p&gt;
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) of the theme.&lt;/p&gt;
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * &lt;p&gt;The ID of the theme that a custom theme will inherit from. All themes inherit from one of
     * 			the starting themes defined by Amazon QuickSight. For a list of the starting themes, use
     * 				&lt;code&gt;ListThemes&lt;/code&gt; or choose &lt;b&gt;Themes&lt;/b&gt; from
     * 			within a QuickSight analysis. &lt;/p&gt;
     * 
     */
    @Export(name="baseThemeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> baseThemeId;

    /**
     * @return &lt;p&gt;The ID of the theme that a custom theme will inherit from. All themes inherit from one of
     * 			the starting themes defined by Amazon QuickSight. For a list of the starting themes, use
     * 				&lt;code&gt;ListThemes&lt;/code&gt; or choose &lt;b&gt;Themes&lt;/b&gt; from
     * 			within a QuickSight analysis. &lt;/p&gt;
     * 
     */
    public Output<Optional<String>> baseThemeId() {
        return Codegen.optional(this.baseThemeId);
    }
    @Export(name="configuration", type=ThemeConfiguration.class, parameters={})
    private Output</* @Nullable */ ThemeConfiguration> configuration;

    public Output<Optional<ThemeConfiguration>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * &lt;p&gt;The date and time that the theme was created.&lt;/p&gt;
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return &lt;p&gt;The date and time that the theme was created.&lt;/p&gt;
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * &lt;p&gt;The date and time that the theme was last updated.&lt;/p&gt;
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return &lt;p&gt;The date and time that the theme was last updated.&lt;/p&gt;
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * &lt;p&gt;A display name for the theme.&lt;/p&gt;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return &lt;p&gt;A display name for the theme.&lt;/p&gt;
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * &lt;p&gt;A valid grouping of resource permissions to apply to the new theme.
     * 			&lt;/p&gt;
     * 
     */
    @Export(name="permissions", type=List.class, parameters={ThemeResourcePermission.class})
    private Output</* @Nullable */ List<ThemeResourcePermission>> permissions;

    /**
     * @return &lt;p&gt;A valid grouping of resource permissions to apply to the new theme.
     * 			&lt;/p&gt;
     * 
     */
    public Output<Optional<List<ThemeResourcePermission>>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * &lt;p&gt;A map of the key-value pairs for the resource tag or tags that you want to add to the
     * 			resource.&lt;/p&gt;
     * 
     */
    @Export(name="tags", type=List.class, parameters={ThemeTag.class})
    private Output</* @Nullable */ List<ThemeTag>> tags;

    /**
     * @return &lt;p&gt;A map of the key-value pairs for the resource tag or tags that you want to add to the
     * 			resource.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<ThemeTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="themeId", type=String.class, parameters={})
    private Output<String> themeId;

    public Output<String> themeId() {
        return this.themeId;
    }
    @Export(name="type", type=ThemeType.class, parameters={})
    private Output<ThemeType> type;

    public Output<ThemeType> type() {
        return this.type;
    }
    @Export(name="version", type=ThemeVersion.class, parameters={})
    private Output<ThemeVersion> version;

    public Output<ThemeVersion> version() {
        return this.version;
    }
    /**
     * &lt;p&gt;A description of the first version of the theme that you&#39;re creating. Every time
     * 				&lt;code&gt;UpdateTheme&lt;/code&gt; is called, a new version is created. Each version of the
     * 			theme has a description of the version in the &lt;code&gt;VersionDescription&lt;/code&gt;
     * 			field.&lt;/p&gt;
     * 
     */
    @Export(name="versionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionDescription;

    /**
     * @return &lt;p&gt;A description of the first version of the theme that you&#39;re creating. Every time
     * 				&lt;code&gt;UpdateTheme&lt;/code&gt; is called, a new version is created. Each version of the
     * 			theme has a description of the version in the &lt;code&gt;VersionDescription&lt;/code&gt;
     * 			field.&lt;/p&gt;
     * 
     */
    public Output<Optional<String>> versionDescription() {
        return Codegen.optional(this.versionDescription);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Theme(String name) {
        this(name, ThemeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Theme(String name, ThemeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Theme(String name, ThemeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Theme", name, args == null ? ThemeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Theme(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Theme", name, null, makeResourceOptions(options, id));
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
    public static Theme get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Theme(name, id, options);
    }
}
