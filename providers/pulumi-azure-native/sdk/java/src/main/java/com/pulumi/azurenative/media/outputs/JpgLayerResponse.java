// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JpgLayerResponse {
    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    private final @Nullable String height;
    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JpgLayer'.
     * 
     */
    private final String odataType;
    /**
     * The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
     */
    private final @Nullable Integer quality;
    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    private final @Nullable String width;

    @CustomType.Constructor
    private JpgLayerResponse(
        @CustomType.Parameter("height") @Nullable String height,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("quality") @Nullable Integer quality,
        @CustomType.Parameter("width") @Nullable String width) {
        this.height = height;
        this.label = label;
        this.odataType = odataType;
        this.quality = quality;
        this.width = width;
    }

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
    */
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
    */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JpgLayer'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }
    /**
     * The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
    */
    public Optional<Integer> quality() {
        return Optional.ofNullable(this.quality);
    }
    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
    */
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JpgLayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String height;
        private @Nullable String label;
        private String odataType;
        private @Nullable Integer quality;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(JpgLayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.quality = defaults.quality;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable String height) {
            this.height = height;
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
        public Builder quality(@Nullable Integer quality) {
            this.quality = quality;
            return this;
        }
        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }        public JpgLayerResponse build() {
            return new JpgLayerResponse(height, label, odataType, quality, width);
        }
    }
}
