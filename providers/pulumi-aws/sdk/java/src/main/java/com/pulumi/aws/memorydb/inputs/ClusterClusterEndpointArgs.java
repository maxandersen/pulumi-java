// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterEndpointArgs Empty = new ClusterClusterEndpointArgs();

    /**
     * DNS hostname of the node.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * The port number on which each of the nodes accepts connections. Defaults to `6379`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    public ClusterClusterEndpointArgs(
        @Nullable Output<String> address,
        @Nullable Output<Integer> port) {
        this.address = address;
        this.port = port;
    }

    private ClusterClusterEndpointArgs() {
        this.address = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }        public ClusterClusterEndpointArgs build() {
            return new ClusterClusterEndpointArgs(address, port);
        }
    }
}
