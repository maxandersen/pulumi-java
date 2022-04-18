// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupState extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupState Empty = new NodeGroupState();

    /**
     * If you use sole-tenant nodes for your workloads, you can use the node
     * group autoscaler to automatically manage the sizes of your node groups.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscalingPolicy")
      private final @Nullable Output<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy;

    public Output<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy() {
        return this.autoscalingPolicy == null ? Codegen.empty() : this.autoscalingPolicy;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> creationTimestamp() {
        return this.creationTimestamp == null ? Codegen.empty() : this.creationTimestamp;
    }

    /**
     * An optional textual description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The initial number of nodes in the node group. One of `initial_size` or `size` must be specified.
     * 
     */
    @Import(name="initialSize")
      private final @Nullable Output<Integer> initialSize;

    public Output<Integer> initialSize() {
        return this.initialSize == null ? Codegen.empty() : this.initialSize;
    }

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
     * 
     */
    @Import(name="maintenancePolicy")
      private final @Nullable Output<String> maintenancePolicy;

    public Output<String> maintenancePolicy() {
        return this.maintenancePolicy == null ? Codegen.empty() : this.maintenancePolicy;
    }

    /**
     * contains properties for the timeframe of maintenance
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceWindow")
      private final @Nullable Output<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow;

    public Output<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow() {
        return this.maintenanceWindow == null ? Codegen.empty() : this.maintenanceWindow;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the node template to which this node group belongs.
     * 
     */
    @Import(name="nodeTemplate")
      private final @Nullable Output<String> nodeTemplate;

    public Output<String> nodeTemplate() {
        return this.nodeTemplate == null ? Codegen.empty() : this.nodeTemplate;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * The total number of nodes in the node group. One of `initial_size` or `size` must be specified.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> size() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * Zone where this node group is located
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public NodeGroupState(
        @Nullable Output<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<Integer> initialSize,
        @Nullable Output<String> maintenancePolicy,
        @Nullable Output<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow,
        @Nullable Output<String> name,
        @Nullable Output<String> nodeTemplate,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink,
        @Nullable Output<Integer> size,
        @Nullable Output<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.initialSize = initialSize;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeTemplate = nodeTemplate;
        this.project = project;
        this.selfLink = selfLink;
        this.size = size;
        this.zone = zone;
    }

    private NodeGroupState() {
        this.autoscalingPolicy = Codegen.empty();
        this.creationTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.initialSize = Codegen.empty();
        this.maintenancePolicy = Codegen.empty();
        this.maintenanceWindow = Codegen.empty();
        this.name = Codegen.empty();
        this.nodeTemplate = Codegen.empty();
        this.project = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.size = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> initialSize;
        private @Nullable Output<String> maintenancePolicy;
        private @Nullable Output<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nodeTemplate;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<Integer> size;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.initialSize = defaults.initialSize;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(@Nullable Output<NodeGroupAutoscalingPolicyGetArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }
        public Builder autoscalingPolicy(@Nullable NodeGroupAutoscalingPolicyGetArgs autoscalingPolicy) {
            this.autoscalingPolicy = Codegen.ofNullable(autoscalingPolicy);
            return this;
        }
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Codegen.ofNullable(creationTimestamp);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder initialSize(@Nullable Output<Integer> initialSize) {
            this.initialSize = initialSize;
            return this;
        }
        public Builder initialSize(@Nullable Integer initialSize) {
            this.initialSize = Codegen.ofNullable(initialSize);
            return this;
        }
        public Builder maintenancePolicy(@Nullable Output<String> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }
        public Builder maintenancePolicy(@Nullable String maintenancePolicy) {
            this.maintenancePolicy = Codegen.ofNullable(maintenancePolicy);
            return this;
        }
        public Builder maintenanceWindow(@Nullable Output<NodeGroupMaintenanceWindowGetArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder maintenanceWindow(@Nullable NodeGroupMaintenanceWindowGetArgs maintenanceWindow) {
            this.maintenanceWindow = Codegen.ofNullable(maintenanceWindow);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder nodeTemplate(@Nullable Output<String> nodeTemplate) {
            this.nodeTemplate = nodeTemplate;
            return this;
        }
        public Builder nodeTemplate(@Nullable String nodeTemplate) {
            this.nodeTemplate = Codegen.ofNullable(nodeTemplate);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable Integer size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public NodeGroupState build() {
            return new NodeGroupState(autoscalingPolicy, creationTimestamp, description, initialSize, maintenancePolicy, maintenanceWindow, name, nodeTemplate, project, selfLink, size, zone);
        }
    }
}
