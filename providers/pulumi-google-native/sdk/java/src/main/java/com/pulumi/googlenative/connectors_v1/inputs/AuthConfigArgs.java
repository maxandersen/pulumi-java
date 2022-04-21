// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.connectors_v1.enums.AuthConfigAuthType;
import com.pulumi.googlenative.connectors_v1.inputs.ConfigVariableArgs;
import com.pulumi.googlenative.connectors_v1.inputs.Oauth2ClientCredentialsArgs;
import com.pulumi.googlenative.connectors_v1.inputs.Oauth2JwtBearerArgs;
import com.pulumi.googlenative.connectors_v1.inputs.UserPasswordArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AuthConfig defines details of a authentication type.
 * 
 */
public final class AuthConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigArgs Empty = new AuthConfigArgs();

    /**
     * List containing additional auth configs.
     * 
     */
    @Import(name="additionalVariables")
    private @Nullable Output<List<ConfigVariableArgs>> additionalVariables;

    public Optional<Output<List<ConfigVariableArgs>>> additionalVariables() {
        return Optional.ofNullable(this.additionalVariables);
    }

    /**
     * The type of authentication configured.
     * 
     */
    @Import(name="authType")
    private @Nullable Output<AuthConfigAuthType> authType;

    public Optional<Output<AuthConfigAuthType>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * Oauth2ClientCredentials.
     * 
     */
    @Import(name="oauth2ClientCredentials")
    private @Nullable Output<Oauth2ClientCredentialsArgs> oauth2ClientCredentials;

    public Optional<Output<Oauth2ClientCredentialsArgs>> oauth2ClientCredentials() {
        return Optional.ofNullable(this.oauth2ClientCredentials);
    }

    /**
     * Oauth2JwtBearer.
     * 
     */
    @Import(name="oauth2JwtBearer")
    private @Nullable Output<Oauth2JwtBearerArgs> oauth2JwtBearer;

    public Optional<Output<Oauth2JwtBearerArgs>> oauth2JwtBearer() {
        return Optional.ofNullable(this.oauth2JwtBearer);
    }

    /**
     * UserPassword.
     * 
     */
    @Import(name="userPassword")
    private @Nullable Output<UserPasswordArgs> userPassword;

    public Optional<Output<UserPasswordArgs>> userPassword() {
        return Optional.ofNullable(this.userPassword);
    }

    private AuthConfigArgs() {}

    private AuthConfigArgs(AuthConfigArgs $) {
        this.additionalVariables = $.additionalVariables;
        this.authType = $.authType;
        this.oauth2ClientCredentials = $.oauth2ClientCredentials;
        this.oauth2JwtBearer = $.oauth2JwtBearer;
        this.userPassword = $.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigArgs $;

        public Builder() {
            $ = new AuthConfigArgs();
        }

        public Builder(AuthConfigArgs defaults) {
            $ = new AuthConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalVariables(@Nullable Output<List<ConfigVariableArgs>> additionalVariables) {
            $.additionalVariables = additionalVariables;
            return this;
        }

        public Builder additionalVariables(List<ConfigVariableArgs> additionalVariables) {
            return additionalVariables(Output.of(additionalVariables));
        }

        public Builder additionalVariables(ConfigVariableArgs... additionalVariables) {
            return additionalVariables(List.of(additionalVariables));
        }

        public Builder authType(@Nullable Output<AuthConfigAuthType> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(AuthConfigAuthType authType) {
            return authType(Output.of(authType));
        }

        public Builder oauth2ClientCredentials(@Nullable Output<Oauth2ClientCredentialsArgs> oauth2ClientCredentials) {
            $.oauth2ClientCredentials = oauth2ClientCredentials;
            return this;
        }

        public Builder oauth2ClientCredentials(Oauth2ClientCredentialsArgs oauth2ClientCredentials) {
            return oauth2ClientCredentials(Output.of(oauth2ClientCredentials));
        }

        public Builder oauth2JwtBearer(@Nullable Output<Oauth2JwtBearerArgs> oauth2JwtBearer) {
            $.oauth2JwtBearer = oauth2JwtBearer;
            return this;
        }

        public Builder oauth2JwtBearer(Oauth2JwtBearerArgs oauth2JwtBearer) {
            return oauth2JwtBearer(Output.of(oauth2JwtBearer));
        }

        public Builder userPassword(@Nullable Output<UserPasswordArgs> userPassword) {
            $.userPassword = userPassword;
            return this;
        }

        public Builder userPassword(UserPasswordArgs userPassword) {
            return userPassword(Output.of(userPassword));
        }

        public AuthConfigArgs build() {
            return $;
        }
    }

}
