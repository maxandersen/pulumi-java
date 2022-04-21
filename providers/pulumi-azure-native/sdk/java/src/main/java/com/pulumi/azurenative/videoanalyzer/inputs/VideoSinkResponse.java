// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.inputs.NodeInputResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.VideoCreationPropertiesResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.VideoPublishingOptionsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Video sink in a live topology allows for video and audio to be captured, optionally archived, and published via a video resource. If archiving is enabled, this results in a video of type &#39;archive&#39;. If used in a batch topology, this allows for video and audio to be stored as a file, and published via a video resource of type &#39;file&#39;
 * 
 */
public final class VideoSinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final VideoSinkResponse Empty = new VideoSinkResponse();

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    @Import(name="inputs", required=true)
    private List<NodeInputResponse> inputs;

    public List<NodeInputResponse> inputs() {
        return this.inputs;
    }

    /**
     * Node name. Must be unique within the topology.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.VideoSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Optional video properties to be used in case a new video resource needs to be created on the service.
     * 
     */
    @Import(name="videoCreationProperties")
    private @Nullable VideoCreationPropertiesResponse videoCreationProperties;

    public Optional<VideoCreationPropertiesResponse> videoCreationProperties() {
        return Optional.ofNullable(this.videoCreationProperties);
    }

    /**
     * Name of a new or existing video resource used to capture and publish content. Note: if downstream of RTSP source, and if disableArchive is set to true, then no content is archived.
     * 
     */
    @Import(name="videoName", required=true)
    private String videoName;

    public String videoName() {
        return this.videoName;
    }

    /**
     * Options to change how the video sink publishes content via the video resource. This property is only allowed for topologies where &#34;kind&#34; is set to &#34;live&#34;.
     * 
     */
    @Import(name="videoPublishingOptions")
    private @Nullable VideoPublishingOptionsResponse videoPublishingOptions;

    public Optional<VideoPublishingOptionsResponse> videoPublishingOptions() {
        return Optional.ofNullable(this.videoPublishingOptions);
    }

    private VideoSinkResponse() {}

    private VideoSinkResponse(VideoSinkResponse $) {
        this.inputs = $.inputs;
        this.name = $.name;
        this.type = $.type;
        this.videoCreationProperties = $.videoCreationProperties;
        this.videoName = $.videoName;
        this.videoPublishingOptions = $.videoPublishingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoSinkResponse $;

        public Builder() {
            $ = new VideoSinkResponse();
        }

        public Builder(VideoSinkResponse defaults) {
            $ = new VideoSinkResponse(Objects.requireNonNull(defaults));
        }

        public Builder inputs(List<NodeInputResponse> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(NodeInputResponse... inputs) {
            return inputs(List.of(inputs));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder videoCreationProperties(@Nullable VideoCreationPropertiesResponse videoCreationProperties) {
            $.videoCreationProperties = videoCreationProperties;
            return this;
        }

        public Builder videoName(String videoName) {
            $.videoName = videoName;
            return this;
        }

        public Builder videoPublishingOptions(@Nullable VideoPublishingOptionsResponse videoPublishingOptions) {
            $.videoPublishingOptions = videoPublishingOptions;
            return this;
        }

        public VideoSinkResponse build() {
            $.inputs = Objects.requireNonNull($.inputs, "expected parameter 'inputs' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.videoName = Objects.requireNonNull($.videoName, "expected parameter 'videoName' to be non-null");
            return $;
        }
    }

}
