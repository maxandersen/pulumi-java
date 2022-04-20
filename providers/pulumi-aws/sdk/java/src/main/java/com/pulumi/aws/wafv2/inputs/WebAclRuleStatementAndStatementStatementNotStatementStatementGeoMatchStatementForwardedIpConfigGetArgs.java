// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs();

    /**
     * - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    @Import(name="fallbackBehavior", required=true)
      private final Output<String> fallbackBehavior;

    public Output<String> fallbackBehavior() {
        return this.fallbackBehavior;
    }

    /**
     * - The name of the HTTP header to use for the IP address.
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    public WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs(
        Output<String> fallbackBehavior,
        Output<String> headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs() {
        this.fallbackBehavior = Codegen.empty();
        this.headerName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fallbackBehavior;
        private Output<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(Output<String> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Output.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }
        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }        public WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfigGetArgs(fallbackBehavior, headerName);
        }
    }
}
