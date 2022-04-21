// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.TargetInstanceNatPolicy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetInstanceArgs Empty = new TargetInstanceArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * NAT option controlling how IPs are NAT&#39;ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
     */
    @Import(name="natPolicy")
    private @Nullable Output<TargetInstanceNatPolicy> natPolicy;

    public Optional<Output<TargetInstanceNatPolicy>> natPolicy() {
        return Optional.ofNullable(this.natPolicy);
    }

    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private TargetInstanceArgs() {}

    private TargetInstanceArgs(TargetInstanceArgs $) {
        this.description = $.description;
        this.instance = $.instance;
        this.name = $.name;
        this.natPolicy = $.natPolicy;
        this.network = $.network;
        this.project = $.project;
        this.requestId = $.requestId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetInstanceArgs $;

        public Builder() {
            $ = new TargetInstanceArgs();
        }

        public Builder(TargetInstanceArgs defaults) {
            $ = new TargetInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder natPolicy(@Nullable Output<TargetInstanceNatPolicy> natPolicy) {
            $.natPolicy = natPolicy;
            return this;
        }

        public Builder natPolicy(TargetInstanceNatPolicy natPolicy) {
            return natPolicy(Output.of(natPolicy));
        }

        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public TargetInstanceArgs build() {
            return $;
        }
    }

}
