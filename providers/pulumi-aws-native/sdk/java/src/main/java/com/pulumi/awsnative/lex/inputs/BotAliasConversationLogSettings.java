// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasAudioLogSetting;
import com.pulumi.awsnative.lex.inputs.BotAliasTextLogSetting;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasConversationLogSettings extends com.pulumi.resources.InvokeArgs {

    public static final BotAliasConversationLogSettings Empty = new BotAliasConversationLogSettings();

    @Import(name="audioLogSettings")
      private final @Nullable List<BotAliasAudioLogSetting> audioLogSettings;

    public List<BotAliasAudioLogSetting> audioLogSettings() {
        return this.audioLogSettings == null ? List.of() : this.audioLogSettings;
    }

    @Import(name="textLogSettings")
      private final @Nullable List<BotAliasTextLogSetting> textLogSettings;

    public List<BotAliasTextLogSetting> textLogSettings() {
        return this.textLogSettings == null ? List.of() : this.textLogSettings;
    }

    public BotAliasConversationLogSettings(
        @Nullable List<BotAliasAudioLogSetting> audioLogSettings,
        @Nullable List<BotAliasTextLogSetting> textLogSettings) {
        this.audioLogSettings = audioLogSettings;
        this.textLogSettings = textLogSettings;
    }

    private BotAliasConversationLogSettings() {
        this.audioLogSettings = List.of();
        this.textLogSettings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasConversationLogSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BotAliasAudioLogSetting> audioLogSettings;
        private @Nullable List<BotAliasTextLogSetting> textLogSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasConversationLogSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLogSettings = defaults.audioLogSettings;
    	      this.textLogSettings = defaults.textLogSettings;
        }

        public Builder audioLogSettings(@Nullable List<BotAliasAudioLogSetting> audioLogSettings) {
            this.audioLogSettings = audioLogSettings;
            return this;
        }
        public Builder audioLogSettings(BotAliasAudioLogSetting... audioLogSettings) {
            return audioLogSettings(List.of(audioLogSettings));
        }
        public Builder textLogSettings(@Nullable List<BotAliasTextLogSetting> textLogSettings) {
            this.textLogSettings = textLogSettings;
            return this;
        }
        public Builder textLogSettings(BotAliasTextLogSetting... textLogSettings) {
            return textLogSettings(List.of(textLogSettings));
        }        public BotAliasConversationLogSettings build() {
            return new BotAliasConversationLogSettings(audioLogSettings, textLogSettings);
        }
    }
}
