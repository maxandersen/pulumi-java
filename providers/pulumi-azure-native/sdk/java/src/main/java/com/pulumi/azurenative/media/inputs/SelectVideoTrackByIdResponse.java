// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Select video tracks from the input by specifying a track identifier.
 * 
 */
public final class SelectVideoTrackByIdResponse extends com.pulumi.resources.InvokeArgs {

    public static final SelectVideoTrackByIdResponse Empty = new SelectVideoTrackByIdResponse();

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.SelectVideoTrackById&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Track identifier to select
     * 
     */
    @Import(name="trackId", required=true)
      private final Double trackId;

    public Double trackId() {
        return this.trackId;
    }

    public SelectVideoTrackByIdResponse(
        String odataType,
        Double trackId) {
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
        this.trackId = Objects.requireNonNull(trackId, "expected parameter 'trackId' to be non-null");
    }

    private SelectVideoTrackByIdResponse() {
        this.odataType = null;
        this.trackId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private Double trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder trackId(Double trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }        public SelectVideoTrackByIdResponse build() {
            return new SelectVideoTrackByIdResponse(odataType, trackId);
        }
    }
}
