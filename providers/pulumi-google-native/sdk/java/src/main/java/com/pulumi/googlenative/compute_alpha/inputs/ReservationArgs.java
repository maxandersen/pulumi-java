// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.inputs.AllocationSpecificSKUReservationArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShareSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a reservation resource. A reservation ensures that capacity is held in a specific zone even if the reserved VMs are not running. For more information, read Reserving zonal resources.
 * 
 */
public final class ReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationArgs Empty = new ReservationArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Share-settings for shared-reservation
     * 
     */
    @Import(name="shareSettings")
      private final @Nullable Output<ShareSettingsArgs> shareSettings;

    public Output<ShareSettingsArgs> shareSettings() {
        return this.shareSettings == null ? Codegen.empty() : this.shareSettings;
    }

    /**
     * Reservation for instances with specific machine shapes.
     * 
     */
    @Import(name="specificReservation")
      private final @Nullable Output<AllocationSpecificSKUReservationArgs> specificReservation;

    public Output<AllocationSpecificSKUReservationArgs> specificReservation() {
        return this.specificReservation == null ? Codegen.empty() : this.specificReservation;
    }

    /**
     * Indicates whether the reservation can be consumed by VMs with affinity for &#34;any&#34; reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
     * 
     */
    @Import(name="specificReservationRequired")
      private final @Nullable Output<Boolean> specificReservationRequired;

    public Output<Boolean> specificReservationRequired() {
        return this.specificReservationRequired == null ? Codegen.empty() : this.specificReservationRequired;
    }

    /**
     * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public ReservationArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<ShareSettingsArgs> shareSettings,
        @Nullable Output<AllocationSpecificSKUReservationArgs> specificReservation,
        @Nullable Output<Boolean> specificReservationRequired,
        @Nullable Output<String> zone) {
        this.description = description;
        this.name = name;
        this.shareSettings = shareSettings;
        this.specificReservation = specificReservation;
        this.specificReservationRequired = specificReservationRequired;
        this.zone = zone;
    }

    private ReservationArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.shareSettings = Codegen.empty();
        this.specificReservation = Codegen.empty();
        this.specificReservationRequired = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<ShareSettingsArgs> shareSettings;
        private @Nullable Output<AllocationSpecificSKUReservationArgs> specificReservation;
        private @Nullable Output<Boolean> specificReservationRequired;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.shareSettings = defaults.shareSettings;
    	      this.specificReservation = defaults.specificReservation;
    	      this.specificReservationRequired = defaults.specificReservationRequired;
    	      this.zone = defaults.zone;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder shareSettings(@Nullable Output<ShareSettingsArgs> shareSettings) {
            this.shareSettings = shareSettings;
            return this;
        }
        public Builder shareSettings(@Nullable ShareSettingsArgs shareSettings) {
            this.shareSettings = Codegen.ofNullable(shareSettings);
            return this;
        }
        public Builder specificReservation(@Nullable Output<AllocationSpecificSKUReservationArgs> specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }
        public Builder specificReservation(@Nullable AllocationSpecificSKUReservationArgs specificReservation) {
            this.specificReservation = Codegen.ofNullable(specificReservation);
            return this;
        }
        public Builder specificReservationRequired(@Nullable Output<Boolean> specificReservationRequired) {
            this.specificReservationRequired = specificReservationRequired;
            return this;
        }
        public Builder specificReservationRequired(@Nullable Boolean specificReservationRequired) {
            this.specificReservationRequired = Codegen.ofNullable(specificReservationRequired);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public ReservationArgs build() {
            return new ReservationArgs(description, name, shareSettings, specificReservation, specificReservationRequired, zone);
        }
    }
}
