// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.marketplace.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateStoreOfferArgs extends InvokeArgs {

    public static final GetPrivateStoreOfferArgs Empty = new GetPrivateStoreOfferArgs();

    /**
     * The offer ID to update or delete
     * 
     */
    @Import(name="offerId", required=true)
    private String offerId;

    /**
     * @return The offer ID to update or delete
     * 
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @Import(name="privateStoreId", required=true)
    private String privateStoreId;

    /**
     * @return The store ID - must use the tenant ID
     * 
     */
    public String privateStoreId() {
        return this.privateStoreId;
    }

    private GetPrivateStoreOfferArgs() {}

    private GetPrivateStoreOfferArgs(GetPrivateStoreOfferArgs $) {
        this.offerId = $.offerId;
        this.privateStoreId = $.privateStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateStoreOfferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateStoreOfferArgs $;

        public Builder() {
            $ = new GetPrivateStoreOfferArgs();
        }

        public Builder(GetPrivateStoreOfferArgs defaults) {
            $ = new GetPrivateStoreOfferArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offerId The offer ID to update or delete
         * 
         * @return builder
         * 
         */
        public Builder offerId(String offerId) {
            $.offerId = offerId;
            return this;
        }

        /**
         * @param privateStoreId The store ID - must use the tenant ID
         * 
         * @return builder
         * 
         */
        public Builder privateStoreId(String privateStoreId) {
            $.privateStoreId = privateStoreId;
            return this;
        }

        public GetPrivateStoreOfferArgs build() {
            $.offerId = Objects.requireNonNull($.offerId, "expected parameter 'offerId' to be non-null");
            $.privateStoreId = Objects.requireNonNull($.privateStoreId, "expected parameter 'privateStoreId' to be non-null");
            return $;
        }
    }

}
