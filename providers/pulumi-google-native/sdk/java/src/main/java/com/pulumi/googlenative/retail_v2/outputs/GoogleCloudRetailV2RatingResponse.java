// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2RatingResponse {
    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final Double averageRating;
    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    private final Integer ratingCount;
    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
     */
    private final List<Integer> ratingHistogram;

    @CustomType.Constructor
    private GoogleCloudRetailV2RatingResponse(
        @CustomType.Parameter("averageRating") Double averageRating,
        @CustomType.Parameter("ratingCount") Integer ratingCount,
        @CustomType.Parameter("ratingHistogram") List<Integer> ratingHistogram) {
        this.averageRating = averageRating;
        this.ratingCount = ratingCount;
        this.ratingHistogram = ratingHistogram;
    }

    /**
     * The average rating of the Product. The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public Double averageRating() {
        return this.averageRating;
    }
    /**
     * The total number of ratings. This value is independent of the value of rating_histogram. This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
    */
    public Integer ratingCount() {
        return this.ratingCount;
    }
    /**
     * List of rating counts per rating value (index = rating - 1). The list is empty if there is no rating. If the list is non-empty, its size is always 5. Otherwise, an INVALID_ARGUMENT error is returned. For example, [41, 14, 13, 47, 303]. It means that the Product got 41 ratings with 1 star, 14 ratings with 2 star, and so on.
     * 
    */
    public List<Integer> ratingHistogram() {
        return this.ratingHistogram;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2RatingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double averageRating;
        private Integer ratingCount;
        private List<Integer> ratingHistogram;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2RatingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageRating = defaults.averageRating;
    	      this.ratingCount = defaults.ratingCount;
    	      this.ratingHistogram = defaults.ratingHistogram;
        }

        public Builder averageRating(Double averageRating) {
            this.averageRating = Objects.requireNonNull(averageRating);
            return this;
        }
        public Builder ratingCount(Integer ratingCount) {
            this.ratingCount = Objects.requireNonNull(ratingCount);
            return this;
        }
        public Builder ratingHistogram(List<Integer> ratingHistogram) {
            this.ratingHistogram = Objects.requireNonNull(ratingHistogram);
            return this;
        }
        public Builder ratingHistogram(Integer... ratingHistogram) {
            return ratingHistogram(List.of(ratingHistogram));
        }        public GoogleCloudRetailV2RatingResponse build() {
            return new GoogleCloudRetailV2RatingResponse(averageRating, ratingCount, ratingHistogram);
        }
    }
}
