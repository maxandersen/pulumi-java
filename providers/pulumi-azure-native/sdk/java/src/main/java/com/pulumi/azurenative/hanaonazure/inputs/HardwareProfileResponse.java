// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the hardware settings for the HANA instance.
 * 
 */
public final class HardwareProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final HardwareProfileResponse Empty = new HardwareProfileResponse();

    /**
     * Specifies the HANA instance SKU.
     * 
     */
    @Import(name="hanaInstanceSize", required=true)
      private final String hanaInstanceSize;

    public String hanaInstanceSize() {
        return this.hanaInstanceSize;
    }

    /**
     * Name of the hardware type (vendor and/or their product name)
     * 
     */
    @Import(name="hardwareType", required=true)
      private final String hardwareType;

    public String hardwareType() {
        return this.hardwareType;
    }

    public HardwareProfileResponse(
        String hanaInstanceSize,
        String hardwareType) {
        this.hanaInstanceSize = Objects.requireNonNull(hanaInstanceSize, "expected parameter 'hanaInstanceSize' to be non-null");
        this.hardwareType = Objects.requireNonNull(hardwareType, "expected parameter 'hardwareType' to be non-null");
    }

    private HardwareProfileResponse() {
        this.hanaInstanceSize = null;
        this.hardwareType = null;
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
