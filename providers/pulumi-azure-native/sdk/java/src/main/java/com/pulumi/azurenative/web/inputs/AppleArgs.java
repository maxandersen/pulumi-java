// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AppleRegistrationArgs;
import com.pulumi.azurenative.web.inputs.LoginScopesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Apple provider.
 * 
 */
public final class AppleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppleArgs Empty = new AppleArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Apple provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<LoginScopesArgs> login;

    public Output<LoginScopesArgs> login() {
        return this.login == null ? Codegen.empty() : this.login;
    }

    /**
     * The configuration settings of the Apple registration.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<AppleRegistrationArgs> registration;

    public Output<AppleRegistrationArgs> registration() {
        return this.registration == null ? Codegen.empty() : this.registration;
    }

    public AppleArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<LoginScopesArgs> login,
        @Nullable Output<AppleRegistrationArgs> registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    private AppleArgs() {
        this.enabled = Codegen.empty();
        this.login = Codegen.empty();
        this.registration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<LoginScopesArgs> login;
        private @Nullable Output<AppleRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(AppleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder login(@Nullable Output<LoginScopesArgs> login) {
            this.login = login;
            return this;
        }
        public Builder login(@Nullable LoginScopesArgs login) {
            this.login = Codegen.ofNullable(login);
            return this;
        }
        public Builder registration(@Nullable Output<AppleRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }
        public Builder registration(@Nullable AppleRegistrationArgs registration) {
            this.registration = Codegen.ofNullable(registration);
            return this;
        }        public AppleArgs build() {
            return new AppleArgs(enabled, login, registration);
        }
    }
}
