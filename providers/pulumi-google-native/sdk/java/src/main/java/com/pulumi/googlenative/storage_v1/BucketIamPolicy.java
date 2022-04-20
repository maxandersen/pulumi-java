// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storage_v1.BucketIamPolicyArgs;
import com.pulumi.googlenative.storage_v1.outputs.BucketIamPolicyBindingsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Updates an IAM policy for the specified bucket.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:storage/v1:BucketIamPolicy")
public class BucketIamPolicy extends com.pulumi.resources.CustomResource {
    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    @Export(name="bindings", type=List.class, parameters={BucketIamPolicyBindingsItemResponse.class})
    private Output<List<BucketIamPolicyBindingsItemResponse>> bindings;

    /**
     * @return An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    public Output<List<BucketIamPolicyBindingsItemResponse>> bindings() {
        return this.bindings;
    }
    /**
     * HTTP 1.1  Entity tag for the policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1  Entity tag for the policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The IAM policy format version.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The IAM policy format version.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketIamPolicy(String name) {
        this(name, BucketIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketIamPolicy(String name, BucketIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketIamPolicy(String name, BucketIamPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketIamPolicy", name, args == null ? BucketIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketIamPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketIamPolicy", name, null, makeResourceOptions(options, id));
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
    public static BucketIamPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketIamPolicy(name, id, options);
    }
}
