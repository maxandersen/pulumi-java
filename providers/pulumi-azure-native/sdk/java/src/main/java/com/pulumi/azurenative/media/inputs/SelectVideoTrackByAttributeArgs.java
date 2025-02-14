// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.AttributeFilter;
import com.pulumi.azurenative.media.enums.TrackAttribute;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Select video tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectVideoTrackByAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SelectVideoTrackByAttributeArgs Empty = new SelectVideoTrackByAttributeArgs();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @Import(name="attribute", required=true)
    private Output<Either<String,TrackAttribute>> attribute;

    /**
     * @return The TrackAttribute to filter the tracks by.
     * 
     */
    public Output<Either<String,TrackAttribute>> attribute() {
        return this.attribute;
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @Import(name="filter", required=true)
    private Output<Either<String,AttributeFilter>> filter;

    /**
     * @return The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    public Output<Either<String,AttributeFilter>> filter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: &#39;1500000&#39;).  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    @Import(name="filterValue")
    private @Nullable Output<String> filterValue;

    /**
     * @return The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: &#39;1500000&#39;).  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    public Optional<Output<String>> filterValue() {
        return Optional.ofNullable(this.filterValue);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.SelectVideoTrackByAttribute&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.SelectVideoTrackByAttribute&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private SelectVideoTrackByAttributeArgs() {}

    private SelectVideoTrackByAttributeArgs(SelectVideoTrackByAttributeArgs $) {
        this.attribute = $.attribute;
        this.filter = $.filter;
        this.filterValue = $.filterValue;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelectVideoTrackByAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelectVideoTrackByAttributeArgs $;

        public Builder() {
            $ = new SelectVideoTrackByAttributeArgs();
        }

        public Builder(SelectVideoTrackByAttributeArgs defaults) {
            $ = new SelectVideoTrackByAttributeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute The TrackAttribute to filter the tracks by.
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<Either<String,TrackAttribute>> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute The TrackAttribute to filter the tracks by.
         * 
         * @return builder
         * 
         */
        public Builder attribute(Either<String,TrackAttribute> attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param attribute The TrackAttribute to filter the tracks by.
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Either.ofLeft(attribute));
        }

        /**
         * @param attribute The TrackAttribute to filter the tracks by.
         * 
         * @return builder
         * 
         */
        public Builder attribute(TrackAttribute attribute) {
            return attribute(Either.ofRight(attribute));
        }

        /**
         * @param filter The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<Either<String,AttributeFilter>> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
         * 
         * @return builder
         * 
         */
        public Builder filter(Either<String,AttributeFilter> filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param filter The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Either.ofLeft(filter));
        }

        /**
         * @param filter The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
         * 
         * @return builder
         * 
         */
        public Builder filter(AttributeFilter filter) {
            return filter(Either.ofRight(filter));
        }

        /**
         * @param filterValue The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: &#39;1500000&#39;).  The TrackAttribute.Language is not supported for video tracks.
         * 
         * @return builder
         * 
         */
        public Builder filterValue(@Nullable Output<String> filterValue) {
            $.filterValue = filterValue;
            return this;
        }

        /**
         * @param filterValue The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: &#39;1500000&#39;).  The TrackAttribute.Language is not supported for video tracks.
         * 
         * @return builder
         * 
         */
        public Builder filterValue(String filterValue) {
            return filterValue(Output.of(filterValue));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.SelectVideoTrackByAttribute&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.SelectVideoTrackByAttribute&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public SelectVideoTrackByAttributeArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
