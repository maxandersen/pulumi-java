// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs Empty = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs();

    /**
     * An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    @Import(name="countryCodes", required=true)
      private final Output<List<String>> countryCodes;

    public Output<List<String>> countryCodes() {
        return this.countryCodes;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    @Import(name="forwardedIpConfig")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

    public Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig() {
        return this.forwardedIpConfig == null ? Codegen.empty() : this.forwardedIpConfig;
    }

    public RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs(
        Output<List<String>> countryCodes,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
        this.countryCodes = Objects.requireNonNull(countryCodes, "expected parameter 'countryCodes' to be non-null");
        this.forwardedIpConfig = forwardedIpConfig;
    }

    private RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs() {
        this.countryCodes = Codegen.empty();
        this.forwardedIpConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> countryCodes;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIpConfig = defaults.forwardedIpConfig;
        }

        public Builder countryCodes(Output<List<String>> countryCodes) {
            this.countryCodes = Objects.requireNonNull(countryCodes);
            return this;
        }
        public Builder countryCodes(List<String> countryCodes) {
            this.countryCodes = Output.of(Objects.requireNonNull(countryCodes));
            return this;
        }
        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }
        public Builder forwardedIpConfig(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs> forwardedIpConfig) {
            this.forwardedIpConfig = forwardedIpConfig;
            return this;
        }
        public Builder forwardedIpConfig(@Nullable RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigGetArgs forwardedIpConfig) {
            this.forwardedIpConfig = Codegen.ofNullable(forwardedIpConfig);
            return this;
        }        public RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs(countryCodes, forwardedIpConfig);
        }
    }
}
