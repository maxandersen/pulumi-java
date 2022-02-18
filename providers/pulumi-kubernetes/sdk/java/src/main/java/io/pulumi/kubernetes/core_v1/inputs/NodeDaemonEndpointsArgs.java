// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.DaemonEndpointArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
 * 
 */
public final class NodeDaemonEndpointsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeDaemonEndpointsArgs Empty = new NodeDaemonEndpointsArgs();

    /**
     * Endpoint on which Kubelet is listening.
     * 
     */
    @InputImport(name="kubeletEndpoint")
    private final @Nullable Input<DaemonEndpointArgs> kubeletEndpoint;

    public Input<DaemonEndpointArgs> getKubeletEndpoint() {
        return this.kubeletEndpoint == null ? Input.empty() : this.kubeletEndpoint;
    }

    public NodeDaemonEndpointsArgs(@Nullable Input<DaemonEndpointArgs> kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    private NodeDaemonEndpointsArgs() {
        this.kubeletEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeDaemonEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DaemonEndpointArgs> kubeletEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeDaemonEndpointsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubeletEndpoint = defaults.kubeletEndpoint;
        }

        public Builder setKubeletEndpoint(@Nullable Input<DaemonEndpointArgs> kubeletEndpoint) {
            this.kubeletEndpoint = kubeletEndpoint;
            return this;
        }

        public Builder setKubeletEndpoint(@Nullable DaemonEndpointArgs kubeletEndpoint) {
            this.kubeletEndpoint = Input.ofNullable(kubeletEndpoint);
            return this;
        }

        public NodeDaemonEndpointsArgs build() {
            return new NodeDaemonEndpointsArgs(kubeletEndpoint);
        }
    }
}
