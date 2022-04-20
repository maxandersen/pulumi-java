// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.ContactDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxAccountCopyLogDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxDiskCopyLogDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxDiskCopyProgressResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxHeavyAccountCopyLogDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataExportDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataImportDetailsResponse;
import com.pulumi.azurenative.databox.outputs.JobStagesResponse;
import com.pulumi.azurenative.databox.outputs.KeyEncryptionKeyResponse;
import com.pulumi.azurenative.databox.outputs.PackageShippingDetailsResponse;
import com.pulumi.azurenative.databox.outputs.PreferencesResponse;
import com.pulumi.azurenative.databox.outputs.ShippingAddressResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataBoxDiskJobDetailsResponse {
    /**
     * Shared access key to download the chain of custody logs
     * 
     */
    private final String chainOfCustodySasKey;
    /**
     * Contact details for notification and shipping.
     * 
     */
    private final ContactDetailsResponse contactDetails;
    /**
     * List of copy log details.
     * 
     */
    private final List<Object> copyLogDetails;
    /**
     * Copy progress per disk.
     * 
     */
    private final List<DataBoxDiskCopyProgressResponse> copyProgress;
    /**
     * Details of the data to be exported from azure.
     * 
     */
    private final @Nullable List<DataExportDetailsResponse> dataExportDetails;
    /**
     * Details of the data to be imported into azure.
     * 
     */
    private final @Nullable List<DataImportDetailsResponse> dataImportDetails;
    /**
     * Delivery package shipping details.
     * 
     */
    private final PackageShippingDetailsResponse deliveryPackage;
    /**
     * Contains the map of disk serial number to the disk size being used for the job. Is returned only after the disks are shipped to the customer.
     * 
     */
    private final Map<String,Integer> disksAndSizeDetails;
    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    private final @Nullable Integer expectedDataSizeInTeraBytes;
    /**
     * Indicates the type of job details.
     * Expected value is &#39;DataBoxDisk&#39;.
     * 
     */
    private final String jobDetailsType;
    /**
     * List of stages that run in the job.
     * 
     */
    private final List<JobStagesResponse> jobStages;
    /**
     * Details about which key encryption type is being used.
     * 
     */
    private final @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
    /**
     * User entered passkey for DataBox Disk job.
     * 
     */
    private final @Nullable String passkey;
    /**
     * Preferences for the order.
     * 
     */
    private final @Nullable PreferencesResponse preferences;
    /**
     * User preference on what size disks are needed for the job. The map is from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an int.
     * 
     */
    private final @Nullable Map<String,Integer> preferredDisks;
    /**
     * Return package shipping details.
     * 
     */
    private final PackageShippingDetailsResponse returnPackage;
    /**
     * Shared access key to download the return shipment label
     * 
     */
    private final String reverseShipmentLabelSasKey;
    /**
     * Shipping address of the customer.
     * 
     */
    private final @Nullable ShippingAddressResponse shippingAddress;

    @CustomType.Constructor
    private DataBoxDiskJobDetailsResponse(
        @CustomType.Parameter("chainOfCustodySasKey") String chainOfCustodySasKey,
        @CustomType.Parameter("contactDetails") ContactDetailsResponse contactDetails,
        @CustomType.Parameter("copyLogDetails") List<Object> copyLogDetails,
        @CustomType.Parameter("copyProgress") List<DataBoxDiskCopyProgressResponse> copyProgress,
        @CustomType.Parameter("dataExportDetails") @Nullable List<DataExportDetailsResponse> dataExportDetails,
        @CustomType.Parameter("dataImportDetails") @Nullable List<DataImportDetailsResponse> dataImportDetails,
        @CustomType.Parameter("deliveryPackage") PackageShippingDetailsResponse deliveryPackage,
        @CustomType.Parameter("disksAndSizeDetails") Map<String,Integer> disksAndSizeDetails,
        @CustomType.Parameter("expectedDataSizeInTeraBytes") @Nullable Integer expectedDataSizeInTeraBytes,
        @CustomType.Parameter("jobDetailsType") String jobDetailsType,
        @CustomType.Parameter("jobStages") List<JobStagesResponse> jobStages,
        @CustomType.Parameter("keyEncryptionKey") @Nullable KeyEncryptionKeyResponse keyEncryptionKey,
        @CustomType.Parameter("passkey") @Nullable String passkey,
        @CustomType.Parameter("preferences") @Nullable PreferencesResponse preferences,
        @CustomType.Parameter("preferredDisks") @Nullable Map<String,Integer> preferredDisks,
        @CustomType.Parameter("returnPackage") PackageShippingDetailsResponse returnPackage,
        @CustomType.Parameter("reverseShipmentLabelSasKey") String reverseShipmentLabelSasKey,
        @CustomType.Parameter("shippingAddress") @Nullable ShippingAddressResponse shippingAddress) {
        this.chainOfCustodySasKey = chainOfCustodySasKey;
        this.contactDetails = contactDetails;
        this.copyLogDetails = copyLogDetails;
        this.copyProgress = copyProgress;
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.deliveryPackage = deliveryPackage;
        this.disksAndSizeDetails = disksAndSizeDetails;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = jobDetailsType;
        this.jobStages = jobStages;
        this.keyEncryptionKey = keyEncryptionKey;
        this.passkey = passkey;
        this.preferences = preferences;
        this.preferredDisks = preferredDisks;
        this.returnPackage = returnPackage;
        this.reverseShipmentLabelSasKey = reverseShipmentLabelSasKey;
        this.shippingAddress = shippingAddress;
    }

    /**
     * Shared access key to download the chain of custody logs
     * 
    */
    public String chainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }
    /**
     * Contact details for notification and shipping.
     * 
    */
    public ContactDetailsResponse contactDetails() {
        return this.contactDetails;
    }
    /**
     * List of copy log details.
     * 
    */
    public List<Object> copyLogDetails() {
        return this.copyLogDetails;
    }
    /**
     * Copy progress per disk.
     * 
    */
    public List<DataBoxDiskCopyProgressResponse> copyProgress() {
        return this.copyProgress;
    }
    /**
     * Details of the data to be exported from azure.
     * 
    */
    public List<DataExportDetailsResponse> dataExportDetails() {
        return this.dataExportDetails == null ? List.of() : this.dataExportDetails;
    }
    /**
     * Details of the data to be imported into azure.
     * 
    */
    public List<DataImportDetailsResponse> dataImportDetails() {
        return this.dataImportDetails == null ? List.of() : this.dataImportDetails;
    }
    /**
     * Delivery package shipping details.
     * 
    */
    public PackageShippingDetailsResponse deliveryPackage() {
        return this.deliveryPackage;
    }
    /**
     * Contains the map of disk serial number to the disk size being used for the job. Is returned only after the disks are shipped to the customer.
     * 
    */
    public Map<String,Integer> disksAndSizeDetails() {
        return this.disksAndSizeDetails;
    }
    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
    */
    public Optional<Integer> expectedDataSizeInTeraBytes() {
        return Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }
    /**
     * Indicates the type of job details.
     * Expected value is &#39;DataBoxDisk&#39;.
     * 
    */
    public String jobDetailsType() {
        return this.jobDetailsType;
    }
    /**
     * List of stages that run in the job.
     * 
    */
    public List<JobStagesResponse> jobStages() {
        return this.jobStages;
    }
    /**
     * Details about which key encryption type is being used.
     * 
    */
    public Optional<KeyEncryptionKeyResponse> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }
    /**
     * User entered passkey for DataBox Disk job.
     * 
    */
    public Optional<String> passkey() {
        return Optional.ofNullable(this.passkey);
    }
    /**
     * Preferences for the order.
     * 
    */
    public Optional<PreferencesResponse> preferences() {
        return Optional.ofNullable(this.preferences);
    }
    /**
     * User preference on what size disks are needed for the job. The map is from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an int.
     * 
    */
    public Map<String,Integer> preferredDisks() {
        return this.preferredDisks == null ? Map.of() : this.preferredDisks;
    }
    /**
     * Return package shipping details.
     * 
    */
    public PackageShippingDetailsResponse returnPackage() {
        return this.returnPackage;
    }
    /**
     * Shared access key to download the return shipment label
     * 
    */
    public String reverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }
    /**
     * Shipping address of the customer.
     * 
    */
    public Optional<ShippingAddressResponse> shippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainOfCustodySasKey;
        private ContactDetailsResponse contactDetails;
        private List<Object> copyLogDetails;
        private List<DataBoxDiskCopyProgressResponse> copyProgress;
        private @Nullable List<DataExportDetailsResponse> dataExportDetails;
        private @Nullable List<DataImportDetailsResponse> dataImportDetails;
        private PackageShippingDetailsResponse deliveryPackage;
        private Map<String,Integer> disksAndSizeDetails;
        private @Nullable Integer expectedDataSizeInTeraBytes;
        private String jobDetailsType;
        private List<JobStagesResponse> jobStages;
        private @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
        private @Nullable String passkey;
        private @Nullable PreferencesResponse preferences;
        private @Nullable Map<String,Integer> preferredDisks;
        private PackageShippingDetailsResponse returnPackage;
        private String reverseShipmentLabelSasKey;
        private @Nullable ShippingAddressResponse shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainOfCustodySasKey = defaults.chainOfCustodySasKey;
    	      this.contactDetails = defaults.contactDetails;
    	      this.copyLogDetails = defaults.copyLogDetails;
    	      this.copyProgress = defaults.copyProgress;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.disksAndSizeDetails = defaults.disksAndSizeDetails;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.jobStages = defaults.jobStages;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.passkey = defaults.passkey;
    	      this.preferences = defaults.preferences;
    	      this.preferredDisks = defaults.preferredDisks;
    	      this.returnPackage = defaults.returnPackage;
    	      this.reverseShipmentLabelSasKey = defaults.reverseShipmentLabelSasKey;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder chainOfCustodySasKey(String chainOfCustodySasKey) {
            this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey);
            return this;
        }
        public Builder contactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder copyLogDetails(List<Object> copyLogDetails) {
            this.copyLogDetails = Objects.requireNonNull(copyLogDetails);
            return this;
        }
        public Builder copyLogDetails(Object... copyLogDetails) {
            return copyLogDetails(List.of(copyLogDetails));
        }
        public Builder copyProgress(List<DataBoxDiskCopyProgressResponse> copyProgress) {
            this.copyProgress = Objects.requireNonNull(copyProgress);
            return this;
        }
        public Builder copyProgress(DataBoxDiskCopyProgressResponse... copyProgress) {
            return copyProgress(List.of(copyProgress));
        }
        public Builder dataExportDetails(@Nullable List<DataExportDetailsResponse> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }
        public Builder dataExportDetails(DataExportDetailsResponse... dataExportDetails) {
            return dataExportDetails(List.of(dataExportDetails));
        }
        public Builder dataImportDetails(@Nullable List<DataImportDetailsResponse> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }
        public Builder dataImportDetails(DataImportDetailsResponse... dataImportDetails) {
            return dataImportDetails(List.of(dataImportDetails));
        }
        public Builder deliveryPackage(PackageShippingDetailsResponse deliveryPackage) {
            this.deliveryPackage = Objects.requireNonNull(deliveryPackage);
            return this;
        }
        public Builder disksAndSizeDetails(Map<String,Integer> disksAndSizeDetails) {
            this.disksAndSizeDetails = Objects.requireNonNull(disksAndSizeDetails);
            return this;
        }
        public Builder expectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }
        public Builder jobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }
        public Builder jobStages(List<JobStagesResponse> jobStages) {
            this.jobStages = Objects.requireNonNull(jobStages);
            return this;
        }
        public Builder jobStages(JobStagesResponse... jobStages) {
            return jobStages(List.of(jobStages));
        }
        public Builder keyEncryptionKey(@Nullable KeyEncryptionKeyResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public Builder passkey(@Nullable String passkey) {
            this.passkey = passkey;
            return this;
        }
        public Builder preferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }
        public Builder preferredDisks(@Nullable Map<String,Integer> preferredDisks) {
            this.preferredDisks = preferredDisks;
            return this;
        }
        public Builder returnPackage(PackageShippingDetailsResponse returnPackage) {
            this.returnPackage = Objects.requireNonNull(returnPackage);
            return this;
        }
        public Builder reverseShipmentLabelSasKey(String reverseShipmentLabelSasKey) {
            this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey);
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }        public DataBoxDiskJobDetailsResponse build() {
            return new DataBoxDiskJobDetailsResponse(chainOfCustodySasKey, contactDetails, copyLogDetails, copyProgress, dataExportDetails, dataImportDetails, deliveryPackage, disksAndSizeDetails, expectedDataSizeInTeraBytes, jobDetailsType, jobStages, keyEncryptionKey, passkey, preferences, preferredDisks, returnPackage, reverseShipmentLabelSasKey, shippingAddress);
        }
    }
}
