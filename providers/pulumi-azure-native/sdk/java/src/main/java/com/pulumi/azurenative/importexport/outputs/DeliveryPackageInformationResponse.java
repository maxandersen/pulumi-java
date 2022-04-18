// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPackageInformationResponse {
    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
     */
    private final String carrierName;
    /**
     * The number of drives included in the package.
     * 
     */
    private final @Nullable Double driveCount;
    /**
     * The date when the package is shipped.
     * 
     */
    private final @Nullable String shipDate;
    /**
     * The tracking number of the package.
     * 
     */
    private final String trackingNumber;

    @CustomType.Constructor
    private DeliveryPackageInformationResponse(
        @CustomType.Parameter("carrierName") String carrierName,
        @CustomType.Parameter("driveCount") @Nullable Double driveCount,
        @CustomType.Parameter("shipDate") @Nullable String shipDate,
        @CustomType.Parameter("trackingNumber") String trackingNumber) {
        this.carrierName = carrierName;
        this.driveCount = driveCount;
        this.shipDate = shipDate;
        this.trackingNumber = trackingNumber;
    }

    /**
     * The name of the carrier that is used to ship the import or export drives.
     * 
    */
    public String carrierName() {
        return this.carrierName;
    }
    /**
     * The number of drives included in the package.
     * 
    */
    public Optional<Double> driveCount() {
        return Optional.ofNullable(this.driveCount);
    }
    /**
     * The date when the package is shipped.
     * 
    */
    public Optional<String> shipDate() {
        return Optional.ofNullable(this.shipDate);
    }
    /**
     * The tracking number of the package.
     * 
    */
    public String trackingNumber() {
        return this.trackingNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPackageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private @Nullable Double driveCount;
        private @Nullable String shipDate;
        private String trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPackageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder carrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }
        public Builder driveCount(@Nullable Double driveCount) {
            this.driveCount = driveCount;
            return this;
        }
        public Builder shipDate(@Nullable String shipDate) {
            this.shipDate = shipDate;
            return this;
        }
        public Builder trackingNumber(String trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }        public DeliveryPackageInformationResponse build() {
            return new DeliveryPackageInformationResponse(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
