// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductApiArgs extends ResourceArgs {

    public static final ProductApiArgs Empty = new ProductApiArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId")
    private @Nullable Output<String> apiId;

    /**
     * @return API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    public Optional<Output<String>> apiId() {
        return Optional.ofNullable(this.apiId);
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="productId", required=true)
    private Output<String> productId;

    /**
     * @return Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ProductApiArgs() {}

    private ProductApiArgs(ProductApiArgs $) {
        this.apiId = $.apiId;
        this.productId = $.productId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductApiArgs $;

        public Builder() {
            $ = new ProductApiArgs();
        }

        public Builder(ProductApiArgs defaults) {
            $ = new ProductApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(@Nullable Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param productId Product identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId Product identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ProductApiArgs build() {
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
