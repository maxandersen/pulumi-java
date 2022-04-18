// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HardwareProfileResponse {
    /**
     * Specifies the HANA instance SKU.
     * 
     */
    private final String hanaInstanceSize;
    /**
     * Name of the hardware type (vendor and/or their product name)
     * 
     */
    private final String hardwareType;

    @CustomType.Constructor
    private HardwareProfileResponse(
        @CustomType.Parameter("hanaInstanceSize") String hanaInstanceSize,
        @CustomType.Parameter("hardwareType") String hardwareType) {
        this.hanaInstanceSize = hanaInstanceSize;
        this.hardwareType = hardwareType;
    }

    /**
     * Specifies the HANA instance SKU.
     * 
    */
    public String hanaInstanceSize() {
        return this.hanaInstanceSize;
    }
    /**
     * Name of the hardware type (vendor and/or their product name)
     * 
    */
    public String hardwareType() {
        return this.hardwareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hanaInstanceSize;
        private String hardwareType;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hanaInstanceSize = defaults.hanaInstanceSize;
    	      this.hardwareType = defaults.hardwareType;
        }

        public Builder hanaInstanceSize(String hanaInstanceSize) {
            this.hanaInstanceSize = Objects.requireNonNull(hanaInstanceSize);
            return this;
        }
        public Builder hardwareType(String hardwareType) {
            this.hardwareType = Objects.requireNonNull(hardwareType);
            return this;
        }        public HardwareProfileResponse build() {
            return new HardwareProfileResponse(hanaInstanceSize, hardwareType);
        }
    }
}
