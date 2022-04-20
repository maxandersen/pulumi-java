// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inbound NAT pool of the load balancer.
 * 
 */
public final class InboundNatPoolResponse extends com.pulumi.resources.InvokeArgs {

    public static final InboundNatPoolResponse Empty = new InboundNatPoolResponse();

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    @Import(name="backendPort", required=true)
      private final Integer backendPort;

    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
      private final @Nullable Boolean enableFloatingIP;

    public Optional<Boolean> enableFloatingIP() {
        return this.enableFloatingIP == null ? Optional.empty() : Optional.ofNullable(this.enableFloatingIP);
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
      private final @Nullable Boolean enableTcpReset;

    public Optional<Boolean> enableTcpReset() {
        return this.enableTcpReset == null ? Optional.empty() : Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
      private final @Nullable SubResourceResponse frontendIPConfiguration;

    public Optional<SubResourceResponse> frontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Optional.empty() : Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * The last port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     * 
     */
    @Import(name="frontendPortRangeEnd", required=true)
      private final Integer frontendPortRangeEnd;

    public Integer frontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * The first port number in the range of external ports that will be used to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     * 
     */
    @Import(name="frontendPortRangeStart", required=true)
      private final Integer frontendPortRangeStart;

    public Integer frontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The name of the resource that is unique within the set of inbound NAT pools used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The reference to the transport protocol used by the inbound NAT pool.
     * 
     */
    @Import(name="protocol", required=true)
      private final String protocol;

    public String protocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the inbound NAT pool resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public InboundNatPoolResponse(
        Integer backendPort,
        @Nullable Boolean enableFloatingIP,
        @Nullable Boolean enableTcpReset,
        String etag,
        @Nullable SubResourceResponse frontendIPConfiguration,
        Integer frontendPortRangeEnd,
        Integer frontendPortRangeStart,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String name,
        String protocol,
        String provisioningState,
        String type) {
        this.backendPort = Objects.requireNonNull(backendPort, "expected parameter 'backendPort' to be non-null");
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPortRangeEnd = Objects.requireNonNull(frontendPortRangeEnd, "expected parameter 'frontendPortRangeEnd' to be non-null");
        this.frontendPortRangeStart = Objects.requireNonNull(frontendPortRangeStart, "expected parameter 'frontendPortRangeStart' to be non-null");
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.name = name;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InboundNatPoolResponse() {
        this.backendPort = null;
        this.enableFloatingIP = null;
        this.enableTcpReset = null;
        this.etag = null;
        this.frontendIPConfiguration = null;
        this.frontendPortRangeEnd = null;
        this.frontendPortRangeStart = null;
        this.id = null;
        this.idleTimeoutInMinutes = null;
        this.name = null;
        this.protocol = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backendPort;
        private @Nullable Boolean enableFloatingIP;
        private @Nullable Boolean enableTcpReset;
        private String etag;
        private @Nullable SubResourceResponse frontendIPConfiguration;
        private Integer frontendPortRangeEnd;
        private Integer frontendPortRangeStart;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String name;
        private String protocol;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.etag = defaults.etag;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPortRangeEnd = defaults.frontendPortRangeEnd;
    	      this.frontendPortRangeStart = defaults.frontendPortRangeStart;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }
        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }
        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder frontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }
        public Builder frontendPortRangeEnd(Integer frontendPortRangeEnd) {
            this.frontendPortRangeEnd = Objects.requireNonNull(frontendPortRangeEnd);
            return this;
        }
        public Builder frontendPortRangeStart(Integer frontendPortRangeStart) {
            this.frontendPortRangeStart = Objects.requireNonNull(frontendPortRangeStart);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public InboundNatPoolResponse build() {
            return new InboundNatPoolResponse(backendPort, enableFloatingIP, enableTcpReset, etag, frontendIPConfiguration, frontendPortRangeEnd, frontendPortRangeStart, id, idleTimeoutInMinutes, name, protocol, provisioningState, type);
        }
    }
}
