// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.FavoriteArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Properties that define a favorite that is associated to an Application Insights component.
 * API Version: 2015-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:Favorite myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/favorites/{favoriteId} 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:Favorite")
public class Favorite extends com.pulumi.resources.CustomResource {
    /**
     * Favorite category, as defined by the user at creation time.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output</* @Nullable */ String> category;

    /**
     * @return Favorite category, as defined by the user at creation time.
     * 
     */
    public Output</* @Nullable */ String> category() {
        return this.category;
    }
    /**
     * Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output</* @Nullable */ String> config;

    /**
     * @return Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON
     * 
     */
    public Output</* @Nullable */ String> config() {
        return this.config;
    }
    /**
     * Internally assigned unique id of the favorite definition.
     * 
     */
    @Export(name="favoriteId", type=String.class, parameters={})
    private Output<String> favoriteId;

    /**
     * @return Internally assigned unique id of the favorite definition.
     * 
     */
    public Output<String> favoriteId() {
        return this.favoriteId;
    }
    /**
     * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    @Export(name="favoriteType", type=String.class, parameters={})
    private Output</* @Nullable */ String> favoriteType;

    /**
     * @return Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    public Output</* @Nullable */ String> favoriteType() {
        return this.favoriteType;
    }
    /**
     * Flag denoting wether or not this favorite was generated from a template.
     * 
     */
    @Export(name="isGeneratedFromTemplate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isGeneratedFromTemplate;

    /**
     * @return Flag denoting wether or not this favorite was generated from a template.
     * 
     */
    public Output</* @Nullable */ Boolean> isGeneratedFromTemplate() {
        return this.isGeneratedFromTemplate;
    }
    /**
     * The user-defined name of the favorite.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The user-defined name of the favorite.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * The source of the favorite definition.
     * 
     */
    @Export(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The source of the favorite definition.
     * 
     */
    public Output</* @Nullable */ String> sourceType() {
        return this.sourceType;
    }
    /**
     * A list of 0 or more tags that are associated with this favorite definition
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of 0 or more tags that are associated with this favorite definition
     * 
     */
    public Output</* @Nullable */ List<String>> tags() {
        return this.tags;
    }
    /**
     * Date and time in UTC of the last modification that was made to this favorite definition.
     * 
     */
    @Export(name="timeModified", type=String.class, parameters={})
    private Output<String> timeModified;

    /**
     * @return Date and time in UTC of the last modification that was made to this favorite definition.
     * 
     */
    public Output<String> timeModified() {
        return this.timeModified;
    }
    /**
     * Unique user id of the specific user that owns this favorite.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return Unique user id of the specific user that owns this favorite.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * This instance&#39;s version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return This instance&#39;s version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
     */
    public Output</* @Nullable */ String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Favorite(String name) {
        this(name, FavoriteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Favorite(String name, FavoriteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Favorite(String name, FavoriteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Favorite", name, args == null ? FavoriteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Favorite(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Favorite", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20150501:Favorite").build())
            ))
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
    public static Favorite get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Favorite(name, id, options);
    }
}
