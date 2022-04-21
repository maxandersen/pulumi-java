// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.inputs.ArtifactInstallPropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.BulkCreationParametersArgs;
import com.pulumi.azurenative.devtestlab.inputs.DataDiskPropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.GalleryImageReferenceArgs;
import com.pulumi.azurenative.devtestlab.inputs.NetworkInterfacePropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.ScheduleCreationParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for creating a virtual machine.
 * 
 */
public final class LabVirtualMachineCreationParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabVirtualMachineCreationParameterArgs Empty = new LabVirtualMachineCreationParameterArgs();

    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    @Import(name="allowClaim")
    private @Nullable Output<Boolean> allowClaim;

    public Optional<Output<Boolean>> allowClaim() {
        return Optional.ofNullable(this.allowClaim);
    }

    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts;

    public Optional<Output<List<ArtifactInstallPropertiesArgs>>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * The number of virtual machine instances to create.
     * 
     */
    @Import(name="bulkCreationParameters")
    private @Nullable Output<BulkCreationParametersArgs> bulkCreationParameters;

    public Optional<Output<BulkCreationParametersArgs>> bulkCreationParameters() {
        return Optional.ofNullable(this.bulkCreationParameters);
    }

    /**
     * The creation date of the virtual machine.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    @Import(name="customImageId")
    private @Nullable Output<String> customImageId;

    public Optional<Output<String>> customImageId() {
        return Optional.ofNullable(this.customImageId);
    }

    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    @Import(name="dataDiskParameters")
    private @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters;

    public Optional<Output<List<DataDiskPropertiesArgs>>> dataDiskParameters() {
        return Optional.ofNullable(this.dataDiskParameters);
    }

    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    @Import(name="disallowPublicIpAddress")
    private @Nullable Output<Boolean> disallowPublicIpAddress;

    public Optional<Output<Boolean>> disallowPublicIpAddress() {
        return Optional.ofNullable(this.disallowPublicIpAddress);
    }

    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The expiration date for VM.
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    @Import(name="galleryImageReference")
    private @Nullable Output<GalleryImageReferenceArgs> galleryImageReference;

    public Optional<Output<GalleryImageReferenceArgs>> galleryImageReference() {
        return Optional.ofNullable(this.galleryImageReference);
    }

    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    @Import(name="isAuthenticationWithSshKey")
    private @Nullable Output<Boolean> isAuthenticationWithSshKey;

    public Optional<Output<Boolean>> isAuthenticationWithSshKey() {
        return Optional.ofNullable(this.isAuthenticationWithSshKey);
    }

    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    @Import(name="labSubnetName")
    private @Nullable Output<String> labSubnetName;

    public Optional<Output<String>> labSubnetName() {
        return Optional.ofNullable(this.labSubnetName);
    }

    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    @Import(name="labVirtualNetworkId")
    private @Nullable Output<String> labVirtualNetworkId;

    public Optional<Output<String>> labVirtualNetworkId() {
        return Optional.ofNullable(this.labVirtualNetworkId);
    }

    /**
     * The location of the new virtual machine or environment
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network interface properties.
     * 
     */
    @Import(name="networkInterface")
    private @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface;

    public Optional<Output<NetworkInterfacePropertiesArgs>> networkInterface() {
        return Optional.ofNullable(this.networkInterface);
    }

    /**
     * The notes of the virtual machine.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    @Import(name="ownerObjectId")
    private @Nullable Output<String> ownerObjectId;

    public Optional<Output<String>> ownerObjectId() {
        return Optional.ofNullable(this.ownerObjectId);
    }

    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    @Import(name="ownerUserPrincipalName")
    private @Nullable Output<String> ownerUserPrincipalName;

    public Optional<Output<String>> ownerUserPrincipalName() {
        return Optional.ofNullable(this.ownerUserPrincipalName);
    }

    /**
     * The password of the virtual machine administrator.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * Virtual Machine schedules to be created
     * 
     */
    @Import(name="scheduleParameters")
    private @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters;

    public Optional<Output<List<ScheduleCreationParameterArgs>>> scheduleParameters() {
        return Optional.ofNullable(this.scheduleParameters);
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    @Import(name="sshKey")
    private @Nullable Output<String> sshKey;

    public Optional<Output<String>> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }

    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The user name of the virtual machine.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private LabVirtualMachineCreationParameterArgs() {}

    private LabVirtualMachineCreationParameterArgs(LabVirtualMachineCreationParameterArgs $) {
        this.allowClaim = $.allowClaim;
        this.artifacts = $.artifacts;
        this.bulkCreationParameters = $.bulkCreationParameters;
        this.createdDate = $.createdDate;
        this.customImageId = $.customImageId;
        this.dataDiskParameters = $.dataDiskParameters;
        this.disallowPublicIpAddress = $.disallowPublicIpAddress;
        this.environmentId = $.environmentId;
        this.expirationDate = $.expirationDate;
        this.galleryImageReference = $.galleryImageReference;
        this.isAuthenticationWithSshKey = $.isAuthenticationWithSshKey;
        this.labSubnetName = $.labSubnetName;
        this.labVirtualNetworkId = $.labVirtualNetworkId;
        this.location = $.location;
        this.name = $.name;
        this.networkInterface = $.networkInterface;
        this.notes = $.notes;
        this.ownerObjectId = $.ownerObjectId;
        this.ownerUserPrincipalName = $.ownerUserPrincipalName;
        this.password = $.password;
        this.planId = $.planId;
        this.scheduleParameters = $.scheduleParameters;
        this.size = $.size;
        this.sshKey = $.sshKey;
        this.storageType = $.storageType;
        this.tags = $.tags;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabVirtualMachineCreationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabVirtualMachineCreationParameterArgs $;

        public Builder() {
            $ = new LabVirtualMachineCreationParameterArgs();
        }

        public Builder(LabVirtualMachineCreationParameterArgs defaults) {
            $ = new LabVirtualMachineCreationParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowClaim(@Nullable Output<Boolean> allowClaim) {
            $.allowClaim = allowClaim;
            return this;
        }

        public Builder allowClaim(Boolean allowClaim) {
            return allowClaim(Output.of(allowClaim));
        }

        public Builder artifacts(@Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(List<ArtifactInstallPropertiesArgs> artifacts) {
            return artifacts(Output.of(artifacts));
        }

        public Builder artifacts(ArtifactInstallPropertiesArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }

        public Builder bulkCreationParameters(@Nullable Output<BulkCreationParametersArgs> bulkCreationParameters) {
            $.bulkCreationParameters = bulkCreationParameters;
            return this;
        }

        public Builder bulkCreationParameters(BulkCreationParametersArgs bulkCreationParameters) {
            return bulkCreationParameters(Output.of(bulkCreationParameters));
        }

        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        public Builder customImageId(@Nullable Output<String> customImageId) {
            $.customImageId = customImageId;
            return this;
        }

        public Builder customImageId(String customImageId) {
            return customImageId(Output.of(customImageId));
        }

        public Builder dataDiskParameters(@Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters) {
            $.dataDiskParameters = dataDiskParameters;
            return this;
        }

        public Builder dataDiskParameters(List<DataDiskPropertiesArgs> dataDiskParameters) {
            return dataDiskParameters(Output.of(dataDiskParameters));
        }

        public Builder dataDiskParameters(DataDiskPropertiesArgs... dataDiskParameters) {
            return dataDiskParameters(List.of(dataDiskParameters));
        }

        public Builder disallowPublicIpAddress(@Nullable Output<Boolean> disallowPublicIpAddress) {
            $.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }

        public Builder disallowPublicIpAddress(Boolean disallowPublicIpAddress) {
            return disallowPublicIpAddress(Output.of(disallowPublicIpAddress));
        }

        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        public Builder galleryImageReference(@Nullable Output<GalleryImageReferenceArgs> galleryImageReference) {
            $.galleryImageReference = galleryImageReference;
            return this;
        }

        public Builder galleryImageReference(GalleryImageReferenceArgs galleryImageReference) {
            return galleryImageReference(Output.of(galleryImageReference));
        }

        public Builder isAuthenticationWithSshKey(@Nullable Output<Boolean> isAuthenticationWithSshKey) {
            $.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }

        public Builder isAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey) {
            return isAuthenticationWithSshKey(Output.of(isAuthenticationWithSshKey));
        }

        public Builder labSubnetName(@Nullable Output<String> labSubnetName) {
            $.labSubnetName = labSubnetName;
            return this;
        }

        public Builder labSubnetName(String labSubnetName) {
            return labSubnetName(Output.of(labSubnetName));
        }

        public Builder labVirtualNetworkId(@Nullable Output<String> labVirtualNetworkId) {
            $.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }

        public Builder labVirtualNetworkId(String labVirtualNetworkId) {
            return labVirtualNetworkId(Output.of(labVirtualNetworkId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networkInterface(@Nullable Output<NetworkInterfacePropertiesArgs> networkInterface) {
            $.networkInterface = networkInterface;
            return this;
        }

        public Builder networkInterface(NetworkInterfacePropertiesArgs networkInterface) {
            return networkInterface(Output.of(networkInterface));
        }

        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public Builder ownerObjectId(@Nullable Output<String> ownerObjectId) {
            $.ownerObjectId = ownerObjectId;
            return this;
        }

        public Builder ownerObjectId(String ownerObjectId) {
            return ownerObjectId(Output.of(ownerObjectId));
        }

        public Builder ownerUserPrincipalName(@Nullable Output<String> ownerUserPrincipalName) {
            $.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }

        public Builder ownerUserPrincipalName(String ownerUserPrincipalName) {
            return ownerUserPrincipalName(Output.of(ownerUserPrincipalName));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        public Builder scheduleParameters(@Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters) {
            $.scheduleParameters = scheduleParameters;
            return this;
        }

        public Builder scheduleParameters(List<ScheduleCreationParameterArgs> scheduleParameters) {
            return scheduleParameters(Output.of(scheduleParameters));
        }

        public Builder scheduleParameters(ScheduleCreationParameterArgs... scheduleParameters) {
            return scheduleParameters(List.of(scheduleParameters));
        }

        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        public Builder size(String size) {
            return size(Output.of(size));
        }

        public Builder sshKey(@Nullable Output<String> sshKey) {
            $.sshKey = sshKey;
            return this;
        }

        public Builder sshKey(String sshKey) {
            return sshKey(Output.of(sshKey));
        }

        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public LabVirtualMachineCreationParameterArgs build() {
            $.allowClaim = Codegen.booleanProp("allowClaim").output().arg($.allowClaim).def(false).getNullable();
            $.disallowPublicIpAddress = Codegen.booleanProp("disallowPublicIpAddress").output().arg($.disallowPublicIpAddress).def(false).getNullable();
            $.ownerObjectId = Codegen.stringProp("ownerObjectId").output().arg($.ownerObjectId).def("dynamicValue").getNullable();
            $.storageType = Codegen.stringProp("storageType").output().arg($.storageType).def("labStorageType").getNullable();
            return $;
        }
    }

}
