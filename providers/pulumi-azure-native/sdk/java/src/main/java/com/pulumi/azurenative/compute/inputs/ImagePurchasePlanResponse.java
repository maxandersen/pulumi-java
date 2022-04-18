// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the gallery image definition purchase plan. This is used by marketplace images.
 * 
 */
public final class ImagePurchasePlanResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImagePurchasePlanResponse Empty = new ImagePurchasePlanResponse();

    /**
     * The plan ID.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The product ID.
     * 
     */
    @Import(name="product")
      private final @Nullable String product;

    public Optional<String> product() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    /**
     * The publisher ID.
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> publisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    public ImagePurchasePlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.publisher = publisher;
    }

    private ImagePurchasePlanResponse() {
        this.name = null;
        this.product = null;
        this.publisher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePurchasePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.publisher = defaults.publisher;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }        public ImagePurchasePlanResponse build() {
            return new ImagePurchasePlanResponse(name, product, publisher);
        }
    }
}
