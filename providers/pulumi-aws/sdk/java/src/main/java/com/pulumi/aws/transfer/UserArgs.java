// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs;
import com.pulumi.aws.transfer.inputs.UserPosixProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @Import(name="homeDirectory")
      private final @Nullable Output<String> homeDirectory;

    public Output<String> homeDirectory() {
        return this.homeDirectory == null ? Codegen.empty() : this.homeDirectory;
    }

    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @Import(name="homeDirectoryMappings")
      private final @Nullable Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings;

    public Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings() {
        return this.homeDirectoryMappings == null ? Codegen.empty() : this.homeDirectoryMappings;
    }

    /**
     * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @Import(name="homeDirectoryType")
      private final @Nullable Output<String> homeDirectoryType;

    public Output<String> homeDirectoryType() {
        return this.homeDirectoryType == null ? Codegen.empty() : this.homeDirectoryType;
    }

    /**
     * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @Import(name="posixProfile")
      private final @Nullable Output<UserPosixProfileArgs> posixProfile;

    public Output<UserPosixProfileArgs> posixProfile() {
        return this.posixProfile == null ? Codegen.empty() : this.posixProfile;
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @Import(name="serverId", required=true)
      private final Output<String> serverId;

    public Output<String> serverId() {
        return this.serverId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name used for log in to your SFTP server.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> userName() {
        return this.userName;
    }

    public UserArgs(
        @Nullable Output<String> homeDirectory,
        @Nullable Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings,
        @Nullable Output<String> homeDirectoryType,
        @Nullable Output<String> policy,
        @Nullable Output<UserPosixProfileArgs> posixProfile,
        Output<String> role,
        Output<String> serverId,
        @Nullable Output<Map<String,String>> tags,
        Output<String> userName) {
        this.homeDirectory = homeDirectory;
        this.homeDirectoryMappings = homeDirectoryMappings;
        this.homeDirectoryType = homeDirectoryType;
        this.policy = policy;
        this.posixProfile = posixProfile;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.serverId = Objects.requireNonNull(serverId, "expected parameter 'serverId' to be non-null");
        this.tags = tags;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private UserArgs() {
        this.homeDirectory = Codegen.empty();
        this.homeDirectoryMappings = Codegen.empty();
        this.homeDirectoryType = Codegen.empty();
        this.policy = Codegen.empty();
        this.posixProfile = Codegen.empty();
        this.role = Codegen.empty();
        this.serverId = Codegen.empty();
        this.tags = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> homeDirectory;
        private @Nullable Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings;
        private @Nullable Output<String> homeDirectoryType;
        private @Nullable Output<String> policy;
        private @Nullable Output<UserPosixProfileArgs> posixProfile;
        private Output<String> role;
        private Output<String> serverId;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.homeDirectory = defaults.homeDirectory;
    	      this.homeDirectoryMappings = defaults.homeDirectoryMappings;
    	      this.homeDirectoryType = defaults.homeDirectoryType;
    	      this.policy = defaults.policy;
    	      this.posixProfile = defaults.posixProfile;
    	      this.role = defaults.role;
    	      this.serverId = defaults.serverId;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder homeDirectory(@Nullable Output<String> homeDirectory) {
            this.homeDirectory = homeDirectory;
            return this;
        }
        public Builder homeDirectory(@Nullable String homeDirectory) {
            this.homeDirectory = Codegen.ofNullable(homeDirectory);
            return this;
        }
        public Builder homeDirectoryMappings(@Nullable Output<List<UserHomeDirectoryMappingArgs>> homeDirectoryMappings) {
            this.homeDirectoryMappings = homeDirectoryMappings;
            return this;
        }
        public Builder homeDirectoryMappings(@Nullable List<UserHomeDirectoryMappingArgs> homeDirectoryMappings) {
            this.homeDirectoryMappings = Codegen.ofNullable(homeDirectoryMappings);
            return this;
        }
        public Builder homeDirectoryMappings(UserHomeDirectoryMappingArgs... homeDirectoryMappings) {
            return homeDirectoryMappings(List.of(homeDirectoryMappings));
        }
        public Builder homeDirectoryType(@Nullable Output<String> homeDirectoryType) {
            this.homeDirectoryType = homeDirectoryType;
            return this;
        }
        public Builder homeDirectoryType(@Nullable String homeDirectoryType) {
            this.homeDirectoryType = Codegen.ofNullable(homeDirectoryType);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder posixProfile(@Nullable Output<UserPosixProfileArgs> posixProfile) {
            this.posixProfile = posixProfile;
            return this;
        }
        public Builder posixProfile(@Nullable UserPosixProfileArgs posixProfile) {
            this.posixProfile = Codegen.ofNullable(posixProfile);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder serverId(Output<String> serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        public Builder serverId(String serverId) {
            this.serverId = Output.of(Objects.requireNonNull(serverId));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public UserArgs build() {
            return new UserArgs(homeDirectory, homeDirectoryMappings, homeDirectoryType, policy, posixProfile, role, serverId, tags, userName);
        }
    }
}
