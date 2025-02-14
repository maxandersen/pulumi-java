// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotVoiceSettings {
    /**
     * @return The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * 
     */
    private final String voiceId;

    @CustomType.Constructor
    private BotVoiceSettings(@CustomType.Parameter("voiceId") String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * @return The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user.
     * 
     */
    public String voiceId() {
        return this.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVoiceSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String voiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVoiceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.voiceId = defaults.voiceId;
        }

        public Builder voiceId(String voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId);
            return this;
        }        public BotVoiceSettings build() {
            return new BotVoiceSettings(voiceId);
        }
    }
}
