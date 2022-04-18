// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.ShareCredentialDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AccountCredentialDetailsResponse {
    /**
     * Connection string of the account endpoint to use the account as a storage endpoint on the device.
     * 
     */
    private final String accountConnectionString;
    /**
     * Name of the account.
     * 
     */
    private final String accountName;
    /**
     * Type of the account.
     * 
     */
    private final String dataAccountType;
    /**
     * Per share level unencrypted access credentials.
     * 
     */
    private final List<ShareCredentialDetailsResponse> shareCredentialDetails;

    @CustomType.Constructor
    private AccountCredentialDetailsResponse(
        @CustomType.Parameter("accountConnectionString") String accountConnectionString,
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("dataAccountType") String dataAccountType,
        @CustomType.Parameter("shareCredentialDetails") List<ShareCredentialDetailsResponse> shareCredentialDetails) {
        this.accountConnectionString = accountConnectionString;
        this.accountName = accountName;
        this.dataAccountType = dataAccountType;
        this.shareCredentialDetails = shareCredentialDetails;
    }

    /**
     * Connection string of the account endpoint to use the account as a storage endpoint on the device.
     * 
    */
    public String accountConnectionString() {
        return this.accountConnectionString;
    }
    /**
     * Name of the account.
     * 
    */
    public String accountName() {
        return this.accountName;
    }
    /**
     * Type of the account.
     * 
    */
    public String dataAccountType() {
        return this.dataAccountType;
    }
    /**
     * Per share level unencrypted access credentials.
     * 
    */
    public List<ShareCredentialDetailsResponse> shareCredentialDetails() {
        return this.shareCredentialDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountCredentialDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountConnectionString;
        private String accountName;
        private String dataAccountType;
        private List<ShareCredentialDetailsResponse> shareCredentialDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountCredentialDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountConnectionString = defaults.accountConnectionString;
    	      this.accountName = defaults.accountName;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.shareCredentialDetails = defaults.shareCredentialDetails;
        }

        public Builder accountConnectionString(String accountConnectionString) {
            this.accountConnectionString = Objects.requireNonNull(accountConnectionString);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder shareCredentialDetails(List<ShareCredentialDetailsResponse> shareCredentialDetails) {
            this.shareCredentialDetails = Objects.requireNonNull(shareCredentialDetails);
            return this;
        }
        public Builder shareCredentialDetails(ShareCredentialDetailsResponse... shareCredentialDetails) {
            return shareCredentialDetails(List.of(shareCredentialDetails));
        }        public AccountCredentialDetailsResponse build() {
            return new AccountCredentialDetailsResponse(accountConnectionString, accountName, dataAccountType, shareCredentialDetails);
        }
    }
}
