// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientRegistrationResponse {
    /**
     * The Client ID of the app used for login.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The app setting name that contains the client secret.
     * 
     */
    private final @Nullable String clientSecretSettingName;

    @CustomType.Constructor
    private ClientRegistrationResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecretSettingName") @Nullable String clientSecretSettingName) {
        this.clientId = clientId;
        this.clientSecretSettingName = clientSecretSettingName;
    }

    /**
     * The Client ID of the app used for login.
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The app setting name that contains the client secret.
     * 
    */
    public Optional<String> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecretSettingName(@Nullable String clientSecretSettingName) {
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }        public ClientRegistrationResponse build() {
            return new ClientRegistrationResponse(clientId, clientSecretSettingName);
        }
    }
}
