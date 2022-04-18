// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events.outputs;

import com.pulumi.awsnative.events.outputs.ConnectionApiKeyAuthParameters;
import com.pulumi.awsnative.events.outputs.ConnectionBasicAuthParameters;
import com.pulumi.awsnative.events.outputs.ConnectionHttpParameters;
import com.pulumi.awsnative.events.outputs.ConnectionOAuthParameters;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthParametersProperties {
    private final @Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters;
    private final @Nullable ConnectionBasicAuthParameters basicAuthParameters;
    private final @Nullable ConnectionHttpParameters invocationHttpParameters;
    private final @Nullable ConnectionOAuthParameters oAuthParameters;

    @CustomType.Constructor
    private AuthParametersProperties(
        @CustomType.Parameter("apiKeyAuthParameters") @Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters,
        @CustomType.Parameter("basicAuthParameters") @Nullable ConnectionBasicAuthParameters basicAuthParameters,
        @CustomType.Parameter("invocationHttpParameters") @Nullable ConnectionHttpParameters invocationHttpParameters,
        @CustomType.Parameter("oAuthParameters") @Nullable ConnectionOAuthParameters oAuthParameters) {
        this.apiKeyAuthParameters = apiKeyAuthParameters;
        this.basicAuthParameters = basicAuthParameters;
        this.invocationHttpParameters = invocationHttpParameters;
        this.oAuthParameters = oAuthParameters;
    }

    public Optional<ConnectionApiKeyAuthParameters> apiKeyAuthParameters() {
        return Optional.ofNullable(this.apiKeyAuthParameters);
    }
    public Optional<ConnectionBasicAuthParameters> basicAuthParameters() {
        return Optional.ofNullable(this.basicAuthParameters);
    }
    public Optional<ConnectionHttpParameters> invocationHttpParameters() {
        return Optional.ofNullable(this.invocationHttpParameters);
    }
    public Optional<ConnectionOAuthParameters> oAuthParameters() {
        return Optional.ofNullable(this.oAuthParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthParametersProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters;
        private @Nullable ConnectionBasicAuthParameters basicAuthParameters;
        private @Nullable ConnectionHttpParameters invocationHttpParameters;
        private @Nullable ConnectionOAuthParameters oAuthParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthParametersProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyAuthParameters = defaults.apiKeyAuthParameters;
    	      this.basicAuthParameters = defaults.basicAuthParameters;
    	      this.invocationHttpParameters = defaults.invocationHttpParameters;
    	      this.oAuthParameters = defaults.oAuthParameters;
        }

        public Builder apiKeyAuthParameters(@Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters) {
            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }
        public Builder basicAuthParameters(@Nullable ConnectionBasicAuthParameters basicAuthParameters) {
            this.basicAuthParameters = basicAuthParameters;
            return this;
        }
        public Builder invocationHttpParameters(@Nullable ConnectionHttpParameters invocationHttpParameters) {
            this.invocationHttpParameters = invocationHttpParameters;
            return this;
        }
        public Builder oAuthParameters(@Nullable ConnectionOAuthParameters oAuthParameters) {
            this.oAuthParameters = oAuthParameters;
            return this;
        }        public AuthParametersProperties build() {
            return new AuthParametersProperties(apiKeyAuthParameters, basicAuthParameters, invocationHttpParameters, oAuthParameters);
        }
    }
}
