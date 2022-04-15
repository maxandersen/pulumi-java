// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualMachineImageResponse {
    /**
     * Virtual Machine image path
     * 
     */
    private final String id;

    @CustomType.Constructor
    private VirtualMachineImageResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * Virtual Machine image path
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public VirtualMachineImageResponse build() {
            return new VirtualMachineImageResponse(id);
        }
    }
}
