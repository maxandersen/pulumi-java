// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.addons;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.addons.SupportPlanTypeArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The status of the Canonical support plan.
 * API Version: 2018-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:addons:SupportPlanType Standard subscriptions/d18d258f-bdba-4de1-8b51-e79d6c181d5e/providers/Microsoft.Addons/supportProviders/canonical/supportPlanTypes/Standard 
 * ```
 * 
 */
@ResourceType(type="azure-native:addons:SupportPlanType")
public class SupportPlanType extends CustomResource {
    /**
     * The name of the Canonical support plan, i.e. &#34;essential&#34;, &#34;standard&#34; or &#34;advanced&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Canonical support plan, i.e. &#34;essential&#34;, &#34;standard&#34; or &#34;advanced&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<Optional<String>> provisioningState() {
        return Codegen.optional(this.provisioningState);
    }
    /**
     * Microsoft.Addons/supportProvider
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Microsoft.Addons/supportProvider
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SupportPlanType(String name) {
        this(name, SupportPlanTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SupportPlanType(String name, SupportPlanTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SupportPlanType(String name, SupportPlanTypeArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:addons:SupportPlanType", name, args == null ? SupportPlanTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SupportPlanType(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:addons:SupportPlanType", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:addons/v20170515:SupportPlanType").build()),
                Output.of(Alias.builder().type("azure-native:addons/v20180301:SupportPlanType").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SupportPlanType get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new SupportPlanType(name, id, options);
    }
}
