// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authority encodes how Google will recognize identities from this Membership. See the workload identity documentation for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
 * 
 */
public final class AuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityArgs Empty = new AuthorityArgs();

    /**
     * Optional. A JSON Web Token (JWT) issuer URI. `issuer` must start with `https://` and be a valid URL with length &lt;2000 characters. If set, then Google will allow valid OIDC tokens from this issuer to authenticate within the workload_identity_pool. OIDC discovery will be performed on this URI to validate tokens from the issuer, unless `oidc_jwks` is set. Clearing `issuer` disables Workload Identity. `issuer` cannot be directly modified; it must be cleared (and Workload Identity disabled) before using a new issuer (and re-enabling Workload Identity).
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * Optional. OIDC verification keys for this Membership in JWKS format (RFC 7517). When this field is set, OIDC discovery will NOT be performed on `issuer`, and instead OIDC tokens will be validated using this field.
     * 
     */
    @Import(name="oidcJwks")
    private @Nullable Output<String> oidcJwks;

    public Optional<Output<String>> oidcJwks() {
        return Optional.ofNullable(this.oidcJwks);
    }

    private AuthorityArgs() {}

    private AuthorityArgs(AuthorityArgs $) {
        this.issuer = $.issuer;
        this.oidcJwks = $.oidcJwks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityArgs $;

        public Builder() {
            $ = new AuthorityArgs();
        }

        public Builder(AuthorityArgs defaults) {
            $ = new AuthorityArgs(Objects.requireNonNull(defaults));
        }

        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        public Builder oidcJwks(@Nullable Output<String> oidcJwks) {
            $.oidcJwks = oidcJwks;
            return this;
        }

        public Builder oidcJwks(String oidcJwks) {
            return oidcJwks(Output.of(oidcJwks));
        }

        public AuthorityArgs build() {
            return $;
        }
    }

}
