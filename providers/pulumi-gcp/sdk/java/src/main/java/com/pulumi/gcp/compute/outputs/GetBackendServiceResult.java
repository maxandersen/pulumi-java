// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceBackend;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCdnPolicy;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCircuitBreaker;
import com.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHash;
import com.pulumi.gcp.compute.outputs.GetBackendServiceIap;
import com.pulumi.gcp.compute.outputs.GetBackendServiceLogConfig;
import com.pulumi.gcp.compute.outputs.GetBackendServiceOutlierDetection;
import com.pulumi.gcp.compute.outputs.GetBackendServiceSecuritySetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackendServiceResult {
    private final Integer affinityCookieTtlSec;
    /**
     * The set of backends that serve this Backend Service.
     * 
     */
    private final List<GetBackendServiceBackend> backends;
    private final List<GetBackendServiceCdnPolicy> cdnPolicies;
    private final List<GetBackendServiceCircuitBreaker> circuitBreakers;
    /**
     * Time for which instance will be drained (not accept new connections, but still work to finish started ones).
     * 
     */
    private final Integer connectionDrainingTimeoutSec;
    private final List<GetBackendServiceConsistentHash> consistentHash;
    private final String creationTimestamp;
    private final List<String> customRequestHeaders;
    private final List<String> customResponseHeaders;
    /**
     * Textual description for the Backend Service.
     * 
     */
    private final String description;
    /**
     * Whether or not Cloud CDN is enabled on the Backend Service.
     * 
     */
    private final Boolean enableCdn;
    /**
     * The fingerprint of the Backend Service.
     * 
     */
    private final String fingerprint;
    /**
     * The set of HTTP/HTTPS health checks used by the Backend Service.
     * 
     */
    private final List<String> healthChecks;
    private final List<GetBackendServiceIap> iaps;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String loadBalancingScheme;
    private final String localityLbPolicy;
    private final List<GetBackendServiceLogConfig> logConfigs;
    private final String name;
    private final List<GetBackendServiceOutlierDetection> outlierDetections;
    /**
     * The name of a service that has been added to an instance group in this backend.
     * 
     */
    private final String portName;
    private final @Nullable String project;
    /**
     * The protocol for incoming requests.
     * 
     */
    private final String protocol;
    private final String securityPolicy;
    private final List<GetBackendServiceSecuritySetting> securitySettings;
    /**
     * The URI of the Backend Service.
     * 
     */
    private final String selfLink;
    /**
     * The Backend Service session stickiness configuration.
     * 
     */
    private final String sessionAffinity;
    /**
     * The number of seconds to wait for a backend to respond to a request before considering the request failed.
     * 
     */
    private final Integer timeoutSec;

    @CustomType.Constructor
    private GetBackendServiceResult(
        @CustomType.Parameter("affinityCookieTtlSec") Integer affinityCookieTtlSec,
        @CustomType.Parameter("backends") List<GetBackendServiceBackend> backends,
        @CustomType.Parameter("cdnPolicies") List<GetBackendServiceCdnPolicy> cdnPolicies,
        @CustomType.Parameter("circuitBreakers") List<GetBackendServiceCircuitBreaker> circuitBreakers,
        @CustomType.Parameter("connectionDrainingTimeoutSec") Integer connectionDrainingTimeoutSec,
        @CustomType.Parameter("consistentHash") List<GetBackendServiceConsistentHash> consistentHash,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("customRequestHeaders") List<String> customRequestHeaders,
        @CustomType.Parameter("customResponseHeaders") List<String> customResponseHeaders,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enableCdn") Boolean enableCdn,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("healthChecks") List<String> healthChecks,
        @CustomType.Parameter("iaps") List<GetBackendServiceIap> iaps,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("loadBalancingScheme") String loadBalancingScheme,
        @CustomType.Parameter("localityLbPolicy") String localityLbPolicy,
        @CustomType.Parameter("logConfigs") List<GetBackendServiceLogConfig> logConfigs,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outlierDetections") List<GetBackendServiceOutlierDetection> outlierDetections,
        @CustomType.Parameter("portName") String portName,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("securityPolicy") String securityPolicy,
        @CustomType.Parameter("securitySettings") List<GetBackendServiceSecuritySetting> securitySettings,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sessionAffinity") String sessionAffinity,
        @CustomType.Parameter("timeoutSec") Integer timeoutSec) {
        this.affinityCookieTtlSec = affinityCookieTtlSec;
        this.backends = backends;
        this.cdnPolicies = cdnPolicies;
        this.circuitBreakers = circuitBreakers;
        this.connectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
        this.consistentHash = consistentHash;
        this.creationTimestamp = creationTimestamp;
        this.customRequestHeaders = customRequestHeaders;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.enableCdn = enableCdn;
        this.fingerprint = fingerprint;
        this.healthChecks = healthChecks;
        this.iaps = iaps;
        this.id = id;
        this.loadBalancingScheme = loadBalancingScheme;
        this.localityLbPolicy = localityLbPolicy;
        this.logConfigs = logConfigs;
        this.name = name;
        this.outlierDetections = outlierDetections;
        this.portName = portName;
        this.project = project;
        this.protocol = protocol;
        this.securityPolicy = securityPolicy;
        this.securitySettings = securitySettings;
        this.selfLink = selfLink;
        this.sessionAffinity = sessionAffinity;
        this.timeoutSec = timeoutSec;
    }

    public Integer affinityCookieTtlSec() {
        return this.affinityCookieTtlSec;
    }
    /**
     * The set of backends that serve this Backend Service.
     * 
    */
    public List<GetBackendServiceBackend> backends() {
        return this.backends;
    }
    public List<GetBackendServiceCdnPolicy> cdnPolicies() {
        return this.cdnPolicies;
    }
    public List<GetBackendServiceCircuitBreaker> circuitBreakers() {
        return this.circuitBreakers;
    }
    /**
     * Time for which instance will be drained (not accept new connections, but still work to finish started ones).
     * 
    */
    public Integer connectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec;
    }
    public List<GetBackendServiceConsistentHash> consistentHash() {
        return this.consistentHash;
    }
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public List<String> customRequestHeaders() {
        return this.customRequestHeaders;
    }
    public List<String> customResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * Textual description for the Backend Service.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Whether or not Cloud CDN is enabled on the Backend Service.
     * 
    */
    public Boolean enableCdn() {
        return this.enableCdn;
    }
    /**
     * The fingerprint of the Backend Service.
     * 
    */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * The set of HTTP/HTTPS health checks used by the Backend Service.
     * 
    */
    public List<String> healthChecks() {
        return this.healthChecks;
    }
    public List<GetBackendServiceIap> iaps() {
        return this.iaps;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String loadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public String localityLbPolicy() {
        return this.localityLbPolicy;
    }
    public List<GetBackendServiceLogConfig> logConfigs() {
        return this.logConfigs;
    }
    public String name() {
        return this.name;
    }
    public List<GetBackendServiceOutlierDetection> outlierDetections() {
        return this.outlierDetections;
    }
    /**
     * The name of a service that has been added to an instance group in this backend.
     * 
    */
    public String portName() {
        return this.portName;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * The protocol for incoming requests.
     * 
    */
    public String protocol() {
        return this.protocol;
    }
    public String securityPolicy() {
        return this.securityPolicy;
    }
    public List<GetBackendServiceSecuritySetting> securitySettings() {
        return this.securitySettings;
    }
    /**
     * The URI of the Backend Service.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * The Backend Service session stickiness configuration.
     * 
    */
    public String sessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * The number of seconds to wait for a backend to respond to a request before considering the request failed.
     * 
    */
    public Integer timeoutSec() {
        return this.timeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer affinityCookieTtlSec;
        private List<GetBackendServiceBackend> backends;
        private List<GetBackendServiceCdnPolicy> cdnPolicies;
        private List<GetBackendServiceCircuitBreaker> circuitBreakers;
        private Integer connectionDrainingTimeoutSec;
        private List<GetBackendServiceConsistentHash> consistentHash;
        private String creationTimestamp;
        private List<String> customRequestHeaders;
        private List<String> customResponseHeaders;
        private String description;
        private Boolean enableCdn;
        private String fingerprint;
        private List<String> healthChecks;
        private List<GetBackendServiceIap> iaps;
        private String id;
        private String loadBalancingScheme;
        private String localityLbPolicy;
        private List<GetBackendServiceLogConfig> logConfigs;
        private String name;
        private List<GetBackendServiceOutlierDetection> outlierDetections;
        private String portName;
        private @Nullable String project;
        private String protocol;
        private String securityPolicy;
        private List<GetBackendServiceSecuritySetting> securitySettings;
        private String selfLink;
        private String sessionAffinity;
        private Integer timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieTtlSec = defaults.affinityCookieTtlSec;
    	      this.backends = defaults.backends;
    	      this.cdnPolicies = defaults.cdnPolicies;
    	      this.circuitBreakers = defaults.circuitBreakers;
    	      this.connectionDrainingTimeoutSec = defaults.connectionDrainingTimeoutSec;
    	      this.consistentHash = defaults.consistentHash;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customRequestHeaders = defaults.customRequestHeaders;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.fingerprint = defaults.fingerprint;
    	      this.healthChecks = defaults.healthChecks;
    	      this.iaps = defaults.iaps;
    	      this.id = defaults.id;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.localityLbPolicy = defaults.localityLbPolicy;
    	      this.logConfigs = defaults.logConfigs;
    	      this.name = defaults.name;
    	      this.outlierDetections = defaults.outlierDetections;
    	      this.portName = defaults.portName;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.securitySettings = defaults.securitySettings;
    	      this.selfLink = defaults.selfLink;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder affinityCookieTtlSec(Integer affinityCookieTtlSec) {
            this.affinityCookieTtlSec = Objects.requireNonNull(affinityCookieTtlSec);
            return this;
        }
        public Builder backends(List<GetBackendServiceBackend> backends) {
            this.backends = Objects.requireNonNull(backends);
            return this;
        }
        public Builder backends(GetBackendServiceBackend... backends) {
            return backends(List.of(backends));
        }
        public Builder cdnPolicies(List<GetBackendServiceCdnPolicy> cdnPolicies) {
            this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
            return this;
        }
        public Builder cdnPolicies(GetBackendServiceCdnPolicy... cdnPolicies) {
            return cdnPolicies(List.of(cdnPolicies));
        }
        public Builder circuitBreakers(List<GetBackendServiceCircuitBreaker> circuitBreakers) {
            this.circuitBreakers = Objects.requireNonNull(circuitBreakers);
            return this;
        }
        public Builder circuitBreakers(GetBackendServiceCircuitBreaker... circuitBreakers) {
            return circuitBreakers(List.of(circuitBreakers));
        }
        public Builder connectionDrainingTimeoutSec(Integer connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = Objects.requireNonNull(connectionDrainingTimeoutSec);
            return this;
        }
        public Builder consistentHash(List<GetBackendServiceConsistentHash> consistentHash) {
            this.consistentHash = Objects.requireNonNull(consistentHash);
            return this;
        }
        public Builder consistentHash(GetBackendServiceConsistentHash... consistentHash) {
            return consistentHash(List.of(consistentHash));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder customRequestHeaders(List<String> customRequestHeaders) {
            this.customRequestHeaders = Objects.requireNonNull(customRequestHeaders);
            return this;
        }
        public Builder customRequestHeaders(String... customRequestHeaders) {
            return customRequestHeaders(List.of(customRequestHeaders));
        }
        public Builder customResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }
        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder healthChecks(List<String> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }
        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        public Builder iaps(List<GetBackendServiceIap> iaps) {
            this.iaps = Objects.requireNonNull(iaps);
            return this;
        }
        public Builder iaps(GetBackendServiceIap... iaps) {
            return iaps(List.of(iaps));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder loadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }
        public Builder localityLbPolicy(String localityLbPolicy) {
            this.localityLbPolicy = Objects.requireNonNull(localityLbPolicy);
            return this;
        }
        public Builder logConfigs(List<GetBackendServiceLogConfig> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }
        public Builder logConfigs(GetBackendServiceLogConfig... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outlierDetections(List<GetBackendServiceOutlierDetection> outlierDetections) {
            this.outlierDetections = Objects.requireNonNull(outlierDetections);
            return this;
        }
        public Builder outlierDetections(GetBackendServiceOutlierDetection... outlierDetections) {
            return outlierDetections(List.of(outlierDetections));
        }
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder securityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }
        public Builder securitySettings(List<GetBackendServiceSecuritySetting> securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }
        public Builder securitySettings(GetBackendServiceSecuritySetting... securitySettings) {
            return securitySettings(List.of(securitySettings));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sessionAffinity(String sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }
        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }        public GetBackendServiceResult build() {
            return new GetBackendServiceResult(affinityCookieTtlSec, backends, cdnPolicies, circuitBreakers, connectionDrainingTimeoutSec, consistentHash, creationTimestamp, customRequestHeaders, customResponseHeaders, description, enableCdn, fingerprint, healthChecks, iaps, id, loadBalancingScheme, localityLbPolicy, logConfigs, name, outlierDetections, portName, project, protocol, securityPolicy, securitySettings, selfLink, sessionAffinity, timeoutSec);
        }
    }
}
