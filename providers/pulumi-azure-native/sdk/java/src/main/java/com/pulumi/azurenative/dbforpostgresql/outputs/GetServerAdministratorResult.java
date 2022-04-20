// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerAdministratorResult {
    /**
     * The type of administrator.
     * 
     */
    private final String administratorType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The server administrator login account name.
     * 
     */
    private final String login;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The server administrator Sid (Secure ID).
     * 
     */
    private final String sid;
    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    private final String tenantId;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerAdministratorResult(
        @CustomType.Parameter("administratorType") String administratorType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("login") String login,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sid") String sid,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.administratorType = administratorType;
        this.id = id;
        this.login = login;
        this.name = name;
        this.sid = sid;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The type of administrator.
     * 
    */
    public String administratorType() {
        return this.administratorType;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The server administrator login account name.
     * 
    */
    public String login() {
        return this.login;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The server administrator Sid (Secure ID).
     * 
    */
    public String sid() {
        return this.sid;
    }
    /**
     * The server Active Directory Administrator tenant id.
     * 
    */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAdministratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorType;
        private String id;
        private String login;
        private String name;
        private String sid;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAdministratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder administratorType(String administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder login(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerAdministratorResult build() {
            return new GetServerAdministratorResult(administratorType, id, login, name, sid, tenantId, type);
        }
    }
}
