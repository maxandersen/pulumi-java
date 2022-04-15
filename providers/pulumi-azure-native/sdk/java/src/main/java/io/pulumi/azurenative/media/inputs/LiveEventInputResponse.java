// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.LiveEventEndpointResponse;
import io.pulumi.azurenative.media.inputs.LiveEventInputAccessControlResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The live event input.
 * 
 */
public final class LiveEventInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final LiveEventInputResponse Empty = new LiveEventInputResponse();

    /**
     * Access control for live event input.
     * 
     */
    @Import(name="accessControl")
      private final @Nullable LiveEventInputAccessControlResponse accessControl;

    public Optional<LiveEventInputAccessControlResponse> accessControl() {
        return this.accessControl == null ? Optional.empty() : Optional.ofNullable(this.accessControl);
    }

    /**
     * A UUID in string form to uniquely identify the stream. This can be specified at creation time but cannot be updated. If omitted, the service will generate a unique value.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable String accessToken;

    public Optional<String> accessToken() {
        return this.accessToken == null ? Optional.empty() : Optional.ofNullable(this.accessToken);
    }

    /**
     * The input endpoints for the live event.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable List<LiveEventEndpointResponse> endpoints;

    public List<LiveEventEndpointResponse> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }

    /**
     * ISO 8601 time duration of the key frame interval duration of the input. This value sets the EXT-X-TARGETDURATION property in the HLS output. For example, use PT2S to indicate 2 seconds. Leave the value empty for encoding live events.
     * 
     */
    @Import(name="keyFrameIntervalDuration")
      private final @Nullable String keyFrameIntervalDuration;

    public Optional<String> keyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration == null ? Optional.empty() : Optional.ofNullable(this.keyFrameIntervalDuration);
    }

    /**
     * The input protocol for the live event. This is specified at creation time and cannot be updated.
     * 
     */
    @Import(name="streamingProtocol", required=true)
      private final String streamingProtocol;

    public String streamingProtocol() {
        return this.streamingProtocol;
    }

    public LiveEventInputResponse(
        @Nullable LiveEventInputAccessControlResponse accessControl,
        @Nullable String accessToken,
        @Nullable List<LiveEventEndpointResponse> endpoints,
        @Nullable String keyFrameIntervalDuration,
        String streamingProtocol) {
        this.accessControl = accessControl;
        this.accessToken = accessToken;
        this.endpoints = endpoints;
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        this.streamingProtocol = Objects.requireNonNull(streamingProtocol, "expected parameter 'streamingProtocol' to be non-null");
    }

    private LiveEventInputResponse() {
        this.accessControl = null;
        this.accessToken = null;
        this.endpoints = List.of();
        this.keyFrameIntervalDuration = null;
        this.streamingProtocol = null;
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
