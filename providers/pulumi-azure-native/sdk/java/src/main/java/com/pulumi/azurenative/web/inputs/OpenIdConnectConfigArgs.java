// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the endpoints used for the custom Open ID Connect provider.
 * 
 */
public final class OpenIdConnectConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectConfigArgs Empty = new OpenIdConnectConfigArgs();

    /**
     * The endpoint to be used to make an authorization request.
     * 
     */
    @Import(name="authorizationEndpoint")
    private @Nullable Output<String> authorizationEndpoint;

    public Optional<Output<String>> authorizationEndpoint() {
        return Optional.ofNullable(this.authorizationEndpoint);
    }

    /**
     * The endpoint that provides the keys necessary to validate the token.
     * 
     */
    @Import(name="certificationUri")
    private @Nullable Output<String> certificationUri;

    public Optional<Output<String>> certificationUri() {
        return Optional.ofNullable(this.certificationUri);
    }

    /**
     * The endpoint that issues the token.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * The endpoint to be used to request a token.
     * 
     */
    @Import(name="tokenEndpoint")
    private @Nullable Output<String> tokenEndpoint;

    public Optional<Output<String>> tokenEndpoint() {
        return Optional.ofNullable(this.tokenEndpoint);
    }

    /**
     * The endpoint that contains all the configuration endpoints for the provider.
     * 
     */
    @Import(name="wellKnownOpenIdConfiguration")
    private @Nullable Output<String> wellKnownOpenIdConfiguration;

    public Optional<Output<String>> wellKnownOpenIdConfiguration() {
        return Optional.ofNullable(this.wellKnownOpenIdConfiguration);
    }

    private OpenIdConnectConfigArgs() {}

    private OpenIdConnectConfigArgs(OpenIdConnectConfigArgs $) {
        this.authorizationEndpoint = $.authorizationEndpoint;
        this.certificationUri = $.certificationUri;
        this.issuer = $.issuer;
        this.tokenEndpoint = $.tokenEndpoint;
        this.wellKnownOpenIdConfiguration = $.wellKnownOpenIdConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenIdConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenIdConnectConfigArgs $;

        public Builder() {
            $ = new OpenIdConnectConfigArgs();
        }

        public Builder(OpenIdConnectConfigArgs defaults) {
            $ = new OpenIdConnectConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationEndpoint(@Nullable Output<String> authorizationEndpoint) {
            $.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            return authorizationEndpoint(Output.of(authorizationEndpoint));
        }

        public Builder certificationUri(@Nullable Output<String> certificationUri) {
            $.certificationUri = certificationUri;
            return this;
        }

        public Builder certificationUri(String certificationUri) {
            return certificationUri(Output.of(certificationUri));
        }

        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        public Builder tokenEndpoint(@Nullable Output<String> tokenEndpoint) {
            $.tokenEndpoint = tokenEndpoint;
            return this;
        }

        public Builder tokenEndpoint(String tokenEndpoint) {
            return tokenEndpoint(Output.of(tokenEndpoint));
        }

        public Builder wellKnownOpenIdConfiguration(@Nullable Output<String> wellKnownOpenIdConfiguration) {
            $.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
            return this;
        }

        public Builder wellKnownOpenIdConfiguration(String wellKnownOpenIdConfiguration) {
            return wellKnownOpenIdConfiguration(Output.of(wellKnownOpenIdConfiguration));
        }

        public OpenIdConnectConfigArgs build() {
            return $;
        }
    }

}
