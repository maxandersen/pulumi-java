// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devops.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AuthorizationResponse {
    /**
     * Type of authorization.
     * 
     */
    private final String authorizationType;
    /**
     * Authorization parameters corresponding to the authorization type.
     * 
     */
    private final @Nullable Map<String,String> parameters;

    @CustomType.Constructor
    private AuthorizationResponse(
        @CustomType.Parameter("authorizationType") String authorizationType,
        @CustomType.Parameter("parameters") @Nullable Map<String,String> parameters) {
        this.authorizationType = authorizationType;
        this.parameters = parameters;
    }

    /**
     * Type of authorization.
     * 
    */
    public String authorizationType() {
        return this.authorizationType;
    }
    /**
     * Authorization parameters corresponding to the authorization type.
     * 
    */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
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
