// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingGetArgs;
import com.pulumi.aws.transfer.inputs.UserPosixProfileGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * Amazon Resource Name (ARN) of Transfer User
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

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
      private final @Nullable Output<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings;

    public Output<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings() {
        return this.homeDirectoryMappings == null ? Codegen.empty() : this.homeDirectoryMappings;
    }

    /**
     * The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
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
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @Import(name="posixProfile")
      private final @Nullable Output<UserPosixProfileGetArgs> posixProfile;

    public Output<UserPosixProfileGetArgs> posixProfile() {
        return this.posixProfile == null ? Codegen.empty() : this.posixProfile;
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @Import(name="serverId")
      private final @Nullable Output<String> serverId;

    public Output<String> serverId() {
        return this.serverId == null ? Codegen.empty() : this.serverId;
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
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The name used for log in to your SFTP server.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public UserState(
        @Nullable Output<String> arn,
        @Nullable Output<String> homeDirectory,
        @Nullable Output<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings,
        @Nullable Output<String> homeDirectoryType,
        @Nullable Output<String> policy,
        @Nullable Output<UserPosixProfileGetArgs> posixProfile,
        @Nullable Output<String> role,
        @Nullable Output<String> serverId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> userName) {
        this.arn = arn;
        this.homeDirectory = homeDirectory;
        this.homeDirectoryMappings = homeDirectoryMappings;
        this.homeDirectoryType = homeDirectoryType;
        this.policy = policy;
        this.posixProfile = posixProfile;
        this.role = role;
        this.serverId = serverId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userName = userName;
    }

    private UserState() {
        this.arn = Codegen.empty();
        this.homeDirectory = Codegen.empty();
        this.homeDirectoryMappings = Codegen.empty();
        this.homeDirectoryType = Codegen.empty();
        this.policy = Codegen.empty();
        this.posixProfile = Codegen.empty();
        this.role = Codegen.empty();
        this.serverId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> homeDirectory;
        private @Nullable Output<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings;
        private @Nullable Output<String> homeDirectoryType;
        private @Nullable Output<String> policy;
        private @Nullable Output<UserPosixProfileGetArgs> posixProfile;
        private @Nullable Output<String> role;
        private @Nullable Output<String> serverId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.homeDirectory = defaults.homeDirectory;
    	      this.homeDirectoryMappings = defaults.homeDirectoryMappings;
    	      this.homeDirectoryType = defaults.homeDirectoryType;
    	      this.policy = defaults.policy;
    	      this.posixProfile = defaults.posixProfile;
    	      this.role = defaults.role;
    	      this.serverId = defaults.serverId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userName = defaults.userName;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder homeDirectory(@Nullable Output<String> homeDirectory) {
            this.homeDirectory = homeDirectory;
            return this;
        }
        public Builder homeDirectory(@Nullable String homeDirectory) {
            this.homeDirectory = Codegen.ofNullable(homeDirectory);
            return this;
        }
        public Builder homeDirectoryMappings(@Nullable Output<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings) {
            this.homeDirectoryMappings = homeDirectoryMappings;
            return this;
        }
        public Builder homeDirectoryMappings(@Nullable List<UserHomeDirectoryMappingGetArgs> homeDirectoryMappings) {
            this.homeDirectoryMappings = Codegen.ofNullable(homeDirectoryMappings);
            return this;
        }
        public Builder homeDirectoryMappings(UserHomeDirectoryMappingGetArgs... homeDirectoryMappings) {
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
        public Builder posixProfile(@Nullable Output<UserPosixProfileGetArgs> posixProfile) {
            this.posixProfile = posixProfile;
            return this;
        }
        public Builder posixProfile(@Nullable UserPosixProfileGetArgs posixProfile) {
            this.posixProfile = Codegen.ofNullable(posixProfile);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder serverId(@Nullable Output<String> serverId) {
            this.serverId = serverId;
            return this;
        }
        public Builder serverId(@Nullable String serverId) {
            this.serverId = Codegen.ofNullable(serverId);
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
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public UserState build() {
            return new UserState(arn, homeDirectory, homeDirectoryMappings, homeDirectoryType, policy, posixProfile, role, serverId, tags, tagsAll, userName);
        }
    }
}
