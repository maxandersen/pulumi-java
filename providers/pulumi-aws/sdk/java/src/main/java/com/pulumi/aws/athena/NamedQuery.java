// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.athena.NamedQueryArgs;
import com.pulumi.aws.athena.inputs.NamedQueryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Athena Named Query resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Athena Named Query can be imported using the query ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:athena/namedQuery:NamedQuery example 0123456789
 * ```
 * 
 */
@ResourceType(type="aws:athena/namedQuery:NamedQuery")
public class NamedQuery extends com.pulumi.resources.CustomResource {
    /**
     * The database to which the query belongs.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database to which the query belongs.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * A brief explanation of the query. Maximum length of 1024.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief explanation of the query. Maximum length of 1024.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The plain language name for the query. Maximum length of 128.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The plain language name for the query. Maximum length of 128.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    @Export(name="query", type=String.class, parameters={})
    private Output<String> query;

    /**
     * @return The text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * The workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    @Export(name="workgroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> workgroup;

    /**
     * @return The workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    public Output</* @Nullable */ String> workgroup() {
        return this.workgroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamedQuery(String name) {
        this(name, NamedQueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamedQuery(String name, NamedQueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamedQuery(String name, NamedQueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/namedQuery:NamedQuery", name, args == null ? NamedQueryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamedQuery(String name, Output<String> id, @Nullable NamedQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/namedQuery:NamedQuery", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NamedQuery get(String name, Output<String> id, @Nullable NamedQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamedQuery(name, id, state, options);
    }
}
