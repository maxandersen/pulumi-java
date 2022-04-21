// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketACLArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketACLArgs Empty = new BucketACLArgs();

    /**
     * The name of the bucket it applies to.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Configure this ACL to be the default ACL.
     * 
     */
    @Import(name="defaultAcl")
    private @Nullable Output<String> defaultAcl;

    public Optional<Output<String>> defaultAcl() {
        return Optional.ofNullable(this.defaultAcl);
    }

    /**
     * The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @Import(name="predefinedAcl")
    private @Nullable Output<String> predefinedAcl;

    public Optional<Output<String>> predefinedAcl() {
        return Optional.ofNullable(this.predefinedAcl);
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    @Import(name="roleEntities")
    private @Nullable Output<List<String>> roleEntities;

    public Optional<Output<List<String>>> roleEntities() {
        return Optional.ofNullable(this.roleEntities);
    }

    private BucketACLArgs() {}

    private BucketACLArgs(BucketACLArgs $) {
        this.bucket = $.bucket;
        this.defaultAcl = $.defaultAcl;
        this.predefinedAcl = $.predefinedAcl;
        this.roleEntities = $.roleEntities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketACLArgs $;

        public Builder() {
            $ = new BucketACLArgs();
        }

        public Builder(BucketACLArgs defaults) {
            $ = new BucketACLArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder defaultAcl(@Nullable Output<String> defaultAcl) {
            $.defaultAcl = defaultAcl;
            return this;
        }

        public Builder defaultAcl(String defaultAcl) {
            return defaultAcl(Output.of(defaultAcl));
        }

        public Builder predefinedAcl(@Nullable Output<String> predefinedAcl) {
            $.predefinedAcl = predefinedAcl;
            return this;
        }

        public Builder predefinedAcl(String predefinedAcl) {
            return predefinedAcl(Output.of(predefinedAcl));
        }

        public Builder roleEntities(@Nullable Output<List<String>> roleEntities) {
            $.roleEntities = roleEntities;
            return this;
        }

        public Builder roleEntities(List<String> roleEntities) {
            return roleEntities(Output.of(roleEntities));
        }

        public Builder roleEntities(String... roleEntities) {
            return roleEntities(List.of(roleEntities));
        }

        public BucketACLArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
