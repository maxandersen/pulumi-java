// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.IdentityManagementTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesIdentityManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesIdentityManagementArgs Empty = new ResourceTypeRegistrationPropertiesIdentityManagementArgs();

    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId == null ? Codegen.empty() : this.applicationId;
    }

    @Import(name="type")
      private final @Nullable Output<Either<String,IdentityManagementTypes>> type;

    public Output<Either<String,IdentityManagementTypes>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ResourceTypeRegistrationPropertiesIdentityManagementArgs(
        @Nullable Output<String> applicationId,
        @Nullable Output<Either<String,IdentityManagementTypes>> type) {
        this.applicationId = applicationId;
        this.type = type;
    }

    private ResourceTypeRegistrationPropertiesIdentityManagementArgs() {
        this.applicationId = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesIdentityManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<Either<String,IdentityManagementTypes>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesIdentityManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.type = defaults.type;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Codegen.ofNullable(applicationId);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,IdentityManagementTypes>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,IdentityManagementTypes> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ResourceTypeRegistrationPropertiesIdentityManagementArgs build() {
            return new ResourceTypeRegistrationPropertiesIdentityManagementArgs(applicationId, type);
        }
    }
}
