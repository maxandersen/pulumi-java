// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.enums.PrincipalType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentArgs Empty = new RoleAssignmentArgs();

    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase 'foo_storage_container'
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<String> condition;

    public Output<String> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Version of the condition. Currently accepted value is '2.0'
     * 
     */
    @Import(name="conditionVersion")
      private final @Nullable Output<String> conditionVersion;

    public Output<String> conditionVersion() {
        return this.conditionVersion == null ? Codegen.empty() : this.conditionVersion;
    }

    /**
     * Id of the delegated managed identity resource
     * 
     */
    @Import(name="delegatedManagedIdentityResourceId")
      private final @Nullable Output<String> delegatedManagedIdentityResourceId;

    public Output<String> delegatedManagedIdentityResourceId() {
        return this.delegatedManagedIdentityResourceId == null ? Codegen.empty() : this.delegatedManagedIdentityResourceId;
    }

    /**
     * Description of role assignment
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The principal ID.
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * The principal type of the assigned principal ID.
     * 
     */
    @Import(name="principalType")
      private final @Nullable Output<Either<String,PrincipalType>> principalType;

    public Output<Either<String,PrincipalType>> principalType() {
        return this.principalType == null ? Codegen.empty() : this.principalType;
    }

    /**
     * The name of the role assignment. It can be any valid GUID.
     * 
     */
    @Import(name="roleAssignmentName")
      private final @Nullable Output<String> roleAssignmentName;

    public Output<String> roleAssignmentName() {
        return this.roleAssignmentName == null ? Codegen.empty() : this.roleAssignmentName;
    }

    /**
     * The role definition ID.
     * 
     */
    @Import(name="roleDefinitionId", required=true)
      private final Output<String> roleDefinitionId;

    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * The scope of the operation or resource. Valid scopes are: subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    public RoleAssignmentArgs(
        @Nullable Output<String> condition,
        @Nullable Output<String> conditionVersion,
        @Nullable Output<String> delegatedManagedIdentityResourceId,
        @Nullable Output<String> description,
        Output<String> principalId,
        @Nullable Output<Either<String,PrincipalType>> principalType,
        @Nullable Output<String> roleAssignmentName,
        Output<String> roleDefinitionId,
        Output<String> scope) {
        this.condition = condition;
        this.conditionVersion = conditionVersion;
        this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
        this.description = description;
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = principalType == null ? Output.ofLeft("User") : principalType;
        this.roleAssignmentName = roleAssignmentName;
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RoleAssignmentArgs() {
        this.condition = Codegen.empty();
        this.conditionVersion = Codegen.empty();
        this.delegatedManagedIdentityResourceId = Codegen.empty();
        this.description = Codegen.empty();
        this.principalId = Codegen.empty();
        this.principalType = Codegen.empty();
        this.roleAssignmentName = Codegen.empty();
        this.roleDefinitionId = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> condition;
        private @Nullable Output<String> conditionVersion;
        private @Nullable Output<String> delegatedManagedIdentityResourceId;
        private @Nullable Output<String> description;
        private Output<String> principalId;
        private @Nullable Output<Either<String,PrincipalType>> principalType;
        private @Nullable Output<String> roleAssignmentName;
        private Output<String> roleDefinitionId;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.conditionVersion = defaults.conditionVersion;
    	      this.delegatedManagedIdentityResourceId = defaults.delegatedManagedIdentityResourceId;
    	      this.description = defaults.description;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.roleAssignmentName = defaults.roleAssignmentName;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
        }

        public Builder condition(@Nullable Output<String> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable String condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder conditionVersion(@Nullable Output<String> conditionVersion) {
            this.conditionVersion = conditionVersion;
            return this;
        }
        public Builder conditionVersion(@Nullable String conditionVersion) {
            this.conditionVersion = Codegen.ofNullable(conditionVersion);
            return this;
        }
        public Builder delegatedManagedIdentityResourceId(@Nullable Output<String> delegatedManagedIdentityResourceId) {
            this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
            return this;
        }
        public Builder delegatedManagedIdentityResourceId(@Nullable String delegatedManagedIdentityResourceId) {
            this.delegatedManagedIdentityResourceId = Codegen.ofNullable(delegatedManagedIdentityResourceId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }
        public Builder principalType(@Nullable Output<Either<String,PrincipalType>> principalType) {
            this.principalType = principalType;
            return this;
        }
        public Builder principalType(@Nullable Either<String,PrincipalType> principalType) {
            this.principalType = Codegen.ofNullable(principalType);
            return this;
        }
        public Builder roleAssignmentName(@Nullable Output<String> roleAssignmentName) {
            this.roleAssignmentName = roleAssignmentName;
            return this;
        }
        public Builder roleAssignmentName(@Nullable String roleAssignmentName) {
            this.roleAssignmentName = Codegen.ofNullable(roleAssignmentName);
            return this;
        }
        public Builder roleDefinitionId(Output<String> roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Output.of(Objects.requireNonNull(roleDefinitionId));
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public RoleAssignmentArgs build() {
            return new RoleAssignmentArgs(condition, conditionVersion, delegatedManagedIdentityResourceId, description, principalId, principalType, roleAssignmentName, roleDefinitionId, scope);
        }
    }
}
