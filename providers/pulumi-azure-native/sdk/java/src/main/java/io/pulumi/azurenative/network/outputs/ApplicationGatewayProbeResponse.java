// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayProbeHealthResponseMatchResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayProbeResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Host name to send the probe to.
     * 
     */
    private final @Nullable String host;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The probing interval in seconds. This is the time interval between two consecutive probes. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * Criterion for classifying a healthy probe response.
     * 
     */
    private final @Nullable ApplicationGatewayProbeHealthResponseMatchResponse match;
    /**
     * Minimum number of servers that are always marked healthy. Default value is 0.
     * 
     */
    private final @Nullable Integer minServers;
    /**
     * Name of the probe that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * Relative path of probe. Valid path starts from '/'. Probe is sent to <Protocol>://<host>:<port><path>.
     * 
     */
    private final @Nullable String path;
    /**
     * Whether the host header should be picked from the backend http settings. Default value is false.
     * 
     */
    private final @Nullable Boolean pickHostNameFromBackendHttpSettings;
    /**
     * Custom port which will be used for probing the backend servers. The valid value ranges from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Standard_v2 and WAF_v2 only.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The protocol used for the probe.
     * 
     */
    private final @Nullable String protocol;
    /**
     * The provisioning state of the probe resource.
     * 
     */
    private final String provisioningState;
    /**
     * The probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * Type of the resource.
     * 
     */
    private final String type;
    /**
     * The probe retry count. Backend server is marked down after consecutive probe failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     * 
     */
    private final @Nullable Integer unhealthyThreshold;

    @CustomType.Constructor
    private ApplicationGatewayProbeResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("match") @Nullable ApplicationGatewayProbeHealthResponseMatchResponse match,
        @CustomType.Parameter("minServers") @Nullable Integer minServers,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("pickHostNameFromBackendHttpSettings") @Nullable Boolean pickHostNameFromBackendHttpSettings,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("unhealthyThreshold") @Nullable Integer unhealthyThreshold) {
        this.etag = etag;
        this.host = host;
        this.id = id;
        this.interval = interval;
        this.match = match;
        this.minServers = minServers;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        this.port = port;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.timeout = timeout;
        this.type = type;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Host name to send the probe to.
     * 
    */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The probing interval in seconds. This is the time interval between two consecutive probes. Acceptable values are from 1 second to 86400 seconds.
     * 
    */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * Criterion for classifying a healthy probe response.
     * 
    */
    public Optional<ApplicationGatewayProbeHealthResponseMatchResponse> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * Minimum number of servers that are always marked healthy. Default value is 0.
     * 
    */
    public Optional<Integer> minServers() {
        return Optional.ofNullable(this.minServers);
    }
    /**
     * Name of the probe that is unique within an Application Gateway.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Relative path of probe. Valid path starts from '/'. Probe is sent to <Protocol>://<host>:<port><path>.
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Whether the host header should be picked from the backend http settings. Default value is false.
     * 
    */
    public Optional<Boolean> pickHostNameFromBackendHttpSettings() {
        return Optional.ofNullable(this.pickHostNameFromBackendHttpSettings);
    }
    /**
     * Custom port which will be used for probing the backend servers. The valid value ranges from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Standard_v2 and WAF_v2 only.
     * 
    */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The protocol used for the probe.
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * The provisioning state of the probe resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
    */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The probe retry count. Backend server is marked down after consecutive probe failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     * 
    */
    public Optional<Integer> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String host;
        private @Nullable String id;
        private @Nullable Integer interval;
        private @Nullable ApplicationGatewayProbeHealthResponseMatchResponse match;
        private @Nullable Integer minServers;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable Boolean pickHostNameFromBackendHttpSettings;
        private @Nullable Integer port;
        private @Nullable String protocol;
        private String provisioningState;
        private @Nullable Integer timeout;
        private String type;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.match = defaults.match;
    	      this.minServers = defaults.minServers;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendHttpSettings = defaults.pickHostNameFromBackendHttpSettings;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder match(@Nullable ApplicationGatewayProbeHealthResponseMatchResponse match) {
            this.match = match;
            return this;
        }
        public Builder minServers(@Nullable Integer minServers) {
            this.minServers = minServers;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder pickHostNameFromBackendHttpSettings(@Nullable Boolean pickHostNameFromBackendHttpSettings) {
            this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }        public ApplicationGatewayProbeResponse build() {
            return new ApplicationGatewayProbeResponse(etag, host, id, interval, match, minServers, name, path, pickHostNameFromBackendHttpSettings, port, protocol, provisioningState, timeout, type, unhealthyThreshold);
        }
    }
}
