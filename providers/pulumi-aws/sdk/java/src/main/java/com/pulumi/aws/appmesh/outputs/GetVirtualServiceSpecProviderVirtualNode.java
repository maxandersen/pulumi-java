// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVirtualServiceSpecProviderVirtualNode {
    /**
     * The name of the virtual node that is acting as a service provider.
     * 
     */
    private final String virtualNodeName;

    @CustomType.Constructor
    private GetVirtualServiceSpecProviderVirtualNode(@CustomType.Parameter("virtualNodeName") String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * The name of the virtual node that is acting as a service provider.
     * 
    */
    public String virtualNodeName() {
        return this.virtualNodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpecProviderVirtualNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpecProviderVirtualNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodeName = defaults.virtualNodeName;
        }

        public Builder virtualNodeName(String virtualNodeName) {
            this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
            return this;
        }        public GetVirtualServiceSpecProviderVirtualNode build() {
            return new GetVirtualServiceSpecProviderVirtualNode(virtualNodeName);
        }
    }
}
