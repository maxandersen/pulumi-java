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
 * The parameters to provide for the Kik channel.
 * 
 */
public final class KikChannelPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KikChannelPropertiesResponse Empty = new KikChannelPropertiesResponse();

    /**
     * Kik API key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="apiKey")
    private @Nullable String apiKey;

    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
    private Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this channel is validated for the bot
     * 
     */
    @Import(name="isValidated")
    private @Nullable Boolean isValidated;

    public Optional<Boolean> isValidated() {
        return Optional.ofNullable(this.isValidated);
    }

    /**
     * The Kik user name
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    public String userName() {
        return this.userName;
    }

    private KikChannelPropertiesResponse() {}

    private KikChannelPropertiesResponse(KikChannelPropertiesResponse $) {
        this.apiKey = $.apiKey;
        this.isEnabled = $.isEnabled;
        this.isValidated = $.isValidated;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KikChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KikChannelPropertiesResponse $;

        public Builder() {
            $ = new KikChannelPropertiesResponse();
        }

        public Builder(KikChannelPropertiesResponse defaults) {
            $ = new KikChannelPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder apiKey(@Nullable String apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isValidated(@Nullable Boolean isValidated) {
            $.isValidated = isValidated;
            return this;
        }

        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public KikChannelPropertiesResponse build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
