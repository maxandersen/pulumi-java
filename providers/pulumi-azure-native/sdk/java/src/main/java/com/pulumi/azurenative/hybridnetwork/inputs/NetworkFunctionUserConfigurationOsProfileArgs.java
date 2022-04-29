// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the operating system settings for the role instance.
 * 
 */
public final class NetworkFunctionUserConfigurationOsProfileArgs extends ResourceArgs {

    public static final NetworkFunctionUserConfigurationOsProfileArgs Empty = new NetworkFunctionUserConfigurationOsProfileArgs();

    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * 
     */
    @Import(name="customData")
    private @Nullable Output<String> customData;

    /**
     * @return Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * 
     */
    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    private NetworkFunctionUserConfigurationOsProfileArgs() {}

    private NetworkFunctionUserConfigurationOsProfileArgs(NetworkFunctionUserConfigurationOsProfileArgs $) {
        this.customData = $.customData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkFunctionUserConfigurationOsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkFunctionUserConfigurationOsProfileArgs $;

        public Builder() {
            $ = new NetworkFunctionUserConfigurationOsProfileArgs();
        }

        public Builder(NetworkFunctionUserConfigurationOsProfileArgs defaults) {
            $ = new NetworkFunctionUserConfigurationOsProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customData Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
         * 
         * @return builder
         * 
         */
        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        /**
         * @param customData Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. &lt;br&gt;&lt;br&gt; **Note: Do not pass any secrets or passwords in customData property** &lt;br&gt;&lt;br&gt; This property cannot be updated after the VM is created. &lt;br&gt;&lt;br&gt; customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) &lt;br&gt;&lt;br&gt; For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
         * 
         * @return builder
         * 
         */
        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        public NetworkFunctionUserConfigurationOsProfileArgs build() {
            return $;
        }
    }

}
