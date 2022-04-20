// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.artifactregistry_v1beta2.TagArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a tag.
 * 
 */
@ResourceType(type="google-native:artifactregistry/v1beta2:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * The name of the tag, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1&#34;. If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the tag, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1&#34;. If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the version the tag refers to, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811&#34; If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The name of the version the tag refers to, for example: &#34;projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/sha256:5243811&#34; If the package or version ID parts contain slashes, the slashes are escaped.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta2:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta2:Tag", name, null, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, options);
    }
}
