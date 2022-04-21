// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Reverse shipment details.
 * 
 */
public final class ReverseShippingDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReverseShippingDetailsResponse Empty = new ReverseShippingDetailsResponse();

    /**
     * Carrier Name for display purpose. Not to be used for any processing.
     * 
     */
    @Import(name="carrierDisplayName", required=true)
    private String carrierDisplayName;

    public String carrierDisplayName() {
        return this.carrierDisplayName;
    }

    /**
     * Name of the carrier.
     * 
     */
    @Import(name="carrierName", required=true)
    private String carrierName;

    public String carrierName() {
        return this.carrierName;
    }

    /**
     * SAS key to download the reverse shipment label of the package.
     * 
     */
    @Import(name="sasKeyForLabel", required=true)
    private String sasKeyForLabel;

    public String sasKeyForLabel() {
        return this.sasKeyForLabel;
    }

    /**
     * TrackingId of the package
     * 
     */
    @Import(name="trackingId", required=true)
    private String trackingId;

    public String trackingId() {
        return this.trackingId;
    }

    /**
     * TrackingUrl of the package.
     * 
     */
    @Import(name="trackingUrl", required=true)
    private String trackingUrl;

    public String trackingUrl() {
        return this.trackingUrl;
    }

    private ReverseShippingDetailsResponse() {}

    private ReverseShippingDetailsResponse(ReverseShippingDetailsResponse $) {
        this.carrierDisplayName = $.carrierDisplayName;
        this.carrierName = $.carrierName;
        this.sasKeyForLabel = $.sasKeyForLabel;
        this.trackingId = $.trackingId;
        this.trackingUrl = $.trackingUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReverseShippingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReverseShippingDetailsResponse $;

        public Builder() {
            $ = new ReverseShippingDetailsResponse();
        }

        public Builder(ReverseShippingDetailsResponse defaults) {
            $ = new ReverseShippingDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder carrierDisplayName(String carrierDisplayName) {
            $.carrierDisplayName = carrierDisplayName;
            return this;
        }

        public Builder carrierName(String carrierName) {
            $.carrierName = carrierName;
            return this;
        }

        public Builder sasKeyForLabel(String sasKeyForLabel) {
            $.sasKeyForLabel = sasKeyForLabel;
            return this;
        }

        public Builder trackingId(String trackingId) {
            $.trackingId = trackingId;
            return this;
        }

        public Builder trackingUrl(String trackingUrl) {
            $.trackingUrl = trackingUrl;
            return this;
        }

        public ReverseShippingDetailsResponse build() {
            $.carrierDisplayName = Objects.requireNonNull($.carrierDisplayName, "expected parameter 'carrierDisplayName' to be non-null");
            $.carrierName = Objects.requireNonNull($.carrierName, "expected parameter 'carrierName' to be non-null");
            $.sasKeyForLabel = Objects.requireNonNull($.sasKeyForLabel, "expected parameter 'sasKeyForLabel' to be non-null");
            $.trackingId = Objects.requireNonNull($.trackingId, "expected parameter 'trackingId' to be non-null");
            $.trackingUrl = Objects.requireNonNull($.trackingUrl, "expected parameter 'trackingUrl' to be non-null");
            return $;
        }
    }

}
