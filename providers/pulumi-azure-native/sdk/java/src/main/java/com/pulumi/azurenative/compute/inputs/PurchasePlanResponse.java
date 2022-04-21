// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
 * 
 */
public final class PurchasePlanResponse extends com.pulumi.resources.InvokeArgs {

    public static final PurchasePlanResponse Empty = new PurchasePlanResponse();

    /**
     * The plan ID.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    @Import(name="product", required=true)
    private String product;

    public String product() {
        return this.product;
    }

    /**
     * The Offer Promotion Code.
     * 
     */
    @Import(name="promotionCode")
    private @Nullable String promotionCode;

    public Optional<String> promotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }

    /**
     * The publisher ID.
     * 
     */
    @Import(name="publisher", required=true)
    private String publisher;

    public String publisher() {
        return this.publisher;
    }

    private PurchasePlanResponse() {}

    private PurchasePlanResponse(PurchasePlanResponse $) {
        this.name = $.name;
        this.product = $.product;
        this.promotionCode = $.promotionCode;
        this.publisher = $.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PurchasePlanResponse $;

        public Builder() {
            $ = new PurchasePlanResponse();
        }

        public Builder(PurchasePlanResponse defaults) {
            $ = new PurchasePlanResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder product(String product) {
            $.product = product;
            return this;
        }

        public Builder promotionCode(@Nullable String promotionCode) {
            $.promotionCode = promotionCode;
            return this;
        }

        public Builder publisher(String publisher) {
            $.publisher = publisher;
            return this;
        }

        public PurchasePlanResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.product = Objects.requireNonNull($.product, "expected parameter 'product' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            return $;
        }
    }

}
