// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy Empty = new GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy();

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean override() {
        return this.override;
    }

    /**
     * The value of the Referrer-Policy HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @Import(name="referrerPolicy", required=true)
      private final String referrerPolicy;

    public String referrerPolicy() {
        return this.referrerPolicy;
    }

    public GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy(
        Boolean override,
        String referrerPolicy) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.referrerPolicy = Objects.requireNonNull(referrerPolicy, "expected parameter 'referrerPolicy' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy() {
        this.override = null;
        this.referrerPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;
        private String referrerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder referrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }        public GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigReferrerPolicy(override, referrerPolicy);
        }
    }
}
