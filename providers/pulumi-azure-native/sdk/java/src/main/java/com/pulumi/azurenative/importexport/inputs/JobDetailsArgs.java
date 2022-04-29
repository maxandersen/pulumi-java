// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.azurenative.importexport.inputs.DeliveryPackageInformationArgs;
import com.pulumi.azurenative.importexport.inputs.DriveStatusArgs;
import com.pulumi.azurenative.importexport.inputs.EncryptionKeyDetailsArgs;
import com.pulumi.azurenative.importexport.inputs.ExportArgs;
import com.pulumi.azurenative.importexport.inputs.PackageInformationArgs;
import com.pulumi.azurenative.importexport.inputs.ReturnAddressArgs;
import com.pulumi.azurenative.importexport.inputs.ReturnShippingArgs;
import com.pulumi.azurenative.importexport.inputs.ShippingInformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the job properties
 * 
 */
public final class JobDetailsArgs extends ResourceArgs {

    public static final JobDetailsArgs Empty = new JobDetailsArgs();

    /**
     * Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
     * 
     */
    @Import(name="backupDriveManifest")
    private @Nullable Output<Boolean> backupDriveManifest;

    /**
     * @return Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
     * 
     */
    public Optional<Output<Boolean>> backupDriveManifest() {
        return Optional.ofNullable(this.backupDriveManifest);
    }

    /**
     * Indicates whether a request has been submitted to cancel the job.
     * 
     */
    @Import(name="cancelRequested")
    private @Nullable Output<Boolean> cancelRequested;

    /**
     * @return Indicates whether a request has been submitted to cancel the job.
     * 
     */
    public Optional<Output<Boolean>> cancelRequested() {
        return Optional.ofNullable(this.cancelRequested);
    }

    /**
     * Contains information about the package being shipped by the customer to the Microsoft data center.
     * 
     */
    @Import(name="deliveryPackage")
    private @Nullable Output<DeliveryPackageInformationArgs> deliveryPackage;

    /**
     * @return Contains information about the package being shipped by the customer to the Microsoft data center.
     * 
     */
    public Optional<Output<DeliveryPackageInformationArgs>> deliveryPackage() {
        return Optional.ofNullable(this.deliveryPackage);
    }

    /**
     * The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
     * 
     */
    @Import(name="diagnosticsPath")
    private @Nullable Output<String> diagnosticsPath;

    /**
     * @return The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
     * 
     */
    public Optional<Output<String>> diagnosticsPath() {
        return Optional.ofNullable(this.diagnosticsPath);
    }

    /**
     * List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
     * 
     */
    @Import(name="driveList")
    private @Nullable Output<List<DriveStatusArgs>> driveList;

    /**
     * @return List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
     * 
     */
    public Optional<Output<List<DriveStatusArgs>>> driveList() {
        return Optional.ofNullable(this.driveList);
    }

    /**
     * Contains information about the encryption key.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<EncryptionKeyDetailsArgs> encryptionKey;

    /**
     * @return Contains information about the encryption key.
     * 
     */
    public Optional<Output<EncryptionKeyDetailsArgs>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
     * 
     */
    @Import(name="export")
    private @Nullable Output<ExportArgs> export;

    /**
     * @return A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
     * 
     */
    public Optional<Output<ExportArgs>> export() {
        return Optional.ofNullable(this.export);
    }

    /**
     * A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
     * 
     */
    @Import(name="incompleteBlobListUri")
    private @Nullable Output<String> incompleteBlobListUri;

    /**
     * @return A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
     * 
     */
    public Optional<Output<String>> incompleteBlobListUri() {
        return Optional.ofNullable(this.incompleteBlobListUri);
    }

    /**
     * The type of job
     * 
     */
    @Import(name="jobType")
    private @Nullable Output<String> jobType;

    /**
     * @return The type of job
     * 
     */
    public Optional<Output<String>> jobType() {
        return Optional.ofNullable(this.jobType);
    }

    /**
     * Default value is Error. Indicates whether error logging or verbose logging will be enabled.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return Default value is Error. Indicates whether error logging or verbose logging will be enabled.
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * Overall percentage completed for the job.
     * 
     */
    @Import(name="percentComplete")
    private @Nullable Output<Integer> percentComplete;

    /**
     * @return Overall percentage completed for the job.
     * 
     */
    public Optional<Output<Integer>> percentComplete() {
        return Optional.ofNullable(this.percentComplete);
    }

    /**
     * Specifies the provisioning state of the job.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return Specifies the provisioning state of the job.
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * Specifies the return address information for the job.
     * 
     */
    @Import(name="returnAddress")
    private @Nullable Output<ReturnAddressArgs> returnAddress;

    /**
     * @return Specifies the return address information for the job.
     * 
     */
    public Optional<Output<ReturnAddressArgs>> returnAddress() {
        return Optional.ofNullable(this.returnAddress);
    }

    /**
     * Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
     * 
     */
    @Import(name="returnPackage")
    private @Nullable Output<PackageInformationArgs> returnPackage;

    /**
     * @return Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
     * 
     */
    public Optional<Output<PackageInformationArgs>> returnPackage() {
        return Optional.ofNullable(this.returnPackage);
    }

    /**
     * Specifies the return carrier and customer&#39;s account with the carrier.
     * 
     */
    @Import(name="returnShipping")
    private @Nullable Output<ReturnShippingArgs> returnShipping;

    /**
     * @return Specifies the return carrier and customer&#39;s account with the carrier.
     * 
     */
    public Optional<Output<ReturnShippingArgs>> returnShipping() {
        return Optional.ofNullable(this.returnShipping);
    }

    /**
     * Contains information about the Microsoft datacenter to which the drives should be shipped.
     * 
     */
    @Import(name="shippingInformation")
    private @Nullable Output<ShippingInformationArgs> shippingInformation;

    /**
     * @return Contains information about the Microsoft datacenter to which the drives should be shipped.
     * 
     */
    public Optional<Output<ShippingInformationArgs>> shippingInformation() {
        return Optional.ofNullable(this.shippingInformation);
    }

    /**
     * Current state of the job.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Current state of the job.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The resource identifier of the storage account where data will be imported to or exported from.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The resource identifier of the storage account where data will be imported to or exported from.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    private JobDetailsArgs() {}

    private JobDetailsArgs(JobDetailsArgs $) {
        this.backupDriveManifest = $.backupDriveManifest;
        this.cancelRequested = $.cancelRequested;
        this.deliveryPackage = $.deliveryPackage;
        this.diagnosticsPath = $.diagnosticsPath;
        this.driveList = $.driveList;
        this.encryptionKey = $.encryptionKey;
        this.export = $.export;
        this.incompleteBlobListUri = $.incompleteBlobListUri;
        this.jobType = $.jobType;
        this.logLevel = $.logLevel;
        this.percentComplete = $.percentComplete;
        this.provisioningState = $.provisioningState;
        this.returnAddress = $.returnAddress;
        this.returnPackage = $.returnPackage;
        this.returnShipping = $.returnShipping;
        this.shippingInformation = $.shippingInformation;
        this.state = $.state;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDetailsArgs $;

        public Builder() {
            $ = new JobDetailsArgs();
        }

        public Builder(JobDetailsArgs defaults) {
            $ = new JobDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupDriveManifest Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
         * 
         * @return builder
         * 
         */
        public Builder backupDriveManifest(@Nullable Output<Boolean> backupDriveManifest) {
            $.backupDriveManifest = backupDriveManifest;
            return this;
        }

        /**
         * @param backupDriveManifest Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
         * 
         * @return builder
         * 
         */
        public Builder backupDriveManifest(Boolean backupDriveManifest) {
            return backupDriveManifest(Output.of(backupDriveManifest));
        }

        /**
         * @param cancelRequested Indicates whether a request has been submitted to cancel the job.
         * 
         * @return builder
         * 
         */
        public Builder cancelRequested(@Nullable Output<Boolean> cancelRequested) {
            $.cancelRequested = cancelRequested;
            return this;
        }

        /**
         * @param cancelRequested Indicates whether a request has been submitted to cancel the job.
         * 
         * @return builder
         * 
         */
        public Builder cancelRequested(Boolean cancelRequested) {
            return cancelRequested(Output.of(cancelRequested));
        }

        /**
         * @param deliveryPackage Contains information about the package being shipped by the customer to the Microsoft data center.
         * 
         * @return builder
         * 
         */
        public Builder deliveryPackage(@Nullable Output<DeliveryPackageInformationArgs> deliveryPackage) {
            $.deliveryPackage = deliveryPackage;
            return this;
        }

        /**
         * @param deliveryPackage Contains information about the package being shipped by the customer to the Microsoft data center.
         * 
         * @return builder
         * 
         */
        public Builder deliveryPackage(DeliveryPackageInformationArgs deliveryPackage) {
            return deliveryPackage(Output.of(deliveryPackage));
        }

        /**
         * @param diagnosticsPath The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsPath(@Nullable Output<String> diagnosticsPath) {
            $.diagnosticsPath = diagnosticsPath;
            return this;
        }

        /**
         * @param diagnosticsPath The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticsPath(String diagnosticsPath) {
            return diagnosticsPath(Output.of(diagnosticsPath));
        }

        /**
         * @param driveList List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
         * 
         * @return builder
         * 
         */
        public Builder driveList(@Nullable Output<List<DriveStatusArgs>> driveList) {
            $.driveList = driveList;
            return this;
        }

        /**
         * @param driveList List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
         * 
         * @return builder
         * 
         */
        public Builder driveList(List<DriveStatusArgs> driveList) {
            return driveList(Output.of(driveList));
        }

        /**
         * @param driveList List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
         * 
         * @return builder
         * 
         */
        public Builder driveList(DriveStatusArgs... driveList) {
            return driveList(List.of(driveList));
        }

        /**
         * @param encryptionKey Contains information about the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable Output<EncryptionKeyDetailsArgs> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey Contains information about the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(EncryptionKeyDetailsArgs encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param export A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
         * 
         * @return builder
         * 
         */
        public Builder export(@Nullable Output<ExportArgs> export) {
            $.export = export;
            return this;
        }

        /**
         * @param export A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
         * 
         * @return builder
         * 
         */
        public Builder export(ExportArgs export) {
            return export(Output.of(export));
        }

        /**
         * @param incompleteBlobListUri A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
         * 
         * @return builder
         * 
         */
        public Builder incompleteBlobListUri(@Nullable Output<String> incompleteBlobListUri) {
            $.incompleteBlobListUri = incompleteBlobListUri;
            return this;
        }

        /**
         * @param incompleteBlobListUri A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
         * 
         * @return builder
         * 
         */
        public Builder incompleteBlobListUri(String incompleteBlobListUri) {
            return incompleteBlobListUri(Output.of(incompleteBlobListUri));
        }

        /**
         * @param jobType The type of job
         * 
         * @return builder
         * 
         */
        public Builder jobType(@Nullable Output<String> jobType) {
            $.jobType = jobType;
            return this;
        }

        /**
         * @param jobType The type of job
         * 
         * @return builder
         * 
         */
        public Builder jobType(String jobType) {
            return jobType(Output.of(jobType));
        }

        /**
         * @param logLevel Default value is Error. Indicates whether error logging or verbose logging will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel Default value is Error. Indicates whether error logging or verbose logging will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param percentComplete Overall percentage completed for the job.
         * 
         * @return builder
         * 
         */
        public Builder percentComplete(@Nullable Output<Integer> percentComplete) {
            $.percentComplete = percentComplete;
            return this;
        }

        /**
         * @param percentComplete Overall percentage completed for the job.
         * 
         * @return builder
         * 
         */
        public Builder percentComplete(Integer percentComplete) {
            return percentComplete(Output.of(percentComplete));
        }

        /**
         * @param provisioningState Specifies the provisioning state of the job.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState Specifies the provisioning state of the job.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param returnAddress Specifies the return address information for the job.
         * 
         * @return builder
         * 
         */
        public Builder returnAddress(@Nullable Output<ReturnAddressArgs> returnAddress) {
            $.returnAddress = returnAddress;
            return this;
        }

        /**
         * @param returnAddress Specifies the return address information for the job.
         * 
         * @return builder
         * 
         */
        public Builder returnAddress(ReturnAddressArgs returnAddress) {
            return returnAddress(Output.of(returnAddress));
        }

        /**
         * @param returnPackage Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
         * 
         * @return builder
         * 
         */
        public Builder returnPackage(@Nullable Output<PackageInformationArgs> returnPackage) {
            $.returnPackage = returnPackage;
            return this;
        }

        /**
         * @param returnPackage Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
         * 
         * @return builder
         * 
         */
        public Builder returnPackage(PackageInformationArgs returnPackage) {
            return returnPackage(Output.of(returnPackage));
        }

        /**
         * @param returnShipping Specifies the return carrier and customer&#39;s account with the carrier.
         * 
         * @return builder
         * 
         */
        public Builder returnShipping(@Nullable Output<ReturnShippingArgs> returnShipping) {
            $.returnShipping = returnShipping;
            return this;
        }

        /**
         * @param returnShipping Specifies the return carrier and customer&#39;s account with the carrier.
         * 
         * @return builder
         * 
         */
        public Builder returnShipping(ReturnShippingArgs returnShipping) {
            return returnShipping(Output.of(returnShipping));
        }

        /**
         * @param shippingInformation Contains information about the Microsoft datacenter to which the drives should be shipped.
         * 
         * @return builder
         * 
         */
        public Builder shippingInformation(@Nullable Output<ShippingInformationArgs> shippingInformation) {
            $.shippingInformation = shippingInformation;
            return this;
        }

        /**
         * @param shippingInformation Contains information about the Microsoft datacenter to which the drives should be shipped.
         * 
         * @return builder
         * 
         */
        public Builder shippingInformation(ShippingInformationArgs shippingInformation) {
            return shippingInformation(Output.of(shippingInformation));
        }

        /**
         * @param state Current state of the job.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Current state of the job.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param storageAccountId The resource identifier of the storage account where data will be imported to or exported from.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The resource identifier of the storage account where data will be imported to or exported from.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public JobDetailsArgs build() {
            $.backupDriveManifest = Codegen.booleanProp("backupDriveManifest").output().arg($.backupDriveManifest).def(false).getNullable();
            $.cancelRequested = Codegen.booleanProp("cancelRequested").output().arg($.cancelRequested).def(false).getNullable();
            $.state = Codegen.stringProp("state").output().arg($.state).def("Creating").getNullable();
            return $;
        }
    }

}
