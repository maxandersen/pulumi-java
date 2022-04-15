// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * storage resource of type Azure Storage Account.
 * 
 */
public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The account key of the Azure Storage Account.
     * 
     */
    @Import(name="accountKey", required=true)
      private final Output<String> accountKey;

    public Output<String> accountKey() {
        return this.accountKey;
    }

    /**
     * The account name of the Azure Storage Account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The type of the storage.
     * Expected value is 'StorageAccount'.
     * 
     */
    @Import(name="storageType", required=true)
      private final Output<String> storageType;

    public Output<String> storageType() {
        return this.storageType;
    }

    public StorageAccountArgs(
        Output<String> accountKey,
        Output<String> accountName,
        Output<String> storageType) {
        this.accountKey = Objects.requireNonNull(accountKey, "expected parameter 'accountKey' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.storageType = Objects.requireNonNull(storageType, "expected parameter 'storageType' to be non-null");
    }

    private StorageAccountArgs() {
        this.accountKey = Codegen.empty();
        this.accountName = Codegen.empty();
        this.storageType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountKey;
        private Output<String> accountName;
        private Output<String> storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.storageType = defaults.storageType;
        }

        public Builder accountKey(Output<String> accountKey) {
            this.accountKey = Objects.requireNonNull(accountKey);
            return this;
        }
        public Builder accountKey(String accountKey) {
            this.accountKey = Output.of(Objects.requireNonNull(accountKey));
            return this;
        }
        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder storageType(Output<String> storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Output.of(Objects.requireNonNull(storageType));
            return this;
        }        public StorageAccountArgs build() {
            return new StorageAccountArgs(accountKey, accountName, storageType);
        }
    }
}
