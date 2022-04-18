// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasAudioLogDestination;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings for logging audio of conversations between Amazon Lex and a user. You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
 * 
 */
public final class BotAliasAudioLogSetting extends com.pulumi.resources.InvokeArgs {

    public static final BotAliasAudioLogSetting Empty = new BotAliasAudioLogSetting();

    @Import(name="destination", required=true)
      private final BotAliasAudioLogDestination destination;

    public BotAliasAudioLogDestination destination() {
        return this.destination;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    public BotAliasAudioLogSetting(
        BotAliasAudioLogDestination destination,
        Boolean enabled) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private BotAliasAudioLogSetting() {
        this.destination = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasAudioLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasAudioLogDestination destination;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasAudioLogSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder destination(BotAliasAudioLogDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public BotAliasAudioLogSetting build() {
            return new BotAliasAudioLogSetting(destination, enabled);
        }
    }
}
