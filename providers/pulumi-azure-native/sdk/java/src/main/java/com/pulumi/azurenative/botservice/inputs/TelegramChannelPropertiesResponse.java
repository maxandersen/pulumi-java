// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Telegram channel.
 * 
 */
public final class TelegramChannelPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final TelegramChannelPropertiesResponse Empty = new TelegramChannelPropertiesResponse();

    /**
     * The Telegram access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable String accessToken;

    public Optional<String> accessToken() {
        return this.accessToken == null ? Optional.empty() : Optional.ofNullable(this.accessToken);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated")
      private final @Nullable Boolean isValidated;

    public Optional<Boolean> isValidated() {
        return this.isValidated == null ? Optional.empty() : Optional.ofNullable(this.isValidated);
    }

    public TelegramChannelPropertiesResponse(
        @Nullable String accessToken,
        Boolean isEnabled,
        @Nullable Boolean isValidated) {
        this.accessToken = accessToken;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = isValidated;
    }

    private TelegramChannelPropertiesResponse() {
        this.accessToken = null;
        this.isEnabled = null;
        this.isValidated = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TelegramChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private Boolean isEnabled;
        private @Nullable Boolean isValidated;

        public Builder() {
    	      // Empty
        }

        public Builder(TelegramChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
        }

        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isValidated(@Nullable Boolean isValidated) {
            this.isValidated = isValidated;
            return this;
        }        public TelegramChannelPropertiesResponse build() {
            return new TelegramChannelPropertiesResponse(accessToken, isEnabled, isValidated);
        }
    }
}
