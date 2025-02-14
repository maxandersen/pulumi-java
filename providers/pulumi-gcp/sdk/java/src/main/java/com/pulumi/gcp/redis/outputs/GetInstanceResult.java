// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.redis.outputs.GetInstanceMaintenancePolicy;
import com.pulumi.gcp.redis.outputs.GetInstanceMaintenanceSchedule;
import com.pulumi.gcp.redis.outputs.GetInstanceNode;
import com.pulumi.gcp.redis.outputs.GetInstanceServerCaCert;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceResult {
    private final String alternativeLocationId;
    private final Boolean authEnabled;
    private final String authString;
    private final String authorizedNetwork;
    private final String connectMode;
    private final String createTime;
    private final String currentLocationId;
    private final String displayName;
    private final String host;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final String locationId;
    private final List<GetInstanceMaintenancePolicy> maintenancePolicies;
    private final List<GetInstanceMaintenanceSchedule> maintenanceSchedules;
    private final Integer memorySizeGb;
    private final String name;
    private final List<GetInstanceNode> nodes;
    private final String persistenceIamIdentity;
    private final Integer port;
    private final @Nullable String project;
    private final String readEndpoint;
    private final Integer readEndpointPort;
    private final String readReplicasMode;
    private final Map<String,String> redisConfigs;
    private final String redisVersion;
    private final @Nullable String region;
    private final Integer replicaCount;
    private final String reservedIpRange;
    private final String secondaryIpRange;
    private final List<GetInstanceServerCaCert> serverCaCerts;
    private final String tier;
    private final String transitEncryptionMode;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("alternativeLocationId") String alternativeLocationId,
        @CustomType.Parameter("authEnabled") Boolean authEnabled,
        @CustomType.Parameter("authString") String authString,
        @CustomType.Parameter("authorizedNetwork") String authorizedNetwork,
        @CustomType.Parameter("connectMode") String connectMode,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("currentLocationId") String currentLocationId,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("locationId") String locationId,
        @CustomType.Parameter("maintenancePolicies") List<GetInstanceMaintenancePolicy> maintenancePolicies,
        @CustomType.Parameter("maintenanceSchedules") List<GetInstanceMaintenanceSchedule> maintenanceSchedules,
        @CustomType.Parameter("memorySizeGb") Integer memorySizeGb,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodes") List<GetInstanceNode> nodes,
        @CustomType.Parameter("persistenceIamIdentity") String persistenceIamIdentity,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("readEndpoint") String readEndpoint,
        @CustomType.Parameter("readEndpointPort") Integer readEndpointPort,
        @CustomType.Parameter("readReplicasMode") String readReplicasMode,
        @CustomType.Parameter("redisConfigs") Map<String,String> redisConfigs,
        @CustomType.Parameter("redisVersion") String redisVersion,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("replicaCount") Integer replicaCount,
        @CustomType.Parameter("reservedIpRange") String reservedIpRange,
        @CustomType.Parameter("secondaryIpRange") String secondaryIpRange,
        @CustomType.Parameter("serverCaCerts") List<GetInstanceServerCaCert> serverCaCerts,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("transitEncryptionMode") String transitEncryptionMode) {
        this.alternativeLocationId = alternativeLocationId;
        this.authEnabled = authEnabled;
        this.authString = authString;
        this.authorizedNetwork = authorizedNetwork;
        this.connectMode = connectMode;
        this.createTime = createTime;
        this.currentLocationId = currentLocationId;
        this.displayName = displayName;
        this.host = host;
        this.id = id;
        this.labels = labels;
        this.locationId = locationId;
        this.maintenancePolicies = maintenancePolicies;
        this.maintenanceSchedules = maintenanceSchedules;
        this.memorySizeGb = memorySizeGb;
        this.name = name;
        this.nodes = nodes;
        this.persistenceIamIdentity = persistenceIamIdentity;
        this.port = port;
        this.project = project;
        this.readEndpoint = readEndpoint;
        this.readEndpointPort = readEndpointPort;
        this.readReplicasMode = readReplicasMode;
        this.redisConfigs = redisConfigs;
        this.redisVersion = redisVersion;
        this.region = region;
        this.replicaCount = replicaCount;
        this.reservedIpRange = reservedIpRange;
        this.secondaryIpRange = secondaryIpRange;
        this.serverCaCerts = serverCaCerts;
        this.tier = tier;
        this.transitEncryptionMode = transitEncryptionMode;
    }

    public String alternativeLocationId() {
        return this.alternativeLocationId;
    }
    public Boolean authEnabled() {
        return this.authEnabled;
    }
    public String authString() {
        return this.authString;
    }
    public String authorizedNetwork() {
        return this.authorizedNetwork;
    }
    public String connectMode() {
        return this.connectMode;
    }
    public String createTime() {
        return this.createTime;
    }
    public String currentLocationId() {
        return this.currentLocationId;
    }
    public String displayName() {
        return this.displayName;
    }
    public String host() {
        return this.host;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String locationId() {
        return this.locationId;
    }
    public List<GetInstanceMaintenancePolicy> maintenancePolicies() {
        return this.maintenancePolicies;
    }
    public List<GetInstanceMaintenanceSchedule> maintenanceSchedules() {
        return this.maintenanceSchedules;
    }
    public Integer memorySizeGb() {
        return this.memorySizeGb;
    }
    public String name() {
        return this.name;
    }
    public List<GetInstanceNode> nodes() {
        return this.nodes;
    }
    public String persistenceIamIdentity() {
        return this.persistenceIamIdentity;
    }
    public Integer port() {
        return this.port;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String readEndpoint() {
        return this.readEndpoint;
    }
    public Integer readEndpointPort() {
        return this.readEndpointPort;
    }
    public String readReplicasMode() {
        return this.readReplicasMode;
    }
    public Map<String,String> redisConfigs() {
        return this.redisConfigs;
    }
    public String redisVersion() {
        return this.redisVersion;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public Integer replicaCount() {
        return this.replicaCount;
    }
    public String reservedIpRange() {
        return this.reservedIpRange;
    }
    public String secondaryIpRange() {
        return this.secondaryIpRange;
    }
    public List<GetInstanceServerCaCert> serverCaCerts() {
        return this.serverCaCerts;
    }
    public String tier() {
        return this.tier;
    }
    public String transitEncryptionMode() {
        return this.transitEncryptionMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alternativeLocationId;
        private Boolean authEnabled;
        private String authString;
        private String authorizedNetwork;
        private String connectMode;
        private String createTime;
        private String currentLocationId;
        private String displayName;
        private String host;
        private String id;
        private Map<String,String> labels;
        private String locationId;
        private List<GetInstanceMaintenancePolicy> maintenancePolicies;
        private List<GetInstanceMaintenanceSchedule> maintenanceSchedules;
        private Integer memorySizeGb;
        private String name;
        private List<GetInstanceNode> nodes;
        private String persistenceIamIdentity;
        private Integer port;
        private @Nullable String project;
        private String readEndpoint;
        private Integer readEndpointPort;
        private String readReplicasMode;
        private Map<String,String> redisConfigs;
        private String redisVersion;
        private @Nullable String region;
        private Integer replicaCount;
        private String reservedIpRange;
        private String secondaryIpRange;
        private List<GetInstanceServerCaCert> serverCaCerts;
        private String tier;
        private String transitEncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeLocationId = defaults.alternativeLocationId;
    	      this.authEnabled = defaults.authEnabled;
    	      this.authString = defaults.authString;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.connectMode = defaults.connectMode;
    	      this.createTime = defaults.createTime;
    	      this.currentLocationId = defaults.currentLocationId;
    	      this.displayName = defaults.displayName;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.locationId = defaults.locationId;
    	      this.maintenancePolicies = defaults.maintenancePolicies;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.memorySizeGb = defaults.memorySizeGb;
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.persistenceIamIdentity = defaults.persistenceIamIdentity;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.readEndpoint = defaults.readEndpoint;
    	      this.readEndpointPort = defaults.readEndpointPort;
    	      this.readReplicasMode = defaults.readReplicasMode;
    	      this.redisConfigs = defaults.redisConfigs;
    	      this.redisVersion = defaults.redisVersion;
    	      this.region = defaults.region;
    	      this.replicaCount = defaults.replicaCount;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.secondaryIpRange = defaults.secondaryIpRange;
    	      this.serverCaCerts = defaults.serverCaCerts;
    	      this.tier = defaults.tier;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
        }

        public Builder alternativeLocationId(String alternativeLocationId) {
            this.alternativeLocationId = Objects.requireNonNull(alternativeLocationId);
            return this;
        }
        public Builder authEnabled(Boolean authEnabled) {
            this.authEnabled = Objects.requireNonNull(authEnabled);
            return this;
        }
        public Builder authString(String authString) {
            this.authString = Objects.requireNonNull(authString);
            return this;
        }
        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }
        public Builder connectMode(String connectMode) {
            this.connectMode = Objects.requireNonNull(connectMode);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder currentLocationId(String currentLocationId) {
            this.currentLocationId = Objects.requireNonNull(currentLocationId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder locationId(String locationId) {
            this.locationId = Objects.requireNonNull(locationId);
            return this;
        }
        public Builder maintenancePolicies(List<GetInstanceMaintenancePolicy> maintenancePolicies) {
            this.maintenancePolicies = Objects.requireNonNull(maintenancePolicies);
            return this;
        }
        public Builder maintenancePolicies(GetInstanceMaintenancePolicy... maintenancePolicies) {
            return maintenancePolicies(List.of(maintenancePolicies));
        }
        public Builder maintenanceSchedules(List<GetInstanceMaintenanceSchedule> maintenanceSchedules) {
            this.maintenanceSchedules = Objects.requireNonNull(maintenanceSchedules);
            return this;
        }
        public Builder maintenanceSchedules(GetInstanceMaintenanceSchedule... maintenanceSchedules) {
            return maintenanceSchedules(List.of(maintenanceSchedules));
        }
        public Builder memorySizeGb(Integer memorySizeGb) {
            this.memorySizeGb = Objects.requireNonNull(memorySizeGb);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodes(List<GetInstanceNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetInstanceNode... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder persistenceIamIdentity(String persistenceIamIdentity) {
            this.persistenceIamIdentity = Objects.requireNonNull(persistenceIamIdentity);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder readEndpoint(String readEndpoint) {
            this.readEndpoint = Objects.requireNonNull(readEndpoint);
            return this;
        }
        public Builder readEndpointPort(Integer readEndpointPort) {
            this.readEndpointPort = Objects.requireNonNull(readEndpointPort);
            return this;
        }
        public Builder readReplicasMode(String readReplicasMode) {
            this.readReplicasMode = Objects.requireNonNull(readReplicasMode);
            return this;
        }
        public Builder redisConfigs(Map<String,String> redisConfigs) {
            this.redisConfigs = Objects.requireNonNull(redisConfigs);
            return this;
        }
        public Builder redisVersion(String redisVersion) {
            this.redisVersion = Objects.requireNonNull(redisVersion);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder replicaCount(Integer replicaCount) {
            this.replicaCount = Objects.requireNonNull(replicaCount);
            return this;
        }
        public Builder reservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }
        public Builder secondaryIpRange(String secondaryIpRange) {
            this.secondaryIpRange = Objects.requireNonNull(secondaryIpRange);
            return this;
        }
        public Builder serverCaCerts(List<GetInstanceServerCaCert> serverCaCerts) {
            this.serverCaCerts = Objects.requireNonNull(serverCaCerts);
            return this;
        }
        public Builder serverCaCerts(GetInstanceServerCaCert... serverCaCerts) {
            return serverCaCerts(List.of(serverCaCerts));
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder transitEncryptionMode(String transitEncryptionMode) {
            this.transitEncryptionMode = Objects.requireNonNull(transitEncryptionMode);
            return this;
        }        public GetInstanceResult build() {
            return new GetInstanceResult(alternativeLocationId, authEnabled, authString, authorizedNetwork, connectMode, createTime, currentLocationId, displayName, host, id, labels, locationId, maintenancePolicies, maintenanceSchedules, memorySizeGb, name, nodes, persistenceIamIdentity, port, project, readEndpoint, readEndpointPort, readReplicasMode, redisConfigs, redisVersion, region, replicaCount, reservedIpRange, secondaryIpRange, serverCaCerts, tier, transitEncryptionMode);
        }
    }
}
