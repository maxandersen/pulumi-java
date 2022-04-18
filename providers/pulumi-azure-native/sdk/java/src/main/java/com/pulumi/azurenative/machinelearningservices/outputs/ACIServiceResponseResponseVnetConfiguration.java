// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ACIServiceResponseResponseVnetConfiguration {
    /**
     * The name of the virtual network subnet.
     * 
     */
    private final @Nullable String subnetName;
    /**
     * The name of the virtual network.
     * 
     */
    private final @Nullable String vnetName;

    @CustomType.Constructor
    private ACIServiceResponseResponseVnetConfiguration(
        @CustomType.Parameter("subnetName") @Nullable String subnetName,
        @CustomType.Parameter("vnetName") @Nullable String vnetName) {
        this.subnetName = subnetName;
        this.vnetName = vnetName;
    }

    /**
     * The name of the virtual network subnet.
     * 
    */
    public Optional<String> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }
    /**
     * The name of the virtual network.
     * 
    */
    public Optional<String> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponseVnetConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetName;
        private @Nullable String vnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponseVnetConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetName = defaults.subnetName;
    	      this.vnetName = defaults.vnetName;
        }

        public Builder subnetName(@Nullable String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public Builder vnetName(@Nullable String vnetName) {
            this.vnetName = vnetName;
            return this;
        }        public ACIServiceResponseResponseVnetConfiguration build() {
            return new ACIServiceResponseResponseVnetConfiguration(subnetName, vnetName);
        }
    }
}
