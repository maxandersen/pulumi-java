// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subscriber detail
 * 
 */
public final class OrganizationResourcePropertiesResponseUserDetail extends io.pulumi.resources.InvokeArgs {

    public static final OrganizationResourcePropertiesResponseUserDetail Empty = new OrganizationResourcePropertiesResponseUserDetail();

    /**
     * Email address
     * 
     */
    @Import(name="emailAddress")
      private final @Nullable String emailAddress;

    public Optional<String> emailAddress() {
        return this.emailAddress == null ? Optional.empty() : Optional.ofNullable(this.emailAddress);
    }

    /**
     * First name
     * 
     */
    @Import(name="firstName")
      private final @Nullable String firstName;

    public Optional<String> firstName() {
        return this.firstName == null ? Optional.empty() : Optional.ofNullable(this.firstName);
    }

    /**
     * Last name
     * 
     */
    @Import(name="lastName")
      private final @Nullable String lastName;

    public Optional<String> lastName() {
        return this.lastName == null ? Optional.empty() : Optional.ofNullable(this.lastName);
    }

    public OrganizationResourcePropertiesResponseUserDetail(
        @Nullable String emailAddress,
        @Nullable String firstName,
        @Nullable String lastName) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private OrganizationResourcePropertiesResponseUserDetail() {
        this.emailAddress = null;
        this.firstName = null;
        this.lastName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationResourcePropertiesResponseUserDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationResourcePropertiesResponseUserDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
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
        }        public OrganizationResourcePropertiesResponseUserDetail build() {
            return new OrganizationResourcePropertiesResponseUserDetail(emailAddress, firstName, lastName);
        }
    }
}
