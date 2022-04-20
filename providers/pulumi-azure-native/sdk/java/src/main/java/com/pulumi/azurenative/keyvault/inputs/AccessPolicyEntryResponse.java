// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.azurenative.keyvault.inputs.PermissionsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An identity that have access to the key vault. All identities in the array must use the same tenant ID as the key vault&#39;s tenant ID.
 * 
 */
public final class AccessPolicyEntryResponse extends com.pulumi.resources.InvokeArgs {

    public static final AccessPolicyEntryResponse Empty = new AccessPolicyEntryResponse();

    /**
     *  Application ID of the client making request on behalf of a principal
     * 
     */
    @Import(name="applicationId")
      private final @Nullable String applicationId;

    public Optional<String> applicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    /**
     * The object ID of a user, service principal or security group in the Azure Active Directory tenant for the vault. The object ID must be unique for the list of access policies.
     * 
     */
    @Import(name="objectId", required=true)
      private final String objectId;

    public String objectId() {
        return this.objectId;
    }

    /**
     * Permissions the identity has for keys, secrets and certificates.
     * 
     */
    @Import(name="permissions", required=true)
      private final PermissionsResponse permissions;

    public PermissionsResponse permissions() {
        return this.permissions;
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    @Import(name="tenantId", required=true)
      private final String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    public AccessPolicyEntryResponse(
        @Nullable String applicationId,
        String objectId,
        PermissionsResponse permissions,
        String tenantId) {
        this.applicationId = applicationId;
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AccessPolicyEntryResponse() {
        this.applicationId = null;
        this.objectId = null;
        this.permissions = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private String objectId;
        private PermissionsResponse permissions;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.objectId = defaults.objectId;
    	      this.permissions = defaults.permissions;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder permissions(PermissionsResponse permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public AccessPolicyEntryResponse build() {
            return new AccessPolicyEntryResponse(applicationId, objectId, permissions, tenantId);
        }
    }
}
