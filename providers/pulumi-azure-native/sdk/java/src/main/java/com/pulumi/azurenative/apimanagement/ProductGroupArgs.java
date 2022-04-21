// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProductGroupArgs Empty = new ProductGroupArgs();

    /**
     * Group identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="productId", required=true)
    private Output<String> productId;

    public Output<String> productId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ProductGroupArgs() {}

    private ProductGroupArgs(ProductGroupArgs $) {
        this.groupId = $.groupId;
        this.productId = $.productId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductGroupArgs $;

        public Builder() {
            $ = new ProductGroupArgs();
        }

        public Builder(ProductGroupArgs defaults) {
            $ = new ProductGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder productId(Output<String> productId) {
            $.productId = productId;
            return this;
        }

        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ProductGroupArgs build() {
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
