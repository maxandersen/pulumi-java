// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1.outputs.MetastoreConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkHistoryServerConfigResponse;
import java.util.Objects;

@CustomType
public final class AuxiliaryServicesConfigResponse {
    /**
     * @return Optional. The Hive Metastore configuration for this workload.
     * 
     */
    private final MetastoreConfigResponse metastoreConfig;
    /**
     * @return Optional. The Spark History Server configuration for the workload.
     * 
     */
    private final SparkHistoryServerConfigResponse sparkHistoryServerConfig;

    @CustomType.Constructor
    private AuxiliaryServicesConfigResponse(
        @CustomType.Parameter("metastoreConfig") MetastoreConfigResponse metastoreConfig,
        @CustomType.Parameter("sparkHistoryServerConfig") SparkHistoryServerConfigResponse sparkHistoryServerConfig) {
        this.metastoreConfig = metastoreConfig;
        this.sparkHistoryServerConfig = sparkHistoryServerConfig;
    }

    /**
     * @return Optional. The Hive Metastore configuration for this workload.
     * 
     */
    public MetastoreConfigResponse metastoreConfig() {
        return this.metastoreConfig;
    }
    /**
     * @return Optional. The Spark History Server configuration for the workload.
     * 
     */
    public SparkHistoryServerConfigResponse sparkHistoryServerConfig() {
        return this.sparkHistoryServerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuxiliaryServicesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreConfigResponse metastoreConfig;
        private SparkHistoryServerConfigResponse sparkHistoryServerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AuxiliaryServicesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.sparkHistoryServerConfig = defaults.sparkHistoryServerConfig;
        }

        public Builder metastoreConfig(MetastoreConfigResponse metastoreConfig) {
            this.metastoreConfig = Objects.requireNonNull(metastoreConfig);
            return this;
        }
        public Builder sparkHistoryServerConfig(SparkHistoryServerConfigResponse sparkHistoryServerConfig) {
            this.sparkHistoryServerConfig = Objects.requireNonNull(sparkHistoryServerConfig);
            return this;
        }        public AuxiliaryServicesConfigResponse build() {
            return new AuxiliaryServicesConfigResponse(metastoreConfig, sparkHistoryServerConfig);
        }
    }
}
