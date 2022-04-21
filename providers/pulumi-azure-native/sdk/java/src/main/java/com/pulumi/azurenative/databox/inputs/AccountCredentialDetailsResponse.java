// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.ShareCredentialDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Credential details of the account.
 * 
 */
public final class AccountCredentialDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AccountCredentialDetailsResponse Empty = new AccountCredentialDetailsResponse();

    /**
     * Connection string of the account endpoint to use the account as a storage endpoint on the device.
     * 
     */
    @Import(name="accountConnectionString", required=true)
    private String accountConnectionString;

    public String accountConnectionString() {
        return this.accountConnectionString;
    }

    /**
     * Name of the account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Type of the account.
     * 
     */
    @Import(name="dataAccountType", required=true)
    private String dataAccountType;

    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Per share level unencrypted access credentials.
     * 
     */
    @Import(name="shareCredentialDetails", required=true)
    private List<ShareCredentialDetailsResponse> shareCredentialDetails;

    public List<ShareCredentialDetailsResponse> shareCredentialDetails() {
        return this.shareCredentialDetails;
    }

    private AccountCredentialDetailsResponse() {}

    private AccountCredentialDetailsResponse(AccountCredentialDetailsResponse $) {
        this.accountConnectionString = $.accountConnectionString;
        this.accountName = $.accountName;
        this.dataAccountType = $.dataAccountType;
        this.shareCredentialDetails = $.shareCredentialDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountCredentialDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountCredentialDetailsResponse $;

        public Builder() {
            $ = new AccountCredentialDetailsResponse();
        }

        public Builder(AccountCredentialDetailsResponse defaults) {
            $ = new AccountCredentialDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder accountConnectionString(String accountConnectionString) {
            $.accountConnectionString = accountConnectionString;
            return this;
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder dataAccountType(String dataAccountType) {
            $.dataAccountType = dataAccountType;
            return this;
        }

        public Builder shareCredentialDetails(List<ShareCredentialDetailsResponse> shareCredentialDetails) {
            $.shareCredentialDetails = shareCredentialDetails;
            return this;
        }

        public Builder shareCredentialDetails(ShareCredentialDetailsResponse... shareCredentialDetails) {
            return shareCredentialDetails(List.of(shareCredentialDetails));
        }

        public AccountCredentialDetailsResponse build() {
            $.accountConnectionString = Objects.requireNonNull($.accountConnectionString, "expected parameter 'accountConnectionString' to be non-null");
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.dataAccountType = Objects.requireNonNull($.dataAccountType, "expected parameter 'dataAccountType' to be non-null");
            $.shareCredentialDetails = Objects.requireNonNull($.shareCredentialDetails, "expected parameter 'shareCredentialDetails' to be non-null");
            return $;
        }
    }

}
