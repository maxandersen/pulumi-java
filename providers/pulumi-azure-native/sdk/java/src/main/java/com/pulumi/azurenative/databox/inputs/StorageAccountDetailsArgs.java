// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details for the storage account.
 * 
 */
public final class StorageAccountDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountDetailsArgs Empty = new StorageAccountDetailsArgs();

    /**
     * Account Type of the data to be transferred.
     * Expected value is &#39;StorageAccount&#39;.
     * 
     */
    @Import(name="dataAccountType", required=true)
    private Output<String> dataAccountType;

    public Output<String> dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="sharePassword")
    private @Nullable Output<String> sharePassword;

    public Optional<Output<String>> sharePassword() {
        return Optional.ofNullable(this.sharePassword);
    }

    /**
     * Storage Account Resource Id.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private StorageAccountDetailsArgs() {}

    private StorageAccountDetailsArgs(StorageAccountDetailsArgs $) {
        this.dataAccountType = $.dataAccountType;
        this.sharePassword = $.sharePassword;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountDetailsArgs $;

        public Builder() {
            $ = new StorageAccountDetailsArgs();
        }

        public Builder(StorageAccountDetailsArgs defaults) {
            $ = new StorageAccountDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataAccountType(Output<String> dataAccountType) {
            $.dataAccountType = dataAccountType;
            return this;
        }

        public Builder dataAccountType(String dataAccountType) {
            return dataAccountType(Output.of(dataAccountType));
        }

        public Builder sharePassword(@Nullable Output<String> sharePassword) {
            $.sharePassword = sharePassword;
            return this;
        }

        public Builder sharePassword(String sharePassword) {
            return sharePassword(Output.of(sharePassword));
        }

        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public StorageAccountDetailsArgs build() {
            $.dataAccountType = Codegen.stringProp("dataAccountType").output().arg($.dataAccountType).def("StorageAccount").require();
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}
