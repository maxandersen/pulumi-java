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
    private String arn;

    public String arn() {
        return this.arn;
    }

    @Import(name="iPSetForwardedIPConfig")
    private @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

    public Optional<WebACLIPSetForwardedIPConfiguration> iPSetForwardedIPConfig() {
        return Optional.ofNullable(this.iPSetForwardedIPConfig);
    }

    private WebACLIPSetReferenceStatement() {}

    private WebACLIPSetReferenceStatement(WebACLIPSetReferenceStatement $) {
        this.arn = $.arn;
        this.iPSetForwardedIPConfig = $.iPSetForwardedIPConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLIPSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLIPSetReferenceStatement $;

        public Builder() {
            $ = new WebACLIPSetReferenceStatement();
        }

        public Builder(WebACLIPSetReferenceStatement defaults) {
            $ = new WebACLIPSetReferenceStatement(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public Builder iPSetForwardedIPConfig(@Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
            $.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }

        public WebACLIPSetReferenceStatement build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
