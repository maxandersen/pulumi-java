// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backend address of a frontDoor load balancer.
 * 
 */
public final class BackendResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendResponse Empty = new BackendResponse();

    /**
     * Location of the backend (IP address or FQDN)
     * 
     */
    @Import(name="address")
      private final @Nullable String address;

    public Optional<String> address() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    /**
     * The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    @Import(name="backendHostHeader")
      private final @Nullable String backendHostHeader;

    public Optional<String> backendHostHeader() {
        return this.backendHostHeader == null ? Optional.empty() : Optional.ofNullable(this.backendHostHeader);
    }

    /**
     * Whether to enable use of this backend. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    @Import(name="enabledState")
      private final @Nullable String enabledState;

    public Optional<String> enabledState() {
        return this.enabledState == null ? Optional.empty() : Optional.ofNullable(this.enabledState);
    }

    /**
     * The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpPort")
      private final @Nullable Integer httpPort;

    public Optional<Integer> httpPort() {
        return this.httpPort == null ? Optional.empty() : Optional.ofNullable(this.httpPort);
    }

    /**
     * The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpsPort")
      private final @Nullable Integer httpsPort;

    public Optional<Integer> httpsPort() {
        return this.httpsPort == null ? Optional.empty() : Optional.ofNullable(this.httpsPort);
    }

    /**
     * Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> priority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The Approval status for the connection to the Private Link
     * 
     */
    @Import(name="privateEndpointStatus", required=true)
      private final String privateEndpointStatus;

    public String privateEndpointStatus() {
        return this.privateEndpointStatus;
    }

    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    @Import(name="privateLinkAlias")
      private final @Nullable String privateLinkAlias;

    public Optional<String> privateLinkAlias() {
        return this.privateLinkAlias == null ? Optional.empty() : Optional.ofNullable(this.privateLinkAlias);
    }

    /**
     * A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    @Import(name="privateLinkApprovalMessage")
      private final @Nullable String privateLinkApprovalMessage;

    public Optional<String> privateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage == null ? Optional.empty() : Optional.ofNullable(this.privateLinkApprovalMessage);
    }

    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    @Import(name="privateLinkLocation")
      private final @Nullable String privateLinkLocation;

    public Optional<String> privateLinkLocation() {
        return this.privateLinkLocation == null ? Optional.empty() : Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    @Import(name="privateLinkResourceId")
      private final @Nullable String privateLinkResourceId;

    public Optional<String> privateLinkResourceId() {
        return this.privateLinkResourceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkResourceId);
    }

    /**
     * Weight of this endpoint for load balancing purposes.
     * 
     */
    @Import(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> weight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public BackendResponse(
        @Nullable String address,
        @Nullable String backendHostHeader,
        @Nullable String enabledState,
        @Nullable Integer httpPort,
        @Nullable Integer httpsPort,
        @Nullable Integer priority,
        String privateEndpointStatus,
        @Nullable String privateLinkAlias,
        @Nullable String privateLinkApprovalMessage,
        @Nullable String privateLinkLocation,
        @Nullable String privateLinkResourceId,
        @Nullable Integer weight) {
        this.address = address;
        this.backendHostHeader = backendHostHeader;
        this.enabledState = enabledState;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.priority = priority;
        this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus, "expected parameter 'privateEndpointStatus' to be non-null");
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.weight = weight;
    }

    private BackendResponse() {
        this.address = null;
        this.backendHostHeader = null;
        this.enabledState = null;
        this.httpPort = null;
        this.httpsPort = null;
        this.priority = null;
        this.privateEndpointStatus = null;
        this.privateLinkAlias = null;
        this.privateLinkApprovalMessage = null;
        this.privateLinkLocation = null;
        this.privateLinkResourceId = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String backendHostHeader;
        private @Nullable String enabledState;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable Integer priority;
        private String privateEndpointStatus;
        private @Nullable String privateLinkAlias;
        private @Nullable String privateLinkApprovalMessage;
        private @Nullable String privateLinkLocation;
        private @Nullable String privateLinkResourceId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.backendHostHeader = defaults.backendHostHeader;
    	      this.enabledState = defaults.enabledState;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.priority = defaults.priority;
    	      this.privateEndpointStatus = defaults.privateEndpointStatus;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.weight = defaults.weight;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder backendHostHeader(@Nullable String backendHostHeader) {
            this.backendHostHeader = backendHostHeader;
            return this;
        }
        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder privateEndpointStatus(String privateEndpointStatus) {
            this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus);
            return this;
        }
        public Builder privateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }
        public Builder privateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }
        public Builder privateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }
        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public BackendResponse build() {
            return new BackendResponse(address, backendHostHeader, enabledState, httpPort, httpsPort, priority, privateEndpointStatus, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, weight);
        }
    }
}
