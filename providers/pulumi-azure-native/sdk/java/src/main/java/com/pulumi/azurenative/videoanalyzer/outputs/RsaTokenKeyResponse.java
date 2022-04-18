// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RsaTokenKeyResponse {
    /**
     * RSA algorithm to be used: RS256, RS384 or RS512.
     * 
     */
    private final String alg;
    /**
     * RSA public key exponent.
     * 
     */
    private final String e;
    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    private final String kid;
    /**
     * RSA public key modulus.
     * 
     */
    private final String n;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.RsaTokenKey'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RsaTokenKeyResponse(
        @CustomType.Parameter("alg") String alg,
        @CustomType.Parameter("e") String e,
        @CustomType.Parameter("kid") String kid,
        @CustomType.Parameter("n") String n,
        @CustomType.Parameter("type") String type) {
        this.alg = alg;
        this.e = e;
        this.kid = kid;
        this.n = n;
        this.type = type;
    }

    /**
     * RSA algorithm to be used: RS256, RS384 or RS512.
     * 
    */
    public String alg() {
        return this.alg;
    }
    /**
     * RSA public key exponent.
     * 
    */
    public String e() {
        return this.e;
    }
    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
    */
    public String kid() {
        return this.kid;
    }
    /**
     * RSA public key modulus.
     * 
    */
    public String n() {
        return this.n;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.RsaTokenKey'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alg;
        private String e;
        private String kid;
        private String n;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RsaTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.e = defaults.e;
    	      this.kid = defaults.kid;
    	      this.n = defaults.n;
    	      this.type = defaults.type;
        }

        public Builder alg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }
        public Builder e(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }
        public Builder kid(String kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }
        public Builder n(String n) {
            this.n = Objects.requireNonNull(n);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RsaTokenKeyResponse build() {
            return new RsaTokenKeyResponse(alg, e, kid, n, type);
        }
    }
}
