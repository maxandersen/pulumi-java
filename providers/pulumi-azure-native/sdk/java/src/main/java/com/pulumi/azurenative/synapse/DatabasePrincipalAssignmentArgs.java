// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.synapse.enums.DatabasePrincipalRole;
import com.pulumi.azurenative.synapse.enums.PrincipalType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabasePrincipalAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePrincipalAssignmentArgs Empty = new DatabasePrincipalAssignmentArgs();

    /**
     * The name of the database in the Kusto pool.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
      private final Output<String> kustoPoolName;

    public Output<String> kustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the Kusto principalAssignment.
     * 
     */
    @Import(name="principalAssignmentName")
      private final @Nullable Output<String> principalAssignmentName;

    public Output<String> principalAssignmentName() {
        return this.principalAssignmentName == null ? Codegen.empty() : this.principalAssignmentName;
    }

    /**
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * Principal type.
     * 
     */
    @Import(name="principalType", required=true)
      private final Output<Either<String,PrincipalType>> principalType;

    public Output<Either<String,PrincipalType>> principalType() {
        return this.principalType;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Database principal role.
     * 
     */
    @Import(name="role", required=true)
      private final Output<Either<String,DatabasePrincipalRole>> role;

    public Output<Either<String,DatabasePrincipalRole>> role() {
        return this.role;
    }

    /**
     * The tenant id of the principal
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public DatabasePrincipalAssignmentArgs(
        Output<String> databaseName,
        Output<String> kustoPoolName,
        @Nullable Output<String> principalAssignmentName,
        Output<String> principalId,
        Output<Either<String,PrincipalType>> principalType,
        Output<String> resourceGroupName,
        Output<Either<String,DatabasePrincipalRole>> role,
        @Nullable Output<String> tenantId,
        Output<String> workspaceName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.principalAssignmentName = principalAssignmentName;
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tenantId = tenantId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DatabasePrincipalAssignmentArgs() {
        this.databaseName = Codegen.empty();
        this.kustoPoolName = Codegen.empty();
        this.principalAssignmentName = Codegen.empty();
        this.principalId = Codegen.empty();
        this.principalType = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.role = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabasePrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseName;
        private Output<String> kustoPoolName;
        private @Nullable Output<String> principalAssignmentName;
        private Output<String> principalId;
        private Output<Either<String,PrincipalType>> principalType;
        private Output<String> resourceGroupName;
        private Output<Either<String,DatabasePrincipalRole>> role;
        private @Nullable Output<String> tenantId;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabasePrincipalAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.principalAssignmentName = defaults.principalAssignmentName;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.role = defaults.role;
    	      this.tenantId = defaults.tenantId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder kustoPoolName(Output<String> kustoPoolName) {
            this.kustoPoolName = Objects.requireNonNull(kustoPoolName);
            return this;
        }
        public Builder kustoPoolName(String kustoPoolName) {
            this.kustoPoolName = Output.of(Objects.requireNonNull(kustoPoolName));
            return this;
        }
        public Builder principalAssignmentName(@Nullable Output<String> principalAssignmentName) {
            this.principalAssignmentName = principalAssignmentName;
            return this;
        }
        public Builder principalAssignmentName(@Nullable String principalAssignmentName) {
            this.principalAssignmentName = Codegen.ofNullable(principalAssignmentName);
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
        public Builder principalType(Output<Either<String,PrincipalType>> principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public Builder principalType(Either<String,PrincipalType> principalType) {
            this.principalType = Output.of(Objects.requireNonNull(principalType));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder role(Output<Either<String,DatabasePrincipalRole>> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(Either<String,DatabasePrincipalRole> role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public DatabasePrincipalAssignmentArgs build() {
            return new DatabasePrincipalAssignmentArgs(databaseName, kustoPoolName, principalAssignmentName, principalId, principalType, resourceGroupName, role, tenantId, workspaceName);
        }
    }
}
