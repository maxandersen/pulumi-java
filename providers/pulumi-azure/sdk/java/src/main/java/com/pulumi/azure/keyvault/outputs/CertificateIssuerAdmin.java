// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateIssuerAdmin {
    /**
     * @return E-mail address of the admin.
     * 
     */
    private final String emailAddress;
    /**
     * @return First name of the admin.
     * 
     */
    private final @Nullable String firstName;
    /**
     * @return Last name of the admin.
     * 
     */
    private final @Nullable String lastName;
    /**
     * @return Phone number of the admin.
     * 
     */
    private final @Nullable String phone;

    @CustomType.Constructor
    private CertificateIssuerAdmin(
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("firstName") @Nullable String firstName,
        @CustomType.Parameter("lastName") @Nullable String lastName,
        @CustomType.Parameter("phone") @Nullable String phone) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    /**
     * @return E-mail address of the admin.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return First name of the admin.
     * 
     */
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    /**
     * @return Last name of the admin.
     * 
     */
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }
    /**
     * @return Phone number of the admin.
     * 
     */
    public Optional<String> phone() {
        return Optional.ofNullable(this.phone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateIssuerAdmin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private @Nullable String firstName;
        private @Nullable String lastName;
        private @Nullable String phone;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateIssuerAdmin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
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
        public Builder phone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }        public CertificateIssuerAdmin build() {
            return new CertificateIssuerAdmin(emailAddress, firstName, lastName, phone);
        }
    }
}
