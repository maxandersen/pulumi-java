// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubGetArgs;
import java.util.Objects;


public final class ClusterNotificationConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNotificationConfigGetArgs Empty = new ClusterNotificationConfigGetArgs();

    /**
     * The pubsub config for the cluster&#39;s upgrade notifications.
     * 
     */
    @Import(name="pubsub", required=true)
    private Output<ClusterNotificationConfigPubsubGetArgs> pubsub;

    public Output<ClusterNotificationConfigPubsubGetArgs> pubsub() {
        return this.pubsub;
    }

    private ClusterNotificationConfigGetArgs() {}

    private ClusterNotificationConfigGetArgs(ClusterNotificationConfigGetArgs $) {
        this.pubsub = $.pubsub;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNotificationConfigGetArgs $;

        public Builder() {
            $ = new ClusterNotificationConfigGetArgs();
        }

        public Builder(ClusterNotificationConfigGetArgs defaults) {
            $ = new ClusterNotificationConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder pubsub(Output<ClusterNotificationConfigPubsubGetArgs> pubsub) {
            $.pubsub = pubsub;
            return this;
        }

        public Builder pubsub(ClusterNotificationConfigPubsubGetArgs pubsub) {
            return pubsub(Output.of(pubsub));
        }

        public ClusterNotificationConfigGetArgs build() {
            $.pubsub = Objects.requireNonNull($.pubsub, "expected parameter 'pubsub' to be non-null");
            return $;
        }
    }

}
