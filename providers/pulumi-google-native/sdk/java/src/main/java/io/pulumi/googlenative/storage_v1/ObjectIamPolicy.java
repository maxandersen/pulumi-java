// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.ObjectIamPolicyArgs;
import io.pulumi.googlenative.storage_v1.outputs.ObjectIamPolicyBindingsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Updates an IAM policy for the specified object.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:storage/v1:ObjectIamPolicy")
public class ObjectIamPolicy extends io.pulumi.resources.CustomResource {
    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    @Export(name="bindings", type=List.class, parameters={ObjectIamPolicyBindingsItemResponse.class})
    private Output<List<ObjectIamPolicyBindingsItemResponse>> bindings;

    /**
     * @return An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    public Output<List<ObjectIamPolicyBindingsItemResponse>> bindings() {
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
    public ObjectIamPolicy(String name) {
        this(name, ObjectIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectIamPolicy(String name, ObjectIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectIamPolicy(String name, ObjectIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:ObjectIamPolicy", name, args == null ? ObjectIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObjectIamPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:ObjectIamPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ObjectIamPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectIamPolicy(name, id, options);
    }
}
