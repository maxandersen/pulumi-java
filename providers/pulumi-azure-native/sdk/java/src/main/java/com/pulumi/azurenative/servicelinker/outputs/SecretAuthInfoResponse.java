// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretAuthInfoResponse {
    /**
     * The authentication type.
     * Expected value is &#39;secret&#39;.
     * 
     */
    private final String authType;
    /**
     * Username or account name for secret auth.
     * 
     */
    private final @Nullable String name;
    /**
     * Password or account key for secret auth.
     * 
     */
    private final @Nullable String secret;

    @CustomType.Constructor
    private SecretAuthInfoResponse(
        @CustomType.Parameter("authType") String authType,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("secret") @Nullable String secret) {
        this.authType = authType;
        this.name = name;
        this.secret = secret;
    }

    /**
     * The authentication type.
     * Expected value is &#39;secret&#39;.
     * 
    */
    public String authType() {
        return this.authType;
    }
    /**
     * Username or account name for secret auth.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Password or account key for secret auth.
     * 
    */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;
        private @Nullable String name;
        private @Nullable String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder authType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }        public SecretAuthInfoResponse build() {
            return new SecretAuthInfoResponse(authType, name, secret);
        }
    }
}
