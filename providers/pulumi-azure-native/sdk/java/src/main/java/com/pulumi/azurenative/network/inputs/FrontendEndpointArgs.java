// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.SessionAffinityEnabledState;
import com.pulumi.azurenative.network.inputs.FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A frontend endpoint used for routing.
 * 
 */
public final class FrontendEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontendEndpointArgs Empty = new FrontendEndpointArgs();

    /**
     * The host name of the frontendEndpoint. Must be a domain name.
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="sessionAffinityEnabledState")
    private @Nullable Output<Either<String,SessionAffinityEnabledState>> sessionAffinityEnabledState;

    public Optional<Output<Either<String,SessionAffinityEnabledState>>> sessionAffinityEnabledState() {
        return Optional.ofNullable(this.sessionAffinityEnabledState);
    }

    /**
     * UNUSED. This field will be ignored. The TTL to use in seconds for session affinity, if applicable.
     * 
     */
    @Import(name="sessionAffinityTtlSeconds")
    private @Nullable Output<Integer> sessionAffinityTtlSeconds;

    public Optional<Output<Integer>> sessionAffinityTtlSeconds() {
        return Optional.ofNullable(this.sessionAffinityTtlSeconds);
    }

    /**
     * Defines the Web Application Firewall policy for each host (if applicable)
     * 
     */
    @Import(name="webApplicationFirewallPolicyLink")
    private @Nullable Output<FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs> webApplicationFirewallPolicyLink;

    public Optional<Output<FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs>> webApplicationFirewallPolicyLink() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    private FrontendEndpointArgs() {}

    private FrontendEndpointArgs(FrontendEndpointArgs $) {
        this.hostName = $.hostName;
        this.id = $.id;
        this.name = $.name;
        this.sessionAffinityEnabledState = $.sessionAffinityEnabledState;
        this.sessionAffinityTtlSeconds = $.sessionAffinityTtlSeconds;
        this.webApplicationFirewallPolicyLink = $.webApplicationFirewallPolicyLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontendEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontendEndpointArgs $;

        public Builder() {
            $ = new FrontendEndpointArgs();
        }

        public Builder(FrontendEndpointArgs defaults) {
            $ = new FrontendEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sessionAffinityEnabledState(@Nullable Output<Either<String,SessionAffinityEnabledState>> sessionAffinityEnabledState) {
            $.sessionAffinityEnabledState = sessionAffinityEnabledState;
            return this;
        }

        public Builder sessionAffinityEnabledState(Either<String,SessionAffinityEnabledState> sessionAffinityEnabledState) {
            return sessionAffinityEnabledState(Output.of(sessionAffinityEnabledState));
        }

        public Builder sessionAffinityTtlSeconds(@Nullable Output<Integer> sessionAffinityTtlSeconds) {
            $.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
            return this;
        }

        public Builder sessionAffinityTtlSeconds(Integer sessionAffinityTtlSeconds) {
            return sessionAffinityTtlSeconds(Output.of(sessionAffinityTtlSeconds));
        }

        public Builder webApplicationFirewallPolicyLink(@Nullable Output<FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs> webApplicationFirewallPolicyLink) {
            $.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }

        public Builder webApplicationFirewallPolicyLink(FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLinkArgs webApplicationFirewallPolicyLink) {
            return webApplicationFirewallPolicyLink(Output.of(webApplicationFirewallPolicyLink));
        }

        public FrontendEndpointArgs build() {
            return $;
        }
    }

}
