// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GalleryImageIdentifierResponse {
    /**
     * The name of the gallery image definition offer.
     * 
     */
    private final String offer;
    /**
     * The name of the gallery image definition publisher.
     * 
     */
    private final String publisher;
    /**
     * The name of the gallery image definition SKU.
     * 
     */
    private final String sku;

    @CustomType.Constructor
    private GalleryImageIdentifierResponse(
        @CustomType.Parameter("offer") String offer,
        @CustomType.Parameter("publisher") String publisher,
        @CustomType.Parameter("sku") String sku) {
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
    }

    /**
     * The name of the gallery image definition offer.
     * 
    */
    public String offer() {
        return this.offer;
    }
    /**
     * The name of the gallery image definition publisher.
     * 
    */
    public String publisher() {
        return this.publisher;
    }
    /**
     * The name of the gallery image definition SKU.
     * 
    */
    public String sku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
        }

        public Builder offer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }        public GalleryImageIdentifierResponse build() {
            return new GalleryImageIdentifierResponse(offer, publisher, sku);
        }
    }
}
