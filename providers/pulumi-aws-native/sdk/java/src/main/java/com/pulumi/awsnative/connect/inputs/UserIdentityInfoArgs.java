// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about the identity of a user.
 * 
 */
public final class UserIdentityInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserIdentityInfoArgs Empty = new UserIdentityInfoArgs();

    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    private UserIdentityInfoArgs() {}

    private UserIdentityInfoArgs(UserIdentityInfoArgs $) {
        this.email = $.email;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserIdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserIdentityInfoArgs $;

        public Builder() {
            $ = new UserIdentityInfoArgs();
        }

        public Builder(UserIdentityInfoArgs defaults) {
            $ = new UserIdentityInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        public UserIdentityInfoArgs build() {
            return $;
        }
    }

}
