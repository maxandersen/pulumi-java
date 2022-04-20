// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lex.BotArgs;
import com.pulumi.aws.lex.inputs.BotState;
import com.pulumi.aws.lex.outputs.BotAbortStatement;
import com.pulumi.aws.lex.outputs.BotClarificationPrompt;
import com.pulumi.aws.lex.outputs.BotIntent;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Lex Bot resource. For more information see
 * [Amazon Lex: How It Works](https://docs.aws.amazon.com/lex/latest/dg/how-it-works.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Bots can be imported using their name.
 * 
 * ```sh
 *  $ pulumi import aws:lex/bot:Bot order_flowers_bot OrderFlowers
 * ```
 * 
 */
@ResourceType(type="aws:lex/bot:Bot")
public class Bot extends com.pulumi.resources.CustomResource {
    /**
     * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * 
     */
    @Export(name="abortStatement", type=BotAbortStatement.class, parameters={})
    private Output<BotAbortStatement> abortStatement;

    /**
     * @return The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * 
     */
    public Output<BotAbortStatement> abortStatement() {
        return this.abortStatement;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Checksum identifying the version of the bot that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the bot.
     * 
     */
    @Export(name="checksum", type=String.class, parameters={})
    private Output<String> checksum;

    /**
     * @return Checksum identifying the version of the bot that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the bot.
     * 
     */
    public Output<String> checksum() {
        return this.checksum;
    }
    /**
     * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
     * 
     */
    @Export(name="childDirected", type=Boolean.class, parameters={})
    private Output<Boolean> childDirected;

    /**
     * @return By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
     * 
     */
    public Output<Boolean> childDirected() {
        return this.childDirected;
    }
    /**
     * The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
     * 
     */
    @Export(name="clarificationPrompt", type=BotClarificationPrompt.class, parameters={})
    private Output</* @Nullable */ BotClarificationPrompt> clarificationPrompt;

    /**
     * @return The message that Amazon Lex uses when it doesn&#39;t understand the user&#39;s request. Attributes are documented under prompt.
     * 
     */
    public Output</* @Nullable */ BotClarificationPrompt> clarificationPrompt() {
        return this.clarificationPrompt;
    }
    /**
     * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
     * 
     */
    @Export(name="createVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> createVersion;

    /**
     * @return Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> createVersion() {
        return this.createVersion;
    }
    /**
     * The date when the bot version was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date when the bot version was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don&#39;t specify detectSentiment, the default is `false`.
     * 
     */
    @Export(name="detectSentiment", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> detectSentiment;

    /**
     * @return When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don&#39;t specify detectSentiment, the default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> detectSentiment() {
        return this.detectSentiment;
    }
    /**
     * Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
     * 
     */
    @Export(name="enableModelImprovements", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableModelImprovements;

    /**
     * @return Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
     * 
     */
    public Output</* @Nullable */ Boolean> enableModelImprovements() {
        return this.enableModelImprovements;
    }
    /**
     * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
     * 
     */
    @Export(name="failureReason", type=String.class, parameters={})
    private Output<String> failureReason;

    /**
     * @return If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
     * 
     */
    public Output<String> failureReason() {
        return this.failureReason;
    }
    /**
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
     * 
     */
    @Export(name="idleSessionTtlInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleSessionTtlInSeconds;

    /**
     * @return The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
     * 
     */
    public Output</* @Nullable */ Integer> idleSessionTtlInSeconds() {
        return this.idleSessionTtlInSeconds;
    }
    /**
     * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
     * 
     */
    @Export(name="intents", type=List.class, parameters={BotIntent.class})
    private Output<List<BotIntent>> intents;

    /**
     * @return A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
     * 
     */
    public Output<List<BotIntent>> intents() {
        return this.intents;
    }
    /**
     * The date when the $LATEST version of this bot was updated.
     * 
     */
    @Export(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The date when the $LATEST version of this bot was updated.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
     * 
     */
    @Export(name="locale", type=String.class, parameters={})
    private Output</* @Nullable */ String> locale;

    /**
     * @return Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
     * 
     */
    public Output</* @Nullable */ String> locale() {
        return this.locale;
    }
    /**
     * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
     * 
     */
    @Export(name="nluIntentConfidenceThreshold", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> nluIntentConfidenceThreshold;

    /**
     * @return Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
     * 
     */
    public Output</* @Nullable */ Double> nluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }
    /**
     * If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn&#39;t build it. Default is `SAVE`.
     * 
     */
    @Export(name="processBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> processBehavior;

    /**
     * @return If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn&#39;t build it. Default is `SAVE`.
     * 
     */
    public Output</* @Nullable */ String> processBehavior() {
        return this.processBehavior;
    }
    /**
     * When you send a request to create or update a bot, Amazon Lex sets the status response
     * element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can&#39;t
     * build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the
     * failure_reason response element.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return When you send a request to create or update a bot, Amazon Lex sets the status response
     * element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can&#39;t
     * build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the
     * failure_reason response element.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The version of the bot.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the bot.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
     * 
     */
    @Export(name="voiceId", type=String.class, parameters={})
    private Output<String> voiceId;

    /**
     * @return The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
     * 
     */
    public Output<String> voiceId() {
        return this.voiceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bot(String name) {
        this(name, BotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bot(String name, BotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bot(String name, BotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/bot:Bot", name, args == null ? BotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Bot(String name, Output<String> id, @Nullable BotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/bot:Bot", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Bot get(String name, Output<String> id, @Nullable BotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bot(name, id, state, options);
    }
}
