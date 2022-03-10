// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SegmentSettingsResponse {
    /**
     * Create an individual segment file. The default is `false`.
     * 
     */
    private final Boolean individualSegments;
    /**
     * Duration of the segments in seconds. The default is `6.0s`. Note that `segmentDuration` must be greater than or equal to [`gopDuration`](#videostream), and `segmentDuration` must be divisible by [`gopDuration`](#videostream).
     * 
     */
    private final String segmentDuration;

    @OutputCustomType.Constructor
    private SegmentSettingsResponse(
        @OutputCustomType.Parameter("individualSegments") Boolean individualSegments,
        @OutputCustomType.Parameter("segmentDuration") String segmentDuration) {
        this.individualSegments = individualSegments;
        this.segmentDuration = segmentDuration;
    }

    /**
     * Create an individual segment file. The default is `false`.
     * 
    */
    public Boolean getIndividualSegments() {
        return this.individualSegments;
    }
    /**
     * Duration of the segments in seconds. The default is `6.0s`. Note that `segmentDuration` must be greater than or equal to [`gopDuration`](#videostream), and `segmentDuration` must be divisible by [`gopDuration`](#videostream).
     * 
    */
    public String getSegmentDuration() {
        return this.segmentDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SegmentSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean individualSegments;
        private String segmentDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(SegmentSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.individualSegments = defaults.individualSegments;
    	      this.segmentDuration = defaults.segmentDuration;
        }

        public Builder setIndividualSegments(Boolean individualSegments) {
            this.individualSegments = Objects.requireNonNull(individualSegments);
            return this;
        }

        public Builder setSegmentDuration(String segmentDuration) {
            this.segmentDuration = Objects.requireNonNull(segmentDuration);
            return this;
        }
        public SegmentSettingsResponse build() {
            return new SegmentSettingsResponse(individualSegments, segmentDuration);
        }
    }
}
