// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeNodeResources {
    /**
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.
     * 
     */
    private final @Nullable Integer count;

    @OutputCustomType.Constructor({"count"})
    private VolumeNodeResources(@Nullable Integer count) {
        this.count = count;
    }

    /**
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.
     * 
     */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeNodeResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeNodeResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public VolumeNodeResources build() {
            return new VolumeNodeResources(count);
        }
    }
}
