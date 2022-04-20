// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VideoMediaInfoResponse {
    /**
     * Video segment length indicates the length of individual video files (segments) which are persisted to storage. Smaller segments provide lower archive playback latency but generate larger volume of storage transactions. Larger segments reduce the amount of storage transactions while increasing the archive playback latency. Value must be specified in ISO8601 duration format (i.e. &#34;PT30S&#34; equals 30 seconds) and can vary between 30 seconds to 5 minutes, in 30 seconds increments.
     * 
     */
    private final String segmentLength;

    @CustomType.Constructor
    private VideoMediaInfoResponse(@CustomType.Parameter("segmentLength") String segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Video segment length indicates the length of individual video files (segments) which are persisted to storage. Smaller segments provide lower archive playback latency but generate larger volume of storage transactions. Larger segments reduce the amount of storage transactions while increasing the archive playback latency. Value must be specified in ISO8601 duration format (i.e. &#34;PT30S&#34; equals 30 seconds) and can vary between 30 seconds to 5 minutes, in 30 seconds increments.
     * 
    */
    public String segmentLength() {
        return this.segmentLength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoMediaInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String segmentLength;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoMediaInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segmentLength = defaults.segmentLength;
        }

        public Builder segmentLength(String segmentLength) {
            this.segmentLength = Objects.requireNonNull(segmentLength);
            return this;
        }        public VideoMediaInfoResponse build() {
            return new VideoMediaInfoResponse(segmentLength);
        }
    }
}
