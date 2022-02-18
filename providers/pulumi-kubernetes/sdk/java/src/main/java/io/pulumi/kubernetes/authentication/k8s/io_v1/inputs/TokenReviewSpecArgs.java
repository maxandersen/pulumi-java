// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TokenReviewSpec is a description of the token authentication request.
 * 
 */
public final class TokenReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenReviewSpecArgs Empty = new TokenReviewSpecArgs();

    /**
     * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     * 
     */
    @InputImport(name="audiences")
    private final @Nullable Input<List<String>> audiences;

    public Input<List<String>> getAudiences() {
        return this.audiences == null ? Input.empty() : this.audiences;
    }

    /**
     * Token is the opaque bearer token.
     * 
     */
    @InputImport(name="token")
    private final @Nullable Input<String> token;

    public Input<String> getToken() {
        return this.token == null ? Input.empty() : this.token;
    }

    public TokenReviewSpecArgs(
        @Nullable Input<List<String>> audiences,
        @Nullable Input<String> token) {
        this.audiences = audiences;
        this.token = token;
    }

    private TokenReviewSpecArgs() {
        this.audiences = Input.empty();
        this.token = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> audiences;
        private @Nullable Input<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.token = defaults.token;
        }

        public Builder setAudiences(@Nullable Input<List<String>> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder setAudiences(@Nullable List<String> audiences) {
            this.audiences = Input.ofNullable(audiences);
            return this;
        }

        public Builder setToken(@Nullable Input<String> token) {
            this.token = token;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = Input.ofNullable(token);
            return this;
        }

        public TokenReviewSpecArgs build() {
            return new TokenReviewSpecArgs(audiences, token);
        }
    }
}
