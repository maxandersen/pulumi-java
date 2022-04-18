// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudfront.ResponseHeadersPolicyArgs;
import com.pulumi.awsnative.cloudfront.outputs.ResponseHeadersPolicyConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CloudFront::ResponseHeadersPolicy
 * 
 */
@ResourceType(type="aws-native:cloudfront:ResponseHeadersPolicy")
public class ResponseHeadersPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    @Export(name="responseHeadersPolicyConfig", type=ResponseHeadersPolicyConfig.class, parameters={})
    private Output<ResponseHeadersPolicyConfig> responseHeadersPolicyConfig;

    public Output<ResponseHeadersPolicyConfig> responseHeadersPolicyConfig() {
        return this.responseHeadersPolicyConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponseHeadersPolicy(String name) {
        this(name, ResponseHeadersPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponseHeadersPolicy(String name, ResponseHeadersPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponseHeadersPolicy(String name, ResponseHeadersPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:ResponseHeadersPolicy", name, args == null ? ResponseHeadersPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResponseHeadersPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:ResponseHeadersPolicy", name, null, makeResourceOptions(options, id));
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
    public static ResponseHeadersPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResponseHeadersPolicy(name, id, options);
    }
}
