// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.firestore.inputs.IndexFieldGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexState extends com.pulumi.resources.ResourceArgs {

    public static final IndexState Empty = new IndexState();

    /**
     * The collection being indexed.
     * 
     */
    @Import(name="collection")
      private final @Nullable Output<String> collection;

    public Output<String> collection() {
        return this.collection == null ? Codegen.empty() : this.collection;
    }

    /**
     * The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<String> database;

    public Output<String> database() {
        return this.database == null ? Codegen.empty() : this.database;
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
      private final @Nullable Output<List<IndexFieldGetArgs>> fields;

    public Output<List<IndexFieldGetArgs>> fields() {
        return this.fields == null ? Codegen.empty() : this.fields;
    }

    /**
     * A server defined name for this index. Format:
     * &#39;projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}&#39;
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are `COLLECTION` and `COLLECTION_GROUP`.
     * 
     */
    @Import(name="queryScope")
      private final @Nullable Output<String> queryScope;

    public Output<String> queryScope() {
        return this.queryScope == null ? Codegen.empty() : this.queryScope;
    }

    public IndexState(
        @Nullable Output<String> collection,
        @Nullable Output<String> database,
        @Nullable Output<List<IndexFieldGetArgs>> fields,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> queryScope) {
        this.collection = collection;
        this.database = database;
        this.fields = fields;
        this.name = name;
        this.project = project;
        this.queryScope = queryScope;
    }

    private IndexState() {
        this.collection = Codegen.empty();
        this.database = Codegen.empty();
        this.fields = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.queryScope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> collection;
        private @Nullable Output<String> database;
        private @Nullable Output<List<IndexFieldGetArgs>> fields;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> queryScope;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.database = defaults.database;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.queryScope = defaults.queryScope;
        }

        public Builder collection(@Nullable Output<String> collection) {
            this.collection = collection;
            return this;
        }
        public Builder collection(@Nullable String collection) {
            this.collection = Codegen.ofNullable(collection);
            return this;
        }
        public Builder database(@Nullable Output<String> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder fields(@Nullable Output<List<IndexFieldGetArgs>> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(@Nullable List<IndexFieldGetArgs> fields) {
            this.fields = Codegen.ofNullable(fields);
            return this;
        }
        public Builder fields(IndexFieldGetArgs... fields) {
            return fields(List.of(fields));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder queryScope(@Nullable Output<String> queryScope) {
            this.queryScope = queryScope;
            return this;
        }
        public Builder queryScope(@Nullable String queryScope) {
            this.queryScope = Codegen.ofNullable(queryScope);
            return this;
        }        public IndexState build() {
            return new IndexState(collection, database, fields, name, project, queryScope);
        }
    }
}
