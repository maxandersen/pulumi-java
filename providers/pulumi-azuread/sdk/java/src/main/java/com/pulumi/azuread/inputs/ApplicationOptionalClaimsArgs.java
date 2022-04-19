// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.azuread.inputs.ApplicationOptionalClaimsAccessTokenArgs;
import com.pulumi.azuread.inputs.ApplicationOptionalClaimsIdTokenArgs;
import com.pulumi.azuread.inputs.ApplicationOptionalClaimsSaml2TokenArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationOptionalClaimsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationOptionalClaimsArgs Empty = new ApplicationOptionalClaimsArgs();

    /**
     * One or more `access_token` blocks as documented below.
     * 
     */
    @Import(name="accessTokens")
      private final @Nullable Output<List<ApplicationOptionalClaimsAccessTokenArgs>> accessTokens;

    public Output<List<ApplicationOptionalClaimsAccessTokenArgs>> accessTokens() {
        return this.accessTokens == null ? Codegen.empty() : this.accessTokens;
    }

    /**
     * One or more `id_token` blocks as documented below.
     * 
     */
    @Import(name="idTokens")
      private final @Nullable Output<List<ApplicationOptionalClaimsIdTokenArgs>> idTokens;

    public Output<List<ApplicationOptionalClaimsIdTokenArgs>> idTokens() {
        return this.idTokens == null ? Codegen.empty() : this.idTokens;
    }

    /**
     * One or more `saml2_token` blocks as documented below.
     * 
     */
    @Import(name="saml2Tokens")
      private final @Nullable Output<List<ApplicationOptionalClaimsSaml2TokenArgs>> saml2Tokens;

    public Output<List<ApplicationOptionalClaimsSaml2TokenArgs>> saml2Tokens() {
        return this.saml2Tokens == null ? Codegen.empty() : this.saml2Tokens;
    }

    public ApplicationOptionalClaimsArgs(
        @Nullable Output<List<ApplicationOptionalClaimsAccessTokenArgs>> accessTokens,
        @Nullable Output<List<ApplicationOptionalClaimsIdTokenArgs>> idTokens,
        @Nullable Output<List<ApplicationOptionalClaimsSaml2TokenArgs>> saml2Tokens) {
        this.accessTokens = accessTokens;
        this.idTokens = idTokens;
        this.saml2Tokens = saml2Tokens;
    }

    private ApplicationOptionalClaimsArgs() {
        this.accessTokens = Codegen.empty();
        this.idTokens = Codegen.empty();
        this.saml2Tokens = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationOptionalClaimsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApplicationOptionalClaimsAccessTokenArgs>> accessTokens;
        private @Nullable Output<List<ApplicationOptionalClaimsIdTokenArgs>> idTokens;
        private @Nullable Output<List<ApplicationOptionalClaimsSaml2TokenArgs>> saml2Tokens;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationOptionalClaimsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTokens = defaults.accessTokens;
    	      this.idTokens = defaults.idTokens;
    	      this.saml2Tokens = defaults.saml2Tokens;
        }

        public Builder accessTokens(@Nullable Output<List<ApplicationOptionalClaimsAccessTokenArgs>> accessTokens) {
            this.accessTokens = accessTokens;
            return this;
        }
        public Builder accessTokens(@Nullable List<ApplicationOptionalClaimsAccessTokenArgs> accessTokens) {
            this.accessTokens = Codegen.ofNullable(accessTokens);
            return this;
        }
        public Builder accessTokens(ApplicationOptionalClaimsAccessTokenArgs... accessTokens) {
            return accessTokens(List.of(accessTokens));
        }
        public Builder idTokens(@Nullable Output<List<ApplicationOptionalClaimsIdTokenArgs>> idTokens) {
            this.idTokens = idTokens;
            return this;
        }
        public Builder idTokens(@Nullable List<ApplicationOptionalClaimsIdTokenArgs> idTokens) {
            this.idTokens = Codegen.ofNullable(idTokens);
            return this;
        }
        public Builder idTokens(ApplicationOptionalClaimsIdTokenArgs... idTokens) {
            return idTokens(List.of(idTokens));
        }
        public Builder saml2Tokens(@Nullable Output<List<ApplicationOptionalClaimsSaml2TokenArgs>> saml2Tokens) {
            this.saml2Tokens = saml2Tokens;
            return this;
        }
        public Builder saml2Tokens(@Nullable List<ApplicationOptionalClaimsSaml2TokenArgs> saml2Tokens) {
            this.saml2Tokens = Codegen.ofNullable(saml2Tokens);
            return this;
        }
        public Builder saml2Tokens(ApplicationOptionalClaimsSaml2TokenArgs... saml2Tokens) {
            return saml2Tokens(List.of(saml2Tokens));
        }        public ApplicationOptionalClaimsArgs build() {
            return new ApplicationOptionalClaimsArgs(accessTokens, idTokens, saml2Tokens);
        }
    }
}
