// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseIAMBindingState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseIAMBindingState Empty = new DatabaseIAMBindingState();

    @Import(name="condition")
      private final @Nullable Output<DatabaseIAMBindingConditionGetArgs> condition;

    public Output<DatabaseIAMBindingConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * The name of the Spanner database.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<String> database;

    public Output<String> database() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    /**
     * (Computed) The etag of the database&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The name of the Spanner instance the database belongs to.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> instance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.spanner.DatabaseIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public DatabaseIAMBindingState(
        @Nullable Output<DatabaseIAMBindingConditionGetArgs> condition,
        @Nullable Output<String> database,
        @Nullable Output<String> etag,
        @Nullable Output<String> instance,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.database = database;
        this.etag = etag;
        this.instance = instance;
        this.members = members;
        this.project = project;
        this.role = role;
    }

    private DatabaseIAMBindingState() {
        this.condition = Codegen.empty();
        this.database = Codegen.empty();
        this.etag = Codegen.empty();
        this.instance = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseIAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatabaseIAMBindingConditionGetArgs> condition;
        private @Nullable Output<String> database;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> instance;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseIAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.database = defaults.database;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<DatabaseIAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable DatabaseIAMBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
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
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public DatabaseIAMBindingState build() {
            return new DatabaseIAMBindingState(condition, database, etag, instance, members, project, role);
        }
    }
}
