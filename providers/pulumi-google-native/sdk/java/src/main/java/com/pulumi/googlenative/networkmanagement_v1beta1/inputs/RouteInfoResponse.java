// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine route.
 * 
 */
public final class RouteInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouteInfoResponse Empty = new RouteInfoResponse();

    /**
     * Destination IP range of the route.
     * 
     */
    @Import(name="destIpRange", required=true)
      private final String destIpRange;

    public String destIpRange() {
        return this.destIpRange;
    }

    /**
     * Name of a Compute Engine route.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Instance tags of the route.
     * 
     */
    @Import(name="instanceTags", required=true)
      private final List<String> instanceTags;

    public List<String> instanceTags() {
        return this.instanceTags;
    }

    /**
     * URI of a Compute Engine network.
     * 
     */
    @Import(name="networkUri", required=true)
      private final String networkUri;

    public String networkUri() {
        return this.networkUri;
    }

    /**
     * Next hop of the route.
     * 
     */
    @Import(name="nextHop", required=true)
      private final String nextHop;

    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Type of next hop.
     * 
     */
    @Import(name="nextHopType", required=true)
      private final String nextHopType;

    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Priority of the route.
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    /**
     * Type of route.
     * 
     */
    @Import(name="routeType", required=true)
      private final String routeType;

    public String routeType() {
        return this.routeType;
    }

    /**
     * URI of a Compute Engine route. Dynamic route from cloud router does not have a URI. Advertised route from Google Cloud VPC to on-premises network also does not have a URI.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public RouteInfoResponse(
        String destIpRange,
        String displayName,
        List<String> instanceTags,
        String networkUri,
        String nextHop,
        String nextHopType,
        Integer priority,
        String routeType,
        String uri) {
        this.destIpRange = Objects.requireNonNull(destIpRange, "expected parameter 'destIpRange' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.instanceTags = Objects.requireNonNull(instanceTags, "expected parameter 'instanceTags' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.nextHop = Objects.requireNonNull(nextHop, "expected parameter 'nextHop' to be non-null");
        this.nextHopType = Objects.requireNonNull(nextHopType, "expected parameter 'nextHopType' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeType = Objects.requireNonNull(routeType, "expected parameter 'routeType' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private RouteInfoResponse() {
        this.destIpRange = null;
        this.displayName = null;
        this.instanceTags = List.of();
        this.networkUri = null;
        this.nextHop = null;
        this.nextHopType = null;
        this.priority = null;
        this.routeType = null;
        this.uri = null;
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

        public Builder destIpRange(String destIpRange) {
            this.destIpRange = Objects.requireNonNull(destIpRange);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder instanceTags(List<String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }
        public Builder instanceTags(String... instanceTags) {
            return instanceTags(List.of(instanceTags));
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        public Builder nextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public RouteInfoResponse build() {
            return new RouteInfoResponse(destIpRange, displayName, instanceTags, networkUri, nextHop, nextHopType, priority, routeType, uri);
        }
    }
}
