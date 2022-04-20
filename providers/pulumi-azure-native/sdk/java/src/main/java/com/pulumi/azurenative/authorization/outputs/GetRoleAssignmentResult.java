// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRoleAssignmentResult {
    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase &#39;foo_storage_container&#39;
     * 
     */
    private final @Nullable String condition;
    /**
     * Version of the condition. Currently accepted value is &#39;2.0&#39;
     * 
     */
    private final @Nullable String conditionVersion;
    /**
     * Id of the user who created the assignment
     * 
     */
    private final String createdBy;
    /**
     * Time it was created
     * 
     */
    private final String createdOn;
    /**
     * Id of the delegated managed identity resource
     * 
     */
    private final @Nullable String delegatedManagedIdentityResourceId;
    /**
     * Description of role assignment
     * 
     */
    private final @Nullable String description;
    /**
     * The role assignment ID.
     * 
     */
    private final String id;
    /**
     * The role assignment name.
     * 
     */
    private final String name;
    /**
     * The principal ID.
     * 
     */
    private final String principalId;
    /**
     * The principal type of the assigned principal ID.
     * 
     */
    private final @Nullable String principalType;
    /**
     * The role definition ID.
     * 
     */
    private final String roleDefinitionId;
    /**
     * The role assignment scope.
     * 
     */
    private final String scope;
    /**
     * The role assignment type.
     * 
     */
    private final String type;
    /**
     * Id of the user who updated the assignment
     * 
     */
    private final String updatedBy;
    /**
     * Time it was updated
     * 
     */
    private final String updatedOn;

    @CustomType.Constructor
    private GetRoleAssignmentResult(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("conditionVersion") @Nullable String conditionVersion,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("createdOn") String createdOn,
        @CustomType.Parameter("delegatedManagedIdentityResourceId") @Nullable String delegatedManagedIdentityResourceId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("principalType") @Nullable String principalType,
        @CustomType.Parameter("roleDefinitionId") String roleDefinitionId,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedBy") String updatedBy,
        @CustomType.Parameter("updatedOn") String updatedOn) {
        this.condition = condition;
        this.conditionVersion = conditionVersion;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
        this.description = description;
        this.id = id;
        this.name = name;
        this.principalId = principalId;
        this.principalType = principalType;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
        this.type = type;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase &#39;foo_storage_container&#39;
     * 
    */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * Version of the condition. Currently accepted value is &#39;2.0&#39;
     * 
    */
    public Optional<String> conditionVersion() {
        return Optional.ofNullable(this.conditionVersion);
    }
    /**
     * Id of the user who created the assignment
     * 
    */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * Time it was created
     * 
    */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * Id of the delegated managed identity resource
     * 
    */
    public Optional<String> delegatedManagedIdentityResourceId() {
        return Optional.ofNullable(this.delegatedManagedIdentityResourceId);
    }
    /**
     * Description of role assignment
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The role assignment ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The role assignment name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The principal ID.
     * 
    */
    public String principalId() {
        return this.principalId;
    }
    /**
     * The principal type of the assigned principal ID.
     * 
    */
    public Optional<String> principalType() {
        return Optional.ofNullable(this.principalType);
    }
    /**
     * The role definition ID.
     * 
    */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The role assignment scope.
     * 
    */
    public String scope() {
        return this.scope;
    }
    /**
     * The role assignment type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Id of the user who updated the assignment
     * 
    */
    public String updatedBy() {
        return this.updatedBy;
    }
    /**
     * Time it was updated
     * 
    */
    public String updatedOn() {
        return this.updatedOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private @Nullable String conditionVersion;
        private String createdBy;
        private String createdOn;
        private @Nullable String delegatedManagedIdentityResourceId;
        private @Nullable String description;
        private String id;
        private String name;
        private String principalId;
        private @Nullable String principalType;
        private String roleDefinitionId;
        private String scope;
        private String type;
        private String updatedBy;
        private String updatedOn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.conditionVersion = defaults.conditionVersion;
    	      this.createdBy = defaults.createdBy;
    	      this.createdOn = defaults.createdOn;
    	      this.delegatedManagedIdentityResourceId = defaults.delegatedManagedIdentityResourceId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedOn = defaults.updatedOn;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder conditionVersion(@Nullable String conditionVersion) {
            this.conditionVersion = conditionVersion;
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        public Builder delegatedManagedIdentityResourceId(@Nullable String delegatedManagedIdentityResourceId) {
            this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
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
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalType(@Nullable String principalType) {
            this.principalType = principalType;
            return this;
        }
        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }
        public Builder updatedOn(String updatedOn) {
            this.updatedOn = Objects.requireNonNull(updatedOn);
            return this;
        }        public GetRoleAssignmentResult build() {
            return new GetRoleAssignmentResult(condition, conditionVersion, createdBy, createdOn, delegatedManagedIdentityResourceId, description, id, name, principalId, principalType, roleDefinitionId, scope, type, updatedBy, updatedOn);
        }
    }
}
