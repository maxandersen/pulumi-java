// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.apimanagement.ProductArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Product details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Product testproduct /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/products/testproduct 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Product")
public class Product extends CustomResource {
    /**
     * whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    @Export(name="approvalRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> approvalRequired;

    /**
     * @return whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    public Output<Optional<Boolean>> approvalRequired() {
        return Codegen.optional(this.approvalRequired);
    }
    /**
     * Product description. May include HTML formatting tags.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Product description. May include HTML formatting tags.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Product name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Product name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished.
     * 
     */
    public Output<Optional<String>> state() {
        return Codegen.optional(this.state);
    }
    /**
     * Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as &#34;protected&#34; and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as &#34;open&#34; and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it&#39;s value is assumed to be true.
     * 
     */
    @Export(name="subscriptionRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subscriptionRequired;

    /**
     * @return Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as &#34;protected&#34; and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as &#34;open&#34; and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it&#39;s value is assumed to be true.
     * 
     */
    public Output<Optional<Boolean>> subscriptionRequired() {
        return Codegen.optional(this.subscriptionRequired);
    }
    /**
     * Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    @Export(name="subscriptionsLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> subscriptionsLimit;

    /**
     * @return Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    public Output<Optional<Integer>> subscriptionsLimit() {
        return Codegen.optional(this.subscriptionsLimit);
    }
    /**
     * Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process.
     * 
     */
    @Export(name="terms", type=String.class, parameters={})
    private Output</* @Nullable */ String> terms;

    /**
     * @return Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process.
     * 
     */
    public Output<Optional<String>> terms() {
        return Codegen.optional(this.terms);
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Product(String name) {
        this(name, ProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Product(String name, ProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Product(String name, ProductArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:apimanagement:Product", name, args == null ? ProductArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Product(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:apimanagement:Product", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20160707:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20161010:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:Product").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:Product").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Product get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Product(name, id, options);
    }
}
