// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.retail_v2alpha.enums.ControlSolutionTypesItem;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaRuleArgs;
import io.pulumi.googlenative.retail_v2alpha.inputs.GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlArgs Empty = new ControlArgs();

    @Import(name="catalogId", required=true)
      private final Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    @Import(name="controlId", required=true)
      private final Output<String> controlId;

    public Output<String> controlId() {
        return this.controlId;
    }

    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * A facet specification to perform faceted search.
     * 
     */
    @Import(name="facetSpec")
      private final @Nullable Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs> facetSpec;

    public Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs> facetSpec() {
        return this.facetSpec == null ? Codegen.empty() : this.facetSpec;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<GoogleCloudRetailV2alphaRuleArgs> rule;

    public Output<GoogleCloudRetailV2alphaRuleArgs> rule() {
        return this.rule == null ? Codegen.empty() : this.rule;
    }

    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    @Import(name="solutionTypes", required=true)
      private final Output<List<ControlSolutionTypesItem>> solutionTypes;

    public Output<List<ControlSolutionTypesItem>> solutionTypes() {
        return this.solutionTypes;
    }

    public ControlArgs(
        Output<String> catalogId,
        Output<String> controlId,
        Output<String> displayName,
        @Nullable Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs> facetSpec,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudRetailV2alphaRuleArgs> rule,
        Output<List<ControlSolutionTypesItem>> solutionTypes) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.controlId = Objects.requireNonNull(controlId, "expected parameter 'controlId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.facetSpec = facetSpec;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rule = rule;
        this.solutionTypes = Objects.requireNonNull(solutionTypes, "expected parameter 'solutionTypes' to be non-null");
    }

    private ControlArgs() {
        this.catalogId = Codegen.empty();
        this.controlId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.facetSpec = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.rule = Codegen.empty();
        this.solutionTypes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogId;
        private Output<String> controlId;
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs> facetSpec;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudRetailV2alphaRuleArgs> rule;
        private Output<List<ControlSolutionTypesItem>> solutionTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.controlId = defaults.controlId;
    	      this.displayName = defaults.displayName;
    	      this.facetSpec = defaults.facetSpec;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rule = defaults.rule;
    	      this.solutionTypes = defaults.solutionTypes;
        }

        public Builder catalogId(Output<String> catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder catalogId(String catalogId) {
            this.catalogId = Output.of(Objects.requireNonNull(catalogId));
            return this;
        }
        public Builder controlId(Output<String> controlId) {
            this.controlId = Objects.requireNonNull(controlId);
            return this;
        }
        public Builder controlId(String controlId) {
            this.controlId = Output.of(Objects.requireNonNull(controlId));
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
        public Builder facetSpec(@Nullable Output<GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs> facetSpec) {
            this.facetSpec = facetSpec;
            return this;
        }
        public Builder facetSpec(@Nullable GoogleCloudRetailV2alphaSearchRequestFacetSpecArgs facetSpec) {
            this.facetSpec = Codegen.ofNullable(facetSpec);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder rule(@Nullable Output<GoogleCloudRetailV2alphaRuleArgs> rule) {
            this.rule = rule;
            return this;
        }
        public Builder rule(@Nullable GoogleCloudRetailV2alphaRuleArgs rule) {
            this.rule = Codegen.ofNullable(rule);
            return this;
        }
        public Builder solutionTypes(Output<List<ControlSolutionTypesItem>> solutionTypes) {
            this.solutionTypes = Objects.requireNonNull(solutionTypes);
            return this;
        }
        public Builder solutionTypes(List<ControlSolutionTypesItem> solutionTypes) {
            this.solutionTypes = Output.of(Objects.requireNonNull(solutionTypes));
            return this;
        }
        public Builder solutionTypes(ControlSolutionTypesItem... solutionTypes) {
            return solutionTypes(List.of(solutionTypes));
        }        public ControlArgs build() {
            return new ControlArgs(catalogId, controlId, displayName, facetSpec, location, name, project, rule, solutionTypes);
        }
    }
}
