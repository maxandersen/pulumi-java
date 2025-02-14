// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.ConnectionSettingParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for a Connection Setting Item
 * 
 */
public final class ConnectionSettingPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionSettingPropertiesArgs Empty = new ConnectionSettingPropertiesArgs();

    /**
     * Client Id associated with the Connection Setting.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Client Id associated with the Connection Setting.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Client Secret associated with the Connection Setting
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return Client Secret associated with the Connection Setting
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Id associated with the Connection Setting.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Id associated with the Connection Setting.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Name associated with the Connection Setting.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name associated with the Connection Setting.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Service Provider Parameters associated with the Connection Setting
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ConnectionSettingParameterArgs>> parameters;

    /**
     * @return Service Provider Parameters associated with the Connection Setting
     * 
     */
    public Optional<Output<List<ConnectionSettingParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * Scopes associated with the Connection Setting
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<String> scopes;

    /**
     * @return Scopes associated with the Connection Setting
     * 
     */
    public Optional<Output<String>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * Service Provider Display Name associated with the Connection Setting
     * 
     */
    @Import(name="serviceProviderDisplayName")
    private @Nullable Output<String> serviceProviderDisplayName;

    /**
     * @return Service Provider Display Name associated with the Connection Setting
     * 
     */
    public Optional<Output<String>> serviceProviderDisplayName() {
        return Optional.ofNullable(this.serviceProviderDisplayName);
    }

    /**
     * Service Provider Id associated with the Connection Setting
     * 
     */
    @Import(name="serviceProviderId")
    private @Nullable Output<String> serviceProviderId;

    /**
     * @return Service Provider Id associated with the Connection Setting
     * 
     */
    public Optional<Output<String>> serviceProviderId() {
        return Optional.ofNullable(this.serviceProviderId);
    }

    private ConnectionSettingPropertiesArgs() {}

    private ConnectionSettingPropertiesArgs(ConnectionSettingPropertiesArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.id = $.id;
        this.name = $.name;
        this.parameters = $.parameters;
        this.provisioningState = $.provisioningState;
        this.scopes = $.scopes;
        this.serviceProviderDisplayName = $.serviceProviderDisplayName;
        this.serviceProviderId = $.serviceProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionSettingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionSettingPropertiesArgs $;

        public Builder() {
            $ = new ConnectionSettingPropertiesArgs();
        }

        public Builder(ConnectionSettingPropertiesArgs defaults) {
            $ = new ConnectionSettingPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId Client Id associated with the Connection Setting.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client Id associated with the Connection Setting.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Client Secret associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Client Secret associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param id Id associated with the Connection Setting.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Id associated with the Connection Setting.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name associated with the Connection Setting.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name associated with the Connection Setting.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Service Provider Parameters associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<ConnectionSettingParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Service Provider Parameters associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<ConnectionSettingParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Service Provider Parameters associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder parameters(ConnectionSettingParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param provisioningState Provisioning state of the resource
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the resource
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param scopes Scopes associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<String> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Scopes associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder scopes(String scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param serviceProviderDisplayName Service Provider Display Name associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder serviceProviderDisplayName(@Nullable Output<String> serviceProviderDisplayName) {
            $.serviceProviderDisplayName = serviceProviderDisplayName;
            return this;
        }

        /**
         * @param serviceProviderDisplayName Service Provider Display Name associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder serviceProviderDisplayName(String serviceProviderDisplayName) {
            return serviceProviderDisplayName(Output.of(serviceProviderDisplayName));
        }

        /**
         * @param serviceProviderId Service Provider Id associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder serviceProviderId(@Nullable Output<String> serviceProviderId) {
            $.serviceProviderId = serviceProviderId;
            return this;
        }

        /**
         * @param serviceProviderId Service Provider Id associated with the Connection Setting
         * 
         * @return builder
         * 
         */
        public Builder serviceProviderId(String serviceProviderId) {
            return serviceProviderId(Output.of(serviceProviderId));
        }

        public ConnectionSettingPropertiesArgs build() {
            return $;
        }
    }

}
