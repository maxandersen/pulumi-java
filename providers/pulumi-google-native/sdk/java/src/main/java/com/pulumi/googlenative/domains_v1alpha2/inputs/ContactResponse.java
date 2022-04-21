// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1alpha2.inputs.PostalAddressResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Details required for a contact associated with a `Registration`.
 * 
 */
public final class ContactResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContactResponse Empty = new ContactResponse();

    /**
     * Email address of the contact.
     * 
     */
    @Import(name="email", required=true)
    private String email;

    public String email() {
        return this.email;
    }

    /**
     * Fax number of the contact in international format. For example, `&#34;+1-800-555-0123&#34;`.
     * 
     */
    @Import(name="faxNumber", required=true)
    private String faxNumber;

    public String faxNumber() {
        return this.faxNumber;
    }

    /**
     * Phone number of the contact in international format. For example, `&#34;+1-800-555-0123&#34;`.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private String phoneNumber;

    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Postal address of the contact.
     * 
     */
    @Import(name="postalAddress", required=true)
    private PostalAddressResponse postalAddress;

    public PostalAddressResponse postalAddress() {
        return this.postalAddress;
    }

    private ContactResponse() {}

    private ContactResponse(ContactResponse $) {
        this.email = $.email;
        this.faxNumber = $.faxNumber;
        this.phoneNumber = $.phoneNumber;
        this.postalAddress = $.postalAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactResponse $;

        public Builder() {
            $ = new ContactResponse();
        }

        public Builder(ContactResponse defaults) {
            $ = new ContactResponse(Objects.requireNonNull(defaults));
        }

        public Builder email(String email) {
            $.email = email;
            return this;
        }

        public Builder faxNumber(String faxNumber) {
            $.faxNumber = faxNumber;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        public Builder postalAddress(PostalAddressResponse postalAddress) {
            $.postalAddress = postalAddress;
            return this;
        }

        public ContactResponse build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.faxNumber = Objects.requireNonNull($.faxNumber, "expected parameter 'faxNumber' to be non-null");
            $.phoneNumber = Objects.requireNonNull($.phoneNumber, "expected parameter 'phoneNumber' to be non-null");
            $.postalAddress = Objects.requireNonNull($.postalAddress, "expected parameter 'postalAddress' to be non-null");
            return $;
        }
    }

}
