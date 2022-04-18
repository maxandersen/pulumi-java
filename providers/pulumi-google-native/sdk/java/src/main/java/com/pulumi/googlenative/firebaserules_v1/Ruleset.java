// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebaserules_v1.RulesetArgs;
import com.pulumi.googlenative.firebaserules_v1.outputs.MetadataResponse;
import com.pulumi.googlenative.firebaserules_v1.outputs.SourceResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create a `Ruleset` from `Source`. The `Ruleset` is given a unique generated name which is returned to the caller. `Source` containing syntactic or semantics errors will result in an error response indicating the first error encountered. For a detailed view of `Source` issues, use TestRuleset.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:firebaserules/v1:Ruleset")
public class Ruleset extends com.pulumi.resources.CustomResource {
    /**
     * Time the `Ruleset` was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the `Ruleset` was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The metadata for this ruleset.
     * 
     */
    @Export(name="metadata", type=MetadataResponse.class, parameters={})
    private Output<MetadataResponse> metadata;

    /**
     * @return The metadata for this ruleset.
     * 
     */
    public Output<MetadataResponse> metadata() {
        return this.metadata;
    }
    /**
     * Name of the `Ruleset`. The ruleset_id is auto generated by the service. Format: `projects/{project_id}/rulesets/{ruleset_id}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the `Ruleset`. The ruleset_id is auto generated by the service. Format: `projects/{project_id}/rulesets/{ruleset_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `Source` for the `Ruleset`.
     * 
     */
    @Export(name="source", type=SourceResponse.class, parameters={})
    private Output<SourceResponse> source;

    /**
     * @return `Source` for the `Ruleset`.
     * 
     */
    public Output<SourceResponse> source() {
        return this.source;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ruleset(String name) {
        this(name, RulesetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ruleset(String name, RulesetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ruleset(String name, RulesetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaserules/v1:Ruleset", name, args == null ? RulesetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ruleset(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaserules/v1:Ruleset", name, null, makeResourceOptions(options, id));
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
    public static Ruleset get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ruleset(name, id, options);
    }
}
