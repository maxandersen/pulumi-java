// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The health status of the VM.
 * 
 */
public final class VirtualMachineHealthStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineHealthStatusResponse Empty = new VirtualMachineHealthStatusResponse();

    /**
     * The health status information for the VM.
     * 
     */
    @Import(name="status", required=true)
      private final InstanceViewStatusResponse status;

    public InstanceViewStatusResponse status() {
        return this.status;
    }

    public VirtualMachineHealthStatusResponse(InstanceViewStatusResponse status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private VirtualMachineHealthStatusResponse() {
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineHealthStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceViewStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineHealthStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(InstanceViewStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public VirtualMachineHealthStatusResponse build() {
            return new VirtualMachineHealthStatusResponse(status);
        }
    }
}
