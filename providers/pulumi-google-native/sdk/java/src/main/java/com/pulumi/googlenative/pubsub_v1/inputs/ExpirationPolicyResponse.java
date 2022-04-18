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
     * Specifies the "time-to-live" duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of "activity" depends on the type of the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never expires.
     * 
     */
    @Import(name="ttl", required=true)
      private final String ttl;

    public String ttl() {
        return this.ttl;
    }

    public ExpirationPolicyResponse(String ttl) {
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
    }

    private ExpirationPolicyResponse() {
        this.ttl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpirationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpirationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
        }

        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public ExpirationPolicyResponse build() {
            return new ExpirationPolicyResponse(ttl);
        }
    }
}
