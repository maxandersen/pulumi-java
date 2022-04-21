// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A policy that specifies the conditions for resource expiration (i.e., automatic resource deletion).
 * 
 */
public final class ExpirationPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpirationPolicyResponse Empty = new ExpirationPolicyResponse();

    /**
     * Specifies the &#34;time-to-live&#34; duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of &#34;activity&#34; depends on the type of the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never expires.
     * 
     */
    @Import(name="ttl", required=true)
    private String ttl;

    public String ttl() {
        return this.ttl;
    }

    private ExpirationPolicyResponse() {}

    private ExpirationPolicyResponse(ExpirationPolicyResponse $) {
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpirationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpirationPolicyResponse $;

        public Builder() {
            $ = new ExpirationPolicyResponse();
        }

        public Builder(ExpirationPolicyResponse defaults) {
            $ = new ExpirationPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder ttl(String ttl) {
            $.ttl = ttl;
            return this;
        }

        public ExpirationPolicyResponse build() {
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            return $;
        }
    }

}
