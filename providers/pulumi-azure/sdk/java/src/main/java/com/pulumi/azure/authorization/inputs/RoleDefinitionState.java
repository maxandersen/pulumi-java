// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.authorization.inputs;

import com.pulumi.azure.authorization.inputs.RoleDefinitionPermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleDefinitionState extends com.pulumi.resources.ResourceArgs {

    public static final RoleDefinitionState Empty = new RoleDefinitionState();

    /**
     * One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
     * 
     */
    @Import(name="assignableScopes")
    private @Nullable Output<List<String>> assignableScopes;

    /**
     * @return One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
     * 
     */
    public Optional<Output<List<String>>> assignableScopes() {
        return Optional.ofNullable(this.assignableScopes);
    }

    /**
     * A description of the Role Definition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Role Definition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Role Definition. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Role Definition. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `permissions` block as defined below.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<RoleDefinitionPermissionArgs>> permissions;

    /**
     * @return A `permissions` block as defined below.
     * 
     */
    public Optional<Output<List<RoleDefinitionPermissionArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="roleDefinitionId")
    private @Nullable Output<String> roleDefinitionId;

    /**
     * @return A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> roleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }

    /**
     * The Azure Resource Manager ID for the resource.
     * 
     */
    @Import(name="roleDefinitionResourceId")
    private @Nullable Output<String> roleDefinitionResourceId;

    /**
     * @return The Azure Resource Manager ID for the resource.
     * 
     */
    public Optional<Output<String>> roleDefinitionResourceId() {
        return Optional.ofNullable(this.roleDefinitionResourceId);
    }

    /**
     * The scope at which the Role Definition applies to, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. It is recommended to use the first entry of the `assignable_scopes`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope at which the Role Definition applies to, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. It is recommended to use the first entry of the `assignable_scopes`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private RoleDefinitionState() {}

    private RoleDefinitionState(RoleDefinitionState $) {
        this.assignableScopes = $.assignableScopes;
        this.description = $.description;
        this.name = $.name;
        this.permissions = $.permissions;
        this.roleDefinitionId = $.roleDefinitionId;
        this.roleDefinitionResourceId = $.roleDefinitionResourceId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleDefinitionState $;

        public Builder() {
            $ = new RoleDefinitionState();
        }

        public Builder(RoleDefinitionState defaults) {
            $ = new RoleDefinitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignableScopes One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
         * 
         * @return builder
         * 
         */
        public Builder assignableScopes(@Nullable Output<List<String>> assignableScopes) {
            $.assignableScopes = assignableScopes;
            return this;
        }

        /**
         * @param assignableScopes One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
         * 
         * @return builder
         * 
         */
        public Builder assignableScopes(List<String> assignableScopes) {
            return assignableScopes(Output.of(assignableScopes));
        }

        /**
         * @param assignableScopes One or more assignable scopes for this Role Definition, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`.
         * 
         * @return builder
         * 
         */
        public Builder assignableScopes(String... assignableScopes) {
            return assignableScopes(List.of(assignableScopes));
        }

        /**
         * @param description A description of the Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the Role Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Role Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param permissions A `permissions` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<RoleDefinitionPermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions A `permissions` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<RoleDefinitionPermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions A `permissions` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder permissions(RoleDefinitionPermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param roleDefinitionId A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        /**
         * @param roleDefinitionId A unique UUID/GUID which identifies this role - one will be generated if not specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            return roleDefinitionId(Output.of(roleDefinitionId));
        }

        /**
         * @param roleDefinitionResourceId The Azure Resource Manager ID for the resource.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionResourceId(@Nullable Output<String> roleDefinitionResourceId) {
            $.roleDefinitionResourceId = roleDefinitionResourceId;
            return this;
        }

        /**
         * @param roleDefinitionResourceId The Azure Resource Manager ID for the resource.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionResourceId(String roleDefinitionResourceId) {
            return roleDefinitionResourceId(Output.of(roleDefinitionResourceId));
        }

        /**
         * @param scope The scope at which the Role Definition applies to, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. It is recommended to use the first entry of the `assignable_scopes`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope at which the Role Definition applies to, such as `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333`, `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup`, or `/subscriptions/0b1f6471-1bf0-4dda-aec3-111122223333/resourceGroups/myGroup/providers/Microsoft.Compute/virtualMachines/myVM`. It is recommended to use the first entry of the `assignable_scopes`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public RoleDefinitionState build() {
            return $;
        }
    }

}
