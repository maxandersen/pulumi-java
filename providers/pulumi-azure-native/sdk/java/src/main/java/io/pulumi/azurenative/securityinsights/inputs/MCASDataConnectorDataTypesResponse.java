// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.DataConnectorDataTypeCommonResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available data types for MCAS (Microsoft Cloud App Security) data connector.
 * 
 */
public final class MCASDataConnectorDataTypesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MCASDataConnectorDataTypesResponse Empty = new MCASDataConnectorDataTypesResponse();

    /**
     * Alerts data type connection.
     * 
     */
    @Import(name="alerts")
      private final @Nullable DataConnectorDataTypeCommonResponse alerts;

    public Optional<DataConnectorDataTypeCommonResponse> alerts() {
        return this.alerts == null ? Optional.empty() : Optional.ofNullable(this.alerts);
    }

    /**
     * Discovery log data type connection.
     * 
     */
    @Import(name="discoveryLogs")
      private final @Nullable DataConnectorDataTypeCommonResponse discoveryLogs;

    public Optional<DataConnectorDataTypeCommonResponse> discoveryLogs() {
        return this.discoveryLogs == null ? Optional.empty() : Optional.ofNullable(this.discoveryLogs);
    }

    public MCASDataConnectorDataTypesResponse(
        @Nullable DataConnectorDataTypeCommonResponse alerts,
        @Nullable DataConnectorDataTypeCommonResponse discoveryLogs) {
        this.alerts = alerts;
        this.discoveryLogs = discoveryLogs;
    }

    private MCASDataConnectorDataTypesResponse() {
        this.alerts = null;
        this.discoveryLogs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MCASDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataConnectorDataTypeCommonResponse alerts;
        private @Nullable DataConnectorDataTypeCommonResponse discoveryLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(MCASDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
    	      this.discoveryLogs = defaults.discoveryLogs;
        }

        public Builder alerts(@Nullable DataConnectorDataTypeCommonResponse alerts) {
            this.alerts = alerts;
            return this;
        }
        public Builder discoveryLogs(@Nullable DataConnectorDataTypeCommonResponse discoveryLogs) {
            this.discoveryLogs = discoveryLogs;
            return this;
        }        public MCASDataConnectorDataTypesResponse build() {
            return new MCASDataConnectorDataTypesResponse(alerts, discoveryLogs);
        }
    }
}
