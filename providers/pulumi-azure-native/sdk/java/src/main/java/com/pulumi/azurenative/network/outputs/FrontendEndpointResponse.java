// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.CustomHttpsConfigurationResponse;
import com.pulumi.azurenative.network.outputs.FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontendEndpointResponse {
    /**
     * The configuration specifying how to enable HTTPS
     * 
     */
    private final CustomHttpsConfigurationResponse customHttpsConfiguration;
    /**
     * Provisioning status of Custom Https of the frontendEndpoint.
     * 
     */
    private final String customHttpsProvisioningState;
    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
     */
    private final String customHttpsProvisioningSubstate;
    /**
     * The host name of the frontendEndpoint. Must be a domain name.
     * 
     */
    private final @Nullable String hostName;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * Resource status.
     * 
     */
    private final String resourceState;
    /**
     * Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    private final @Nullable String sessionAffinityEnabledState;
    /**
     * UNUSED. This field will be ignored. The TTL to use in seconds for session affinity, if applicable.
     * 
     */
    private final @Nullable Integer sessionAffinityTtlSeconds;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Defines the Web Application Firewall policy for each host (if applicable)
     * 
     */
    private final @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    @CustomType.Constructor
    private FrontendEndpointResponse(
        @CustomType.Parameter("customHttpsConfiguration") CustomHttpsConfigurationResponse customHttpsConfiguration,
        @CustomType.Parameter("customHttpsProvisioningState") String customHttpsProvisioningState,
        @CustomType.Parameter("customHttpsProvisioningSubstate") String customHttpsProvisioningSubstate,
        @CustomType.Parameter("hostName") @Nullable String hostName,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("sessionAffinityEnabledState") @Nullable String sessionAffinityEnabledState,
        @CustomType.Parameter("sessionAffinityTtlSeconds") @Nullable Integer sessionAffinityTtlSeconds,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("webApplicationFirewallPolicyLink") @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        this.customHttpsConfiguration = customHttpsConfiguration;
        this.customHttpsProvisioningState = customHttpsProvisioningState;
        this.customHttpsProvisioningSubstate = customHttpsProvisioningSubstate;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.resourceState = resourceState;
        this.sessionAffinityEnabledState = sessionAffinityEnabledState;
        this.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
        this.type = type;
        this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
    }

    /**
     * The configuration specifying how to enable HTTPS
     * 
    */
    public CustomHttpsConfigurationResponse customHttpsConfiguration() {
        return this.customHttpsConfiguration;
    }
    /**
     * Provisioning status of Custom Https of the frontendEndpoint.
     * 
    */
    public String customHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }
    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     * 
    */
    public String customHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }
    /**
     * The host name of the frontendEndpoint. Must be a domain name.
     * 
    */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Resource status.
     * 
    */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * Whether to allow session affinity on this host. Valid options are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
    */
    public Optional<String> sessionAffinityEnabledState() {
        return Optional.ofNullable(this.sessionAffinityEnabledState);
    }
    /**
     * UNUSED. This field will be ignored. The TTL to use in seconds for session affinity, if applicable.
     * 
    */
    public Optional<Integer> sessionAffinityTtlSeconds() {
        return Optional.ofNullable(this.sessionAffinityTtlSeconds);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Defines the Web Application Firewall policy for each host (if applicable)
     * 
    */
    public Optional<FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink> webApplicationFirewallPolicyLink() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontendEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHttpsConfigurationResponse customHttpsConfiguration;
        private String customHttpsProvisioningState;
        private String customHttpsProvisioningSubstate;
        private @Nullable String hostName;
        private @Nullable String id;
        private @Nullable String name;
        private String resourceState;
        private @Nullable String sessionAffinityEnabledState;
        private @Nullable Integer sessionAffinityTtlSeconds;
        private String type;
        private @Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontendEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHttpsConfiguration = defaults.customHttpsConfiguration;
    	      this.customHttpsProvisioningState = defaults.customHttpsProvisioningState;
    	      this.customHttpsProvisioningSubstate = defaults.customHttpsProvisioningSubstate;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.sessionAffinityEnabledState = defaults.sessionAffinityEnabledState;
    	      this.sessionAffinityTtlSeconds = defaults.sessionAffinityTtlSeconds;
    	      this.type = defaults.type;
    	      this.webApplicationFirewallPolicyLink = defaults.webApplicationFirewallPolicyLink;
        }

        public Builder customHttpsConfiguration(CustomHttpsConfigurationResponse customHttpsConfiguration) {
            this.customHttpsConfiguration = Objects.requireNonNull(customHttpsConfiguration);
            return this;
        }
        public Builder customHttpsProvisioningState(String customHttpsProvisioningState) {
            this.customHttpsProvisioningState = Objects.requireNonNull(customHttpsProvisioningState);
            return this;
        }
        public Builder customHttpsProvisioningSubstate(String customHttpsProvisioningSubstate) {
            this.customHttpsProvisioningSubstate = Objects.requireNonNull(customHttpsProvisioningSubstate);
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder sessionAffinityEnabledState(@Nullable String sessionAffinityEnabledState) {
            this.sessionAffinityEnabledState = sessionAffinityEnabledState;
            return this;
        }
        public Builder sessionAffinityTtlSeconds(@Nullable Integer sessionAffinityTtlSeconds) {
            this.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder webApplicationFirewallPolicyLink(@Nullable FrontendEndpointUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
            this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }        public FrontendEndpointResponse build() {
            return new FrontendEndpointResponse(customHttpsConfiguration, customHttpsProvisioningState, customHttpsProvisioningSubstate, hostName, id, name, resourceState, sessionAffinityEnabledState, sessionAffinityTtlSeconds, type, webApplicationFirewallPolicyLink);
        }
    }
}
