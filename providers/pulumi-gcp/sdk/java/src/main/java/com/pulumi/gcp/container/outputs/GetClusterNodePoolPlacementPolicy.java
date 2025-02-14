// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolPlacementPolicy {
    private final String type;

    @CustomType.Constructor
    private GetClusterNodePoolPlacementPolicy(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolPlacementPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolPlacementPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetClusterNodePoolPlacementPolicy build() {
            return new GetClusterNodePoolPlacementPolicy(type);
        }
    }
}
