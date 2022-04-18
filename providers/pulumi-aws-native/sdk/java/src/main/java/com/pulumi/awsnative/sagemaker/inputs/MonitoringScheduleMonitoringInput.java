// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleEndpointInput;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringInput extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringInput Empty = new MonitoringScheduleMonitoringInput();

    @Import(name="endpointInput", required=true)
      private final MonitoringScheduleEndpointInput endpointInput;

    public MonitoringScheduleEndpointInput endpointInput() {
        return this.endpointInput;
    }

    public MonitoringScheduleMonitoringInput(MonitoringScheduleEndpointInput endpointInput) {
        this.endpointInput = Objects.requireNonNull(endpointInput, "expected parameter 'endpointInput' to be non-null");
    }

    private MonitoringScheduleMonitoringInput() {
        this.endpointInput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleEndpointInput endpointInput;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
        }

        public Builder endpointInput(MonitoringScheduleEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }        public MonitoringScheduleMonitoringInput build() {
            return new MonitoringScheduleMonitoringInput(endpointInput);
        }
    }
}
