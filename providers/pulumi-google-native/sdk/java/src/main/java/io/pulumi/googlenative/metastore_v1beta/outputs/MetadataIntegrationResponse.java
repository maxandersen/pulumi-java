// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.metastore_v1beta.outputs.DataCatalogConfigResponse;
import io.pulumi.googlenative.metastore_v1beta.outputs.DataplexConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class MetadataIntegrationResponse {
    /**
     * The integration config for the Data Catalog service.
     * 
     */
    private final DataCatalogConfigResponse dataCatalogConfig;
    /**
     * The integration config for the Dataplex service.
     * 
     */
    private final DataplexConfigResponse dataplexConfig;

    @OutputCustomType.Constructor
    private MetadataIntegrationResponse(
        @OutputCustomType.Parameter("dataCatalogConfig") DataCatalogConfigResponse dataCatalogConfig,
        @OutputCustomType.Parameter("dataplexConfig") DataplexConfigResponse dataplexConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.dataplexConfig = dataplexConfig;
    }

    /**
     * The integration config for the Data Catalog service.
     * 
    */
    public DataCatalogConfigResponse getDataCatalogConfig() {
        return this.dataCatalogConfig;
    }
    /**
     * The integration config for the Dataplex service.
     * 
    */
    public DataplexConfigResponse getDataplexConfig() {
        return this.dataplexConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataIntegrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCatalogConfigResponse dataCatalogConfig;
        private DataplexConfigResponse dataplexConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataIntegrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogConfig = defaults.dataCatalogConfig;
    	      this.dataplexConfig = defaults.dataplexConfig;
        }

        public Builder setDataCatalogConfig(DataCatalogConfigResponse dataCatalogConfig) {
            this.dataCatalogConfig = Objects.requireNonNull(dataCatalogConfig);
            return this;
        }

        public Builder setDataplexConfig(DataplexConfigResponse dataplexConfig) {
            this.dataplexConfig = Objects.requireNonNull(dataplexConfig);
            return this;
        }
        public MetadataIntegrationResponse build() {
            return new MetadataIntegrationResponse(dataCatalogConfig, dataplexConfig);
        }
    }
}
