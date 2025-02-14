// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import com.pulumi.azurenative.recoveryservices.inputs.DPMContainerExtendedInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureBackupServer (DPMVenus) workload-specific protection container.
 * 
 */
public final class AzureBackupServerContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBackupServerContainerArgs Empty = new AzureBackupServerContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    /**
     * @return Type of backup management for the container.
     * 
     */
    public Optional<Output<Either<String,BackupManagementType>>> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    @Import(name="canReRegister")
    private @Nullable Output<Boolean> canReRegister;

    /**
     * @return Specifies whether the container is re-registrable.
     * 
     */
    public Optional<Output<Boolean>> canReRegister() {
        return Optional.ofNullable(this.canReRegister);
    }

    /**
     * ID of container.
     * 
     */
    @Import(name="containerId")
    private @Nullable Output<String> containerId;

    /**
     * @return ID of container.
     * 
     */
    public Optional<Output<String>> containerId() {
        return Optional.ofNullable(this.containerId);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;AzureBackupServerContainer&#39;.
     * 
     */
    @Import(name="containerType", required=true)
    private Output<String> containerType;

    /**
     * @return Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;AzureBackupServerContainer&#39;.
     * 
     */
    public Output<String> containerType() {
        return this.containerType;
    }

    /**
     * Backup engine Agent version
     * 
     */
    @Import(name="dpmAgentVersion")
    private @Nullable Output<String> dpmAgentVersion;

    /**
     * @return Backup engine Agent version
     * 
     */
    public Optional<Output<String>> dpmAgentVersion() {
        return Optional.ofNullable(this.dpmAgentVersion);
    }

    /**
     * List of BackupEngines protecting the container
     * 
     */
    @Import(name="dpmServers")
    private @Nullable Output<List<String>> dpmServers;

    /**
     * @return List of BackupEngines protecting the container
     * 
     */
    public Optional<Output<List<String>>> dpmServers() {
        return Optional.ofNullable(this.dpmServers);
    }

    /**
     * Extended Info of the container.
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable Output<DPMContainerExtendedInfoArgs> extendedInfo;

    /**
     * @return Extended Info of the container.
     * 
     */
    public Optional<Output<DPMContainerExtendedInfoArgs>> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Friendly name of the container.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
    private @Nullable Output<String> healthStatus;

    /**
     * @return Status of health of the container.
     * 
     */
    public Optional<Output<String>> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }

    /**
     * Number of protected items in the BackupEngine
     * 
     */
    @Import(name="protectedItemCount")
    private @Nullable Output<Double> protectedItemCount;

    /**
     * @return Number of protected items in the BackupEngine
     * 
     */
    public Optional<Output<Double>> protectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }

    /**
     * Protection status of the container.
     * 
     */
    @Import(name="protectionStatus")
    private @Nullable Output<String> protectionStatus;

    /**
     * @return Protection status of the container.
     * 
     */
    public Optional<Output<String>> protectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
    private @Nullable Output<String> registrationStatus;

    /**
     * @return Status of registration of the container with the Recovery Services Vault.
     * 
     */
    public Optional<Output<String>> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    /**
     * To check if upgrade available
     * 
     */
    @Import(name="upgradeAvailable")
    private @Nullable Output<Boolean> upgradeAvailable;

    /**
     * @return To check if upgrade available
     * 
     */
    public Optional<Output<Boolean>> upgradeAvailable() {
        return Optional.ofNullable(this.upgradeAvailable);
    }

    private AzureBackupServerContainerArgs() {}

    private AzureBackupServerContainerArgs(AzureBackupServerContainerArgs $) {
        this.backupManagementType = $.backupManagementType;
        this.canReRegister = $.canReRegister;
        this.containerId = $.containerId;
        this.containerType = $.containerType;
        this.dpmAgentVersion = $.dpmAgentVersion;
        this.dpmServers = $.dpmServers;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.healthStatus = $.healthStatus;
        this.protectedItemCount = $.protectedItemCount;
        this.protectionStatus = $.protectionStatus;
        this.registrationStatus = $.registrationStatus;
        this.upgradeAvailable = $.upgradeAvailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBackupServerContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBackupServerContainerArgs $;

        public Builder() {
            $ = new AzureBackupServerContainerArgs();
        }

        public Builder(AzureBackupServerContainerArgs defaults) {
            $ = new AzureBackupServerContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(Either<String,BackupManagementType> backupManagementType) {
            return backupManagementType(Output.of(backupManagementType));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(String backupManagementType) {
            return backupManagementType(Either.ofLeft(backupManagementType));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(BackupManagementType backupManagementType) {
            return backupManagementType(Either.ofRight(backupManagementType));
        }

        /**
         * @param canReRegister Specifies whether the container is re-registrable.
         * 
         * @return builder
         * 
         */
        public Builder canReRegister(@Nullable Output<Boolean> canReRegister) {
            $.canReRegister = canReRegister;
            return this;
        }

        /**
         * @param canReRegister Specifies whether the container is re-registrable.
         * 
         * @return builder
         * 
         */
        public Builder canReRegister(Boolean canReRegister) {
            return canReRegister(Output.of(canReRegister));
        }

        /**
         * @param containerId ID of container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(@Nullable Output<String> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId ID of container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(String containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param containerType Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
         * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
         * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
         * Backup is VMAppContainer
         * Expected value is &#39;AzureBackupServerContainer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder containerType(Output<String> containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param containerType Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
         * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
         * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
         * Backup is VMAppContainer
         * Expected value is &#39;AzureBackupServerContainer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder containerType(String containerType) {
            return containerType(Output.of(containerType));
        }

        /**
         * @param dpmAgentVersion Backup engine Agent version
         * 
         * @return builder
         * 
         */
        public Builder dpmAgentVersion(@Nullable Output<String> dpmAgentVersion) {
            $.dpmAgentVersion = dpmAgentVersion;
            return this;
        }

        /**
         * @param dpmAgentVersion Backup engine Agent version
         * 
         * @return builder
         * 
         */
        public Builder dpmAgentVersion(String dpmAgentVersion) {
            return dpmAgentVersion(Output.of(dpmAgentVersion));
        }

        /**
         * @param dpmServers List of BackupEngines protecting the container
         * 
         * @return builder
         * 
         */
        public Builder dpmServers(@Nullable Output<List<String>> dpmServers) {
            $.dpmServers = dpmServers;
            return this;
        }

        /**
         * @param dpmServers List of BackupEngines protecting the container
         * 
         * @return builder
         * 
         */
        public Builder dpmServers(List<String> dpmServers) {
            return dpmServers(Output.of(dpmServers));
        }

        /**
         * @param dpmServers List of BackupEngines protecting the container
         * 
         * @return builder
         * 
         */
        public Builder dpmServers(String... dpmServers) {
            return dpmServers(List.of(dpmServers));
        }

        /**
         * @param extendedInfo Extended Info of the container.
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(@Nullable Output<DPMContainerExtendedInfoArgs> extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        /**
         * @param extendedInfo Extended Info of the container.
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(DPMContainerExtendedInfoArgs extendedInfo) {
            return extendedInfo(Output.of(extendedInfo));
        }

        /**
         * @param friendlyName Friendly name of the container.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Friendly name of the container.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param healthStatus Status of health of the container.
         * 
         * @return builder
         * 
         */
        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            $.healthStatus = healthStatus;
            return this;
        }

        /**
         * @param healthStatus Status of health of the container.
         * 
         * @return builder
         * 
         */
        public Builder healthStatus(String healthStatus) {
            return healthStatus(Output.of(healthStatus));
        }

        /**
         * @param protectedItemCount Number of protected items in the BackupEngine
         * 
         * @return builder
         * 
         */
        public Builder protectedItemCount(@Nullable Output<Double> protectedItemCount) {
            $.protectedItemCount = protectedItemCount;
            return this;
        }

        /**
         * @param protectedItemCount Number of protected items in the BackupEngine
         * 
         * @return builder
         * 
         */
        public Builder protectedItemCount(Double protectedItemCount) {
            return protectedItemCount(Output.of(protectedItemCount));
        }

        /**
         * @param protectionStatus Protection status of the container.
         * 
         * @return builder
         * 
         */
        public Builder protectionStatus(@Nullable Output<String> protectionStatus) {
            $.protectionStatus = protectionStatus;
            return this;
        }

        /**
         * @param protectionStatus Protection status of the container.
         * 
         * @return builder
         * 
         */
        public Builder protectionStatus(String protectionStatus) {
            return protectionStatus(Output.of(protectionStatus));
        }

        /**
         * @param registrationStatus Status of registration of the container with the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            $.registrationStatus = registrationStatus;
            return this;
        }

        /**
         * @param registrationStatus Status of registration of the container with the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder registrationStatus(String registrationStatus) {
            return registrationStatus(Output.of(registrationStatus));
        }

        /**
         * @param upgradeAvailable To check if upgrade available
         * 
         * @return builder
         * 
         */
        public Builder upgradeAvailable(@Nullable Output<Boolean> upgradeAvailable) {
            $.upgradeAvailable = upgradeAvailable;
            return this;
        }

        /**
         * @param upgradeAvailable To check if upgrade available
         * 
         * @return builder
         * 
         */
        public Builder upgradeAvailable(Boolean upgradeAvailable) {
            return upgradeAvailable(Output.of(upgradeAvailable));
        }

        public AzureBackupServerContainerArgs build() {
            $.containerType = Codegen.stringProp("containerType").output().arg($.containerType).require();
            return $;
        }
    }

}
