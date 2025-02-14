// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect;

import com.pulumi.awsnative.connect.inputs.UserIdentityInfoArgs;
import com.pulumi.awsnative.connect.inputs.UserPhoneConfigArgs;
import com.pulumi.awsnative.connect.inputs.UserTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The identifier of the user account in the directory used for identity management.
     * 
     */
    @Import(name="directoryUserId")
    private @Nullable Output<String> directoryUserId;

    /**
     * @return The identifier of the user account in the directory used for identity management.
     * 
     */
    public Optional<Output<String>> directoryUserId() {
        return Optional.ofNullable(this.directoryUserId);
    }

    /**
     * The identifier of the hierarchy group for the user.
     * 
     */
    @Import(name="hierarchyGroupArn")
    private @Nullable Output<String> hierarchyGroupArn;

    /**
     * @return The identifier of the hierarchy group for the user.
     * 
     */
    public Optional<Output<String>> hierarchyGroupArn() {
        return Optional.ofNullable(this.hierarchyGroupArn);
    }

    /**
     * The information about the identity of the user.
     * 
     */
    @Import(name="identityInfo")
    private @Nullable Output<UserIdentityInfoArgs> identityInfo;

    /**
     * @return The information about the identity of the user.
     * 
     */
    public Optional<Output<UserIdentityInfoArgs>> identityInfo() {
        return Optional.ofNullable(this.identityInfo);
    }

    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The identifier of the Amazon Connect instance.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The phone settings for the user.
     * 
     */
    @Import(name="phoneConfig", required=true)
    private Output<UserPhoneConfigArgs> phoneConfig;

    /**
     * @return The phone settings for the user.
     * 
     */
    public Output<UserPhoneConfigArgs> phoneConfig() {
        return this.phoneConfig;
    }

    /**
     * The identifier of the routing profile for the user.
     * 
     */
    @Import(name="routingProfileArn", required=true)
    private Output<String> routingProfileArn;

    /**
     * @return The identifier of the routing profile for the user.
     * 
     */
    public Output<String> routingProfileArn() {
        return this.routingProfileArn;
    }

    /**
     * One or more security profile arns for the user
     * 
     */
    @Import(name="securityProfileArns", required=true)
    private Output<List<String>> securityProfileArns;

    /**
     * @return One or more security profile arns for the user
     * 
     */
    public Output<List<String>> securityProfileArns() {
        return this.securityProfileArns;
    }

    /**
     * One or more tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<UserTagArgs>> tags;

    /**
     * @return One or more tags.
     * 
     */
    public Optional<Output<List<UserTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The user name for the account.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The user name for the account.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.directoryUserId = $.directoryUserId;
        this.hierarchyGroupArn = $.hierarchyGroupArn;
        this.identityInfo = $.identityInfo;
        this.instanceArn = $.instanceArn;
        this.password = $.password;
        this.phoneConfig = $.phoneConfig;
        this.routingProfileArn = $.routingProfileArn;
        this.securityProfileArns = $.securityProfileArns;
        this.tags = $.tags;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryUserId The identifier of the user account in the directory used for identity management.
         * 
         * @return builder
         * 
         */
        public Builder directoryUserId(@Nullable Output<String> directoryUserId) {
            $.directoryUserId = directoryUserId;
            return this;
        }

        /**
         * @param directoryUserId The identifier of the user account in the directory used for identity management.
         * 
         * @return builder
         * 
         */
        public Builder directoryUserId(String directoryUserId) {
            return directoryUserId(Output.of(directoryUserId));
        }

        /**
         * @param hierarchyGroupArn The identifier of the hierarchy group for the user.
         * 
         * @return builder
         * 
         */
        public Builder hierarchyGroupArn(@Nullable Output<String> hierarchyGroupArn) {
            $.hierarchyGroupArn = hierarchyGroupArn;
            return this;
        }

        /**
         * @param hierarchyGroupArn The identifier of the hierarchy group for the user.
         * 
         * @return builder
         * 
         */
        public Builder hierarchyGroupArn(String hierarchyGroupArn) {
            return hierarchyGroupArn(Output.of(hierarchyGroupArn));
        }

        /**
         * @param identityInfo The information about the identity of the user.
         * 
         * @return builder
         * 
         */
        public Builder identityInfo(@Nullable Output<UserIdentityInfoArgs> identityInfo) {
            $.identityInfo = identityInfo;
            return this;
        }

        /**
         * @param identityInfo The information about the identity of the user.
         * 
         * @return builder
         * 
         */
        public Builder identityInfo(UserIdentityInfoArgs identityInfo) {
            return identityInfo(Output.of(identityInfo));
        }

        /**
         * @param instanceArn The identifier of the Amazon Connect instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The identifier of the Amazon Connect instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param password The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param phoneConfig The phone settings for the user.
         * 
         * @return builder
         * 
         */
        public Builder phoneConfig(Output<UserPhoneConfigArgs> phoneConfig) {
            $.phoneConfig = phoneConfig;
            return this;
        }

        /**
         * @param phoneConfig The phone settings for the user.
         * 
         * @return builder
         * 
         */
        public Builder phoneConfig(UserPhoneConfigArgs phoneConfig) {
            return phoneConfig(Output.of(phoneConfig));
        }

        /**
         * @param routingProfileArn The identifier of the routing profile for the user.
         * 
         * @return builder
         * 
         */
        public Builder routingProfileArn(Output<String> routingProfileArn) {
            $.routingProfileArn = routingProfileArn;
            return this;
        }

        /**
         * @param routingProfileArn The identifier of the routing profile for the user.
         * 
         * @return builder
         * 
         */
        public Builder routingProfileArn(String routingProfileArn) {
            return routingProfileArn(Output.of(routingProfileArn));
        }

        /**
         * @param securityProfileArns One or more security profile arns for the user
         * 
         * @return builder
         * 
         */
        public Builder securityProfileArns(Output<List<String>> securityProfileArns) {
            $.securityProfileArns = securityProfileArns;
            return this;
        }

        /**
         * @param securityProfileArns One or more security profile arns for the user
         * 
         * @return builder
         * 
         */
        public Builder securityProfileArns(List<String> securityProfileArns) {
            return securityProfileArns(Output.of(securityProfileArns));
        }

        /**
         * @param securityProfileArns One or more security profile arns for the user
         * 
         * @return builder
         * 
         */
        public Builder securityProfileArns(String... securityProfileArns) {
            return securityProfileArns(List.of(securityProfileArns));
        }

        /**
         * @param tags One or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<UserTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags One or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<UserTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags One or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(UserTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param username The user name for the account.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name for the account.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public UserArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            $.phoneConfig = Objects.requireNonNull($.phoneConfig, "expected parameter 'phoneConfig' to be non-null");
            $.routingProfileArn = Objects.requireNonNull($.routingProfileArn, "expected parameter 'routingProfileArn' to be non-null");
            $.securityProfileArns = Objects.requireNonNull($.securityProfileArns, "expected parameter 'securityProfileArns' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
