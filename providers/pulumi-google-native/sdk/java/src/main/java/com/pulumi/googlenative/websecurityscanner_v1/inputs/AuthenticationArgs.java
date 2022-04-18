// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.websecurityscanner_v1.inputs.CustomAccountArgs;
import com.pulumi.googlenative.websecurityscanner_v1.inputs.GoogleAccountArgs;
import com.pulumi.googlenative.websecurityscanner_v1.inputs.IapCredentialArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scan authentication configuration.
 * 
 */
public final class AuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationArgs Empty = new AuthenticationArgs();

    /**
     * Authentication using a custom account.
     * 
     */
    @Import(name="customAccount")
      private final @Nullable Output<CustomAccountArgs> customAccount;

    public Output<CustomAccountArgs> customAccount() {
        return this.customAccount == null ? Codegen.empty() : this.customAccount;
    }

    /**
     * Authentication using a Google account.
     * 
     */
    @Import(name="googleAccount")
      private final @Nullable Output<GoogleAccountArgs> googleAccount;

    public Output<GoogleAccountArgs> googleAccount() {
        return this.googleAccount == null ? Codegen.empty() : this.googleAccount;
    }

    /**
     * Authentication using Identity-Aware-Proxy (IAP).
     * 
     */
    @Import(name="iapCredential")
      private final @Nullable Output<IapCredentialArgs> iapCredential;

    public Output<IapCredentialArgs> iapCredential() {
        return this.iapCredential == null ? Codegen.empty() : this.iapCredential;
    }

    public AuthenticationArgs(
        @Nullable Output<CustomAccountArgs> customAccount,
        @Nullable Output<GoogleAccountArgs> googleAccount,
        @Nullable Output<IapCredentialArgs> iapCredential) {
        this.customAccount = customAccount;
        this.googleAccount = googleAccount;
        this.iapCredential = iapCredential;
    }

    private AuthenticationArgs() {
        this.customAccount = Codegen.empty();
        this.googleAccount = Codegen.empty();
        this.iapCredential = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomAccountArgs> customAccount;
        private @Nullable Output<GoogleAccountArgs> googleAccount;
        private @Nullable Output<IapCredentialArgs> iapCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
    	      this.iapCredential = defaults.iapCredential;
        }

        public Builder customAccount(@Nullable Output<CustomAccountArgs> customAccount) {
            this.customAccount = customAccount;
            return this;
        }
        public Builder customAccount(@Nullable CustomAccountArgs customAccount) {
            this.customAccount = Codegen.ofNullable(customAccount);
            return this;
        }
        public Builder googleAccount(@Nullable Output<GoogleAccountArgs> googleAccount) {
            this.googleAccount = googleAccount;
            return this;
        }
        public Builder googleAccount(@Nullable GoogleAccountArgs googleAccount) {
            this.googleAccount = Codegen.ofNullable(googleAccount);
            return this;
        }
        public Builder iapCredential(@Nullable Output<IapCredentialArgs> iapCredential) {
            this.iapCredential = iapCredential;
            return this;
        }
        public Builder iapCredential(@Nullable IapCredentialArgs iapCredential) {
            this.iapCredential = Codegen.ofNullable(iapCredential);
            return this;
        }        public AuthenticationArgs build() {
            return new AuthenticationArgs(customAccount, googleAccount, iapCredential);
        }
    }
}
