// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs.VolumeNodeResources;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CSINodeDriver {
    /**
     * allocatable represents the volume resources of a node that are available for scheduling.
     * 
     */
    private final @Nullable VolumeNodeResources allocatable;
    /**
     * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     * 
     */
    private final String name;
    /**
     * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as &#34;node1&#34;, but the storage system may refer to the same node as &#34;nodeA&#34;. When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. &#34;nodeA&#34; instead of &#34;node1&#34;. This field is required.
     * 
     */
    private final String nodeID;
    /**
     * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. &#34;company.com/zone&#34;, &#34;company.com/region&#34;). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     * 
     */
    private final @Nullable List<String> topologyKeys;

    @CustomType.Constructor
    private CSINodeDriver(
        @CustomType.Parameter("allocatable") @Nullable VolumeNodeResources allocatable,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeID") String nodeID,
        @CustomType.Parameter("topologyKeys") @Nullable List<String> topologyKeys) {
        this.allocatable = allocatable;
        this.name = name;
        this.nodeID = nodeID;
        this.topologyKeys = topologyKeys;
    }

    /**
     * allocatable represents the volume resources of a node that are available for scheduling.
     * 
    */
    public Optional<VolumeNodeResources> allocatable() {
        return Optional.ofNullable(this.allocatable);
    }
    /**
     * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as &#34;node1&#34;, but the storage system may refer to the same node as &#34;nodeA&#34;. When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. &#34;nodeA&#34; instead of &#34;node1&#34;. This field is required.
     * 
    */
    public String nodeID() {
        return this.nodeID;
    }
    /**
     * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. &#34;company.com/zone&#34;, &#34;company.com/region&#34;). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     * 
    */
    public List<String> topologyKeys() {
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

        public Builder allocatable(@Nullable VolumeNodeResources allocatable) {
            this.allocatable = allocatable;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeID(String nodeID) {
            this.nodeID = Objects.requireNonNull(nodeID);
            return this;
        }
        public Builder topologyKeys(@Nullable List<String> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }
        public Builder topologyKeys(String... topologyKeys) {
            return topologyKeys(List.of(topologyKeys));
        }        public CSINodeDriver build() {
            return new CSINodeDriver(allocatable, name, nodeID, topologyKeys);
        }
    }
}
