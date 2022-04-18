// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VideoStreamingResponse {
    /**
     * Video streaming base URL for the video archive. When present, archived video can be played through the Azure Video Analyzer player. Alternatively, this URL can be used with compatible DASH or HLS players by appending the following to the base URL:
     * 
     *   - HLSv4:     /manifest(format=m3u8-aapl).m3u8
     *   - HLS CMAF:  /manifest(format=m3u8-cmaf)
     *   - DASH CMAF: /manifest(format=mpd-time-cmaf)
     * 
     * Moreover, an ongoing video recording can be played in "live mode" with latencies which are approximately double of the chosen video segment length.
     * 
     */
    private final @Nullable String archiveBaseUrl;

    @CustomType.Constructor
    private VideoStreamingResponse(@CustomType.Parameter("archiveBaseUrl") @Nullable String archiveBaseUrl) {
        this.archiveBaseUrl = archiveBaseUrl;
    }

    /**
     * Video streaming base URL for the video archive. When present, archived video can be played through the Azure Video Analyzer player. Alternatively, this URL can be used with compatible DASH or HLS players by appending the following to the base URL:
     * 
     *   - HLSv4:     /manifest(format=m3u8-aapl).m3u8
     *   - HLS CMAF:  /manifest(format=m3u8-cmaf)
     *   - DASH CMAF: /manifest(format=mpd-time-cmaf)
     * 
     * Moreover, an ongoing video recording can be played in "live mode" with latencies which are approximately double of the chosen video segment length.
     * 
    */
    public Optional<String> archiveBaseUrl() {
        return Optional.ofNullable(this.archiveBaseUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoStreamingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String archiveBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoStreamingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveBaseUrl = defaults.archiveBaseUrl;
        }

        public Builder archiveBaseUrl(@Nullable String archiveBaseUrl) {
            this.archiveBaseUrl = archiveBaseUrl;
            return this;
        }        public VideoStreamingResponse build() {
            return new VideoStreamingResponse(archiveBaseUrl);
        }
    }
}
