// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBotResult {
    /**
     * The ARN of the bot.
     * 
     */
    private final String arn;
    /**
     * Checksum of the bot used to identify a specific revision of the bot's `$LATEST` version.
     * 
     */
    private final String checksum;
    /**
     * Specifies if this Amazon Lex Bot is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA.
     * 
     */
    private final Boolean childDirected;
    /**
     * The date that the bot was created.
     * 
     */
    private final String createdDate;
    /**
     * A description of the bot.
     * 
     */
    private final String description;
    /**
     * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis.
     * 
     */
    private final Boolean detectSentiment;
    /**
     * Set to true if natural language understanding improvements are enabled.
     * 
     */
    private final Boolean enableModelImprovements;
    /**
     * If the `status` is `FAILED`, the reason why the bot failed to build.
     * 
     */
    private final String failureReason;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * 
     */
    private final Integer idleSessionTtlInSeconds;
    /**
     * The date that the bot was updated.
     * 
     */
    private final String lastUpdatedDate;
    /**
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.
     * 
     */
    private final String locale;
    /**
     * The name of the bot, case sensitive.
     * 
     */
    private final String name;
    /**
     * The threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot.
     * 
     */
    private final Double nluIntentConfidenceThreshold;
    /**
     * The status of the bot.
     * 
     */
    private final String status;
    /**
     * The version of the bot. For a new bot, the version is always `$LATEST`.
     * 
     */
    private final @Nullable String version;
    /**
     * The Amazon Polly voice ID that the Amazon Lex Bot uses for voice interactions with the user.
     * 
     */
    private final String voiceId;

    @CustomType.Constructor
    private GetBotResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("checksum") String checksum,
        @CustomType.Parameter("childDirected") Boolean childDirected,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("detectSentiment") Boolean detectSentiment,
        @CustomType.Parameter("enableModelImprovements") Boolean enableModelImprovements,
        @CustomType.Parameter("failureReason") String failureReason,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idleSessionTtlInSeconds") Integer idleSessionTtlInSeconds,
        @CustomType.Parameter("lastUpdatedDate") String lastUpdatedDate,
        @CustomType.Parameter("locale") String locale,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nluIntentConfidenceThreshold") Double nluIntentConfidenceThreshold,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("version") @Nullable String version,
        @CustomType.Parameter("voiceId") String voiceId) {
        this.arn = arn;
        this.checksum = checksum;
        this.childDirected = childDirected;
        this.createdDate = createdDate;
        this.description = description;
        this.detectSentiment = detectSentiment;
        this.enableModelImprovements = enableModelImprovements;
        this.failureReason = failureReason;
        this.id = id;
        this.idleSessionTtlInSeconds = idleSessionTtlInSeconds;
        this.lastUpdatedDate = lastUpdatedDate;
        this.locale = locale;
        this.name = name;
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
        this.status = status;
        this.version = version;
        this.voiceId = voiceId;
    }

    /**
     * The ARN of the bot.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * Checksum of the bot used to identify a specific revision of the bot's `$LATEST` version.
     * 
    */
    public String checksum() {
        return this.checksum;
    }
    /**
     * Specifies if this Amazon Lex Bot is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA.
     * 
    */
    public Boolean childDirected() {
        return this.childDirected;
    }
    /**
     * The date that the bot was created.
     * 
    */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * A description of the bot.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis.
     * 
    */
    public Boolean detectSentiment() {
        return this.detectSentiment;
    }
    /**
     * Set to true if natural language understanding improvements are enabled.
     * 
    */
    public Boolean enableModelImprovements() {
        return this.enableModelImprovements;
    }
    /**
     * If the `status` is `FAILED`, the reason why the bot failed to build.
     * 
    */
    public String failureReason() {
        return this.failureReason;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
     * 
    */
    public Integer idleSessionTtlInSeconds() {
        return this.idleSessionTtlInSeconds;
    }
    /**
     * The date that the bot was updated.
     * 
    */
    public String lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.
     * 
    */
    public String locale() {
        return this.locale;
    }
    /**
     * The name of the bot, case sensitive.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot.
     * 
    */
    public Double nluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold;
    }
    /**
     * The status of the bot.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * The version of the bot. For a new bot, the version is always `$LATEST`.
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    /**
     * The Amazon Polly voice ID that the Amazon Lex Bot uses for voice interactions with the user.
     * 
    */
    public String voiceId() {
        return this.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String checksum;
        private Boolean childDirected;
        private String createdDate;
        private String description;
        private Boolean detectSentiment;
        private Boolean enableModelImprovements;
        private String failureReason;
        private String id;
        private Integer idleSessionTtlInSeconds;
        private String lastUpdatedDate;
        private String locale;
        private String name;
        private Double nluIntentConfidenceThreshold;
        private String status;
        private @Nullable String version;
        private String voiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.checksum = defaults.checksum;
    	      this.childDirected = defaults.childDirected;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.detectSentiment = defaults.detectSentiment;
    	      this.enableModelImprovements = defaults.enableModelImprovements;
    	      this.failureReason = defaults.failureReason;
    	      this.id = defaults.id;
    	      this.idleSessionTtlInSeconds = defaults.idleSessionTtlInSeconds;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.locale = defaults.locale;
    	      this.name = defaults.name;
    	      this.nluIntentConfidenceThreshold = defaults.nluIntentConfidenceThreshold;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
    	      this.voiceId = defaults.voiceId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        public Builder childDirected(Boolean childDirected) {
            this.childDirected = Objects.requireNonNull(childDirected);
            return this;
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder detectSentiment(Boolean detectSentiment) {
            this.detectSentiment = Objects.requireNonNull(detectSentiment);
            return this;
        }
        public Builder enableModelImprovements(Boolean enableModelImprovements) {
            this.enableModelImprovements = Objects.requireNonNull(enableModelImprovements);
            return this;
        }
        public Builder failureReason(String failureReason) {
            this.failureReason = Objects.requireNonNull(failureReason);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder idleSessionTtlInSeconds(Integer idleSessionTtlInSeconds) {
            this.idleSessionTtlInSeconds = Objects.requireNonNull(idleSessionTtlInSeconds);
            return this;
        }
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            this.lastUpdatedDate = Objects.requireNonNull(lastUpdatedDate);
            return this;
        }
        public Builder locale(String locale) {
            this.locale = Objects.requireNonNull(locale);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nluIntentConfidenceThreshold(Double nluIntentConfidenceThreshold) {
            this.nluIntentConfidenceThreshold = Objects.requireNonNull(nluIntentConfidenceThreshold);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public Builder voiceId(String voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId);
            return this;
        }        public GetBotResult build() {
            return new GetBotResult(arn, checksum, childDirected, createdDate, description, detectSentiment, enableModelImprovements, failureReason, id, idleSessionTtlInSeconds, lastUpdatedDate, locale, name, nluIntentConfidenceThreshold, status, version, voiceId);
        }
    }
}
