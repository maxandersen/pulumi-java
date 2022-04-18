// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.LinuxPatchSettingsResponse;
import com.pulumi.azurenative.compute.inputs.SshConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
 * 
 */
public final class LinuxConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinuxConfigurationResponse Empty = new LinuxConfigurationResponse();

    /**
     * Specifies whether password authentication should be disabled.
     * 
     */
    @Import(name="disablePasswordAuthentication")
      private final @Nullable Boolean disablePasswordAuthentication;

    public Optional<Boolean> disablePasswordAuthentication() {
        return this.disablePasswordAuthentication == null ? Optional.empty() : Optional.ofNullable(this.disablePasswordAuthentication);
    }

    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Linux.
     * 
     */
    @Import(name="patchSettings")
      private final @Nullable LinuxPatchSettingsResponse patchSettings;

    public Optional<LinuxPatchSettingsResponse> patchSettings() {
        return this.patchSettings == null ? Optional.empty() : Optional.ofNullable(this.patchSettings);
    }

    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    @Import(name="provisionVMAgent")
      private final @Nullable Boolean provisionVMAgent;

    public Optional<Boolean> provisionVMAgent() {
        return this.provisionVMAgent == null ? Optional.empty() : Optional.ofNullable(this.provisionVMAgent);
    }

    /**
     * Specifies the ssh key configuration for a Linux OS.
     * 
     */
    @Import(name="ssh")
      private final @Nullable SshConfigurationResponse ssh;

    public Optional<SshConfigurationResponse> ssh() {
        return this.ssh == null ? Optional.empty() : Optional.ofNullable(this.ssh);
    }

    public LinuxConfigurationResponse(
        @Nullable Boolean disablePasswordAuthentication,
        @Nullable LinuxPatchSettingsResponse patchSettings,
        @Nullable Boolean provisionVMAgent,
        @Nullable SshConfigurationResponse ssh) {
        this.disablePasswordAuthentication = disablePasswordAuthentication;
        this.patchSettings = patchSettings;
        this.provisionVMAgent = provisionVMAgent;
        this.ssh = ssh;
    }

    private LinuxConfigurationResponse() {
        this.disablePasswordAuthentication = null;
        this.patchSettings = null;
        this.provisionVMAgent = null;
        this.ssh = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disablePasswordAuthentication;
        private @Nullable LinuxPatchSettingsResponse patchSettings;
        private @Nullable Boolean provisionVMAgent;
        private @Nullable SshConfigurationResponse ssh;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disablePasswordAuthentication = defaults.disablePasswordAuthentication;
    	      this.patchSettings = defaults.patchSettings;
    	      this.provisionVMAgent = defaults.provisionVMAgent;
    	      this.ssh = defaults.ssh;
        }

        public Builder disablePasswordAuthentication(@Nullable Boolean disablePasswordAuthentication) {
            this.disablePasswordAuthentication = disablePasswordAuthentication;
            return this;
        }
        public Builder patchSettings(@Nullable LinuxPatchSettingsResponse patchSettings) {
            this.patchSettings = patchSettings;
            return this;
        }
        public Builder provisionVMAgent(@Nullable Boolean provisionVMAgent) {
            this.provisionVMAgent = provisionVMAgent;
            return this;
        }
        public Builder ssh(@Nullable SshConfigurationResponse ssh) {
            this.ssh = ssh;
            return this;
        }        public LinuxConfigurationResponse build() {
            return new LinuxConfigurationResponse(disablePasswordAuthentication, patchSettings, provisionVMAgent, ssh);
        }
    }
}
