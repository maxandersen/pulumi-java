// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasCloudWatchLogGroupLogDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
 * 
 */
public final class BotAliasTextLogDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasTextLogDestinationArgs Empty = new BotAliasTextLogDestinationArgs();

    @Import(name="cloudWatch", required=true)
    private Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch;

    public Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch() {
        return this.cloudWatch;
    }

    private BotAliasTextLogDestinationArgs() {}

    private BotAliasTextLogDestinationArgs(BotAliasTextLogDestinationArgs $) {
        this.cloudWatch = $.cloudWatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasTextLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasTextLogDestinationArgs $;

        public Builder() {
            $ = new BotAliasTextLogDestinationArgs();
        }

        public Builder(BotAliasTextLogDestinationArgs defaults) {
            $ = new BotAliasTextLogDestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudWatch(Output<BotAliasCloudWatchLogGroupLogDestinationArgs> cloudWatch) {
            $.cloudWatch = cloudWatch;
            return this;
        }

        public Builder cloudWatch(BotAliasCloudWatchLogGroupLogDestinationArgs cloudWatch) {
            return cloudWatch(Output.of(cloudWatch));
        }

        public BotAliasTextLogDestinationArgs build() {
            $.cloudWatch = Objects.requireNonNull($.cloudWatch, "expected parameter 'cloudWatch' to be non-null");
            return $;
        }
    }

}
