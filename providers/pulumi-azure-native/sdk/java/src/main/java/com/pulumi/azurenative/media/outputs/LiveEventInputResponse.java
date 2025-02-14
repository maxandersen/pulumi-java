// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.LiveEventEndpointResponse;
import com.pulumi.azurenative.media.outputs.LiveEventInputAccessControlResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventInputResponse {
    /**
     * @return Access control for live event input.
     * 
     */
    private final @Nullable LiveEventInputAccessControlResponse accessControl;
    /**
     * @return A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * @return The input endpoints for the live event.
     * 
     */
    private final @Nullable List<LiveEventEndpointResponse> endpoints;
    /**
     * @return ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    private final @Nullable String keyFrameIntervalDuration;
    /**
     * @return The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    private final String streamingProtocol;

    @CustomType.Constructor
    private LiveEventInputResponse(
        @CustomType.Parameter("accessControl") @Nullable LiveEventInputAccessControlResponse accessControl,
        @CustomType.Parameter("accessToken") @Nullable String accessToken,
        @CustomType.Parameter("endpoints") @Nullable List<LiveEventEndpointResponse> endpoints,
        @CustomType.Parameter("keyFrameIntervalDuration") @Nullable String keyFrameIntervalDuration,
        @CustomType.Parameter("streamingProtocol") String streamingProtocol) {
        this.accessControl = accessControl;
        this.accessToken = accessToken;
        this.endpoints = endpoints;
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        this.streamingProtocol = streamingProtocol;
    }

    /**
     * @return Access control for live event input.
     * 
     */
    public Optional<LiveEventInputAccessControlResponse> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    /**
     * @return A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    public Optional<String> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * @return The input endpoints for the live event.
     * 
     */
    public List<LiveEventEndpointResponse> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * @return ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    public Optional<String> keyFrameIntervalDuration() {
        return Optional.ofNullable(this.keyFrameIntervalDuration);
    }
    /**
     * @return The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    public String streamingProtocol() {
        return this.streamingProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LiveEventInputAccessControlResponse accessControl;
        private @Nullable String accessToken;
        private @Nullable List<LiveEventEndpointResponse> endpoints;
        private @Nullable String keyFrameIntervalDuration;
        private String streamingProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.accessToken = defaults.accessToken;
    	      this.endpoints = defaults.endpoints;
    	      this.keyFrameIntervalDuration = defaults.keyFrameIntervalDuration;
    	      this.streamingProtocol = defaults.streamingProtocol;
        }

        public Builder accessControl(@Nullable LiveEventInputAccessControlResponse accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder endpoints(@Nullable List<LiveEventEndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(LiveEventEndpointResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder keyFrameIntervalDuration(@Nullable String keyFrameIntervalDuration) {
            this.keyFrameIntervalDuration = keyFrameIntervalDuration;
            return this;
        }
        public Builder streamingProtocol(String streamingProtocol) {
            this.streamingProtocol = Objects.requireNonNull(streamingProtocol);
            return this;
        }        public LiveEventInputResponse build() {
            return new LiveEventInputResponse(accessControl, accessToken, endpoints, keyFrameIntervalDuration, streamingProtocol);
        }
    }
}
