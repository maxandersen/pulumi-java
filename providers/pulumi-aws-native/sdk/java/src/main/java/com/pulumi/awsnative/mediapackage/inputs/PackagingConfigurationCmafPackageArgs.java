// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationCmafEncryptionArgs;
import com.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsManifestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CMAF packaging configuration.
 * 
 */
public final class PackagingConfigurationCmafPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationCmafPackageArgs Empty = new PackagingConfigurationCmafPackageArgs();

    @Import(name="encryption")
      private final @Nullable Output<PackagingConfigurationCmafEncryptionArgs> encryption;

    public Output<PackagingConfigurationCmafEncryptionArgs> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * A list of HLS manifest configurations.
     * 
     */
    @Import(name="hlsManifests", required=true)
      private final Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;

    public Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests() {
        return this.hlsManifests;
    }

    /**
     * When includeEncoderConfigurationInSegments is set to true, MediaPackage places your encoder&#39;s Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     * 
     */
    @Import(name="includeEncoderConfigurationInSegments")
      private final @Nullable Output<Boolean> includeEncoderConfigurationInSegments;

    public Output<Boolean> includeEncoderConfigurationInSegments() {
        return this.includeEncoderConfigurationInSegments == null ? Codegen.empty() : this.includeEncoderConfigurationInSegments;
    }

    @Import(name="segmentDurationSeconds")
      private final @Nullable Output<Integer> segmentDurationSeconds;

    public Output<Integer> segmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Codegen.empty() : this.segmentDurationSeconds;
    }

    public PackagingConfigurationCmafPackageArgs(
        @Nullable Output<PackagingConfigurationCmafEncryptionArgs> encryption,
        Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests,
        @Nullable Output<Boolean> includeEncoderConfigurationInSegments,
        @Nullable Output<Integer> segmentDurationSeconds) {
        this.encryption = encryption;
        this.hlsManifests = Objects.requireNonNull(hlsManifests, "expected parameter 'hlsManifests' to be non-null");
        this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    private PackagingConfigurationCmafPackageArgs() {
        this.encryption = Codegen.empty();
        this.hlsManifests = Codegen.empty();
        this.includeEncoderConfigurationInSegments = Codegen.empty();
        this.segmentDurationSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationCmafPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PackagingConfigurationCmafEncryptionArgs> encryption;
        private Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests;
        private @Nullable Output<Boolean> includeEncoderConfigurationInSegments;
        private @Nullable Output<Integer> segmentDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationCmafPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.includeEncoderConfigurationInSegments = defaults.includeEncoderConfigurationInSegments;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
        }

        public Builder encryption(@Nullable Output<PackagingConfigurationCmafEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable PackagingConfigurationCmafEncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder hlsManifests(Output<List<PackagingConfigurationHlsManifestArgs>> hlsManifests) {
            this.hlsManifests = Objects.requireNonNull(hlsManifests);
            return this;
        }
        public Builder hlsManifests(List<PackagingConfigurationHlsManifestArgs> hlsManifests) {
            this.hlsManifests = Output.of(Objects.requireNonNull(hlsManifests));
            return this;
        }
        public Builder hlsManifests(PackagingConfigurationHlsManifestArgs... hlsManifests) {
            return hlsManifests(List.of(hlsManifests));
        }
        public Builder includeEncoderConfigurationInSegments(@Nullable Output<Boolean> includeEncoderConfigurationInSegments) {
            this.includeEncoderConfigurationInSegments = includeEncoderConfigurationInSegments;
            return this;
        }
        public Builder includeEncoderConfigurationInSegments(@Nullable Boolean includeEncoderConfigurationInSegments) {
            this.includeEncoderConfigurationInSegments = Codegen.ofNullable(includeEncoderConfigurationInSegments);
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Output<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Codegen.ofNullable(segmentDurationSeconds);
            return this;
        }        public PackagingConfigurationCmafPackageArgs build() {
            return new PackagingConfigurationCmafPackageArgs(encryption, hlsManifests, includeEncoderConfigurationInSegments, segmentDurationSeconds);
        }
    }
}
