// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs Empty = new RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    @Import(name="ipSetForwardedIpConfig")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

    public Output<RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig() {
        return this.ipSetForwardedIpConfig == null ? Codegen.empty() : this.ipSetForwardedIpConfig;
    }

    public RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs(
        Output<String> arn,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
    }

    private RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs() {
        this.arn = Codegen.empty();
        this.ipSetForwardedIpConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetForwardedIpConfig = defaults.ipSetForwardedIpConfig;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable Output<RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }
        public Builder ipSetForwardedIpConfig(@Nullable RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs ipSetForwardedIpConfig) {
            this.ipSetForwardedIpConfig = Codegen.ofNullable(ipSetForwardedIpConfig);
            return this;
        }        public RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementArgs(arn, ipSetForwardedIpConfig);
        }
    }
}
