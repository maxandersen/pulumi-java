// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.enums.PackagingConfigurationHlsManifestAdMarkers;
import com.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationStreamSelectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class PackagingConfigurationHlsManifestArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationHlsManifestArgs Empty = new PackagingConfigurationHlsManifestArgs();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * 
     */
    @Import(name="adMarkers")
    private @Nullable Output<PackagingConfigurationHlsManifestAdMarkers> adMarkers;

    /**
     * @return This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * 
     */
    public Optional<Output<PackagingConfigurationHlsManifestAdMarkers>> adMarkers() {
        return Optional.ofNullable(this.adMarkers);
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @Import(name="includeIframeOnlyStream")
    private @Nullable Output<Boolean> includeIframeOnlyStream;

    /**
     * @return When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    public Optional<Output<Boolean>> includeIframeOnlyStream() {
        return Optional.ofNullable(this.includeIframeOnlyStream);
    }

    @Import(name="manifestName")
    private @Nullable Output<String> manifestName;

    public Optional<Output<String>> manifestName() {
        return Optional.ofNullable(this.manifestName);
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @Import(name="programDateTimeIntervalSeconds")
    private @Nullable Output<Integer> programDateTimeIntervalSeconds;

    /**
     * @return The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    public Optional<Output<Integer>> programDateTimeIntervalSeconds() {
        return Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @Import(name="repeatExtXKey")
    private @Nullable Output<Boolean> repeatExtXKey;

    /**
     * @return When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    public Optional<Output<Boolean>> repeatExtXKey() {
        return Optional.ofNullable(this.repeatExtXKey);
    }

    @Import(name="streamSelection")
    private @Nullable Output<PackagingConfigurationStreamSelectionArgs> streamSelection;

    public Optional<Output<PackagingConfigurationStreamSelectionArgs>> streamSelection() {
        return Optional.ofNullable(this.streamSelection);
    }

    private PackagingConfigurationHlsManifestArgs() {}

    private PackagingConfigurationHlsManifestArgs(PackagingConfigurationHlsManifestArgs $) {
        this.adMarkers = $.adMarkers;
        this.includeIframeOnlyStream = $.includeIframeOnlyStream;
        this.manifestName = $.manifestName;
        this.programDateTimeIntervalSeconds = $.programDateTimeIntervalSeconds;
        this.repeatExtXKey = $.repeatExtXKey;
        this.streamSelection = $.streamSelection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackagingConfigurationHlsManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationHlsManifestArgs $;

        public Builder() {
            $ = new PackagingConfigurationHlsManifestArgs();
        }

        public Builder(PackagingConfigurationHlsManifestArgs defaults) {
            $ = new PackagingConfigurationHlsManifestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adMarkers This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(@Nullable Output<PackagingConfigurationHlsManifestAdMarkers> adMarkers) {
            $.adMarkers = adMarkers;
            return this;
        }

        /**
         * @param adMarkers This setting controls how ad markers are included in the packaged OriginEndpoint. &#34;NONE&#34; will omit all SCTE-35 ad markers from the output. &#34;PASSTHROUGH&#34; causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. &#34;SCTE35_ENHANCED&#34; generates ad markers and blackout tags based on SCTE-35 messages in the input source.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(PackagingConfigurationHlsManifestAdMarkers adMarkers) {
            return adMarkers(Output.of(adMarkers));
        }

        /**
         * @param includeIframeOnlyStream When enabled, an I-Frame only stream will be included in the output.
         * 
         * @return builder
         * 
         */
        public Builder includeIframeOnlyStream(@Nullable Output<Boolean> includeIframeOnlyStream) {
            $.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        /**
         * @param includeIframeOnlyStream When enabled, an I-Frame only stream will be included in the output.
         * 
         * @return builder
         * 
         */
        public Builder includeIframeOnlyStream(Boolean includeIframeOnlyStream) {
            return includeIframeOnlyStream(Output.of(includeIframeOnlyStream));
        }

        public Builder manifestName(@Nullable Output<String> manifestName) {
            $.manifestName = manifestName;
            return this;
        }

        public Builder manifestName(String manifestName) {
            return manifestName(Output.of(manifestName));
        }

        /**
         * @param programDateTimeIntervalSeconds The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
         * 
         * @return builder
         * 
         */
        public Builder programDateTimeIntervalSeconds(@Nullable Output<Integer> programDateTimeIntervalSeconds) {
            $.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        /**
         * @param programDateTimeIntervalSeconds The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
         * 
         * @return builder
         * 
         */
        public Builder programDateTimeIntervalSeconds(Integer programDateTimeIntervalSeconds) {
            return programDateTimeIntervalSeconds(Output.of(programDateTimeIntervalSeconds));
        }

        /**
         * @param repeatExtXKey When enabled, the EXT-X-KEY tag will be repeated in output manifests.
         * 
         * @return builder
         * 
         */
        public Builder repeatExtXKey(@Nullable Output<Boolean> repeatExtXKey) {
            $.repeatExtXKey = repeatExtXKey;
            return this;
        }

        /**
         * @param repeatExtXKey When enabled, the EXT-X-KEY tag will be repeated in output manifests.
         * 
         * @return builder
         * 
         */
        public Builder repeatExtXKey(Boolean repeatExtXKey) {
            return repeatExtXKey(Output.of(repeatExtXKey));
        }

        public Builder streamSelection(@Nullable Output<PackagingConfigurationStreamSelectionArgs> streamSelection) {
            $.streamSelection = streamSelection;
            return this;
        }

        public Builder streamSelection(PackagingConfigurationStreamSelectionArgs streamSelection) {
            return streamSelection(Output.of(streamSelection));
        }

        public PackagingConfigurationHlsManifestArgs build() {
            return $;
        }
    }

}
