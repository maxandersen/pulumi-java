// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.metastore_v1beta.outputs.DataCatalogConfigResponse;
import com.pulumi.googlenative.metastore_v1beta.outputs.DataplexConfigResponse;
import java.util.Objects;

@CustomType
public final class MetadataIntegrationResponse {
    /**
     * @return The integration config for the Data Catalog service.
     * 
     */
    private final DataCatalogConfigResponse dataCatalogConfig;
    /**
     * @return The integration config for the Dataplex service.
     * 
     */
    private final DataplexConfigResponse dataplexConfig;

    @CustomType.Constructor
    private MetadataIntegrationResponse(
        @CustomType.Parameter("dataCatalogConfig") DataCatalogConfigResponse dataCatalogConfig,
        @CustomType.Parameter("dataplexConfig") DataplexConfigResponse dataplexConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
        this.dataplexConfig = dataplexConfig;
    }

    /**
     * @return The integration config for the Data Catalog service.
     * 
     */
    public DataCatalogConfigResponse dataCatalogConfig() {
        return this.dataCatalogConfig;
    }
    /**
     * @return The integration config for the Dataplex service.
     * 
     */
    public DataplexConfigResponse dataplexConfig() {
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

        public Builder dataCatalogConfig(DataCatalogConfigResponse dataCatalogConfig) {
            this.dataCatalogConfig = Objects.requireNonNull(dataCatalogConfig);
            return this;
        }
        public Builder dataplexConfig(DataplexConfigResponse dataplexConfig) {
            this.dataplexConfig = Objects.requireNonNull(dataplexConfig);
            return this;
        }        public MetadataIntegrationResponse build() {
            return new MetadataIntegrationResponse(dataCatalogConfig, dataplexConfig);
        }
    }
}
