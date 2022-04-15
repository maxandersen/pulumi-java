// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.enums.TransportShipmentTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Preferences related to the shipment logistics of the sku
 * 
 */
public final class TransportPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransportPreferencesArgs Empty = new TransportPreferencesArgs();

    /**
     * Indicates Shipment Logistics type that the customer preferred.
     * 
     */
    @Import(name="preferredShipmentType", required=true)
      private final Output<Either<String,TransportShipmentTypes>> preferredShipmentType;

    public Output<Either<String,TransportShipmentTypes>> preferredShipmentType() {
        return this.preferredShipmentType;
    }

    public TransportPreferencesArgs(Output<Either<String,TransportShipmentTypes>> preferredShipmentType) {
        this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType, "expected parameter 'preferredShipmentType' to be non-null");
    }

    private TransportPreferencesArgs() {
        this.preferredShipmentType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransportPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,TransportShipmentTypes>> preferredShipmentType;

        public Builder() {
    	      // Empty
        }

        public Builder(TransportPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredShipmentType = defaults.preferredShipmentType;
        }

        public Builder preferredShipmentType(Output<Either<String,TransportShipmentTypes>> preferredShipmentType) {
            this.preferredShipmentType = Objects.requireNonNull(preferredShipmentType);
            return this;
        }
        public Builder preferredShipmentType(Either<String,TransportShipmentTypes> preferredShipmentType) {
            this.preferredShipmentType = Output.of(Objects.requireNonNull(preferredShipmentType));
            return this;
        }        public TransportPreferencesArgs build() {
            return new TransportPreferencesArgs(preferredShipmentType);
        }
    }
}
