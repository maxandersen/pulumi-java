// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * VirtualNetworkGatewayConnection properties.
 * 
 */
public final class TunnelConnectionHealthResponse extends io.pulumi.resources.InvokeArgs {

    public static final TunnelConnectionHealthResponse Empty = new TunnelConnectionHealthResponse();

    /**
     * Virtual Network Gateway connection status.
     * 
     */
    @Import(name="connectionStatus", required=true)
      private final String connectionStatus;

    public String connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * The Egress Bytes Transferred in this connection.
     * 
     */
    @Import(name="egressBytesTransferred", required=true)
      private final Double egressBytesTransferred;

    public Double egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * The Ingress Bytes Transferred in this connection.
     * 
     */
    @Import(name="ingressBytesTransferred", required=true)
      private final Double ingressBytesTransferred;

    public Double ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * The time at which connection was established in Utc format.
     * 
     */
    @Import(name="lastConnectionEstablishedUtcTime", required=true)
      private final String lastConnectionEstablishedUtcTime;

    public String lastConnectionEstablishedUtcTime() {
        return this.lastConnectionEstablishedUtcTime;
    }

    /**
     * Tunnel name.
     * 
     */
    @Import(name="tunnel", required=true)
      private final String tunnel;

    public String tunnel() {
        return this.tunnel;
    }

    public TunnelConnectionHealthResponse(
        String connectionStatus,
        Double egressBytesTransferred,
        Double ingressBytesTransferred,
        String lastConnectionEstablishedUtcTime,
        String tunnel) {
        this.connectionStatus = Objects.requireNonNull(connectionStatus, "expected parameter 'connectionStatus' to be non-null");
        this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred, "expected parameter 'egressBytesTransferred' to be non-null");
        this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred, "expected parameter 'ingressBytesTransferred' to be non-null");
        this.lastConnectionEstablishedUtcTime = Objects.requireNonNull(lastConnectionEstablishedUtcTime, "expected parameter 'lastConnectionEstablishedUtcTime' to be non-null");
        this.tunnel = Objects.requireNonNull(tunnel, "expected parameter 'tunnel' to be non-null");
    }

    private TunnelConnectionHealthResponse() {
        this.connectionStatus = null;
        this.egressBytesTransferred = null;
        this.ingressBytesTransferred = null;
        this.lastConnectionEstablishedUtcTime = null;
        this.tunnel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TunnelConnectionHealthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionStatus;
        private Double egressBytesTransferred;
        private Double ingressBytesTransferred;
        private String lastConnectionEstablishedUtcTime;
        private String tunnel;

        public Builder() {
    	      // Empty
        }

        public Builder(TunnelConnectionHealthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.lastConnectionEstablishedUtcTime = defaults.lastConnectionEstablishedUtcTime;
    	      this.tunnel = defaults.tunnel;
        }

        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }
        public Builder egressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }
        public Builder ingressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }
        public Builder lastConnectionEstablishedUtcTime(String lastConnectionEstablishedUtcTime) {
            this.lastConnectionEstablishedUtcTime = Objects.requireNonNull(lastConnectionEstablishedUtcTime);
            return this;
        }
        public Builder tunnel(String tunnel) {
            this.tunnel = Objects.requireNonNull(tunnel);
            return this;
        }        public TunnelConnectionHealthResponse build() {
            return new TunnelConnectionHealthResponse(connectionStatus, egressBytesTransferred, ingressBytesTransferred, lastConnectionEstablishedUtcTime, tunnel);
        }
    }
}
