// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupNamedPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupNamedPortArgs Empty = new InstanceGroupNamedPortArgs();

    /**
     * The name of the instance group.
     * 
     */
    @Import(name="group", required=true)
      private final Output<String> group;

    public Output<String> group() {
        return this.group;
    }

    /**
     * The name for this named port. The name must be 1-63 characters
     * long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
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
     * The zone of the instance group.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public InstanceGroupNamedPortArgs(
        Output<String> group,
        @Nullable Output<String> name,
        Output<Integer> port,
        @Nullable Output<String> project,
        @Nullable Output<String> zone) {
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.name = name;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.project = project;
        this.zone = zone;
    }

    private InstanceGroupNamedPortArgs() {
        this.group = Codegen.empty();
        this.name = Codegen.empty();
        this.port = Codegen.empty();
        this.project = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupNamedPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> group;
        private @Nullable Output<String> name;
        private Output<Integer> port;
        private @Nullable Output<String> project;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupNamedPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder group(Output<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder group(String group) {
            this.group = Output.of(Objects.requireNonNull(group));
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
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
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
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public InstanceGroupNamedPortArgs build() {
            return new InstanceGroupNamedPortArgs(group, name, port, project, zone);
        }
    }
}
