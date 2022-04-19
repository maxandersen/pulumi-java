// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryRoleMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryRoleMemberArgs Empty = new DirectoryRoleMemberArgs();

    /**
     * The object ID of the principal you want to add as a member to the directory role. Supported object types are Users, Groups or Service Principals. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="memberObjectId")
      private final @Nullable Output<String> memberObjectId;

    public Output<String> memberObjectId() {
        return this.memberObjectId == null ? Codegen.empty() : this.memberObjectId;
    }

    /**
     * The object ID of the directory role you want to add the member to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="roleObjectId")
      private final @Nullable Output<String> roleObjectId;

    public Output<String> roleObjectId() {
        return this.roleObjectId == null ? Codegen.empty() : this.roleObjectId;
    }

    public DirectoryRoleMemberArgs(
        @Nullable Output<String> memberObjectId,
        @Nullable Output<String> roleObjectId) {
        this.memberObjectId = memberObjectId;
        this.roleObjectId = roleObjectId;
    }

    private DirectoryRoleMemberArgs() {
        this.memberObjectId = Codegen.empty();
        this.roleObjectId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryRoleMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> memberObjectId;
        private @Nullable Output<String> roleObjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryRoleMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberObjectId = defaults.memberObjectId;
    	      this.roleObjectId = defaults.roleObjectId;
        }

        public Builder memberObjectId(@Nullable Output<String> memberObjectId) {
            this.memberObjectId = memberObjectId;
            return this;
        }
        public Builder memberObjectId(@Nullable String memberObjectId) {
            this.memberObjectId = Codegen.ofNullable(memberObjectId);
            return this;
        }
        public Builder roleObjectId(@Nullable Output<String> roleObjectId) {
            this.roleObjectId = roleObjectId;
            return this;
        }
        public Builder roleObjectId(@Nullable String roleObjectId) {
            this.roleObjectId = Codegen.ofNullable(roleObjectId);
            return this;
        }        public DirectoryRoleMemberArgs build() {
            return new DirectoryRoleMemberArgs(memberObjectId, roleObjectId);
        }
    }
}
