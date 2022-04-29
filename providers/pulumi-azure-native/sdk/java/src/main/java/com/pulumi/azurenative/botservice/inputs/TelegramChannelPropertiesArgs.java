// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Telegram channel.
 * 
 */
public final class TelegramChannelPropertiesArgs extends ResourceArgs {

    public static final TelegramChannelPropertiesArgs Empty = new TelegramChannelPropertiesArgs();

    /**
     * The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated")
    private @Nullable Output<Boolean> isValidated;

    /**
     * @return Whether this channel is validated for the bot
     * 
     */
    public Optional<Output<Boolean>> isValidated() {
        return Optional.ofNullable(this.isValidated);
    }

    private TelegramChannelPropertiesArgs() {}

    private TelegramChannelPropertiesArgs(TelegramChannelPropertiesArgs $) {
        this.accessToken = $.accessToken;
        this.isEnabled = $.isEnabled;
        this.isValidated = $.isValidated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TelegramChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TelegramChannelPropertiesArgs $;

        public Builder() {
            $ = new TelegramChannelPropertiesArgs();
        }

        public Builder(TelegramChannelPropertiesArgs defaults) {
            $ = new TelegramChannelPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param isEnabled Whether this channel is enabled for the bot
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Whether this channel is enabled for the bot
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param isValidated Whether this channel is validated for the bot
         * 
         * @return builder
         * 
         */
        public Builder isValidated(@Nullable Output<Boolean> isValidated) {
            $.isValidated = isValidated;
            return this;
        }

        /**
         * @param isValidated Whether this channel is validated for the bot
         * 
         * @return builder
         * 
         */
        public Builder isValidated(Boolean isValidated) {
            return isValidated(Output.of(isValidated));
        }

        public TelegramChannelPropertiesArgs build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            return $;
        }
    }

}
