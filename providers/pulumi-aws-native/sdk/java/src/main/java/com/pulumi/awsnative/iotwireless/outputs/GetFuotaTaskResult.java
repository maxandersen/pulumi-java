// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.outputs;

import com.pulumi.awsnative.iotwireless.outputs.FuotaTaskLoRaWAN;
import com.pulumi.awsnative.iotwireless.outputs.FuotaTaskTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFuotaTaskResult {
    /**
     * @return FUOTA task arn. Returned after successful create.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return Multicast group to associate. Only for update request.
     * 
     */
    private final @Nullable String associateMulticastGroup;
    /**
     * @return Wireless device to associate. Only for update request.
     * 
     */
    private final @Nullable String associateWirelessDevice;
    /**
     * @return FUOTA task description
     * 
     */
    private final @Nullable String description;
    /**
     * @return Multicast group to disassociate. Only for update request.
     * 
     */
    private final @Nullable String disassociateMulticastGroup;
    /**
     * @return Wireless device to disassociate. Only for update request.
     * 
     */
    private final @Nullable String disassociateWirelessDevice;
    /**
     * @return FUOTA task firmware update image binary S3 link
     * 
     */
    private final @Nullable String firmwareUpdateImage;
    /**
     * @return FUOTA task firmware IAM role for reading S3
     * 
     */
    private final @Nullable String firmwareUpdateRole;
    /**
     * @return FUOTA task status. Returned after successful read.
     * 
     */
    private final @Nullable String fuotaTaskStatus;
    /**
     * @return FUOTA task id. Returned after successful create.
     * 
     */
    private final @Nullable String id;
    /**
     * @return FUOTA task LoRaWAN
     * 
     */
    private final @Nullable FuotaTaskLoRaWAN loRaWAN;
    /**
     * @return Name of FUOTA task
     * 
     */
    private final @Nullable String name;
    /**
     * @return A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    private final @Nullable List<FuotaTaskTag> tags;

    @CustomType.Constructor
    private GetFuotaTaskResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("associateMulticastGroup") @Nullable String associateMulticastGroup,
        @CustomType.Parameter("associateWirelessDevice") @Nullable String associateWirelessDevice,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("disassociateMulticastGroup") @Nullable String disassociateMulticastGroup,
        @CustomType.Parameter("disassociateWirelessDevice") @Nullable String disassociateWirelessDevice,
        @CustomType.Parameter("firmwareUpdateImage") @Nullable String firmwareUpdateImage,
        @CustomType.Parameter("firmwareUpdateRole") @Nullable String firmwareUpdateRole,
        @CustomType.Parameter("fuotaTaskStatus") @Nullable String fuotaTaskStatus,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("loRaWAN") @Nullable FuotaTaskLoRaWAN loRaWAN,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<FuotaTaskTag> tags) {
        this.arn = arn;
        this.associateMulticastGroup = associateMulticastGroup;
        this.associateWirelessDevice = associateWirelessDevice;
        this.description = description;
        this.disassociateMulticastGroup = disassociateMulticastGroup;
        this.disassociateWirelessDevice = disassociateWirelessDevice;
        this.firmwareUpdateImage = firmwareUpdateImage;
        this.firmwareUpdateRole = firmwareUpdateRole;
        this.fuotaTaskStatus = fuotaTaskStatus;
        this.id = id;
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
    }

    /**
     * @return FUOTA task arn. Returned after successful create.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Multicast group to associate. Only for update request.
     * 
     */
    public Optional<String> associateMulticastGroup() {
        return Optional.ofNullable(this.associateMulticastGroup);
    }
    /**
     * @return Wireless device to associate. Only for update request.
     * 
     */
    public Optional<String> associateWirelessDevice() {
        return Optional.ofNullable(this.associateWirelessDevice);
    }
    /**
     * @return FUOTA task description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Multicast group to disassociate. Only for update request.
     * 
     */
    public Optional<String> disassociateMulticastGroup() {
        return Optional.ofNullable(this.disassociateMulticastGroup);
    }
    /**
     * @return Wireless device to disassociate. Only for update request.
     * 
     */
    public Optional<String> disassociateWirelessDevice() {
        return Optional.ofNullable(this.disassociateWirelessDevice);
    }
    /**
     * @return FUOTA task firmware update image binary S3 link
     * 
     */
    public Optional<String> firmwareUpdateImage() {
        return Optional.ofNullable(this.firmwareUpdateImage);
    }
    /**
     * @return FUOTA task firmware IAM role for reading S3
     * 
     */
    public Optional<String> firmwareUpdateRole() {
        return Optional.ofNullable(this.firmwareUpdateRole);
    }
    /**
     * @return FUOTA task status. Returned after successful read.
     * 
     */
    public Optional<String> fuotaTaskStatus() {
        return Optional.ofNullable(this.fuotaTaskStatus);
    }
    /**
     * @return FUOTA task id. Returned after successful create.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return FUOTA task LoRaWAN
     * 
     */
    public Optional<FuotaTaskLoRaWAN> loRaWAN() {
        return Optional.ofNullable(this.loRaWAN);
    }
    /**
     * @return Name of FUOTA task
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A list of key-value pairs that contain metadata for the FUOTA task.
     * 
     */
    public List<FuotaTaskTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFuotaTaskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String associateMulticastGroup;
        private @Nullable String associateWirelessDevice;
        private @Nullable String description;
        private @Nullable String disassociateMulticastGroup;
        private @Nullable String disassociateWirelessDevice;
        private @Nullable String firmwareUpdateImage;
        private @Nullable String firmwareUpdateRole;
        private @Nullable String fuotaTaskStatus;
        private @Nullable String id;
        private @Nullable FuotaTaskLoRaWAN loRaWAN;
        private @Nullable String name;
        private @Nullable List<FuotaTaskTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFuotaTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associateMulticastGroup = defaults.associateMulticastGroup;
    	      this.associateWirelessDevice = defaults.associateWirelessDevice;
    	      this.description = defaults.description;
    	      this.disassociateMulticastGroup = defaults.disassociateMulticastGroup;
    	      this.disassociateWirelessDevice = defaults.disassociateWirelessDevice;
    	      this.firmwareUpdateImage = defaults.firmwareUpdateImage;
    	      this.firmwareUpdateRole = defaults.firmwareUpdateRole;
    	      this.fuotaTaskStatus = defaults.fuotaTaskStatus;
    	      this.id = defaults.id;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder associateMulticastGroup(@Nullable String associateMulticastGroup) {
            this.associateMulticastGroup = associateMulticastGroup;
            return this;
        }
        public Builder associateWirelessDevice(@Nullable String associateWirelessDevice) {
            this.associateWirelessDevice = associateWirelessDevice;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder disassociateMulticastGroup(@Nullable String disassociateMulticastGroup) {
            this.disassociateMulticastGroup = disassociateMulticastGroup;
            return this;
        }
        public Builder disassociateWirelessDevice(@Nullable String disassociateWirelessDevice) {
            this.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }
        public Builder firmwareUpdateImage(@Nullable String firmwareUpdateImage) {
            this.firmwareUpdateImage = firmwareUpdateImage;
            return this;
        }
        public Builder firmwareUpdateRole(@Nullable String firmwareUpdateRole) {
            this.firmwareUpdateRole = firmwareUpdateRole;
            return this;
        }
        public Builder fuotaTaskStatus(@Nullable String fuotaTaskStatus) {
            this.fuotaTaskStatus = fuotaTaskStatus;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder loRaWAN(@Nullable FuotaTaskLoRaWAN loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable List<FuotaTaskTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(FuotaTaskTag... tags) {
            return tags(List.of(tags));
        }        public GetFuotaTaskResult build() {
            return new GetFuotaTaskResult(arn, associateMulticastGroup, associateWirelessDevice, description, disassociateMulticastGroup, disassociateWirelessDevice, firmwareUpdateImage, firmwareUpdateRole, fuotaTaskStatus, id, loRaWAN, name, tags);
        }
    }
}
