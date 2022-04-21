// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.NormalizedCoordinateResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Display static overlay object.
 * 
 */
public final class AnimationStaticResponse extends com.pulumi.resources.InvokeArgs {

    public static final AnimationStaticResponse Empty = new AnimationStaticResponse();

    /**
     * The time to start displaying the overlay object, in seconds. Default: 0
     * 
     */
    @Import(name="startTimeOffset", required=true)
    private String startTimeOffset;

    public String startTimeOffset() {
        return this.startTimeOffset;
    }

    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    @Import(name="xy", required=true)
    private NormalizedCoordinateResponse xy;

    public NormalizedCoordinateResponse xy() {
        return this.xy;
    }

    private AnimationStaticResponse() {}

    private AnimationStaticResponse(AnimationStaticResponse $) {
        this.startTimeOffset = $.startTimeOffset;
        this.xy = $.xy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnimationStaticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationStaticResponse $;

        public Builder() {
            $ = new AnimationStaticResponse();
        }

        public Builder(AnimationStaticResponse defaults) {
            $ = new AnimationStaticResponse(Objects.requireNonNull(defaults));
        }

        public Builder startTimeOffset(String startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        public Builder xy(NormalizedCoordinateResponse xy) {
            $.xy = xy;
            return this;
        }

        public AnimationStaticResponse build() {
            $.startTimeOffset = Objects.requireNonNull($.startTimeOffset, "expected parameter 'startTimeOffset' to be non-null");
            $.xy = Objects.requireNonNull($.xy, "expected parameter 'xy' to be non-null");
            return $;
        }
    }

}
