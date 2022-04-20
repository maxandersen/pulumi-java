// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.PermissionScopeResponse;
import com.pulumi.azurenative.storage.outputs.SshPublicKeyResponse;
import com.pulumi.azurenative.storage.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalUserResult {
    /**
     * Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
     */
    private final @Nullable Boolean hasSharedKey;
    /**
     * Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     */
    private final @Nullable Boolean hasSshKey;
    /**
     * Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
     */
    private final @Nullable Boolean hasSshPassword;
    /**
     * Optional, local user home directory.
     * 
     */
    private final @Nullable String homeDirectory;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The permission scopes of the local user.
     * 
     */
    private final @Nullable List<PermissionScopeResponse> permissionScopes;
    /**
     * A unique Security Identifier that is generated by the server.
     * 
     */
    private final String sid;
    /**
     * Optional, local user ssh authorized keys for SFTP.
     * 
     */
    private final @Nullable List<SshPublicKeyResponse> sshAuthorizedKeys;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLocalUserResult(
        @CustomType.Parameter("hasSharedKey") @Nullable Boolean hasSharedKey,
        @CustomType.Parameter("hasSshKey") @Nullable Boolean hasSshKey,
        @CustomType.Parameter("hasSshPassword") @Nullable Boolean hasSshPassword,
        @CustomType.Parameter("homeDirectory") @Nullable String homeDirectory,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("permissionScopes") @Nullable List<PermissionScopeResponse> permissionScopes,
        @CustomType.Parameter("sid") String sid,
        @CustomType.Parameter("sshAuthorizedKeys") @Nullable List<SshPublicKeyResponse> sshAuthorizedKeys,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.hasSharedKey = hasSharedKey;
        this.hasSshKey = hasSshKey;
        this.hasSshPassword = hasSshPassword;
        this.homeDirectory = homeDirectory;
        this.id = id;
        this.name = name;
        this.permissionScopes = permissionScopes;
        this.sid = sid;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
    */
    public Optional<Boolean> hasSharedKey() {
        return Optional.ofNullable(this.hasSharedKey);
    }
    /**
     * Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
    */
    public Optional<Boolean> hasSshKey() {
        return Optional.ofNullable(this.hasSshKey);
    }
    /**
     * Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
    */
    public Optional<Boolean> hasSshPassword() {
        return Optional.ofNullable(this.hasSshPassword);
    }
    /**
     * Optional, local user home directory.
     * 
    */
    public Optional<String> homeDirectory() {
        return Optional.ofNullable(this.homeDirectory);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The permission scopes of the local user.
     * 
    */
    public List<PermissionScopeResponse> permissionScopes() {
        return this.permissionScopes == null ? List.of() : this.permissionScopes;
    }
    /**
     * A unique Security Identifier that is generated by the server.
     * 
    */
    public String sid() {
        return this.sid;
    }
    /**
     * Optional, local user ssh authorized keys for SFTP.
     * 
    */
    public List<SshPublicKeyResponse> sshAuthorizedKeys() {
        return this.sshAuthorizedKeys == null ? List.of() : this.sshAuthorizedKeys;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
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

    public static Builder builder(GetLocalUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean hasSharedKey;
        private @Nullable Boolean hasSshKey;
        private @Nullable Boolean hasSshPassword;
        private @Nullable String homeDirectory;
        private String id;
        private String name;
        private @Nullable List<PermissionScopeResponse> permissionScopes;
        private String sid;
        private @Nullable List<SshPublicKeyResponse> sshAuthorizedKeys;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasSharedKey = defaults.hasSharedKey;
    	      this.hasSshKey = defaults.hasSshKey;
    	      this.hasSshPassword = defaults.hasSshPassword;
    	      this.homeDirectory = defaults.homeDirectory;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissionScopes = defaults.permissionScopes;
    	      this.sid = defaults.sid;
    	      this.sshAuthorizedKeys = defaults.sshAuthorizedKeys;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder hasSharedKey(@Nullable Boolean hasSharedKey) {
            this.hasSharedKey = hasSharedKey;
            return this;
        }
        public Builder hasSshKey(@Nullable Boolean hasSshKey) {
            this.hasSshKey = hasSshKey;
            return this;
        }
        public Builder hasSshPassword(@Nullable Boolean hasSshPassword) {
            this.hasSshPassword = hasSshPassword;
            return this;
        }
        public Builder homeDirectory(@Nullable String homeDirectory) {
            this.homeDirectory = homeDirectory;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder permissionScopes(@Nullable List<PermissionScopeResponse> permissionScopes) {
            this.permissionScopes = permissionScopes;
            return this;
        }
        public Builder permissionScopes(PermissionScopeResponse... permissionScopes) {
            return permissionScopes(List.of(permissionScopes));
        }
        public Builder sid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }
        public Builder sshAuthorizedKeys(@Nullable List<SshPublicKeyResponse> sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            return this;
        }
        public Builder sshAuthorizedKeys(SshPublicKeyResponse... sshAuthorizedKeys) {
            return sshAuthorizedKeys(List.of(sshAuthorizedKeys));
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLocalUserResult build() {
            return new GetLocalUserResult(hasSharedKey, hasSshKey, hasSshPassword, homeDirectory, id, name, permissionScopes, sid, sshAuthorizedKeys, systemData, type);
        }
    }
}
