// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.NodeTemplateCpuOvercommitType;
import io.pulumi.googlenative.compute_alpha.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.LocalDiskArgs;
import io.pulumi.googlenative.compute_alpha.inputs.NodeTemplateNodeTypeFlexibilityArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ServerBindingArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTemplateArgs Empty = new NodeTemplateArgs();

    @Import(name="accelerators")
      private final @Nullable Output<List<AcceleratorConfigArgs>> accelerators;

    public Output<List<AcceleratorConfigArgs>> accelerators() {
        return this.accelerators == null ? Codegen.empty() : this.accelerators;
    }

    /**
     * CPU overcommit.
     * 
     */
    @Import(name="cpuOvercommitType")
      private final @Nullable Output<NodeTemplateCpuOvercommitType> cpuOvercommitType;

    public Output<NodeTemplateCpuOvercommitType> cpuOvercommitType() {
        return this.cpuOvercommitType == null ? Codegen.empty() : this.cpuOvercommitType;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="disks")
      private final @Nullable Output<List<LocalDiskArgs>> disks;

    public Output<List<LocalDiskArgs>> disks() {
        return this.disks == null ? Codegen.empty() : this.disks;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    @Import(name="nodeAffinityLabels")
      private final @Nullable Output<Map<String,String>> nodeAffinityLabels;

    public Output<Map<String,String>> nodeAffinityLabels() {
        return this.nodeAffinityLabels == null ? Codegen.empty() : this.nodeAffinityLabels;
    }

    /**
     * The node type to use for nodes group that are created from this template.
     * 
     */
    @Import(name="nodeType")
      private final @Nullable Output<String> nodeType;

    public Output<String> nodeType() {
        return this.nodeType == null ? Codegen.empty() : this.nodeType;
    }

    /**
     * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    @Import(name="nodeTypeFlexibility")
      private final @Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility;

    public Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility() {
        return this.nodeTypeFlexibility == null ? Codegen.empty() : this.nodeTypeFlexibility;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    @Import(name="serverBinding")
      private final @Nullable Output<ServerBindingArgs> serverBinding;

    public Output<ServerBindingArgs> serverBinding() {
        return this.serverBinding == null ? Codegen.empty() : this.serverBinding;
    }

    public NodeTemplateArgs(
        @Nullable Output<List<AcceleratorConfigArgs>> accelerators,
        @Nullable Output<NodeTemplateCpuOvercommitType> cpuOvercommitType,
        @Nullable Output<String> description,
        @Nullable Output<List<LocalDiskArgs>> disks,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> nodeAffinityLabels,
        @Nullable Output<String> nodeType,
        @Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<ServerBindingArgs> serverBinding) {
        this.accelerators = accelerators;
        this.cpuOvercommitType = cpuOvercommitType;
        this.description = description;
        this.disks = disks;
        this.name = name;
        this.nodeAffinityLabels = nodeAffinityLabels;
        this.nodeType = nodeType;
        this.nodeTypeFlexibility = nodeTypeFlexibility;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.serverBinding = serverBinding;
    }

    private NodeTemplateArgs() {
        this.accelerators = Codegen.empty();
        this.cpuOvercommitType = Codegen.empty();
        this.description = Codegen.empty();
        this.disks = Codegen.empty();
        this.name = Codegen.empty();
        this.nodeAffinityLabels = Codegen.empty();
        this.nodeType = Codegen.empty();
        this.nodeTypeFlexibility = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serverBinding = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AcceleratorConfigArgs>> accelerators;
        private @Nullable Output<NodeTemplateCpuOvercommitType> cpuOvercommitType;
        private @Nullable Output<String> description;
        private @Nullable Output<List<LocalDiskArgs>> disks;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> nodeAffinityLabels;
        private @Nullable Output<String> nodeType;
        private @Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ServerBindingArgs> serverBinding;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.cpuOvercommitType = defaults.cpuOvercommitType;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.name = defaults.name;
    	      this.nodeAffinityLabels = defaults.nodeAffinityLabels;
    	      this.nodeType = defaults.nodeType;
    	      this.nodeTypeFlexibility = defaults.nodeTypeFlexibility;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.serverBinding = defaults.serverBinding;
        }

        public Builder accelerators(@Nullable Output<List<AcceleratorConfigArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public Builder accelerators(@Nullable List<AcceleratorConfigArgs> accelerators) {
            this.accelerators = Codegen.ofNullable(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorConfigArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder cpuOvercommitType(@Nullable Output<NodeTemplateCpuOvercommitType> cpuOvercommitType) {
            this.cpuOvercommitType = cpuOvercommitType;
            return this;
        }
        public Builder cpuOvercommitType(@Nullable NodeTemplateCpuOvercommitType cpuOvercommitType) {
            this.cpuOvercommitType = Codegen.ofNullable(cpuOvercommitType);
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
        public Builder disks(@Nullable Output<List<LocalDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(@Nullable List<LocalDiskArgs> disks) {
            this.disks = Codegen.ofNullable(disks);
            return this;
        }
        public Builder disks(LocalDiskArgs... disks) {
            return disks(List.of(disks));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder nodeAffinityLabels(@Nullable Output<Map<String,String>> nodeAffinityLabels) {
            this.nodeAffinityLabels = nodeAffinityLabels;
            return this;
        }
        public Builder nodeAffinityLabels(@Nullable Map<String,String> nodeAffinityLabels) {
            this.nodeAffinityLabels = Codegen.ofNullable(nodeAffinityLabels);
            return this;
        }
        public Builder nodeType(@Nullable Output<String> nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Builder nodeType(@Nullable String nodeType) {
            this.nodeType = Codegen.ofNullable(nodeType);
            return this;
        }
        public Builder nodeTypeFlexibility(@Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility) {
            this.nodeTypeFlexibility = nodeTypeFlexibility;
            return this;
        }
        public Builder nodeTypeFlexibility(@Nullable NodeTemplateNodeTypeFlexibilityArgs nodeTypeFlexibility) {
            this.nodeTypeFlexibility = Codegen.ofNullable(nodeTypeFlexibility);
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
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serverBinding(@Nullable Output<ServerBindingArgs> serverBinding) {
            this.serverBinding = serverBinding;
            return this;
        }
        public Builder serverBinding(@Nullable ServerBindingArgs serverBinding) {
            this.serverBinding = Codegen.ofNullable(serverBinding);
            return this;
        }        public NodeTemplateArgs build() {
            return new NodeTemplateArgs(accelerators, cpuOvercommitType, description, disks, name, nodeAffinityLabels, nodeType, nodeTypeFlexibility, project, region, requestId, serverBinding);
        }
    }
}
