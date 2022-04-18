// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains all the contact details of the customer.
 * 
 */
public final class ContactDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContactDetailsResponse Empty = new ContactDetailsResponse();

    /**
     * The name of the company.
     * 
     */
    @Import(name="companyName", required=true)
      private final String companyName;

    public String companyName() {
        return this.companyName;
    }

    /**
     * The contact person name.
     * 
     */
    @Import(name="contactPerson", required=true)
      private final String contactPerson;

    public String contactPerson() {
        return this.contactPerson;
    }

    /**
     * The email list.
     * 
     */
    @Import(name="emailList", required=true)
      private final List<String> emailList;

    public List<String> emailList() {
        return this.emailList;
    }

    /**
     * The phone number.
     * 
     */
    @Import(name="phone", required=true)
      private final String phone;

    public String phone() {
        return this.phone;
    }

    public ContactDetailsResponse(
        String companyName,
        String contactPerson,
        List<String> emailList,
        String phone) {
        this.companyName = Objects.requireNonNull(companyName, "expected parameter 'companyName' to be non-null");
        this.contactPerson = Objects.requireNonNull(contactPerson, "expected parameter 'contactPerson' to be non-null");
        this.emailList = Objects.requireNonNull(emailList, "expected parameter 'emailList' to be non-null");
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
    }

    private ContactDetailsResponse() {
        this.companyName = null;
        this.contactPerson = null;
        this.emailList = List.of();
        this.phone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String companyName;
        private String contactPerson;
        private List<String> emailList;
        private String phone;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyName = defaults.companyName;
    	      this.contactPerson = defaults.contactPerson;
    	      this.emailList = defaults.emailList;
    	      this.phone = defaults.phone;
        }

        public Builder companyName(String companyName) {
            this.companyName = Objects.requireNonNull(companyName);
            return this;
        }
        public Builder contactPerson(String contactPerson) {
            this.contactPerson = Objects.requireNonNull(contactPerson);
            return this;
        }
        public Builder emailList(List<String> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }
        public Builder emailList(String... emailList) {
            return emailList(List.of(emailList));
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }        public ContactDetailsResponse build() {
            return new ContactDetailsResponse(companyName, contactPerson, emailList, phone);
        }
    }
}
