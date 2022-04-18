// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JwtResponse {
    /**
     * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
     * 
     */
    private final String compactJwt;

    @CustomType.Constructor
    private JwtResponse(@CustomType.Parameter("compactJwt") String compactJwt) {
        this.compactJwt = compactJwt;
    }

    /**
     * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
     * 
    */
    public String compactJwt() {
        return this.compactJwt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compactJwt;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compactJwt = defaults.compactJwt;
        }

        public Builder compactJwt(String compactJwt) {
            this.compactJwt = Objects.requireNonNull(compactJwt);
            return this;
        }        public JwtResponse build() {
            return new JwtResponse(compactJwt);
        }
    }
}
