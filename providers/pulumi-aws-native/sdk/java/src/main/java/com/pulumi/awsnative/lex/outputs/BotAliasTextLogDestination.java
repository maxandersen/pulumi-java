// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotAliasCloudWatchLogGroupLogDestination;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BotAliasTextLogDestination {
    private final BotAliasCloudWatchLogGroupLogDestination cloudWatch;

    @CustomType.Constructor
    private BotAliasTextLogDestination(@CustomType.Parameter("cloudWatch") BotAliasCloudWatchLogGroupLogDestination cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    public BotAliasCloudWatchLogGroupLogDestination cloudWatch() {
        return this.cloudWatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasCloudWatchLogGroupLogDestination cloudWatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatch = defaults.cloudWatch;
        }

        public Builder cloudWatch(BotAliasCloudWatchLogGroupLogDestination cloudWatch) {
            this.cloudWatch = Objects.requireNonNull(cloudWatch);
            return this;
        }        public BotAliasTextLogDestination build() {
            return new BotAliasTextLogDestination(cloudWatch);
        }
    }
}
