// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.ConnectionSettingParameterResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionSettingPropertiesResponse {
    /**
     * Client Id associated with the Connection Setting.
     * 
     */
    private final @Nullable String clientId;
    /**
     * Client Secret associated with the Connection Setting
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * Id associated with the Connection Setting.
     * 
     */
    private final @Nullable String id;
    /**
     * Name associated with the Connection Setting.
     * 
     */
    private final @Nullable String name;
    /**
     * Service Provider Parameters associated with the Connection Setting
     * 
     */
    private final @Nullable List<ConnectionSettingParameterResponse> parameters;
    /**
     * Provisioning state of the resource
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Scopes associated with the Connection Setting
     * 
     */
    private final @Nullable String scopes;
    /**
     * Service Provider Display Name associated with the Connection Setting
     * 
     */
    private final @Nullable String serviceProviderDisplayName;
    /**
     * Service Provider Id associated with the Connection Setting
     * 
     */
    private final @Nullable String serviceProviderId;
    /**
     * Setting Id set by the service for the Connection Setting.
     * 
     */
    private final String settingId;

    @CustomType.Constructor
    private ConnectionSettingPropertiesResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("parameters") @Nullable List<ConnectionSettingParameterResponse> parameters,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("scopes") @Nullable String scopes,
        @CustomType.Parameter("serviceProviderDisplayName") @Nullable String serviceProviderDisplayName,
        @CustomType.Parameter("serviceProviderId") @Nullable String serviceProviderId,
        @CustomType.Parameter("settingId") String settingId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.scopes = scopes;
        this.serviceProviderDisplayName = serviceProviderDisplayName;
        this.serviceProviderId = serviceProviderId;
        this.settingId = settingId;
    }

    /**
     * Client Id associated with the Connection Setting.
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Client Secret associated with the Connection Setting
     * 
    */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * Id associated with the Connection Setting.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name associated with the Connection Setting.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Service Provider Parameters associated with the Connection Setting
     * 
    */
    public List<ConnectionSettingParameterResponse> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * Provisioning state of the resource
     * 
    */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Scopes associated with the Connection Setting
     * 
    */
    public Optional<String> scopes() {
        return Optional.ofNullable(this.scopes);
    }
    /**
     * Service Provider Display Name associated with the Connection Setting
     * 
    */
    public Optional<String> serviceProviderDisplayName() {
        return Optional.ofNullable(this.serviceProviderDisplayName);
    }
    /**
     * Service Provider Id associated with the Connection Setting
     * 
    */
    public Optional<String> serviceProviderId() {
        return Optional.ofNullable(this.serviceProviderId);
    }
    /**
     * Setting Id set by the service for the Connection Setting.
     * 
    */
    public String settingId() {
        return this.settingId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSettingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<ConnectionSettingParameterResponse> parameters;
        private @Nullable String provisioningState;
        private @Nullable String scopes;
        private @Nullable String serviceProviderDisplayName;
        private @Nullable String serviceProviderId;
        private String settingId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionSettingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scopes = defaults.scopes;
    	      this.serviceProviderDisplayName = defaults.serviceProviderDisplayName;
    	      this.serviceProviderId = defaults.serviceProviderId;
    	      this.settingId = defaults.settingId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder parameters(@Nullable List<ConnectionSettingParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(ConnectionSettingParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder scopes(@Nullable String scopes) {
            this.scopes = scopes;
            return this;
        }
        public Builder serviceProviderDisplayName(@Nullable String serviceProviderDisplayName) {
            this.serviceProviderDisplayName = serviceProviderDisplayName;
            return this;
        }
        public Builder serviceProviderId(@Nullable String serviceProviderId) {
            this.serviceProviderId = serviceProviderId;
            return this;
        }
        public Builder settingId(String settingId) {
            this.settingId = Objects.requireNonNull(settingId);
            return this;
        }        public ConnectionSettingPropertiesResponse build() {
            return new ConnectionSettingPropertiesResponse(clientId, clientSecret, id, name, parameters, provisioningState, scopes, serviceProviderDisplayName, serviceProviderId, settingId);
        }
    }
}
