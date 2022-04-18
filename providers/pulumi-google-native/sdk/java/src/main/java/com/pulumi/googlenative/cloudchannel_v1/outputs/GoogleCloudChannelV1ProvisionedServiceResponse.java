// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1ProvisionedServiceResponse {
    /**
     * The product pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    private final String productId;
    /**
     * Provisioning ID of the entitlement. For Google Workspace, this would be the underlying Subscription ID. For Google Cloud Platform, this would be the Billing Account ID of the billing subaccount."
     * 
     */
    private final String provisioningId;
    /**
     * The SKU pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    private final String skuId;

    @CustomType.Constructor
    private GoogleCloudChannelV1ProvisionedServiceResponse(
        @CustomType.Parameter("productId") String productId,
        @CustomType.Parameter("provisioningId") String provisioningId,
        @CustomType.Parameter("skuId") String skuId) {
        this.productId = productId;
        this.provisioningId = provisioningId;
        this.skuId = skuId;
    }

    /**
     * The product pertaining to the provisioning resource as specified in the Offer.
     * 
    */
    public String productId() {
        return this.productId;
    }
    /**
     * Provisioning ID of the entitlement. For Google Workspace, this would be the underlying Subscription ID. For Google Cloud Platform, this would be the Billing Account ID of the billing subaccount."
     * 
    */
    public String provisioningId() {
        return this.provisioningId;
    }
    /**
     * The SKU pertaining to the provisioning resource as specified in the Offer.
     * 
    */
    public String skuId() {
        return this.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ProvisionedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String productId;
        private String provisioningId;
        private String skuId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ProvisionedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.productId = defaults.productId;
    	      this.provisioningId = defaults.provisioningId;
    	      this.skuId = defaults.skuId;
        }

        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        public Builder provisioningId(String provisioningId) {
            this.provisioningId = Objects.requireNonNull(provisioningId);
            return this;
        }
        public Builder skuId(String skuId) {
            this.skuId = Objects.requireNonNull(skuId);
            return this;
        }        public GoogleCloudChannelV1ProvisionedServiceResponse build() {
            return new GoogleCloudChannelV1ProvisionedServiceResponse(productId, provisioningId, skuId);
        }
    }
}
