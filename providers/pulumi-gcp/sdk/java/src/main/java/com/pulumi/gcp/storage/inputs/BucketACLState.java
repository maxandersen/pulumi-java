// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketACLState extends com.pulumi.resources.ResourceArgs {

    public static final BucketACLState Empty = new BucketACLState();

    /**
     * The name of the bucket it applies to.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket it applies to.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Configure this ACL to be the default ACL.
     * 
     */
    @Import(name="defaultAcl")
    private @Nullable Output<String> defaultAcl;

    /**
     * @return Configure this ACL to be the default ACL.
     * 
     */
    public Optional<Output<String>> defaultAcl() {
        return Optional.ofNullable(this.defaultAcl);
    }

    /**
     * The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @Import(name="predefinedAcl")
    private @Nullable Output<String> predefinedAcl;

    /**
     * @return The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    public Optional<Output<String>> predefinedAcl() {
        return Optional.ofNullable(this.predefinedAcl);
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    @Import(name="roleEntities")
    private @Nullable Output<List<String>> roleEntities;

    /**
     * @return List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    public Optional<Output<List<String>>> roleEntities() {
        return Optional.ofNullable(this.roleEntities);
    }

    private BucketACLState() {}

    private BucketACLState(BucketACLState $) {
        this.bucket = $.bucket;
        this.defaultAcl = $.defaultAcl;
        this.predefinedAcl = $.predefinedAcl;
        this.roleEntities = $.roleEntities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketACLState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketACLState $;

        public Builder() {
            $ = new BucketACLState();
        }

        public Builder(BucketACLState defaults) {
            $ = new BucketACLState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket it applies to.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket it applies to.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param defaultAcl Configure this ACL to be the default ACL.
         * 
         * @return builder
         * 
         */
        public Builder defaultAcl(@Nullable Output<String> defaultAcl) {
            $.defaultAcl = defaultAcl;
            return this;
        }

        /**
         * @param defaultAcl Configure this ACL to be the default ACL.
         * 
         * @return builder
         * 
         */
        public Builder defaultAcl(String defaultAcl) {
            return defaultAcl(Output.of(defaultAcl));
        }

        /**
         * @param predefinedAcl The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
         * 
         * @return builder
         * 
         */
        public Builder predefinedAcl(@Nullable Output<String> predefinedAcl) {
            $.predefinedAcl = predefinedAcl;
            return this;
        }

        /**
         * @param predefinedAcl The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
         * 
         * @return builder
         * 
         */
        public Builder predefinedAcl(String predefinedAcl) {
            return predefinedAcl(Output.of(predefinedAcl));
        }

        /**
         * @param roleEntities List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
         * 
         * @return builder
         * 
         */
        public Builder roleEntities(@Nullable Output<List<String>> roleEntities) {
            $.roleEntities = roleEntities;
            return this;
        }

        /**
         * @param roleEntities List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
         * 
         * @return builder
         * 
         */
        public Builder roleEntities(List<String> roleEntities) {
            return roleEntities(Output.of(roleEntities));
        }

        /**
         * @param roleEntities List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
         * 
         * @return builder
         * 
         */
        public Builder roleEntities(String... roleEntities) {
            return roleEntities(List.of(roleEntities));
        }

        public BucketACLState build() {
            return $;
        }
    }

}
