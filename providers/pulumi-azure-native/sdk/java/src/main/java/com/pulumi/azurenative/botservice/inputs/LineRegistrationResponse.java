// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties corresponding to a line channel registration
 * 
 */
public final class LineRegistrationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LineRegistrationResponse Empty = new LineRegistrationResponse();

    /**
     * Access token for the line channel registration
     * 
     */
    @Import(name="channelAccessToken")
    private @Nullable String channelAccessToken;

    public Optional<String> channelAccessToken() {
        return Optional.ofNullable(this.channelAccessToken);
    }

    /**
     * Secret for the line channel registration
     * 
     */
    @Import(name="channelSecret")
    private @Nullable String channelSecret;

    public Optional<String> channelSecret() {
        return Optional.ofNullable(this.channelSecret);
    }

    /**
     * Id generated for the line channel registration
     * 
     */
    @Import(name="generatedId", required=true)
    private String generatedId;

    public String generatedId() {
        return this.generatedId;
    }

    private LineRegistrationResponse() {}

    private LineRegistrationResponse(LineRegistrationResponse $) {
        this.channelAccessToken = $.channelAccessToken;
        this.channelSecret = $.channelSecret;
        this.generatedId = $.generatedId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LineRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LineRegistrationResponse $;

        public Builder() {
            $ = new LineRegistrationResponse();
        }

        public Builder(LineRegistrationResponse defaults) {
            $ = new LineRegistrationResponse(Objects.requireNonNull(defaults));
        }

        public Builder channelAccessToken(@Nullable String channelAccessToken) {
            $.channelAccessToken = channelAccessToken;
            return this;
        }

        public Builder channelSecret(@Nullable String channelSecret) {
            $.channelSecret = channelSecret;
            return this;
        }

        public Builder generatedId(String generatedId) {
            $.generatedId = generatedId;
            return this;
        }

        public LineRegistrationResponse build() {
            $.generatedId = Objects.requireNonNull($.generatedId, "expected parameter 'generatedId' to be non-null");
            return $;
        }
    }

}
