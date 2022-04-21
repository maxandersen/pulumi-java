// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt protected disk details.
 * 
 */
public final class VMwareCbtProtectedDiskDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VMwareCbtProtectedDiskDetailsResponse Empty = new VMwareCbtProtectedDiskDetailsResponse();

    /**
     * The disk capacity in bytes.
     * 
     */
    @Import(name="capacityInBytes", required=true)
    private Double capacityInBytes;

    public Double capacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * The disk id.
     * 
     */
    @Import(name="diskId", required=true)
    private String diskId;

    public String diskId() {
        return this.diskId;
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="diskName", required=true)
    private String diskName;

    public String diskName() {
        return this.diskName;
    }

    /**
     * The disk path.
     * 
     */
    @Import(name="diskPath", required=true)
    private String diskPath;

    public String diskPath() {
        return this.diskPath;
    }

    /**
     * The disk type.
     * 
     */
    @Import(name="diskType")
    private @Nullable String diskType;

    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    @Import(name="isOSDisk", required=true)
    private String isOSDisk;

    public String isOSDisk() {
        return this.isOSDisk;
    }

    /**
     * The log storage account ARM Id.
     * 
     */
    @Import(name="logStorageAccountId", required=true)
    private String logStorageAccountId;

    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * The key vault secret name of the log storage account.
     * 
     */
    @Import(name="logStorageAccountSasSecretName", required=true)
    private String logStorageAccountSasSecretName;

    public String logStorageAccountSasSecretName() {
        return this.logStorageAccountSasSecretName;
    }

    /**
     * The ARM Id of the seed managed disk.
     * 
     */
    @Import(name="seedManagedDiskId", required=true)
    private String seedManagedDiskId;

    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * The ARM Id of the target managed disk.
     * 
     */
    @Import(name="targetManagedDiskId", required=true)
    private String targetManagedDiskId;

    public String targetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    private VMwareCbtProtectedDiskDetailsResponse() {}

    private VMwareCbtProtectedDiskDetailsResponse(VMwareCbtProtectedDiskDetailsResponse $) {
        this.capacityInBytes = $.capacityInBytes;
        this.diskId = $.diskId;
        this.diskName = $.diskName;
        this.diskPath = $.diskPath;
        this.diskType = $.diskType;
        this.isOSDisk = $.isOSDisk;
        this.logStorageAccountId = $.logStorageAccountId;
        this.logStorageAccountSasSecretName = $.logStorageAccountSasSecretName;
        this.seedManagedDiskId = $.seedManagedDiskId;
        this.targetManagedDiskId = $.targetManagedDiskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareCbtProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareCbtProtectedDiskDetailsResponse $;

        public Builder() {
            $ = new VMwareCbtProtectedDiskDetailsResponse();
        }

        public Builder(VMwareCbtProtectedDiskDetailsResponse defaults) {
            $ = new VMwareCbtProtectedDiskDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder capacityInBytes(Double capacityInBytes) {
            $.capacityInBytes = capacityInBytes;
            return this;
        }

        public Builder diskId(String diskId) {
            $.diskId = diskId;
            return this;
        }

        public Builder diskName(String diskName) {
            $.diskName = diskName;
            return this;
        }

        public Builder diskPath(String diskPath) {
            $.diskPath = diskPath;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            $.diskType = diskType;
            return this;
        }

        public Builder isOSDisk(String isOSDisk) {
            $.isOSDisk = isOSDisk;
            return this;
        }

        public Builder logStorageAccountId(String logStorageAccountId) {
            $.logStorageAccountId = logStorageAccountId;
            return this;
        }

        public Builder logStorageAccountSasSecretName(String logStorageAccountSasSecretName) {
            $.logStorageAccountSasSecretName = logStorageAccountSasSecretName;
            return this;
        }

        public Builder seedManagedDiskId(String seedManagedDiskId) {
            $.seedManagedDiskId = seedManagedDiskId;
            return this;
        }

        public Builder targetManagedDiskId(String targetManagedDiskId) {
            $.targetManagedDiskId = targetManagedDiskId;
            return this;
        }

        public VMwareCbtProtectedDiskDetailsResponse build() {
            $.capacityInBytes = Objects.requireNonNull($.capacityInBytes, "expected parameter 'capacityInBytes' to be non-null");
            $.diskId = Objects.requireNonNull($.diskId, "expected parameter 'diskId' to be non-null");
            $.diskName = Objects.requireNonNull($.diskName, "expected parameter 'diskName' to be non-null");
            $.diskPath = Objects.requireNonNull($.diskPath, "expected parameter 'diskPath' to be non-null");
            $.isOSDisk = Objects.requireNonNull($.isOSDisk, "expected parameter 'isOSDisk' to be non-null");
            $.logStorageAccountId = Objects.requireNonNull($.logStorageAccountId, "expected parameter 'logStorageAccountId' to be non-null");
            $.logStorageAccountSasSecretName = Objects.requireNonNull($.logStorageAccountSasSecretName, "expected parameter 'logStorageAccountSasSecretName' to be non-null");
            $.seedManagedDiskId = Objects.requireNonNull($.seedManagedDiskId, "expected parameter 'seedManagedDiskId' to be non-null");
            $.targetManagedDiskId = Objects.requireNonNull($.targetManagedDiskId, "expected parameter 'targetManagedDiskId' to be non-null");
            return $;
        }
    }

}
