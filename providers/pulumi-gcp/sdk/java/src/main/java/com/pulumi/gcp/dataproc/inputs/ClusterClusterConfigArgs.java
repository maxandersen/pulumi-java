// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAutoscalingConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEncryptionConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEndpointConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigInitializationActionArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigLifecycleConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMetastoreConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSoftwareConfigArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigArgs Empty = new ClusterClusterConfigArgs();

    /**
     * The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = &#34;&#34;`, rather than removing the whole block.
     * Structure defined below.
     * 
     */
    @Import(name="autoscalingConfig")
      private final @Nullable Output<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig;

    public Output<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig() {
        return this.autoscalingConfig == null ? Codegen.empty() : this.autoscalingConfig;
    }

    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="encryptionConfig")
      private final @Nullable Output<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig;

    public Output<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    /**
     * The config settings for port access on the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="endpointConfig")
      private final @Nullable Output<ClusterClusterConfigEndpointConfigArgs> endpointConfig;

    public Output<ClusterClusterConfigEndpointConfigArgs> endpointConfig() {
        return this.endpointConfig == null ? Codegen.empty() : this.endpointConfig;
    }

    /**
     * Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
     */
    @Import(name="gceClusterConfig")
      private final @Nullable Output<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig;

    public Output<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig() {
        return this.gceClusterConfig == null ? Codegen.empty() : this.gceClusterConfig;
    }

    /**
     * Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
     */
    @Import(name="initializationActions")
      private final @Nullable Output<List<ClusterClusterConfigInitializationActionArgs>> initializationActions;

    public Output<List<ClusterClusterConfigInitializationActionArgs>> initializationActions() {
        return this.initializationActions == null ? Codegen.empty() : this.initializationActions;
    }

    /**
     * The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
     */
    @Import(name="lifecycleConfig")
      private final @Nullable Output<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig;

    public Output<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig() {
        return this.lifecycleConfig == null ? Codegen.empty() : this.lifecycleConfig;
    }

    /**
     * The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
     */
    @Import(name="masterConfig")
      private final @Nullable Output<ClusterClusterConfigMasterConfigArgs> masterConfig;

    public Output<ClusterClusterConfigMasterConfigArgs> masterConfig() {
        return this.masterConfig == null ? Codegen.empty() : this.masterConfig;
    }

    /**
     * The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
     */
    @Import(name="metastoreConfig")
      private final @Nullable Output<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig;

    public Output<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig() {
        return this.metastoreConfig == null ? Codegen.empty() : this.metastoreConfig;
    }

    /**
     * The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api&#39;s [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn&#39;t necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
     */
    @Import(name="preemptibleWorkerConfig")
      private final @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig;

    public Output<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig() {
        return this.preemptibleWorkerConfig == null ? Codegen.empty() : this.preemptibleWorkerConfig;
    }

    /**
     * Security related configuration. Structure defined below.
     * 
     */
    @Import(name="securityConfig")
      private final @Nullable Output<ClusterClusterConfigSecurityConfigArgs> securityConfig;

    public Output<ClusterClusterConfigSecurityConfigArgs> securityConfig() {
        return this.securityConfig == null ? Codegen.empty() : this.securityConfig;
    }

    /**
     * The config settings for software inside the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="softwareConfig")
      private final @Nullable Output<ClusterClusterConfigSoftwareConfigArgs> softwareConfig;

    public Output<ClusterClusterConfigSoftwareConfigArgs> softwareConfig() {
        return this.softwareConfig == null ? Codegen.empty() : this.softwareConfig;
    }

    /**
     * The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don&#39;t explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
     */
    @Import(name="stagingBucket")
      private final @Nullable Output<String> stagingBucket;

    public Output<String> stagingBucket() {
        return this.stagingBucket == null ? Codegen.empty() : this.stagingBucket;
    }

    /**
     * The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don&#39;t explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
     */
    @Import(name="tempBucket")
      private final @Nullable Output<String> tempBucket;

    public Output<String> tempBucket() {
        return this.tempBucket == null ? Codegen.empty() : this.tempBucket;
    }

    /**
     * The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
     */
    @Import(name="workerConfig")
      private final @Nullable Output<ClusterClusterConfigWorkerConfigArgs> workerConfig;

    public Output<ClusterClusterConfigWorkerConfigArgs> workerConfig() {
        return this.workerConfig == null ? Codegen.empty() : this.workerConfig;
    }

    public ClusterClusterConfigArgs(
        @Nullable Output<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig,
        @Nullable Output<String> bucket,
        @Nullable Output<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig,
        @Nullable Output<ClusterClusterConfigEndpointConfigArgs> endpointConfig,
        @Nullable Output<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig,
        @Nullable Output<List<ClusterClusterConfigInitializationActionArgs>> initializationActions,
        @Nullable Output<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig,
        @Nullable Output<ClusterClusterConfigMasterConfigArgs> masterConfig,
        @Nullable Output<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig,
        @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig,
        @Nullable Output<ClusterClusterConfigSecurityConfigArgs> securityConfig,
        @Nullable Output<ClusterClusterConfigSoftwareConfigArgs> softwareConfig,
        @Nullable Output<String> stagingBucket,
        @Nullable Output<String> tempBucket,
        @Nullable Output<ClusterClusterConfigWorkerConfigArgs> workerConfig) {
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

    private ClusterClusterConfigArgs() {
        this.autoscalingConfig = Codegen.empty();
        this.bucket = Codegen.empty();
        this.encryptionConfig = Codegen.empty();
        this.endpointConfig = Codegen.empty();
        this.gceClusterConfig = Codegen.empty();
        this.initializationActions = Codegen.empty();
        this.lifecycleConfig = Codegen.empty();
        this.masterConfig = Codegen.empty();
        this.metastoreConfig = Codegen.empty();
        this.preemptibleWorkerConfig = Codegen.empty();
        this.securityConfig = Codegen.empty();
        this.softwareConfig = Codegen.empty();
        this.stagingBucket = Codegen.empty();
        this.tempBucket = Codegen.empty();
        this.workerConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig;
        private @Nullable Output<String> bucket;
        private @Nullable Output<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig;
        private @Nullable Output<ClusterClusterConfigEndpointConfigArgs> endpointConfig;
        private @Nullable Output<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig;
        private @Nullable Output<List<ClusterClusterConfigInitializationActionArgs>> initializationActions;
        private @Nullable Output<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig;
        private @Nullable Output<ClusterClusterConfigMasterConfigArgs> masterConfig;
        private @Nullable Output<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig;
        private @Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig;
        private @Nullable Output<ClusterClusterConfigSecurityConfigArgs> securityConfig;
        private @Nullable Output<ClusterClusterConfigSoftwareConfigArgs> softwareConfig;
        private @Nullable Output<String> stagingBucket;
        private @Nullable Output<String> tempBucket;
        private @Nullable Output<ClusterClusterConfigWorkerConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigArgs defaults) {
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

        public Builder autoscalingConfig(@Nullable Output<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }
        public Builder autoscalingConfig(@Nullable ClusterClusterConfigAutoscalingConfigArgs autoscalingConfig) {
            this.autoscalingConfig = Codegen.ofNullable(autoscalingConfig);
            return this;
        }
        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder encryptionConfig(@Nullable Output<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable ClusterClusterConfigEncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder endpointConfig(@Nullable Output<ClusterClusterConfigEndpointConfigArgs> endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public Builder endpointConfig(@Nullable ClusterClusterConfigEndpointConfigArgs endpointConfig) {
            this.endpointConfig = Codegen.ofNullable(endpointConfig);
            return this;
        }
        public Builder gceClusterConfig(@Nullable Output<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }
        public Builder gceClusterConfig(@Nullable ClusterClusterConfigGceClusterConfigArgs gceClusterConfig) {
            this.gceClusterConfig = Codegen.ofNullable(gceClusterConfig);
            return this;
        }
        public Builder initializationActions(@Nullable Output<List<ClusterClusterConfigInitializationActionArgs>> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }
        public Builder initializationActions(@Nullable List<ClusterClusterConfigInitializationActionArgs> initializationActions) {
            this.initializationActions = Codegen.ofNullable(initializationActions);
            return this;
        }
        public Builder initializationActions(ClusterClusterConfigInitializationActionArgs... initializationActions) {
            return initializationActions(List.of(initializationActions));
        }
        public Builder lifecycleConfig(@Nullable Output<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }
        public Builder lifecycleConfig(@Nullable ClusterClusterConfigLifecycleConfigArgs lifecycleConfig) {
            this.lifecycleConfig = Codegen.ofNullable(lifecycleConfig);
            return this;
        }
        public Builder masterConfig(@Nullable Output<ClusterClusterConfigMasterConfigArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }
        public Builder masterConfig(@Nullable ClusterClusterConfigMasterConfigArgs masterConfig) {
            this.masterConfig = Codegen.ofNullable(masterConfig);
            return this;
        }
        public Builder metastoreConfig(@Nullable Output<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }
        public Builder metastoreConfig(@Nullable ClusterClusterConfigMetastoreConfigArgs metastoreConfig) {
            this.metastoreConfig = Codegen.ofNullable(metastoreConfig);
            return this;
        }
        public Builder preemptibleWorkerConfig(@Nullable Output<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = preemptibleWorkerConfig;
            return this;
        }
        public Builder preemptibleWorkerConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigArgs preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = Codegen.ofNullable(preemptibleWorkerConfig);
            return this;
        }
        public Builder securityConfig(@Nullable Output<ClusterClusterConfigSecurityConfigArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public Builder securityConfig(@Nullable ClusterClusterConfigSecurityConfigArgs securityConfig) {
            this.securityConfig = Codegen.ofNullable(securityConfig);
            return this;
        }
        public Builder softwareConfig(@Nullable Output<ClusterClusterConfigSoftwareConfigArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable ClusterClusterConfigSoftwareConfigArgs softwareConfig) {
            this.softwareConfig = Codegen.ofNullable(softwareConfig);
            return this;
        }
        public Builder stagingBucket(@Nullable Output<String> stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }
        public Builder stagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = Codegen.ofNullable(stagingBucket);
            return this;
        }
        public Builder tempBucket(@Nullable Output<String> tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }
        public Builder tempBucket(@Nullable String tempBucket) {
            this.tempBucket = Codegen.ofNullable(tempBucket);
            return this;
        }
        public Builder workerConfig(@Nullable Output<ClusterClusterConfigWorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }
        public Builder workerConfig(@Nullable ClusterClusterConfigWorkerConfigArgs workerConfig) {
            this.workerConfig = Codegen.ofNullable(workerConfig);
            return this;
        }        public ClusterClusterConfigArgs build() {
            return new ClusterClusterConfigArgs(autoscalingConfig, bucket, encryptionConfig, endpointConfig, gceClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, preemptibleWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}
