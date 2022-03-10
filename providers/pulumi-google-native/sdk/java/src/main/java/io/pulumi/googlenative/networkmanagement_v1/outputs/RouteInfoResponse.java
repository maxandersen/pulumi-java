// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouteInfoResponse {
    /**
     * Destination IP range of the route.
     * 
     */
    private final String destIpRange;
    /**
     * Name of a Compute Engine route.
     * 
     */
    private final String displayName;
    /**
     * Instance tags of the route.
     * 
     */
    private final List<String> instanceTags;
    /**
     * URI of a Compute Engine network.
     * 
     */
    private final String networkUri;
    /**
     * Next hop of the route.
     * 
     */
    private final String nextHop;
    /**
     * Type of next hop.
     * 
     */
    private final String nextHopType;
    /**
     * Priority of the route.
     * 
     */
    private final Integer priority;
    /**
     * Type of route.
     * 
     */
    private final String routeType;
    /**
     * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor
    private RouteInfoResponse(
        @OutputCustomType.Parameter("destIpRange") String destIpRange,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("instanceTags") List<String> instanceTags,
        @OutputCustomType.Parameter("networkUri") String networkUri,
        @OutputCustomType.Parameter("nextHop") String nextHop,
        @OutputCustomType.Parameter("nextHopType") String nextHopType,
        @OutputCustomType.Parameter("priority") Integer priority,
        @OutputCustomType.Parameter("routeType") String routeType,
        @OutputCustomType.Parameter("uri") String uri) {
        this.destIpRange = destIpRange;
        this.displayName = displayName;
        this.instanceTags = instanceTags;
        this.networkUri = networkUri;
        this.nextHop = nextHop;
        this.nextHopType = nextHopType;
        this.priority = priority;
        this.routeType = routeType;
        this.uri = uri;
    }

    /**
     * Destination IP range of the route.
     * 
    */
    public String getDestIpRange() {
        return this.destIpRange;
    }
    /**
     * Name of a Compute Engine route.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Instance tags of the route.
     * 
    */
    public List<String> getInstanceTags() {
        return this.instanceTags;
    }
    /**
     * URI of a Compute Engine network.
     * 
    */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Next hop of the route.
     * 
    */
    public String getNextHop() {
        return this.nextHop;
    }
    /**
     * Type of next hop.
     * 
    */
    public String getNextHopType() {
        return this.nextHopType;
    }
    /**
     * Priority of the route.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Type of route.
     * 
    */
    public String getRouteType() {
        return this.routeType;
    }
    /**
     * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destIpRange;
        private String displayName;
        private List<String> instanceTags;
        private String networkUri;
        private String nextHop;
        private String nextHopType;
        private Integer priority;
        private String routeType;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRange = defaults.destIpRange;
    	      this.displayName = defaults.displayName;
    	      this.instanceTags = defaults.instanceTags;
    	      this.networkUri = defaults.networkUri;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopType = defaults.nextHopType;
    	      this.priority = defaults.priority;
    	      this.routeType = defaults.routeType;
    	      this.uri = defaults.uri;
        }

        public Builder setDestIpRange(String destIpRange) {
            this.destIpRange = Objects.requireNonNull(destIpRange);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setInstanceTags(List<String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRouteType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public RouteInfoResponse build() {
            return new RouteInfoResponse(destIpRange, displayName, instanceTags, networkUri, nextHop, nextHopType, priority, routeType, uri);
        }
    }
}
