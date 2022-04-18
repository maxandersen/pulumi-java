// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SelectAudioTrackByAttributeResponse {
    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    private final String attribute;
    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    private final @Nullable String channelMapping;
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    private final String filter;
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
     */
    private final @Nullable String filterValue;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private SelectAudioTrackByAttributeResponse(
        @CustomType.Parameter("attribute") String attribute,
        @CustomType.Parameter("channelMapping") @Nullable String channelMapping,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("filterValue") @Nullable String filterValue,
        @CustomType.Parameter("odataType") String odataType) {
        this.attribute = attribute;
        this.channelMapping = channelMapping;
        this.filter = filter;
        this.filterValue = filterValue;
        this.odataType = odataType;
    }

    /**
     * The TrackAttribute to filter the tracks by.
     * 
    */
    public String attribute() {
        return this.attribute;
    }
    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
    */
    public Optional<String> channelMapping() {
        return Optional.ofNullable(this.channelMapping);
    }
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
    */
    public String filter() {
        return this.filter;
    }
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
    */
    public Optional<String> filterValue() {
        return Optional.ofNullable(this.filterValue);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByAttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private @Nullable String channelMapping;
        private String filter;
        private @Nullable String filterValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByAttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.channelMapping = defaults.channelMapping;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder channelMapping(@Nullable String channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filterValue(@Nullable String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public SelectAudioTrackByAttributeResponse build() {
            return new SelectAudioTrackByAttributeResponse(attribute, channelMapping, filter, filterValue, odataType);
        }
    }
}
