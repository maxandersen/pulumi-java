// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the common properties for all audio codecs.
 * 
 */
public final class AudioResponse extends com.pulumi.resources.InvokeArgs {

    public static final AudioResponse Empty = new AudioResponse();

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
     */
    @Import(name="bitrate")
      private final @Nullable Integer bitrate;

    public Optional<Integer> bitrate() {
        return this.bitrate == null ? Optional.empty() : Optional.ofNullable(this.bitrate);
    }

    /**
     * The number of channels in the audio.
     * 
     */
    @Import(name="channels")
      private final @Nullable Integer channels;

    public Optional<Integer> channels() {
        return this.channels == null ? Optional.empty() : Optional.ofNullable(this.channels);
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
      private final @Nullable String label;

    public Optional<String> label() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Audio'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * The sampling rate to use for encoding in hertz.
     * 
     */
    @Import(name="samplingRate")
      private final @Nullable Integer samplingRate;

    public Optional<Integer> samplingRate() {
        return this.samplingRate == null ? Optional.empty() : Optional.ofNullable(this.samplingRate);
    }

    public AudioResponse(
        @Nullable Integer bitrate,
        @Nullable Integer channels,
        @Nullable String label,
        String odataType,
        @Nullable Integer samplingRate) {
        this.bitrate = bitrate;
        this.channels = channels;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.samplingRate = samplingRate;
    }

    private AudioResponse() {
        this.bitrate = null;
        this.channels = null;
        this.label = null;
        this.odataType = null;
        this.samplingRate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bitrate;
        private @Nullable Integer channels;
        private @Nullable String label;
        private String odataType;
        private @Nullable Integer samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrate = defaults.bitrate;
    	      this.channels = defaults.channels;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder bitrate(@Nullable Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Builder channels(@Nullable Integer channels) {
            this.channels = channels;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder samplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }        public AudioResponse build() {
            return new AudioResponse(bitrate, channels, label, odataType, samplingRate);
        }
    }
}
