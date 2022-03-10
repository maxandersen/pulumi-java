// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.BigQueryDestinationResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.ConsumptionMeteringConfigResponse;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ResourceUsageExportConfigResponse {
    /**
     * Configuration to use BigQuery as usage export destination.
     * 
     */
    private final BigQueryDestinationResponse bigqueryDestination;
    /**
     * Configuration to enable resource consumption metering.
     * 
     */
    private final ConsumptionMeteringConfigResponse consumptionMeteringConfig;
    /**
     * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
     */
    private final Boolean enableNetworkEgressMetering;

    @OutputCustomType.Constructor
    private ResourceUsageExportConfigResponse(
        @OutputCustomType.Parameter("bigqueryDestination") BigQueryDestinationResponse bigqueryDestination,
        @OutputCustomType.Parameter("consumptionMeteringConfig") ConsumptionMeteringConfigResponse consumptionMeteringConfig,
        @OutputCustomType.Parameter("enableNetworkEgressMetering") Boolean enableNetworkEgressMetering) {
        this.bigqueryDestination = bigqueryDestination;
        this.consumptionMeteringConfig = consumptionMeteringConfig;
        this.enableNetworkEgressMetering = enableNetworkEgressMetering;
    }

    /**
     * Configuration to use BigQuery as usage export destination.
     * 
    */
    public BigQueryDestinationResponse getBigqueryDestination() {
        return this.bigqueryDestination;
    }
    /**
     * Configuration to enable resource consumption metering.
     * 
    */
    public ConsumptionMeteringConfigResponse getConsumptionMeteringConfig() {
        return this.consumptionMeteringConfig;
    }
    /**
     * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
    */
    public Boolean getEnableNetworkEgressMetering() {
        return this.enableNetworkEgressMetering;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceUsageExportConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BigQueryDestinationResponse bigqueryDestination;
        private ConsumptionMeteringConfigResponse consumptionMeteringConfig;
        private Boolean enableNetworkEgressMetering;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceUsageExportConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.consumptionMeteringConfig = defaults.consumptionMeteringConfig;
    	      this.enableNetworkEgressMetering = defaults.enableNetworkEgressMetering;
        }

        public Builder setBigqueryDestination(BigQueryDestinationResponse bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }

        public Builder setConsumptionMeteringConfig(ConsumptionMeteringConfigResponse consumptionMeteringConfig) {
            this.consumptionMeteringConfig = Objects.requireNonNull(consumptionMeteringConfig);
            return this;
        }

        public Builder setEnableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            this.enableNetworkEgressMetering = Objects.requireNonNull(enableNetworkEgressMetering);
            return this;
        }
        public ResourceUsageExportConfigResponse build() {
            return new ResourceUsageExportConfigResponse(bigqueryDestination, consumptionMeteringConfig, enableNetworkEgressMetering);
        }
    }
}
