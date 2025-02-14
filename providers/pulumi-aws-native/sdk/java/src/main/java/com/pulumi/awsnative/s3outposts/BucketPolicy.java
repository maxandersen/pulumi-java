// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.s3outposts.BucketPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type Definition for AWS::S3Outposts::BucketPolicy
 * 
 */
@ResourceType(type="aws-native:s3outposts:BucketPolicy")
public class BucketPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * A policy document containing permissions to add to the specified bucket.
     * 
     */
    @Export(name="policyDocument", type=Object.class, parameters={})
    private Output<Object> policyDocument;

    /**
     * @return A policy document containing permissions to add to the specified bucket.
     * 
     */
    public Output<Object> policyDocument() {
        return this.policyDocument;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketPolicy(String name) {
        this(name, BucketPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketPolicy(String name, BucketPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketPolicy(String name, BucketPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3outposts:BucketPolicy", name, args == null ? BucketPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3outposts:BucketPolicy", name, null, makeResourceOptions(options, id));
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
    public static BucketPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketPolicy(name, id, options);
    }
}
