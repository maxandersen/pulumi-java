// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.globalaccelerator.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for a given endpoint
 * 
 */
public final class EndpointGroupEndpointConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointGroupEndpointConfigurationArgs Empty = new EndpointGroupEndpointConfigurationArgs();

    /**
     * true if client ip should be preserved
     * 
     */
    @Import(name="clientIPPreservationEnabled")
    private @Nullable Output<Boolean> clientIPPreservationEnabled;

    public Optional<Output<Boolean>> clientIPPreservationEnabled() {
        return Optional.ofNullable(this.clientIPPreservationEnabled);
    }

    /**
     * Id of the endpoint. For Network/Application Load Balancer this value is the ARN.  For EIP, this value is the allocation ID.  For EC2 instances, this is the EC2 instance ID
     * 
     */
    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    public Output<String> endpointId() {
        return this.endpointId;
    }

    /**
     * The weight for the endpoint.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private EndpointGroupEndpointConfigurationArgs() {}

    private EndpointGroupEndpointConfigurationArgs(EndpointGroupEndpointConfigurationArgs $) {
        this.clientIPPreservationEnabled = $.clientIPPreservationEnabled;
        this.endpointId = $.endpointId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointGroupEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointGroupEndpointConfigurationArgs $;

        public Builder() {
            $ = new EndpointGroupEndpointConfigurationArgs();
        }

        public Builder(EndpointGroupEndpointConfigurationArgs defaults) {
            $ = new EndpointGroupEndpointConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientIPPreservationEnabled(@Nullable Output<Boolean> clientIPPreservationEnabled) {
            $.clientIPPreservationEnabled = clientIPPreservationEnabled;
            return this;
        }

        public Builder clientIPPreservationEnabled(Boolean clientIPPreservationEnabled) {
            return clientIPPreservationEnabled(Output.of(clientIPPreservationEnabled));
        }

        public Builder endpointId(Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public EndpointGroupEndpointConfigurationArgs build() {
            $.endpointId = Objects.requireNonNull($.endpointId, "expected parameter 'endpointId' to be non-null");
            return $;
        }
    }

}
