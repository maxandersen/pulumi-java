// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.BackendServiceCompressionMode;
import com.pulumi.googlenative.compute_beta.enums.BackendServiceLoadBalancingScheme;
import com.pulumi.googlenative.compute_beta.enums.BackendServiceLocalityLbPolicy;
import com.pulumi.googlenative.compute_beta.enums.BackendServiceProtocol;
import com.pulumi.googlenative.compute_beta.enums.BackendServiceSessionAffinity;
import com.pulumi.googlenative.compute_beta.inputs.BackendArgs;
import com.pulumi.googlenative.compute_beta.inputs.BackendServiceCdnPolicyArgs;
import com.pulumi.googlenative.compute_beta.inputs.BackendServiceConnectionTrackingPolicyArgs;
import com.pulumi.googlenative.compute_beta.inputs.BackendServiceFailoverPolicyArgs;
import com.pulumi.googlenative.compute_beta.inputs.BackendServiceIAPArgs;
import com.pulumi.googlenative.compute_beta.inputs.BackendServiceLogConfigArgs;
import com.pulumi.googlenative.compute_beta.inputs.CircuitBreakersArgs;
import com.pulumi.googlenative.compute_beta.inputs.ConnectionDrainingArgs;
import com.pulumi.googlenative.compute_beta.inputs.ConsistentHashLoadBalancerSettingsArgs;
import com.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import com.pulumi.googlenative.compute_beta.inputs.OutlierDetectionArgs;
import com.pulumi.googlenative.compute_beta.inputs.SecuritySettingsArgs;
import com.pulumi.googlenative.compute_beta.inputs.SubsettingArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceArgs Empty = new BackendServiceArgs();

    /**
     * Lifetime of cookies in seconds. This setting is applicable to external and internal HTTP(S) load balancers and Traffic Director and requires GENERATED_COOKIE or HTTP_COOKIE session affinity. If set to 0, the cookie is non-persistent and lasts only until the end of the browser session (or equivalent). The maximum allowed value is one day (86,400). Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="affinityCookieTtlSec")
    private @Nullable Output<Integer> affinityCookieTtlSec;

    public Optional<Output<Integer>> affinityCookieTtlSec() {
        return Optional.ofNullable(this.affinityCookieTtlSec);
    }

    /**
     * The list of backends that serve this BackendService.
     * 
     */
    @Import(name="backends")
    private @Nullable Output<List<BackendArgs>> backends;

    public Optional<Output<List<BackendArgs>>> backends() {
        return Optional.ofNullable(this.backends);
    }

    /**
     * Cloud CDN configuration for this BackendService. Only available for specified load balancer types.
     * 
     */
    @Import(name="cdnPolicy")
    private @Nullable Output<BackendServiceCdnPolicyArgs> cdnPolicy;

    public Optional<Output<BackendServiceCdnPolicyArgs>> cdnPolicy() {
        return Optional.ofNullable(this.cdnPolicy);
    }

    @Import(name="circuitBreakers")
    private @Nullable Output<CircuitBreakersArgs> circuitBreakers;

    public Optional<Output<CircuitBreakersArgs>> circuitBreakers() {
        return Optional.ofNullable(this.circuitBreakers);
    }

    /**
     * Compress text responses using Brotli or gzip compression, based on the client&#39;s Accept-Encoding header.
     * 
     */
    @Import(name="compressionMode")
    private @Nullable Output<BackendServiceCompressionMode> compressionMode;

    public Optional<Output<BackendServiceCompressionMode>> compressionMode() {
        return Optional.ofNullable(this.compressionMode);
    }

    @Import(name="connectionDraining")
    private @Nullable Output<ConnectionDrainingArgs> connectionDraining;

    public Optional<Output<ConnectionDrainingArgs>> connectionDraining() {
        return Optional.ofNullable(this.connectionDraining);
    }

    /**
     * Connection Tracking configuration for this BackendService. Connection tracking policy settings are only available for Network Load Balancing and Internal TCP/UDP Load Balancing.
     * 
     */
    @Import(name="connectionTrackingPolicy")
    private @Nullable Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy;

    public Optional<Output<BackendServiceConnectionTrackingPolicyArgs>> connectionTrackingPolicy() {
        return Optional.ofNullable(this.connectionTrackingPolicy);
    }

    /**
     * Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP headers, cookies or other properties. This load balancing policy is applicable only for HTTP connections. The affinity to a particular destination host will be lost when one or more hosts are added/removed from the destination service. This field specifies parameters that control consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or RING_HASH. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="consistentHash")
    private @Nullable Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash;

    public Optional<Output<ConsistentHashLoadBalancerSettingsArgs>> consistentHash() {
        return Optional.ofNullable(this.consistentHash);
    }

    /**
     * Headers that the load balancer adds to proxied requests. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    @Import(name="customRequestHeaders")
    private @Nullable Output<List<String>> customRequestHeaders;

    public Optional<Output<List<String>>> customRequestHeaders() {
        return Optional.ofNullable(this.customRequestHeaders);
    }

    /**
     * Headers that the load balancer adds to proxied responses. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    @Import(name="customResponseHeaders")
    private @Nullable Output<List<String>> customResponseHeaders;

    public Optional<Output<List<String>>> customResponseHeaders() {
        return Optional.ofNullable(this.customResponseHeaders);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If true, enables Cloud CDN for the backend service of an external HTTP(S) load balancer.
     * 
     */
    @Import(name="enableCDN")
    private @Nullable Output<Boolean> enableCDN;

    public Optional<Output<Boolean>> enableCDN() {
        return Optional.ofNullable(this.enableCDN);
    }

    /**
     * Requires at least one backend instance group to be defined as a backup (failover) backend. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    @Import(name="failoverPolicy")
    private @Nullable Output<BackendServiceFailoverPolicyArgs> failoverPolicy;

    public Optional<Output<BackendServiceFailoverPolicyArgs>> failoverPolicy() {
        return Optional.ofNullable(this.failoverPolicy);
    }

    /**
     * The list of URLs to the healthChecks, httpHealthChecks (legacy), or httpsHealthChecks (legacy) resource for health checking this backend service. Not all backend services support legacy health checks. See Load balancer guide. Currently, at most one health check can be specified for each backend service. Backend services with instance group or zonal NEG backends must have a health check. Backend services with internet or serverless NEG backends must not have a health check.
     * 
     */
    @Import(name="healthChecks")
    private @Nullable Output<List<String>> healthChecks;

    public Optional<Output<List<String>>> healthChecks() {
        return Optional.ofNullable(this.healthChecks);
    }

    /**
     * The configurations for Identity-Aware Proxy on this resource. Not available for Internal TCP/UDP Load Balancing and Network Load Balancing.
     * 
     */
    @Import(name="iap")
    private @Nullable Output<BackendServiceIAPArgs> iap;

    public Optional<Output<BackendServiceIAPArgs>> iap() {
        return Optional.ofNullable(this.iap);
    }

    /**
     * Specifies the load balancer type. A backend service created for one type of load balancer cannot be used with another. For more information, refer to Choosing a load balancer.
     * 
     */
    @Import(name="loadBalancingScheme")
    private @Nullable Output<BackendServiceLoadBalancingScheme> loadBalancingScheme;

    public Optional<Output<BackendServiceLoadBalancingScheme>> loadBalancingScheme() {
        return Optional.ofNullable(this.loadBalancingScheme);
    }

    /**
     * The load balancing algorithm used within the scope of the locality. The possible values are: - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests. - RING_HASH: The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests. - RANDOM: The load balancer selects a random healthy host. - ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer. - MAGLEV: used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824 This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. If sessionAffinity is not NONE, and this field is not set to MAGLEV or RING_HASH, session affinity settings will not take effect. Only ROUND_ROBIN and RING_HASH are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="localityLbPolicy")
    private @Nullable Output<BackendServiceLocalityLbPolicy> localityLbPolicy;

    public Optional<Output<BackendServiceLocalityLbPolicy>> localityLbPolicy() {
        return Optional.ofNullable(this.localityLbPolicy);
    }

    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service. If logging is enabled, logs will be exported to Stackdriver.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<BackendServiceLogConfigArgs> logConfig;

    public Optional<Output<BackendServiceLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed. If not specified, there will be no timeout limit, i.e. the maximum duration is infinite. This value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service. This field is only allowed when the loadBalancingScheme of the backend service is INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="maxStreamDuration")
    private @Nullable Output<DurationArgs> maxStreamDuration;

    public Optional<Output<DurationArgs>> maxStreamDuration() {
        return Optional.ofNullable(this.maxStreamDuration);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the network to which this backend service belongs. This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service. If not set, this feature is considered disabled. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="outlierDetection")
    private @Nullable Output<OutlierDetectionArgs> outlierDetection;

    public Optional<Output<OutlierDetectionArgs>> outlierDetection() {
        return Optional.ofNullable(this.outlierDetection);
    }

    /**
     * A named port on a backend instance group representing the port for communication to the backend VMs in that group. The named port must be [defined on each backend instance group](https://cloud.google.com/load-balancing/docs/backend-service#named_ports). This parameter has no meaning if the backends are NEGs. For Internal TCP/UDP Load Balancing and Network Load Balancing, omit port_name.
     * 
     */
    @Import(name="portName")
    private @Nullable Output<String> portName;

    public Optional<Output<String>> portName() {
        return Optional.ofNullable(this.portName);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The protocol this BackendService uses to communicate with backends. Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic Director configuration. Refer to the documentation for the load balancers or for Traffic Director for more information. Must be set to GRPC when the backend service is referenced by a URL map that is bound to target gRPC proxy.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<BackendServiceProtocol> protocol;

    public Optional<Output<BackendServiceProtocol>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * This field specifies the security settings that apply to this backend service. This field is applicable to a global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="securitySettings")
    private @Nullable Output<SecuritySettingsArgs> securitySettings;

    public Optional<Output<SecuritySettingsArgs>> securitySettings() {
        return Optional.ofNullable(this.securitySettings);
    }

    /**
     * URLs of networkservices.ServiceBinding resources. Can only be set if load balancing scheme is INTERNAL_SELF_MANAGED. If set, lists of backends and health checks must be both empty.
     * 
     */
    @Import(name="serviceBindings")
    private @Nullable Output<List<String>> serviceBindings;

    public Optional<Output<List<String>>> serviceBindings() {
        return Optional.ofNullable(this.serviceBindings);
    }

    /**
     * Type of session affinity to use. The default is NONE. Only NONE and HEADER_FIELD are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. For more details, see: [Session Affinity](https://cloud.google.com/load-balancing/docs/backend-service#session_affinity).
     * 
     */
    @Import(name="sessionAffinity")
    private @Nullable Output<BackendServiceSessionAffinity> sessionAffinity;

    public Optional<Output<BackendServiceSessionAffinity>> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }

    @Import(name="subsetting")
    private @Nullable Output<SubsettingArgs> subsetting;

    public Optional<Output<SubsettingArgs>> subsetting() {
        return Optional.ofNullable(this.subsetting);
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. Instead, use maxStreamDuration.
     * 
     */
    @Import(name="timeoutSec")
    private @Nullable Output<Integer> timeoutSec;

    public Optional<Output<Integer>> timeoutSec() {
        return Optional.ofNullable(this.timeoutSec);
    }

    private BackendServiceArgs() {}

    private BackendServiceArgs(BackendServiceArgs $) {
        this.affinityCookieTtlSec = $.affinityCookieTtlSec;
        this.backends = $.backends;
        this.cdnPolicy = $.cdnPolicy;
        this.circuitBreakers = $.circuitBreakers;
        this.compressionMode = $.compressionMode;
        this.connectionDraining = $.connectionDraining;
        this.connectionTrackingPolicy = $.connectionTrackingPolicy;
        this.consistentHash = $.consistentHash;
        this.customRequestHeaders = $.customRequestHeaders;
        this.customResponseHeaders = $.customResponseHeaders;
        this.description = $.description;
        this.enableCDN = $.enableCDN;
        this.failoverPolicy = $.failoverPolicy;
        this.healthChecks = $.healthChecks;
        this.iap = $.iap;
        this.loadBalancingScheme = $.loadBalancingScheme;
        this.localityLbPolicy = $.localityLbPolicy;
        this.logConfig = $.logConfig;
        this.maxStreamDuration = $.maxStreamDuration;
        this.name = $.name;
        this.network = $.network;
        this.outlierDetection = $.outlierDetection;
        this.portName = $.portName;
        this.project = $.project;
        this.protocol = $.protocol;
        this.requestId = $.requestId;
        this.securitySettings = $.securitySettings;
        this.serviceBindings = $.serviceBindings;
        this.sessionAffinity = $.sessionAffinity;
        this.subsetting = $.subsetting;
        this.timeoutSec = $.timeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceArgs $;

        public Builder() {
            $ = new BackendServiceArgs();
        }

        public Builder(BackendServiceArgs defaults) {
            $ = new BackendServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder affinityCookieTtlSec(@Nullable Output<Integer> affinityCookieTtlSec) {
            $.affinityCookieTtlSec = affinityCookieTtlSec;
            return this;
        }

        public Builder affinityCookieTtlSec(Integer affinityCookieTtlSec) {
            return affinityCookieTtlSec(Output.of(affinityCookieTtlSec));
        }

        public Builder backends(@Nullable Output<List<BackendArgs>> backends) {
            $.backends = backends;
            return this;
        }

        public Builder backends(List<BackendArgs> backends) {
            return backends(Output.of(backends));
        }

        public Builder backends(BackendArgs... backends) {
            return backends(List.of(backends));
        }

        public Builder cdnPolicy(@Nullable Output<BackendServiceCdnPolicyArgs> cdnPolicy) {
            $.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder cdnPolicy(BackendServiceCdnPolicyArgs cdnPolicy) {
            return cdnPolicy(Output.of(cdnPolicy));
        }

        public Builder circuitBreakers(@Nullable Output<CircuitBreakersArgs> circuitBreakers) {
            $.circuitBreakers = circuitBreakers;
            return this;
        }

        public Builder circuitBreakers(CircuitBreakersArgs circuitBreakers) {
            return circuitBreakers(Output.of(circuitBreakers));
        }

        public Builder compressionMode(@Nullable Output<BackendServiceCompressionMode> compressionMode) {
            $.compressionMode = compressionMode;
            return this;
        }

        public Builder compressionMode(BackendServiceCompressionMode compressionMode) {
            return compressionMode(Output.of(compressionMode));
        }

        public Builder connectionDraining(@Nullable Output<ConnectionDrainingArgs> connectionDraining) {
            $.connectionDraining = connectionDraining;
            return this;
        }

        public Builder connectionDraining(ConnectionDrainingArgs connectionDraining) {
            return connectionDraining(Output.of(connectionDraining));
        }

        public Builder connectionTrackingPolicy(@Nullable Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy) {
            $.connectionTrackingPolicy = connectionTrackingPolicy;
            return this;
        }

        public Builder connectionTrackingPolicy(BackendServiceConnectionTrackingPolicyArgs connectionTrackingPolicy) {
            return connectionTrackingPolicy(Output.of(connectionTrackingPolicy));
        }

        public Builder consistentHash(@Nullable Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash) {
            $.consistentHash = consistentHash;
            return this;
        }

        public Builder consistentHash(ConsistentHashLoadBalancerSettingsArgs consistentHash) {
            return consistentHash(Output.of(consistentHash));
        }

        public Builder customRequestHeaders(@Nullable Output<List<String>> customRequestHeaders) {
            $.customRequestHeaders = customRequestHeaders;
            return this;
        }

        public Builder customRequestHeaders(List<String> customRequestHeaders) {
            return customRequestHeaders(Output.of(customRequestHeaders));
        }

        public Builder customRequestHeaders(String... customRequestHeaders) {
            return customRequestHeaders(List.of(customRequestHeaders));
        }

        public Builder customResponseHeaders(@Nullable Output<List<String>> customResponseHeaders) {
            $.customResponseHeaders = customResponseHeaders;
            return this;
        }

        public Builder customResponseHeaders(List<String> customResponseHeaders) {
            return customResponseHeaders(Output.of(customResponseHeaders));
        }

        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableCDN(@Nullable Output<Boolean> enableCDN) {
            $.enableCDN = enableCDN;
            return this;
        }

        public Builder enableCDN(Boolean enableCDN) {
            return enableCDN(Output.of(enableCDN));
        }

        public Builder failoverPolicy(@Nullable Output<BackendServiceFailoverPolicyArgs> failoverPolicy) {
            $.failoverPolicy = failoverPolicy;
            return this;
        }

        public Builder failoverPolicy(BackendServiceFailoverPolicyArgs failoverPolicy) {
            return failoverPolicy(Output.of(failoverPolicy));
        }

        public Builder healthChecks(@Nullable Output<List<String>> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        public Builder healthChecks(List<String> healthChecks) {
            return healthChecks(Output.of(healthChecks));
        }

        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }

        public Builder iap(@Nullable Output<BackendServiceIAPArgs> iap) {
            $.iap = iap;
            return this;
        }

        public Builder iap(BackendServiceIAPArgs iap) {
            return iap(Output.of(iap));
        }

        public Builder loadBalancingScheme(@Nullable Output<BackendServiceLoadBalancingScheme> loadBalancingScheme) {
            $.loadBalancingScheme = loadBalancingScheme;
            return this;
        }

        public Builder loadBalancingScheme(BackendServiceLoadBalancingScheme loadBalancingScheme) {
            return loadBalancingScheme(Output.of(loadBalancingScheme));
        }

        public Builder localityLbPolicy(@Nullable Output<BackendServiceLocalityLbPolicy> localityLbPolicy) {
            $.localityLbPolicy = localityLbPolicy;
            return this;
        }

        public Builder localityLbPolicy(BackendServiceLocalityLbPolicy localityLbPolicy) {
            return localityLbPolicy(Output.of(localityLbPolicy));
        }

        public Builder logConfig(@Nullable Output<BackendServiceLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(BackendServiceLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        public Builder maxStreamDuration(@Nullable Output<DurationArgs> maxStreamDuration) {
            $.maxStreamDuration = maxStreamDuration;
            return this;
        }

        public Builder maxStreamDuration(DurationArgs maxStreamDuration) {
            return maxStreamDuration(Output.of(maxStreamDuration));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder outlierDetection(@Nullable Output<OutlierDetectionArgs> outlierDetection) {
            $.outlierDetection = outlierDetection;
            return this;
        }

        public Builder outlierDetection(OutlierDetectionArgs outlierDetection) {
            return outlierDetection(Output.of(outlierDetection));
        }

        public Builder portName(@Nullable Output<String> portName) {
            $.portName = portName;
            return this;
        }

        public Builder portName(String portName) {
            return portName(Output.of(portName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder protocol(@Nullable Output<BackendServiceProtocol> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(BackendServiceProtocol protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder securitySettings(@Nullable Output<SecuritySettingsArgs> securitySettings) {
            $.securitySettings = securitySettings;
            return this;
        }

        public Builder securitySettings(SecuritySettingsArgs securitySettings) {
            return securitySettings(Output.of(securitySettings));
        }

        public Builder serviceBindings(@Nullable Output<List<String>> serviceBindings) {
            $.serviceBindings = serviceBindings;
            return this;
        }

        public Builder serviceBindings(List<String> serviceBindings) {
            return serviceBindings(Output.of(serviceBindings));
        }

        public Builder serviceBindings(String... serviceBindings) {
            return serviceBindings(List.of(serviceBindings));
        }

        public Builder sessionAffinity(@Nullable Output<BackendServiceSessionAffinity> sessionAffinity) {
            $.sessionAffinity = sessionAffinity;
            return this;
        }

        public Builder sessionAffinity(BackendServiceSessionAffinity sessionAffinity) {
            return sessionAffinity(Output.of(sessionAffinity));
        }

        public Builder subsetting(@Nullable Output<SubsettingArgs> subsetting) {
            $.subsetting = subsetting;
            return this;
        }

        public Builder subsetting(SubsettingArgs subsetting) {
            return subsetting(Output.of(subsetting));
        }

        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            $.timeoutSec = timeoutSec;
            return this;
        }

        public Builder timeoutSec(Integer timeoutSec) {
            return timeoutSec(Output.of(timeoutSec));
        }

        public BackendServiceArgs build() {
            return $;
        }
    }

}
