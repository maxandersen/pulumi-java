// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayWafConfigurationDisabledRuleGroup {
    /**
     * @return The rule group where specific rules should be disabled. Accepted values are:  `crs_20_protocol_violations`, `crs_21_protocol_anomalies`, `crs_23_request_limits`, `crs_30_http_policy`, `crs_35_bad_robots`, `crs_40_generic_attacks`, `crs_41_sql_injection_attacks`, `crs_41_xss_attacks`, `crs_42_tight_security`, `crs_45_trojans`, `General`, `REQUEST-911-METHOD-ENFORCEMENT`, `REQUEST-913-SCANNER-DETECTION`, `REQUEST-920-PROTOCOL-ENFORCEMENT`, `REQUEST-921-PROTOCOL-ATTACK`, `REQUEST-930-APPLICATION-ATTACK-LFI`, `REQUEST-931-APPLICATION-ATTACK-RFI`, `REQUEST-932-APPLICATION-ATTACK-RCE`, `REQUEST-933-APPLICATION-ATTACK-PHP`, `REQUEST-941-APPLICATION-ATTACK-XSS`, `REQUEST-942-APPLICATION-ATTACK-SQLI`, `REQUEST-943-APPLICATION-ATTACK-SESSION-FIXATION`
     * 
     */
    private final String ruleGroupName;
    /**
     * @return A list of rules which should be disabled in that group. Disables all rules in the specified group if `rules` is not specified.
     * 
     */
    private final @Nullable List<Integer> rules;

    @CustomType.Constructor
    private ApplicationGatewayWafConfigurationDisabledRuleGroup(
        @CustomType.Parameter("ruleGroupName") String ruleGroupName,
        @CustomType.Parameter("rules") @Nullable List<Integer> rules) {
        this.ruleGroupName = ruleGroupName;
        this.rules = rules;
    }

    /**
     * @return The rule group where specific rules should be disabled. Accepted values are:  `crs_20_protocol_violations`, `crs_21_protocol_anomalies`, `crs_23_request_limits`, `crs_30_http_policy`, `crs_35_bad_robots`, `crs_40_generic_attacks`, `crs_41_sql_injection_attacks`, `crs_41_xss_attacks`, `crs_42_tight_security`, `crs_45_trojans`, `General`, `REQUEST-911-METHOD-ENFORCEMENT`, `REQUEST-913-SCANNER-DETECTION`, `REQUEST-920-PROTOCOL-ENFORCEMENT`, `REQUEST-921-PROTOCOL-ATTACK`, `REQUEST-930-APPLICATION-ATTACK-LFI`, `REQUEST-931-APPLICATION-ATTACK-RFI`, `REQUEST-932-APPLICATION-ATTACK-RCE`, `REQUEST-933-APPLICATION-ATTACK-PHP`, `REQUEST-941-APPLICATION-ATTACK-XSS`, `REQUEST-942-APPLICATION-ATTACK-SQLI`, `REQUEST-943-APPLICATION-ATTACK-SESSION-FIXATION`
     * 
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }
    /**
     * @return A list of rules which should be disabled in that group. Disables all rules in the specified group if `rules` is not specified.
     * 
     */
    public List<Integer> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayWafConfigurationDisabledRuleGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleGroupName;
        private @Nullable List<Integer> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayWafConfigurationDisabledRuleGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder ruleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }
        public Builder rules(@Nullable List<Integer> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(Integer... rules) {
            return rules(List.of(rules));
        }        public ApplicationGatewayWafConfigurationDisabledRuleGroup build() {
            return new ApplicationGatewayWafConfigurationDisabledRuleGroup(ruleGroupName, rules);
        }
    }
}
