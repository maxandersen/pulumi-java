// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketObjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketObjectArgs Empty = new GetBucketObjectArgs();

    /**
     * The name of the containing bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable String bucket;

    /**
     * @return The name of the containing bucket.
     * 
     */
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The name of the object.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the object.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetBucketObjectArgs() {}

    private GetBucketObjectArgs(GetBucketObjectArgs $) {
        this.bucket = $.bucket;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketObjectArgs $;

        public Builder() {
            $ = new GetBucketObjectArgs();
        }

        public Builder(GetBucketObjectArgs defaults) {
            $ = new GetBucketObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the containing bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable String bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param name The name of the object.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetBucketObjectArgs build() {
            return $;
        }
    }

}
