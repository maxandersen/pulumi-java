// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OAuthAuthenticationResponse {
    /**
     * Gets or sets the audience.
     * 
     */
    private final @Nullable String audience;
    /**
     * Gets or sets the client identifier.
     * 
     */
    private final @Nullable String clientId;
    /**
     * Gets or sets the secret, return value will always be empty.
     * 
     */
    private final @Nullable String secret;
    /**
     * Gets or sets the tenant.
     * 
     */
    private final @Nullable String tenant;
    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is &#39;ActiveDirectoryOAuth&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private OAuthAuthenticationResponse(
        @CustomType.Parameter("audience") @Nullable String audience,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("secret") @Nullable String secret,
        @CustomType.Parameter("tenant") @Nullable String tenant,
        @CustomType.Parameter("type") String type) {
        this.audience = audience;
        this.clientId = clientId;
        this.secret = secret;
        this.tenant = tenant;
        this.type = type;
    }

    /**
     * Gets or sets the audience.
     * 
    */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * Gets or sets the client identifier.
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Gets or sets the secret, return value will always be empty.
     * 
    */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * Gets or sets the tenant.
     * 
    */
    public Optional<String> tenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is &#39;ActiveDirectoryOAuth&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private @Nullable String clientId;
        private @Nullable String secret;
        private @Nullable String tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        public Builder tenant(@Nullable String tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public OAuthAuthenticationResponse build() {
            return new OAuthAuthenticationResponse(audience, clientId, secret, tenant, type);
        }
    }
}
