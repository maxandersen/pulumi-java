// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.EndpointPropertiesResponseCustomHeaders;
import io.pulumi.azurenative.network.outputs.EndpointPropertiesResponseSubnets;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointResponse {
    /**
     * List of custom headers.
     * 
     */
    private final @Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders;
    /**
     * Specifies the location of the external or nested endpoints when using the 'Performance' traffic routing method.
     * 
     */
    private final @Nullable String endpointLocation;
    /**
     * The monitoring status of the endpoint.
     * 
     */
    private final @Nullable String endpointMonitorStatus;
    /**
     * The status of the endpoint. If the endpoint is Enabled, it is probed for endpoint health and is included in the traffic routing method.
     * 
     */
    private final @Nullable String endpointStatus;
    /**
     * The list of countries/regions mapped to this endpoint when using the 'Geographic' traffic routing method. Please consult Traffic Manager Geographic documentation for a full list of accepted values.
     * 
     */
    private final @Nullable List<String> geoMapping;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
     */
    private final @Nullable String id;
    /**
     * The minimum number of endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    private final @Nullable Double minChildEndpoints;
    /**
     * The minimum number of IPv4 (DNS record type A) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    private final @Nullable Double minChildEndpointsIPv4;
    /**
     * The minimum number of IPv6 (DNS record type AAAA) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    private final @Nullable Double minChildEndpointsIPv6;
    /**
     * The name of the resource
     * 
     */
    private final @Nullable String name;
    /**
     * The priority of this endpoint when using the 'Priority' traffic routing method. Possible values are from 1 to 1000, lower values represent higher priority. This is an optional parameter.  If specified, it must be specified on all endpoints, and no two endpoints can share the same priority value.
     * 
     */
    private final @Nullable Double priority;
    /**
     * The list of subnets, IP addresses, and/or address ranges mapped to this endpoint when using the 'Subnet' traffic routing method. An empty list will match all ranges not covered by other endpoints.
     * 
     */
    private final @Nullable List<EndpointPropertiesResponseSubnets> subnets;
    /**
     * The fully-qualified DNS name or IP address of the endpoint. Traffic Manager returns this value in DNS responses to direct traffic to this endpoint.
     * 
     */
    private final @Nullable String target;
    /**
     * The Azure Resource URI of the of the endpoint. Not applicable to endpoints of type 'ExternalEndpoints'.
     * 
     */
    private final @Nullable String targetResourceId;
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    private final @Nullable String type;
    /**
     * The weight of this endpoint when using the 'Weighted' traffic routing method. Possible values are from 1 to 1000.
     * 
     */
    private final @Nullable Double weight;

    @CustomType.Constructor
    private EndpointResponse(
        @CustomType.Parameter("customHeaders") @Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders,
        @CustomType.Parameter("endpointLocation") @Nullable String endpointLocation,
        @CustomType.Parameter("endpointMonitorStatus") @Nullable String endpointMonitorStatus,
        @CustomType.Parameter("endpointStatus") @Nullable String endpointStatus,
        @CustomType.Parameter("geoMapping") @Nullable List<String> geoMapping,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("minChildEndpoints") @Nullable Double minChildEndpoints,
        @CustomType.Parameter("minChildEndpointsIPv4") @Nullable Double minChildEndpointsIPv4,
        @CustomType.Parameter("minChildEndpointsIPv6") @Nullable Double minChildEndpointsIPv6,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("priority") @Nullable Double priority,
        @CustomType.Parameter("subnets") @Nullable List<EndpointPropertiesResponseSubnets> subnets,
        @CustomType.Parameter("target") @Nullable String target,
        @CustomType.Parameter("targetResourceId") @Nullable String targetResourceId,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("weight") @Nullable Double weight) {
        this.customHeaders = customHeaders;
        this.endpointLocation = endpointLocation;
        this.endpointMonitorStatus = endpointMonitorStatus;
        this.endpointStatus = endpointStatus;
        this.geoMapping = geoMapping;
        this.id = id;
        this.minChildEndpoints = minChildEndpoints;
        this.minChildEndpointsIPv4 = minChildEndpointsIPv4;
        this.minChildEndpointsIPv6 = minChildEndpointsIPv6;
        this.name = name;
        this.priority = priority;
        this.subnets = subnets;
        this.target = target;
        this.targetResourceId = targetResourceId;
        this.type = type;
        this.weight = weight;
    }

    /**
     * List of custom headers.
     * 
    */
    public List<EndpointPropertiesResponseCustomHeaders> customHeaders() {
        return this.customHeaders == null ? List.of() : this.customHeaders;
    }
    /**
     * Specifies the location of the external or nested endpoints when using the 'Performance' traffic routing method.
     * 
    */
    public Optional<String> endpointLocation() {
        return Optional.ofNullable(this.endpointLocation);
    }
    /**
     * The monitoring status of the endpoint.
     * 
    */
    public Optional<String> endpointMonitorStatus() {
        return Optional.ofNullable(this.endpointMonitorStatus);
    }
    /**
     * The status of the endpoint. If the endpoint is Enabled, it is probed for endpoint health and is included in the traffic routing method.
     * 
    */
    public Optional<String> endpointStatus() {
        return Optional.ofNullable(this.endpointStatus);
    }
    /**
     * The list of countries/regions mapped to this endpoint when using the 'Geographic' traffic routing method. Please consult Traffic Manager Geographic documentation for a full list of accepted values.
     * 
    */
    public List<String> geoMapping() {
        return this.geoMapping == null ? List.of() : this.geoMapping;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The minimum number of endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
    */
    public Optional<Double> minChildEndpoints() {
        return Optional.ofNullable(this.minChildEndpoints);
    }
    /**
     * The minimum number of IPv4 (DNS record type A) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
    */
    public Optional<Double> minChildEndpointsIPv4() {
        return Optional.ofNullable(this.minChildEndpointsIPv4);
    }
    /**
     * The minimum number of IPv6 (DNS record type AAAA) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
    */
    public Optional<Double> minChildEndpointsIPv6() {
        return Optional.ofNullable(this.minChildEndpointsIPv6);
    }
    /**
     * The name of the resource
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The priority of this endpoint when using the 'Priority' traffic routing method. Possible values are from 1 to 1000, lower values represent higher priority. This is an optional parameter.  If specified, it must be specified on all endpoints, and no two endpoints can share the same priority value.
     * 
    */
    public Optional<Double> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The list of subnets, IP addresses, and/or address ranges mapped to this endpoint when using the 'Subnet' traffic routing method. An empty list will match all ranges not covered by other endpoints.
     * 
    */
    public List<EndpointPropertiesResponseSubnets> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * The fully-qualified DNS name or IP address of the endpoint. Traffic Manager returns this value in DNS responses to direct traffic to this endpoint.
     * 
    */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * The Azure Resource URI of the of the endpoint. Not applicable to endpoints of type 'ExternalEndpoints'.
     * 
    */
    public Optional<String> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The weight of this endpoint when using the 'Weighted' traffic routing method. Possible values are from 1 to 1000.
     * 
    */
    public Optional<Double> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders;
        private @Nullable String endpointLocation;
        private @Nullable String endpointMonitorStatus;
        private @Nullable String endpointStatus;
        private @Nullable List<String> geoMapping;
        private @Nullable String id;
        private @Nullable Double minChildEndpoints;
        private @Nullable Double minChildEndpointsIPv4;
        private @Nullable Double minChildEndpointsIPv6;
        private @Nullable String name;
        private @Nullable Double priority;
        private @Nullable List<EndpointPropertiesResponseSubnets> subnets;
        private @Nullable String target;
        private @Nullable String targetResourceId;
        private @Nullable String type;
        private @Nullable Double weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.endpointLocation = defaults.endpointLocation;
    	      this.endpointMonitorStatus = defaults.endpointMonitorStatus;
    	      this.endpointStatus = defaults.endpointStatus;
    	      this.geoMapping = defaults.geoMapping;
    	      this.id = defaults.id;
    	      this.minChildEndpoints = defaults.minChildEndpoints;
    	      this.minChildEndpointsIPv4 = defaults.minChildEndpointsIPv4;
    	      this.minChildEndpointsIPv6 = defaults.minChildEndpointsIPv6;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.subnets = defaults.subnets;
    	      this.target = defaults.target;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder customHeaders(@Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(EndpointPropertiesResponseCustomHeaders... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }
        public Builder endpointLocation(@Nullable String endpointLocation) {
            this.endpointLocation = endpointLocation;
            return this;
        }
        public Builder endpointMonitorStatus(@Nullable String endpointMonitorStatus) {
            this.endpointMonitorStatus = endpointMonitorStatus;
            return this;
        }
        public Builder endpointStatus(@Nullable String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public Builder geoMapping(@Nullable List<String> geoMapping) {
            this.geoMapping = geoMapping;
            return this;
        }
        public Builder geoMapping(String... geoMapping) {
            return geoMapping(List.of(geoMapping));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder minChildEndpoints(@Nullable Double minChildEndpoints) {
            this.minChildEndpoints = minChildEndpoints;
            return this;
        }
        public Builder minChildEndpointsIPv4(@Nullable Double minChildEndpointsIPv4) {
            this.minChildEndpointsIPv4 = minChildEndpointsIPv4;
            return this;
        }
        public Builder minChildEndpointsIPv6(@Nullable Double minChildEndpointsIPv6) {
            this.minChildEndpointsIPv6 = minChildEndpointsIPv6;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Double priority) {
            this.priority = priority;
            return this;
        }
        public Builder subnets(@Nullable List<EndpointPropertiesResponseSubnets> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(EndpointPropertiesResponseSubnets... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder weight(@Nullable Double weight) {
            this.weight = weight;
            return this;
        }        public EndpointResponse build() {
            return new EndpointResponse(customHeaders, endpointLocation, endpointMonitorStatus, endpointStatus, geoMapping, id, minChildEndpoints, minChildEndpointsIPv4, minChildEndpointsIPv6, name, priority, subnets, target, targetResourceId, type, weight);
        }
    }
}
