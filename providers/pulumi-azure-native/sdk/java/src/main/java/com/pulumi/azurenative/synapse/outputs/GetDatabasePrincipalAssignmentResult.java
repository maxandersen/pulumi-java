// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabasePrincipalAssignmentResult {
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
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    private final String principalId;
    /**
     * The principal name
     * 
     */
    private final String principalName;
    /**
     * Principal type.
     * 
     */
    private final String principalType;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Database principal role.
     * 
     */
    private final String role;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tenant id of the principal
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The tenant name of the principal
     * 
     */
    private final String tenantName;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDatabasePrincipalAssignmentResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("principalName") String principalName,
        @CustomType.Parameter("principalType") String principalType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("tenantName") String tenantName,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.principalId = principalId;
        this.principalName = principalName;
        this.principalType = principalType;
        this.provisioningState = provisioningState;
        this.role = role;
        this.systemData = systemData;
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.type = type;
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
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
    */
    public String principalId() {
        return this.principalId;
    }
    /**
     * The principal name
     * 
    */
    public String principalName() {
        return this.principalName;
    }
    /**
     * Principal type.
     * 
    */
    public String principalType() {
        return this.principalType;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Database principal role.
     * 
    */
    public String role() {
        return this.role;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The tenant id of the principal
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The tenant name of the principal
     * 
    */
    public String tenantName() {
        return this.tenantName;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePrincipalAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String principalId;
        private String principalName;
        private String principalType;
        private String provisioningState;
        private String role;
        private SystemDataResponse systemData;
        private @Nullable String tenantId;
        private String tenantName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabasePrincipalAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.role = defaults.role;
    	      this.systemData = defaults.systemData;
    	      this.tenantId = defaults.tenantId;
    	      this.tenantName = defaults.tenantName;
    	      this.type = defaults.type;
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
        public Builder principalName(String principalName) {
            this.principalName = Objects.requireNonNull(principalName);
            return this;
        }
        public Builder principalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantName(String tenantName) {
            this.tenantName = Objects.requireNonNull(tenantName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDatabasePrincipalAssignmentResult build() {
            return new GetDatabasePrincipalAssignmentResult(id, name, principalId, principalName, principalType, provisioningState, role, systemData, tenantId, tenantName, type);
        }
    }
}
