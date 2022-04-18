// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A TrackSelection to select video tracks.
 * 
 */
public final class VideoTrackDescriptorResponse extends com.pulumi.resources.InvokeArgs {

    public static final VideoTrackDescriptorResponse Empty = new VideoTrackDescriptorResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.VideoTrackDescriptor'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public VideoTrackDescriptorResponse(String odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private VideoTrackDescriptorResponse() {
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoTrackDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoTrackDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public VideoTrackDescriptorResponse build() {
            return new VideoTrackDescriptorResponse(odataType);
        }
    }
}
