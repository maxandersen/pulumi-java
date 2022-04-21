// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The event response message received from the service URI.
 * 
 */
public final class EventResponseMessageResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventResponseMessageResponse Empty = new EventResponseMessageResponse();

    /**
     * The content of the event response message.
     * 
     */
    @Import(name="content")
    private @Nullable String content;

    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The headers of the event response message.
     * 
     */
    @Import(name="headers")
    private @Nullable Map<String,String> headers;

    public Optional<Map<String,String>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The reason phrase of the event response message.
     * 
     */
    @Import(name="reasonPhrase")
    private @Nullable String reasonPhrase;

    public Optional<String> reasonPhrase() {
        return Optional.ofNullable(this.reasonPhrase);
    }

    /**
     * The status code of the event response message.
     * 
     */
    @Import(name="statusCode")
    private @Nullable String statusCode;

    public Optional<String> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    /**
     * The HTTP message version.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private EventResponseMessageResponse() {}

    private EventResponseMessageResponse(EventResponseMessageResponse $) {
        this.content = $.content;
        this.headers = $.headers;
        this.reasonPhrase = $.reasonPhrase;
        this.statusCode = $.statusCode;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventResponseMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventResponseMessageResponse $;

        public Builder() {
            $ = new EventResponseMessageResponse();
        }

        public Builder(EventResponseMessageResponse defaults) {
            $ = new EventResponseMessageResponse(Objects.requireNonNull(defaults));
        }

        public Builder content(@Nullable String content) {
            $.content = content;
            return this;
        }

        public Builder headers(@Nullable Map<String,String> headers) {
            $.headers = headers;
            return this;
        }

        public Builder reasonPhrase(@Nullable String reasonPhrase) {
            $.reasonPhrase = reasonPhrase;
            return this;
        }

        public Builder statusCode(@Nullable String statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public EventResponseMessageResponse build() {
            return $;
        }
    }

}
