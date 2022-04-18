// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.AvailabilityInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.CostInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.DescriptionResponse;
import com.pulumi.azurenative.edgeorder.inputs.DimensionsResponse;
import com.pulumi.azurenative.edgeorder.inputs.FilterablePropertyResponse;
import com.pulumi.azurenative.edgeorder.inputs.HierarchyInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.ImageInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.SpecificationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration object.
 * 
 */
public final class ConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationResponse Empty = new ConfigurationResponse();

    /**
     * Availability information of the product system.
     * 
     */
    @Import(name="availabilityInformation", required=true)
      private final AvailabilityInformationResponse availabilityInformation;

    public AvailabilityInformationResponse availabilityInformation() {
        return this.availabilityInformation;
    }

    /**
     * Cost information for the product system.
     * 
     */
    @Import(name="costInformation", required=true)
      private final CostInformationResponse costInformation;

    public CostInformationResponse costInformation() {
        return this.costInformation;
    }

    /**
     * Description related to the product system.
     * 
     */
    @Import(name="description", required=true)
      private final DescriptionResponse description;

    public DescriptionResponse description() {
        return this.description;
    }

    /**
     * Dimensions of the configuration
     * 
     */
    @Import(name="dimensions", required=true)
      private final DimensionsResponse dimensions;

    public DimensionsResponse dimensions() {
        return this.dimensions;
    }

    /**
     * Display Name for the product system.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * list of filters supported for a product
     * 
     */
    @Import(name="filterableProperties", required=true)
      private final List<FilterablePropertyResponse> filterableProperties;

    public List<FilterablePropertyResponse> filterableProperties() {
        return this.filterableProperties;
    }

    /**
     * Hierarchy information of a product.
     * 
     */
    @Import(name="hierarchyInformation", required=true)
      private final HierarchyInformationResponse hierarchyInformation;

    public HierarchyInformationResponse hierarchyInformation() {
        return this.hierarchyInformation;
    }

    /**
     * Image information for the product system.
     * 
     */
    @Import(name="imageInformation", required=true)
      private final List<ImageInformationResponse> imageInformation;

    public List<ImageInformationResponse> imageInformation() {
        return this.imageInformation;
    }

    /**
     * Specifications of the configuration
     * 
     */
    @Import(name="specifications", required=true)
      private final List<SpecificationResponse> specifications;

    public List<SpecificationResponse> specifications() {
        return this.specifications;
    }

    public ConfigurationResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        DimensionsResponse dimensions,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<SpecificationResponse> specifications) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation, "expected parameter 'availabilityInformation' to be non-null");
        this.costInformation = Objects.requireNonNull(costInformation, "expected parameter 'costInformation' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
        this.imageInformation = Objects.requireNonNull(imageInformation, "expected parameter 'imageInformation' to be non-null");
        this.specifications = Objects.requireNonNull(specifications, "expected parameter 'specifications' to be non-null");
    }

    private ConfigurationResponse() {
        this.availabilityInformation = null;
        this.costInformation = null;
        this.description = null;
        this.dimensions = null;
        this.displayName = null;
        this.filterableProperties = List.of();
        this.hierarchyInformation = null;
        this.imageInformation = List.of();
        this.specifications = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private DimensionsResponse dimensions;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<SpecificationResponse> specifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.dimensions = defaults.dimensions;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.specifications = defaults.specifications;
        }

        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }
        public Builder costInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }
        public Builder description(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dimensions(DimensionsResponse dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder filterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }
        public Builder filterableProperties(FilterablePropertyResponse... filterableProperties) {
            return filterableProperties(List.of(filterableProperties));
        }
        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }
        public Builder imageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }
        public Builder imageInformation(ImageInformationResponse... imageInformation) {
            return imageInformation(List.of(imageInformation));
        }
        public Builder specifications(List<SpecificationResponse> specifications) {
            this.specifications = Objects.requireNonNull(specifications);
            return this;
        }
        public Builder specifications(SpecificationResponse... specifications) {
            return specifications(List.of(specifications));
        }        public ConfigurationResponse build() {
            return new ConfigurationResponse(availabilityInformation, costInformation, description, dimensions, displayName, filterableProperties, hierarchyInformation, imageInformation, specifications);
        }
    }
}
