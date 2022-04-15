// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LinkedWorkspace specific properties.
 * 
 */
public final class LinkedWorkspacePropsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedWorkspacePropsArgs Empty = new LinkedWorkspacePropsArgs();

    /**
     * ResourceId of the link target of the linked workspace.
     * 
     */
    @Import(name="linkedWorkspaceResourceId")
      private final @Nullable Output<String> linkedWorkspaceResourceId;

    public Output<String> linkedWorkspaceResourceId() {
        return this.linkedWorkspaceResourceId == null ? Codegen.empty() : this.linkedWorkspaceResourceId;
    }

    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
     */
    @Import(name="userAssignedIdentityResourceId")
      private final @Nullable Output<String> userAssignedIdentityResourceId;

    public Output<String> userAssignedIdentityResourceId() {
        return this.userAssignedIdentityResourceId == null ? Codegen.empty() : this.userAssignedIdentityResourceId;
    }

    public LinkedWorkspacePropsArgs(
        @Nullable Output<String> linkedWorkspaceResourceId,
        @Nullable Output<String> userAssignedIdentityResourceId) {
        this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
    }

    private LinkedWorkspacePropsArgs() {
        this.linkedWorkspaceResourceId = Codegen.empty();
        this.userAssignedIdentityResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedWorkspacePropsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> linkedWorkspaceResourceId;
        private @Nullable Output<String> userAssignedIdentityResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedWorkspacePropsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedWorkspaceResourceId = defaults.linkedWorkspaceResourceId;
    	      this.userAssignedIdentityResourceId = defaults.userAssignedIdentityResourceId;
        }

        public Builder linkedWorkspaceResourceId(@Nullable Output<String> linkedWorkspaceResourceId) {
            this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
            return this;
        }
        public Builder linkedWorkspaceResourceId(@Nullable String linkedWorkspaceResourceId) {
            this.linkedWorkspaceResourceId = Codegen.ofNullable(linkedWorkspaceResourceId);
            return this;
        }
        public Builder userAssignedIdentityResourceId(@Nullable Output<String> userAssignedIdentityResourceId) {
            this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
            return this;
        }
        public Builder userAssignedIdentityResourceId(@Nullable String userAssignedIdentityResourceId) {
            this.userAssignedIdentityResourceId = Codegen.ofNullable(userAssignedIdentityResourceId);
            return this;
        }        public LinkedWorkspacePropsArgs build() {
            return new LinkedWorkspacePropsArgs(linkedWorkspaceResourceId, userAssignedIdentityResourceId);
        }
    }
}
