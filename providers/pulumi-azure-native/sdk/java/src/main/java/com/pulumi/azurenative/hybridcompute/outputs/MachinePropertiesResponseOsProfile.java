// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MachinePropertiesResponseOsProfile {
    /**
     * Specifies the host OS name of the hybrid machine.
     * 
     */
    private final String computerName;

    @CustomType.Constructor
    private MachinePropertiesResponseOsProfile(@CustomType.Parameter("computerName") String computerName) {
        this.computerName = computerName;
    }

    /**
     * Specifies the host OS name of the hybrid machine.
     * 
    */
    public String computerName() {
        return this.computerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachinePropertiesResponseOsProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computerName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachinePropertiesResponseOsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerName = defaults.computerName;
        }

        public Builder computerName(String computerName) {
            this.computerName = Objects.requireNonNull(computerName);
            return this;
        }        public MachinePropertiesResponseOsProfile build() {
            return new MachinePropertiesResponseOsProfile(computerName);
        }
    }
}
