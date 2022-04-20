// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firestore.IndexArgs;
import com.pulumi.gcp.firestore.inputs.IndexState;
import com.pulumi.gcp.firestore.outputs.IndexField;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Cloud Firestore indexes enable simple and complex queries against documents in a database.
 *  This resource manages composite indexes and not single
 * field indexes.
 * 
 * To get more information about Index, see:
 * 
 * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.indexes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
 * 
 * &gt; **Warning:** This resource creates a Firestore Index on a project that already has
 * Firestore enabled. If you haven&#39;t already enabled it, you can create a
 * `gcp.appengine.Application` resource with `database_type` set to
 * `&#34;CLOUD_FIRESTORE&#34;` to do so. Your Firestore location will be the same as
 * the App Engine location specified.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Index can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:firestore/index:Index default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:firestore/index:Index")
public class Index extends com.pulumi.resources.CustomResource {
    /**
     * The collection being indexed.
     * 
     */
    @Export(name="collection", type=String.class, parameters={})
    private Output<String> collection;

    /**
     * @return The collection being indexed.
     * 
     */
    public Output<String> collection() {
        return this.collection;
    }
    /**
     * The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output</* @Nullable */ String> database;

    /**
     * @return The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    public Output</* @Nullable */ String> database() {
        return this.database;
    }
    /**
     * The fields supported by this index. The last field entry is always for
     * the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the
     * same direction as that of the last field defined. If the final field
     * in a composite index is not directional, the `__name__` will be
     * ordered `&#34;ASCENDING&#34;` (unless explicitly specified otherwise).
     * Structure is documented below.
     * 
     */
    @Export(name="fields", type=List.class, parameters={IndexField.class})
    private Output<List<IndexField>> fields;

    /**
     * @return The fields supported by this index. The last field entry is always for
     * the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the
     * same direction as that of the last field defined. If the final field
     * in a composite index is not directional, the `__name__` will be
     * ordered `&#34;ASCENDING&#34;` (unless explicitly specified otherwise).
     * Structure is documented below.
     * 
     */
    public Output<List<IndexField>> fields() {
        return this.fields;
    }
    /**
     * A server defined name for this index. Format:
     * &#39;projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}&#39;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A server defined name for this index. Format:
     * &#39;projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}&#39;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are `COLLECTION` and `COLLECTION_GROUP`.
     * 
     */
    @Export(name="queryScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryScope;

    /**
     * @return The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are `COLLECTION` and `COLLECTION_GROUP`.
     * 
     */
    public Output</* @Nullable */ String> queryScope() {
        return this.queryScope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Index(String name) {
        this(name, IndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Index(String name, IndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Index(String name, IndexArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firestore/index:Index", name, args == null ? IndexArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Index(String name, Output<String> id, @Nullable IndexState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firestore/index:Index", name, state, makeResourceOptions(options, id));
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
    public static Index get(String name, Output<String> id, @Nullable IndexState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Index(name, id, state, options);
    }
}
