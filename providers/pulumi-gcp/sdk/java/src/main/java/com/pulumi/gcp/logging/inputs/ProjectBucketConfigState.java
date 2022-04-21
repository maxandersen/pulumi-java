// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectBucketConfigState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectBucketConfigState Empty = new ProjectBucketConfigState();

    /**
     * The name of the logging bucket. Logging automatically creates two log buckets: `_Required` and `_Default`.
     * 
     */
    @Import(name="bucketId")
    private @Nullable Output<String> bucketId;

    public Optional<Output<String>> bucketId() {
        return Optional.ofNullable(this.bucketId);
    }

    /**
     * Describes this bucket.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The bucket&#39;s lifecycle such as active or deleted. See [LifecycleState](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.buckets#LogBucket.LifecycleState).
     * 
     */
    @Import(name="lifecycleState")
    private @Nullable Output<String> lifecycleState;

    public Optional<Output<String>> lifecycleState() {
        return Optional.ofNullable(this.lifecycleState);
    }

    /**
     * The location of the bucket.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the bucket. For example: &#34;projects/my-project-id/locations/my-location/buckets/my-bucket-id&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parent resource that contains the logging bucket.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at bucket creation time, the default time of 30 days will be used.
     * 
     */
    @Import(name="retentionDays")
    private @Nullable Output<Integer> retentionDays;

    public Optional<Output<Integer>> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    private ProjectBucketConfigState() {}

    private ProjectBucketConfigState(ProjectBucketConfigState $) {
        this.bucketId = $.bucketId;
        this.description = $.description;
        this.lifecycleState = $.lifecycleState;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.retentionDays = $.retentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectBucketConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectBucketConfigState $;

        public Builder() {
            $ = new ProjectBucketConfigState();
        }

        public Builder(ProjectBucketConfigState defaults) {
            $ = new ProjectBucketConfigState(Objects.requireNonNull(defaults));
        }

        public Builder bucketId(@Nullable Output<String> bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        public Builder bucketId(String bucketId) {
            return bucketId(Output.of(bucketId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder lifecycleState(@Nullable Output<String> lifecycleState) {
            $.lifecycleState = lifecycleState;
            return this;
        }

        public Builder lifecycleState(String lifecycleState) {
            return lifecycleState(Output.of(lifecycleState));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            $.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(Integer retentionDays) {
            return retentionDays(Output.of(retentionDays));
        }

        public ProjectBucketConfigState build() {
            return $;
        }
    }

}
