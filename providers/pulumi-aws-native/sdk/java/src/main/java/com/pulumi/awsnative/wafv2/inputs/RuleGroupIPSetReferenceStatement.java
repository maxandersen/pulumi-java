// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupIPSetForwardedIPConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupIPSetReferenceStatement extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupIPSetReferenceStatement Empty = new RuleGroupIPSetReferenceStatement();

    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    @Import(name="iPSetForwardedIPConfig")
      private final @Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

    public Optional<RuleGroupIPSetForwardedIPConfiguration> iPSetForwardedIPConfig() {
        return this.iPSetForwardedIPConfig == null ? Optional.empty() : Optional.ofNullable(this.iPSetForwardedIPConfig);
    }

    public RuleGroupIPSetReferenceStatement(
        String arn,
        @Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
    }

    private RuleGroupIPSetReferenceStatement() {
        this.arn = null;
        this.iPSetForwardedIPConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupIPSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupIPSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.iPSetForwardedIPConfig = defaults.iPSetForwardedIPConfig;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder iPSetForwardedIPConfig(@Nullable RuleGroupIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
            this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }        public RuleGroupIPSetReferenceStatement build() {
            return new RuleGroupIPSetReferenceStatement(arn, iPSetForwardedIPConfig);
        }
    }
}
