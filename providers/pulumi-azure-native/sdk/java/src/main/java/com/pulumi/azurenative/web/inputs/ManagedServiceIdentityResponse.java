// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ManagedServiceIdentityResponseUserAssignedIdentities;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed service identity.
 * 
 */
public final class ManagedServiceIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponse Empty = new ManagedServiceIdentityResponse();

    /**
     * Principal Id of managed service identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * Tenant of managed service identity.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Type of managed service identity.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    public Optional<Map<String,ManagedServiceIdentityResponseUserAssignedIdentities>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ManagedServiceIdentityResponse() {}

    private ManagedServiceIdentityResponse(ManagedServiceIdentityResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedServiceIdentityResponse $;

        public Builder() {
            $ = new ManagedServiceIdentityResponse();
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
            $ = new ManagedServiceIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public ManagedServiceIdentityResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
