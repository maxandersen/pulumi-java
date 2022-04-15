// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authorization info used to access a resource (like code repository).
 * 
 */
public final class AuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthorizationResponse Empty = new AuthorizationResponse();

    /**
     * Type of authorization.
     * 
     */
    @Import(name="authorizationType", required=true)
      private final String authorizationType;

    public String authorizationType() {
        return this.authorizationType;
    }

    /**
     * Authorization parameters corresponding to the authorization type.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,String> parameters;

    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public AuthorizationResponse(
        String authorizationType,
        @Nullable Map<String,String> parameters) {
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.parameters = parameters;
    }

    private AuthorizationResponse() {
        this.authorizationType = null;
        this.parameters = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationType;
        private @Nullable Map<String,String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.parameters = defaults.parameters;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }        public AuthorizationResponse build() {
            return new AuthorizationResponse(authorizationType, parameters);
        }
    }
}
