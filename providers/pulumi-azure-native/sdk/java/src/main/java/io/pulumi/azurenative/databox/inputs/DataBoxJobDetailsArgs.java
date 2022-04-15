// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ContactDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataExportDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataImportDetailsArgs;
import io.pulumi.azurenative.databox.inputs.KeyEncryptionKeyArgs;
import io.pulumi.azurenative.databox.inputs.PreferencesArgs;
import io.pulumi.azurenative.databox.inputs.ShippingAddressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Databox Job Details
 * 
 */
public final class DataBoxJobDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataBoxJobDetailsArgs Empty = new DataBoxJobDetailsArgs();

    /**
     * Contact details for notification and shipping.
     * 
     */
    @Import(name="contactDetails", required=true)
      private final Output<ContactDetailsArgs> contactDetails;

    public Output<ContactDetailsArgs> contactDetails() {
        return this.contactDetails;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @Import(name="dataExportDetails")
      private final @Nullable Output<List<DataExportDetailsArgs>> dataExportDetails;

    public Output<List<DataExportDetailsArgs>> dataExportDetails() {
        return this.dataExportDetails == null ? Codegen.empty() : this.dataExportDetails;
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @Import(name="dataImportDetails")
      private final @Nullable Output<List<DataImportDetailsArgs>> dataImportDetails;

    public Output<List<DataImportDetailsArgs>> dataImportDetails() {
        return this.dataImportDetails == null ? Codegen.empty() : this.dataImportDetails;
    }

    /**
     * Set Device password for unlocking Databox. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="devicePassword")
      private final @Nullable Output<String> devicePassword;

    public Output<String> devicePassword() {
        return this.devicePassword == null ? Codegen.empty() : this.devicePassword;
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @Import(name="expectedDataSizeInTeraBytes")
      private final @Nullable Output<Integer> expectedDataSizeInTeraBytes;

    public Output<Integer> expectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes == null ? Codegen.empty() : this.expectedDataSizeInTeraBytes;
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBox'.
     * 
     */
    @Import(name="jobDetailsType", required=true)
      private final Output<String> jobDetailsType;

    public Output<String> jobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @Import(name="keyEncryptionKey")
      private final @Nullable Output<KeyEncryptionKeyArgs> keyEncryptionKey;

    public Output<KeyEncryptionKeyArgs> keyEncryptionKey() {
        return this.keyEncryptionKey == null ? Codegen.empty() : this.keyEncryptionKey;
    }

    /**
     * Preferences for the order.
     * 
     */
    @Import(name="preferences")
      private final @Nullable Output<PreferencesArgs> preferences;

    public Output<PreferencesArgs> preferences() {
        return this.preferences == null ? Codegen.empty() : this.preferences;
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @Import(name="shippingAddress")
      private final @Nullable Output<ShippingAddressArgs> shippingAddress;

    public Output<ShippingAddressArgs> shippingAddress() {
        return this.shippingAddress == null ? Codegen.empty() : this.shippingAddress;
    }

    public DataBoxJobDetailsArgs(
        Output<ContactDetailsArgs> contactDetails,
        @Nullable Output<List<DataExportDetailsArgs>> dataExportDetails,
        @Nullable Output<List<DataImportDetailsArgs>> dataImportDetails,
        @Nullable Output<String> devicePassword,
        @Nullable Output<Integer> expectedDataSizeInTeraBytes,
        Output<String> jobDetailsType,
        @Nullable Output<KeyEncryptionKeyArgs> keyEncryptionKey,
        @Nullable Output<PreferencesArgs> preferences,
        @Nullable Output<ShippingAddressArgs> shippingAddress) {
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.devicePassword = devicePassword;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = Objects.requireNonNull(jobDetailsType, "expected parameter 'jobDetailsType' to be non-null");
        this.keyEncryptionKey = keyEncryptionKey;
        this.preferences = preferences;
        this.shippingAddress = shippingAddress;
    }

    private DataBoxJobDetailsArgs() {
        this.contactDetails = Codegen.empty();
        this.dataExportDetails = Codegen.empty();
        this.dataImportDetails = Codegen.empty();
        this.devicePassword = Codegen.empty();
        this.expectedDataSizeInTeraBytes = Codegen.empty();
        this.jobDetailsType = Codegen.empty();
        this.keyEncryptionKey = Codegen.empty();
        this.preferences = Codegen.empty();
        this.shippingAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxJobDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ContactDetailsArgs> contactDetails;
        private @Nullable Output<List<DataExportDetailsArgs>> dataExportDetails;
        private @Nullable Output<List<DataImportDetailsArgs>> dataImportDetails;
        private @Nullable Output<String> devicePassword;
        private @Nullable Output<Integer> expectedDataSizeInTeraBytes;
        private Output<String> jobDetailsType;
        private @Nullable Output<KeyEncryptionKeyArgs> keyEncryptionKey;
        private @Nullable Output<PreferencesArgs> preferences;
        private @Nullable Output<ShippingAddressArgs> shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxJobDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactDetails = defaults.contactDetails;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.devicePassword = defaults.devicePassword;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.preferences = defaults.preferences;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder contactDetails(Output<ContactDetailsArgs> contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder contactDetails(ContactDetailsArgs contactDetails) {
            this.contactDetails = Output.of(Objects.requireNonNull(contactDetails));
            return this;
        }
        public Builder dataExportDetails(@Nullable Output<List<DataExportDetailsArgs>> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }
        public Builder dataExportDetails(@Nullable List<DataExportDetailsArgs> dataExportDetails) {
            this.dataExportDetails = Codegen.ofNullable(dataExportDetails);
            return this;
        }
        public Builder dataExportDetails(DataExportDetailsArgs... dataExportDetails) {
            return dataExportDetails(List.of(dataExportDetails));
        }
        public Builder dataImportDetails(@Nullable Output<List<DataImportDetailsArgs>> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }
        public Builder dataImportDetails(@Nullable List<DataImportDetailsArgs> dataImportDetails) {
            this.dataImportDetails = Codegen.ofNullable(dataImportDetails);
            return this;
        }
        public Builder dataImportDetails(DataImportDetailsArgs... dataImportDetails) {
            return dataImportDetails(List.of(dataImportDetails));
        }
        public Builder devicePassword(@Nullable Output<String> devicePassword) {
            this.devicePassword = devicePassword;
            return this;
        }
        public Builder devicePassword(@Nullable String devicePassword) {
            this.devicePassword = Codegen.ofNullable(devicePassword);
            return this;
        }
        public Builder expectedDataSizeInTeraBytes(@Nullable Output<Integer> expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }
        public Builder expectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = Codegen.ofNullable(expectedDataSizeInTeraBytes);
            return this;
        }
        public Builder jobDetailsType(Output<String> jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }
        public Builder jobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Output.of(Objects.requireNonNull(jobDetailsType));
            return this;
        }
        public Builder keyEncryptionKey(@Nullable Output<KeyEncryptionKeyArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public Builder keyEncryptionKey(@Nullable KeyEncryptionKeyArgs keyEncryptionKey) {
            this.keyEncryptionKey = Codegen.ofNullable(keyEncryptionKey);
            return this;
        }
        public Builder preferences(@Nullable Output<PreferencesArgs> preferences) {
            this.preferences = preferences;
            return this;
        }
        public Builder preferences(@Nullable PreferencesArgs preferences) {
            this.preferences = Codegen.ofNullable(preferences);
            return this;
        }
        public Builder shippingAddress(@Nullable Output<ShippingAddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressArgs shippingAddress) {
            this.shippingAddress = Codegen.ofNullable(shippingAddress);
            return this;
        }        public DataBoxJobDetailsArgs build() {
            return new DataBoxJobDetailsArgs(contactDetails, dataExportDetails, dataImportDetails, devicePassword, expectedDataSizeInTeraBytes, jobDetailsType, keyEncryptionKey, preferences, shippingAddress);
        }
    }
}
