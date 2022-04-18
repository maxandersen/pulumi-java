// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * The group's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. Group names are not distinguished by case. For example, you cannot create groups named both "ADMINS" and "admins".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Path in which to create the group.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    public GroupArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> path) {
        this.name = name;
        this.path = path;
    }

    private GroupArgs() {
        this.name = Codegen.empty();
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }        public GroupArgs build() {
            return new GroupArgs(name, path);
        }
    }
}
