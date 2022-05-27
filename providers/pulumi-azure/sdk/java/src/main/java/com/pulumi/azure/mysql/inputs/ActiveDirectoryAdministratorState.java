// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActiveDirectoryAdministratorState extends com.pulumi.resources.ResourceArgs {

    public static final ActiveDirectoryAdministratorState Empty = new ActiveDirectoryAdministratorState();

    /**
     * The login name of the principal to set as the server administrator
     * 
     */
    @Import(name="login")
    private @Nullable Output<String> login;

    /**
     * @return The login name of the principal to set as the server administrator
     * 
     */
    public Optional<Output<String>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * The ID of the principal to set as the server administrator. For a managed identity this should be the Client ID of the identity.
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<String> objectId;

    /**
     * @return The ID of the principal to set as the server administrator. For a managed identity this should be the Client ID of the identity.
     * 
     */
    public Optional<Output<String>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The name of the resource group for the MySQL server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group for the MySQL server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The name of the MySQL Server on which to set the administrator. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return The name of the MySQL Server on which to set the administrator. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * The Azure Tenant ID
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Azure Tenant ID
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ActiveDirectoryAdministratorState() {}

    private ActiveDirectoryAdministratorState(ActiveDirectoryAdministratorState $) {
        this.login = $.login;
        this.objectId = $.objectId;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActiveDirectoryAdministratorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActiveDirectoryAdministratorState $;

        public Builder() {
            $ = new ActiveDirectoryAdministratorState();
        }

        public Builder(ActiveDirectoryAdministratorState defaults) {
            $ = new ActiveDirectoryAdministratorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param login The login name of the principal to set as the server administrator
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The login name of the principal to set as the server administrator
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param objectId The ID of the principal to set as the server administrator. For a managed identity this should be the Client ID of the identity.
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The ID of the principal to set as the server administrator. For a managed identity this should be the Client ID of the identity.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param resourceGroupName The name of the resource group for the MySQL server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group for the MySQL server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the MySQL Server on which to set the administrator. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the MySQL Server on which to set the administrator. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param tenantId The Azure Tenant ID
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Azure Tenant ID
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ActiveDirectoryAdministratorState build() {
            return $;
        }
    }

}
