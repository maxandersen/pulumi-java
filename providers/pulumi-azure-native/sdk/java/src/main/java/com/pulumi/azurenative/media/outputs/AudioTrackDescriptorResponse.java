// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AudioTrackDescriptorResponse {
    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    private final @Nullable String channelMapping;
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AudioTrackDescriptor&#39;.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private AudioTrackDescriptorResponse(
        @CustomType.Parameter("channelMapping") @Nullable String channelMapping,
        @CustomType.Parameter("odataType") String odataType) {
        this.channelMapping = channelMapping;
        this.odataType = odataType;
    }

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
    */
    public Optional<String> channelMapping() {
        return Optional.ofNullable(this.channelMapping);
    }
    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.AudioTrackDescriptor&#39;.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioTrackDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelMapping;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioTrackDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelMapping = defaults.channelMapping;
    	      this.odataType = defaults.odataType;
        }

        public Builder channelMapping(@Nullable String channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public AudioTrackDescriptorResponse build() {
            return new AudioTrackDescriptorResponse(channelMapping, odataType);
        }
    }
}
