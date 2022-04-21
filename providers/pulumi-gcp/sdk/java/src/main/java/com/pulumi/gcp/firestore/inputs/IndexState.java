// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.firestore.inputs.IndexFieldGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexState extends com.pulumi.resources.ResourceArgs {

    public static final IndexState Empty = new IndexState();

    /**
     * The collection being indexed.
     * 
     */
    @Import(name="collection")
    private @Nullable Output<String> collection;

    public Optional<Output<String>> collection() {
        return Optional.ofNullable(this.collection);
    }

    /**
     * The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
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
    @Import(name="fields")
    private @Nullable Output<List<IndexFieldGetArgs>> fields;

    public Optional<Output<List<IndexFieldGetArgs>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * A server defined name for this index. Format:
     * &#39;projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}&#39;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are `COLLECTION` and `COLLECTION_GROUP`.
     * 
     */
    @Import(name="queryScope")
    private @Nullable Output<String> queryScope;

    public Optional<Output<String>> queryScope() {
        return Optional.ofNullable(this.queryScope);
    }

    private IndexState() {}

    private IndexState(IndexState $) {
        this.collection = $.collection;
        this.database = $.database;
        this.fields = $.fields;
        this.name = $.name;
        this.project = $.project;
        this.queryScope = $.queryScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexState $;

        public Builder() {
            $ = new IndexState();
        }

        public Builder(IndexState defaults) {
            $ = new IndexState(Objects.requireNonNull(defaults));
        }

        public Builder collection(@Nullable Output<String> collection) {
            $.collection = collection;
            return this;
        }

        public Builder collection(String collection) {
            return collection(Output.of(collection));
        }

        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder fields(@Nullable Output<List<IndexFieldGetArgs>> fields) {
            $.fields = fields;
            return this;
        }

        public Builder fields(List<IndexFieldGetArgs> fields) {
            return fields(Output.of(fields));
        }

        public Builder fields(IndexFieldGetArgs... fields) {
            return fields(List.of(fields));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder queryScope(@Nullable Output<String> queryScope) {
            $.queryScope = queryScope;
            return this;
        }

        public Builder queryScope(String queryScope) {
            return queryScope(Output.of(queryScope));
        }

        public IndexState build() {
            return $;
        }
    }

}
