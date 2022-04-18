// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedWorkspacePropsResponse {
    /**
     * ResourceId of the link target of the linked workspace.
     * 
     */
    private final @Nullable String linkedWorkspaceResourceId;
    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
     */
    private final @Nullable String userAssignedIdentityResourceId;

    @CustomType.Constructor
    private LinkedWorkspacePropsResponse(
        @CustomType.Parameter("linkedWorkspaceResourceId") @Nullable String linkedWorkspaceResourceId,
        @CustomType.Parameter("userAssignedIdentityResourceId") @Nullable String userAssignedIdentityResourceId) {
        this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
    }

    /**
     * ResourceId of the link target of the linked workspace.
     * 
    */
    public Optional<String> linkedWorkspaceResourceId() {
        return Optional.ofNullable(this.linkedWorkspaceResourceId);
    }
    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
    */
    public Optional<String> userAssignedIdentityResourceId() {
        return Optional.ofNullable(this.userAssignedIdentityResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedWorkspacePropsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkedWorkspaceResourceId;
        private @Nullable String userAssignedIdentityResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedWorkspacePropsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedWorkspaceResourceId = defaults.linkedWorkspaceResourceId;
    	      this.userAssignedIdentityResourceId = defaults.userAssignedIdentityResourceId;
        }

        public Builder linkedWorkspaceResourceId(@Nullable String linkedWorkspaceResourceId) {
            this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
            return this;
        }
        public Builder userAssignedIdentityResourceId(@Nullable String userAssignedIdentityResourceId) {
            this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
            return this;
        }        public LinkedWorkspacePropsResponse build() {
            return new LinkedWorkspacePropsResponse(linkedWorkspaceResourceId, userAssignedIdentityResourceId);
        }
    }
}
