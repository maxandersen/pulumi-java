// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.folder.inputs.IAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingState extends com.pulumi.resources.ResourceArgs {

    public static final IAMBindingState Empty = new IAMBindingState();

    @Import(name="condition")
      private final @Nullable Output<IAMBindingConditionGetArgs> condition;

    public Output<IAMBindingConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the folder&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<String> folder;

    public Output<String> folder() {
        return this.folder == null ? Codegen.empty() : this.folder;
    }

    /**
     * An array of identities that will be granted the privilege in the `role`.
     * Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that is associated with a specific Google account. For example, alice@gmail.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public IAMBindingState(
        @Nullable Output<IAMBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> folder,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.folder = folder;
        this.members = members;
        this.role = role;
    }

    private IAMBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.folder = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IAMBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> folder;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<IAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IAMBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
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
        public Builder folder(@Nullable Output<String> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable String folder) {
            this.folder = Codegen.ofNullable(folder);
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
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public IAMBindingState build() {
            return new IAMBindingState(condition, etag, folder, members, role);
        }
    }
}
