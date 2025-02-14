// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOnlineEndpointTokenResult {
    /**
     * @return Access token.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * @return Access token expiry time (UTC).
     * 
     */
    private final @Nullable Double expiryTimeUtc;
    /**
     * @return Refresh access token after time (UTC).
     * 
     */
    private final @Nullable Double refreshAfterTimeUtc;
    /**
     * @return Access token type.
     * 
     */
    private final @Nullable String tokenType;

    @CustomType.Constructor
    private GetOnlineEndpointTokenResult(
        @CustomType.Parameter("accessToken") @Nullable String accessToken,
        @CustomType.Parameter("expiryTimeUtc") @Nullable Double expiryTimeUtc,
        @CustomType.Parameter("refreshAfterTimeUtc") @Nullable Double refreshAfterTimeUtc,
        @CustomType.Parameter("tokenType") @Nullable String tokenType) {
        this.accessToken = accessToken;
        this.expiryTimeUtc = expiryTimeUtc;
        this.refreshAfterTimeUtc = refreshAfterTimeUtc;
        this.tokenType = tokenType;
    }

    /**
     * @return Access token.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return Access token expiry time (UTC).
     * 
     */
    public Optional<Double> expiryTimeUtc() {
        return Optional.ofNullable(this.expiryTimeUtc);
    }
    /**
     * @return Refresh access token after time (UTC).
     * 
     */
    public Optional<Double> refreshAfterTimeUtc() {
        return Optional.ofNullable(this.refreshAfterTimeUtc);
    }
    /**
     * @return Access token type.
     * 
     */
    public Optional<String> tokenType() {
        return Optional.ofNullable(this.tokenType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineEndpointTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable Double expiryTimeUtc;
        private @Nullable Double refreshAfterTimeUtc;
        private @Nullable String tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOnlineEndpointTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.expiryTimeUtc = defaults.expiryTimeUtc;
    	      this.refreshAfterTimeUtc = defaults.refreshAfterTimeUtc;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder expiryTimeUtc(@Nullable Double expiryTimeUtc) {
            this.expiryTimeUtc = expiryTimeUtc;
            return this;
        }
        public Builder refreshAfterTimeUtc(@Nullable Double refreshAfterTimeUtc) {
            this.refreshAfterTimeUtc = refreshAfterTimeUtc;
            return this;
        }
        public Builder tokenType(@Nullable String tokenType) {
            this.tokenType = tokenType;
            return this;
        }        public GetOnlineEndpointTokenResult build() {
            return new GetOnlineEndpointTokenResult(accessToken, expiryTimeUtc, refreshAfterTimeUtc, tokenType);
        }
    }
}
