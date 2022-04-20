// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.UserIdentityPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity for the resource.
 * 
 */
public final class IdentityPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final IdentityPropertiesResponse Empty = new IdentityPropertiesResponse();

    /**
     * The principal ID of resource identity.
     * 
     */
    @Import(name="principalId")
      private final @Nullable String principalId;

    public Optional<String> principalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> tenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

    public Map<String,UserIdentityPropertiesResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public IdentityPropertiesResponse(
        @Nullable String principalId,
        @Nullable String tenantId,
        @Nullable String type,
        @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityPropertiesResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public IdentityPropertiesResponse build() {
            return new IdentityPropertiesResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
