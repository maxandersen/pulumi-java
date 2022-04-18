// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ElasticCloudDeploymentResponse {
    /**
     * Associated Azure subscription Id for the elastic deployment.
     * 
     */
    private final String azureSubscriptionId;
    /**
     * Elastic deployment Id
     * 
     */
    private final String deploymentId;
    /**
     * Region where Deployment at Elastic side took place.
     * 
     */
    private final String elasticsearchRegion;
    /**
     * Elasticsearch ingestion endpoint of the Elastic deployment.
     * 
     */
    private final String elasticsearchServiceUrl;
    /**
     * Kibana endpoint of the Elastic deployment.
     * 
     */
    private final String kibanaServiceUrl;
    /**
     * Kibana dashboard sso URL of the Elastic deployment.
     * 
     */
    private final String kibanaSsoUrl;
    /**
     * Elastic deployment name
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ElasticCloudDeploymentResponse(
        @CustomType.Parameter("azureSubscriptionId") String azureSubscriptionId,
        @CustomType.Parameter("deploymentId") String deploymentId,
        @CustomType.Parameter("elasticsearchRegion") String elasticsearchRegion,
        @CustomType.Parameter("elasticsearchServiceUrl") String elasticsearchServiceUrl,
        @CustomType.Parameter("kibanaServiceUrl") String kibanaServiceUrl,
        @CustomType.Parameter("kibanaSsoUrl") String kibanaSsoUrl,
        @CustomType.Parameter("name") String name) {
        this.azureSubscriptionId = azureSubscriptionId;
        this.deploymentId = deploymentId;
        this.elasticsearchRegion = elasticsearchRegion;
        this.elasticsearchServiceUrl = elasticsearchServiceUrl;
        this.kibanaServiceUrl = kibanaServiceUrl;
        this.kibanaSsoUrl = kibanaSsoUrl;
        this.name = name;
    }

    /**
     * Associated Azure subscription Id for the elastic deployment.
     * 
    */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * Elastic deployment Id
     * 
    */
    public String deploymentId() {
        return this.deploymentId;
    }
    /**
     * Region where Deployment at Elastic side took place.
     * 
    */
    public String elasticsearchRegion() {
        return this.elasticsearchRegion;
    }
    /**
     * Elasticsearch ingestion endpoint of the Elastic deployment.
     * 
    */
    public String elasticsearchServiceUrl() {
        return this.elasticsearchServiceUrl;
    }
    /**
     * Kibana endpoint of the Elastic deployment.
     * 
    */
    public String kibanaServiceUrl() {
        return this.kibanaServiceUrl;
    }
    /**
     * Kibana dashboard sso URL of the Elastic deployment.
     * 
    */
    public String kibanaSsoUrl() {
        return this.kibanaSsoUrl;
    }
    /**
     * Elastic deployment name
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticCloudDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureSubscriptionId;
        private String deploymentId;
        private String elasticsearchRegion;
        private String elasticsearchServiceUrl;
        private String kibanaServiceUrl;
        private String kibanaSsoUrl;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticCloudDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.elasticsearchRegion = defaults.elasticsearchRegion;
    	      this.elasticsearchServiceUrl = defaults.elasticsearchServiceUrl;
    	      this.kibanaServiceUrl = defaults.kibanaServiceUrl;
    	      this.kibanaSsoUrl = defaults.kibanaSsoUrl;
    	      this.name = defaults.name;
        }

        public Builder azureSubscriptionId(String azureSubscriptionId) {
            this.azureSubscriptionId = Objects.requireNonNull(azureSubscriptionId);
            return this;
        }
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public Builder elasticsearchRegion(String elasticsearchRegion) {
            this.elasticsearchRegion = Objects.requireNonNull(elasticsearchRegion);
            return this;
        }
        public Builder elasticsearchServiceUrl(String elasticsearchServiceUrl) {
            this.elasticsearchServiceUrl = Objects.requireNonNull(elasticsearchServiceUrl);
            return this;
        }
        public Builder kibanaServiceUrl(String kibanaServiceUrl) {
            this.kibanaServiceUrl = Objects.requireNonNull(kibanaServiceUrl);
            return this;
        }
        public Builder kibanaSsoUrl(String kibanaSsoUrl) {
            this.kibanaSsoUrl = Objects.requireNonNull(kibanaSsoUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ElasticCloudDeploymentResponse build() {
            return new ElasticCloudDeploymentResponse(azureSubscriptionId, deploymentId, elasticsearchRegion, elasticsearchServiceUrl, kibanaServiceUrl, kibanaSsoUrl, name);
        }
    }
}
