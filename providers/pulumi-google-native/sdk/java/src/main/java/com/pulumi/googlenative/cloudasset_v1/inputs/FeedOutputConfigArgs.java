// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudasset_v1.inputs.PubsubDestinationArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output configuration for asset feed destination.
 * 
 */
public final class FeedOutputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeedOutputConfigArgs Empty = new FeedOutputConfigArgs();

    /**
     * Destination on Pub/Sub.
     * 
     */
    @Import(name="pubsubDestination")
    private @Nullable Output<PubsubDestinationArgs> pubsubDestination;

    /**
     * @return Destination on Pub/Sub.
     * 
     */
    public Optional<Output<PubsubDestinationArgs>> pubsubDestination() {
        return Optional.ofNullable(this.pubsubDestination);
    }

    private FeedOutputConfigArgs() {}

    private FeedOutputConfigArgs(FeedOutputConfigArgs $) {
        this.pubsubDestination = $.pubsubDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeedOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeedOutputConfigArgs $;

        public Builder() {
            $ = new FeedOutputConfigArgs();
        }

        public Builder(FeedOutputConfigArgs defaults) {
            $ = new FeedOutputConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pubsubDestination Destination on Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder pubsubDestination(@Nullable Output<PubsubDestinationArgs> pubsubDestination) {
            $.pubsubDestination = pubsubDestination;
            return this;
        }

        /**
         * @param pubsubDestination Destination on Pub/Sub.
         * 
         * @return builder
         * 
         */
        public Builder pubsubDestination(PubsubDestinationArgs pubsubDestination) {
            return pubsubDestination(Output.of(pubsubDestination));
        }

        public FeedOutputConfigArgs build() {
            return $;
        }
    }

}
