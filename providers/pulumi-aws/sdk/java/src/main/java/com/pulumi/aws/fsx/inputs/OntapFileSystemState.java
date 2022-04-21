// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationGetArgs;
import com.pulumi.aws.fsx.inputs.OntapFileSystemEndpointGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OntapFileSystemState extends com.pulumi.resources.ResourceArgs {

    public static final OntapFileSystemState Empty = new OntapFileSystemState();

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @Import(name="automaticBackupRetentionDays")
    private @Nullable Output<Integer> automaticBackupRetentionDays;

    public Optional<Output<Integer>> automaticBackupRetentionDays() {
        return Optional.ofNullable(this.automaticBackupRetentionDays);
    }

    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Import(name="dailyAutomaticBackupStartTime")
    private @Nullable Output<String> dailyAutomaticBackupStartTime;

    public Optional<Output<String>> dailyAutomaticBackupStartTime() {
        return Optional.ofNullable(this.dailyAutomaticBackupStartTime);
    }

    /**
     * - The filesystem deployment type. Only `MULTI_AZ_1` is supported.
     * 
     */
    @Import(name="deploymentType")
    private @Nullable Output<String> deploymentType;

    public Optional<Output<String>> deploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }

    /**
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
     * 
     */
    @Import(name="diskIopsConfiguration")
    private @Nullable Output<OntapFileSystemDiskIopsConfigurationGetArgs> diskIopsConfiguration;

    public Optional<Output<OntapFileSystemDiskIopsConfigurationGetArgs>> diskIopsConfiguration() {
        return Optional.ofNullable(this.diskIopsConfiguration);
    }

    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    @Import(name="endpointIpAddressRange")
    private @Nullable Output<String> endpointIpAddressRange;

    public Optional<Output<String>> endpointIpAddressRange() {
        return Optional.ofNullable(this.endpointIpAddressRange);
    }

    /**
     * The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<OntapFileSystemEndpointGetArgs>> endpoints;

    public Optional<Output<List<OntapFileSystemEndpointGetArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    @Import(name="fsxAdminPassword")
    private @Nullable Output<String> fsxAdminPassword;

    public Optional<Output<String>> fsxAdminPassword() {
        return Optional.ofNullable(this.fsxAdminPassword);
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    @Import(name="networkInterfaceIds")
    private @Nullable Output<List<String>> networkInterfaceIds;

    public Optional<Output<List<String>>> networkInterfaceIds() {
        return Optional.ofNullable(this.networkInterfaceIds);
    }

    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    @Import(name="preferredSubnetId")
    private @Nullable Output<String> preferredSubnetId;

    public Optional<Output<String>> preferredSubnetId() {
        return Optional.ofNullable(this.preferredSubnetId);
    }

    /**
     * Specifies the VPC route tables in which your file system&#39;s endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC&#39;s default route table.
     * 
     */
    @Import(name="routeTableIds")
    private @Nullable Output<List<String>> routeTableIds;

    public Optional<Output<List<String>>> routeTableIds() {
        return Optional.ofNullable(this.routeTableIds);
    }

    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    @Import(name="storageCapacity")
    private @Nullable Output<Integer> storageCapacity;

    public Optional<Output<Integer>> storageCapacity() {
        return Optional.ofNullable(this.storageCapacity);
    }

    /**
     * - The filesystem storage type. defaults to `SSD`.
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. Exactly 2 subnets need to be provided.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    @Import(name="throughputCapacity")
    private @Nullable Output<Integer> throughputCapacity;

    public Optional<Output<Integer>> throughputCapacity() {
        return Optional.ofNullable(this.throughputCapacity);
    }

    /**
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Import(name="weeklyMaintenanceStartTime")
    private @Nullable Output<String> weeklyMaintenanceStartTime;

    public Optional<Output<String>> weeklyMaintenanceStartTime() {
        return Optional.ofNullable(this.weeklyMaintenanceStartTime);
    }

    private OntapFileSystemState() {}

    private OntapFileSystemState(OntapFileSystemState $) {
        this.arn = $.arn;
        this.automaticBackupRetentionDays = $.automaticBackupRetentionDays;
        this.dailyAutomaticBackupStartTime = $.dailyAutomaticBackupStartTime;
        this.deploymentType = $.deploymentType;
        this.diskIopsConfiguration = $.diskIopsConfiguration;
        this.dnsName = $.dnsName;
        this.endpointIpAddressRange = $.endpointIpAddressRange;
        this.endpoints = $.endpoints;
        this.fsxAdminPassword = $.fsxAdminPassword;
        this.kmsKeyId = $.kmsKeyId;
        this.networkInterfaceIds = $.networkInterfaceIds;
        this.ownerId = $.ownerId;
        this.preferredSubnetId = $.preferredSubnetId;
        this.routeTableIds = $.routeTableIds;
        this.securityGroupIds = $.securityGroupIds;
        this.storageCapacity = $.storageCapacity;
        this.storageType = $.storageType;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.throughputCapacity = $.throughputCapacity;
        this.vpcId = $.vpcId;
        this.weeklyMaintenanceStartTime = $.weeklyMaintenanceStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OntapFileSystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OntapFileSystemState $;

        public Builder() {
            $ = new OntapFileSystemState();
        }

        public Builder(OntapFileSystemState defaults) {
            $ = new OntapFileSystemState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder automaticBackupRetentionDays(@Nullable Output<Integer> automaticBackupRetentionDays) {
            $.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        public Builder automaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
            return automaticBackupRetentionDays(Output.of(automaticBackupRetentionDays));
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable Output<String> dailyAutomaticBackupStartTime) {
            $.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
            return dailyAutomaticBackupStartTime(Output.of(dailyAutomaticBackupStartTime));
        }

        public Builder deploymentType(@Nullable Output<String> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        public Builder deploymentType(String deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        public Builder diskIopsConfiguration(@Nullable Output<OntapFileSystemDiskIopsConfigurationGetArgs> diskIopsConfiguration) {
            $.diskIopsConfiguration = diskIopsConfiguration;
            return this;
        }

        public Builder diskIopsConfiguration(OntapFileSystemDiskIopsConfigurationGetArgs diskIopsConfiguration) {
            return diskIopsConfiguration(Output.of(diskIopsConfiguration));
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        public Builder endpointIpAddressRange(@Nullable Output<String> endpointIpAddressRange) {
            $.endpointIpAddressRange = endpointIpAddressRange;
            return this;
        }

        public Builder endpointIpAddressRange(String endpointIpAddressRange) {
            return endpointIpAddressRange(Output.of(endpointIpAddressRange));
        }

        public Builder endpoints(@Nullable Output<List<OntapFileSystemEndpointGetArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(List<OntapFileSystemEndpointGetArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        public Builder endpoints(OntapFileSystemEndpointGetArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        public Builder fsxAdminPassword(@Nullable Output<String> fsxAdminPassword) {
            $.fsxAdminPassword = fsxAdminPassword;
            return this;
        }

        public Builder fsxAdminPassword(String fsxAdminPassword) {
            return fsxAdminPassword(Output.of(fsxAdminPassword));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder networkInterfaceIds(@Nullable Output<List<String>> networkInterfaceIds) {
            $.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        public Builder networkInterfaceIds(List<String> networkInterfaceIds) {
            return networkInterfaceIds(Output.of(networkInterfaceIds));
        }

        public Builder networkInterfaceIds(String... networkInterfaceIds) {
            return networkInterfaceIds(List.of(networkInterfaceIds));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder preferredSubnetId(@Nullable Output<String> preferredSubnetId) {
            $.preferredSubnetId = preferredSubnetId;
            return this;
        }

        public Builder preferredSubnetId(String preferredSubnetId) {
            return preferredSubnetId(Output.of(preferredSubnetId));
        }

        public Builder routeTableIds(@Nullable Output<List<String>> routeTableIds) {
            $.routeTableIds = routeTableIds;
            return this;
        }

        public Builder routeTableIds(List<String> routeTableIds) {
            return routeTableIds(Output.of(routeTableIds));
        }

        public Builder routeTableIds(String... routeTableIds) {
            return routeTableIds(List.of(routeTableIds));
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder storageCapacity(@Nullable Output<Integer> storageCapacity) {
            $.storageCapacity = storageCapacity;
            return this;
        }

        public Builder storageCapacity(Integer storageCapacity) {
            return storageCapacity(Output.of(storageCapacity));
        }

        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder throughputCapacity(@Nullable Output<Integer> throughputCapacity) {
            $.throughputCapacity = throughputCapacity;
            return this;
        }

        public Builder throughputCapacity(Integer throughputCapacity) {
            return throughputCapacity(Output.of(throughputCapacity));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public Builder weeklyMaintenanceStartTime(@Nullable Output<String> weeklyMaintenanceStartTime) {
            $.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        public Builder weeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
            return weeklyMaintenanceStartTime(Output.of(weeklyMaintenanceStartTime));
        }

        public OntapFileSystemState build() {
            return $;
        }
    }

}
