// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.AdditionalUnattendContentArgs;
import com.pulumi.azurenative.compute.inputs.PatchSettingsArgs;
import com.pulumi.azurenative.compute.inputs.WinRMConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies Windows operating system settings on the virtual machine.
 * 
 */
public final class WindowsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsConfigurationArgs Empty = new WindowsConfigurationArgs();

    /**
     * Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
     */
    @Import(name="additionalUnattendContent")
      private final @Nullable Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent;

    public Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent() {
        return this.additionalUnattendContent == null ? Codegen.empty() : this.additionalUnattendContent;
    }

    /**
     * Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. <br><br> For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
     */
    @Import(name="enableAutomaticUpdates")
      private final @Nullable Output<Boolean> enableAutomaticUpdates;

    public Output<Boolean> enableAutomaticUpdates() {
        return this.enableAutomaticUpdates == null ? Codegen.empty() : this.enableAutomaticUpdates;
    }

    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
     */
    @Import(name="patchSettings")
      private final @Nullable Output<PatchSettingsArgs> patchSettings;

    public Output<PatchSettingsArgs> patchSettings() {
        return this.patchSettings == null ? Codegen.empty() : this.patchSettings;
    }

    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    @Import(name="provisionVMAgent")
      private final @Nullable Output<Boolean> provisionVMAgent;

    public Output<Boolean> provisionVMAgent() {
        return this.provisionVMAgent == null ? Codegen.empty() : this.provisionVMAgent;
    }

    /**
     * Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". <br><br> Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    /**
     * Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
     */
    @Import(name="winRM")
      private final @Nullable Output<WinRMConfigurationArgs> winRM;

    public Output<WinRMConfigurationArgs> winRM() {
        return this.winRM == null ? Codegen.empty() : this.winRM;
    }

    public WindowsConfigurationArgs(
        @Nullable Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent,
        @Nullable Output<Boolean> enableAutomaticUpdates,
        @Nullable Output<PatchSettingsArgs> patchSettings,
        @Nullable Output<Boolean> provisionVMAgent,
        @Nullable Output<String> timeZone,
        @Nullable Output<WinRMConfigurationArgs> winRM) {
        this.additionalUnattendContent = additionalUnattendContent;
        this.enableAutomaticUpdates = enableAutomaticUpdates;
        this.patchSettings = patchSettings;
        this.provisionVMAgent = provisionVMAgent;
        this.timeZone = timeZone;
        this.winRM = winRM;
    }

    private WindowsConfigurationArgs() {
        this.additionalUnattendContent = Codegen.empty();
        this.enableAutomaticUpdates = Codegen.empty();
        this.patchSettings = Codegen.empty();
        this.provisionVMAgent = Codegen.empty();
        this.timeZone = Codegen.empty();
        this.winRM = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent;
        private @Nullable Output<Boolean> enableAutomaticUpdates;
        private @Nullable Output<PatchSettingsArgs> patchSettings;
        private @Nullable Output<Boolean> provisionVMAgent;
        private @Nullable Output<String> timeZone;
        private @Nullable Output<WinRMConfigurationArgs> winRM;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalUnattendContent = defaults.additionalUnattendContent;
    	      this.enableAutomaticUpdates = defaults.enableAutomaticUpdates;
    	      this.patchSettings = defaults.patchSettings;
    	      this.provisionVMAgent = defaults.provisionVMAgent;
    	      this.timeZone = defaults.timeZone;
    	      this.winRM = defaults.winRM;
        }

        public Builder additionalUnattendContent(@Nullable Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent) {
            this.additionalUnattendContent = additionalUnattendContent;
            return this;
        }
        public Builder additionalUnattendContent(@Nullable List<AdditionalUnattendContentArgs> additionalUnattendContent) {
            this.additionalUnattendContent = Codegen.ofNullable(additionalUnattendContent);
            return this;
        }
        public Builder additionalUnattendContent(AdditionalUnattendContentArgs... additionalUnattendContent) {
            return additionalUnattendContent(List.of(additionalUnattendContent));
        }
        public Builder enableAutomaticUpdates(@Nullable Output<Boolean> enableAutomaticUpdates) {
            this.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }
        public Builder enableAutomaticUpdates(@Nullable Boolean enableAutomaticUpdates) {
            this.enableAutomaticUpdates = Codegen.ofNullable(enableAutomaticUpdates);
            return this;
        }
        public Builder patchSettings(@Nullable Output<PatchSettingsArgs> patchSettings) {
            this.patchSettings = patchSettings;
            return this;
        }
        public Builder patchSettings(@Nullable PatchSettingsArgs patchSettings) {
            this.patchSettings = Codegen.ofNullable(patchSettings);
            return this;
        }
        public Builder provisionVMAgent(@Nullable Output<Boolean> provisionVMAgent) {
            this.provisionVMAgent = provisionVMAgent;
            return this;
        }
        public Builder provisionVMAgent(@Nullable Boolean provisionVMAgent) {
            this.provisionVMAgent = Codegen.ofNullable(provisionVMAgent);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }
        public Builder winRM(@Nullable Output<WinRMConfigurationArgs> winRM) {
            this.winRM = winRM;
            return this;
        }
        public Builder winRM(@Nullable WinRMConfigurationArgs winRM) {
            this.winRM = Codegen.ofNullable(winRM);
            return this;
        }        public WindowsConfigurationArgs build() {
            return new WindowsConfigurationArgs(additionalUnattendContent, enableAutomaticUpdates, patchSettings, provisionVMAgent, timeZone, winRM);
        }
    }
}
