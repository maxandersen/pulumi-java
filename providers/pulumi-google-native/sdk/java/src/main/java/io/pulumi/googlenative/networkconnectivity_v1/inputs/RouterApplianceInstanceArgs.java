// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A router appliance instance is a Compute Engine virtual machine (VM) instance that acts as a BGP speaker. A router appliance instance is specified by the URI of the VM and the internal IP address of one of the VM's network interfaces.
 * 
 */
public final class RouterApplianceInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterApplianceInstanceArgs Empty = new RouterApplianceInstanceArgs();

    /**
     * The IP address on the VM to use for peering.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * The URI of the VM.
     * 
     */
    @Import(name="virtualMachine")
      private final @Nullable Output<String> virtualMachine;

    public Output<String> virtualMachine() {
        return this.virtualMachine == null ? Codegen.empty() : this.virtualMachine;
    }

    public RouterApplianceInstanceArgs(
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> virtualMachine) {
        this.ipAddress = ipAddress;
        this.virtualMachine = virtualMachine;
    }

    private RouterApplianceInstanceArgs() {
        this.ipAddress = Codegen.empty();
        this.virtualMachine = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterApplianceInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterApplianceInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder virtualMachine(@Nullable Output<String> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }
        public Builder virtualMachine(@Nullable String virtualMachine) {
            this.virtualMachine = Codegen.ofNullable(virtualMachine);
            return this;
        }        public RouterApplianceInstanceArgs build() {
            return new RouterApplianceInstanceArgs(ipAddress, virtualMachine);
        }
    }
}
