// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasAudioLogSettingArgs;
import com.pulumi.awsnative.lex.inputs.BotAliasTextLogSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasConversationLogSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasConversationLogSettingsArgs Empty = new BotAliasConversationLogSettingsArgs();

    @Import(name="audioLogSettings")
    private @Nullable Output<List<BotAliasAudioLogSettingArgs>> audioLogSettings;

    public Optional<Output<List<BotAliasAudioLogSettingArgs>>> audioLogSettings() {
        return Optional.ofNullable(this.audioLogSettings);
    }

    @Import(name="textLogSettings")
    private @Nullable Output<List<BotAliasTextLogSettingArgs>> textLogSettings;

    public Optional<Output<List<BotAliasTextLogSettingArgs>>> textLogSettings() {
        return Optional.ofNullable(this.textLogSettings);
    }

    private BotAliasConversationLogSettingsArgs() {}

    private BotAliasConversationLogSettingsArgs(BotAliasConversationLogSettingsArgs $) {
        this.audioLogSettings = $.audioLogSettings;
        this.textLogSettings = $.textLogSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasConversationLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasConversationLogSettingsArgs $;

        public Builder() {
            $ = new BotAliasConversationLogSettingsArgs();
        }

        public Builder(BotAliasConversationLogSettingsArgs defaults) {
            $ = new BotAliasConversationLogSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder audioLogSettings(@Nullable Output<List<BotAliasAudioLogSettingArgs>> audioLogSettings) {
            $.audioLogSettings = audioLogSettings;
            return this;
        }

        public Builder audioLogSettings(List<BotAliasAudioLogSettingArgs> audioLogSettings) {
            return audioLogSettings(Output.of(audioLogSettings));
        }

        public Builder audioLogSettings(BotAliasAudioLogSettingArgs... audioLogSettings) {
            return audioLogSettings(List.of(audioLogSettings));
        }

        public Builder textLogSettings(@Nullable Output<List<BotAliasTextLogSettingArgs>> textLogSettings) {
            $.textLogSettings = textLogSettings;
            return this;
        }

        public Builder textLogSettings(List<BotAliasTextLogSettingArgs> textLogSettings) {
            return textLogSettings(Output.of(textLogSettings));
        }

        public Builder textLogSettings(BotAliasTextLogSettingArgs... textLogSettings) {
            return textLogSettings(List.of(textLogSettings));
        }

        public BotAliasConversationLogSettingsArgs build() {
            return $;
        }
    }

}
