// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkloadMetadataConfigResponse {
    /**
     * Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
     */
    private final String mode;
    /**
     * NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
     */
    private final String nodeMetadata;

    @CustomType.Constructor
    private WorkloadMetadataConfigResponse(
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("nodeMetadata") String nodeMetadata) {
        this.mode = mode;
        this.nodeMetadata = nodeMetadata;
    }

    /**
     * Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
    */
    public String mode() {
        return this.mode;
    }
    /**
     * NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
    */
    public String nodeMetadata() {
        return this.nodeMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadMetadataConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;
        private String nodeMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadMetadataConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.nodeMetadata = defaults.nodeMetadata;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder nodeMetadata(String nodeMetadata) {
            this.nodeMetadata = Objects.requireNonNull(nodeMetadata);
            return this;
        }        public WorkloadMetadataConfigResponse build() {
            return new WorkloadMetadataConfigResponse(mode, nodeMetadata);
        }
    }
}
