// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.DataConnectorDataTypeCommonResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MCASDataConnectorDataTypesResponse {
    /**
     * Alerts data type connection.
     * 
     */
    private final @Nullable DataConnectorDataTypeCommonResponse alerts;
    /**
     * Discovery log data type connection.
     * 
     */
    private final @Nullable DataConnectorDataTypeCommonResponse discoveryLogs;

    @CustomType.Constructor
    private MCASDataConnectorDataTypesResponse(
        @CustomType.Parameter("alerts") @Nullable DataConnectorDataTypeCommonResponse alerts,
        @CustomType.Parameter("discoveryLogs") @Nullable DataConnectorDataTypeCommonResponse discoveryLogs) {
        this.alerts = alerts;
        this.discoveryLogs = discoveryLogs;
    }

    /**
     * Alerts data type connection.
     * 
    */
    public Optional<DataConnectorDataTypeCommonResponse> alerts() {
        return Optional.ofNullable(this.alerts);
    }
    /**
     * Discovery log data type connection.
     * 
    */
    public Optional<DataConnectorDataTypeCommonResponse> discoveryLogs() {
        return Optional.ofNullable(this.discoveryLogs);
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
