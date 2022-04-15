// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.inputs;

import io.pulumi.azurenative.changeanalysis.enums.ManagedIdentityTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The identity block returned by ARM resource that supports managed identity.
 * 
 */
public final class ResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identities.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ManagedIdentityTypes>> type;

    public Output<Either<String,ManagedIdentityTypes>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ResourceIdentityArgs(@Nullable Output<Either<String,ManagedIdentityTypes>> type) {
        this.type = type;
    }

    private ResourceIdentityArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ManagedIdentityTypes>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,ManagedIdentityTypes>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,ManagedIdentityTypes> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(type);
        }
    }
}
