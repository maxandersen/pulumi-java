// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt protected disk details.
 * 
 */
public final class VMwareCbtProtectedDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMwareCbtProtectedDiskDetailsResponse Empty = new VMwareCbtProtectedDiskDetailsResponse();

    /**
     * The disk capacity in bytes.
     * 
     */
    @Import(name="capacityInBytes", required=true)
      private final Double capacityInBytes;

    public Double capacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * The disk id.
     * 
     */
    @Import(name="diskId", required=true)
      private final String diskId;

    public String diskId() {
        return this.diskId;
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="diskName", required=true)
      private final String diskName;

    public String diskName() {
        return this.diskName;
    }

    /**
     * The disk path.
     * 
     */
    @Import(name="diskPath", required=true)
      private final String diskPath;

    public String diskPath() {
        return this.diskPath;
    }

    /**
     * The disk type.
     * 
     */
    @Import(name="diskType")
      private final @Nullable String diskType;

    public Optional<String> diskType() {
        return this.diskType == null ? Optional.empty() : Optional.ofNullable(this.diskType);
    }

    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    @Import(name="isOSDisk", required=true)
      private final String isOSDisk;

    public String isOSDisk() {
        return this.isOSDisk;
    }

    /**
     * The log storage account ARM Id.
     * 
     */
    @Import(name="logStorageAccountId", required=true)
      private final String logStorageAccountId;

    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * The key vault secret name of the log storage account.
     * 
     */
    @Import(name="logStorageAccountSasSecretName", required=true)
      private final String logStorageAccountSasSecretName;

    public String logStorageAccountSasSecretName() {
        return this.logStorageAccountSasSecretName;
    }

    /**
     * The ARM Id of the seed managed disk.
     * 
     */
    @Import(name="seedManagedDiskId", required=true)
      private final String seedManagedDiskId;

    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * The ARM Id of the target managed disk.
     * 
     */
    @Import(name="targetManagedDiskId", required=true)
      private final String targetManagedDiskId;

    public String targetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    public VMwareCbtProtectedDiskDetailsResponse(
        Double capacityInBytes,
        String diskId,
        String diskName,
        String diskPath,
        @Nullable String diskType,
        String isOSDisk,
        String logStorageAccountId,
        String logStorageAccountSasSecretName,
        String seedManagedDiskId,
        String targetManagedDiskId) {
        this.capacityInBytes = Objects.requireNonNull(capacityInBytes, "expected parameter 'capacityInBytes' to be non-null");
        this.diskId = Objects.requireNonNull(diskId, "expected parameter 'diskId' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskPath = Objects.requireNonNull(diskPath, "expected parameter 'diskPath' to be non-null");
        this.diskType = diskType;
        this.isOSDisk = Objects.requireNonNull(isOSDisk, "expected parameter 'isOSDisk' to be non-null");
        this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId, "expected parameter 'logStorageAccountId' to be non-null");
        this.logStorageAccountSasSecretName = Objects.requireNonNull(logStorageAccountSasSecretName, "expected parameter 'logStorageAccountSasSecretName' to be non-null");
        this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId, "expected parameter 'seedManagedDiskId' to be non-null");
        this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId, "expected parameter 'targetManagedDiskId' to be non-null");
    }

    private VMwareCbtProtectedDiskDetailsResponse() {
        this.capacityInBytes = null;
        this.diskId = null;
        this.diskName = null;
        this.diskPath = null;
        this.diskType = null;
        this.isOSDisk = null;
        this.logStorageAccountId = null;
        this.logStorageAccountSasSecretName = null;
        this.seedManagedDiskId = null;
        this.targetManagedDiskId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double capacityInBytes;
        private String diskId;
        private String diskName;
        private String diskPath;
        private @Nullable String diskType;
        private String isOSDisk;
        private String logStorageAccountId;
        private String logStorageAccountSasSecretName;
        private String seedManagedDiskId;
        private String targetManagedDiskId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtProtectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.diskPath = defaults.diskPath;
    	      this.diskType = defaults.diskType;
    	      this.isOSDisk = defaults.isOSDisk;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
    	      this.logStorageAccountSasSecretName = defaults.logStorageAccountSasSecretName;
    	      this.seedManagedDiskId = defaults.seedManagedDiskId;
    	      this.targetManagedDiskId = defaults.targetManagedDiskId;
        }

        public Builder capacityInBytes(Double capacityInBytes) {
            this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
            return this;
        }
        public Builder diskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }
        public Builder diskPath(String diskPath) {
            this.diskPath = Objects.requireNonNull(diskPath);
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder isOSDisk(String isOSDisk) {
            this.isOSDisk = Objects.requireNonNull(isOSDisk);
            return this;
        }
        public Builder logStorageAccountId(String logStorageAccountId) {
            this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId);
            return this;
        }
        public Builder logStorageAccountSasSecretName(String logStorageAccountSasSecretName) {
            this.logStorageAccountSasSecretName = Objects.requireNonNull(logStorageAccountSasSecretName);
            return this;
        }
        public Builder seedManagedDiskId(String seedManagedDiskId) {
            this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId);
            return this;
        }
        public Builder targetManagedDiskId(String targetManagedDiskId) {
            this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId);
            return this;
        }        public VMwareCbtProtectedDiskDetailsResponse build() {
            return new VMwareCbtProtectedDiskDetailsResponse(capacityInBytes, diskId, diskName, diskPath, diskType, isOSDisk, logStorageAccountId, logStorageAccountSasSecretName, seedManagedDiskId, targetManagedDiskId);
        }
    }
}
