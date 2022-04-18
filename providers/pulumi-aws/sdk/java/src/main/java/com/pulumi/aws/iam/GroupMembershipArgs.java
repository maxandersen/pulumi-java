// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The IAM Group name to attach the list of `users` to
     * 
     */
    @Import(name="group", required=true)
      private final Output<String> group;

    public Output<String> group() {
        return this.group;
    }

    /**
     * The name to identify the Group Membership
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of IAM User names to associate with the Group
     * 
     */
    @Import(name="users", required=true)
      private final Output<List<String>> users;

    public Output<List<String>> users() {
        return this.users;
    }

    public GroupMembershipArgs(
        Output<String> group,
        @Nullable Output<String> name,
        Output<List<String>> users) {
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.name = name;
        this.users = Objects.requireNonNull(users, "expected parameter 'users' to be non-null");
    }

    private GroupMembershipArgs() {
        this.group = Codegen.empty();
        this.name = Codegen.empty();
        this.users = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> group;
        private @Nullable Output<String> name;
        private Output<List<String>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.users = defaults.users;
        }

        public Builder group(Output<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder group(String group) {
            this.group = Output.of(Objects.requireNonNull(group));
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
        public Builder users(Output<List<String>> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(List<String> users) {
            this.users = Output.of(Objects.requireNonNull(users));
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }        public GroupMembershipArgs build() {
            return new GroupMembershipArgs(group, name, users);
        }
    }
}
