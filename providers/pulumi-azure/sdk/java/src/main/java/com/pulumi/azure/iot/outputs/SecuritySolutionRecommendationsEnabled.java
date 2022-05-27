// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecuritySolutionRecommendationsEnabled {
    /**
     * @return Is Principal Authentication enabled for the ACR repository? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean acrAuthentication;
    /**
     * @return Is Agent send underutilized messages enabled? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean agentSendUnutilizedMsg;
    /**
     * @return Is Security related system configuration issues identified? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean baseline;
    /**
     * @return Is IoT Edge Hub memory optimized? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean edgeHubMemOptimize;
    /**
     * @return Is logging configured for IoT Edge module? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean edgeLoggingOption;
    /**
     * @return Is inconsistent module settings enabled for SecurityGroup? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean inconsistentModuleSettings;
    /**
     * @return is Azure IoT Security agent installed? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean installAgent;
    /**
     * @return Is Default IP filter policy denied? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean ipFilterDenyAll;
    /**
     * @return Is IP filter rule source allowable IP range too large? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean ipFilterPermissiveRule;
    /**
     * @return Is any ports open on the device? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean openPorts;
    /**
     * @return Does firewall policy exist which allow necessary communication to/from the device? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean permissiveFirewallPolicy;
    /**
     * @return Is only necessary addresses or ports are permitted in? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean permissiveInputFirewallRules;
    /**
     * @return Is only necessary addresses or ports are permitted out? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean permissiveOutputFirewallRules;
    /**
     * @return Is high level permissions are needed for the module? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean privilegedDockerOptions;
    /**
     * @return Is any credentials shared among devices? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean sharedCredentials;
    /**
     * @return Does TLS cipher suite need to be updated? Defaults to `true`.
     * 
     */
    private final @Nullable Boolean vulnerableTlsCipherSuite;

    @CustomType.Constructor
    private SecuritySolutionRecommendationsEnabled(
        @CustomType.Parameter("acrAuthentication") @Nullable Boolean acrAuthentication,
        @CustomType.Parameter("agentSendUnutilizedMsg") @Nullable Boolean agentSendUnutilizedMsg,
        @CustomType.Parameter("baseline") @Nullable Boolean baseline,
        @CustomType.Parameter("edgeHubMemOptimize") @Nullable Boolean edgeHubMemOptimize,
        @CustomType.Parameter("edgeLoggingOption") @Nullable Boolean edgeLoggingOption,
        @CustomType.Parameter("inconsistentModuleSettings") @Nullable Boolean inconsistentModuleSettings,
        @CustomType.Parameter("installAgent") @Nullable Boolean installAgent,
        @CustomType.Parameter("ipFilterDenyAll") @Nullable Boolean ipFilterDenyAll,
        @CustomType.Parameter("ipFilterPermissiveRule") @Nullable Boolean ipFilterPermissiveRule,
        @CustomType.Parameter("openPorts") @Nullable Boolean openPorts,
        @CustomType.Parameter("permissiveFirewallPolicy") @Nullable Boolean permissiveFirewallPolicy,
        @CustomType.Parameter("permissiveInputFirewallRules") @Nullable Boolean permissiveInputFirewallRules,
        @CustomType.Parameter("permissiveOutputFirewallRules") @Nullable Boolean permissiveOutputFirewallRules,
        @CustomType.Parameter("privilegedDockerOptions") @Nullable Boolean privilegedDockerOptions,
        @CustomType.Parameter("sharedCredentials") @Nullable Boolean sharedCredentials,
        @CustomType.Parameter("vulnerableTlsCipherSuite") @Nullable Boolean vulnerableTlsCipherSuite) {
        this.acrAuthentication = acrAuthentication;
        this.agentSendUnutilizedMsg = agentSendUnutilizedMsg;
        this.baseline = baseline;
        this.edgeHubMemOptimize = edgeHubMemOptimize;
        this.edgeLoggingOption = edgeLoggingOption;
        this.inconsistentModuleSettings = inconsistentModuleSettings;
        this.installAgent = installAgent;
        this.ipFilterDenyAll = ipFilterDenyAll;
        this.ipFilterPermissiveRule = ipFilterPermissiveRule;
        this.openPorts = openPorts;
        this.permissiveFirewallPolicy = permissiveFirewallPolicy;
        this.permissiveInputFirewallRules = permissiveInputFirewallRules;
        this.permissiveOutputFirewallRules = permissiveOutputFirewallRules;
        this.privilegedDockerOptions = privilegedDockerOptions;
        this.sharedCredentials = sharedCredentials;
        this.vulnerableTlsCipherSuite = vulnerableTlsCipherSuite;
    }

    /**
     * @return Is Principal Authentication enabled for the ACR repository? Defaults to `true`.
     * 
     */
    public Optional<Boolean> acrAuthentication() {
        return Optional.ofNullable(this.acrAuthentication);
    }
    /**
     * @return Is Agent send underutilized messages enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> agentSendUnutilizedMsg() {
        return Optional.ofNullable(this.agentSendUnutilizedMsg);
    }
    /**
     * @return Is Security related system configuration issues identified? Defaults to `true`.
     * 
     */
    public Optional<Boolean> baseline() {
        return Optional.ofNullable(this.baseline);
    }
    /**
     * @return Is IoT Edge Hub memory optimized? Defaults to `true`.
     * 
     */
    public Optional<Boolean> edgeHubMemOptimize() {
        return Optional.ofNullable(this.edgeHubMemOptimize);
    }
    /**
     * @return Is logging configured for IoT Edge module? Defaults to `true`.
     * 
     */
    public Optional<Boolean> edgeLoggingOption() {
        return Optional.ofNullable(this.edgeLoggingOption);
    }
    /**
     * @return Is inconsistent module settings enabled for SecurityGroup? Defaults to `true`.
     * 
     */
    public Optional<Boolean> inconsistentModuleSettings() {
        return Optional.ofNullable(this.inconsistentModuleSettings);
    }
    /**
     * @return is Azure IoT Security agent installed? Defaults to `true`.
     * 
     */
    public Optional<Boolean> installAgent() {
        return Optional.ofNullable(this.installAgent);
    }
    /**
     * @return Is Default IP filter policy denied? Defaults to `true`.
     * 
     */
    public Optional<Boolean> ipFilterDenyAll() {
        return Optional.ofNullable(this.ipFilterDenyAll);
    }
    /**
     * @return Is IP filter rule source allowable IP range too large? Defaults to `true`.
     * 
     */
    public Optional<Boolean> ipFilterPermissiveRule() {
        return Optional.ofNullable(this.ipFilterPermissiveRule);
    }
    /**
     * @return Is any ports open on the device? Defaults to `true`.
     * 
     */
    public Optional<Boolean> openPorts() {
        return Optional.ofNullable(this.openPorts);
    }
    /**
     * @return Does firewall policy exist which allow necessary communication to/from the device? Defaults to `true`.
     * 
     */
    public Optional<Boolean> permissiveFirewallPolicy() {
        return Optional.ofNullable(this.permissiveFirewallPolicy);
    }
    /**
     * @return Is only necessary addresses or ports are permitted in? Defaults to `true`.
     * 
     */
    public Optional<Boolean> permissiveInputFirewallRules() {
        return Optional.ofNullable(this.permissiveInputFirewallRules);
    }
    /**
     * @return Is only necessary addresses or ports are permitted out? Defaults to `true`.
     * 
     */
    public Optional<Boolean> permissiveOutputFirewallRules() {
        return Optional.ofNullable(this.permissiveOutputFirewallRules);
    }
    /**
     * @return Is high level permissions are needed for the module? Defaults to `true`.
     * 
     */
    public Optional<Boolean> privilegedDockerOptions() {
        return Optional.ofNullable(this.privilegedDockerOptions);
    }
    /**
     * @return Is any credentials shared among devices? Defaults to `true`.
     * 
     */
    public Optional<Boolean> sharedCredentials() {
        return Optional.ofNullable(this.sharedCredentials);
    }
    /**
     * @return Does TLS cipher suite need to be updated? Defaults to `true`.
     * 
     */
    public Optional<Boolean> vulnerableTlsCipherSuite() {
        return Optional.ofNullable(this.vulnerableTlsCipherSuite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecuritySolutionRecommendationsEnabled defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean acrAuthentication;
        private @Nullable Boolean agentSendUnutilizedMsg;
        private @Nullable Boolean baseline;
        private @Nullable Boolean edgeHubMemOptimize;
        private @Nullable Boolean edgeLoggingOption;
        private @Nullable Boolean inconsistentModuleSettings;
        private @Nullable Boolean installAgent;
        private @Nullable Boolean ipFilterDenyAll;
        private @Nullable Boolean ipFilterPermissiveRule;
        private @Nullable Boolean openPorts;
        private @Nullable Boolean permissiveFirewallPolicy;
        private @Nullable Boolean permissiveInputFirewallRules;
        private @Nullable Boolean permissiveOutputFirewallRules;
        private @Nullable Boolean privilegedDockerOptions;
        private @Nullable Boolean sharedCredentials;
        private @Nullable Boolean vulnerableTlsCipherSuite;

        public Builder() {
    	      // Empty
        }

        public Builder(SecuritySolutionRecommendationsEnabled defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acrAuthentication = defaults.acrAuthentication;
    	      this.agentSendUnutilizedMsg = defaults.agentSendUnutilizedMsg;
    	      this.baseline = defaults.baseline;
    	      this.edgeHubMemOptimize = defaults.edgeHubMemOptimize;
    	      this.edgeLoggingOption = defaults.edgeLoggingOption;
    	      this.inconsistentModuleSettings = defaults.inconsistentModuleSettings;
    	      this.installAgent = defaults.installAgent;
    	      this.ipFilterDenyAll = defaults.ipFilterDenyAll;
    	      this.ipFilterPermissiveRule = defaults.ipFilterPermissiveRule;
    	      this.openPorts = defaults.openPorts;
    	      this.permissiveFirewallPolicy = defaults.permissiveFirewallPolicy;
    	      this.permissiveInputFirewallRules = defaults.permissiveInputFirewallRules;
    	      this.permissiveOutputFirewallRules = defaults.permissiveOutputFirewallRules;
    	      this.privilegedDockerOptions = defaults.privilegedDockerOptions;
    	      this.sharedCredentials = defaults.sharedCredentials;
    	      this.vulnerableTlsCipherSuite = defaults.vulnerableTlsCipherSuite;
        }

        public Builder acrAuthentication(@Nullable Boolean acrAuthentication) {
            this.acrAuthentication = acrAuthentication;
            return this;
        }
        public Builder agentSendUnutilizedMsg(@Nullable Boolean agentSendUnutilizedMsg) {
            this.agentSendUnutilizedMsg = agentSendUnutilizedMsg;
            return this;
        }
        public Builder baseline(@Nullable Boolean baseline) {
            this.baseline = baseline;
            return this;
        }
        public Builder edgeHubMemOptimize(@Nullable Boolean edgeHubMemOptimize) {
            this.edgeHubMemOptimize = edgeHubMemOptimize;
            return this;
        }
        public Builder edgeLoggingOption(@Nullable Boolean edgeLoggingOption) {
            this.edgeLoggingOption = edgeLoggingOption;
            return this;
        }
        public Builder inconsistentModuleSettings(@Nullable Boolean inconsistentModuleSettings) {
            this.inconsistentModuleSettings = inconsistentModuleSettings;
            return this;
        }
        public Builder installAgent(@Nullable Boolean installAgent) {
            this.installAgent = installAgent;
            return this;
        }
        public Builder ipFilterDenyAll(@Nullable Boolean ipFilterDenyAll) {
            this.ipFilterDenyAll = ipFilterDenyAll;
            return this;
        }
        public Builder ipFilterPermissiveRule(@Nullable Boolean ipFilterPermissiveRule) {
            this.ipFilterPermissiveRule = ipFilterPermissiveRule;
            return this;
        }
        public Builder openPorts(@Nullable Boolean openPorts) {
            this.openPorts = openPorts;
            return this;
        }
        public Builder permissiveFirewallPolicy(@Nullable Boolean permissiveFirewallPolicy) {
            this.permissiveFirewallPolicy = permissiveFirewallPolicy;
            return this;
        }
        public Builder permissiveInputFirewallRules(@Nullable Boolean permissiveInputFirewallRules) {
            this.permissiveInputFirewallRules = permissiveInputFirewallRules;
            return this;
        }
        public Builder permissiveOutputFirewallRules(@Nullable Boolean permissiveOutputFirewallRules) {
            this.permissiveOutputFirewallRules = permissiveOutputFirewallRules;
            return this;
        }
        public Builder privilegedDockerOptions(@Nullable Boolean privilegedDockerOptions) {
            this.privilegedDockerOptions = privilegedDockerOptions;
            return this;
        }
        public Builder sharedCredentials(@Nullable Boolean sharedCredentials) {
            this.sharedCredentials = sharedCredentials;
            return this;
        }
        public Builder vulnerableTlsCipherSuite(@Nullable Boolean vulnerableTlsCipherSuite) {
            this.vulnerableTlsCipherSuite = vulnerableTlsCipherSuite;
            return this;
        }        public SecuritySolutionRecommendationsEnabled build() {
            return new SecuritySolutionRecommendationsEnabled(acrAuthentication, agentSendUnutilizedMsg, baseline, edgeHubMemOptimize, edgeLoggingOption, inconsistentModuleSettings, installAgent, ipFilterDenyAll, ipFilterPermissiveRule, openPorts, permissiveFirewallPolicy, permissiveInputFirewallRules, permissiveOutputFirewallRules, privilegedDockerOptions, sharedCredentials, vulnerableTlsCipherSuite);
        }
    }
}
