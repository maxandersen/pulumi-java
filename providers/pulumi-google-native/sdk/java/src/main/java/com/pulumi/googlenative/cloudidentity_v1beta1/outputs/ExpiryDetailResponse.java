// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExpiryDetailResponse {
    /**
     * The time at which the `MembershipRole` will expire.
     * 
     */
    private final String expireTime;

    @CustomType.Constructor
    private ExpiryDetailResponse(@CustomType.Parameter("expireTime") String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * The time at which the `MembershipRole` will expire.
     * 
    */
    public String expireTime() {
        return this.expireTime;
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
