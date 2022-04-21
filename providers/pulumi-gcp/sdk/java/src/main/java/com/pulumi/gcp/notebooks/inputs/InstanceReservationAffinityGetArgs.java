// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceReservationAffinityGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinityGetArgs Empty = new InstanceReservationAffinityGetArgs();

    /**
     * The type of Compute Reservation.
     * Possible values are `NO_RESERVATION`, `ANY_RESERVATION`, and `SPECIFIC_RESERVATION`.
     * 
     */
    @Import(name="consumeReservationType", required=true)
    private Output<String> consumeReservationType;

    public Output<String> consumeReservationType() {
        return this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of reservation resource.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Corresponds to the label values of reservation resource.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private InstanceReservationAffinityGetArgs() {}

    private InstanceReservationAffinityGetArgs(InstanceReservationAffinityGetArgs $) {
        this.consumeReservationType = $.consumeReservationType;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceReservationAffinityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceReservationAffinityGetArgs $;

        public Builder() {
            $ = new InstanceReservationAffinityGetArgs();
        }

        public Builder(InstanceReservationAffinityGetArgs defaults) {
            $ = new InstanceReservationAffinityGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder consumeReservationType(Output<String> consumeReservationType) {
            $.consumeReservationType = consumeReservationType;
            return this;
        }

        public Builder consumeReservationType(String consumeReservationType) {
            return consumeReservationType(Output.of(consumeReservationType));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public InstanceReservationAffinityGetArgs build() {
            $.consumeReservationType = Objects.requireNonNull($.consumeReservationType, "expected parameter 'consumeReservationType' to be non-null");
            return $;
        }
    }

}
