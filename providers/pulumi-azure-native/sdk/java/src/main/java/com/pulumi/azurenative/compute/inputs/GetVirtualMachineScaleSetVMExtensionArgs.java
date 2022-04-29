// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetVMExtensionArgs extends InvokeArgs {

    public static final GetVirtualMachineScaleSetVMExtensionArgs Empty = new GetVirtualMachineScaleSetVMExtensionArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The expand expression to apply on the operation.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The instance ID of the virtual machine.
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return The instance ID of the virtual machine.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine extension.
     * 
     */
    @Import(name="vmExtensionName", required=true)
    private String vmExtensionName;

    /**
     * @return The name of the virtual machine extension.
     * 
     */
    public String vmExtensionName() {
        return this.vmExtensionName;
    }

    /**
     * The name of the VM scale set.
     * 
     */
    @Import(name="vmScaleSetName", required=true)
    private String vmScaleSetName;

    /**
     * @return The name of the VM scale set.
     * 
     */
    public String vmScaleSetName() {
        return this.vmScaleSetName;
    }

    private GetVirtualMachineScaleSetVMExtensionArgs() {}

    private GetVirtualMachineScaleSetVMExtensionArgs(GetVirtualMachineScaleSetVMExtensionArgs $) {
        this.expand = $.expand;
        this.instanceId = $.instanceId;
        this.resourceGroupName = $.resourceGroupName;
        this.vmExtensionName = $.vmExtensionName;
        this.vmScaleSetName = $.vmScaleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachineScaleSetVMExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachineScaleSetVMExtensionArgs $;

        public Builder() {
            $ = new GetVirtualMachineScaleSetVMExtensionArgs();
        }

        public Builder(GetVirtualMachineScaleSetVMExtensionArgs defaults) {
            $ = new GetVirtualMachineScaleSetVMExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The expand expression to apply on the operation.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param instanceId The instance ID of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vmExtensionName The name of the virtual machine extension.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensionName(String vmExtensionName) {
            $.vmExtensionName = vmExtensionName;
            return this;
        }

        /**
         * @param vmScaleSetName The name of the VM scale set.
         * 
         * @return builder
         * 
         */
        public Builder vmScaleSetName(String vmScaleSetName) {
            $.vmScaleSetName = vmScaleSetName;
            return this;
        }

        public GetVirtualMachineScaleSetVMExtensionArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmExtensionName = Objects.requireNonNull($.vmExtensionName, "expected parameter 'vmExtensionName' to be non-null");
            $.vmScaleSetName = Objects.requireNonNull($.vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
            return $;
        }
    }

}
