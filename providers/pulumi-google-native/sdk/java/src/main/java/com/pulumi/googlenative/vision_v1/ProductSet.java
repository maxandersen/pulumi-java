// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vision_v1.ProductSetArgs;
import com.pulumi.googlenative.vision_v1.outputs.StatusResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and returns a new ProductSet resource. Possible errors: * Returns INVALID_ARGUMENT if display_name is missing, or is longer than 4096 characters.
 * 
 */
@ResourceType(type="google-native:vision/v1:ProductSet")
public class ProductSet extends com.pulumi.resources.CustomResource {
    /**
     * The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet.
     * 
     */
    @Export(name="indexError", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> indexError;

    /**
     * @return If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet.
     * 
     */
    public Output<StatusResponse> indexError() {
        return this.indexError;
    }
    /**
     * The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp is the default value &#34;1970-01-01T00:00:00Z&#34;. This field is ignored when creating a ProductSet.
     * 
     */
    @Export(name="indexTime", type=String.class, parameters={})
    private Output<String> indexTime;

    /**
     * @return The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp is the default value &#34;1970-01-01T00:00:00Z&#34;. This field is ignored when creating a ProductSet.
     * 
     */
    public Output<String> indexTime() {
        return this.indexTime;
    }
    /**
     * The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProductSet(String name) {
        this(name, ProductSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProductSet(String name, @Nullable ProductSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProductSet(String name, @Nullable ProductSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vision/v1:ProductSet", name, args == null ? ProductSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProductSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vision/v1:ProductSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProductSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProductSet(name, id, options);
    }
}
