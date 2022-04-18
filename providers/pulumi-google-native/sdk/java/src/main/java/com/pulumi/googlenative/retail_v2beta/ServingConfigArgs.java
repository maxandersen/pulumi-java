// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.retail_v2beta.enums.ServingConfigSolutionTypesItem;
import com.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServingConfigArgs Empty = new ServingConfigArgs();

    /**
     * Condition boost specifications. If a product matches multiple conditions in the specifications, boost scores from these specifications are all applied and combined in a non-linear way. Maximum number of specifications is 10. Notice that if both ServingConfig.boost_control_ids and [SearchRequest.boost_spec] are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="boostControlIds")
      private final @Nullable Output<List<String>> boostControlIds;

    public Output<List<String>> boostControlIds() {
        return this.boostControlIds == null ? Codegen.empty() : this.boostControlIds;
    }

    @Import(name="catalogId", required=true)
      private final Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    /**
     * The human readable serving config display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * How much diversity to use in recommendation model results e.g. 'medium-diversity' or 'high-diversity'. Currently supported values: * 'no-diversity' * 'low-diversity' * 'medium-diversity' * 'high-diversity' * 'auto-diversity' If not specified, we choose default based on recommendation model type. Default value: 'no-diversity'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Import(name="diversityLevel")
      private final @Nullable Output<String> diversityLevel;

    public Output<String> diversityLevel() {
        return this.diversityLevel == null ? Codegen.empty() : this.diversityLevel;
    }

    /**
     * Condition do not associate specifications. If multiple do not associate conditions match, all matching do not associate controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="doNotAssociateControlIds")
      private final @Nullable Output<List<String>> doNotAssociateControlIds;

    public Output<List<String>> doNotAssociateControlIds() {
        return this.doNotAssociateControlIds == null ? Codegen.empty() : this.doNotAssociateControlIds;
    }

    /**
     * The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="dynamicFacetSpec")
      private final @Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec;

    public Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec() {
        return this.dynamicFacetSpec == null ? Codegen.empty() : this.dynamicFacetSpec;
    }

    /**
     * Whether to add additional category filters on the 'similar-items' model. If not specified, we enable it by default. Allowed values are: * 'no-category-match': No additional filtering of original results from the model and the customer's filters. * 'relaxed-category-match': Only keep results with categories that match at least one item categories in the PredictRequests's context item. * If customer also sends filters in the PredictRequest, then the results will satisfy both conditions (user given and category match). Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Import(name="enableCategoryFilterLevel")
      private final @Nullable Output<String> enableCategoryFilterLevel;

    public Output<String> enableCategoryFilterLevel() {
        return this.enableCategoryFilterLevel == null ? Codegen.empty() : this.enableCategoryFilterLevel;
    }

    /**
     * Facet specifications for faceted search. If empty, no facets are returned. The ids refer to the ids of Control resources with only the Facet control set. These controls are assumed to be in the same Catalog as the ServingConfig. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="facetControlIds")
      private final @Nullable Output<List<String>> facetControlIds;

    public Output<List<String>> facetControlIds() {
        return this.facetControlIds == null ? Codegen.empty() : this.facetControlIds;
    }

    /**
     * Condition filter specifications. If a product matches multiple conditions in the specifications, filters from these specifications are all applied and combined via the AND operator. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="filterControlIds")
      private final @Nullable Output<List<String>> filterControlIds;

    public Output<List<String>> filterControlIds() {
        return this.filterControlIds == null ? Codegen.empty() : this.filterControlIds;
    }

    /**
     * Condition ignore specifications. If multiple ignore conditions match, all matching ignore controls in the list will execute. - Order does not matter. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="ignoreControlIds")
      private final @Nullable Output<List<String>> ignoreControlIds;

    public Output<List<String>> ignoreControlIds() {
        return this.ignoreControlIds == null ? Codegen.empty() : this.ignoreControlIds;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The id of the model to use at serving time. Currently only RecommendationModels are supported: https://cloud.google.com/retail/recommendations-ai/docs/create-models Can be changed but only to a compatible model (e.g. others-you-may-like CTR to others-you-may-like CVR). Required when solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Import(name="modelId")
      private final @Nullable Output<String> modelId;

    public Output<String> modelId() {
        return this.modelId == null ? Codegen.empty() : this.modelId;
    }

    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}servingConfig/*
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Condition oneway synonyms specifications. If multiple oneway synonyms conditions match, all matching oneway synonyms controls in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="onewaySynonymsControlIds")
      private final @Nullable Output<List<String>> onewaySynonymsControlIds;

    public Output<List<String>> onewaySynonymsControlIds() {
        return this.onewaySynonymsControlIds == null ? Codegen.empty() : this.onewaySynonymsControlIds;
    }

    /**
     * How much price ranking we want in serving results. Price reranking causes product items with a similar recommendation probability to be ordered by price, with the highest-priced items first. This setting could result in a decrease in click-through and conversion rates. Allowed values are: * 'no-price-reranking' * 'low-price-raranking' * 'medium-price-reranking' * 'high-price-reranking' If not specified, we choose default based on model type. Default value: 'no-price-reranking'. Can only be set if solution_types is SOLUTION_TYPE_RECOMMENDATION.
     * 
     */
    @Import(name="priceRerankingLevel")
      private final @Nullable Output<String> priceRerankingLevel;

    public Output<String> priceRerankingLevel() {
        return this.priceRerankingLevel == null ? Codegen.empty() : this.priceRerankingLevel;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Condition redirect specifications. Only the first triggered redirect action is applied, even if multiple apply. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="redirectControlIds")
      private final @Nullable Output<List<String>> redirectControlIds;

    public Output<List<String>> redirectControlIds() {
        return this.redirectControlIds == null ? Codegen.empty() : this.redirectControlIds;
    }

    /**
     * Condition replacement specifications. - Applied according to the order in the list. - A previously replaced term can not be re-replaced. - Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="replacementControlIds")
      private final @Nullable Output<List<String>> replacementControlIds;

    public Output<List<String>> replacementControlIds() {
        return this.replacementControlIds == null ? Codegen.empty() : this.replacementControlIds;
    }

    @Import(name="servingConfigId", required=true)
      private final Output<String> servingConfigId;

    public Output<String> servingConfigId() {
        return this.servingConfigId;
    }

    /**
     * Immutable. Specifies the solution types that a serving config can be associated with. Currently we support setting only one type of solution.
     * 
     */
    @Import(name="solutionTypes", required=true)
      private final Output<List<ServingConfigSolutionTypesItem>> solutionTypes;

    public Output<List<ServingConfigSolutionTypesItem>> solutionTypes() {
        return this.solutionTypes;
    }

    /**
     * Condition synonyms specifications. If multiple syonyms conditions match, all matching synonyms control in the list will execute. Order of controls in the list will not matter. Maximum number of specifications is 100. Can only be set if solution_types is SOLUTION_TYPE_SEARCH.
     * 
     */
    @Import(name="twowaySynonymsControlIds")
      private final @Nullable Output<List<String>> twowaySynonymsControlIds;

    public Output<List<String>> twowaySynonymsControlIds() {
        return this.twowaySynonymsControlIds == null ? Codegen.empty() : this.twowaySynonymsControlIds;
    }

    public ServingConfigArgs(
        @Nullable Output<List<String>> boostControlIds,
        Output<String> catalogId,
        Output<String> displayName,
        @Nullable Output<String> diversityLevel,
        @Nullable Output<List<String>> doNotAssociateControlIds,
        @Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec,
        @Nullable Output<String> enableCategoryFilterLevel,
        @Nullable Output<List<String>> facetControlIds,
        @Nullable Output<List<String>> filterControlIds,
        @Nullable Output<List<String>> ignoreControlIds,
        @Nullable Output<String> location,
        @Nullable Output<String> modelId,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> onewaySynonymsControlIds,
        @Nullable Output<String> priceRerankingLevel,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> redirectControlIds,
        @Nullable Output<List<String>> replacementControlIds,
        Output<String> servingConfigId,
        Output<List<ServingConfigSolutionTypesItem>> solutionTypes,
        @Nullable Output<List<String>> twowaySynonymsControlIds) {
        this.boostControlIds = boostControlIds;
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.diversityLevel = diversityLevel;
        this.doNotAssociateControlIds = doNotAssociateControlIds;
        this.dynamicFacetSpec = dynamicFacetSpec;
        this.enableCategoryFilterLevel = enableCategoryFilterLevel;
        this.facetControlIds = facetControlIds;
        this.filterControlIds = filterControlIds;
        this.ignoreControlIds = ignoreControlIds;
        this.location = location;
        this.modelId = modelId;
        this.name = name;
        this.onewaySynonymsControlIds = onewaySynonymsControlIds;
        this.priceRerankingLevel = priceRerankingLevel;
        this.project = project;
        this.redirectControlIds = redirectControlIds;
        this.replacementControlIds = replacementControlIds;
        this.servingConfigId = Objects.requireNonNull(servingConfigId, "expected parameter 'servingConfigId' to be non-null");
        this.solutionTypes = Objects.requireNonNull(solutionTypes, "expected parameter 'solutionTypes' to be non-null");
        this.twowaySynonymsControlIds = twowaySynonymsControlIds;
    }

    private ServingConfigArgs() {
        this.boostControlIds = Codegen.empty();
        this.catalogId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.diversityLevel = Codegen.empty();
        this.doNotAssociateControlIds = Codegen.empty();
        this.dynamicFacetSpec = Codegen.empty();
        this.enableCategoryFilterLevel = Codegen.empty();
        this.facetControlIds = Codegen.empty();
        this.filterControlIds = Codegen.empty();
        this.ignoreControlIds = Codegen.empty();
        this.location = Codegen.empty();
        this.modelId = Codegen.empty();
        this.name = Codegen.empty();
        this.onewaySynonymsControlIds = Codegen.empty();
        this.priceRerankingLevel = Codegen.empty();
        this.project = Codegen.empty();
        this.redirectControlIds = Codegen.empty();
        this.replacementControlIds = Codegen.empty();
        this.servingConfigId = Codegen.empty();
        this.solutionTypes = Codegen.empty();
        this.twowaySynonymsControlIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> boostControlIds;
        private Output<String> catalogId;
        private Output<String> displayName;
        private @Nullable Output<String> diversityLevel;
        private @Nullable Output<List<String>> doNotAssociateControlIds;
        private @Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec;
        private @Nullable Output<String> enableCategoryFilterLevel;
        private @Nullable Output<List<String>> facetControlIds;
        private @Nullable Output<List<String>> filterControlIds;
        private @Nullable Output<List<String>> ignoreControlIds;
        private @Nullable Output<String> location;
        private @Nullable Output<String> modelId;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> onewaySynonymsControlIds;
        private @Nullable Output<String> priceRerankingLevel;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> redirectControlIds;
        private @Nullable Output<List<String>> replacementControlIds;
        private Output<String> servingConfigId;
        private Output<List<ServingConfigSolutionTypesItem>> solutionTypes;
        private @Nullable Output<List<String>> twowaySynonymsControlIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ServingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostControlIds = defaults.boostControlIds;
    	      this.catalogId = defaults.catalogId;
    	      this.displayName = defaults.displayName;
    	      this.diversityLevel = defaults.diversityLevel;
    	      this.doNotAssociateControlIds = defaults.doNotAssociateControlIds;
    	      this.dynamicFacetSpec = defaults.dynamicFacetSpec;
    	      this.enableCategoryFilterLevel = defaults.enableCategoryFilterLevel;
    	      this.facetControlIds = defaults.facetControlIds;
    	      this.filterControlIds = defaults.filterControlIds;
    	      this.ignoreControlIds = defaults.ignoreControlIds;
    	      this.location = defaults.location;
    	      this.modelId = defaults.modelId;
    	      this.name = defaults.name;
    	      this.onewaySynonymsControlIds = defaults.onewaySynonymsControlIds;
    	      this.priceRerankingLevel = defaults.priceRerankingLevel;
    	      this.project = defaults.project;
    	      this.redirectControlIds = defaults.redirectControlIds;
    	      this.replacementControlIds = defaults.replacementControlIds;
    	      this.servingConfigId = defaults.servingConfigId;
    	      this.solutionTypes = defaults.solutionTypes;
    	      this.twowaySynonymsControlIds = defaults.twowaySynonymsControlIds;
        }

        public Builder boostControlIds(@Nullable Output<List<String>> boostControlIds) {
            this.boostControlIds = boostControlIds;
            return this;
        }
        public Builder boostControlIds(@Nullable List<String> boostControlIds) {
            this.boostControlIds = Codegen.ofNullable(boostControlIds);
            return this;
        }
        public Builder boostControlIds(String... boostControlIds) {
            return boostControlIds(List.of(boostControlIds));
        }
        public Builder catalogId(Output<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder catalogId(String catalogId) {
            this.catalogId = Output.of(Objects.requireNonNull(catalogId));
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder diversityLevel(@Nullable Output<String> diversityLevel) {
            this.diversityLevel = diversityLevel;
            return this;
        }
        public Builder diversityLevel(@Nullable String diversityLevel) {
            this.diversityLevel = Codegen.ofNullable(diversityLevel);
            return this;
        }
        public Builder doNotAssociateControlIds(@Nullable Output<List<String>> doNotAssociateControlIds) {
            this.doNotAssociateControlIds = doNotAssociateControlIds;
            return this;
        }
        public Builder doNotAssociateControlIds(@Nullable List<String> doNotAssociateControlIds) {
            this.doNotAssociateControlIds = Codegen.ofNullable(doNotAssociateControlIds);
            return this;
        }
        public Builder doNotAssociateControlIds(String... doNotAssociateControlIds) {
            return doNotAssociateControlIds(List.of(doNotAssociateControlIds));
        }
        public Builder dynamicFacetSpec(@Nullable Output<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs> dynamicFacetSpec) {
            this.dynamicFacetSpec = dynamicFacetSpec;
            return this;
        }
        public Builder dynamicFacetSpec(@Nullable GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecArgs dynamicFacetSpec) {
            this.dynamicFacetSpec = Codegen.ofNullable(dynamicFacetSpec);
            return this;
        }
        public Builder enableCategoryFilterLevel(@Nullable Output<String> enableCategoryFilterLevel) {
            this.enableCategoryFilterLevel = enableCategoryFilterLevel;
            return this;
        }
        public Builder enableCategoryFilterLevel(@Nullable String enableCategoryFilterLevel) {
            this.enableCategoryFilterLevel = Codegen.ofNullable(enableCategoryFilterLevel);
            return this;
        }
        public Builder facetControlIds(@Nullable Output<List<String>> facetControlIds) {
            this.facetControlIds = facetControlIds;
            return this;
        }
        public Builder facetControlIds(@Nullable List<String> facetControlIds) {
            this.facetControlIds = Codegen.ofNullable(facetControlIds);
            return this;
        }
        public Builder facetControlIds(String... facetControlIds) {
            return facetControlIds(List.of(facetControlIds));
        }
        public Builder filterControlIds(@Nullable Output<List<String>> filterControlIds) {
            this.filterControlIds = filterControlIds;
            return this;
        }
        public Builder filterControlIds(@Nullable List<String> filterControlIds) {
            this.filterControlIds = Codegen.ofNullable(filterControlIds);
            return this;
        }
        public Builder filterControlIds(String... filterControlIds) {
            return filterControlIds(List.of(filterControlIds));
        }
        public Builder ignoreControlIds(@Nullable Output<List<String>> ignoreControlIds) {
            this.ignoreControlIds = ignoreControlIds;
            return this;
        }
        public Builder ignoreControlIds(@Nullable List<String> ignoreControlIds) {
            this.ignoreControlIds = Codegen.ofNullable(ignoreControlIds);
            return this;
        }
        public Builder ignoreControlIds(String... ignoreControlIds) {
            return ignoreControlIds(List.of(ignoreControlIds));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder modelId(@Nullable Output<String> modelId) {
            this.modelId = modelId;
            return this;
        }
        public Builder modelId(@Nullable String modelId) {
            this.modelId = Codegen.ofNullable(modelId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder onewaySynonymsControlIds(@Nullable Output<List<String>> onewaySynonymsControlIds) {
            this.onewaySynonymsControlIds = onewaySynonymsControlIds;
            return this;
        }
        public Builder onewaySynonymsControlIds(@Nullable List<String> onewaySynonymsControlIds) {
            this.onewaySynonymsControlIds = Codegen.ofNullable(onewaySynonymsControlIds);
            return this;
        }
        public Builder onewaySynonymsControlIds(String... onewaySynonymsControlIds) {
            return onewaySynonymsControlIds(List.of(onewaySynonymsControlIds));
        }
        public Builder priceRerankingLevel(@Nullable Output<String> priceRerankingLevel) {
            this.priceRerankingLevel = priceRerankingLevel;
            return this;
        }
        public Builder priceRerankingLevel(@Nullable String priceRerankingLevel) {
            this.priceRerankingLevel = Codegen.ofNullable(priceRerankingLevel);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder redirectControlIds(@Nullable Output<List<String>> redirectControlIds) {
            this.redirectControlIds = redirectControlIds;
            return this;
        }
        public Builder redirectControlIds(@Nullable List<String> redirectControlIds) {
            this.redirectControlIds = Codegen.ofNullable(redirectControlIds);
            return this;
        }
        public Builder redirectControlIds(String... redirectControlIds) {
            return redirectControlIds(List.of(redirectControlIds));
        }
        public Builder replacementControlIds(@Nullable Output<List<String>> replacementControlIds) {
            this.replacementControlIds = replacementControlIds;
            return this;
        }
        public Builder replacementControlIds(@Nullable List<String> replacementControlIds) {
            this.replacementControlIds = Codegen.ofNullable(replacementControlIds);
            return this;
        }
        public Builder replacementControlIds(String... replacementControlIds) {
            return replacementControlIds(List.of(replacementControlIds));
        }
        public Builder servingConfigId(Output<String> servingConfigId) {
            this.servingConfigId = Objects.requireNonNull(servingConfigId);
            return this;
        }
        public Builder servingConfigId(String servingConfigId) {
            this.servingConfigId = Output.of(Objects.requireNonNull(servingConfigId));
            return this;
        }
        public Builder solutionTypes(Output<List<ServingConfigSolutionTypesItem>> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }
        public Builder solutionTypes(List<ServingConfigSolutionTypesItem> solutionTypes) {
            this.solutionTypes = Output.of(Objects.requireNonNull(solutionTypes));
            return this;
        }
        public Builder solutionTypes(ServingConfigSolutionTypesItem... solutionTypes) {
            return solutionTypes(List.of(solutionTypes));
        }
        public Builder twowaySynonymsControlIds(@Nullable Output<List<String>> twowaySynonymsControlIds) {
            this.twowaySynonymsControlIds = twowaySynonymsControlIds;
            return this;
        }
        public Builder twowaySynonymsControlIds(@Nullable List<String> twowaySynonymsControlIds) {
            this.twowaySynonymsControlIds = Codegen.ofNullable(twowaySynonymsControlIds);
            return this;
        }
        public Builder twowaySynonymsControlIds(String... twowaySynonymsControlIds) {
            return twowaySynonymsControlIds(List.of(twowaySynonymsControlIds));
        }        public ServingConfigArgs build() {
            return new ServingConfigArgs(boostControlIds, catalogId, displayName, diversityLevel, doNotAssociateControlIds, dynamicFacetSpec, enableCategoryFilterLevel, facetControlIds, filterControlIds, ignoreControlIds, location, modelId, name, onewaySynonymsControlIds, priceRerankingLevel, project, redirectControlIds, replacementControlIds, servingConfigId, solutionTypes, twowaySynonymsControlIds);
        }
    }
}
