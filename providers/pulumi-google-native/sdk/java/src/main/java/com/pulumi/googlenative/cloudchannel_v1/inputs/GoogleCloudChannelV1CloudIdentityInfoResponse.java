// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1EduDataResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Identity information for the Cloud Channel Customer.
 * 
 */
public final class GoogleCloudChannelV1CloudIdentityInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1CloudIdentityInfoResponse Empty = new GoogleCloudChannelV1CloudIdentityInfoResponse();

    /**
     * URI of Customer&#39;s Admin console dashboard.
     * 
     */
    @Import(name="adminConsoleUri", required=true)
    private String adminConsoleUri;

    public String adminConsoleUri() {
        return this.adminConsoleUri;
    }

    /**
     * The alternate email.
     * 
     */
    @Import(name="alternateEmail", required=true)
    private String alternateEmail;

    public String alternateEmail() {
        return this.alternateEmail;
    }

    /**
     * CustomerType indicates verification type needed for using services.
     * 
     */
    @Import(name="customerType", required=true)
    private String customerType;

    public String customerType() {
        return this.customerType;
    }

    /**
     * Edu information about the customer.
     * 
     */
    @Import(name="eduData", required=true)
    private GoogleCloudChannelV1EduDataResponse eduData;

    public GoogleCloudChannelV1EduDataResponse eduData() {
        return this.eduData;
    }

    /**
     * Whether the domain is verified. This field is not returned for a Customer&#39;s cloud_identity_info resource. Partners can use the domains.get() method of the Workspace SDK&#39;s Directory API, or listen to the PRIMARY_DOMAIN_VERIFIED Pub/Sub event in to track domain verification of their resolve Workspace customers.
     * 
     */
    @Import(name="isDomainVerified", required=true)
    private Boolean isDomainVerified;

    public Boolean isDomainVerified() {
        return this.isDomainVerified;
    }

    /**
     * Language code.
     * 
     */
    @Import(name="languageCode", required=true)
    private String languageCode;

    public String languageCode() {
        return this.languageCode;
    }

    /**
     * Phone number associated with the Cloud Identity.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private String phoneNumber;

    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * The primary domain name.
     * 
     */
    @Import(name="primaryDomain", required=true)
    private String primaryDomain;

    public String primaryDomain() {
        return this.primaryDomain;
    }

    private GoogleCloudChannelV1CloudIdentityInfoResponse() {}

    private GoogleCloudChannelV1CloudIdentityInfoResponse(GoogleCloudChannelV1CloudIdentityInfoResponse $) {
        this.adminConsoleUri = $.adminConsoleUri;
        this.alternateEmail = $.alternateEmail;
        this.customerType = $.customerType;
        this.eduData = $.eduData;
        this.isDomainVerified = $.isDomainVerified;
        this.languageCode = $.languageCode;
        this.phoneNumber = $.phoneNumber;
        this.primaryDomain = $.primaryDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudChannelV1CloudIdentityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudChannelV1CloudIdentityInfoResponse $;

        public Builder() {
            $ = new GoogleCloudChannelV1CloudIdentityInfoResponse();
        }

        public Builder(GoogleCloudChannelV1CloudIdentityInfoResponse defaults) {
            $ = new GoogleCloudChannelV1CloudIdentityInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder adminConsoleUri(String adminConsoleUri) {
            $.adminConsoleUri = adminConsoleUri;
            return this;
        }

        public Builder alternateEmail(String alternateEmail) {
            $.alternateEmail = alternateEmail;
            return this;
        }

        public Builder customerType(String customerType) {
            $.customerType = customerType;
            return this;
        }

        public Builder eduData(GoogleCloudChannelV1EduDataResponse eduData) {
            $.eduData = eduData;
            return this;
        }

        public Builder isDomainVerified(Boolean isDomainVerified) {
            $.isDomainVerified = isDomainVerified;
            return this;
        }

        public Builder languageCode(String languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        public Builder primaryDomain(String primaryDomain) {
            $.primaryDomain = primaryDomain;
            return this;
        }

        public GoogleCloudChannelV1CloudIdentityInfoResponse build() {
            $.adminConsoleUri = Objects.requireNonNull($.adminConsoleUri, "expected parameter 'adminConsoleUri' to be non-null");
            $.alternateEmail = Objects.requireNonNull($.alternateEmail, "expected parameter 'alternateEmail' to be non-null");
            $.customerType = Objects.requireNonNull($.customerType, "expected parameter 'customerType' to be non-null");
            $.eduData = Objects.requireNonNull($.eduData, "expected parameter 'eduData' to be non-null");
            $.isDomainVerified = Objects.requireNonNull($.isDomainVerified, "expected parameter 'isDomainVerified' to be non-null");
            $.languageCode = Objects.requireNonNull($.languageCode, "expected parameter 'languageCode' to be non-null");
            $.phoneNumber = Objects.requireNonNull($.phoneNumber, "expected parameter 'phoneNumber' to be non-null");
            $.primaryDomain = Objects.requireNonNull($.primaryDomain, "expected parameter 'primaryDomain' to be non-null");
            return $;
        }
    }

}
