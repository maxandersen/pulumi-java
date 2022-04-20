// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.redis_v1.enums.InstanceConnectMode;
import com.pulumi.googlenative.redis_v1.enums.InstanceReadReplicasMode;
import com.pulumi.googlenative.redis_v1.enums.InstanceTier;
import com.pulumi.googlenative.redis_v1.enums.InstanceTransitEncryptionMode;
import com.pulumi.googlenative.redis_v1.inputs.MaintenancePolicyArgs;
import com.pulumi.googlenative.redis_v1.inputs.PersistenceConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
     * 
     */
    @Import(name="alternativeLocationId")
      private final @Nullable Output<String> alternativeLocationId;

    public Output<String> alternativeLocationId() {
        return this.alternativeLocationId == null ? Codegen.empty() : this.alternativeLocationId;
    }

    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to &#34;true&#34; AUTH is enabled on the instance. Default value is &#34;false&#34; meaning AUTH is disabled.
     * 
     */
    @Import(name="authEnabled")
      private final @Nullable Output<Boolean> authEnabled;

    public Output<Boolean> authEnabled() {
        return this.authEnabled == null ? Codegen.empty() : this.authEnabled;
    }

    /**
     * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @Import(name="authorizedNetwork")
      private final @Nullable Output<String> authorizedNetwork;

    public Output<String> authorizedNetwork() {
        return this.authorizedNetwork == null ? Codegen.empty() : this.authorizedNetwork;
    }

    /**
     * Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @Import(name="connectMode")
      private final @Nullable Output<InstanceConnectMode> connectMode;

    public Output<InstanceConnectMode> connectMode() {
        return this.connectMode == null ? Codegen.empty() : this.connectMode;
    }

    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Resource labels to represent user provided metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
     * 
     */
    @Import(name="maintenancePolicy")
      private final @Nullable Output<MaintenancePolicyArgs> maintenancePolicy;

    public Output<MaintenancePolicyArgs> maintenancePolicy() {
        return this.maintenancePolicy == null ? Codegen.empty() : this.maintenancePolicy;
    }

    /**
     * Redis memory size in GiB.
     * 
     */
    @Import(name="memorySizeGb", required=true)
      private final Output<Integer> memorySizeGb;

    public Output<Integer> memorySizeGb() {
        return this.memorySizeGb;
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Optional. Persistence configuration parameters
     * 
     */
    @Import(name="persistenceConfig")
      private final @Nullable Output<PersistenceConfigArgs> persistenceConfig;

    public Output<PersistenceConfigArgs> persistenceConfig() {
        return this.persistenceConfig == null ? Codegen.empty() : this.persistenceConfig;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Read replica mode. Can only be specified when trying to create the instance.
     * 
     */
    @Import(name="readReplicasMode")
      private final @Nullable Output<InstanceReadReplicasMode> readReplicasMode;

    public Output<InstanceReadReplicasMode> readReplicasMode() {
        return this.readReplicasMode == null ? Codegen.empty() : this.readReplicasMode;
    }

    /**
     * Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
     * 
     */
    @Import(name="redisConfigs")
      private final @Nullable Output<Map<String,String>> redisConfigs;

    public Output<Map<String,String>> redisConfigs() {
        return this.redisConfigs == null ? Codegen.empty() : this.redisConfigs;
    }

    /**
     * Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
     * 
     */
    @Import(name="redisVersion")
      private final @Nullable Output<String> redisVersion;

    public Output<String> redisVersion() {
        return this.redisVersion == null ? Codegen.empty() : this.redisVersion;
    }

    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    @Import(name="replicaCount")
      private final @Nullable Output<Integer> replicaCount;

    public Output<Integer> replicaCount() {
        return this.replicaCount == null ? Codegen.empty() : this.replicaCount;
    }

    /**
     * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
     * 
     */
    @Import(name="reservedIpRange")
      private final @Nullable Output<String> reservedIpRange;

    public Output<String> reservedIpRange() {
        return this.reservedIpRange == null ? Codegen.empty() : this.reservedIpRange;
    }

    /**
     * Optional. Additional ip ranges for node placement, beyond those specified in reserved_ip_range. At most 1 secondary IP range is supported. The mask value must not exceed /28. Not supported for BASIC tier. Updates can only add new ranges, once added ranges cannot be changed or deleted. Values in this list cannot overlap with the reserved_ip_range. Not supported during instance creation.
     * 
     */
    @Import(name="secondaryIpRange")
      private final @Nullable Output<String> secondaryIpRange;

    public Output<String> secondaryIpRange() {
        return this.secondaryIpRange == null ? Codegen.empty() : this.secondaryIpRange;
    }

    /**
     * The service tier of the instance.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<InstanceTier> tier;

    public Output<InstanceTier> tier() {
        return this.tier;
    }

    /**
     * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
     */
    @Import(name="transitEncryptionMode")
      private final @Nullable Output<InstanceTransitEncryptionMode> transitEncryptionMode;

    public Output<InstanceTransitEncryptionMode> transitEncryptionMode() {
        return this.transitEncryptionMode == null ? Codegen.empty() : this.transitEncryptionMode;
    }

    public InstanceArgs(
        @Nullable Output<String> alternativeLocationId,
        @Nullable Output<Boolean> authEnabled,
        @Nullable Output<String> authorizedNetwork,
        @Nullable Output<InstanceConnectMode> connectMode,
        @Nullable Output<String> displayName,
        Output<String> instanceId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<MaintenancePolicyArgs> maintenancePolicy,
        Output<Integer> memorySizeGb,
        @Nullable Output<String> name,
        @Nullable Output<PersistenceConfigArgs> persistenceConfig,
        @Nullable Output<String> project,
        @Nullable Output<InstanceReadReplicasMode> readReplicasMode,
        @Nullable Output<Map<String,String>> redisConfigs,
        @Nullable Output<String> redisVersion,
        @Nullable Output<Integer> replicaCount,
        @Nullable Output<String> reservedIpRange,
        @Nullable Output<String> secondaryIpRange,
        Output<InstanceTier> tier,
        @Nullable Output<InstanceTransitEncryptionMode> transitEncryptionMode) {
        this.alternativeLocationId = alternativeLocationId;
        this.authEnabled = authEnabled;
        this.authorizedNetwork = authorizedNetwork;
        this.connectMode = connectMode;
        this.displayName = displayName;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.maintenancePolicy = maintenancePolicy;
        this.memorySizeGb = Objects.requireNonNull(memorySizeGb, "expected parameter 'memorySizeGb' to be non-null");
        this.name = name;
        this.persistenceConfig = persistenceConfig;
        this.project = project;
        this.readReplicasMode = readReplicasMode;
        this.redisConfigs = redisConfigs;
        this.redisVersion = redisVersion;
        this.replicaCount = replicaCount;
        this.reservedIpRange = reservedIpRange;
        this.secondaryIpRange = secondaryIpRange;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.transitEncryptionMode = transitEncryptionMode;
    }

    private InstanceArgs() {
        this.alternativeLocationId = Codegen.empty();
        this.authEnabled = Codegen.empty();
        this.authorizedNetwork = Codegen.empty();
        this.connectMode = Codegen.empty();
        this.displayName = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.maintenancePolicy = Codegen.empty();
        this.memorySizeGb = Codegen.empty();
        this.name = Codegen.empty();
        this.persistenceConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.readReplicasMode = Codegen.empty();
        this.redisConfigs = Codegen.empty();
        this.redisVersion = Codegen.empty();
        this.replicaCount = Codegen.empty();
        this.reservedIpRange = Codegen.empty();
        this.secondaryIpRange = Codegen.empty();
        this.tier = Codegen.empty();
        this.transitEncryptionMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alternativeLocationId;
        private @Nullable Output<Boolean> authEnabled;
        private @Nullable Output<String> authorizedNetwork;
        private @Nullable Output<InstanceConnectMode> connectMode;
        private @Nullable Output<String> displayName;
        private Output<String> instanceId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<MaintenancePolicyArgs> maintenancePolicy;
        private Output<Integer> memorySizeGb;
        private @Nullable Output<String> name;
        private @Nullable Output<PersistenceConfigArgs> persistenceConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<InstanceReadReplicasMode> readReplicasMode;
        private @Nullable Output<Map<String,String>> redisConfigs;
        private @Nullable Output<String> redisVersion;
        private @Nullable Output<Integer> replicaCount;
        private @Nullable Output<String> reservedIpRange;
        private @Nullable Output<String> secondaryIpRange;
        private Output<InstanceTier> tier;
        private @Nullable Output<InstanceTransitEncryptionMode> transitEncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeLocationId = defaults.alternativeLocationId;
    	      this.authEnabled = defaults.authEnabled;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.connectMode = defaults.connectMode;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.memorySizeGb = defaults.memorySizeGb;
    	      this.name = defaults.name;
    	      this.persistenceConfig = defaults.persistenceConfig;
    	      this.project = defaults.project;
    	      this.readReplicasMode = defaults.readReplicasMode;
    	      this.redisConfigs = defaults.redisConfigs;
    	      this.redisVersion = defaults.redisVersion;
    	      this.replicaCount = defaults.replicaCount;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.secondaryIpRange = defaults.secondaryIpRange;
    	      this.tier = defaults.tier;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
        }

        public Builder alternativeLocationId(@Nullable Output<String> alternativeLocationId) {
            this.alternativeLocationId = alternativeLocationId;
            return this;
        }
        public Builder alternativeLocationId(@Nullable String alternativeLocationId) {
            this.alternativeLocationId = Codegen.ofNullable(alternativeLocationId);
            return this;
        }
        public Builder authEnabled(@Nullable Output<Boolean> authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }
        public Builder authEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = Codegen.ofNullable(authEnabled);
            return this;
        }
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }
        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Codegen.ofNullable(authorizedNetwork);
            return this;
        }
        public Builder connectMode(@Nullable Output<InstanceConnectMode> connectMode) {
            this.connectMode = connectMode;
            return this;
        }
        public Builder connectMode(@Nullable InstanceConnectMode connectMode) {
            this.connectMode = Codegen.ofNullable(connectMode);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder maintenancePolicy(@Nullable Output<MaintenancePolicyArgs> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }
        public Builder maintenancePolicy(@Nullable MaintenancePolicyArgs maintenancePolicy) {
            this.maintenancePolicy = Codegen.ofNullable(maintenancePolicy);
            return this;
        }
        public Builder memorySizeGb(Output<Integer> memorySizeGb) {
            this.memorySizeGb = Objects.requireNonNull(memorySizeGb);
            return this;
        }
        public Builder memorySizeGb(Integer memorySizeGb) {
            this.memorySizeGb = Output.of(Objects.requireNonNull(memorySizeGb));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder persistenceConfig(@Nullable Output<PersistenceConfigArgs> persistenceConfig) {
            this.persistenceConfig = persistenceConfig;
            return this;
        }
        public Builder persistenceConfig(@Nullable PersistenceConfigArgs persistenceConfig) {
            this.persistenceConfig = Codegen.ofNullable(persistenceConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder readReplicasMode(@Nullable Output<InstanceReadReplicasMode> readReplicasMode) {
            this.readReplicasMode = readReplicasMode;
            return this;
        }
        public Builder readReplicasMode(@Nullable InstanceReadReplicasMode readReplicasMode) {
            this.readReplicasMode = Codegen.ofNullable(readReplicasMode);
            return this;
        }
        public Builder redisConfigs(@Nullable Output<Map<String,String>> redisConfigs) {
            this.redisConfigs = redisConfigs;
            return this;
        }
        public Builder redisConfigs(@Nullable Map<String,String> redisConfigs) {
            this.redisConfigs = Codegen.ofNullable(redisConfigs);
            return this;
        }
        public Builder redisVersion(@Nullable Output<String> redisVersion) {
            this.redisVersion = redisVersion;
            return this;
        }
        public Builder redisVersion(@Nullable String redisVersion) {
            this.redisVersion = Codegen.ofNullable(redisVersion);
            return this;
        }
        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Codegen.ofNullable(replicaCount);
            return this;
        }
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }
        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Codegen.ofNullable(reservedIpRange);
            return this;
        }
        public Builder secondaryIpRange(@Nullable Output<String> secondaryIpRange) {
            this.secondaryIpRange = secondaryIpRange;
            return this;
        }
        public Builder secondaryIpRange(@Nullable String secondaryIpRange) {
            this.secondaryIpRange = Codegen.ofNullable(secondaryIpRange);
            return this;
        }
        public Builder tier(Output<InstanceTier> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(InstanceTier tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }
        public Builder transitEncryptionMode(@Nullable Output<InstanceTransitEncryptionMode> transitEncryptionMode) {
            this.transitEncryptionMode = transitEncryptionMode;
            return this;
        }
        public Builder transitEncryptionMode(@Nullable InstanceTransitEncryptionMode transitEncryptionMode) {
            this.transitEncryptionMode = Codegen.ofNullable(transitEncryptionMode);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(alternativeLocationId, authEnabled, authorizedNetwork, connectMode, displayName, instanceId, labels, location, maintenancePolicy, memorySizeGb, name, persistenceConfig, project, readReplicasMode, redisConfigs, redisVersion, replicaCount, reservedIpRange, secondaryIpRange, tier, transitEncryptionMode);
        }
    }
}
