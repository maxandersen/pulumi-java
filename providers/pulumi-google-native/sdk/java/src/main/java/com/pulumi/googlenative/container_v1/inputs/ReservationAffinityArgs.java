// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.container_v1.enums.ReservationAffinityConsumeReservationType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [ReservationAffinity](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) is the configuration of desired reservation which instances could take capacity from.
 * 
 */
public final class ReservationAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationAffinityArgs Empty = new ReservationAffinityArgs();

    /**
     * Corresponds to the type of reservation consumption.
     * 
     */
    @Import(name="consumeReservationType")
      private final @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;

    public Output<ReservationAffinityConsumeReservationType> consumeReservationType() {
        return this.consumeReservationType == null ? Codegen.empty() : this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * Corresponds to the label value(s) of reservation resource(s).
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public ReservationAffinityArgs(
        @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType,
        @Nullable Output<String> key,
        @Nullable Output<List<String>> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    private ReservationAffinityArgs() {
        this.consumeReservationType = Codegen.empty();
        this.key = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;
        private @Nullable Output<String> key;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(@Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType) {
            this.consumeReservationType = consumeReservationType;
            return this;
        }
        public Builder consumeReservationType(@Nullable ReservationAffinityConsumeReservationType consumeReservationType) {
            this.consumeReservationType = Codegen.ofNullable(consumeReservationType);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ReservationAffinityArgs build() {
            return new ReservationAffinityArgs(consumeReservationType, key, values);
        }
    }
}
