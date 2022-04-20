// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Authority encodes how Google will recognize identities from this Membership. See the workload identity documentation for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
 * 
 */
public final class AuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityArgs Empty = new AuthorityArgs();

    /**
     * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length &lt;2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
     * 
     */
    @Import(name="issuer")
      private final @Nullable Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer == null ? Codegen.empty() : this.issuer;
    }

    /**
     * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
     * 
     */
    @Import(name="oidcJwks")
      private final @Nullable Output<String> oidcJwks;

    public Output<String> oidcJwks() {
        return this.oidcJwks == null ? Codegen.empty() : this.oidcJwks;
    }

    public AuthorityArgs(
        @Nullable Output<String> issuer,
        @Nullable Output<String> oidcJwks) {
        this.issuer = issuer;
        this.oidcJwks = oidcJwks;
    }

    private AuthorityArgs() {
        this.issuer = Codegen.empty();
        this.oidcJwks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> issuer;
        private @Nullable Output<String> oidcJwks;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
    	      this.oidcJwks = defaults.oidcJwks;
        }

        public Builder issuer(@Nullable Output<String> issuer) {
            this.issuer = issuer;
            return this;
        }
        public Builder issuer(@Nullable String issuer) {
            this.issuer = Codegen.ofNullable(issuer);
            return this;
        }
        public Builder oidcJwks(@Nullable Output<String> oidcJwks) {
            this.oidcJwks = oidcJwks;
            return this;
        }
        public Builder oidcJwks(@Nullable String oidcJwks) {
            this.oidcJwks = Codegen.ofNullable(oidcJwks);
            return this;
        }        public AuthorityArgs build() {
            return new AuthorityArgs(issuer, oidcJwks);
        }
    }
}
