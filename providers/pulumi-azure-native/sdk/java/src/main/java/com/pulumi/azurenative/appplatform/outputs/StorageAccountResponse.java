// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountResponse {
    /**
     * The account name of the Azure Storage Account.
     * 
     */
    private final String accountName;
    /**
     * The type of the storage.
     * Expected value is &#39;StorageAccount&#39;.
     * 
     */
    private final String storageType;

    @CustomType.Constructor
    private StorageAccountResponse(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("storageType") String storageType) {
        this.accountName = accountName;
        this.storageType = storageType;
    }

    /**
     * The account name of the Azure Storage Account.
     * 
    */
    public String accountName() {
        return this.accountName;
    }
    /**
     * The type of the storage.
     * Expected value is &#39;StorageAccount&#39;.
     * 
    */
    public String storageType() {
        return this.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.storageType = defaults.storageType;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }        public StorageAccountResponse build() {
            return new StorageAccountResponse(accountName, storageType);
        }
    }
}
