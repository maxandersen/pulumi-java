// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache;

import com.pulumi.awsnative.elasticache.enums.UserEngine;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
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
    @Import(name="accessString")
    private @Nullable Output<String> accessString;

    /**
     * @return Access permissions string used for this user account.
     * 
     */
    public Optional<Output<String>> accessString() {
        return Optional.ofNullable(this.accessString);
    }

    /**
     * Must be redis.
     * 
     */
    @Import(name="engine", required=true)
    private Output<UserEngine> engine;

    /**
     * @return Must be redis.
     * 
     */
    public Output<UserEngine> engine() {
        return this.engine;
    }

    /**
     * Indicates a password is not required for this user account.
     * 
     */
    @Import(name="noPasswordRequired")
    private @Nullable Output<Boolean> noPasswordRequired;

    /**
     * @return Indicates a password is not required for this user account.
     * 
     */
    public Optional<Output<Boolean>> noPasswordRequired() {
        return Optional.ofNullable(this.noPasswordRequired);
    }

    /**
     * Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    @Import(name="passwords")
    private @Nullable Output<List<String>> passwords;

    /**
     * @return Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    public Optional<Output<List<String>>> passwords() {
        return Optional.ofNullable(this.passwords);
    }

    /**
     * The ID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     * The username of the user.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The username of the user.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.accessString = $.accessString;
        this.engine = $.engine;
        this.noPasswordRequired = $.noPasswordRequired;
        this.passwords = $.passwords;
        this.userId = $.userId;
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
        public Builder accessString(@Nullable Output<String> accessString) {
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

        /**
         * @param engine Must be redis.
         * 
         * @return builder
         * 
         */
        public Builder engine(Output<UserEngine> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine Must be redis.
         * 
         * @return builder
         * 
         */
        public Builder engine(UserEngine engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param noPasswordRequired Indicates a password is not required for this user account.
         * 
         * @return builder
         * 
         */
        public Builder noPasswordRequired(@Nullable Output<Boolean> noPasswordRequired) {
            $.noPasswordRequired = noPasswordRequired;
            return this;
        }

        /**
         * @param noPasswordRequired Indicates a password is not required for this user account.
         * 
         * @return builder
         * 
         */
        public Builder noPasswordRequired(Boolean noPasswordRequired) {
            return noPasswordRequired(Output.of(noPasswordRequired));
        }

        /**
         * @param passwords Passwords used for this user account. You can create up to two passwords for each user.
         * 
         * @return builder
         * 
         */
        public Builder passwords(@Nullable Output<List<String>> passwords) {
            $.passwords = passwords;
            return this;
        }

        /**
         * @param passwords Passwords used for this user account. You can create up to two passwords for each user.
         * 
         * @return builder
         * 
         */
        public Builder passwords(List<String> passwords) {
            return passwords(Output.of(passwords));
        }

        /**
         * @param passwords Passwords used for this user account. You can create up to two passwords for each user.
         * 
         * @return builder
         * 
         */
        public Builder passwords(String... passwords) {
            return passwords(List.of(passwords));
        }

        /**
         * @param userId The ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param userName The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public UserArgs build() {
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
