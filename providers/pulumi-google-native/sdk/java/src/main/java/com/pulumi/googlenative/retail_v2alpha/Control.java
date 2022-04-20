// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.retail_v2alpha.ControlArgs;
import com.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaRuleResponse;
import com.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Control. If the Control to create already exists, an ALREADY_EXISTS error is returned.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:retail/v2alpha:Control")
public class Control extends com.pulumi.resources.CustomResource {
    /**
     * List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
     * 
     */
    @Export(name="associatedServingConfigIds", type=List.class, parameters={String.class})
    private Output<List<String>> associatedServingConfigIds;

    /**
     * @return List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
     * 
     */
    public Output<List<String>> associatedServingConfigIds() {
        return this.associatedServingConfigIds;
    }
    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A facet specification to perform faceted search.
     * 
     */
    @Export(name="facetSpec", type=GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse.class, parameters={})
    private Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse> facetSpec;

    /**
     * @return A facet specification to perform faceted search.
     * 
     */
    public Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecResponse> facetSpec() {
        return this.facetSpec;
    }
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost &#34;gShoe&#34; when query full matches &#34;Running Shoes&#34;.
     * 
     */
    @Export(name="rule", type=GoogleCloudRetailV2alphaRuleResponse.class, parameters={})
    private Output<GoogleCloudRetailV2alphaRuleResponse> rule;

    /**
     * @return A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost &#34;gShoe&#34; when query full matches &#34;Running Shoes&#34;.
     * 
     */
    public Output<GoogleCloudRetailV2alphaRuleResponse> rule() {
        return this.rule;
    }
    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    @Export(name="solutionTypes", type=List.class, parameters={String.class})
    private Output<List<String>> solutionTypes;

    /**
     * @return Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    public Output<List<String>> solutionTypes() {
        return this.solutionTypes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Control(String name) {
        this(name, ControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Control(String name, ControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Control(String name, ControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:retail/v2alpha:Control", name, args == null ? ControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Control(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:retail/v2alpha:Control", name, null, makeResourceOptions(options, id));
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
    public static Control get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Control(name, id, options);
    }
}
