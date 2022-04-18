// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.AvailabilityInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.CostInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.DescriptionResponse;
import com.pulumi.azurenative.edgeorder.inputs.FilterablePropertyResponse;
import com.pulumi.azurenative.edgeorder.inputs.HierarchyInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.ImageInformationResponse;
import com.pulumi.azurenative.edgeorder.inputs.ProductResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Product line
 * 
 */
public final class ProductLineResponse extends com.pulumi.resources.InvokeArgs {

    public static final ProductLineResponse Empty = new ProductLineResponse();

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
     * List of products in the product line
     * 
     */
    @Import(name="products", required=true)
      private final List<ProductResponse> products;

    public List<ProductResponse> products() {
        return this.products;
    }

    public ProductLineResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<ProductResponse> products) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation, "expected parameter 'availabilityInformation' to be non-null");
        this.costInformation = Objects.requireNonNull(costInformation, "expected parameter 'costInformation' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
        this.imageInformation = Objects.requireNonNull(imageInformation, "expected parameter 'imageInformation' to be non-null");
        this.products = Objects.requireNonNull(products, "expected parameter 'products' to be non-null");
    }

    private ProductLineResponse() {
        this.availabilityInformation = null;
        this.costInformation = null;
        this.description = null;
        this.displayName = null;
        this.filterableProperties = List.of();
        this.hierarchyInformation = null;
        this.imageInformation = List.of();
        this.products = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductLineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<ProductResponse> products;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductLineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.products = defaults.products;
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
        public Builder products(List<ProductResponse> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public Builder products(ProductResponse... products) {
            return products(List.of(products));
        }        public ProductLineResponse build() {
            return new ProductLineResponse(availabilityInformation, costInformation, description, displayName, filterableProperties, hierarchyInformation, imageInformation, products);
        }
    }
}
