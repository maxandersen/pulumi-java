// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.DataConnectorDataTypeCommonArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available data types for MCAS (Microsoft Cloud App Security) data connector.
 * 
 */
public final class MCASDataConnectorDataTypesArgs extends ResourceArgs {

    public static final MCASDataConnectorDataTypesArgs Empty = new MCASDataConnectorDataTypesArgs();

    /**
     * Alerts data type connection.
     * 
     */
    @Import(name="alerts")
    private @Nullable Output<DataConnectorDataTypeCommonArgs> alerts;

    /**
     * @return Alerts data type connection.
     * 
     */
    public Optional<Output<DataConnectorDataTypeCommonArgs>> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    /**
     * Discovery log data type connection.
     * 
     */
    @Import(name="discoveryLogs")
    private @Nullable Output<DataConnectorDataTypeCommonArgs> discoveryLogs;

    /**
     * @return Discovery log data type connection.
     * 
     */
    public Optional<Output<DataConnectorDataTypeCommonArgs>> discoveryLogs() {
        return Optional.ofNullable(this.discoveryLogs);
    }

    private MCASDataConnectorDataTypesArgs() {}

    private MCASDataConnectorDataTypesArgs(MCASDataConnectorDataTypesArgs $) {
        this.alerts = $.alerts;
        this.discoveryLogs = $.discoveryLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MCASDataConnectorDataTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MCASDataConnectorDataTypesArgs $;

        public Builder() {
            $ = new MCASDataConnectorDataTypesArgs();
        }

        public Builder(MCASDataConnectorDataTypesArgs defaults) {
            $ = new MCASDataConnectorDataTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts Alerts data type connection.
         * 
         * @return builder
         * 
         */
        public Builder alerts(@Nullable Output<DataConnectorDataTypeCommonArgs> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts Alerts data type connection.
         * 
         * @return builder
         * 
         */
        public Builder alerts(DataConnectorDataTypeCommonArgs alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param discoveryLogs Discovery log data type connection.
         * 
         * @return builder
         * 
         */
        public Builder discoveryLogs(@Nullable Output<DataConnectorDataTypeCommonArgs> discoveryLogs) {
            $.discoveryLogs = discoveryLogs;
            return this;
        }

        /**
         * @param discoveryLogs Discovery log data type connection.
         * 
         * @return builder
         * 
         */
        public Builder discoveryLogs(DataConnectorDataTypeCommonArgs discoveryLogs) {
            return discoveryLogs(Output.of(discoveryLogs));
        }

        public MCASDataConnectorDataTypesArgs build() {
            return $;
        }
    }

}
