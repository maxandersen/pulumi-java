// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * This is the gallery image definition identifier.
 * 
 */
public final class GalleryImageIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryImageIdentifierArgs Empty = new GalleryImageIdentifierArgs();

    /**
     * The name of the gallery image definition offer.
     * 
     */
    @Import(name="offer", required=true)
      private final Output<String> offer;

    public Output<String> offer() {
        return this.offer;
    }

    /**
     * The name of the gallery image definition publisher.
     * 
     */
    @Import(name="publisher", required=true)
      private final Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The name of the gallery image definition SKU.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<String> sku;

    public Output<String> sku() {
        return this.sku;
    }

    public GalleryImageIdentifierArgs(
        Output<String> offer,
        Output<String> publisher,
        Output<String> sku) {
        this.offer = Objects.requireNonNull(offer, "expected parameter 'offer' to be non-null");
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GalleryImageIdentifierArgs() {
        this.offer = Codegen.empty();
        this.publisher = Codegen.empty();
        this.sku = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> offer;
        private Output<String> publisher;
        private Output<String> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
        }

        public Builder offer(Output<String> offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder offer(String offer) {
            this.offer = Output.of(Objects.requireNonNull(offer));
            return this;
        }
        public Builder publisher(Output<String> publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Output.of(Objects.requireNonNull(publisher));
            return this;
        }
        public Builder sku(Output<String> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }        public GalleryImageIdentifierArgs build() {
            return new GalleryImageIdentifierArgs(offer, publisher, sku);
        }
    }
}
