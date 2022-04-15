// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The available logging options for this subnetwork.
 * 
 */
public final class SubnetworkLogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubnetworkLogConfigResponse Empty = new SubnetworkLogConfigResponse();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    @Import(name="aggregationInterval", required=true)
      private final String aggregationInterval;

    public String aggregationInterval() {
        return this.aggregationInterval;
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled.
     * 
     */
    @Import(name="enable", required=true)
      private final Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
     * 
     */
    @Import(name="filterExpr", required=true)
      private final String filterExpr;

    public String filterExpr() {
        return this.filterExpr;
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    @Import(name="flowSampling", required=true)
      private final Double flowSampling;

    public Double flowSampling() {
        return this.flowSampling;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    @Import(name="metadata", required=true)
      private final String metadata;

    public String metadata() {
        return this.metadata;
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
     * 
     */
    @Import(name="metadataFields", required=true)
      private final List<String> metadataFields;

    public List<String> metadataFields() {
        return this.metadataFields;
    }

    public SubnetworkLogConfigResponse(
        String aggregationInterval,
        Boolean enable,
        String filterExpr,
        Double flowSampling,
        String metadata,
        List<String> metadataFields) {
        this.aggregationInterval = Objects.requireNonNull(aggregationInterval, "expected parameter 'aggregationInterval' to be non-null");
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.filterExpr = Objects.requireNonNull(filterExpr, "expected parameter 'filterExpr' to be non-null");
        this.flowSampling = Objects.requireNonNull(flowSampling, "expected parameter 'flowSampling' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.metadataFields = Objects.requireNonNull(metadataFields, "expected parameter 'metadataFields' to be non-null");
    }

    private SubnetworkLogConfigResponse() {
        this.aggregationInterval = null;
        this.enable = null;
        this.filterExpr = null;
        this.flowSampling = null;
        this.metadata = null;
        this.metadataFields = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationInterval;
        private Boolean enable;
        private String filterExpr;
        private Double flowSampling;
        private String metadata;
        private List<String> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.enable = defaults.enable;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder aggregationInterval(String aggregationInterval) {
            this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder filterExpr(String filterExpr) {
            this.filterExpr = Objects.requireNonNull(filterExpr);
            return this;
        }
        public Builder flowSampling(Double flowSampling) {
            this.flowSampling = Objects.requireNonNull(flowSampling);
            return this;
        }
        public Builder metadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder metadataFields(List<String> metadataFields) {
            this.metadataFields = Objects.requireNonNull(metadataFields);
            return this;
        }
        public Builder metadataFields(String... metadataFields) {
            return metadataFields(List.of(metadataFields));
        }        public SubnetworkLogConfigResponse build() {
            return new SubnetworkLogConfigResponse(aggregationInterval, enable, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}
