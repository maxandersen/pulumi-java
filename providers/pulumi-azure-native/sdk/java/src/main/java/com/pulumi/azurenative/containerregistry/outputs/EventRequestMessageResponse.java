// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.EventContentResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventRequestMessageResponse {
    /**
     * The content of the event request message.
     * 
     */
    private final @Nullable EventContentResponse content;
    /**
     * The headers of the event request message.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * The HTTP method used to send the event request message.
     * 
     */
    private final @Nullable String method;
    /**
     * The URI used to send the event request message.
     * 
     */
    private final @Nullable String requestUri;
    /**
     * The HTTP message version.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private EventRequestMessageResponse(
        @CustomType.Parameter("content") @Nullable EventContentResponse content,
        @CustomType.Parameter("headers") @Nullable Map<String,String> headers,
        @CustomType.Parameter("method") @Nullable String method,
        @CustomType.Parameter("requestUri") @Nullable String requestUri,
        @CustomType.Parameter("version") @Nullable String version) {
        this.content = content;
        this.headers = headers;
        this.method = method;
        this.requestUri = requestUri;
        this.version = version;
    }

    /**
     * The content of the event request message.
     * 
    */
    public Optional<EventContentResponse> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The headers of the event request message.
     * 
    */
    public Map<String,String> headers() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * The HTTP method used to send the event request message.
     * 
    */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * The URI used to send the event request message.
     * 
    */
    public Optional<String> requestUri() {
        return Optional.ofNullable(this.requestUri);
    }
    /**
     * The HTTP message version.
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventRequestMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventContentResponse content;
        private @Nullable Map<String,String> headers;
        private @Nullable String method;
        private @Nullable String requestUri;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EventRequestMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.requestUri = defaults.requestUri;
    	      this.version = defaults.version;
        }

        public Builder content(@Nullable EventContentResponse content) {
            this.content = content;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder requestUri(@Nullable String requestUri) {
            this.requestUri = requestUri;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public EventRequestMessageResponse build() {
            return new EventRequestMessageResponse(content, headers, method, requestUri, version);
        }
    }
}
