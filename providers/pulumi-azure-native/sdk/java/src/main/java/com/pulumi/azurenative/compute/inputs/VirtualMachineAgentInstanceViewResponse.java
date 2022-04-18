// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.azurenative.compute.inputs.VirtualMachineExtensionHandlerInstanceViewResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of the VM Agent running on the virtual machine.
 * 
 */
public final class VirtualMachineAgentInstanceViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineAgentInstanceViewResponse Empty = new VirtualMachineAgentInstanceViewResponse();

    /**
     * The virtual machine extension handler instance view.
     * 
     */
    @Import(name="extensionHandlers")
      private final @Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers;

    public List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers() {
        return this.extensionHandlers == null ? List.of() : this.extensionHandlers;
    }

    /**
     * The resource status information.
     * 
     */
    @Import(name="statuses")
      private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * The VM Agent full version.
     * 
     */
    @Import(name="vmAgentVersion")
      private final @Nullable String vmAgentVersion;

    public Optional<String> vmAgentVersion() {
        return this.vmAgentVersion == null ? Optional.empty() : Optional.ofNullable(this.vmAgentVersion);
    }

    public VirtualMachineAgentInstanceViewResponse(
        @Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers,
        @Nullable List<InstanceViewStatusResponse> statuses,
        @Nullable String vmAgentVersion) {
        this.extensionHandlers = extensionHandlers;
        this.statuses = statuses;
        this.vmAgentVersion = vmAgentVersion;
    }

    private VirtualMachineAgentInstanceViewResponse() {
        this.extensionHandlers = List.of();
        this.statuses = List.of();
        this.vmAgentVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineAgentInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable String vmAgentVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineAgentInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionHandlers = defaults.extensionHandlers;
    	      this.statuses = defaults.statuses;
    	      this.vmAgentVersion = defaults.vmAgentVersion;
        }

        public Builder extensionHandlers(@Nullable List<VirtualMachineExtensionHandlerInstanceViewResponse> extensionHandlers) {
            this.extensionHandlers = extensionHandlers;
            return this;
        }
        public Builder extensionHandlers(VirtualMachineExtensionHandlerInstanceViewResponse... extensionHandlers) {
            return extensionHandlers(List.of(extensionHandlers));
        }
        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(InstanceViewStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder vmAgentVersion(@Nullable String vmAgentVersion) {
            this.vmAgentVersion = vmAgentVersion;
            return this;
        }        public VirtualMachineAgentInstanceViewResponse build() {
            return new VirtualMachineAgentInstanceViewResponse(extensionHandlers, statuses, vmAgentVersion);
        }
    }
}
