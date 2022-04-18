// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.IntegrationRuntimeEntityReferenceType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The entity reference.
 * 
 */
public final class EntityReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntityReferenceArgs Empty = new EntityReferenceArgs();

    /**
     * The name of this referenced entity.
     * 
     */
    @Import(name="referenceName")
      private final @Nullable Output<String> referenceName;

    public Output<String> referenceName() {
        return this.referenceName == null ? Codegen.empty() : this.referenceName;
    }

    /**
     * The type of this referenced entity.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,IntegrationRuntimeEntityReferenceType>> type;

    public Output<Either<String,IntegrationRuntimeEntityReferenceType>> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public EntityReferenceArgs(
        @Nullable Output<String> referenceName,
        @Nullable Output<Either<String,IntegrationRuntimeEntityReferenceType>> type) {
        this.referenceName = referenceName;
        this.type = type;
    }

    private EntityReferenceArgs() {
        this.referenceName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> referenceName;
        private @Nullable Output<Either<String,IntegrationRuntimeEntityReferenceType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder referenceName(@Nullable Output<String> referenceName) {
            this.referenceName = referenceName;
            return this;
        }
        public Builder referenceName(@Nullable String referenceName) {
            this.referenceName = Codegen.ofNullable(referenceName);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,IntegrationRuntimeEntityReferenceType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,IntegrationRuntimeEntityReferenceType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public EntityReferenceArgs build() {
            return new EntityReferenceArgs(referenceName, type);
        }
    }
}
