// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a mapping from an AWS IAM role to a Kubernetes user and groups.
 * 
 */
public final class RoleMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleMappingArgs Empty = new RoleMappingArgs();

    /**
     * A list of groups within Kubernetes to which the role is mapped.
     * 
     */
    @Import(name="groups", required=true)
      private final Output<List<String>> groups;

    public Output<List<String>> getGroups() {
        return this.groups;
    }

    /**
     * The ARN of the IAM role to add.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The user name within Kubernetes to map to the IAM role. By default, the user name is the ARN of the IAM role.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> getUsername() {
        return this.username;
    }

    public RoleMappingArgs(
        Output<List<String>> groups,
        Output<String> roleArn,
        Output<String> username) {
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private RoleMappingArgs() {
        this.groups = Output.empty();
        this.roleArn = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> groups;
        private Output<String> roleArn;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.roleArn = defaults.roleArn;
    	      this.username = defaults.username;
        }

        public Builder groups(Output<List<String>> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder groups(List<String> groups) {
            this.groups = Output.of(Objects.requireNonNull(groups));
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }
        public RoleMappingArgs build() {
            return new RoleMappingArgs(groups, roleArn, username);
        }
    }
}
