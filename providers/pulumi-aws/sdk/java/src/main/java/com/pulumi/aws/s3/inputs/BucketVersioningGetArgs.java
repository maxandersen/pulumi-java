// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketVersioningGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketVersioningGetArgs Empty = new BucketVersioningGetArgs();

    /**
     * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    @Import(name="mfaDelete")
    private @Nullable Output<Boolean> mfaDelete;

    public Optional<Output<Boolean>> mfaDelete() {
        return Optional.ofNullable(this.mfaDelete);
    }

    private BucketVersioningGetArgs() {}

    private BucketVersioningGetArgs(BucketVersioningGetArgs $) {
        this.enabled = $.enabled;
        this.mfaDelete = $.mfaDelete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketVersioningGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketVersioningGetArgs $;

        public Builder() {
            $ = new BucketVersioningGetArgs();
        }

        public Builder(BucketVersioningGetArgs defaults) {
            $ = new BucketVersioningGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder mfaDelete(@Nullable Output<Boolean> mfaDelete) {
            $.mfaDelete = mfaDelete;
            return this;
        }

        public Builder mfaDelete(Boolean mfaDelete) {
            return mfaDelete(Output.of(mfaDelete));
        }

        public BucketVersioningGetArgs build() {
            return $;
        }
    }

}
