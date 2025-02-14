// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The owner of the bucket. This is always the project team&#39;s owner group.
 * 
 */
public final class BucketOwnerArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketOwnerArgs Empty = new BucketOwnerArgs();

    /**
     * The entity, in the form project-owner-projectId.
     * 
     */
    @Import(name="entity")
    private @Nullable Output<String> entity;

    /**
     * @return The entity, in the form project-owner-projectId.
     * 
     */
    public Optional<Output<String>> entity() {
        return Optional.ofNullable(this.entity);
    }

    /**
     * The ID for the entity.
     * 
     */
    @Import(name="entityId")
    private @Nullable Output<String> entityId;

    /**
     * @return The ID for the entity.
     * 
     */
    public Optional<Output<String>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    private BucketOwnerArgs() {}

    private BucketOwnerArgs(BucketOwnerArgs $) {
        this.entity = $.entity;
        this.entityId = $.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketOwnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketOwnerArgs $;

        public Builder() {
            $ = new BucketOwnerArgs();
        }

        public Builder(BucketOwnerArgs defaults) {
            $ = new BucketOwnerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entity The entity, in the form project-owner-projectId.
         * 
         * @return builder
         * 
         */
        public Builder entity(@Nullable Output<String> entity) {
            $.entity = entity;
            return this;
        }

        /**
         * @param entity The entity, in the form project-owner-projectId.
         * 
         * @return builder
         * 
         */
        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param entityId The ID for the entity.
         * 
         * @return builder
         * 
         */
        public Builder entityId(@Nullable Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId The ID for the entity.
         * 
         * @return builder
         * 
         */
        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        public BucketOwnerArgs build() {
            return $;
        }
    }

}
