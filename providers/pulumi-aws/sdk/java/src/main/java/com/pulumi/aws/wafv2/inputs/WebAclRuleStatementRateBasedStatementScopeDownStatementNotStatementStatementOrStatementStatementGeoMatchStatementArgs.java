// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs();

    /**
     * An array of two-character country codes, for example, [ &#34;US&#34;, &#34;CN&#34; ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
     * 
     */
    @Import(name="countryCodes", required=true)
    private Output<List<String>> countryCodes;

    public Output<List<String>> countryCodes() {
        return this.countryCodes;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * 
     */
    @Import(name="forwardedIpConfig")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs>> forwardedIpConfig() {
        return Optional.ofNullable(this.forwardedIpConfig);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs $) {
        this.countryCodes = $.countryCodes;
        this.forwardedIpConfig = $.forwardedIpConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder countryCodes(Output<List<String>> countryCodes) {
            $.countryCodes = countryCodes;
            return this;
        }

        public Builder countryCodes(List<String> countryCodes) {
            return countryCodes(Output.of(countryCodes));
        }

        public Builder countryCodes(String... countryCodes) {
            return countryCodes(List.of(countryCodes));
        }

        public Builder forwardedIpConfig(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs> forwardedIpConfig) {
            $.forwardedIpConfig = forwardedIpConfig;
            return this;
        }

        public Builder forwardedIpConfig(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfigArgs forwardedIpConfig) {
            return forwardedIpConfig(Output.of(forwardedIpConfig));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementGeoMatchStatementArgs build() {
            $.countryCodes = Objects.requireNonNull($.countryCodes, "expected parameter 'countryCodes' to be non-null");
            return $;
        }
    }

}
