// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigGuestAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigGuestAcceleratorArgs Empty = new ClusterNodePoolNodeConfigGuestAcceleratorArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    @Import(name="gpuPartitionSize")
    private @Nullable Output<String> gpuPartitionSize;

    public Optional<Output<String>> gpuPartitionSize() {
        return Optional.ofNullable(this.gpuPartitionSize);
    }

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ClusterNodePoolNodeConfigGuestAcceleratorArgs() {}

    private ClusterNodePoolNodeConfigGuestAcceleratorArgs(ClusterNodePoolNodeConfigGuestAcceleratorArgs $) {
        this.count = $.count;
        this.gpuPartitionSize = $.gpuPartitionSize;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigGuestAcceleratorArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigGuestAcceleratorArgs();
        }

        public Builder(ClusterNodePoolNodeConfigGuestAcceleratorArgs defaults) {
            $ = new ClusterNodePoolNodeConfigGuestAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder gpuPartitionSize(@Nullable Output<String> gpuPartitionSize) {
            $.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder gpuPartitionSize(String gpuPartitionSize) {
            return gpuPartitionSize(Output.of(gpuPartitionSize));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ClusterNodePoolNodeConfigGuestAcceleratorArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
