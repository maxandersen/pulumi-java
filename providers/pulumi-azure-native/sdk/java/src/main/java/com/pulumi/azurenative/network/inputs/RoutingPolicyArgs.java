// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The routing policy object used in a RoutingIntent resource.
 * 
 */
public final class RoutingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingPolicyArgs Empty = new RoutingPolicyArgs();

    /**
     * List of all destinations which this routing policy is applicable to (for example: Internet, PrivateTraffic).
     * 
     */
    @Import(name="destinations", required=true)
    private Output<List<String>> destinations;

    public Output<List<String>> destinations() {
        return this.destinations;
    }

    /**
     * The unique name for the routing policy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The next hop resource id on which this routing policy is applicable to.
     * 
     */
    @Import(name="nextHop", required=true)
    private Output<String> nextHop;

    public Output<String> nextHop() {
        return this.nextHop;
    }

    private RoutingPolicyArgs() {}

    private RoutingPolicyArgs(RoutingPolicyArgs $) {
        this.destinations = $.destinations;
        this.name = $.name;
        this.nextHop = $.nextHop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingPolicyArgs $;

        public Builder() {
            $ = new RoutingPolicyArgs();
        }

        public Builder(RoutingPolicyArgs defaults) {
            $ = new RoutingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinations(Output<List<String>> destinations) {
            $.destinations = destinations;
            return this;
        }

        public Builder destinations(List<String> destinations) {
            return destinations(Output.of(destinations));
        }

        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder nextHop(Output<String> nextHop) {
            $.nextHop = nextHop;
            return this;
        }

        public Builder nextHop(String nextHop) {
            return nextHop(Output.of(nextHop));
        }

        public RoutingPolicyArgs build() {
            $.destinations = Objects.requireNonNull($.destinations, "expected parameter 'destinations' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.nextHop = Objects.requireNonNull($.nextHop, "expected parameter 'nextHop' to be non-null");
            return $;
        }
    }

}
