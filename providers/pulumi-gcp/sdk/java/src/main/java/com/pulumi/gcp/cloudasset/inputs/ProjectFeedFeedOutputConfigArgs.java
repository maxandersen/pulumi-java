// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudasset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigPubsubDestinationArgs;
import java.util.Objects;


public final class ProjectFeedFeedOutputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectFeedFeedOutputConfigArgs Empty = new ProjectFeedFeedOutputConfigArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubDestination", required=true)
    private Output<ProjectFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination;

    public Output<ProjectFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination() {
        return this.pubsubDestination;
    }

    private ProjectFeedFeedOutputConfigArgs() {}

    private ProjectFeedFeedOutputConfigArgs(ProjectFeedFeedOutputConfigArgs $) {
        this.pubsubDestination = $.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectFeedFeedOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectFeedFeedOutputConfigArgs $;

        public Builder() {
            $ = new ProjectFeedFeedOutputConfigArgs();
        }

        public Builder(ProjectFeedFeedOutputConfigArgs defaults) {
            $ = new ProjectFeedFeedOutputConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder pubsubDestination(Output<ProjectFeedFeedOutputConfigPubsubDestinationArgs> pubsubDestination) {
            $.pubsubDestination = pubsubDestination;
            return this;
        }

        public Builder pubsubDestination(ProjectFeedFeedOutputConfigPubsubDestinationArgs pubsubDestination) {
            return pubsubDestination(Output.of(pubsubDestination));
        }

        public ProjectFeedFeedOutputConfigArgs build() {
            $.pubsubDestination = Objects.requireNonNull($.pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
            return $;
        }
    }

}
