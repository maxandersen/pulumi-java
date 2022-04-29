// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.inputs.VirtualMachineExtensionInstanceViewArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineExtensionArgs extends ResourceArgs {

    public static final VirtualMachineExtensionArgs Empty = new VirtualMachineExtensionArgs();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    @Import(name="enableAutomaticUpgrade")
    private @Nullable Output<Boolean> enableAutomaticUpgrade;

    /**
     * @return Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticUpgrade() {
        return Optional.ofNullable(this.enableAutomaticUpgrade);
    }

    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
    private @Nullable Output<String> forceUpdateTag;

    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    public Optional<Output<String>> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * The virtual machine extension instance view.
     * 
     */
    @Import(name="instanceView")
    private @Nullable Output<VirtualMachineExtensionInstanceViewArgs> instanceView;

    /**
     * @return The virtual machine extension instance view.
     * 
     */
    public Optional<Output<VirtualMachineExtensionInstanceViewArgs>> instanceView() {
        return Optional.ofNullable(this.instanceView);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<Object> protectedSettings;

    /**
     * @return The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    public Optional<Output<Object>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return The name of the extension handler publisher.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Json formatted public settings for the extension.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<Object> settings;

    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    public Optional<Output<Object>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the type of the extension; an example is &#34;CustomScriptExtension&#34;.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of the extension; an example is &#34;CustomScriptExtension&#34;.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @Import(name="typeHandlerVersion")
    private @Nullable Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the script handler.
     * 
     */
    public Optional<Output<String>> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    /**
     * The name of the virtual machine extension.
     * 
     */
    @Import(name="vmExtensionName")
    private @Nullable Output<String> vmExtensionName;

    /**
     * @return The name of the virtual machine extension.
     * 
     */
    public Optional<Output<String>> vmExtensionName() {
        return Optional.ofNullable(this.vmExtensionName);
    }

    /**
     * The name of the virtual machine where the extension should be created or updated.
     * 
     */
    @Import(name="vmName", required=true)
    private Output<String> vmName;

    /**
     * @return The name of the virtual machine where the extension should be created or updated.
     * 
     */
    public Output<String> vmName() {
        return this.vmName;
    }

    private VirtualMachineExtensionArgs() {}

    private VirtualMachineExtensionArgs(VirtualMachineExtensionArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = $.enableAutomaticUpgrade;
        this.forceUpdateTag = $.forceUpdateTag;
        this.instanceView = $.instanceView;
        this.location = $.location;
        this.protectedSettings = $.protectedSettings;
        this.publisher = $.publisher;
        this.resourceGroupName = $.resourceGroupName;
        this.settings = $.settings;
        this.tags = $.tags;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
        this.vmExtensionName = $.vmExtensionName;
        this.vmName = $.vmName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineExtensionArgs $;

        public Builder() {
            $ = new VirtualMachineExtensionArgs();
        }

        public Builder(VirtualMachineExtensionArgs defaults) {
            $ = new VirtualMachineExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticUpgrade(@Nullable Output<Boolean> enableAutomaticUpgrade) {
            $.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }

        /**
         * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
            return enableAutomaticUpgrade(Output.of(enableAutomaticUpgrade));
        }

        /**
         * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            $.forceUpdateTag = forceUpdateTag;
            return this;
        }

        /**
         * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(String forceUpdateTag) {
            return forceUpdateTag(Output.of(forceUpdateTag));
        }

        /**
         * @param instanceView The virtual machine extension instance view.
         * 
         * @return builder
         * 
         */
        public Builder instanceView(@Nullable Output<VirtualMachineExtensionInstanceViewArgs> instanceView) {
            $.instanceView = instanceView;
            return this;
        }

        /**
         * @param instanceView The virtual machine extension instance view.
         * 
         * @return builder
         * 
         */
        public Builder instanceView(VirtualMachineExtensionInstanceViewArgs instanceView) {
            return instanceView(Output.of(instanceView));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<Object> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(Object protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        /**
         * @param publisher The name of the extension handler publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The name of the extension handler publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param settings Json formatted public settings for the extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<Object> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Json formatted public settings for the extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(Object settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Specifies the type of the extension; an example is &#34;CustomScriptExtension&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of the extension; an example is &#34;CustomScriptExtension&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the script handler.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the script handler.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        /**
         * @param vmExtensionName The name of the virtual machine extension.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensionName(@Nullable Output<String> vmExtensionName) {
            $.vmExtensionName = vmExtensionName;
            return this;
        }

        /**
         * @param vmExtensionName The name of the virtual machine extension.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensionName(String vmExtensionName) {
            return vmExtensionName(Output.of(vmExtensionName));
        }

        /**
         * @param vmName The name of the virtual machine where the extension should be created or updated.
         * 
         * @return builder
         * 
         */
        public Builder vmName(Output<String> vmName) {
            $.vmName = vmName;
            return this;
        }

        /**
         * @param vmName The name of the virtual machine where the extension should be created or updated.
         * 
         * @return builder
         * 
         */
        public Builder vmName(String vmName) {
            return vmName(Output.of(vmName));
        }

        public VirtualMachineExtensionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmName = Objects.requireNonNull($.vmName, "expected parameter 'vmName' to be non-null");
            return $;
        }
    }

}
