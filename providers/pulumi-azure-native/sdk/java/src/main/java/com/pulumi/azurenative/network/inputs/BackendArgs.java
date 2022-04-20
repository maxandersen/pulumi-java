// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.BackendEnabledState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backend address of a frontDoor load balancer.
 * 
 */
public final class BackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendArgs Empty = new BackendArgs();

    /**
     * Location of the backend (IP address or FQDN)
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    @Import(name="backendHostHeader")
      private final @Nullable Output<String> backendHostHeader;

    public Output<String> backendHostHeader() {
        return this.backendHostHeader == null ? Codegen.empty() : this.backendHostHeader;
    }

    /**
     * Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,BackendEnabledState>> enabledState;

    public Output<Either<String,BackendEnabledState>> enabledState() {
        return this.enabledState == null ? Codegen.empty() : this.enabledState;
    }

    /**
     * The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpPort")
      private final @Nullable Output<Integer> httpPort;

    public Output<Integer> httpPort() {
        return this.httpPort == null ? Codegen.empty() : this.httpPort;
    }

    /**
     * The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpsPort")
      private final @Nullable Output<Integer> httpsPort;

    public Output<Integer> httpsPort() {
        return this.httpsPort == null ? Codegen.empty() : this.httpsPort;
    }

    /**
     * Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    @Import(name="privateLinkAlias")
      private final @Nullable Output<String> privateLinkAlias;

    public Output<String> privateLinkAlias() {
        return this.privateLinkAlias == null ? Codegen.empty() : this.privateLinkAlias;
    }

    /**
     * A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    @Import(name="privateLinkApprovalMessage")
      private final @Nullable Output<String> privateLinkApprovalMessage;

    public Output<String> privateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage == null ? Codegen.empty() : this.privateLinkApprovalMessage;
    }

    /**
     * The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    @Import(name="privateLinkLocation")
      private final @Nullable Output<String> privateLinkLocation;

    public Output<String> privateLinkLocation() {
        return this.privateLinkLocation == null ? Codegen.empty() : this.privateLinkLocation;
    }

    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    @Import(name="privateLinkResourceId")
      private final @Nullable Output<String> privateLinkResourceId;

    public Output<String> privateLinkResourceId() {
        return this.privateLinkResourceId == null ? Codegen.empty() : this.privateLinkResourceId;
    }

    /**
     * Weight of this endpoint for load balancing purposes.
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> weight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public BackendArgs(
        @Nullable Output<String> address,
        @Nullable Output<String> backendHostHeader,
        @Nullable Output<Either<String,BackendEnabledState>> enabledState,
        @Nullable Output<Integer> httpPort,
        @Nullable Output<Integer> httpsPort,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> privateLinkAlias,
        @Nullable Output<String> privateLinkApprovalMessage,
        @Nullable Output<String> privateLinkLocation,
        @Nullable Output<String> privateLinkResourceId,
        @Nullable Output<Integer> weight) {
        this.address = address;
        this.backendHostHeader = backendHostHeader;
        this.enabledState = enabledState;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.priority = priority;
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.weight = weight;
    }

    private BackendArgs() {
        this.address = Codegen.empty();
        this.backendHostHeader = Codegen.empty();
        this.enabledState = Codegen.empty();
        this.httpPort = Codegen.empty();
        this.httpsPort = Codegen.empty();
        this.priority = Codegen.empty();
        this.privateLinkAlias = Codegen.empty();
        this.privateLinkApprovalMessage = Codegen.empty();
        this.privateLinkLocation = Codegen.empty();
        this.privateLinkResourceId = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<String> backendHostHeader;
        private @Nullable Output<Either<String,BackendEnabledState>> enabledState;
        private @Nullable Output<Integer> httpPort;
        private @Nullable Output<Integer> httpsPort;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> privateLinkAlias;
        private @Nullable Output<String> privateLinkApprovalMessage;
        private @Nullable Output<String> privateLinkLocation;
        private @Nullable Output<String> privateLinkResourceId;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.backendHostHeader = defaults.backendHostHeader;
    	      this.enabledState = defaults.enabledState;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.priority = defaults.priority;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.weight = defaults.weight;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder backendHostHeader(@Nullable Output<String> backendHostHeader) {
            this.backendHostHeader = backendHostHeader;
            return this;
        }
        public Builder backendHostHeader(@Nullable String backendHostHeader) {
            this.backendHostHeader = Codegen.ofNullable(backendHostHeader);
            return this;
        }
        public Builder enabledState(@Nullable Output<Either<String,BackendEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder enabledState(@Nullable Either<String,BackendEnabledState> enabledState) {
            this.enabledState = Codegen.ofNullable(enabledState);
            return this;
        }
        public Builder httpPort(@Nullable Output<Integer> httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = Codegen.ofNullable(httpPort);
            return this;
        }
        public Builder httpsPort(@Nullable Output<Integer> httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = Codegen.ofNullable(httpsPort);
            return this;
        }
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
            return this;
        }
        public Builder privateLinkAlias(@Nullable Output<String> privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }
        public Builder privateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = Codegen.ofNullable(privateLinkAlias);
            return this;
        }
        public Builder privateLinkApprovalMessage(@Nullable Output<String> privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }
        public Builder privateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = Codegen.ofNullable(privateLinkApprovalMessage);
            return this;
        }
        public Builder privateLinkLocation(@Nullable Output<String> privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }
        public Builder privateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = Codegen.ofNullable(privateLinkLocation);
            return this;
        }
        public Builder privateLinkResourceId(@Nullable Output<String> privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }
        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = Codegen.ofNullable(privateLinkResourceId);
            return this;
        }
        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public BackendArgs build() {
            return new BackendArgs(address, backendHostHeader, enabledState, httpPort, httpsPort, priority, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, weight);
        }
    }
}
