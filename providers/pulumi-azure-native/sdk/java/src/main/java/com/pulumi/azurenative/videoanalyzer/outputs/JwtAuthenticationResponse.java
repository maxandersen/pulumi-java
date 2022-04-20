// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.EccTokenKeyResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.RsaTokenKeyResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.TokenClaimResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JwtAuthenticationResponse {
    /**
     * List of expected token audiences. Token audience is valid if it matches at least one of the given values.
     * 
     */
    private final @Nullable List<String> audiences;
    /**
     * List of additional token claims to be validated. Token must contains all claims and respective values for it to be valid.
     * 
     */
    private final @Nullable List<TokenClaimResponse> claims;
    /**
     * List of expected token issuers. Token issuer is valid if it matches at least one of the given values.
     * 
     */
    private final @Nullable List<String> issuers;
    /**
     * List of keys which can be used to validate access tokens. Having multiple keys allow for seamless key rotation of the token signing key. Token signature must match exactly one key.
     * 
     */
    private final @Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys;
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.JwtAuthentication&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private JwtAuthenticationResponse(
        @CustomType.Parameter("audiences") @Nullable List<String> audiences,
        @CustomType.Parameter("claims") @Nullable List<TokenClaimResponse> claims,
        @CustomType.Parameter("issuers") @Nullable List<String> issuers,
        @CustomType.Parameter("keys") @Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys,
        @CustomType.Parameter("type") String type) {
        this.audiences = audiences;
        this.claims = claims;
        this.issuers = issuers;
        this.keys = keys;
        this.type = type;
    }

    /**
     * List of expected token audiences. Token audience is valid if it matches at least one of the given values.
     * 
    */
    public List<String> audiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    /**
     * List of additional token claims to be validated. Token must contains all claims and respective values for it to be valid.
     * 
    */
    public List<TokenClaimResponse> claims() {
        return this.claims == null ? List.of() : this.claims;
    }
    /**
     * List of expected token issuers. Token issuer is valid if it matches at least one of the given values.
     * 
    */
    public List<String> issuers() {
        return this.issuers == null ? List.of() : this.issuers;
    }
    /**
     * List of keys which can be used to validate access tokens. Having multiple keys allow for seamless key rotation of the token signing key. Token signature must match exactly one key.
     * 
    */
    public List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.JwtAuthentication&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable List<TokenClaimResponse> claims;
        private @Nullable List<String> issuers;
        private @Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.claims = defaults.claims;
    	      this.issuers = defaults.issuers;
    	      this.keys = defaults.keys;
    	      this.type = defaults.type;
        }

        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        public Builder claims(@Nullable List<TokenClaimResponse> claims) {
            this.claims = claims;
            return this;
        }
        public Builder claims(TokenClaimResponse... claims) {
            return claims(List.of(claims));
        }
        public Builder issuers(@Nullable List<String> issuers) {
            this.issuers = issuers;
            return this;
        }
        public Builder issuers(String... issuers) {
            return issuers(List.of(issuers));
        }
        public Builder keys(@Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(Either<EccTokenKeyResponse,RsaTokenKeyResponse>... keys) {
            return keys(List.of(keys));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public JwtAuthenticationResponse build() {
            return new JwtAuthenticationResponse(audiences, claims, issuers, keys, type);
        }
    }
}
