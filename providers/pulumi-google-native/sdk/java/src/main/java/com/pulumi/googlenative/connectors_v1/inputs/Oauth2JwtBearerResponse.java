// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.connectors_v1.inputs.JwtClaimsResponse;
import com.pulumi.googlenative.connectors_v1.inputs.SecretResponse;
import java.util.Objects;


/**
 * Parameters to support JSON Web Token (JWT) Profile for Oauth 2.0 Authorization Grant based authentication. See https://tools.ietf.org/html/rfc7523 for more details.
 * 
 */
public final class Oauth2JwtBearerResponse extends com.pulumi.resources.InvokeArgs {

    public static final Oauth2JwtBearerResponse Empty = new Oauth2JwtBearerResponse();

    /**
     * Secret version reference containing a PKCS#8 PEM-encoded private key associated with the Client Certificate. This private key will be used to sign JWTs used for the jwt-bearer authorization grant. Specified in the form as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    @Import(name="clientKey", required=true)
      private final SecretResponse clientKey;

    public SecretResponse clientKey() {
        return this.clientKey;
    }

    /**
     * JwtClaims providers fields to generate the token.
     * 
     */
    @Import(name="jwtClaims", required=true)
      private final JwtClaimsResponse jwtClaims;

    public JwtClaimsResponse jwtClaims() {
        return this.jwtClaims;
    }

    public Oauth2JwtBearerResponse(
        SecretResponse clientKey,
        JwtClaimsResponse jwtClaims) {
        this.clientKey = Objects.requireNonNull(clientKey, "expected parameter 'clientKey' to be non-null");
        this.jwtClaims = Objects.requireNonNull(jwtClaims, "expected parameter 'jwtClaims' to be non-null");
    }

    private Oauth2JwtBearerResponse() {
        this.clientKey = null;
        this.jwtClaims = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Oauth2JwtBearerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretResponse clientKey;
        private JwtClaimsResponse jwtClaims;

        public Builder() {
    	      // Empty
        }

        public Builder(Oauth2JwtBearerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientKey = defaults.clientKey;
    	      this.jwtClaims = defaults.jwtClaims;
        }

        public Builder clientKey(SecretResponse clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }
        public Builder jwtClaims(JwtClaimsResponse jwtClaims) {
            this.jwtClaims = Objects.requireNonNull(jwtClaims);
            return this;
        }        public Oauth2JwtBearerResponse build() {
            return new Oauth2JwtBearerResponse(clientKey, jwtClaims);
        }
    }
}
