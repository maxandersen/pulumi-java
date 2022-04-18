// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLIPSetForwardedIPConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLIPSetReferenceStatement extends com.pulumi.resources.InvokeArgs {

    public static final WebACLIPSetReferenceStatement Empty = new WebACLIPSetReferenceStatement();

    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    @Import(name="iPSetForwardedIPConfig")
      private final @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

    public Optional<WebACLIPSetForwardedIPConfiguration> iPSetForwardedIPConfig() {
        return this.iPSetForwardedIPConfig == null ? Optional.empty() : Optional.ofNullable(this.iPSetForwardedIPConfig);
    }

    public WebACLIPSetReferenceStatement(
        String arn,
        @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
    }

    private WebACLIPSetReferenceStatement() {
        this.arn = null;
        this.iPSetForwardedIPConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLIPSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLIPSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.iPSetForwardedIPConfig = defaults.iPSetForwardedIPConfig;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder iPSetForwardedIPConfig(@Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
            this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }        public WebACLIPSetReferenceStatement build() {
            return new WebACLIPSetReferenceStatement(arn, iPSetForwardedIPConfig);
        }
    }
}
