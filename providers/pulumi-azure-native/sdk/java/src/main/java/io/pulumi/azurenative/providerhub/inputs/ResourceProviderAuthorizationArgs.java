// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceProviderAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceProviderAuthorizationArgs Empty = new ResourceProviderAuthorizationArgs();

    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId == null ? Codegen.empty() : this.applicationId;
    }

    @Import(name="managedByRoleDefinitionId")
      private final @Nullable Output<String> managedByRoleDefinitionId;

    public Output<String> managedByRoleDefinitionId() {
        return this.managedByRoleDefinitionId == null ? Codegen.empty() : this.managedByRoleDefinitionId;
    }

    @Import(name="roleDefinitionId")
      private final @Nullable Output<String> roleDefinitionId;

    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId == null ? Codegen.empty() : this.roleDefinitionId;
    }

    public ResourceProviderAuthorizationArgs(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> managedByRoleDefinitionId,
        @Nullable Output<String> roleDefinitionId) {
        this.applicationId = applicationId;
        this.managedByRoleDefinitionId = managedByRoleDefinitionId;
        this.roleDefinitionId = roleDefinitionId;
    }

    private ResourceProviderAuthorizationArgs() {
        this.applicationId = Codegen.empty();
        this.managedByRoleDefinitionId = Codegen.empty();
        this.roleDefinitionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> managedByRoleDefinitionId;
        private @Nullable Output<String> roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.managedByRoleDefinitionId = defaults.managedByRoleDefinitionId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Codegen.ofNullable(applicationId);
            return this;
        }
        public Builder managedByRoleDefinitionId(@Nullable Output<String> managedByRoleDefinitionId) {
            this.managedByRoleDefinitionId = managedByRoleDefinitionId;
            return this;
        }
        public Builder managedByRoleDefinitionId(@Nullable String managedByRoleDefinitionId) {
            this.managedByRoleDefinitionId = Codegen.ofNullable(managedByRoleDefinitionId);
            return this;
        }
        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }
        public Builder roleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = Codegen.ofNullable(roleDefinitionId);
            return this;
        }        public ResourceProviderAuthorizationArgs build() {
            return new ResourceProviderAuthorizationArgs(applicationId, managedByRoleDefinitionId, roleDefinitionId);
        }
    }
}
