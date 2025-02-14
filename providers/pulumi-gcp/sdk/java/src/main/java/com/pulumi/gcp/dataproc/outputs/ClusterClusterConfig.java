// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigAutoscalingConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigEncryptionConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigEndpointConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigGceClusterConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigInitializationAction;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigLifecycleConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigMasterConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigMetastoreConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigPreemptibleWorkerConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigSecurityConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigSoftwareConfig;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfigWorkerConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterConfig {
    /**
     * @return The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = &#34;&#34;`, rather than removing the whole block.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig;
    private final @Nullable String bucket;
    /**
     * @return The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigEncryptionConfig encryptionConfig;
    /**
     * @return The config settings for port access on the cluster.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigEndpointConfig endpointConfig;
    /**
     * @return Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig;
    /**
     * @return Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
     */
    private final @Nullable List<ClusterClusterConfigInitializationAction> initializationActions;
    /**
     * @return The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig;
    /**
     * @return The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigMasterConfig masterConfig;
    /**
     * @return The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
     */
    private final @Nullable ClusterClusterConfigMetastoreConfig metastoreConfig;
    /**
     * @return The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api&#39;s [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn&#39;t necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
     */
    private final @Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig;
    /**
     * @return Security related configuration. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigSecurityConfig securityConfig;
    /**
     * @return The config settings for software inside the cluster.
     * Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigSoftwareConfig softwareConfig;
    /**
     * @return The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don&#39;t explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
     */
    private final @Nullable String stagingBucket;
    /**
     * @return The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don&#39;t explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
     */
    private final @Nullable String tempBucket;
    /**
     * @return The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
     */
    private final @Nullable ClusterClusterConfigWorkerConfig workerConfig;

    @CustomType.Constructor
    private ClusterClusterConfig(
        @CustomType.Parameter("autoscalingConfig") @Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig,
        @CustomType.Parameter("bucket") @Nullable String bucket,
        @CustomType.Parameter("encryptionConfig") @Nullable ClusterClusterConfigEncryptionConfig encryptionConfig,
        @CustomType.Parameter("endpointConfig") @Nullable ClusterClusterConfigEndpointConfig endpointConfig,
        @CustomType.Parameter("gceClusterConfig") @Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig,
        @CustomType.Parameter("initializationActions") @Nullable List<ClusterClusterConfigInitializationAction> initializationActions,
        @CustomType.Parameter("lifecycleConfig") @Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig,
        @CustomType.Parameter("masterConfig") @Nullable ClusterClusterConfigMasterConfig masterConfig,
        @CustomType.Parameter("metastoreConfig") @Nullable ClusterClusterConfigMetastoreConfig metastoreConfig,
        @CustomType.Parameter("preemptibleWorkerConfig") @Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig,
        @CustomType.Parameter("securityConfig") @Nullable ClusterClusterConfigSecurityConfig securityConfig,
        @CustomType.Parameter("softwareConfig") @Nullable ClusterClusterConfigSoftwareConfig softwareConfig,
        @CustomType.Parameter("stagingBucket") @Nullable String stagingBucket,
        @CustomType.Parameter("tempBucket") @Nullable String tempBucket,
        @CustomType.Parameter("workerConfig") @Nullable ClusterClusterConfigWorkerConfig workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.bucket = bucket;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.preemptibleWorkerConfig = preemptibleWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.stagingBucket = stagingBucket;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    /**
     * @return The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = &#34;&#34;`, rather than removing the whole block.
     * Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigAutoscalingConfig> autoscalingConfig() {
        return Optional.ofNullable(this.autoscalingConfig);
    }
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * @return The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigEncryptionConfig> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    /**
     * @return The config settings for port access on the cluster.
     * Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigEndpointConfig> endpointConfig() {
        return Optional.ofNullable(this.endpointConfig);
    }
    /**
     * @return Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigGceClusterConfig> gceClusterConfig() {
        return Optional.ofNullable(this.gceClusterConfig);
    }
    /**
     * @return Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
     */
    public List<ClusterClusterConfigInitializationAction> initializationActions() {
        return this.initializationActions == null ? List.of() : this.initializationActions;
    }
    /**
     * @return The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigLifecycleConfig> lifecycleConfig() {
        return Optional.ofNullable(this.lifecycleConfig);
    }
    /**
     * @return The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigMasterConfig> masterConfig() {
        return Optional.ofNullable(this.masterConfig);
    }
    /**
     * @return The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
     */
    public Optional<ClusterClusterConfigMetastoreConfig> metastoreConfig() {
        return Optional.ofNullable(this.metastoreConfig);
    }
    /**
     * @return The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api&#39;s [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn&#39;t necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
     */
    public Optional<ClusterClusterConfigPreemptibleWorkerConfig> preemptibleWorkerConfig() {
        return Optional.ofNullable(this.preemptibleWorkerConfig);
    }
    /**
     * @return Security related configuration. Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigSecurityConfig> securityConfig() {
        return Optional.ofNullable(this.securityConfig);
    }
    /**
     * @return The config settings for software inside the cluster.
     * Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigSoftwareConfig> softwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }
    /**
     * @return The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don&#39;t explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
     */
    public Optional<String> stagingBucket() {
        return Optional.ofNullable(this.stagingBucket);
    }
    /**
     * @return The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don&#39;t explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
     */
    public Optional<String> tempBucket() {
        return Optional.ofNullable(this.tempBucket);
    }
    /**
     * @return The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
     */
    public Optional<ClusterClusterConfigWorkerConfig> workerConfig() {
        return Optional.ofNullable(this.workerConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig;
        private @Nullable String bucket;
        private @Nullable ClusterClusterConfigEncryptionConfig encryptionConfig;
        private @Nullable ClusterClusterConfigEndpointConfig endpointConfig;
        private @Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig;
        private @Nullable List<ClusterClusterConfigInitializationAction> initializationActions;
        private @Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig;
        private @Nullable ClusterClusterConfigMasterConfig masterConfig;
        private @Nullable ClusterClusterConfigMetastoreConfig metastoreConfig;
        private @Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig;
        private @Nullable ClusterClusterConfigSecurityConfig securityConfig;
        private @Nullable ClusterClusterConfigSoftwareConfig softwareConfig;
        private @Nullable String stagingBucket;
        private @Nullable String tempBucket;
        private @Nullable ClusterClusterConfigWorkerConfig workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.preemptibleWorkerConfig = defaults.preemptibleWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.stagingBucket = defaults.stagingBucket;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder autoscalingConfig(@Nullable ClusterClusterConfigAutoscalingConfig autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder encryptionConfig(@Nullable ClusterClusterConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder endpointConfig(@Nullable ClusterClusterConfigEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public Builder gceClusterConfig(@Nullable ClusterClusterConfigGceClusterConfig gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }
        public Builder initializationActions(@Nullable List<ClusterClusterConfigInitializationAction> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }
        public Builder initializationActions(ClusterClusterConfigInitializationAction... initializationActions) {
            return initializationActions(List.of(initializationActions));
        }
        public Builder lifecycleConfig(@Nullable ClusterClusterConfigLifecycleConfig lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }
        public Builder masterConfig(@Nullable ClusterClusterConfigMasterConfig masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }
        public Builder metastoreConfig(@Nullable ClusterClusterConfigMetastoreConfig metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }
        public Builder preemptibleWorkerConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfig preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = preemptibleWorkerConfig;
            return this;
        }
        public Builder securityConfig(@Nullable ClusterClusterConfigSecurityConfig securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable ClusterClusterConfigSoftwareConfig softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder stagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }
        public Builder tempBucket(@Nullable String tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }
        public Builder workerConfig(@Nullable ClusterClusterConfigWorkerConfig workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }        public ClusterClusterConfig build() {
            return new ClusterClusterConfig(autoscalingConfig, bucket, encryptionConfig, endpointConfig, gceClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, preemptibleWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}
