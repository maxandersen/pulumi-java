// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupNamedPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupNamedPortArgs Empty = new InstanceGroupNamedPortArgs();

    /**
     * The name of the instance group.
     * 
     */
    @Import(name="group", required=true)
    private Output<String> group;

    public Output<String> group() {
        return this.group;
    }

    /**
     * The name for this named port. The name must be 1-63 characters
     * long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The zone of the instance group.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceGroupNamedPortArgs() {}

    private InstanceGroupNamedPortArgs(InstanceGroupNamedPortArgs $) {
        this.group = $.group;
        this.name = $.name;
        this.port = $.port;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupNamedPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupNamedPortArgs $;

        public Builder() {
            $ = new InstanceGroupNamedPortArgs();
        }

        public Builder(InstanceGroupNamedPortArgs defaults) {
            $ = new InstanceGroupNamedPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder group(Output<String> group) {
            $.group = group;
            return this;
        }

        public Builder group(String group) {
            return group(Output.of(group));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceGroupNamedPortArgs build() {
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
