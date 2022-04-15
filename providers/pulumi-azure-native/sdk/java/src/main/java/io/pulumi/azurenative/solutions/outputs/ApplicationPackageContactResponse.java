// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationPackageContactResponse {
    /**
     * The contact name.
     * 
     */
    private final @Nullable String contactName;
    /**
     * The contact email.
     * 
     */
    private final String email;
    /**
     * The contact phone number.
     * 
     */
    private final String phone;

    @CustomType.Constructor
    private ApplicationPackageContactResponse(
        @CustomType.Parameter("contactName") @Nullable String contactName,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("phone") String phone) {
        this.contactName = contactName;
        this.email = email;
        this.phone = phone;
    }

    /**
     * The contact name.
     * 
    */
    public Optional<String> contactName() {
        return Optional.ofNullable(this.contactName);
    }
    /**
     * The contact email.
     * 
    */
    public String email() {
        return this.email;
    }
    /**
     * The contact phone number.
     * 
    */
    public String phone() {
        return this.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPackageContactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contactName;
        private String email;
        private String phone;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPackageContactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.email = defaults.email;
    	      this.phone = defaults.phone;
        }

        public Builder contactName(@Nullable String contactName) {
            this.contactName = contactName;
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }        public ApplicationPackageContactResponse build() {
            return new ApplicationPackageContactResponse(contactName, email, phone);
        }
    }
}
