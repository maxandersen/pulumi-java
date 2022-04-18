// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointPort {
    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    private final @Nullable String appProtocol;
    /**
     * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
     * 
     */
    private final @Nullable String name;
    /**
     * The port number of the endpoint.
     * 
     */
    private final Integer port;
    /**
     * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    private final @Nullable String protocol;

    @CustomType.Constructor
    private EndpointPort(
        @CustomType.Parameter("appProtocol") @Nullable String appProtocol,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
    */
    public Optional<String> appProtocol() {
        return Optional.ofNullable(this.appProtocol);
    }
    /**
     * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The port number of the endpoint.
     * 
    */
    public Integer port() {
        return this.port;
    }
    /**
     * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appProtocol;
        private @Nullable String name;
        private Integer port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appProtocol = defaults.appProtocol;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder appProtocol(@Nullable String appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public EndpointPort build() {
            return new EndpointPort(appProtocol, name, port, protocol);
        }
    }
}
