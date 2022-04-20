// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.inputs.BatchPoolIdentityResponseUserAssignedIdentities;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The identity of the Batch pool, if configured. If the pool identity is updated during update an existing pool, only the new vms which are created after the pool shrinks to 0 will have the updated identities
 * 
 */
public final class BatchPoolIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final BatchPoolIdentityResponse Empty = new BatchPoolIdentityResponse();

    /**
     * The type of identity used for the Batch Pool.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The list of user identities associated with the Batch pool. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    public Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public BatchPoolIdentityResponse(
        String type,
        @Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private BatchPoolIdentityResponse() {
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchPoolIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchPoolIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,BatchPoolIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public BatchPoolIdentityResponse build() {
            return new BatchPoolIdentityResponse(type, userAssignedIdentities);
        }
    }
}
