// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CookieExpirationResponse {
    /**
     * The convention used when determining the session cookie&#39;s expiration.
     * 
     */
    private final @Nullable String convention;
    /**
     * The time after the request is made when the session cookie should expire.
     * 
     */
    private final @Nullable String timeToExpiration;

    @CustomType.Constructor
    private CookieExpirationResponse(
        @CustomType.Parameter("convention") @Nullable String convention,
        @CustomType.Parameter("timeToExpiration") @Nullable String timeToExpiration) {
        this.convention = convention;
        this.timeToExpiration = timeToExpiration;
    }

    /**
     * The convention used when determining the session cookie&#39;s expiration.
     * 
    */
    public Optional<String> convention() {
        return Optional.ofNullable(this.convention);
    }
    /**
     * The time after the request is made when the session cookie should expire.
     * 
    */
    public Optional<String> timeToExpiration() {
        return Optional.ofNullable(this.timeToExpiration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CookieExpirationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String convention;
        private @Nullable String timeToExpiration;

        public Builder() {
    	      // Empty
        }

        public Builder(CookieExpirationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convention = defaults.convention;
    	      this.timeToExpiration = defaults.timeToExpiration;
        }

        public Builder convention(@Nullable String convention) {
            this.convention = convention;
            return this;
        }
        public Builder timeToExpiration(@Nullable String timeToExpiration) {
            this.timeToExpiration = timeToExpiration;
            return this;
        }        public CookieExpirationResponse build() {
            return new CookieExpirationResponse(convention, timeToExpiration);
        }
    }
}
