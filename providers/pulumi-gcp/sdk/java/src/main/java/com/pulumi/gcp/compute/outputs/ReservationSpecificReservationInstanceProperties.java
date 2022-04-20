// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.ReservationSpecificReservationInstancePropertiesGuestAccelerator;
import com.pulumi.gcp.compute.outputs.ReservationSpecificReservationInstancePropertiesLocalSsd;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReservationSpecificReservationInstanceProperties {
    /**
     * Guest accelerator type and count.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ReservationSpecificReservationInstancePropertiesGuestAccelerator> guestAccelerators;
    /**
     * The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsd> localSsds;
    /**
     * The name of the machine type to reserve.
     * 
     */
    private final String machineType;
    /**
     * The minimum CPU platform for the reservation. For example,
     * `&#34;Intel Skylake&#34;`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
     */
    private final @Nullable String minCpuPlatform;

    @CustomType.Constructor
    private ReservationSpecificReservationInstanceProperties(
        @CustomType.Parameter("guestAccelerators") @Nullable List<ReservationSpecificReservationInstancePropertiesGuestAccelerator> guestAccelerators,
        @CustomType.Parameter("localSsds") @Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsd> localSsds,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("minCpuPlatform") @Nullable String minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.machineType = machineType;
        this.minCpuPlatform = minCpuPlatform;
    }

    /**
     * Guest accelerator type and count.
     * Structure is documented below.
     * 
    */
    public List<ReservationSpecificReservationInstancePropertiesGuestAccelerator> guestAccelerators() {
        return this.guestAccelerators == null ? List.of() : this.guestAccelerators;
    }
    /**
     * The amount of local ssd to reserve with each instance. This
     * reserves disks of type `local-ssd`.
     * Structure is documented below.
     * 
    */
    public List<ReservationSpecificReservationInstancePropertiesLocalSsd> localSsds() {
        return this.localSsds == null ? List.of() : this.localSsds;
    }
    /**
     * The name of the machine type to reserve.
     * 
    */
    public String machineType() {
        return this.machineType;
    }
    /**
     * The minimum CPU platform for the reservation. For example,
     * `&#34;Intel Skylake&#34;`. See
     * the CPU platform availability reference](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform#availablezones)
     * for information on available CPU platforms.
     * 
    */
    public Optional<String> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationInstanceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReservationSpecificReservationInstancePropertiesGuestAccelerator> guestAccelerators;
        private @Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsd> localSsds;
        private String machineType;
        private @Nullable String minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationInstanceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder guestAccelerators(@Nullable List<ReservationSpecificReservationInstancePropertiesGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(ReservationSpecificReservationInstancePropertiesGuestAccelerator... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder localSsds(@Nullable List<ReservationSpecificReservationInstancePropertiesLocalSsd> localSsds) {
            this.localSsds = localSsds;
            return this;
        }
        public Builder localSsds(ReservationSpecificReservationInstancePropertiesLocalSsd... localSsds) {
            return localSsds(List.of(localSsds));
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }        public ReservationSpecificReservationInstanceProperties build() {
            return new ReservationSpecificReservationInstanceProperties(guestAccelerators, localSsds, machineType, minCpuPlatform);
        }
    }
}
