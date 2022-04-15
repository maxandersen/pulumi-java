// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserInfoResponse {
    /**
     * Email of the user used by Logz for contacting them if needed
     * 
     */
    private final @Nullable String emailAddress;
    /**
     * First Name of the user
     * 
     */
    private final @Nullable String firstName;
    /**
     * Last Name of the user
     * 
     */
    private final @Nullable String lastName;
    /**
     * Phone number of the user used by Logz for contacting them if needed
     * 
     */
    private final @Nullable String phoneNumber;

    @CustomType.Constructor
    private UserInfoResponse(
        @CustomType.Parameter("emailAddress") @Nullable String emailAddress,
        @CustomType.Parameter("firstName") @Nullable String firstName,
        @CustomType.Parameter("lastName") @Nullable String lastName,
        @CustomType.Parameter("phoneNumber") @Nullable String phoneNumber) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Email of the user used by Logz for contacting them if needed
     * 
    */
    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }
    /**
     * First Name of the user
     * 
    */
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    /**
     * Last Name of the user
     * 
    */
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }
    /**
     * Phone number of the user used by Logz for contacting them if needed
     * 
    */
    public Optional<String> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;
        private @Nullable String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder phoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }        public UserInfoResponse build() {
            return new UserInfoResponse(emailAddress, firstName, lastName, phoneNumber);
        }
    }
}
