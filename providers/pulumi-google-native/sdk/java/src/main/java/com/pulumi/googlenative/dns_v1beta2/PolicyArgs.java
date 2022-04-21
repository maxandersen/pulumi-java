// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.inputs.PolicyAlternativeNameServerConfigArgs;
import com.pulumi.googlenative.dns_v1beta2.inputs.PolicyNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @Import(name="alternativeNameServerConfig")
    private @Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig;

    public Optional<Output<PolicyAlternativeNameServerConfigArgs>> alternativeNameServerConfig() {
        return Optional.ofNullable(this.alternativeNameServerConfig);
    }

    @Import(name="clientOperationId")
    private @Nullable Output<String> clientOperationId;

    public Optional<Output<String>> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the policy&#39;s function.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    @Import(name="enableInboundForwarding")
    private @Nullable Output<Boolean> enableInboundForwarding;

    public Optional<Output<Boolean>> enableInboundForwarding() {
        return Optional.ofNullable(this.enableInboundForwarding);
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * Unique identifier for the resource; defined by the server (output only).
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * User-assigned name for this policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<PolicyNetworkArgs>> networks;

    public Optional<Output<List<PolicyNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.alternativeNameServerConfig = $.alternativeNameServerConfig;
        this.clientOperationId = $.clientOperationId;
        this.description = $.description;
        this.enableInboundForwarding = $.enableInboundForwarding;
        this.enableLogging = $.enableLogging;
        this.id = $.id;
        this.kind = $.kind;
        this.name = $.name;
        this.networks = $.networks;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder alternativeNameServerConfig(@Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig) {
            $.alternativeNameServerConfig = alternativeNameServerConfig;
            return this;
        }

        public Builder alternativeNameServerConfig(PolicyAlternativeNameServerConfigArgs alternativeNameServerConfig) {
            return alternativeNameServerConfig(Output.of(alternativeNameServerConfig));
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(String clientOperationId) {
            return clientOperationId(Output.of(clientOperationId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder enableInboundForwarding(@Nullable Output<Boolean> enableInboundForwarding) {
            $.enableInboundForwarding = enableInboundForwarding;
            return this;
        }

        public Builder enableInboundForwarding(Boolean enableInboundForwarding) {
            return enableInboundForwarding(Output.of(enableInboundForwarding));
        }

        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder networks(@Nullable Output<List<PolicyNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        public Builder networks(List<PolicyNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        public Builder networks(PolicyNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public PolicyArgs build() {
            return $;
        }
    }

}
