// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The `MembershipRole` expiry details.
 * 
 */
public final class ExpiryDetailResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpiryDetailResponse Empty = new ExpiryDetailResponse();

    /**
     * The time at which the `MembershipRole` will expire.
     * 
     */
    @Import(name="expireTime", required=true)
      private final String expireTime;

    public String expireTime() {
        return this.expireTime;
    }

    public ExpiryDetailResponse(String expireTime) {
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
    }

    private ExpiryDetailResponse() {
        this.expireTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpiryDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expireTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpiryDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }        public ExpiryDetailResponse build() {
            return new ExpiryDetailResponse(expireTime);
        }
    }
}
