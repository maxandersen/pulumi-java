// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketRetentionPolicyArgs Empty = new BucketRetentionPolicyArgs();

    /**
     * If set to `true`, the bucket will be [locked](https://cloud.google.com/storage/docs/using-bucket-lock#lock-bucket) and permanently restrict edits to the bucket&#39;s retention policy.  Caution: Locking a bucket is an irreversible action.
     * 
     */
    @Import(name="isLocked")
      private final @Nullable Output<Boolean> isLocked;

    public Output<Boolean> isLocked() {
        return this.isLocked == null ? Codegen.empty() : this.isLocked;
    }

    /**
     * The period of time, in seconds, that objects in the bucket must be retained and cannot be deleted, overwritten, or archived. The value must be less than 2,147,483,647 seconds.
     * 
     */
    @Import(name="retentionPeriod", required=true)
      private final Output<Integer> retentionPeriod;

    public Output<Integer> retentionPeriod() {
        return this.retentionPeriod;
    }

    public BucketRetentionPolicyArgs(
        @Nullable Output<Boolean> isLocked,
        Output<Integer> retentionPeriod) {
        this.isLocked = isLocked;
        this.retentionPeriod = Objects.requireNonNull(retentionPeriod, "expected parameter 'retentionPeriod' to be non-null");
    }

    private BucketRetentionPolicyArgs() {
        this.isLocked = Codegen.empty();
        this.retentionPeriod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isLocked;
        private Output<Integer> retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLocked = defaults.isLocked;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder isLocked(@Nullable Output<Boolean> isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Builder isLocked(@Nullable Boolean isLocked) {
            this.isLocked = Codegen.ofNullable(isLocked);
            return this;
        }
        public Builder retentionPeriod(Output<Integer> retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = Output.of(Objects.requireNonNull(retentionPeriod));
            return this;
        }        public BucketRetentionPolicyArgs build() {
            return new BucketRetentionPolicyArgs(isLocked, retentionPeriod);
        }
    }
}
