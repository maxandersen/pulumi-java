// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthbot;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthbot.BotArgs;
import io.pulumi.azurenative.healthbot.outputs.HealthBotPropertiesResponse;
import io.pulumi.azurenative.healthbot.outputs.SkuResponse;
import io.pulumi.azurenative.healthbot.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * HealthBot resource definition
 * API Version: 2020-12-08.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:healthbot:Bot samplebotname /subscriptions/subscription-id/resourceGroups/OneResourceGroupName/providers/Microsoft.HealthBot/healthBots/samplebotname 
 * ```
 * 
 */
@ResourceType(type="azure-native:healthbot:Bot")
public class Bot extends io.pulumi.resources.CustomResource {
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The set of properties specific to Healthbot resource.
     * 
     */
    @Export(name="properties", type=HealthBotPropertiesResponse.class, parameters={})
    private Output<HealthBotPropertiesResponse> properties;

    /**
     * @return The set of properties specific to Healthbot resource.
     * 
     */
    public Output<HealthBotPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * SKU of the HealthBot.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return SKU of the HealthBot.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bot(String name) {
        this(name, BotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bot(String name, BotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bot(String name, BotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthbot:Bot", name, args == null ? BotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthbot:Bot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:healthbot/v20201020:Bot").build()),
                Output.of(Alias.builder().type("azure-native:healthbot/v20201020preview:Bot").build()),
                Output.of(Alias.builder().type("azure-native:healthbot/v20201208:Bot").build()),
                Output.of(Alias.builder().type("azure-native:healthbot/v20201208preview:Bot").build()),
                Output.of(Alias.builder().type("azure-native:healthbot/v20210610:Bot").build()),
                Output.of(Alias.builder().type("azure-native:healthbot/v20210824:Bot").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Bot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Bot(name, id, options);
    }
}
