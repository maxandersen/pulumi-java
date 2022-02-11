// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs.VolumeNodeResources;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CSINodeDriver {
    private final @Nullable VolumeNodeResources allocatable;
    private final String name;
    private final String nodeID;
    private final @Nullable List<String> topologyKeys;

    @OutputCustomType.Constructor({"allocatable","name","nodeID","topologyKeys"})
    private CSINodeDriver(
        @Nullable VolumeNodeResources allocatable,
        String name,
        String nodeID,
        @Nullable List<String> topologyKeys) {
        this.allocatable = allocatable;
        this.name = Objects.requireNonNull(name);
        this.nodeID = Objects.requireNonNull(nodeID);
        this.topologyKeys = topologyKeys;
    }

    public Optional<VolumeNodeResources> getAllocatable() {
        return Optional.ofNullable(this.allocatable);
    }
    public String getName() {
        return this.name;
    }
    public String getNodeID() {
        return this.nodeID;
    }
    public List<String> getTopologyKeys() {
        return this.topologyKeys == null ? List.of() : this.topologyKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeDriver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VolumeNodeResources allocatable;
        private String name;
        private String nodeID;
        private @Nullable List<String> topologyKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINodeDriver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatable = defaults.allocatable;
    	      this.name = defaults.name;
    	      this.nodeID = defaults.nodeID;
    	      this.topologyKeys = defaults.topologyKeys;
        }

        public Builder setAllocatable(@Nullable VolumeNodeResources allocatable) {
            this.allocatable = allocatable;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeID(String nodeID) {
            this.nodeID = Objects.requireNonNull(nodeID);
            return this;
        }

        public Builder setTopologyKeys(@Nullable List<String> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }

        public CSINodeDriver build() {
            return new CSINodeDriver(allocatable, name, nodeID, topologyKeys);
        }
    }
}
