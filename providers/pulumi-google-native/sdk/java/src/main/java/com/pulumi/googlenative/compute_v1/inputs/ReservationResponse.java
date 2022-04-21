// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.AllocationSpecificSKUReservationResponse;
import com.pulumi.googlenative.compute_v1.inputs.ShareSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a reservation resource. A reservation ensures that capacity is held in a specific zone even if the reserved VMs are not running. For more information, read Reserving zonal resources.
 * 
 */
public final class ReservationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReservationResponse Empty = new ReservationResponse();

    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    @Import(name="commitment", required=true)
    private String commitment;

    public String commitment() {
        return this.commitment;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp", required=true)
    private String creationTimestamp;

    public String creationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Reserved for future use.
     * 
     */
    @Import(name="satisfiesPzs", required=true)
    private Boolean satisfiesPzs;

    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }

    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @Import(name="selfLink", required=true)
    private String selfLink;

    public String selfLink() {
        return this.selfLink;
    }

    /**
     * Share-settings for shared-reservation
     * 
     */
    @Import(name="shareSettings", required=true)
    private ShareSettingsResponse shareSettings;

    public ShareSettingsResponse shareSettings() {
        return this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    @Import(name="specificReservation", required=true)
    private AllocationSpecificSKUReservationResponse specificReservation;

    public AllocationSpecificSKUReservationResponse specificReservation() {
        return this.specificReservation;
    }

    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for &#34;any&#34; reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    @Import(name="specificReservationRequired", required=true)
    private Boolean specificReservationRequired;

    public Boolean specificReservationRequired() {
        return this.specificReservationRequired;
    }

    /**
     * The status of the reservation.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private ReservationResponse() {}

    private ReservationResponse(ReservationResponse $) {
        this.commitment = $.commitment;
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.kind = $.kind;
        this.name = $.name;
        this.satisfiesPzs = $.satisfiesPzs;
        this.selfLink = $.selfLink;
        this.shareSettings = $.shareSettings;
        this.specificReservation = $.specificReservation;
        this.specificReservationRequired = $.specificReservationRequired;
        this.status = $.status;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationResponse $;

        public Builder() {
            $ = new ReservationResponse();
        }

        public Builder(ReservationResponse defaults) {
            $ = new ReservationResponse(Objects.requireNonNull(defaults));
        }

        public Builder commitment(String commitment) {
            $.commitment = commitment;
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            $.satisfiesPzs = satisfiesPzs;
            return this;
        }

        public Builder selfLink(String selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder shareSettings(ShareSettingsResponse shareSettings) {
            $.shareSettings = shareSettings;
            return this;
        }

        public Builder specificReservation(AllocationSpecificSKUReservationResponse specificReservation) {
            $.specificReservation = specificReservation;
            return this;
        }

        public Builder specificReservationRequired(Boolean specificReservationRequired) {
            $.specificReservationRequired = specificReservationRequired;
            return this;
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public ReservationResponse build() {
            $.commitment = Objects.requireNonNull($.commitment, "expected parameter 'commitment' to be non-null");
            $.creationTimestamp = Objects.requireNonNull($.creationTimestamp, "expected parameter 'creationTimestamp' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.satisfiesPzs = Objects.requireNonNull($.satisfiesPzs, "expected parameter 'satisfiesPzs' to be non-null");
            $.selfLink = Objects.requireNonNull($.selfLink, "expected parameter 'selfLink' to be non-null");
            $.shareSettings = Objects.requireNonNull($.shareSettings, "expected parameter 'shareSettings' to be non-null");
            $.specificReservation = Objects.requireNonNull($.specificReservation, "expected parameter 'specificReservation' to be non-null");
            $.specificReservationRequired = Objects.requireNonNull($.specificReservationRequired, "expected parameter 'specificReservationRequired' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
