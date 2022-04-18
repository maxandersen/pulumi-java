// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountDetailsResponse {
    /**
     * Account Type of the data to be transferred.
     * Expected value is 'StorageAccount'.
     * 
     */
    private final String dataAccountType;
    /**
     * Storage Account Resource Id.
     * 
     */
    private final String storageAccountId;

    @CustomType.Constructor
    private StorageAccountDetailsResponse(
        @CustomType.Parameter("dataAccountType") String dataAccountType,
        @CustomType.Parameter("storageAccountId") String storageAccountId) {
        this.dataAccountType = dataAccountType;
        this.storageAccountId = storageAccountId;
    }

    /**
     * Account Type of the data to be transferred.
     * Expected value is 'StorageAccount'.
     * 
    */
    public String dataAccountType() {
        return this.dataAccountType;
    }
    /**
     * Storage Account Resource Id.
     * 
    */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataAccountType;
        private String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }        public StorageAccountDetailsResponse build() {
            return new StorageAccountDetailsResponse(dataAccountType, storageAccountId);
        }
    }
}
