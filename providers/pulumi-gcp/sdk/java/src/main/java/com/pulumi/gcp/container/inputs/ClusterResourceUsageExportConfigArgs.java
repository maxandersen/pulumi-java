// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigBigqueryDestinationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterResourceUsageExportConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterResourceUsageExportConfigArgs Empty = new ClusterResourceUsageExportConfigArgs();

    /**
     * Parameters for using BigQuery as the destination of resource usage export.
     * 
     */
    @Import(name="bigqueryDestination", required=true)
    private Output<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination;

    public Output<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination() {
        return this.bigqueryDestination;
    }

    /**
     * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created
     * in the cluster to meter network egress traffic.
     * 
     */
    @Import(name="enableNetworkEgressMetering")
    private @Nullable Output<Boolean> enableNetworkEgressMetering;

    public Optional<Output<Boolean>> enableNetworkEgressMetering() {
        return Optional.ofNullable(this.enableNetworkEgressMetering);
    }

    /**
     * Whether to enable resource
     * consumption metering on this cluster. When enabled, a table will be created in
     * the resource export BigQuery dataset to store resource consumption data. The
     * resulting table can be joined with the resource usage table or with BigQuery
     * billing export. Defaults to `true`.
     * 
     */
    @Import(name="enableResourceConsumptionMetering")
    private @Nullable Output<Boolean> enableResourceConsumptionMetering;

    public Optional<Output<Boolean>> enableResourceConsumptionMetering() {
        return Optional.ofNullable(this.enableResourceConsumptionMetering);
    }

    private ClusterResourceUsageExportConfigArgs() {}

    private ClusterResourceUsageExportConfigArgs(ClusterResourceUsageExportConfigArgs $) {
        this.bigqueryDestination = $.bigqueryDestination;
        this.enableNetworkEgressMetering = $.enableNetworkEgressMetering;
        this.enableResourceConsumptionMetering = $.enableResourceConsumptionMetering;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterResourceUsageExportConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterResourceUsageExportConfigArgs $;

        public Builder() {
            $ = new ClusterResourceUsageExportConfigArgs();
        }

        public Builder(ClusterResourceUsageExportConfigArgs defaults) {
            $ = new ClusterResourceUsageExportConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bigqueryDestination(Output<ClusterResourceUsageExportConfigBigqueryDestinationArgs> bigqueryDestination) {
            $.bigqueryDestination = bigqueryDestination;
            return this;
        }

        public Builder bigqueryDestination(ClusterResourceUsageExportConfigBigqueryDestinationArgs bigqueryDestination) {
            return bigqueryDestination(Output.of(bigqueryDestination));
        }

        public Builder enableNetworkEgressMetering(@Nullable Output<Boolean> enableNetworkEgressMetering) {
            $.enableNetworkEgressMetering = enableNetworkEgressMetering;
            return this;
        }

        public Builder enableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            return enableNetworkEgressMetering(Output.of(enableNetworkEgressMetering));
        }

        public Builder enableResourceConsumptionMetering(@Nullable Output<Boolean> enableResourceConsumptionMetering) {
            $.enableResourceConsumptionMetering = enableResourceConsumptionMetering;
            return this;
        }

        public Builder enableResourceConsumptionMetering(Boolean enableResourceConsumptionMetering) {
            return enableResourceConsumptionMetering(Output.of(enableResourceConsumptionMetering));
        }

        public ClusterResourceUsageExportConfigArgs build() {
            $.bigqueryDestination = Objects.requireNonNull($.bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
            return $;
        }
    }

}
