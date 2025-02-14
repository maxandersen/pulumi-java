// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for this topic&#39;s Reservation usage.
 * 
 */
public final class ReservationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationConfigArgs Empty = new ReservationConfigArgs();

    /**
     * The Reservation to use for this topic&#39;s throughput capacity. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    @Import(name="throughputReservation")
    private @Nullable Output<String> throughputReservation;

    /**
     * @return The Reservation to use for this topic&#39;s throughput capacity. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    public Optional<Output<String>> throughputReservation() {
        return Optional.ofNullable(this.throughputReservation);
    }

    private ReservationConfigArgs() {}

    private ReservationConfigArgs(ReservationConfigArgs $) {
        this.throughputReservation = $.throughputReservation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationConfigArgs $;

        public Builder() {
            $ = new ReservationConfigArgs();
        }

        public Builder(ReservationConfigArgs defaults) {
            $ = new ReservationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param throughputReservation The Reservation to use for this topic&#39;s throughput capacity. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
         * 
         * @return builder
         * 
         */
        public Builder throughputReservation(@Nullable Output<String> throughputReservation) {
            $.throughputReservation = throughputReservation;
            return this;
        }

        /**
         * @param throughputReservation The Reservation to use for this topic&#39;s throughput capacity. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
         * 
         * @return builder
         * 
         */
        public Builder throughputReservation(String throughputReservation) {
            return throughputReservation(Output.of(throughputReservation));
        }

        public ReservationConfigArgs build() {
            return $;
        }
    }

}
