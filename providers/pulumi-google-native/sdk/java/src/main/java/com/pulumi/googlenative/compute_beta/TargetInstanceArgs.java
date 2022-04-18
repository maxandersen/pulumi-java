// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.TargetInstanceNatPolicy;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetInstanceArgs Empty = new TargetInstanceArgs();

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
     * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> instance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
     */
    @Import(name="natPolicy")
      private final @Nullable Output<TargetInstanceNatPolicy> natPolicy;

    public Output<TargetInstanceNatPolicy> natPolicy() {
        return this.natPolicy == null ? Codegen.empty() : this.natPolicy;
    }

    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
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

    public TargetInstanceArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> instance,
        @Nullable Output<String> name,
        @Nullable Output<TargetInstanceNatPolicy> natPolicy,
        @Nullable Output<String> network,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<String> zone) {
        this.description = description;
        this.instance = instance;
        this.name = name;
        this.natPolicy = natPolicy;
        this.network = network;
        this.project = project;
        this.requestId = requestId;
        this.zone = zone;
    }

    private TargetInstanceArgs() {
        this.description = Codegen.empty();
        this.instance = Codegen.empty();
        this.name = Codegen.empty();
        this.natPolicy = Codegen.empty();
        this.network = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> name;
        private @Nullable Output<TargetInstanceNatPolicy> natPolicy;
        private @Nullable Output<String> network;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.natPolicy = defaults.natPolicy;
    	      this.network = defaults.network;
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
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
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
        public Builder natPolicy(@Nullable Output<TargetInstanceNatPolicy> natPolicy) {
            this.natPolicy = natPolicy;
            return this;
        }
        public Builder natPolicy(@Nullable TargetInstanceNatPolicy natPolicy) {
            this.natPolicy = Codegen.ofNullable(natPolicy);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
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
        }        public TargetInstanceArgs build() {
            return new TargetInstanceArgs(description, instance, name, natPolicy, network, project, requestId, zone);
        }
    }
}
