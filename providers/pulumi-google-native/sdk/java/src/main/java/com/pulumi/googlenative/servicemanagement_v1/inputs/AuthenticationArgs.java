// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.servicemanagement_v1.inputs.AuthProviderArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.AuthenticationRuleArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `Authentication` defines the authentication configuration for API methods provided by an API service. Example: name: calendar.googleapis.com authentication: providers: - id: google_calendar_auth jwks_uri: https://www.googleapis.com/oauth2/v1/certs issuer: https://securetoken.google.com rules: - selector: &#34;*&#34; requirements: provider_id: google_calendar_auth - selector: google.calendar.Delegate oauth: canonical_scopes: https://www.googleapis.com/auth/calendar.read
 * 
 */
public final class AuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationArgs Empty = new AuthenticationArgs();

    /**
     * Defines a set of authentication providers that a service supports.
     * 
     */
    @Import(name="providers")
      private final @Nullable Output<List<AuthProviderArgs>> providers;

    public Output<List<AuthProviderArgs>> providers() {
        return this.providers == null ? Codegen.empty() : this.providers;
    }

    /**
     * A list of authentication rules that apply to individual API methods. **NOTE:** All service configuration rules follow &#34;last one wins&#34; order.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<AuthenticationRuleArgs>> rules;

    public Output<List<AuthenticationRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public AuthenticationArgs(
        @Nullable Output<List<AuthProviderArgs>> providers,
        @Nullable Output<List<AuthenticationRuleArgs>> rules) {
        this.providers = providers;
        this.rules = rules;
    }

    private AuthenticationArgs() {
        this.providers = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AuthProviderArgs>> providers;
        private @Nullable Output<List<AuthenticationRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providers = defaults.providers;
    	      this.rules = defaults.rules;
        }

        public Builder providers(@Nullable Output<List<AuthProviderArgs>> providers) {
            this.providers = providers;
            return this;
        }
        public Builder providers(@Nullable List<AuthProviderArgs> providers) {
            this.providers = Codegen.ofNullable(providers);
            return this;
        }
        public Builder providers(AuthProviderArgs... providers) {
            return providers(List.of(providers));
        }
        public Builder rules(@Nullable Output<List<AuthenticationRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<AuthenticationRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(AuthenticationRuleArgs... rules) {
            return rules(List.of(rules));
        }        public AuthenticationArgs build() {
            return new AuthenticationArgs(providers, rules);
        }
    }
}
