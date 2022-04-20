// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Service provisioned for an entitlement.
 * 
 */
public final class GoogleCloudChannelV1ProvisionedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1ProvisionedServiceResponse Empty = new GoogleCloudChannelV1ProvisionedServiceResponse();

    /**
     * The product pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    @Import(name="productId", required=true)
      private final String productId;

    public String productId() {
        return this.productId;
    }

    /**
     * Provisioning ID of the entitlement. For Google Workspace, this would be the underlying Subscription ID. For Google Cloud Platform, this would be the Billing Account ID of the billing subaccount.&#34;
     * 
     */
    @Import(name="provisioningId", required=true)
      private final String provisioningId;

    public String provisioningId() {
        return this.provisioningId;
    }

    /**
     * The SKU pertaining to the provisioning resource as specified in the Offer.
     * 
     */
    @Import(name="skuId", required=true)
      private final String skuId;

    public String skuId() {
        return this.skuId;
    }

    public GoogleCloudChannelV1ProvisionedServiceResponse(
        String productId,
        String provisioningId,
        String skuId) {
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.provisioningId = Objects.requireNonNull(provisioningId, "expected parameter 'provisioningId' to be non-null");
        this.skuId = Objects.requireNonNull(skuId, "expected parameter 'skuId' to be non-null");
    }

    private GoogleCloudChannelV1ProvisionedServiceResponse() {
        this.productId = null;
        this.provisioningId = null;
        this.skuId = null;
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
