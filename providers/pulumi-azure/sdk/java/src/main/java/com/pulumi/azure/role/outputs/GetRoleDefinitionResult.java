// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.role.outputs;

import com.pulumi.azure.role.outputs.GetRoleDefinitionPermission;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRoleDefinitionResult {
    /**
     * @return One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
     * 
     */
    private final List<String> assignableScopes;
    /**
     * @return the Description of the built-in Role.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return a `permissions` block as documented below.
     * 
     */
    private final List<GetRoleDefinitionPermission> permissions;
    private final String roleDefinitionId;
    private final @Nullable String scope;
    /**
     * @return the Type of the Role.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRoleDefinitionResult(
        @CustomType.Parameter("assignableScopes") List<String> assignableScopes,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("permissions") List<GetRoleDefinitionPermission> permissions,
        @CustomType.Parameter("roleDefinitionId") String roleDefinitionId,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("type") String type) {
        this.assignableScopes = assignableScopes;
        this.description = description;
        this.id = id;
        this.name = name;
        this.permissions = permissions;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
        this.type = type;
    }

    /**
     * @return One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
     * 
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }
    /**
     * @return the Description of the built-in Role.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return a `permissions` block as documented below.
     * 
     */
    public List<GetRoleDefinitionPermission> permissions() {
        return this.permissions;
    }
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return the Type of the Role.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> assignableScopes;
        private String description;
        private String id;
        private String name;
        private List<GetRoleDefinitionPermission> permissions;
        private String roleDefinitionId;
        private @Nullable String scope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignableScopes = defaults.assignableScopes;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder assignableScopes(List<String> assignableScopes) {
            this.assignableScopes = Objects.requireNonNull(assignableScopes);
            return this;
        }
        public Builder assignableScopes(String... assignableScopes) {
            return assignableScopes(List.of(assignableScopes));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder permissions(List<GetRoleDefinitionPermission> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(GetRoleDefinitionPermission... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRoleDefinitionResult build() {
            return new GetRoleDefinitionResult(assignableScopes, description, id, name, permissions, roleDefinitionId, scope, type);
        }
    }
}
