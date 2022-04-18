// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.servicefabricmesh.inputs.HttpConfigArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.NetworkRefArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.TcpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * User readable description of the gateway.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Network that the Application is using.
     * 
     */
    @Import(name="destinationNetwork", required=true)
      private final Output<NetworkRefArgs> destinationNetwork;

    public Output<NetworkRefArgs> destinationNetwork() {
        return this.destinationNetwork;
    }

    /**
     * The identity of the gateway.
     * 
     */
    @Import(name="gatewayResourceName")
      private final @Nullable Output<String> gatewayResourceName;

    public Output<String> gatewayResourceName() {
        return this.gatewayResourceName == null ? Codegen.empty() : this.gatewayResourceName;
    }

    /**
     * Configuration for http connectivity for this gateway.
     * 
     */
    @Import(name="http")
      private final @Nullable Output<List<HttpConfigArgs>> http;

    public Output<List<HttpConfigArgs>> http() {
        return this.http == null ? Codegen.empty() : this.http;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Network the gateway should listen on for requests.
     * 
     */
    @Import(name="sourceNetwork", required=true)
      private final Output<NetworkRefArgs> sourceNetwork;

    public Output<NetworkRefArgs> sourceNetwork() {
        return this.sourceNetwork;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Configuration for tcp connectivity for this gateway.
     * 
     */
    @Import(name="tcp")
      private final @Nullable Output<List<TcpConfigArgs>> tcp;

    public Output<List<TcpConfigArgs>> tcp() {
        return this.tcp == null ? Codegen.empty() : this.tcp;
    }

    public GatewayArgs(
        @Nullable Output<String> description,
        Output<NetworkRefArgs> destinationNetwork,
        @Nullable Output<String> gatewayResourceName,
        @Nullable Output<List<HttpConfigArgs>> http,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<NetworkRefArgs> sourceNetwork,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<TcpConfigArgs>> tcp) {
        this.description = description;
        this.destinationNetwork = Objects.requireNonNull(destinationNetwork, "expected parameter 'destinationNetwork' to be non-null");
        this.gatewayResourceName = gatewayResourceName;
        this.http = http;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceNetwork = Objects.requireNonNull(sourceNetwork, "expected parameter 'sourceNetwork' to be non-null");
        this.tags = tags;
        this.tcp = tcp;
    }

    private GatewayArgs() {
        this.description = Codegen.empty();
        this.destinationNetwork = Codegen.empty();
        this.gatewayResourceName = Codegen.empty();
        this.http = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sourceNetwork = Codegen.empty();
        this.tags = Codegen.empty();
        this.tcp = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<NetworkRefArgs> destinationNetwork;
        private @Nullable Output<String> gatewayResourceName;
        private @Nullable Output<List<HttpConfigArgs>> http;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<NetworkRefArgs> sourceNetwork;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<TcpConfigArgs>> tcp;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationNetwork = defaults.destinationNetwork;
    	      this.gatewayResourceName = defaults.gatewayResourceName;
    	      this.http = defaults.http;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceNetwork = defaults.sourceNetwork;
    	      this.tags = defaults.tags;
    	      this.tcp = defaults.tcp;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationNetwork(Output<NetworkRefArgs> destinationNetwork) {
            this.destinationNetwork = Objects.requireNonNull(destinationNetwork);
            return this;
        }
        public Builder destinationNetwork(NetworkRefArgs destinationNetwork) {
            this.destinationNetwork = Output.of(Objects.requireNonNull(destinationNetwork));
            return this;
        }
        public Builder gatewayResourceName(@Nullable Output<String> gatewayResourceName) {
            this.gatewayResourceName = gatewayResourceName;
            return this;
        }
        public Builder gatewayResourceName(@Nullable String gatewayResourceName) {
            this.gatewayResourceName = Codegen.ofNullable(gatewayResourceName);
            return this;
        }
        public Builder http(@Nullable Output<List<HttpConfigArgs>> http) {
            this.http = http;
            return this;
        }
        public Builder http(@Nullable List<HttpConfigArgs> http) {
            this.http = Codegen.ofNullable(http);
            return this;
        }
        public Builder http(HttpConfigArgs... http) {
            return http(List.of(http));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sourceNetwork(Output<NetworkRefArgs> sourceNetwork) {
            this.sourceNetwork = Objects.requireNonNull(sourceNetwork);
            return this;
        }
        public Builder sourceNetwork(NetworkRefArgs sourceNetwork) {
            this.sourceNetwork = Output.of(Objects.requireNonNull(sourceNetwork));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tcp(@Nullable Output<List<TcpConfigArgs>> tcp) {
            this.tcp = tcp;
            return this;
        }
        public Builder tcp(@Nullable List<TcpConfigArgs> tcp) {
            this.tcp = Codegen.ofNullable(tcp);
            return this;
        }
        public Builder tcp(TcpConfigArgs... tcp) {
            return tcp(List.of(tcp));
        }        public GatewayArgs build() {
            return new GatewayArgs(description, destinationNetwork, gatewayResourceName, http, location, resourceGroupName, sourceNetwork, tags, tcp);
        }
    }
}
