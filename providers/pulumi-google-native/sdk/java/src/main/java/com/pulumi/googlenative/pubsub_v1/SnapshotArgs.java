// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * See Creating and managing labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return See Creating and managing labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    /**
     * The subscription whose backlog the snapshot retains. Specifically, the created snapshot is guaranteed to retain: (a) The existing backlog on the subscription. More precisely, this is defined as the messages in the subscription&#39;s backlog that are unacknowledged upon the successful completion of the `CreateSnapshot` request; as well as: (b) Any messages published to the subscription&#39;s topic following the successful completion of the CreateSnapshot request. Format is `projects/{project}/subscriptions/{sub}`.
     * 
     */
    @Import(name="subscription", required=true)
    private Output<String> subscription;

    /**
     * @return The subscription whose backlog the snapshot retains. Specifically, the created snapshot is guaranteed to retain: (a) The existing backlog on the subscription. More precisely, this is defined as the messages in the subscription&#39;s backlog that are unacknowledged upon the successful completion of the `CreateSnapshot` request; as well as: (b) Any messages published to the subscription&#39;s topic following the successful completion of the CreateSnapshot request. Format is `projects/{project}/subscriptions/{sub}`.
     * 
     */
    public Output<String> subscription() {
        return this.subscription;
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.labels = $.labels;
        this.project = $.project;
        this.snapshotId = $.snapshotId;
        this.subscription = $.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotArgs $;

        public Builder() {
            $ = new SnapshotArgs();
        }

        public Builder(SnapshotArgs defaults) {
            $ = new SnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels See Creating and managing labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels See Creating and managing labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param subscription The subscription whose backlog the snapshot retains. Specifically, the created snapshot is guaranteed to retain: (a) The existing backlog on the subscription. More precisely, this is defined as the messages in the subscription&#39;s backlog that are unacknowledged upon the successful completion of the `CreateSnapshot` request; as well as: (b) Any messages published to the subscription&#39;s topic following the successful completion of the CreateSnapshot request. Format is `projects/{project}/subscriptions/{sub}`.
         * 
         * @return builder
         * 
         */
        public Builder subscription(Output<String> subscription) {
            $.subscription = subscription;
            return this;
        }

        /**
         * @param subscription The subscription whose backlog the snapshot retains. Specifically, the created snapshot is guaranteed to retain: (a) The existing backlog on the subscription. More precisely, this is defined as the messages in the subscription&#39;s backlog that are unacknowledged upon the successful completion of the `CreateSnapshot` request; as well as: (b) Any messages published to the subscription&#39;s topic following the successful completion of the CreateSnapshot request. Format is `projects/{project}/subscriptions/{sub}`.
         * 
         * @return builder
         * 
         */
        public Builder subscription(String subscription) {
            return subscription(Output.of(subscription));
        }

        public SnapshotArgs build() {
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            $.subscription = Objects.requireNonNull($.subscription, "expected parameter 'subscription' to be non-null");
            return $;
        }
    }

}
