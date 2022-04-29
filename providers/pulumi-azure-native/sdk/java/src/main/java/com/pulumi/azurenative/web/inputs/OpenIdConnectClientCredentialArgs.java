// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.ClientCredentialMethod;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The authentication client credentials of the custom Open ID Connect provider.
 * 
 */
public final class OpenIdConnectClientCredentialArgs extends ResourceArgs {

    public static final OpenIdConnectClientCredentialArgs Empty = new OpenIdConnectClientCredentialArgs();

    /**
     * The app setting that contains the client secret for the custom Open ID Connect provider.
     * 
     */
    @Import(name="clientSecretSettingName")
    private @Nullable Output<String> clientSecretSettingName;

    /**
     * @return The app setting that contains the client secret for the custom Open ID Connect provider.
     * 
     */
    public Optional<Output<String>> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    /**
     * The method that should be used to authenticate the user.
     * 
     */
    @Import(name="method")
    private @Nullable Output<ClientCredentialMethod> method;

    /**
     * @return The method that should be used to authenticate the user.
     * 
     */
    public Optional<Output<ClientCredentialMethod>> method() {
        return Optional.ofNullable(this.method);
    }

    private OpenIdConnectClientCredentialArgs() {}

    private OpenIdConnectClientCredentialArgs(OpenIdConnectClientCredentialArgs $) {
        this.clientSecretSettingName = $.clientSecretSettingName;
        this.method = $.method;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenIdConnectClientCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenIdConnectClientCredentialArgs $;

        public Builder() {
            $ = new OpenIdConnectClientCredentialArgs();
        }

        public Builder(OpenIdConnectClientCredentialArgs defaults) {
            $ = new OpenIdConnectClientCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientSecretSettingName The app setting that contains the client secret for the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(@Nullable Output<String> clientSecretSettingName) {
            $.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        /**
         * @param clientSecretSettingName The app setting that contains the client secret for the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            return clientSecretSettingName(Output.of(clientSecretSettingName));
        }

        /**
         * @param method The method that should be used to authenticate the user.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<ClientCredentialMethod> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The method that should be used to authenticate the user.
         * 
         * @return builder
         * 
         */
        public Builder method(ClientCredentialMethod method) {
            return method(Output.of(method));
        }

        public OpenIdConnectClientCredentialArgs build() {
            return $;
        }
    }

}
