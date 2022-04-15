// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Select video tracks from the input by specifying a track identifier.
 * 
 */
public final class SelectVideoTrackByIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectVideoTrackByIdArgs Empty = new SelectVideoTrackByIdArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackById'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Track identifier to select
     * 
     */
    @Import(name="trackId", required=true)
      private final Output<Double> trackId;

    public Output<Double> trackId() {
        return this.trackId;
    }

    public SelectVideoTrackByIdArgs(
        Output<String> odataType,
        Output<Double> trackId) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.trackId = Objects.requireNonNull(trackId, "expected parameter 'trackId' to be non-null");
    }

    private SelectVideoTrackByIdArgs() {
        this.odataType = Codegen.empty();
        this.trackId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<Double> trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder trackId(Output<Double> trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }
        public Builder trackId(Double trackId) {
            this.trackId = Output.of(Objects.requireNonNull(trackId));
            return this;
        }        public SelectVideoTrackByIdArgs build() {
            return new SelectVideoTrackByIdArgs(odataType, trackId);
        }
    }
}
