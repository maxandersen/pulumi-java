// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleAssignmentArgs Empty = new GetRoleAssignmentArgs();

    /**
     * The name of the role assignment. It can be any valid GUID.
     * 
     */
    @Import(name="roleAssignmentName", required=true)
      private final String roleAssignmentName;

    public String roleAssignmentName() {
        return this.roleAssignmentName;
    }

    /**
     * The scope of the operation or resource. Valid scopes are: subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    @Import(name="scope", required=true)
      private final String scope;

    public String scope() {
        return this.scope;
    }

    /**
     * Tenant ID for cross-tenant request
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public GetRoleAssignmentArgs(
        String roleAssignmentName,
        String scope,
        @Nullable String tenantId) {
        this.roleAssignmentName = Objects.requireNonNull(roleAssignmentName, "expected parameter 'roleAssignmentName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tenantId = tenantId;
    }

    private GetRoleAssignmentArgs() {
        this.roleAssignmentName = null;
        this.scope = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleAssignmentName;
        private String scope;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleAssignmentName = defaults.roleAssignmentName;
    	      this.scope = defaults.scope;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder roleAssignmentName(String roleAssignmentName) {
            this.roleAssignmentName = Objects.requireNonNull(roleAssignmentName);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public GetRoleAssignmentArgs build() {
            return new GetRoleAssignmentArgs(roleAssignmentName, scope, tenantId);
        }
    }
}
