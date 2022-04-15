// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.UserAssignedIdentityMetaResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceIdentityResponse {
    /**
     * Client ID that is used when authenticating.
     * 
     */
    private final String principalId;
    /**
     * AAD Tenant where this identity lives.
     * 
     */
    private final String tenantId;
    /**
     * Defines values for a ResourceIdentity's type.
     * 
     */
    private final @Nullable String type;
    /**
     * Dictionary of the user assigned identities, key is ARM resource ID of the UAI.
     * 
     */
    private final @Nullable Map<String,UserAssignedIdentityMetaResponse> userAssignedIdentities;

    @CustomType.Constructor
    private ResourceIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,UserAssignedIdentityMetaResponse> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * Client ID that is used when authenticating.
     * 
    */
    public String principalId() {
        return this.principalId;
    }
    /**
     * AAD Tenant where this identity lives.
     * 
    */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * Defines values for a ResourceIdentity's type.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Dictionary of the user assigned identities, key is ARM resource ID of the UAI.
     * 
    */
    public Map<String,UserAssignedIdentityMetaResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,UserAssignedIdentityMetaResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityMetaResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public ResourceIdentityResponse build() {
            return new ResourceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
