// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RectangleResponse {
    /**
     * The height of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    private final @Nullable String height;
    /**
     * The number of pixels from the left-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    private final @Nullable String left;
    /**
     * The number of pixels from the top-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    private final @Nullable String top;
    /**
     * The width of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
     */
    private final @Nullable String width;

    @CustomType.Constructor
    private RectangleResponse(
        @CustomType.Parameter("height") @Nullable String height,
        @CustomType.Parameter("left") @Nullable String left,
        @CustomType.Parameter("top") @Nullable String top,
        @CustomType.Parameter("width") @Nullable String width) {
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    /**
     * The height of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
    */
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    /**
     * The number of pixels from the left-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
    */
    public Optional<String> left() {
        return Optional.ofNullable(this.left);
    }
    /**
     * The number of pixels from the top-margin. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
    */
    public Optional<String> top() {
        return Optional.ofNullable(this.top);
    }
    /**
     * The width of the rectangular region in pixels. This can be absolute pixel value (e.g 100), or relative to the size of the video (For example, 50%).
     * 
    */
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RectangleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String height;
        private @Nullable String left;
        private @Nullable String top;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(RectangleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.left = defaults.left;
    	      this.top = defaults.top;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable String height) {
            this.height = height;
            return this;
        }
        public Builder left(@Nullable String left) {
            this.left = left;
            return this;
        }
        public Builder top(@Nullable String top) {
            this.top = top;
            return this;
        }
        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }        public RectangleResponse build() {
            return new RectangleResponse(height, left, top, width);
        }
    }
}
