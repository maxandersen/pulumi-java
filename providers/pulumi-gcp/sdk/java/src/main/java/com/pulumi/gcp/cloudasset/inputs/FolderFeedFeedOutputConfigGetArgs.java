// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudasset.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationGetArgs;
import java.util.Objects;


public final class FolderFeedFeedOutputConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderFeedFeedOutputConfigGetArgs Empty = new FolderFeedFeedOutputConfigGetArgs();

    /**
     * Destination on Cloud Pubsub.
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubDestination", required=true)
    private Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

    public Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination() {
        return this.pubsubDestination;
    }

    private FolderFeedFeedOutputConfigGetArgs() {}

    private FolderFeedFeedOutputConfigGetArgs(FolderFeedFeedOutputConfigGetArgs $) {
        this.pubsubDestination = $.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderFeedFeedOutputConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderFeedFeedOutputConfigGetArgs $;

        public Builder() {
            $ = new FolderFeedFeedOutputConfigGetArgs();
        }

        public Builder(FolderFeedFeedOutputConfigGetArgs defaults) {
            $ = new FolderFeedFeedOutputConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder pubsubDestination(Output<FolderFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
            $.pubsubDestination = pubsubDestination;
            return this;
        }

        public Builder pubsubDestination(FolderFeedFeedOutputConfigPubsubDestinationGetArgs pubsubDestination) {
            return pubsubDestination(Output.of(pubsubDestination));
        }

        public FolderFeedFeedOutputConfigGetArgs build() {
            $.pubsubDestination = Objects.requireNonNull($.pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
            return $;
        }
    }

}
