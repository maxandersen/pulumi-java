// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.AllocationSpecificSKUReservationResponse;
import com.pulumi.googlenative.compute_alpha.outputs.ShareSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReservationResult {
    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
     */
    private final String commitment;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
     */
    private final String kind;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * Share-settings for shared-reservation
     * 
     */
    private final ShareSettingsResponse shareSettings;
    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    private final AllocationSpecificSKUReservationResponse specificReservation;
    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for &#34;any&#34; reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    private final Boolean specificReservationRequired;
    /**
     * The status of the reservation.
     * 
     */
    private final String status;
    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetReservationResult(
        @CustomType.Parameter("commitment") String commitment,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("shareSettings") ShareSettingsResponse shareSettings,
        @CustomType.Parameter("specificReservation") AllocationSpecificSKUReservationResponse specificReservation,
        @CustomType.Parameter("specificReservationRequired") Boolean specificReservationRequired,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("zone") String zone) {
        this.commitment = commitment;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.satisfiesPzs = satisfiesPzs;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.shareSettings = shareSettings;
        this.specificReservation = specificReservation;
        this.specificReservationRequired = specificReservationRequired;
        this.status = status;
        this.zone = zone;
    }

    /**
     * Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
     * 
    */
    public String commitment() {
        return this.commitment;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#reservations for reservations.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
    */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Share-settings for shared-reservation
     * 
    */
    public ShareSettingsResponse shareSettings() {
        return this.shareSettings;
    }
    /**
     * Reservation for instances with specific machine shapes.
     * 
    */
    public AllocationSpecificSKUReservationResponse specificReservation() {
        return this.specificReservation;
    }
    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for &#34;any&#34; reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
    */
    public Boolean specificReservationRequired() {
        return this.specificReservationRequired;
    }
    /**
     * The status of the reservation.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
    */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitment;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private ShareSettingsResponse shareSettings;
        private AllocationSpecificSKUReservationResponse specificReservation;
        private Boolean specificReservationRequired;
        private String status;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReservationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitment = defaults.commitment;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        public Builder commitment(String commitment) {
            this.commitment = Objects.requireNonNull(commitment);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder shareSettings(ShareSettingsResponse shareSettings) {
            this.shareSettings = Objects.requireNonNull(shareSettings);
            return this;
        }
        public Builder specificReservation(AllocationSpecificSKUReservationResponse specificReservation) {
            this.specificReservation = Objects.requireNonNull(specificReservation);
            return this;
        }
        public Builder specificReservationRequired(Boolean specificReservationRequired) {
            this.specificReservationRequired = Objects.requireNonNull(specificReservationRequired);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetReservationResult build() {
            return new GetReservationResult(commitment, creationTimestamp, description, kind, name, satisfiesPzs, selfLink, selfLinkWithId, shareSettings, specificReservation, specificReservationRequired, status, zone);
        }
    }
}
