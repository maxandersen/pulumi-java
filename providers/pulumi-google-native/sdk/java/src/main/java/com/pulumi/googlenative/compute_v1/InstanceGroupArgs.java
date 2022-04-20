// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.inputs.NamedPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupArgs Empty = new InstanceGroupArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     *  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;http&#34;, port: 80},{name: &#34;http&#34;, port: 8080}] Named ports apply to all instances in this instance group.
     * 
     */
    @Import(name="namedPorts")
      private final @Nullable Output<List<NamedPortArgs>> namedPorts;

    public Output<List<NamedPortArgs>> namedPorts() {
        return this.namedPorts == null ? Codegen.empty() : this.namedPorts;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public InstanceGroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<NamedPortArgs>> namedPorts,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<String> zone) {
        this.description = description;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.requestId = requestId;
        this.zone = zone;
    }

    private InstanceGroupArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.namedPorts = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<NamedPortArgs>> namedPorts;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.zone = defaults.zone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder namedPorts(@Nullable Output<List<NamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }
        public Builder namedPorts(@Nullable List<NamedPortArgs> namedPorts) {
            this.namedPorts = Codegen.ofNullable(namedPorts);
            return this;
        }
        public Builder namedPorts(NamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
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
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public InstanceGroupArgs build() {
            return new InstanceGroupArgs(description, name, namedPorts, project, requestId, zone);
        }
    }
}
