// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dns_v1beta2.inputs.PolicyAlternativeNameServerConfigArgs;
import com.pulumi.googlenative.dns_v1beta2.inputs.PolicyNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @Import(name="alternativeNameServerConfig")
      private final @Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig;

    public Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig() {
        return this.alternativeNameServerConfig == null ? Codegen.empty() : this.alternativeNameServerConfig;
    }

    @Import(name="clientOperationId")
      private final @Nullable Output<String> clientOperationId;

    public Output<String> clientOperationId() {
        return this.clientOperationId == null ? Codegen.empty() : this.clientOperationId;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    @Import(name="enableInboundForwarding")
      private final @Nullable Output<Boolean> enableInboundForwarding;

    public Output<Boolean> enableInboundForwarding() {
        return this.enableInboundForwarding == null ? Codegen.empty() : this.enableInboundForwarding;
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Output<Boolean> enableLogging;

    public Output<Boolean> enableLogging() {
        return this.enableLogging == null ? Codegen.empty() : this.enableLogging;
    }

    /**
     * Unique identifier for the resource; defined by the server (output only).
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * User-assigned name for this policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @Import(name="networks")
      private final @Nullable Output<List<PolicyNetworkArgs>> networks;

    public Output<List<PolicyNetworkArgs>> networks() {
        return this.networks == null ? Codegen.empty() : this.networks;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public PolicyArgs(
        @Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig,
        @Nullable Output<String> clientOperationId,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableInboundForwarding,
        @Nullable Output<Boolean> enableLogging,
        @Nullable Output<String> id,
        @Nullable Output<String> kind,
        @Nullable Output<String> name,
        @Nullable Output<List<PolicyNetworkArgs>> networks,
        @Nullable Output<String> project) {
        this.alternativeNameServerConfig = alternativeNameServerConfig;
        this.clientOperationId = clientOperationId;
        this.description = description;
        this.enableInboundForwarding = enableInboundForwarding;
        this.enableLogging = enableLogging;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.networks = networks;
        this.project = project;
    }

    private PolicyArgs() {
        this.alternativeNameServerConfig = Codegen.empty();
        this.clientOperationId = Codegen.empty();
        this.description = Codegen.empty();
        this.enableInboundForwarding = Codegen.empty();
        this.enableLogging = Codegen.empty();
        this.id = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.networks = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig;
        private @Nullable Output<String> clientOperationId;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableInboundForwarding;
        private @Nullable Output<Boolean> enableLogging;
        private @Nullable Output<String> id;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PolicyNetworkArgs>> networks;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeNameServerConfig = defaults.alternativeNameServerConfig;
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.description = defaults.description;
    	      this.enableInboundForwarding = defaults.enableInboundForwarding;
    	      this.enableLogging = defaults.enableLogging;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.project = defaults.project;
        }

        public Builder alternativeNameServerConfig(@Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig) {
            this.alternativeNameServerConfig = alternativeNameServerConfig;
            return this;
        }
        public Builder alternativeNameServerConfig(@Nullable PolicyAlternativeNameServerConfigArgs alternativeNameServerConfig) {
            this.alternativeNameServerConfig = Codegen.ofNullable(alternativeNameServerConfig);
            return this;
        }
        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }
        public Builder clientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Codegen.ofNullable(clientOperationId);
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
        public Builder enableInboundForwarding(@Nullable Output<Boolean> enableInboundForwarding) {
            this.enableInboundForwarding = enableInboundForwarding;
            return this;
        }
        public Builder enableInboundForwarding(@Nullable Boolean enableInboundForwarding) {
            this.enableInboundForwarding = Codegen.ofNullable(enableInboundForwarding);
            return this;
        }
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder enableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Codegen.ofNullable(enableLogging);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder networks(@Nullable Output<List<PolicyNetworkArgs>> networks) {
            this.networks = networks;
            return this;
        }
        public Builder networks(@Nullable List<PolicyNetworkArgs> networks) {
            this.networks = Codegen.ofNullable(networks);
            return this;
        }
        public Builder networks(PolicyNetworkArgs... networks) {
            return networks(List.of(networks));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public PolicyArgs build() {
            return new PolicyArgs(alternativeNameServerConfig, clientOperationId, description, enableInboundForwarding, enableLogging, id, kind, name, networks, project);
        }
    }
}
