// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetSnapshotResult {
    /**
     * Set to true if snapshots are automatically created by applying resource policy on the target disk.
     * 
     */
    private final Boolean autoCreated;
    /**
     * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    private final String chainName;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Size of the source disk, specified in GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * Number of bytes downloaded to restore a snapshot to a disk.
     * 
     */
    private final String downloadBytes;
    /**
     * Type of the resource. Always compute#snapshot for Snapshot resources.
     * 
     */
    private final String kind;
    /**
     * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
     * 
     */
    private final String labelFingerprint;
    /**
     * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Integer license codes indicating which licenses are attached to this snapshot.
     * 
     */
    private final List<String> licenseCodes;
    /**
     * A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
     * 
     */
    private final List<String> licenses;
    /**
     * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    private final CustomerEncryptionKeyResponse snapshotEncryptionKey;
    /**
     * The source disk used to create this snapshot.
     * 
     */
    private final String sourceDisk;
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceDiskEncryptionKey;
    /**
     * The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
     * 
     */
    private final String sourceDiskId;
    /**
     * The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
     * 
     */
    private final String status;
    /**
     * A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion.
     * 
     */
    private final String storageBytes;
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    private final String storageBytesStatus;
    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    private final List<String> storageLocations;

    @OutputCustomType.Constructor
    private GetSnapshotResult(
        @OutputCustomType.Parameter("autoCreated") Boolean autoCreated,
        @OutputCustomType.Parameter("chainName") String chainName,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("diskSizeGb") String diskSizeGb,
        @OutputCustomType.Parameter("downloadBytes") String downloadBytes,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("labelFingerprint") String labelFingerprint,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("licenseCodes") List<String> licenseCodes,
        @OutputCustomType.Parameter("licenses") List<String> licenses,
        @OutputCustomType.Parameter("locationHint") String locationHint,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("snapshotEncryptionKey") CustomerEncryptionKeyResponse snapshotEncryptionKey,
        @OutputCustomType.Parameter("sourceDisk") String sourceDisk,
        @OutputCustomType.Parameter("sourceDiskEncryptionKey") CustomerEncryptionKeyResponse sourceDiskEncryptionKey,
        @OutputCustomType.Parameter("sourceDiskId") String sourceDiskId,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("storageBytes") String storageBytes,
        @OutputCustomType.Parameter("storageBytesStatus") String storageBytesStatus,
        @OutputCustomType.Parameter("storageLocations") List<String> storageLocations) {
        this.autoCreated = autoCreated;
        this.chainName = chainName;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.downloadBytes = downloadBytes;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.locationHint = locationHint;
        this.name = name;
        this.satisfiesPzs = satisfiesPzs;
        this.selfLink = selfLink;
        this.snapshotEncryptionKey = snapshotEncryptionKey;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.sourceDiskId = sourceDiskId;
        this.status = status;
        this.storageBytes = storageBytes;
        this.storageBytesStatus = storageBytesStatus;
        this.storageLocations = storageLocations;
    }

    /**
     * Set to true if snapshots are automatically created by applying resource policy on the target disk.
     * 
    */
    public Boolean getAutoCreated() {
        return this.autoCreated;
    }
    /**
     * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
    */
    public String getChainName() {
        return this.chainName;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Size of the source disk, specified in GB.
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Number of bytes downloaded to restore a snapshot to a disk.
     * 
    */
    public String getDownloadBytes() {
        return this.downloadBytes;
    }
    /**
     * Type of the resource. Always compute#snapshot for Snapshot resources.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a snapshot.
     * 
    */
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Integer license codes indicating which licenses are attached to this snapshot.
     * 
    */
    public List<String> getLicenseCodes() {
        return this.licenseCodes;
    }
    /**
     * A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image).
     * 
    */
    public List<String> getLicenses() {
        return this.licenses;
    }
    /**
     * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
    */
    public String getLocationHint() {
        return this.locationHint;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
    */
    public CustomerEncryptionKeyResponse getSnapshotEncryptionKey() {
        return this.snapshotEncryptionKey;
    }
    /**
     * The source disk used to create this snapshot.
     * 
    */
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
    */
    public CustomerEncryptionKeyResponse getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey;
    }
    /**
     * The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given disk name.
     * 
    */
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion.
     * 
    */
    public String getStorageBytes() {
        return this.storageBytes;
    }
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
    */
    public String getStorageBytesStatus() {
        return this.storageBytesStatus;
    }
    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
    */
    public List<String> getStorageLocations() {
        return this.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreated;
        private String chainName;
        private String creationTimestamp;
        private String description;
        private String diskSizeGb;
        private String downloadBytes;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private List<String> licenseCodes;
        private List<String> licenses;
        private String locationHint;
        private String name;
        private Boolean satisfiesPzs;
        private String selfLink;
        private CustomerEncryptionKeyResponse snapshotEncryptionKey;
        private String sourceDisk;
        private CustomerEncryptionKeyResponse sourceDiskEncryptionKey;
        private String sourceDiskId;
        private String status;
        private String storageBytes;
        private String storageBytesStatus;
        private List<String> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreated = defaults.autoCreated;
    	      this.chainName = defaults.chainName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.downloadBytes = defaults.downloadBytes;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locationHint = defaults.locationHint;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.snapshotEncryptionKey = defaults.snapshotEncryptionKey;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.status = defaults.status;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder setAutoCreated(Boolean autoCreated) {
            this.autoCreated = Objects.requireNonNull(autoCreated);
            return this;
        }

        public Builder setChainName(String chainName) {
            this.chainName = Objects.requireNonNull(chainName);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDownloadBytes(String downloadBytes) {
            this.downloadBytes = Objects.requireNonNull(downloadBytes);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLicenseCodes(List<String> licenseCodes) {
            this.licenseCodes = Objects.requireNonNull(licenseCodes);
            return this;
        }

        public Builder setLicenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder setLocationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSnapshotEncryptionKey(CustomerEncryptionKeyResponse snapshotEncryptionKey) {
            this.snapshotEncryptionKey = Objects.requireNonNull(snapshotEncryptionKey);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }

        public Builder setSourceDiskEncryptionKey(CustomerEncryptionKeyResponse sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Objects.requireNonNull(sourceDiskEncryptionKey);
            return this;
        }

        public Builder setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }

        public Builder setStorageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }

        public Builder setStorageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }
        public GetSnapshotResult build() {
            return new GetSnapshotResult(autoCreated, chainName, creationTimestamp, description, diskSizeGb, downloadBytes, kind, labelFingerprint, labels, licenseCodes, licenses, locationHint, name, satisfiesPzs, selfLink, snapshotEncryptionKey, sourceDisk, sourceDiskEncryptionKey, sourceDiskId, status, storageBytes, storageBytesStatus, storageLocations);
        }
    }
}
