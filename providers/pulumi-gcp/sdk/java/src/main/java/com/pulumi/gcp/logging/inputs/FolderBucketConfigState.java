// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderBucketConfigState extends com.pulumi.resources.ResourceArgs {

    public static final FolderBucketConfigState Empty = new FolderBucketConfigState();

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @Import(name="bucketId")
      private final @Nullable Output<String> bucketId;

    public Output<String> bucketId() {
        return this.bucketId == null ? Codegen.empty() : this.bucketId;
    }

    /**
     * Describes this bucket.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<String> folder;

    public Output<String> folder() {
        return this.folder == null ? Codegen.empty() : this.folder;
    }

    /**
     * The bucket&#39;s lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    @Import(name="lifecycleState")
      private final @Nullable Output<String> lifecycleState;

    public Output<String> lifecycleState() {
        return this.lifecycleState == null ? Codegen.empty() : this.lifecycleState;
    }

    /**
     * The location of the bucket.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the bucket. For example: &#34;folders/my-folder-id/locations/my-location/buckets/my-bucket-id&#34;
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used. Bucket retention can not be increased on buckets outside of projects.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> retentionDays() {
        return this.retentionDays == null ? Codegen.empty() : this.retentionDays;
    }

    public FolderBucketConfigState(
        @Nullable Output<String> bucketId,
        @Nullable Output<String> description,
        @Nullable Output<String> folder,
        @Nullable Output<String> lifecycleState,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<Integer> retentionDays) {
        this.bucketId = bucketId;
        this.description = description;
        this.folder = folder;
        this.lifecycleState = lifecycleState;
        this.location = location;
        this.name = name;
        this.retentionDays = retentionDays;
    }

    private FolderBucketConfigState() {
        this.bucketId = Codegen.empty();
        this.description = Codegen.empty();
        this.folder = Codegen.empty();
        this.lifecycleState = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.retentionDays = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderBucketConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> folder;
        private @Nullable Output<String> lifecycleState;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderBucketConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketId = defaults.bucketId;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder bucketId(@Nullable Output<String> bucketId) {
            this.bucketId = bucketId;
            return this;
        }
        public Builder bucketId(@Nullable String bucketId) {
            this.bucketId = Codegen.ofNullable(bucketId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder folder(@Nullable Output<String> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable String folder) {
            this.folder = Codegen.ofNullable(folder);
            return this;
        }
        public Builder lifecycleState(@Nullable Output<String> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public Builder lifecycleState(@Nullable String lifecycleState) {
            this.lifecycleState = Codegen.ofNullable(lifecycleState);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Codegen.ofNullable(retentionDays);
            return this;
        }        public FolderBucketConfigState build() {
            return new FolderBucketConfigState(bucketId, description, folder, lifecycleState, location, name, retentionDays);
        }
    }
}
