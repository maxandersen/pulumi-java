// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HardwareProfileResponse {
    /**
     * Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set.
     * 
     */
    private final @Nullable String vmSize;

    @CustomType.Constructor
    private HardwareProfileResponse(@CustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.vmSize = vmSize;
    }

    /**
     * Specifies the size of the virtual machine. &lt;br&gt;&lt;br&gt; The enum data type is currently deprecated and will be removed by December 23rd 2023. &lt;br&gt;&lt;br&gt; Recommended way to get the list of available sizes is using these APIs: &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in an availability set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes in a region](https://docs.microsoft.com/rest/api/compute/resourceskus/list) &lt;br&gt;&lt;br&gt; [List all available virtual machine sizes for resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information about virtual machine sizes, see [Sizes for virtual machines](https://docs.microsoft.com/azure/virtual-machines/sizes). &lt;br&gt;&lt;br&gt; The available VM sizes depend on region and availability set.
     * 
    */
    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HardwareProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(HardwareProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vmSize = defaults.vmSize;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public HardwareProfileResponse build() {
            return new HardwareProfileResponse(vmSize);
        }
    }
}
