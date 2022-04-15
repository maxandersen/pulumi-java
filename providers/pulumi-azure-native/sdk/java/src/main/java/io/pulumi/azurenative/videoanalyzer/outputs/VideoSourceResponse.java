// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.VideoSequenceAbsoluteTimeMarkersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VideoSourceResponse {
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    private final String name;
    /**
     * Describes a sequence of datetime ranges. The video source only picks up recorded media within these ranges.
     * 
     */
    private final VideoSequenceAbsoluteTimeMarkersResponse timeSequences;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSource'.
     * 
     */
    private final String type;
    /**
     * Name of the Video Analyzer video resource to be used as the source.
     * 
     */
    private final String videoName;

    @CustomType.Constructor
    private VideoSourceResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("timeSequences") VideoSequenceAbsoluteTimeMarkersResponse timeSequences,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("videoName") String videoName) {
        this.name = name;
        this.timeSequences = timeSequences;
        this.type = type;
        this.videoName = videoName;
    }

    /**
     * Node name. Must be unique within the topology.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Describes a sequence of datetime ranges. The video source only picks up recorded media within these ranges.
     * 
    */
    public VideoSequenceAbsoluteTimeMarkersResponse timeSequences() {
        return this.timeSequences;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSource'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Name of the Video Analyzer video resource to be used as the source.
     * 
    */
    public String videoName() {
        return this.videoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private VideoSequenceAbsoluteTimeMarkersResponse timeSequences;
        private String type;
        private String videoName;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.timeSequences = defaults.timeSequences;
    	      this.type = defaults.type;
    	      this.videoName = defaults.videoName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder timeSequences(VideoSequenceAbsoluteTimeMarkersResponse timeSequences) {
            this.timeSequences = Objects.requireNonNull(timeSequences);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder videoName(String videoName) {
            this.videoName = Objects.requireNonNull(videoName);
            return this;
        }        public VideoSourceResponse build() {
            return new VideoSourceResponse(name, timeSequences, type, videoName);
        }
    }
}
