// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebaserules_v1.ReleaseArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a `Release`. Release names should reflect the developer&#39;s deployment practices. For example, the release name may include the environment name, application name, application version, or any other name meaningful to the developer. Once a `Release` refers to a `Ruleset`, the rules can be enforced by Firebase Rules-enabled services. More than one `Release` may be &#39;live&#39; concurrently. Consider the following three `Release` names for `projects/foo` and the `Ruleset` to which they refer. Release Name -&gt; Ruleset Name * projects/foo/releases/prod -&gt; projects/foo/rulesets/uuid123 * projects/foo/releases/prod/beta -&gt; projects/foo/rulesets/uuid123 * projects/foo/releases/prod/v23 -&gt; projects/foo/rulesets/uuid456 The relationships reflect a `Ruleset` rollout in progress. The `prod` and `prod/beta` releases refer to the same `Ruleset`. However, `prod/v23` refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be updated using the UpdateRelease method.
 * 
 */
@ResourceType(type="google-native:firebaserules/v1:Release")
public class Release extends com.pulumi.resources.CustomResource {
    /**
     * Time the release was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the release was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    @Export(name="rulesetName", type=String.class, parameters={})
    private Output<String> rulesetName;

    /**
     * @return Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    public Output<String> rulesetName() {
        return this.rulesetName;
    }
    /**
     * Time the release was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time the release was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Release(String name) {
        this(name, ReleaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Release(String name, ReleaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Release(String name, ReleaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaserules/v1:Release", name, args == null ? ReleaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Release(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaserules/v1:Release", name, null, makeResourceOptions(options, id));
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
    public static Release get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Release(name, id, options);
    }
}
