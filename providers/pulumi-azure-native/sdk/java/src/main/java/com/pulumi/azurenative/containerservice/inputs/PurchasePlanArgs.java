// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
 * 
 */
public final class PurchasePlanArgs extends ResourceArgs {

    public static final PurchasePlanArgs Empty = new PurchasePlanArgs();

    /**
     * The plan ID.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The plan ID.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    /**
     * @return Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * The promotion code.
     * 
     */
    @Import(name="promotionCode")
    private @Nullable Output<String> promotionCode;

    /**
     * @return The promotion code.
     * 
     */
    public Optional<Output<String>> promotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }

    /**
     * The plan ID.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return The plan ID.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    private PurchasePlanArgs() {}

    private PurchasePlanArgs(PurchasePlanArgs $) {
        this.name = $.name;
        this.product = $.product;
        this.promotionCode = $.promotionCode;
        this.publisher = $.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PurchasePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PurchasePlanArgs $;

        public Builder() {
            $ = new PurchasePlanArgs();
        }

        public Builder(PurchasePlanArgs defaults) {
            $ = new PurchasePlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The plan ID.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The plan ID.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param product Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
         * 
         * @return builder
         * 
         */
        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param promotionCode The promotion code.
         * 
         * @return builder
         * 
         */
        public Builder promotionCode(@Nullable Output<String> promotionCode) {
            $.promotionCode = promotionCode;
            return this;
        }

        /**
         * @param promotionCode The promotion code.
         * 
         * @return builder
         * 
         */
        public Builder promotionCode(String promotionCode) {
            return promotionCode(Output.of(promotionCode));
        }

        /**
         * @param publisher The plan ID.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The plan ID.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public PurchasePlanArgs build() {
            return $;
        }
    }

}
