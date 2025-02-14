// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Optional flags used to change how video is published. These are only allowed for topologies where &#34;kind&#34; is set to &#34;live&#34;.
 * 
 */
public final class VideoPublishingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VideoPublishingOptionsArgs Empty = new VideoPublishingOptionsArgs();

    /**
     * When set to &#39;true&#39; content will not be archived or recorded. This is used, for example, when the topology is used only for low latency video streaming. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableRtspPublishing&#34; must be set to &#39;false&#39;.
     * 
     */
    @Import(name="disableArchive")
    private @Nullable Output<String> disableArchive;

    /**
     * @return When set to &#39;true&#39; content will not be archived or recorded. This is used, for example, when the topology is used only for low latency video streaming. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableRtspPublishing&#34; must be set to &#39;false&#39;.
     * 
     */
    public Optional<Output<String>> disableArchive() {
        return Optional.ofNullable(this.disableArchive);
    }

    /**
     * When set to &#39;true&#39; the RTSP playback URL will not be published, disabling low latency streaming. This is used, for example, when the topology is used only for archiving content. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableArchive&#34; must be set to &#39;false&#39;.
     * 
     */
    @Import(name="disableRtspPublishing")
    private @Nullable Output<String> disableRtspPublishing;

    /**
     * @return When set to &#39;true&#39; the RTSP playback URL will not be published, disabling low latency streaming. This is used, for example, when the topology is used only for archiving content. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableArchive&#34; must be set to &#39;false&#39;.
     * 
     */
    public Optional<Output<String>> disableRtspPublishing() {
        return Optional.ofNullable(this.disableRtspPublishing);
    }

    private VideoPublishingOptionsArgs() {}

    private VideoPublishingOptionsArgs(VideoPublishingOptionsArgs $) {
        this.disableArchive = $.disableArchive;
        this.disableRtspPublishing = $.disableRtspPublishing;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoPublishingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoPublishingOptionsArgs $;

        public Builder() {
            $ = new VideoPublishingOptionsArgs();
        }

        public Builder(VideoPublishingOptionsArgs defaults) {
            $ = new VideoPublishingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableArchive When set to &#39;true&#39; content will not be archived or recorded. This is used, for example, when the topology is used only for low latency video streaming. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableRtspPublishing&#34; must be set to &#39;false&#39;.
         * 
         * @return builder
         * 
         */
        public Builder disableArchive(@Nullable Output<String> disableArchive) {
            $.disableArchive = disableArchive;
            return this;
        }

        /**
         * @param disableArchive When set to &#39;true&#39; content will not be archived or recorded. This is used, for example, when the topology is used only for low latency video streaming. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableRtspPublishing&#34; must be set to &#39;false&#39;.
         * 
         * @return builder
         * 
         */
        public Builder disableArchive(String disableArchive) {
            return disableArchive(Output.of(disableArchive));
        }

        /**
         * @param disableRtspPublishing When set to &#39;true&#39; the RTSP playback URL will not be published, disabling low latency streaming. This is used, for example, when the topology is used only for archiving content. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableArchive&#34; must be set to &#39;false&#39;.
         * 
         * @return builder
         * 
         */
        public Builder disableRtspPublishing(@Nullable Output<String> disableRtspPublishing) {
            $.disableRtspPublishing = disableRtspPublishing;
            return this;
        }

        /**
         * @param disableRtspPublishing When set to &#39;true&#39; the RTSP playback URL will not be published, disabling low latency streaming. This is used, for example, when the topology is used only for archiving content. Default is &#39;false&#39;.  If set to &#39;true&#39;, then &#34;disableArchive&#34; must be set to &#39;false&#39;.
         * 
         * @return builder
         * 
         */
        public Builder disableRtspPublishing(String disableRtspPublishing) {
            return disableRtspPublishing(Output.of(disableRtspPublishing));
        }

        public VideoPublishingOptionsArgs build() {
            return $;
        }
    }

}
