// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualServiceSpecProviderVirtualNode;
import com.pulumi.aws.appmesh.outputs.GetVirtualServiceSpecProviderVirtualRouter;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualServiceSpecProvider {
    /**
     * The virtual node associated with the virtual service.
     * 
     */
    private final List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes;
    /**
     * The virtual router associated with the virtual service.
     * 
     */
    private final List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters;

    @CustomType.Constructor
    private GetVirtualServiceSpecProvider(
        @CustomType.Parameter("virtualNodes") List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes,
        @CustomType.Parameter("virtualRouters") List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters) {
        this.virtualNodes = virtualNodes;
        this.virtualRouters = virtualRouters;
    }

    /**
     * The virtual node associated with the virtual service.
     * 
    */
    public List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes() {
        return this.virtualNodes;
    }
    /**
     * The virtual router associated with the virtual service.
     * 
    */
    public List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters() {
        return this.virtualRouters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpecProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes;
        private List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpecProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodes = defaults.virtualNodes;
    	      this.virtualRouters = defaults.virtualRouters;
        }

        public Builder virtualNodes(List<GetVirtualServiceSpecProviderVirtualNode> virtualNodes) {
            this.virtualNodes = Objects.requireNonNull(virtualNodes);
            return this;
        }
        public Builder virtualNodes(GetVirtualServiceSpecProviderVirtualNode... virtualNodes) {
            return virtualNodes(List.of(virtualNodes));
        }
        public Builder virtualRouters(List<GetVirtualServiceSpecProviderVirtualRouter> virtualRouters) {
            this.virtualRouters = Objects.requireNonNull(virtualRouters);
            return this;
        }
        public Builder virtualRouters(GetVirtualServiceSpecProviderVirtualRouter... virtualRouters) {
            return virtualRouters(List.of(virtualRouters));
        }        public GetVirtualServiceSpecProvider build() {
            return new GetVirtualServiceSpecProvider(virtualNodes, virtualRouters);
        }
    }
}
