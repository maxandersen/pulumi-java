// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.composer_v1.outputs.DatabaseConfigResponse;
import com.pulumi.googlenative.composer_v1.outputs.EncryptionConfigResponse;
import com.pulumi.googlenative.composer_v1.outputs.MaintenanceWindowResponse;
import com.pulumi.googlenative.composer_v1.outputs.NodeConfigResponse;
import com.pulumi.googlenative.composer_v1.outputs.PrivateEnvironmentConfigResponse;
import com.pulumi.googlenative.composer_v1.outputs.SoftwareConfigResponse;
import com.pulumi.googlenative.composer_v1.outputs.WebServerConfigResponse;
import com.pulumi.googlenative.composer_v1.outputs.WebServerNetworkAccessControlResponse;
import com.pulumi.googlenative.composer_v1.outputs.WorkloadsConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentConfigResponse {
    /**
     * The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)).
     * 
     */
    private final String airflowUri;
    /**
     * The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using "/"-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
     * 
     */
    private final String dagGcsPrefix;
    /**
     * Optional. The configuration settings for Cloud SQL instance used internally by Apache Airflow software. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final DatabaseConfigResponse databaseConfig;
    /**
     * Optional. The encryption options for the Cloud Composer environment and its dependencies. Cannot be updated.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * Optional. The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    private final String environmentSize;
    /**
     * The Kubernetes Engine cluster used to run this environment.
     * 
     */
    private final String gkeCluster;
    /**
     * Optional. The maintenance window is the period when Cloud Composer components may undergo maintenance. It is defined so that maintenance is not executed during peak hours or critical time periods. The system will not be under maintenance for every occurrence of this window, but when maintenance is planned, it will be scheduled during the window. The maintenance window period must encompass at least 12 hours per week. This may be split into multiple chunks, each with a size of at least 4 hours. If this value is omitted, the default value for maintenance window will be applied. The default value is Saturday and Sunday 00-06 GMT.
     * 
     */
    private final MaintenanceWindowResponse maintenanceWindow;
    /**
     * The configuration used for the Kubernetes Engine cluster.
     * 
     */
    private final NodeConfigResponse nodeConfig;
    /**
     * The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final Integer nodeCount;
    /**
     * The configuration used for the Private IP Cloud Composer environment.
     * 
     */
    private final PrivateEnvironmentConfigResponse privateEnvironmentConfig;
    /**
     * The configuration settings for software inside the environment.
     * 
     */
    private final SoftwareConfigResponse softwareConfig;
    /**
     * Optional. The configuration settings for the Airflow web server App Engine instance.
     * 
     */
    private final WebServerConfigResponse webServerConfig;
    /**
     * Optional. The network-level access control policy for the Airflow web server. If unspecified, no network-level access restrictions will be applied.
     * 
     */
    private final WebServerNetworkAccessControlResponse webServerNetworkAccessControl;
    /**
     * Optional. The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web server and workers workloads. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    private final WorkloadsConfigResponse workloadsConfig;

    @CustomType.Constructor
    private EnvironmentConfigResponse(
        @CustomType.Parameter("airflowUri") String airflowUri,
        @CustomType.Parameter("dagGcsPrefix") String dagGcsPrefix,
        @CustomType.Parameter("databaseConfig") DatabaseConfigResponse databaseConfig,
        @CustomType.Parameter("encryptionConfig") EncryptionConfigResponse encryptionConfig,
        @CustomType.Parameter("environmentSize") String environmentSize,
        @CustomType.Parameter("gkeCluster") String gkeCluster,
        @CustomType.Parameter("maintenanceWindow") MaintenanceWindowResponse maintenanceWindow,
        @CustomType.Parameter("nodeConfig") NodeConfigResponse nodeConfig,
        @CustomType.Parameter("nodeCount") Integer nodeCount,
        @CustomType.Parameter("privateEnvironmentConfig") PrivateEnvironmentConfigResponse privateEnvironmentConfig,
        @CustomType.Parameter("softwareConfig") SoftwareConfigResponse softwareConfig,
        @CustomType.Parameter("webServerConfig") WebServerConfigResponse webServerConfig,
        @CustomType.Parameter("webServerNetworkAccessControl") WebServerNetworkAccessControlResponse webServerNetworkAccessControl,
        @CustomType.Parameter("workloadsConfig") WorkloadsConfigResponse workloadsConfig) {
        this.airflowUri = airflowUri;
        this.dagGcsPrefix = dagGcsPrefix;
        this.databaseConfig = databaseConfig;
        this.encryptionConfig = encryptionConfig;
        this.environmentSize = environmentSize;
        this.gkeCluster = gkeCluster;
        this.maintenanceWindow = maintenanceWindow;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.privateEnvironmentConfig = privateEnvironmentConfig;
        this.softwareConfig = softwareConfig;
        this.webServerConfig = webServerConfig;
        this.webServerNetworkAccessControl = webServerNetworkAccessControl;
        this.workloadsConfig = workloadsConfig;
    }

    /**
     * The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)).
     * 
    */
    public String airflowUri() {
        return this.airflowUri;
    }
    /**
     * The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using "/"-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
     * 
    */
    public String dagGcsPrefix() {
        return this.dagGcsPrefix;
    }
    /**
     * Optional. The configuration settings for Cloud SQL instance used internally by Apache Airflow software. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
    */
    public DatabaseConfigResponse databaseConfig() {
        return this.databaseConfig;
    }
    /**
     * Optional. The encryption options for the Cloud Composer environment and its dependencies. Cannot be updated.
     * 
    */
    public EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * Optional. The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
    */
    public String environmentSize() {
        return this.environmentSize;
    }
    /**
     * The Kubernetes Engine cluster used to run this environment.
     * 
    */
    public String gkeCluster() {
        return this.gkeCluster;
    }
    /**
     * Optional. The maintenance window is the period when Cloud Composer components may undergo maintenance. It is defined so that maintenance is not executed during peak hours or critical time periods. The system will not be under maintenance for every occurrence of this window, but when maintenance is planned, it will be scheduled during the window. The maintenance window period must encompass at least 12 hours per week. This may be split into multiple chunks, each with a size of at least 4 hours. If this value is omitted, the default value for maintenance window will be applied. The default value is Saturday and Sunday 00-06 GMT.
     * 
    */
    public MaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The configuration used for the Kubernetes Engine cluster.
     * 
    */
    public NodeConfigResponse nodeConfig() {
        return this.nodeConfig;
    }
    /**
     * The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
    */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * The configuration used for the Private IP Cloud Composer environment.
     * 
    */
    public PrivateEnvironmentConfigResponse privateEnvironmentConfig() {
        return this.privateEnvironmentConfig;
    }
    /**
     * The configuration settings for software inside the environment.
     * 
    */
    public SoftwareConfigResponse softwareConfig() {
        return this.softwareConfig;
    }
    /**
     * Optional. The configuration settings for the Airflow web server App Engine instance.
     * 
    */
    public WebServerConfigResponse webServerConfig() {
        return this.webServerConfig;
    }
    /**
     * Optional. The network-level access control policy for the Airflow web server. If unspecified, no network-level access restrictions will be applied.
     * 
    */
    public WebServerNetworkAccessControlResponse webServerNetworkAccessControl() {
        return this.webServerNetworkAccessControl;
    }
    /**
     * Optional. The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web server and workers workloads. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
    */
    public WorkloadsConfigResponse workloadsConfig() {
        return this.workloadsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String airflowUri;
        private String dagGcsPrefix;
        private DatabaseConfigResponse databaseConfig;
        private EncryptionConfigResponse encryptionConfig;
        private String environmentSize;
        private String gkeCluster;
        private MaintenanceWindowResponse maintenanceWindow;
        private NodeConfigResponse nodeConfig;
        private Integer nodeCount;
        private PrivateEnvironmentConfigResponse privateEnvironmentConfig;
        private SoftwareConfigResponse softwareConfig;
        private WebServerConfigResponse webServerConfig;
        private WebServerNetworkAccessControlResponse webServerNetworkAccessControl;
        private WorkloadsConfigResponse workloadsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowUri = defaults.airflowUri;
    	      this.dagGcsPrefix = defaults.dagGcsPrefix;
    	      this.databaseConfig = defaults.databaseConfig;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.environmentSize = defaults.environmentSize;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.privateEnvironmentConfig = defaults.privateEnvironmentConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.webServerConfig = defaults.webServerConfig;
    	      this.webServerNetworkAccessControl = defaults.webServerNetworkAccessControl;
    	      this.workloadsConfig = defaults.workloadsConfig;
        }

        public Builder airflowUri(String airflowUri) {
            this.airflowUri = Objects.requireNonNull(airflowUri);
            return this;
        }
        public Builder dagGcsPrefix(String dagGcsPrefix) {
            this.dagGcsPrefix = Objects.requireNonNull(dagGcsPrefix);
            return this;
        }
        public Builder databaseConfig(DatabaseConfigResponse databaseConfig) {
            this.databaseConfig = Objects.requireNonNull(databaseConfig);
            return this;
        }
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder environmentSize(String environmentSize) {
            this.environmentSize = Objects.requireNonNull(environmentSize);
            return this;
        }
        public Builder gkeCluster(String gkeCluster) {
            this.gkeCluster = Objects.requireNonNull(gkeCluster);
            return this;
        }
        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public Builder nodeConfig(NodeConfigResponse nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder privateEnvironmentConfig(PrivateEnvironmentConfigResponse privateEnvironmentConfig) {
            this.privateEnvironmentConfig = Objects.requireNonNull(privateEnvironmentConfig);
            return this;
        }
        public Builder softwareConfig(SoftwareConfigResponse softwareConfig) {
            this.softwareConfig = Objects.requireNonNull(softwareConfig);
            return this;
        }
        public Builder webServerConfig(WebServerConfigResponse webServerConfig) {
            this.webServerConfig = Objects.requireNonNull(webServerConfig);
            return this;
        }
        public Builder webServerNetworkAccessControl(WebServerNetworkAccessControlResponse webServerNetworkAccessControl) {
            this.webServerNetworkAccessControl = Objects.requireNonNull(webServerNetworkAccessControl);
            return this;
        }
        public Builder workloadsConfig(WorkloadsConfigResponse workloadsConfig) {
            this.workloadsConfig = Objects.requireNonNull(workloadsConfig);
            return this;
        }        public EnvironmentConfigResponse build() {
            return new EnvironmentConfigResponse(airflowUri, dagGcsPrefix, databaseConfig, encryptionConfig, environmentSize, gkeCluster, maintenanceWindow, nodeConfig, nodeCount, privateEnvironmentConfig, softwareConfig, webServerConfig, webServerNetworkAccessControl, workloadsConfig);
        }
    }
}
