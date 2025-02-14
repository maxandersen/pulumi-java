// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListingArgs Empty = new GetListingArgs();

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

    private GetListingArgs() {}

    private GetListingArgs(GetListingArgs $) {
        this.compartmentId = $.compartmentId;
        this.listingId = $.listingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListingArgs $;

        public Builder() {
            $ = new GetListingArgs();
        }

        public Builder(GetListingArgs defaults) {
            $ = new GetListingArgs(Objects.requireNonNull(defaults));
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

        public GetListingArgs build() {
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            return $;
        }
    }

}
