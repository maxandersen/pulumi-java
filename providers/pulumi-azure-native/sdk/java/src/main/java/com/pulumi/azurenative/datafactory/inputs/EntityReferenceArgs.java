// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.IntegrationRuntimeEntityReferenceType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The entity reference.
 * 
 */
public final class EntityReferenceArgs extends ResourceArgs {

    public static final EntityReferenceArgs Empty = new EntityReferenceArgs();

    /**
     * The name of this referenced entity.
     * 
     */
    @Import(name="referenceName")
    private @Nullable Output<String> referenceName;

    /**
     * @return The name of this referenced entity.
     * 
     */
    public Optional<Output<String>> referenceName() {
        return Optional.ofNullable(this.referenceName);
    }

    /**
     * The type of this referenced entity.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,IntegrationRuntimeEntityReferenceType>> type;

    /**
     * @return The type of this referenced entity.
     * 
     */
    public Optional<Output<Either<String,IntegrationRuntimeEntityReferenceType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private EntityReferenceArgs() {}

    private EntityReferenceArgs(EntityReferenceArgs $) {
        this.referenceName = $.referenceName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityReferenceArgs $;

        public Builder() {
            $ = new EntityReferenceArgs();
        }

        public Builder(EntityReferenceArgs defaults) {
            $ = new EntityReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param referenceName The name of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder referenceName(@Nullable Output<String> referenceName) {
            $.referenceName = referenceName;
            return this;
        }

        /**
         * @param referenceName The name of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder referenceName(String referenceName) {
            return referenceName(Output.of(referenceName));
        }

        /**
         * @param type The type of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,IntegrationRuntimeEntityReferenceType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,IntegrationRuntimeEntityReferenceType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder type(IntegrationRuntimeEntityReferenceType type) {
            return type(Either.ofRight(type));
        }

        public EntityReferenceArgs build() {
            return $;
        }
    }

}
