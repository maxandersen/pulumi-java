// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb;

import com.pulumi.awsnative.memorydb.inputs.AuthenticationModePropertiesArgs;
import com.pulumi.awsnative.memorydb.inputs.UserTagArgs;
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
     * Access permissions string used for this user account.
     * 
     */
    @Import(name="accessString", required=true)
    private Output<String> accessString;

    /**
     * @return Access permissions string used for this user account.
     * 
     */
    public Output<String> accessString() {
        return this.accessString;
    }

    @Import(name="authenticationMode", required=true)
    private Output<AuthenticationModePropertiesArgs> authenticationMode;

    public Output<AuthenticationModePropertiesArgs> authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * An array of key-value pairs to apply to this user.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<UserTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this user.
     * 
     */
    public Optional<Output<List<UserTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The name of the user.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.accessString = $.accessString;
        this.authenticationMode = $.authenticationMode;
        this.tags = $.tags;
        this.userName = $.userName;
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
         * @param accessString Access permissions string used for this user account.
         * 
         * @return builder
         * 
         */
        public Builder accessString(Output<String> accessString) {
            $.accessString = accessString;
            return this;
        }

        /**
         * @param accessString Access permissions string used for this user account.
         * 
         * @return builder
         * 
         */
        public Builder accessString(String accessString) {
            return accessString(Output.of(accessString));
        }

        public Builder authenticationMode(Output<AuthenticationModePropertiesArgs> authenticationMode) {
            $.authenticationMode = authenticationMode;
            return this;
        }

        public Builder authenticationMode(AuthenticationModePropertiesArgs authenticationMode) {
            return authenticationMode(Output.of(authenticationMode));
        }

        /**
         * @param tags An array of key-value pairs to apply to this user.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<UserTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this user.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<UserTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this user.
         * 
         * @return builder
         * 
         */
        public Builder tags(UserTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param userName The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public UserArgs build() {
            $.accessString = Objects.requireNonNull($.accessString, "expected parameter 'accessString' to be non-null");
            $.authenticationMode = Objects.requireNonNull($.authenticationMode, "expected parameter 'authenticationMode' to be non-null");
            return $;
        }
    }

}
