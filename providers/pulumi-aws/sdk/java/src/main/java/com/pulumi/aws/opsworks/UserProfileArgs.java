// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileArgs Empty = new UserProfileArgs();

    /**
     * Whether users can specify their own SSH public key through the My Settings page
     * 
     */
    @Import(name="allowSelfManagement")
      private final @Nullable Output<Boolean> allowSelfManagement;

    public Output<Boolean> allowSelfManagement() {
        return this.allowSelfManagement == null ? Codegen.empty() : this.allowSelfManagement;
    }

    /**
     * The users public key
     * 
     */
    @Import(name="sshPublicKey")
      private final @Nullable Output<String> sshPublicKey;

    public Output<String> sshPublicKey() {
        return this.sshPublicKey == null ? Codegen.empty() : this.sshPublicKey;
    }

    /**
     * The ssh username, with witch this user wants to log in
     * 
     */
    @Import(name="sshUsername", required=true)
      private final Output<String> sshUsername;

    public Output<String> sshUsername() {
        return this.sshUsername;
    }

    /**
     * The user&#39;s IAM ARN
     * 
     */
    @Import(name="userArn", required=true)
      private final Output<String> userArn;

    public Output<String> userArn() {
        return this.userArn;
    }

    public UserProfileArgs(
        @Nullable Output<Boolean> allowSelfManagement,
        @Nullable Output<String> sshPublicKey,
        Output<String> sshUsername,
        Output<String> userArn) {
        this.allowSelfManagement = allowSelfManagement;
        this.sshPublicKey = sshPublicKey;
        this.sshUsername = Objects.requireNonNull(sshUsername, "expected parameter 'sshUsername' to be non-null");
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
    }

    private UserProfileArgs() {
        this.allowSelfManagement = Codegen.empty();
        this.sshPublicKey = Codegen.empty();
        this.sshUsername = Codegen.empty();
        this.userArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowSelfManagement;
        private @Nullable Output<String> sshPublicKey;
        private Output<String> sshUsername;
        private Output<String> userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSelfManagement = defaults.allowSelfManagement;
    	      this.sshPublicKey = defaults.sshPublicKey;
    	      this.sshUsername = defaults.sshUsername;
    	      this.userArn = defaults.userArn;
        }

        public Builder allowSelfManagement(@Nullable Output<Boolean> allowSelfManagement) {
            this.allowSelfManagement = allowSelfManagement;
            return this;
        }
        public Builder allowSelfManagement(@Nullable Boolean allowSelfManagement) {
            this.allowSelfManagement = Codegen.ofNullable(allowSelfManagement);
            return this;
        }
        public Builder sshPublicKey(@Nullable Output<String> sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            return this;
        }
        public Builder sshPublicKey(@Nullable String sshPublicKey) {
            this.sshPublicKey = Codegen.ofNullable(sshPublicKey);
            return this;
        }
        public Builder sshUsername(Output<String> sshUsername) {
            this.sshUsername = Objects.requireNonNull(sshUsername);
            return this;
        }
        public Builder sshUsername(String sshUsername) {
            this.sshUsername = Output.of(Objects.requireNonNull(sshUsername));
            return this;
        }
        public Builder userArn(Output<String> userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }
        public Builder userArn(String userArn) {
            this.userArn = Output.of(Objects.requireNonNull(userArn));
            return this;
        }        public UserProfileArgs build() {
            return new UserProfileArgs(allowSelfManagement, sshPublicKey, sshUsername, userArn);
        }
    }
}
