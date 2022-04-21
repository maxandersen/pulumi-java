// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * The rating of a Product.
 * 
 */
public final class GoogleCloudRetailV2alphaRatingResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRatingResponse Empty = new GoogleCloudRetailV2alphaRatingResponse();

    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="averageRating", required=true)
    private Double averageRating;

    public Double averageRating() {
        return this.averageRating;
    }

    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="ratingCount", required=true)
    private Integer ratingCount;

    public Integer ratingCount() {
        return this.ratingCount;
    }

    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    @Import(name="ratingHistogram", required=true)
    private List<Integer> ratingHistogram;

    public List<Integer> ratingHistogram() {
        return this.ratingHistogram;
    }

    private GoogleCloudRetailV2alphaRatingResponse() {}

    private GoogleCloudRetailV2alphaRatingResponse(GoogleCloudRetailV2alphaRatingResponse $) {
        this.averageRating = $.averageRating;
        this.ratingCount = $.ratingCount;
        this.ratingHistogram = $.ratingHistogram;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaRatingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaRatingResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaRatingResponse();
        }

        public Builder(GoogleCloudRetailV2alphaRatingResponse defaults) {
            $ = new GoogleCloudRetailV2alphaRatingResponse(Objects.requireNonNull(defaults));
        }

        public Builder averageRating(Double averageRating) {
            $.averageRating = averageRating;
            return this;
        }

        public Builder ratingCount(Integer ratingCount) {
            $.ratingCount = ratingCount;
            return this;
        }

        public Builder ratingHistogram(List<Integer> ratingHistogram) {
            $.ratingHistogram = ratingHistogram;
            return this;
        }

        public Builder ratingHistogram(Integer... ratingHistogram) {
            return ratingHistogram(List.of(ratingHistogram));
        }

        public GoogleCloudRetailV2alphaRatingResponse build() {
            $.averageRating = Objects.requireNonNull($.averageRating, "expected parameter 'averageRating' to be non-null");
            $.ratingCount = Objects.requireNonNull($.ratingCount, "expected parameter 'ratingCount' to be non-null");
            $.ratingHistogram = Objects.requireNonNull($.ratingHistogram, "expected parameter 'ratingHistogram' to be non-null");
            return $;
        }
    }

}
