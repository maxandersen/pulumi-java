// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the operating system settings for the role instance.
 * 
 */
public final class NetworkFunctionUserConfigurationResponseOsProfile extends io.pulumi.resources.InvokeArgs {

    public static final NetworkFunctionUserConfigurationResponseOsProfile Empty = new NetworkFunctionUserConfigurationResponseOsProfile();

    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. <br><br> **Note: Do not pass any secrets or passwords in customData property** <br><br> This property cannot be updated after the VM is created. <br><br> customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) <br><br> For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * 
     */
    @Import(name="customData")
      private final @Nullable String customData;

    public Optional<String> customData() {
        return this.customData == null ? Optional.empty() : Optional.ofNullable(this.customData);
    }

    public NetworkFunctionUserConfigurationResponseOsProfile(@Nullable String customData) {
        this.customData = customData;
    }

    private NetworkFunctionUserConfigurationResponseOsProfile() {
        this.customData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionUserConfigurationResponseOsProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customData;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionUserConfigurationResponseOsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customData = defaults.customData;
        }

        public Builder customData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }        public NetworkFunctionUserConfigurationResponseOsProfile build() {
            return new NetworkFunctionUserConfigurationResponseOsProfile(customData);
        }
    }
}
