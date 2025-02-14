// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasLocaleSettingsItemArgs;
import com.pulumi.awsnative.lex.inputs.BotConversationLogSettingsArgs;
import com.pulumi.awsnative.lex.inputs.BotTestBotAliasSettingsSentimentAnalysisSettingsPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuring the test bot alias settings for a given bot
 * 
 */
public final class BotTestBotAliasSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotTestBotAliasSettingsArgs Empty = new BotTestBotAliasSettingsArgs();

    @Import(name="botAliasLocaleSettings")
    private @Nullable Output<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings;

    public Optional<Output<List<BotAliasLocaleSettingsItemArgs>>> botAliasLocaleSettings() {
        return Optional.ofNullable(this.botAliasLocaleSettings);
    }

    @Import(name="conversationLogSettings")
    private @Nullable Output<BotConversationLogSettingsArgs> conversationLogSettings;

    public Optional<Output<BotConversationLogSettingsArgs>> conversationLogSettings() {
        return Optional.ofNullable(this.conversationLogSettings);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    @Import(name="sentimentAnalysisSettings")
    private @Nullable Output<BotTestBotAliasSettingsSentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings;

    /**
     * @return Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
     * 
     */
    public Optional<Output<BotTestBotAliasSettingsSentimentAnalysisSettingsPropertiesArgs>> sentimentAnalysisSettings() {
        return Optional.ofNullable(this.sentimentAnalysisSettings);
    }

    private BotTestBotAliasSettingsArgs() {}

    private BotTestBotAliasSettingsArgs(BotTestBotAliasSettingsArgs $) {
        this.botAliasLocaleSettings = $.botAliasLocaleSettings;
        this.conversationLogSettings = $.conversationLogSettings;
        this.description = $.description;
        this.sentimentAnalysisSettings = $.sentimentAnalysisSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotTestBotAliasSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotTestBotAliasSettingsArgs $;

        public Builder() {
            $ = new BotTestBotAliasSettingsArgs();
        }

        public Builder(BotTestBotAliasSettingsArgs defaults) {
            $ = new BotTestBotAliasSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder botAliasLocaleSettings(@Nullable Output<List<BotAliasLocaleSettingsItemArgs>> botAliasLocaleSettings) {
            $.botAliasLocaleSettings = botAliasLocaleSettings;
            return this;
        }

        public Builder botAliasLocaleSettings(List<BotAliasLocaleSettingsItemArgs> botAliasLocaleSettings) {
            return botAliasLocaleSettings(Output.of(botAliasLocaleSettings));
        }

        public Builder botAliasLocaleSettings(BotAliasLocaleSettingsItemArgs... botAliasLocaleSettings) {
            return botAliasLocaleSettings(List.of(botAliasLocaleSettings));
        }

        public Builder conversationLogSettings(@Nullable Output<BotConversationLogSettingsArgs> conversationLogSettings) {
            $.conversationLogSettings = conversationLogSettings;
            return this;
        }

        public Builder conversationLogSettings(BotConversationLogSettingsArgs conversationLogSettings) {
            return conversationLogSettings(Output.of(conversationLogSettings));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
         * 
         * @return builder
         * 
         */
        public Builder sentimentAnalysisSettings(@Nullable Output<BotTestBotAliasSettingsSentimentAnalysisSettingsPropertiesArgs> sentimentAnalysisSettings) {
            $.sentimentAnalysisSettings = sentimentAnalysisSettings;
            return this;
        }

        /**
         * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
         * 
         * @return builder
         * 
         */
        public Builder sentimentAnalysisSettings(BotTestBotAliasSettingsSentimentAnalysisSettingsPropertiesArgs sentimentAnalysisSettings) {
            return sentimentAnalysisSettings(Output.of(sentimentAnalysisSettings));
        }

        public BotTestBotAliasSettingsArgs build() {
            return $;
        }
    }

}
