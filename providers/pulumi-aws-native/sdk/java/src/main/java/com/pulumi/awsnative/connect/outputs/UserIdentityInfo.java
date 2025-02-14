// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserIdentityInfo {
    private final @Nullable String email;
    private final @Nullable String firstName;
    private final @Nullable String lastName;

    @CustomType.Constructor
    private UserIdentityInfo(
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("firstName") @Nullable String firstName,
        @CustomType.Parameter("lastName") @Nullable String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String firstName;
        private @Nullable String lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
        }

        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }        public UserIdentityInfo build() {
            return new UserIdentityInfo(email, firstName, lastName);
        }
    }
}
