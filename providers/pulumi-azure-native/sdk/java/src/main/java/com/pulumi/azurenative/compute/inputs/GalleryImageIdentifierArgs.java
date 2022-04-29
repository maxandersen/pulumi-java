// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * This is the gallery image definition identifier.
 * 
 */
public final class GalleryImageIdentifierArgs extends ResourceArgs {

    public static final GalleryImageIdentifierArgs Empty = new GalleryImageIdentifierArgs();

    /**
     * The name of the gallery image definition offer.
     * 
     */
    @Import(name="offer", required=true)
    private Output<String> offer;

    /**
     * @return The name of the gallery image definition offer.
     * 
     */
    public Output<String> offer() {
        return this.offer;
    }

    /**
     * The name of the gallery image definition publisher.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return The name of the gallery image definition publisher.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The name of the gallery image definition SKU.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return The name of the gallery image definition SKU.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    private GalleryImageIdentifierArgs() {}

    private GalleryImageIdentifierArgs(GalleryImageIdentifierArgs $) {
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryImageIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryImageIdentifierArgs $;

        public Builder() {
            $ = new GalleryImageIdentifierArgs();
        }

        public Builder(GalleryImageIdentifierArgs defaults) {
            $ = new GalleryImageIdentifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offer The name of the gallery image definition offer.
         * 
         * @return builder
         * 
         */
        public Builder offer(Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer The name of the gallery image definition offer.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param publisher The name of the gallery image definition publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The name of the gallery image definition publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param sku The name of the gallery image definition SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The name of the gallery image definition SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public GalleryImageIdentifierArgs build() {
            $.offer = Objects.requireNonNull($.offer, "expected parameter 'offer' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
