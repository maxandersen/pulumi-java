// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The identity of the EnterprisePolicy.
 * 
 */
public final class EnterprisePolicyIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnterprisePolicyIdentityResponse Empty = new EnterprisePolicyIdentityResponse();

    /**
     * The principal id of EnterprisePolicy identity.
     * 
     */
    @Import(name="systemAssignedIdentityPrincipalId", required=true)
      private final String systemAssignedIdentityPrincipalId;

    public String systemAssignedIdentityPrincipalId() {
        return this.systemAssignedIdentityPrincipalId;
    }

    /**
     * The tenant id associated with the EnterprisePolicy.
     * 
     */
    @Import(name="tenantId", required=true)
      private final String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for the EnterprisePolicy. Currently, the only supported type is &#39;SystemAssigned&#39;, which implicitly creates an identity.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public EnterprisePolicyIdentityResponse(
        String systemAssignedIdentityPrincipalId,
        String tenantId,
        @Nullable String type) {
        this.systemAssignedIdentityPrincipalId = Objects.requireNonNull(systemAssignedIdentityPrincipalId, "expected parameter 'systemAssignedIdentityPrincipalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = type;
    }

    private EnterprisePolicyIdentityResponse() {
        this.systemAssignedIdentityPrincipalId = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterprisePolicyIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String systemAssignedIdentityPrincipalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterprisePolicyIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.systemAssignedIdentityPrincipalId = defaults.systemAssignedIdentityPrincipalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder systemAssignedIdentityPrincipalId(String systemAssignedIdentityPrincipalId) {
            this.systemAssignedIdentityPrincipalId = Objects.requireNonNull(systemAssignedIdentityPrincipalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public EnterprisePolicyIdentityResponse build() {
            return new EnterprisePolicyIdentityResponse(systemAssignedIdentityPrincipalId, tenantId, type);
        }
    }
}
