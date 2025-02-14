// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Marketplace.inputs.GetListingTaxesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListingTaxesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListingTaxesArgs Empty = new GetListingTaxesArgs();

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    @Import(name="filters")
    private @Nullable List<GetListingTaxesFilter> filters;

    public Optional<List<GetListingTaxesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The unique identifier for the listing.
     * 
     */
    @Import(name="listingId", required=true)
    private String listingId;

    /**
     * @return The unique identifier for the listing.
     * 
     */
    public String listingId() {
        return this.listingId;
    }

    private GetListingTaxesArgs() {}

    private GetListingTaxesArgs(GetListingTaxesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.listingId = $.listingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListingTaxesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListingTaxesArgs $;

        public Builder() {
            $ = new GetListingTaxesArgs();
        }

        public Builder(GetListingTaxesArgs defaults) {
            $ = new GetListingTaxesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetListingTaxesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetListingTaxesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param listingId The unique identifier for the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(String listingId) {
            $.listingId = listingId;
            return this;
        }

        public GetListingTaxesArgs build() {
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            return $;
        }
    }

}
