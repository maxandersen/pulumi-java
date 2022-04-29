// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteCircuitPeeringArgs extends InvokeArgs {

    public static final GetExpressRouteCircuitPeeringArgs Empty = new GetExpressRouteCircuitPeeringArgs();

    /**
     * The name of the express route circuit.
     * 
     */
    @Import(name="circuitName", required=true)
    private String circuitName;

    /**
     * @return The name of the express route circuit.
     * 
     */
    public String circuitName() {
        return this.circuitName;
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private String peeringName;

    /**
     * @return The name of the peering.
     * 
     */
    public String peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetExpressRouteCircuitPeeringArgs() {}

    private GetExpressRouteCircuitPeeringArgs(GetExpressRouteCircuitPeeringArgs $) {
        this.circuitName = $.circuitName;
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExpressRouteCircuitPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExpressRouteCircuitPeeringArgs $;

        public Builder() {
            $ = new GetExpressRouteCircuitPeeringArgs();
        }

        public Builder(GetExpressRouteCircuitPeeringArgs defaults) {
            $ = new GetExpressRouteCircuitPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param circuitName The name of the express route circuit.
         * 
         * @return builder
         * 
         */
        public Builder circuitName(String circuitName) {
            $.circuitName = circuitName;
            return this;
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetExpressRouteCircuitPeeringArgs build() {
            $.circuitName = Objects.requireNonNull($.circuitName, "expected parameter 'circuitName' to be non-null");
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
