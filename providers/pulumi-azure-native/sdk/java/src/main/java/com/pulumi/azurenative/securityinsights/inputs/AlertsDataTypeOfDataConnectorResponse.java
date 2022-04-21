// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.DataConnectorDataTypeCommonResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Alerts data type for data connectors.
 * 
 */
public final class AlertsDataTypeOfDataConnectorResponse extends com.pulumi.resources.InvokeArgs {

    public static final AlertsDataTypeOfDataConnectorResponse Empty = new AlertsDataTypeOfDataConnectorResponse();

    /**
     * Alerts data type connection.
     * 
     */
    @Import(name="alerts")
    private @Nullable DataConnectorDataTypeCommonResponse alerts;

    public Optional<DataConnectorDataTypeCommonResponse> alerts() {
        return Optional.ofNullable(this.alerts);
    }

    private AlertsDataTypeOfDataConnectorResponse() {}

    private AlertsDataTypeOfDataConnectorResponse(AlertsDataTypeOfDataConnectorResponse $) {
        this.alerts = $.alerts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertsDataTypeOfDataConnectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertsDataTypeOfDataConnectorResponse $;

        public Builder() {
            $ = new AlertsDataTypeOfDataConnectorResponse();
        }

        public Builder(AlertsDataTypeOfDataConnectorResponse defaults) {
            $ = new AlertsDataTypeOfDataConnectorResponse(Objects.requireNonNull(defaults));
        }

        public Builder alerts(@Nullable DataConnectorDataTypeCommonResponse alerts) {
            $.alerts = alerts;
            return this;
        }

        public AlertsDataTypeOfDataConnectorResponse build() {
            return $;
        }
    }

}
