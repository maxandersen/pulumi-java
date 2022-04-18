// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.FlowEndpointsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowEndpointsConfigurationResponse {
    /**
     * The connector endpoints.
     * 
     */
    private final @Nullable FlowEndpointsResponse connector;
    /**
     * The workflow endpoints.
     * 
     */
    private final @Nullable FlowEndpointsResponse workflow;

    @CustomType.Constructor
    private FlowEndpointsConfigurationResponse(
        @CustomType.Parameter("connector") @Nullable FlowEndpointsResponse connector,
        @CustomType.Parameter("workflow") @Nullable FlowEndpointsResponse workflow) {
        this.connector = connector;
        this.workflow = workflow;
    }

    /**
     * The connector endpoints.
     * 
    */
    public Optional<FlowEndpointsResponse> connector() {
        return Optional.ofNullable(this.connector);
    }
    /**
     * The workflow endpoints.
     * 
    */
    public Optional<FlowEndpointsResponse> workflow() {
        return Optional.ofNullable(this.workflow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEndpointsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowEndpointsResponse connector;
        private @Nullable FlowEndpointsResponse workflow;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEndpointsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.workflow = defaults.workflow;
        }

        public Builder connector(@Nullable FlowEndpointsResponse connector) {
            this.connector = connector;
            return this;
        }
        public Builder workflow(@Nullable FlowEndpointsResponse workflow) {
            this.workflow = workflow;
            return this;
        }        public FlowEndpointsConfigurationResponse build() {
            return new FlowEndpointsConfigurationResponse(connector, workflow);
        }
    }
}
