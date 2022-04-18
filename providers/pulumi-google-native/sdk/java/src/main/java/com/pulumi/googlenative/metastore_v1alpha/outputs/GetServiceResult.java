// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.metastore_v1alpha.outputs.EncryptionConfigResponse;
import com.pulumi.googlenative.metastore_v1alpha.outputs.HiveMetastoreConfigResponse;
import com.pulumi.googlenative.metastore_v1alpha.outputs.MaintenanceWindowResponse;
import com.pulumi.googlenative.metastore_v1alpha.outputs.MetadataIntegrationResponse;
import com.pulumi.googlenative.metastore_v1alpha.outputs.MetadataManagementActivityResponse;
import com.pulumi.googlenative.metastore_v1alpha.outputs.NetworkConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    private final String artifactGcsUri;
    /**
     * The time when the metastore service was created.
     * 
     */
    private final String createTime;
    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
     */
    private final String databaseType;
    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    private final String endpointUri;
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
     */
    private final HiveMetastoreConfigResponse hiveMetastoreConfig;
    /**
     * User-defined labels for the metastore service.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
     */
    private final MaintenanceWindowResponse maintenanceWindow;
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
     */
    private final MetadataIntegrationResponse metadataIntegration;
    /**
     * The metadata management activities of the metastore service.
     * 
     */
    private final MetadataManagementActivityResponse metadataManagementActivity;
    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
     */
    private final String name;
    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
     */
    private final String network;
    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
     */
    private final NetworkConfigResponse networkConfig;
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    private final Integer port;
    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
     */
    private final String releaseChannel;
    /**
     * The current state of the metastore service.
     * 
     */
    private final String state;
    /**
     * Additional information about the current state of the metastore service, if available.
     * 
     */
    private final String stateMessage;
    /**
     * The tier of the service.
     * 
     */
    private final String tier;
    /**
     * The globally unique resource identifier of the metastore service.
     * 
     */
    private final String uid;
    /**
     * The time when the metastore service was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("artifactGcsUri") String artifactGcsUri,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("databaseType") String databaseType,
        @CustomType.Parameter("encryptionConfig") EncryptionConfigResponse encryptionConfig,
        @CustomType.Parameter("endpointUri") String endpointUri,
        @CustomType.Parameter("hiveMetastoreConfig") HiveMetastoreConfigResponse hiveMetastoreConfig,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("maintenanceWindow") MaintenanceWindowResponse maintenanceWindow,
        @CustomType.Parameter("metadataIntegration") MetadataIntegrationResponse metadataIntegration,
        @CustomType.Parameter("metadataManagementActivity") MetadataManagementActivityResponse metadataManagementActivity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkConfig") NetworkConfigResponse networkConfig,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("releaseChannel") String releaseChannel,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateMessage") String stateMessage,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.artifactGcsUri = artifactGcsUri;
        this.createTime = createTime;
        this.databaseType = databaseType;
        this.encryptionConfig = encryptionConfig;
        this.endpointUri = endpointUri;
        this.hiveMetastoreConfig = hiveMetastoreConfig;
        this.labels = labels;
        this.maintenanceWindow = maintenanceWindow;
        this.metadataIntegration = metadataIntegration;
        this.metadataManagementActivity = metadataManagementActivity;
        this.name = name;
        this.network = network;
        this.networkConfig = networkConfig;
        this.port = port;
        this.releaseChannel = releaseChannel;
        this.state = state;
        this.stateMessage = stateMessage;
        this.tier = tier;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
    */
    public String artifactGcsUri() {
        return this.artifactGcsUri;
    }
    /**
     * The time when the metastore service was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Immutable. The database type that the Metastore service stores its data.
     * 
    */
    public String databaseType() {
        return this.databaseType;
    }
    /**
     * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
     * 
    */
    public EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
    */
    public String endpointUri() {
        return this.endpointUri;
    }
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * 
    */
    public HiveMetastoreConfigResponse hiveMetastoreConfig() {
        return this.hiveMetastoreConfig;
    }
    /**
     * User-defined labels for the metastore service.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
     * 
    */
    public MaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The setting that defines how metastore metadata should be integrated with external services and systems.
     * 
    */
    public MetadataIntegrationResponse metadataIntegration() {
        return this.metadataIntegration;
    }
    /**
     * The metadata management activities of the metastore service.
     * 
    */
    public MetadataManagementActivityResponse metadataManagementActivity() {
        return this.metadataManagementActivity;
    }
    /**
     * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number}/global/networks/{network_id}.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
     * 
    */
    public NetworkConfigResponse networkConfig() {
        return this.networkConfig;
    }
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
    */
    public Integer port() {
        return this.port;
    }
    /**
     * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
     * 
    */
    public String releaseChannel() {
        return this.releaseChannel;
    }
    /**
     * The current state of the metastore service.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Additional information about the current state of the metastore service, if available.
     * 
    */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * The tier of the service.
     * 
    */
    public String tier() {
        return this.tier;
    }
    /**
     * The globally unique resource identifier of the metastore service.
     * 
    */
    public String uid() {
        return this.uid;
    }
    /**
     * The time when the metastore service was last updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactGcsUri;
        private String createTime;
        private String databaseType;
        private EncryptionConfigResponse encryptionConfig;
        private String endpointUri;
        private HiveMetastoreConfigResponse hiveMetastoreConfig;
        private Map<String,String> labels;
        private MaintenanceWindowResponse maintenanceWindow;
        private MetadataIntegrationResponse metadataIntegration;
        private MetadataManagementActivityResponse metadataManagementActivity;
        private String name;
        private String network;
        private NetworkConfigResponse networkConfig;
        private Integer port;
        private String releaseChannel;
        private String state;
        private String stateMessage;
        private String tier;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactGcsUri = defaults.artifactGcsUri;
    	      this.createTime = defaults.createTime;
    	      this.databaseType = defaults.databaseType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointUri = defaults.endpointUri;
    	      this.hiveMetastoreConfig = defaults.hiveMetastoreConfig;
    	      this.labels = defaults.labels;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.metadataIntegration = defaults.metadataIntegration;
    	      this.metadataManagementActivity = defaults.metadataManagementActivity;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkConfig = defaults.networkConfig;
    	      this.port = defaults.port;
    	      this.releaseChannel = defaults.releaseChannel;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tier = defaults.tier;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder artifactGcsUri(String artifactGcsUri) {
            this.artifactGcsUri = Objects.requireNonNull(artifactGcsUri);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder endpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }
        public Builder hiveMetastoreConfig(HiveMetastoreConfigResponse hiveMetastoreConfig) {
            this.hiveMetastoreConfig = Objects.requireNonNull(hiveMetastoreConfig);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public Builder metadataIntegration(MetadataIntegrationResponse metadataIntegration) {
            this.metadataIntegration = Objects.requireNonNull(metadataIntegration);
            return this;
        }
        public Builder metadataManagementActivity(MetadataManagementActivityResponse metadataManagementActivity) {
            this.metadataManagementActivity = Objects.requireNonNull(metadataManagementActivity);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder releaseChannel(String releaseChannel) {
            this.releaseChannel = Objects.requireNonNull(releaseChannel);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(artifactGcsUri, createTime, databaseType, encryptionConfig, endpointUri, hiveMetastoreConfig, labels, maintenanceWindow, metadataIntegration, metadataManagementActivity, name, network, networkConfig, port, releaseChannel, state, stateMessage, tier, uid, updateTime);
        }
    }
}
