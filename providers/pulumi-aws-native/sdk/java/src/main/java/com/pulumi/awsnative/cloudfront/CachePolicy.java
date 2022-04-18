// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudfront.CachePolicyArgs;
import com.pulumi.awsnative.cloudfront.outputs.CachePolicyConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CloudFront::CachePolicy
 * 
 */
@ResourceType(type="aws-native:cloudfront:CachePolicy")
public class CachePolicy extends com.pulumi.resources.CustomResource {
    @Export(name="cachePolicyConfig", type=CachePolicyConfig.class, parameters={})
    private Output<CachePolicyConfig> cachePolicyConfig;

    public Output<CachePolicyConfig> cachePolicyConfig() {
        return this.cachePolicyConfig;
    }
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CachePolicy(String name) {
        this(name, CachePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CachePolicy(String name, CachePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CachePolicy(String name, CachePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:CachePolicy", name, args == null ? CachePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CachePolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:CachePolicy", name, null, makeResourceOptions(options, id));
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
    public static CachePolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CachePolicy(name, id, options);
    }
}
