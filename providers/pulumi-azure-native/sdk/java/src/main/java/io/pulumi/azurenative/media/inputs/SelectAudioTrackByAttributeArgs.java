// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AttributeFilter;
import io.pulumi.azurenative.media.enums.ChannelMapping;
import io.pulumi.azurenative.media.enums.TrackAttribute;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Select audio tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectAudioTrackByAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectAudioTrackByAttributeArgs Empty = new SelectAudioTrackByAttributeArgs();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @Import(name="attribute", required=true)
      private final Output<Either<String,TrackAttribute>> attribute;

    public Output<Either<String,TrackAttribute>> attribute() {
        return this.attribute;
    }

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    @Import(name="channelMapping")
      private final @Nullable Output<Either<String,ChannelMapping>> channelMapping;

    public Output<Either<String,ChannelMapping>> channelMapping() {
        return this.channelMapping == null ? Codegen.empty() : this.channelMapping;
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<Either<String,AttributeFilter>> filter;

    public Output<Either<String,AttributeFilter>> filter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
     */
    @Import(name="filterValue")
      private final @Nullable Output<String> filterValue;

    public Output<String> filterValue() {
        return this.filterValue == null ? Codegen.empty() : this.filterValue;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public SelectAudioTrackByAttributeArgs(
        Output<Either<String,TrackAttribute>> attribute,
        @Nullable Output<Either<String,ChannelMapping>> channelMapping,
        Output<Either<String,AttributeFilter>> filter,
        @Nullable Output<String> filterValue,
        Output<String> odataType) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.channelMapping = channelMapping;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private SelectAudioTrackByAttributeArgs() {
        this.attribute = Codegen.empty();
        this.channelMapping = Codegen.empty();
        this.filter = Codegen.empty();
        this.filterValue = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,TrackAttribute>> attribute;
        private @Nullable Output<Either<String,ChannelMapping>> channelMapping;
        private Output<Either<String,AttributeFilter>> filter;
        private @Nullable Output<String> filterValue;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.channelMapping = defaults.channelMapping;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder attribute(Output<Either<String,TrackAttribute>> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder attribute(Either<String,TrackAttribute> attribute) {
            this.attribute = Output.of(Objects.requireNonNull(attribute));
            return this;
        }
        public Builder channelMapping(@Nullable Output<Either<String,ChannelMapping>> channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }
        public Builder channelMapping(@Nullable Either<String,ChannelMapping> channelMapping) {
            this.channelMapping = Codegen.ofNullable(channelMapping);
            return this;
        }
        public Builder filter(Output<Either<String,AttributeFilter>> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(Either<String,AttributeFilter> filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder filterValue(@Nullable Output<String> filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public Builder filterValue(@Nullable String filterValue) {
            this.filterValue = Codegen.ofNullable(filterValue);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public SelectAudioTrackByAttributeArgs build() {
            return new SelectAudioTrackByAttributeArgs(attribute, channelMapping, filter, filterValue, odataType);
        }
    }
}
