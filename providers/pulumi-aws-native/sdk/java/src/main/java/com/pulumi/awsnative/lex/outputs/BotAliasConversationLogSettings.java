// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotAliasAudioLogSetting;
import com.pulumi.awsnative.lex.outputs.BotAliasTextLogSetting;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BotAliasConversationLogSettings {
    private final @Nullable List<BotAliasAudioLogSetting> audioLogSettings;
    private final @Nullable List<BotAliasTextLogSetting> textLogSettings;

    @CustomType.Constructor
    private BotAliasConversationLogSettings(
        @CustomType.Parameter("audioLogSettings") @Nullable List<BotAliasAudioLogSetting> audioLogSettings,
        @CustomType.Parameter("textLogSettings") @Nullable List<BotAliasTextLogSetting> textLogSettings) {
        this.audioLogSettings = audioLogSettings;
        this.textLogSettings = textLogSettings;
    }

    public List<BotAliasAudioLogSetting> audioLogSettings() {
        return this.audioLogSettings == null ? List.of() : this.audioLogSettings;
    }
    public List<BotAliasTextLogSetting> textLogSettings() {
        return this.textLogSettings == null ? List.of() : this.textLogSettings;
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
