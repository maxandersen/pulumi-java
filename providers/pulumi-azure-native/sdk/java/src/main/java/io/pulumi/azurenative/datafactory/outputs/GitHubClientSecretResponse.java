// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitHubClientSecretResponse {
    /**
     * Bring your own app client secret AKV URL.
     * 
     */
    private final @Nullable String byoaSecretAkvUrl;
    /**
     * Bring your own app client secret name in AKV.
     * 
     */
    private final @Nullable String byoaSecretName;

    @CustomType.Constructor
    private GitHubClientSecretResponse(
        @CustomType.Parameter("byoaSecretAkvUrl") @Nullable String byoaSecretAkvUrl,
        @CustomType.Parameter("byoaSecretName") @Nullable String byoaSecretName) {
        this.byoaSecretAkvUrl = byoaSecretAkvUrl;
        this.byoaSecretName = byoaSecretName;
    }

    /**
     * Bring your own app client secret AKV URL.
     * 
    */
    public Optional<String> byoaSecretAkvUrl() {
        return Optional.ofNullable(this.byoaSecretAkvUrl);
    }
    /**
     * Bring your own app client secret name in AKV.
     * 
    */
    public Optional<String> byoaSecretName() {
        return Optional.ofNullable(this.byoaSecretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubClientSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String byoaSecretAkvUrl;
        private @Nullable String byoaSecretName;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubClientSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byoaSecretAkvUrl = defaults.byoaSecretAkvUrl;
    	      this.byoaSecretName = defaults.byoaSecretName;
        }

        public Builder byoaSecretAkvUrl(@Nullable String byoaSecretAkvUrl) {
            this.byoaSecretAkvUrl = byoaSecretAkvUrl;
            return this;
        }
        public Builder byoaSecretName(@Nullable String byoaSecretName) {
            this.byoaSecretName = byoaSecretName;
            return this;
        }        public GitHubClientSecretResponse build() {
            return new GitHubClientSecretResponse(byoaSecretAkvUrl, byoaSecretName);
        }
    }
}
