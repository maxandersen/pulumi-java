// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.NodeInputResponse;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoCreationPropertiesResponse;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoPublishingOptionsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Video sink in a live topology allows for video and audio to be captured, optionally archived, and published via a video resource. If archiving is enabled, this results in a video of type 'archive'. If used in a batch topology, this allows for video and audio to be stored as a file, and published via a video resource of type 'file'
 * 
 */
public final class VideoSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoSinkResponse Empty = new VideoSinkResponse();

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    @Import(name="inputs", required=true)
      private final List<NodeInputResponse> inputs;

    public List<NodeInputResponse> inputs() {
        return this.inputs;
    }

    /**
     * Node name. Must be unique within the topology.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.VideoSink'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Optional video properties to be used in case a new video resource needs to be created on the service.
     * 
     */
    @Import(name="videoCreationProperties")
      private final @Nullable VideoCreationPropertiesResponse videoCreationProperties;

    public Optional<VideoCreationPropertiesResponse> videoCreationProperties() {
        return this.videoCreationProperties == null ? Optional.empty() : Optional.ofNullable(this.videoCreationProperties);
    }

    /**
     * Name of a new or existing video resource used to capture and publish content. Note: if downstream of RTSP source, and if disableArchive is set to true, then no content is archived.
     * 
     */
    @Import(name="videoName", required=true)
      private final String videoName;

    public String videoName() {
        return this.videoName;
    }

    /**
     * Options to change how the video sink publishes content via the video resource. This property is only allowed for topologies where "kind" is set to "live".
     * 
     */
    @Import(name="videoPublishingOptions")
      private final @Nullable VideoPublishingOptionsResponse videoPublishingOptions;

    public Optional<VideoPublishingOptionsResponse> videoPublishingOptions() {
        return this.videoPublishingOptions == null ? Optional.empty() : Optional.ofNullable(this.videoPublishingOptions);
    }

    public VideoSinkResponse(
        List<NodeInputResponse> inputs,
        String name,
        String type,
        @Nullable VideoCreationPropertiesResponse videoCreationProperties,
        String videoName,
        @Nullable VideoPublishingOptionsResponse videoPublishingOptions) {
        this.inputs = Objects.requireNonNull(inputs, "expected parameter 'inputs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.videoCreationProperties = videoCreationProperties;
        this.videoName = Objects.requireNonNull(videoName, "expected parameter 'videoName' to be non-null");
        this.videoPublishingOptions = videoPublishingOptions;
    }

    private VideoSinkResponse() {
        this.inputs = List.of();
        this.name = null;
        this.type = null;
        this.videoCreationProperties = null;
        this.videoName = null;
        this.videoPublishingOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NodeInputResponse> inputs;
        private String name;
        private String type;
        private @Nullable VideoCreationPropertiesResponse videoCreationProperties;
        private String videoName;
        private @Nullable VideoPublishingOptionsResponse videoPublishingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.videoCreationProperties = defaults.videoCreationProperties;
    	      this.videoName = defaults.videoName;
    	      this.videoPublishingOptions = defaults.videoPublishingOptions;
        }

        public Builder inputs(List<NodeInputResponse> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }
        public Builder inputs(NodeInputResponse... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder videoCreationProperties(@Nullable VideoCreationPropertiesResponse videoCreationProperties) {
            this.videoCreationProperties = videoCreationProperties;
            return this;
        }
        public Builder videoName(String videoName) {
            this.videoName = Objects.requireNonNull(videoName);
            return this;
        }
        public Builder videoPublishingOptions(@Nullable VideoPublishingOptionsResponse videoPublishingOptions) {
            this.videoPublishingOptions = videoPublishingOptions;
            return this;
        }        public VideoSinkResponse build() {
            return new VideoSinkResponse(inputs, name, type, videoCreationProperties, videoName, videoPublishingOptions);
        }
    }
}
