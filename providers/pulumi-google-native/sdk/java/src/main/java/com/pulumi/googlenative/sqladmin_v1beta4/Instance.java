// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.sqladmin_v1beta4.InstanceArgs;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionConfigurationResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.DiskEncryptionStatusResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.InstanceFailoverReplicaResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.IpMappingResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.OnPremisesConfigurationResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.ReplicaConfigurationResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.SettingsResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.SqlOutOfDiskReportResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.SqlScheduledMaintenanceResponse;
import com.pulumi.googlenative.sqladmin_v1beta4.outputs.SslCertResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Cloud SQL instance.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1beta4:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    @Export(name="backendType", type=String.class, parameters={})
    private Output<String> backendType;

    /**
     * @return The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    public Output<String> backendType() {
        return this.backendType;
    }
    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    @Export(name="connectionName", type=String.class, parameters={})
    private Output<String> connectionName;

    /**
     * @return Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }
    /**
     * The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the &#34;cloudsql.googleapis.com/database/disk/bytes_used&#34; metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    @Export(name="currentDiskSize", type=String.class, parameters={})
    private Output<String> currentDiskSize;

    /**
     * @return The current disk usage of the instance in bytes. This property has been deprecated. Use the &#34;cloudsql.googleapis.com/database/disk/bytes_used&#34; metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    public Output<String> currentDiskSize() {
        return this.currentDiskSize;
    }
    /**
     * Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    @Export(name="databaseInstalledVersion", type=String.class, parameters={})
    private Output<String> databaseInstalledVersion;

    /**
     * @return Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    public Output<String> databaseInstalledVersion() {
        return this.databaseInstalledVersion;
    }
    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    @Export(name="databaseVersion", type=String.class, parameters={})
    private Output<String> databaseVersion;

    /**
     * @return The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    public Output<String> databaseVersion() {
        return this.databaseVersion;
    }
    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    @Export(name="diskEncryptionConfiguration", type=DiskEncryptionConfigurationResponse.class, parameters={})
    private Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration;

    /**
     * @return Disk encryption configuration specific to an instance.
     * 
     */
    public Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Disk encryption status specific to an instance.
     * 
     */
    @Export(name="diskEncryptionStatus", type=DiskEncryptionStatusResponse.class, parameters={})
    private Output<DiskEncryptionStatusResponse> diskEncryptionStatus;

    /**
     * @return Disk encryption status specific to an instance.
     * 
     */
    public Output<DiskEncryptionStatusResponse> diskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The name and status of the failover replica.
     * 
     */
    @Export(name="failoverReplica", type=InstanceFailoverReplicaResponse.class, parameters={})
    private Output<InstanceFailoverReplicaResponse> failoverReplica;

    /**
     * @return The name and status of the failover replica.
     * 
     */
    public Output<InstanceFailoverReplicaResponse> failoverReplica() {
        return this.failoverReplica;
    }
    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    @Export(name="gceZone", type=String.class, parameters={})
    private Output<String> gceZone;

    /**
     * @return The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    public Output<String> gceZone() {
        return this.gceZone;
    }
    /**
     * The instance type.
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The instance type.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The assigned IP addresses for the instance.
     * 
     */
    @Export(name="ipAddresses", type=List.class, parameters={IpMappingResponse.class})
    private Output<List<IpMappingResponse>> ipAddresses;

    /**
     * @return The assigned IP addresses for the instance.
     * 
     */
    public Output<List<IpMappingResponse>> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * This is always `sql#instance`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#instance`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    @Export(name="masterInstanceName", type=String.class, parameters={})
    private Output<String> masterInstanceName;

    /**
     * @return The name of the instance which will act as primary in the replication setup.
     * 
     */
    public Output<String> masterInstanceName() {
        return this.masterInstanceName;
    }
    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    @Export(name="maxDiskSize", type=String.class, parameters={})
    private Output<String> maxDiskSize;

    /**
     * @return The maximum disk size of the instance in bytes.
     * 
     */
    public Output<String> maxDiskSize() {
        return this.maxDiskSize;
    }
    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration specific to on-premises instances.
     * 
     */
    @Export(name="onPremisesConfiguration", type=OnPremisesConfigurationResponse.class, parameters={})
    private Output<OnPremisesConfigurationResponse> onPremisesConfiguration;

    /**
     * @return Configuration specific to on-premises instances.
     * 
     */
    public Output<OnPremisesConfigurationResponse> onPremisesConfiguration() {
        return this.onPremisesConfiguration;
    }
    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @Export(name="outOfDiskReport", type=SqlOutOfDiskReportResponse.class, parameters={})
    private Output<SqlOutOfDiskReportResponse> outOfDiskReport;

    /**
     * @return This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    public Output<SqlOutOfDiskReportResponse> outOfDiskReport() {
        return this.outOfDiskReport;
    }
    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    @Export(name="replicaConfiguration", type=ReplicaConfigurationResponse.class, parameters={})
    private Output<ReplicaConfigurationResponse> replicaConfiguration;

    /**
     * @return Configuration specific to failover replicas and read replicas.
     * 
     */
    public Output<ReplicaConfigurationResponse> replicaConfiguration() {
        return this.replicaConfiguration;
    }
    /**
     * The replicas of the instance.
     * 
     */
    @Export(name="replicaNames", type=List.class, parameters={String.class})
    private Output<List<String>> replicaNames;

    /**
     * @return The replicas of the instance.
     * 
     */
    public Output<List<String>> replicaNames() {
        return this.replicaNames;
    }
    /**
     * Initial root password. Use only on creation.
     * 
     */
    @Export(name="rootPassword", type=String.class, parameters={})
    private Output<String> rootPassword;

    /**
     * @return Initial root password. Use only on creation.
     * 
     */
    public Output<String> rootPassword() {
        return this.rootPassword;
    }
    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @Export(name="scheduledMaintenance", type=SqlScheduledMaintenanceResponse.class, parameters={})
    private Output<SqlScheduledMaintenanceResponse> scheduledMaintenance;

    /**
     * @return The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public Output<SqlScheduledMaintenanceResponse> scheduledMaintenance() {
        return this.scheduledMaintenance;
    }
    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    @Export(name="secondaryGceZone", type=String.class, parameters={})
    private Output<String> secondaryGceZone;

    /**
     * @return The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    public Output<String> secondaryGceZone() {
        return this.secondaryGceZone;
    }
    /**
     * The URI of this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * SSL configuration.
     * 
     */
    @Export(name="serverCaCert", type=SslCertResponse.class, parameters={})
    private Output<SslCertResponse> serverCaCert;

    /**
     * @return SSL configuration.
     * 
     */
    public Output<SslCertResponse> serverCaCert() {
        return this.serverCaCert;
    }
    /**
     * The service account email address assigned to the instance. \This property is read-only.
     * 
     */
    @Export(name="serviceAccountEmailAddress", type=String.class, parameters={})
    private Output<String> serviceAccountEmailAddress;

    /**
     * @return The service account email address assigned to the instance. \This property is read-only.
     * 
     */
    public Output<String> serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * The user settings.
     * 
     */
    @Export(name="settings", type=SettingsResponse.class, parameters={})
    private Output<SettingsResponse> settings;

    /**
     * @return The user settings.
     * 
     */
    public Output<SettingsResponse> settings() {
        return this.settings;
    }
    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current serving state of the Cloud SQL instance.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    @Export(name="suspensionReason", type=List.class, parameters={String.class})
    private Output<List<String>> suspensionReason;

    /**
     * @return If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    public Output<List<String>> suspensionReason() {
        return this.suspensionReason;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, @Nullable InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, @Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:Instance", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
