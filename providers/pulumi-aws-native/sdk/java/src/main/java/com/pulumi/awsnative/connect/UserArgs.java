// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect;

import com.pulumi.awsnative.connect.inputs.UserIdentityInfoArgs;
import com.pulumi.awsnative.connect.inputs.UserPhoneConfigArgs;
import com.pulumi.awsnative.connect.inputs.UserTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The identifier of the user account in the directory used for identity management.
     * 
     */
    @Import(name="directoryUserId")
      private final @Nullable Output<String> directoryUserId;

    public Output<String> directoryUserId() {
        return this.directoryUserId == null ? Codegen.empty() : this.directoryUserId;
    }

    /**
     * The identifier of the hierarchy group for the user.
     * 
     */
    @Import(name="hierarchyGroupArn")
      private final @Nullable Output<String> hierarchyGroupArn;

    public Output<String> hierarchyGroupArn() {
        return this.hierarchyGroupArn == null ? Codegen.empty() : this.hierarchyGroupArn;
    }

    /**
     * The information about the identity of the user.
     * 
     */
    @Import(name="identityInfo")
      private final @Nullable Output<UserIdentityInfoArgs> identityInfo;

    public Output<UserIdentityInfoArgs> identityInfo() {
        return this.identityInfo == null ? Codegen.empty() : this.identityInfo;
    }

    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The phone settings for the user.
     * 
     */
    @Import(name="phoneConfig", required=true)
      private final Output<UserPhoneConfigArgs> phoneConfig;

    public Output<UserPhoneConfigArgs> phoneConfig() {
        return this.phoneConfig;
    }

    /**
     * The identifier of the routing profile for the user.
     * 
     */
    @Import(name="routingProfileArn", required=true)
      private final Output<String> routingProfileArn;

    public Output<String> routingProfileArn() {
        return this.routingProfileArn;
    }

    /**
     * One or more security profile arns for the user
     * 
     */
    @Import(name="securityProfileArns", required=true)
      private final Output<List<String>> securityProfileArns;

    public Output<List<String>> securityProfileArns() {
        return this.securityProfileArns;
    }

    /**
     * One or more tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<UserTagArgs>> tags;

    public Output<List<UserTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The user name for the account.
     * 
     */
    @Import(name="username", required=true)
      private final Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    public UserArgs(
        @Nullable Output<String> directoryUserId,
        @Nullable Output<String> hierarchyGroupArn,
        @Nullable Output<UserIdentityInfoArgs> identityInfo,
        Output<String> instanceArn,
        @Nullable Output<String> password,
        Output<UserPhoneConfigArgs> phoneConfig,
        Output<String> routingProfileArn,
        Output<List<String>> securityProfileArns,
        @Nullable Output<List<UserTagArgs>> tags,
        Output<String> username) {
        this.directoryUserId = directoryUserId;
        this.hierarchyGroupArn = hierarchyGroupArn;
        this.identityInfo = identityInfo;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.password = password;
        this.phoneConfig = Objects.requireNonNull(phoneConfig, "expected parameter 'phoneConfig' to be non-null");
        this.routingProfileArn = Objects.requireNonNull(routingProfileArn, "expected parameter 'routingProfileArn' to be non-null");
        this.securityProfileArns = Objects.requireNonNull(securityProfileArns, "expected parameter 'securityProfileArns' to be non-null");
        this.tags = tags;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private UserArgs() {
        this.directoryUserId = Codegen.empty();
        this.hierarchyGroupArn = Codegen.empty();
        this.identityInfo = Codegen.empty();
        this.instanceArn = Codegen.empty();
        this.password = Codegen.empty();
        this.phoneConfig = Codegen.empty();
        this.routingProfileArn = Codegen.empty();
        this.securityProfileArns = Codegen.empty();
        this.tags = Codegen.empty();
        this.username = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> directoryUserId;
        private @Nullable Output<String> hierarchyGroupArn;
        private @Nullable Output<UserIdentityInfoArgs> identityInfo;
        private Output<String> instanceArn;
        private @Nullable Output<String> password;
        private Output<UserPhoneConfigArgs> phoneConfig;
        private Output<String> routingProfileArn;
        private Output<List<String>> securityProfileArns;
        private @Nullable Output<List<UserTagArgs>> tags;
        private Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryUserId = defaults.directoryUserId;
    	      this.hierarchyGroupArn = defaults.hierarchyGroupArn;
    	      this.identityInfo = defaults.identityInfo;
    	      this.instanceArn = defaults.instanceArn;
    	      this.password = defaults.password;
    	      this.phoneConfig = defaults.phoneConfig;
    	      this.routingProfileArn = defaults.routingProfileArn;
    	      this.securityProfileArns = defaults.securityProfileArns;
    	      this.tags = defaults.tags;
    	      this.username = defaults.username;
        }

        public Builder directoryUserId(@Nullable Output<String> directoryUserId) {
            this.directoryUserId = directoryUserId;
            return this;
        }
        public Builder directoryUserId(@Nullable String directoryUserId) {
            this.directoryUserId = Codegen.ofNullable(directoryUserId);
            return this;
        }
        public Builder hierarchyGroupArn(@Nullable Output<String> hierarchyGroupArn) {
            this.hierarchyGroupArn = hierarchyGroupArn;
            return this;
        }
        public Builder hierarchyGroupArn(@Nullable String hierarchyGroupArn) {
            this.hierarchyGroupArn = Codegen.ofNullable(hierarchyGroupArn);
            return this;
        }
        public Builder identityInfo(@Nullable Output<UserIdentityInfoArgs> identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public Builder identityInfo(@Nullable UserIdentityInfoArgs identityInfo) {
            this.identityInfo = Codegen.ofNullable(identityInfo);
            return this;
        }
        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder phoneConfig(Output<UserPhoneConfigArgs> phoneConfig) {
            this.phoneConfig = Objects.requireNonNull(phoneConfig);
            return this;
        }
        public Builder phoneConfig(UserPhoneConfigArgs phoneConfig) {
            this.phoneConfig = Output.of(Objects.requireNonNull(phoneConfig));
            return this;
        }
        public Builder routingProfileArn(Output<String> routingProfileArn) {
            this.routingProfileArn = Objects.requireNonNull(routingProfileArn);
            return this;
        }
        public Builder routingProfileArn(String routingProfileArn) {
            this.routingProfileArn = Output.of(Objects.requireNonNull(routingProfileArn));
            return this;
        }
        public Builder securityProfileArns(Output<List<String>> securityProfileArns) {
            this.securityProfileArns = Objects.requireNonNull(securityProfileArns);
            return this;
        }
        public Builder securityProfileArns(List<String> securityProfileArns) {
            this.securityProfileArns = Output.of(Objects.requireNonNull(securityProfileArns));
            return this;
        }
        public Builder securityProfileArns(String... securityProfileArns) {
            return securityProfileArns(List.of(securityProfileArns));
        }
        public Builder tags(@Nullable Output<List<UserTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<UserTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(UserTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder username(Output<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public Builder username(String username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }        public UserArgs build() {
            return new UserArgs(directoryUserId, hierarchyGroupArn, identityInfo, instanceArn, password, phoneConfig, routingProfileArn, securityProfileArns, tags, username);
        }
    }
}
