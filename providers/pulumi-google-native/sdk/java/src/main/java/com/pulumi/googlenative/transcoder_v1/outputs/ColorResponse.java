// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class ColorResponse {
    /**
     * @return Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    private final Double brightness;
    /**
     * @return Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    private final Double contrast;
    /**
     * @return Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    private final Double saturation;

    @CustomType.Constructor
    private ColorResponse(
        @CustomType.Parameter("brightness") Double brightness,
        @CustomType.Parameter("contrast") Double contrast,
        @CustomType.Parameter("saturation") Double saturation) {
        this.brightness = brightness;
        this.contrast = contrast;
        this.saturation = saturation;
    }

    /**
     * @return Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    public Double brightness() {
        return this.brightness;
    }
    /**
     * @return Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    public Double contrast() {
        return this.contrast;
    }
    /**
     * @return Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    public Double saturation() {
        return this.saturation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double brightness;
        private Double contrast;
        private Double saturation;

        public Builder() {
    	      // Empty
        }

        public Builder(ColorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.contrast = defaults.contrast;
    	      this.saturation = defaults.saturation;
        }

        public Builder brightness(Double brightness) {
            this.brightness = Objects.requireNonNull(brightness);
            return this;
        }
        public Builder contrast(Double contrast) {
            this.contrast = Objects.requireNonNull(contrast);
            return this;
        }
        public Builder saturation(Double saturation) {
            this.saturation = Objects.requireNonNull(saturation);
            return this;
        }        public ColorResponse build() {
            return new ColorResponse(brightness, contrast, saturation);
        }
    }
}
