// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A session context that is activated when an intent is fulfilled.
 * 
 */
public final class BotOutputContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotOutputContextArgs Empty = new BotOutputContextArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="timeToLiveInSeconds", required=true)
    private Output<Integer> timeToLiveInSeconds;

    public Output<Integer> timeToLiveInSeconds() {
        return this.timeToLiveInSeconds;
    }

    @Import(name="turnsToLive", required=true)
    private Output<Integer> turnsToLive;

    public Output<Integer> turnsToLive() {
        return this.turnsToLive;
    }

    private BotOutputContextArgs() {}

    private BotOutputContextArgs(BotOutputContextArgs $) {
        this.name = $.name;
        this.timeToLiveInSeconds = $.timeToLiveInSeconds;
        this.turnsToLive = $.turnsToLive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotOutputContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotOutputContextArgs $;

        public Builder() {
            $ = new BotOutputContextArgs();
        }

        public Builder(BotOutputContextArgs defaults) {
            $ = new BotOutputContextArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder timeToLiveInSeconds(Output<Integer> timeToLiveInSeconds) {
            $.timeToLiveInSeconds = timeToLiveInSeconds;
            return this;
        }

        public Builder timeToLiveInSeconds(Integer timeToLiveInSeconds) {
            return timeToLiveInSeconds(Output.of(timeToLiveInSeconds));
        }

        public Builder turnsToLive(Output<Integer> turnsToLive) {
            $.turnsToLive = turnsToLive;
            return this;
        }

        public Builder turnsToLive(Integer turnsToLive) {
            return turnsToLive(Output.of(turnsToLive));
        }

        public BotOutputContextArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.timeToLiveInSeconds = Objects.requireNonNull($.timeToLiveInSeconds, "expected parameter 'timeToLiveInSeconds' to be non-null");
            $.turnsToLive = Objects.requireNonNull($.turnsToLive, "expected parameter 'turnsToLive' to be non-null");
            return $;
        }
    }

}
