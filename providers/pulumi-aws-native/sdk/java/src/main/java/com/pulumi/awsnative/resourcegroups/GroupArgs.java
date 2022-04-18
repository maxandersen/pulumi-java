// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resourcegroups;

import com.pulumi.awsnative.resourcegroups.inputs.GroupConfigurationItemArgs;
import com.pulumi.awsnative.resourcegroups.inputs.GroupResourceQueryArgs;
import com.pulumi.awsnative.resourcegroups.inputs.GroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    @Import(name="configuration")
      private final @Nullable Output<List<GroupConfigurationItemArgs>> configuration;

    public Output<List<GroupConfigurationItemArgs>> configuration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * The description of the resource group
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the resource group
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="resourceQuery")
      private final @Nullable Output<GroupResourceQueryArgs> resourceQuery;

    public Output<GroupResourceQueryArgs> resourceQuery() {
        return this.resourceQuery == null ? Codegen.empty() : this.resourceQuery;
    }

    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    @Import(name="tags")
      private final @Nullable Output<List<GroupTagArgs>> tags;

    public Output<List<GroupTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public GroupArgs(
        @Nullable Output<List<GroupConfigurationItemArgs>> configuration,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<GroupResourceQueryArgs> resourceQuery,
        @Nullable Output<List<String>> resources,
        @Nullable Output<List<GroupTagArgs>> tags) {
        this.configuration = configuration;
        this.description = description;
        this.name = name;
        this.resourceQuery = resourceQuery;
        this.resources = resources;
        this.tags = tags;
    }

    private GroupArgs() {
        this.configuration = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceQuery = Codegen.empty();
        this.resources = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GroupConfigurationItemArgs>> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<GroupResourceQueryArgs> resourceQuery;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<List<GroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resourceQuery = defaults.resourceQuery;
    	      this.resources = defaults.resources;
    	      this.tags = defaults.tags;
        }

        public Builder configuration(@Nullable Output<List<GroupConfigurationItemArgs>> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable List<GroupConfigurationItemArgs> configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder configuration(GroupConfigurationItemArgs... configuration) {
            return configuration(List.of(configuration));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resourceQuery(@Nullable Output<GroupResourceQueryArgs> resourceQuery) {
            this.resourceQuery = resourceQuery;
            return this;
        }
        public Builder resourceQuery(@Nullable GroupResourceQueryArgs resourceQuery) {
            this.resourceQuery = Codegen.ofNullable(resourceQuery);
            return this;
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder tags(@Nullable Output<List<GroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<GroupTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(GroupTagArgs... tags) {
            return tags(List.of(tags));
        }        public GroupArgs build() {
            return new GroupArgs(configuration, description, name, resourceQuery, resources, tags);
        }
    }
}
