// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ShareCredentialDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Credential details of the account.
 * 
 */
public final class AccountCredentialDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccountCredentialDetailsResponse Empty = new AccountCredentialDetailsResponse();

    /**
     * Connection string of the account endpoint to use the account as a storage endpoint on the device.
     * 
     */
    @Import(name="accountConnectionString", required=true)
      private final String accountConnectionString;

    public String accountConnectionString() {
        return this.accountConnectionString;
    }

    /**
     * Name of the account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Type of the account.
     * 
     */
    @Import(name="dataAccountType", required=true)
      private final String dataAccountType;

    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Per share level unencrypted access credentials.
     * 
     */
    @Import(name="shareCredentialDetails", required=true)
      private final List<ShareCredentialDetailsResponse> shareCredentialDetails;

    public List<ShareCredentialDetailsResponse> shareCredentialDetails() {
        return this.shareCredentialDetails;
    }

    public AccountCredentialDetailsResponse(
        String accountConnectionString,
        String accountName,
        String dataAccountType,
        List<ShareCredentialDetailsResponse> shareCredentialDetails) {
        this.accountConnectionString = Objects.requireNonNull(accountConnectionString, "expected parameter 'accountConnectionString' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataAccountType = Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.shareCredentialDetails = Objects.requireNonNull(shareCredentialDetails, "expected parameter 'shareCredentialDetails' to be non-null");
    }

    private AccountCredentialDetailsResponse() {
        this.accountConnectionString = null;
        this.accountName = null;
        this.dataAccountType = null;
        this.shareCredentialDetails = List.of();
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
