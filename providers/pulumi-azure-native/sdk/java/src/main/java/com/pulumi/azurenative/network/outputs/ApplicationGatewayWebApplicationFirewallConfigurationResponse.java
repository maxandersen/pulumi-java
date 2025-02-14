// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.ApplicationGatewayFirewallDisabledRuleGroupResponse;
import com.pulumi.azurenative.network.outputs.ApplicationGatewayFirewallExclusionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayWebApplicationFirewallConfigurationResponse {
    /**
     * @return The disabled rule groups.
     * 
     */
    private final @Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups;
    /**
     * @return Whether the web application firewall is enabled or not.
     * 
     */
    private final Boolean enabled;
    /**
     * @return The exclusion list.
     * 
     */
    private final @Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions;
    /**
     * @return Maximum file upload size in Mb for WAF.
     * 
     */
    private final @Nullable Integer fileUploadLimitInMb;
    /**
     * @return Web application firewall mode.
     * 
     */
    private final String firewallMode;
    /**
     * @return Maximum request body size for WAF.
     * 
     */
    private final @Nullable Integer maxRequestBodySize;
    /**
     * @return Maximum request body size in Kb for WAF.
     * 
     */
    private final @Nullable Integer maxRequestBodySizeInKb;
    /**
     * @return Whether allow WAF to check request Body.
     * 
     */
    private final @Nullable Boolean requestBodyCheck;
    /**
     * @return The type of the web application firewall rule set. Possible values are: &#39;OWASP&#39;.
     * 
     */
    private final String ruleSetType;
    /**
     * @return The version of the rule set type.
     * 
     */
    private final String ruleSetVersion;

    @CustomType.Constructor
    private ApplicationGatewayWebApplicationFirewallConfigurationResponse(
        @CustomType.Parameter("disabledRuleGroups") @Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("exclusions") @Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions,
        @CustomType.Parameter("fileUploadLimitInMb") @Nullable Integer fileUploadLimitInMb,
        @CustomType.Parameter("firewallMode") String firewallMode,
        @CustomType.Parameter("maxRequestBodySize") @Nullable Integer maxRequestBodySize,
        @CustomType.Parameter("maxRequestBodySizeInKb") @Nullable Integer maxRequestBodySizeInKb,
        @CustomType.Parameter("requestBodyCheck") @Nullable Boolean requestBodyCheck,
        @CustomType.Parameter("ruleSetType") String ruleSetType,
        @CustomType.Parameter("ruleSetVersion") String ruleSetVersion) {
        this.disabledRuleGroups = disabledRuleGroups;
        this.enabled = enabled;
        this.exclusions = exclusions;
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        this.firewallMode = firewallMode;
        this.maxRequestBodySize = maxRequestBodySize;
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        this.requestBodyCheck = requestBodyCheck;
        this.ruleSetType = ruleSetType;
        this.ruleSetVersion = ruleSetVersion;
    }

    /**
     * @return The disabled rule groups.
     * 
     */
    public List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups() {
        return this.disabledRuleGroups == null ? List.of() : this.disabledRuleGroups;
    }
    /**
     * @return Whether the web application firewall is enabled or not.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The exclusion list.
     * 
     */
    public List<ApplicationGatewayFirewallExclusionResponse> exclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }
    /**
     * @return Maximum file upload size in Mb for WAF.
     * 
     */
    public Optional<Integer> fileUploadLimitInMb() {
        return Optional.ofNullable(this.fileUploadLimitInMb);
    }
    /**
     * @return Web application firewall mode.
     * 
     */
    public String firewallMode() {
        return this.firewallMode;
    }
    /**
     * @return Maximum request body size for WAF.
     * 
     */
    public Optional<Integer> maxRequestBodySize() {
        return Optional.ofNullable(this.maxRequestBodySize);
    }
    /**
     * @return Maximum request body size in Kb for WAF.
     * 
     */
    public Optional<Integer> maxRequestBodySizeInKb() {
        return Optional.ofNullable(this.maxRequestBodySizeInKb);
    }
    /**
     * @return Whether allow WAF to check request Body.
     * 
     */
    public Optional<Boolean> requestBodyCheck() {
        return Optional.ofNullable(this.requestBodyCheck);
    }
    /**
     * @return The type of the web application firewall rule set. Possible values are: &#39;OWASP&#39;.
     * 
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }
    /**
     * @return The version of the rule set type.
     * 
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayWebApplicationFirewallConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups;
        private Boolean enabled;
        private @Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions;
        private @Nullable Integer fileUploadLimitInMb;
        private String firewallMode;
        private @Nullable Integer maxRequestBodySize;
        private @Nullable Integer maxRequestBodySizeInKb;
        private @Nullable Boolean requestBodyCheck;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayWebApplicationFirewallConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledRuleGroups = defaults.disabledRuleGroups;
    	      this.enabled = defaults.enabled;
    	      this.exclusions = defaults.exclusions;
    	      this.fileUploadLimitInMb = defaults.fileUploadLimitInMb;
    	      this.firewallMode = defaults.firewallMode;
    	      this.maxRequestBodySize = defaults.maxRequestBodySize;
    	      this.maxRequestBodySizeInKb = defaults.maxRequestBodySizeInKb;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder disabledRuleGroups(@Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups) {
            this.disabledRuleGroups = disabledRuleGroups;
            return this;
        }
        public Builder disabledRuleGroups(ApplicationGatewayFirewallDisabledRuleGroupResponse... disabledRuleGroups) {
            return disabledRuleGroups(List.of(disabledRuleGroups));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder exclusions(@Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(ApplicationGatewayFirewallExclusionResponse... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder fileUploadLimitInMb(@Nullable Integer fileUploadLimitInMb) {
            this.fileUploadLimitInMb = fileUploadLimitInMb;
            return this;
        }
        public Builder firewallMode(String firewallMode) {
            this.firewallMode = Objects.requireNonNull(firewallMode);
            return this;
        }
        public Builder maxRequestBodySize(@Nullable Integer maxRequestBodySize) {
            this.maxRequestBodySize = maxRequestBodySize;
            return this;
        }
        public Builder maxRequestBodySizeInKb(@Nullable Integer maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
            return this;
        }
        public Builder requestBodyCheck(@Nullable Boolean requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }
        public Builder ruleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }
        public Builder ruleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }        public ApplicationGatewayWebApplicationFirewallConfigurationResponse build() {
            return new ApplicationGatewayWebApplicationFirewallConfigurationResponse(disabledRuleGroups, enabled, exclusions, fileUploadLimitInMb, firewallMode, maxRequestBodySize, maxRequestBodySizeInKb, requestBodyCheck, ruleSetType, ruleSetVersion);
        }
    }
}
