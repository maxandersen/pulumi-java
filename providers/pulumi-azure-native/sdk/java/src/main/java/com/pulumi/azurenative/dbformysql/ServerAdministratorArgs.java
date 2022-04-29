// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql;

import com.pulumi.azurenative.dbformysql.enums.AdministratorType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class ServerAdministratorArgs extends ResourceArgs {

    public static final ServerAdministratorArgs Empty = new ServerAdministratorArgs();

    /**
     * The type of administrator.
     * 
     */
    @Import(name="administratorType", required=true)
    private Output<Either<String,AdministratorType>> administratorType;

    /**
     * @return The type of administrator.
     * 
     */
    public Output<Either<String,AdministratorType>> administratorType() {
        return this.administratorType;
    }

    /**
     * The server administrator login account name.
     * 
     */
    @Import(name="login", required=true)
    private Output<String> login;

    /**
     * @return The server administrator login account name.
     * 
     */
    public Output<String> login() {
        return this.login;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The server administrator Sid (Secure ID).
     * 
     */
    @Import(name="sid", required=true)
    private Output<String> sid;

    /**
     * @return The server administrator Sid (Secure ID).
     * 
     */
    public Output<String> sid() {
        return this.sid;
    }

    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return The server Active Directory Administrator tenant id.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    private ServerAdministratorArgs() {}

    private ServerAdministratorArgs(ServerAdministratorArgs $) {
        this.administratorType = $.administratorType;
        this.login = $.login;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.sid = $.sid;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerAdministratorArgs $;

        public Builder() {
            $ = new ServerAdministratorArgs();
        }

        public Builder(ServerAdministratorArgs defaults) {
            $ = new ServerAdministratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorType The type of administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(Output<Either<String,AdministratorType>> administratorType) {
            $.administratorType = administratorType;
            return this;
        }

        /**
         * @param administratorType The type of administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(Either<String,AdministratorType> administratorType) {
            return administratorType(Output.of(administratorType));
        }

        /**
         * @param administratorType The type of administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(String administratorType) {
            return administratorType(Either.ofLeft(administratorType));
        }

        /**
         * @param administratorType The type of administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(AdministratorType administratorType) {
            return administratorType(Either.ofRight(administratorType));
        }

        /**
         * @param login The server administrator login account name.
         * 
         * @return builder
         * 
         */
        public Builder login(Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The server administrator login account name.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param sid The server administrator Sid (Secure ID).
         * 
         * @return builder
         * 
         */
        public Builder sid(Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid The server administrator Sid (Secure ID).
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        /**
         * @param tenantId The server Active Directory Administrator tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The server Active Directory Administrator tenant id.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ServerAdministratorArgs build() {
            $.administratorType = Objects.requireNonNull($.administratorType, "expected parameter 'administratorType' to be non-null");
            $.login = Objects.requireNonNull($.login, "expected parameter 'login' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.sid = Objects.requireNonNull($.sid, "expected parameter 'sid' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
