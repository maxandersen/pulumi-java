// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.retail_v2alpha.ServingConfigArgs;
import com.pulumi.googlenative.retail_v2alpha.outputs.GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a ServingConfig. A maximum of 100 ServingConfigs are allowed in a Catalog, otherwise a FAILED_PRECONDITION error is returned.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:retail/v2alpha:ServingConfig")
public class ServingConfig extends com.pulumi.resources.CustomResource {
    /**
     * Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 10. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="boostControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> boostControlIds;

    /**
     * @return Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 10. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> boostControlIds() {
        return this.boostControlIds;
    }
    /**
     * The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Export(name="diversityLevel", type=String.class, parameters={})
    private Output<String> diversityLevel;

    /**
     * @return How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public Output<String> diversityLevel() {
        return this.diversityLevel;
    }
    /**
     * Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="doNotAssociateControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> doNotAssociateControlIds;

    /**
     * @return Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> doNotAssociateControlIds() {
        return this.doNotAssociateControlIds;
    }
    /**
     * The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="dynamicFacetSpec", type=GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse.class, parameters={})
    private Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse> dynamicFacetSpec;

    /**
     * @return The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse> dynamicFacetSpec() {
        return this.dynamicFacetSpec;
    }
    /**
     * Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Export(name="enableCategoryFilterLevel", type=String.class, parameters={})
    private Output<String> enableCategoryFilterLevel;

    /**
     * @return Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public Output<String> enableCategoryFilterLevel() {
        return this.enableCategoryFilterLevel;
    }
    /**
     * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="facetControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> facetControlIds;

    /**
     * @return Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> facetControlIds() {
        return this.facetControlIds;
    }
    /**
     * Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="filterControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> filterControlIds;

    /**
     * @return Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> filterControlIds() {
        return this.filterControlIds;
    }
    /**
     * Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="ignoreControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> ignoreControlIds;

    /**
     * @return Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> ignoreControlIds() {
        return this.ignoreControlIds;
    }
    /**
     * The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Export(name="modelId", type=String.class, parameters={})
    private Output<String> modelId;

    /**
     * @return The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public Output<String> modelId() {
        return this.modelId;
    }
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="onewaySynonymsControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> onewaySynonymsControlIds;

    /**
     * @return Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> onewaySynonymsControlIds() {
        return this.onewaySynonymsControlIds;
    }
    /**
     * How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Export(name="priceRerankingLevel", type=String.class, parameters={})
    private Output<String> priceRerankingLevel;

    /**
     * @return How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    public Output<String> priceRerankingLevel() {
        return this.priceRerankingLevel;
    }
    /**
     * Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="redirectControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> redirectControlIds;

    /**
     * @return Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> redirectControlIds() {
        return this.redirectControlIds;
    }
    /**
     * Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="replacementControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> replacementControlIds;

    /**
     * @return Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> replacementControlIds() {
        return this.replacementControlIds;
    }
    /**
     * Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    @Export(name="solutionTypes", type=List.class, parameters={String.class})
    private Output<List<String>> solutionTypes;

    /**
     * @return Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    public Output<List<String>> solutionTypes() {
        return this.solutionTypes;
    }
    /**
     * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Export(name="twowaySynonymsControlIds", type=List.class, parameters={String.class})
    private Output<List<String>> twowaySynonymsControlIds;

    /**
     * @return Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    public Output<List<String>> twowaySynonymsControlIds() {
        return this.twowaySynonymsControlIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServingConfig(String name) {
        this(name, ServingConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServingConfig(String name, ServingConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServingConfig(String name, ServingConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:retail/v2alpha:ServingConfig", name, args == null ? ServingConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServingConfig(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:retail/v2alpha:ServingConfig", name, null, makeResourceOptions(options, id));
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
    public static ServingConfig get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServingConfig(name, id, options);
    }
}
