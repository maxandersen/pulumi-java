// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datacatalog_v1.PolicyTagArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a policy tag in a taxonomy.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datacatalog/v1:PolicyTag")
public class PolicyTag extends com.pulumi.resources.CustomResource {
    /**
     * Resource names of child policy tags of this policy tag.
     * 
     */
    @Export(name="childPolicyTags", type=List.class, parameters={String.class})
    private Output<List<String>> childPolicyTags;

    /**
     * @return Resource names of child policy tags of this policy tag.
     * 
     */
    public Output<List<String>> childPolicyTags() {
        return this.childPolicyTags;
    }
    /**
     * Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * User-defined name of this policy tag. The name can't start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User-defined name of this policy tag. The name can't start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource name of this policy tag in the URL format. The policy tag manager generates unique taxonomy IDs and policy tag IDs.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of this policy tag in the URL format. The policy tag manager generates unique taxonomy IDs and policy tag IDs.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource name of this policy tag's parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag, and, for "Geolocation", this field is empty.
     * 
     */
    @Export(name="parentPolicyTag", type=String.class, parameters={})
    private Output<String> parentPolicyTag;

    /**
     * @return Resource name of this policy tag's parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag, and, for "Geolocation", this field is empty.
     * 
     */
    public Output<String> parentPolicyTag() {
        return this.parentPolicyTag;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyTag(String name) {
        this(name, PolicyTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyTag(String name, PolicyTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyTag(String name, PolicyTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1:PolicyTag", name, args == null ? PolicyTagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyTag(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1:PolicyTag", name, null, makeResourceOptions(options, id));
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
    public static PolicyTag get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyTag(name, id, options);
    }
}
