// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql.inputs;

import com.pulumi.azurenative.dbformysql.enums.IdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Active Directory identity configuration for a resource.
 * 
 */
public final class ResourceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,IdentityType>> type;

    public Output<Either<String,IdentityType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ResourceIdentityArgs(@Nullable Output<Either<String,IdentityType>> type) {
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
        private @Nullable Output<Either<String,IdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,IdentityType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,IdentityType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(type);
        }
    }
}
