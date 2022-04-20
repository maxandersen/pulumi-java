// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryLoginResponse;
import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryRegistrationResponse;
import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryValidationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureActiveDirectoryResponse {
    /**
     * &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     */
    private final @Nullable Boolean isAutoProvisioned;
    /**
     * The configuration settings of the Azure Active Directory login flow.
     * 
     */
    private final @Nullable AzureActiveDirectoryLoginResponse login;
    /**
     * The configuration settings of the Azure Active Directory app registration.
     * 
     */
    private final @Nullable AzureActiveDirectoryRegistrationResponse registration;
    /**
     * The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    private final @Nullable AzureActiveDirectoryValidationResponse validation;

    @CustomType.Constructor
    private AzureActiveDirectoryResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("isAutoProvisioned") @Nullable Boolean isAutoProvisioned,
        @CustomType.Parameter("login") @Nullable AzureActiveDirectoryLoginResponse login,
        @CustomType.Parameter("registration") @Nullable AzureActiveDirectoryRegistrationResponse registration,
        @CustomType.Parameter("validation") @Nullable AzureActiveDirectoryValidationResponse validation) {
        this.enabled = enabled;
        this.isAutoProvisioned = isAutoProvisioned;
        this.login = login;
        this.registration = registration;
        this.validation = validation;
    }

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
    */
    public Optional<Boolean> isAutoProvisioned() {
        return Optional.ofNullable(this.isAutoProvisioned);
    }
    /**
     * The configuration settings of the Azure Active Directory login flow.
     * 
    */
    public Optional<AzureActiveDirectoryLoginResponse> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * The configuration settings of the Azure Active Directory app registration.
     * 
    */
    public Optional<AzureActiveDirectoryRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }
    /**
     * The configuration settings of the Azure Active Directory token validation flow.
     * 
    */
    public Optional<AzureActiveDirectoryValidationResponse> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean isAutoProvisioned;
        private @Nullable AzureActiveDirectoryLoginResponse login;
        private @Nullable AzureActiveDirectoryRegistrationResponse registration;
        private @Nullable AzureActiveDirectoryValidationResponse validation;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.isAutoProvisioned = defaults.isAutoProvisioned;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder isAutoProvisioned(@Nullable Boolean isAutoProvisioned) {
            this.isAutoProvisioned = isAutoProvisioned;
            return this;
        }
        public Builder login(@Nullable AzureActiveDirectoryLoginResponse login) {
            this.login = login;
            return this;
        }
        public Builder registration(@Nullable AzureActiveDirectoryRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }
        public Builder validation(@Nullable AzureActiveDirectoryValidationResponse validation) {
            this.validation = validation;
            return this;
        }        public AzureActiveDirectoryResponse build() {
            return new AzureActiveDirectoryResponse(enabled, isAutoProvisioned, login, registration, validation);
        }
    }
}
