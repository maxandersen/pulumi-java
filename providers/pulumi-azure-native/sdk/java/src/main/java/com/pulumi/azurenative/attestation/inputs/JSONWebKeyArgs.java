// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.attestation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JSONWebKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final JSONWebKeyArgs Empty = new JSONWebKeyArgs();

    /**
     * The &#34;alg&#34; (algorithm) parameter identifies the algorithm intended for
     * use with the key.  The values used should either be registered in the
     * IANA &#34;JSON Web Signature and Encryption Algorithms&#34; registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     * 
     */
    @Import(name="alg")
      private final @Nullable Output<String> alg;

    public Output<String> alg() {
        return this.alg == null ? Codegen.empty() : this.alg;
    }

    /**
     * The &#34;crv&#34; (curve) parameter identifies the curve type
     * 
     */
    @Import(name="crv")
      private final @Nullable Output<String> crv;

    public Output<String> crv() {
        return this.crv == null ? Codegen.empty() : this.crv;
    }

    /**
     * RSA private exponent or ECC private key
     * 
     */
    @Import(name="d")
      private final @Nullable Output<String> d;

    public Output<String> d() {
        return this.d == null ? Codegen.empty() : this.d;
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @Import(name="dp")
      private final @Nullable Output<String> dp;

    public Output<String> dp() {
        return this.dp == null ? Codegen.empty() : this.dp;
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @Import(name="dq")
      private final @Nullable Output<String> dq;

    public Output<String> dq() {
        return this.dq == null ? Codegen.empty() : this.dq;
    }

    /**
     * RSA public exponent, in Base64
     * 
     */
    @Import(name="e")
      private final @Nullable Output<String> e;

    public Output<String> e() {
        return this.e == null ? Codegen.empty() : this.e;
    }

    /**
     * Symmetric key
     * 
     */
    @Import(name="k")
      private final @Nullable Output<String> k;

    public Output<String> k() {
        return this.k == null ? Codegen.empty() : this.k;
    }

    /**
     * The &#34;kid&#34; (key ID) parameter is used to match a specific key.  This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover.  The structure of the &#34;kid&#34; value is
     * unspecified.  When &#34;kid&#34; values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct &#34;kid&#34; values.  (One
     * example in which different keys might use the same &#34;kid&#34; value is if
     * they have different &#34;kty&#34; (key type) values but are considered to be
     * equivalent alternatives by the application using them.)  The &#34;kid&#34;
     * value is a case-sensitive string.
     * 
     */
    @Import(name="kid")
      private final @Nullable Output<String> kid;

    public Output<String> kid() {
        return this.kid == null ? Codegen.empty() : this.kid;
    }

    /**
     * The &#34;kty&#34; (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as &#34;RSA&#34; or &#34;EC&#34;. &#34;kty&#34; values should
     * either be registered in the IANA &#34;JSON Web Key Types&#34; registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.  The &#34;kty&#34; value is a case-sensitive string.
     * 
     */
    @Import(name="kty", required=true)
      private final Output<String> kty;

    public Output<String> kty() {
        return this.kty;
    }

    /**
     * RSA modulus, in Base64
     * 
     */
    @Import(name="n")
      private final @Nullable Output<String> n;

    public Output<String> n() {
        return this.n == null ? Codegen.empty() : this.n;
    }

    /**
     * RSA secret prime
     * 
     */
    @Import(name="p")
      private final @Nullable Output<String> p;

    public Output<String> p() {
        return this.p == null ? Codegen.empty() : this.p;
    }

    /**
     * RSA secret prime, with p &lt; q
     * 
     */
    @Import(name="q")
      private final @Nullable Output<String> q;

    public Output<String> q() {
        return this.q == null ? Codegen.empty() : this.q;
    }

    /**
     * RSA Private Key Parameter
     * 
     */
    @Import(name="qi")
      private final @Nullable Output<String> qi;

    public Output<String> qi() {
        return this.qi == null ? Codegen.empty() : this.qi;
    }

    /**
     * Use (&#34;public key use&#34;) identifies the intended use of
     * the public key. The &#34;use&#34; parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly &#34;sig&#34; (signature) or &#34;enc&#34; (encryption).
     * 
     */
    @Import(name="use")
      private final @Nullable Output<String> use;

    public Output<String> use() {
        return this.use == null ? Codegen.empty() : this.use;
    }

    /**
     * X coordinate for the Elliptic Curve point
     * 
     */
    @Import(name="x")
      private final @Nullable Output<String> x;

    public Output<String> x() {
        return this.x == null ? Codegen.empty() : this.x;
    }

    /**
     * The &#34;x5c&#34; (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280].  The certificate chain is
     * represented as a JSON array of certificate value strings.  Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     * 
     */
    @Import(name="x5c")
      private final @Nullable Output<List<String>> x5c;

    public Output<List<String>> x5c() {
        return this.x5c == null ? Codegen.empty() : this.x5c;
    }

    /**
     * Y coordinate for the Elliptic Curve point
     * 
     */
    @Import(name="y")
      private final @Nullable Output<String> y;

    public Output<String> y() {
        return this.y == null ? Codegen.empty() : this.y;
    }

    public JSONWebKeyArgs(
        @Nullable Output<String> alg,
        @Nullable Output<String> crv,
        @Nullable Output<String> d,
        @Nullable Output<String> dp,
        @Nullable Output<String> dq,
        @Nullable Output<String> e,
        @Nullable Output<String> k,
        @Nullable Output<String> kid,
        Output<String> kty,
        @Nullable Output<String> n,
        @Nullable Output<String> p,
        @Nullable Output<String> q,
        @Nullable Output<String> qi,
        @Nullable Output<String> use,
        @Nullable Output<String> x,
        @Nullable Output<List<String>> x5c,
        @Nullable Output<String> y) {
        this.alg = alg;
        this.crv = crv;
        this.d = d;
        this.dp = dp;
        this.dq = dq;
        this.e = e;
        this.k = k;
        this.kid = kid;
        this.kty = Objects.requireNonNull(kty, "expected parameter 'kty' to be non-null");
        this.n = n;
        this.p = p;
        this.q = q;
        this.qi = qi;
        this.use = use;
        this.x = x;
        this.x5c = x5c;
        this.y = y;
    }

    private JSONWebKeyArgs() {
        this.alg = Codegen.empty();
        this.crv = Codegen.empty();
        this.d = Codegen.empty();
        this.dp = Codegen.empty();
        this.dq = Codegen.empty();
        this.e = Codegen.empty();
        this.k = Codegen.empty();
        this.kid = Codegen.empty();
        this.kty = Codegen.empty();
        this.n = Codegen.empty();
        this.p = Codegen.empty();
        this.q = Codegen.empty();
        this.qi = Codegen.empty();
        this.use = Codegen.empty();
        this.x = Codegen.empty();
        this.x5c = Codegen.empty();
        this.y = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JSONWebKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alg;
        private @Nullable Output<String> crv;
        private @Nullable Output<String> d;
        private @Nullable Output<String> dp;
        private @Nullable Output<String> dq;
        private @Nullable Output<String> e;
        private @Nullable Output<String> k;
        private @Nullable Output<String> kid;
        private Output<String> kty;
        private @Nullable Output<String> n;
        private @Nullable Output<String> p;
        private @Nullable Output<String> q;
        private @Nullable Output<String> qi;
        private @Nullable Output<String> use;
        private @Nullable Output<String> x;
        private @Nullable Output<List<String>> x5c;
        private @Nullable Output<String> y;

        public Builder() {
    	      // Empty
        }

        public Builder(JSONWebKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.crv = defaults.crv;
    	      this.d = defaults.d;
    	      this.dp = defaults.dp;
    	      this.dq = defaults.dq;
    	      this.e = defaults.e;
    	      this.k = defaults.k;
    	      this.kid = defaults.kid;
    	      this.kty = defaults.kty;
    	      this.n = defaults.n;
    	      this.p = defaults.p;
    	      this.q = defaults.q;
    	      this.qi = defaults.qi;
    	      this.use = defaults.use;
    	      this.x = defaults.x;
    	      this.x5c = defaults.x5c;
    	      this.y = defaults.y;
        }

        public Builder alg(@Nullable Output<String> alg) {
            this.alg = alg;
            return this;
        }
        public Builder alg(@Nullable String alg) {
            this.alg = Codegen.ofNullable(alg);
            return this;
        }
        public Builder crv(@Nullable Output<String> crv) {
            this.crv = crv;
            return this;
        }
        public Builder crv(@Nullable String crv) {
            this.crv = Codegen.ofNullable(crv);
            return this;
        }
        public Builder d(@Nullable Output<String> d) {
            this.d = d;
            return this;
        }
        public Builder d(@Nullable String d) {
            this.d = Codegen.ofNullable(d);
            return this;
        }
        public Builder dp(@Nullable Output<String> dp) {
            this.dp = dp;
            return this;
        }
        public Builder dp(@Nullable String dp) {
            this.dp = Codegen.ofNullable(dp);
            return this;
        }
        public Builder dq(@Nullable Output<String> dq) {
            this.dq = dq;
            return this;
        }
        public Builder dq(@Nullable String dq) {
            this.dq = Codegen.ofNullable(dq);
            return this;
        }
        public Builder e(@Nullable Output<String> e) {
            this.e = e;
            return this;
        }
        public Builder e(@Nullable String e) {
            this.e = Codegen.ofNullable(e);
            return this;
        }
        public Builder k(@Nullable Output<String> k) {
            this.k = k;
            return this;
        }
        public Builder k(@Nullable String k) {
            this.k = Codegen.ofNullable(k);
            return this;
        }
        public Builder kid(@Nullable Output<String> kid) {
            this.kid = kid;
            return this;
        }
        public Builder kid(@Nullable String kid) {
            this.kid = Codegen.ofNullable(kid);
            return this;
        }
        public Builder kty(Output<String> kty) {
            this.kty = Objects.requireNonNull(kty);
            return this;
        }
        public Builder kty(String kty) {
            this.kty = Output.of(Objects.requireNonNull(kty));
            return this;
        }
        public Builder n(@Nullable Output<String> n) {
            this.n = n;
            return this;
        }
        public Builder n(@Nullable String n) {
            this.n = Codegen.ofNullable(n);
            return this;
        }
        public Builder p(@Nullable Output<String> p) {
            this.p = p;
            return this;
        }
        public Builder p(@Nullable String p) {
            this.p = Codegen.ofNullable(p);
            return this;
        }
        public Builder q(@Nullable Output<String> q) {
            this.q = q;
            return this;
        }
        public Builder q(@Nullable String q) {
            this.q = Codegen.ofNullable(q);
            return this;
        }
        public Builder qi(@Nullable Output<String> qi) {
            this.qi = qi;
            return this;
        }
        public Builder qi(@Nullable String qi) {
            this.qi = Codegen.ofNullable(qi);
            return this;
        }
        public Builder use(@Nullable Output<String> use) {
            this.use = use;
            return this;
        }
        public Builder use(@Nullable String use) {
            this.use = Codegen.ofNullable(use);
            return this;
        }
        public Builder x(@Nullable Output<String> x) {
            this.x = x;
            return this;
        }
        public Builder x(@Nullable String x) {
            this.x = Codegen.ofNullable(x);
            return this;
        }
        public Builder x5c(@Nullable Output<List<String>> x5c) {
            this.x5c = x5c;
            return this;
        }
        public Builder x5c(@Nullable List<String> x5c) {
            this.x5c = Codegen.ofNullable(x5c);
            return this;
        }
        public Builder x5c(String... x5c) {
            return x5c(List.of(x5c));
        }
        public Builder y(@Nullable Output<String> y) {
            this.y = y;
            return this;
        }
        public Builder y(@Nullable String y) {
            this.y = Codegen.ofNullable(y);
            return this;
        }        public JSONWebKeyArgs build() {
            return new JSONWebKeyArgs(alg, crv, d, dp, dq, e, k, kid, kty, n, p, q, qi, use, x, x5c, y);
        }
    }
}
