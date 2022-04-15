// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A router appliance instance is a Compute Engine virtual machine (VM) instance that acts as a BGP speaker. A router appliance instance is specified by the URI of the VM and the internal IP address of one of the VM's network interfaces.
 * 
 */
public final class RouterApplianceInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterApplianceInstanceResponse Empty = new RouterApplianceInstanceResponse();

    /**
     * The IP address on the VM to use for peering.
     * 
     */
    @Import(name="ipAddress", required=true)
      private final String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * The URI of the VM.
     * 
     */
    @Import(name="virtualMachine", required=true)
      private final String virtualMachine;

    public String virtualMachine() {
        return this.virtualMachine;
    }

    public RouterApplianceInstanceResponse(
        String ipAddress,
        String virtualMachine) {
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.virtualMachine = Objects.requireNonNull(virtualMachine, "expected parameter 'virtualMachine' to be non-null");
    }

    private RouterApplianceInstanceResponse() {
        this.ipAddress = null;
        this.virtualMachine = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterApplianceInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterApplianceInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder virtualMachine(String virtualMachine) {
            this.virtualMachine = Objects.requireNonNull(virtualMachine);
            return this;
        }        public RouterApplianceInstanceResponse build() {
            return new RouterApplianceInstanceResponse(ipAddress, virtualMachine);
        }
    }
}
