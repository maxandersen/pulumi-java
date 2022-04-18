// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketVersioningGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketVersioningGetArgs Empty = new BucketVersioningGetArgs();

    /**
     * Enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`. This cannot be used to toggle this setting but is available to allow managed buckets to reflect the state in AWS
     * 
     */
    @Import(name="mfaDelete")
      private final @Nullable Output<Boolean> mfaDelete;

    public Output<Boolean> mfaDelete() {
        return this.mfaDelete == null ? Codegen.empty() : this.mfaDelete;
    }

    public BucketVersioningGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Boolean> mfaDelete) {
        this.enabled = enabled;
        this.mfaDelete = mfaDelete;
    }

    private BucketVersioningGetArgs() {
        this.enabled = Codegen.empty();
        this.mfaDelete = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioningGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Boolean> mfaDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketVersioningGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.mfaDelete = defaults.mfaDelete;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder mfaDelete(@Nullable Output<Boolean> mfaDelete) {
            this.mfaDelete = mfaDelete;
            return this;
        }
        public Builder mfaDelete(@Nullable Boolean mfaDelete) {
            this.mfaDelete = Codegen.ofNullable(mfaDelete);
            return this;
        }        public BucketVersioningGetArgs build() {
            return new BucketVersioningGetArgs(enabled, mfaDelete);
        }
    }
}
