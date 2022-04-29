// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Virtual Machine Scale Set Extension.
 * 
 */
public final class VirtualMachineScaleSetExtensionArgs extends ResourceArgs {

    public static final VirtualMachineScaleSetExtensionArgs Empty = new VirtualMachineScaleSetExtensionArgs();

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
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
    private @Nullable Output<String> forceUpdateTag;

    /**
     * @return If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    public Optional<Output<String>> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * The name of the extension.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the extension.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    @Import(name="provisionAfterExtensions")
    private @Nullable Output<List<String>> provisionAfterExtensions;

    /**
     * @return Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    public Optional<Output<List<String>>> provisionAfterExtensions() {
        return Optional.ofNullable(this.provisionAfterExtensions);
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

    private VirtualMachineScaleSetExtensionArgs() {}

    private VirtualMachineScaleSetExtensionArgs(VirtualMachineScaleSetExtensionArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = $.enableAutomaticUpgrade;
        this.forceUpdateTag = $.forceUpdateTag;
        this.name = $.name;
        this.protectedSettings = $.protectedSettings;
        this.provisionAfterExtensions = $.provisionAfterExtensions;
        this.publisher = $.publisher;
        this.settings = $.settings;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetExtensionArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetExtensionArgs();
        }

        public Builder(VirtualMachineScaleSetExtensionArgs defaults) {
            $ = new VirtualMachineScaleSetExtensionArgs(Objects.requireNonNull(defaults));
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
         * @param forceUpdateTag If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            $.forceUpdateTag = forceUpdateTag;
            return this;
        }

        /**
         * @param forceUpdateTag If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(String forceUpdateTag) {
            return forceUpdateTag(Output.of(forceUpdateTag));
        }

        /**
         * @param name The name of the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param provisionAfterExtensions Collection of extension names after which this extension needs to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(@Nullable Output<List<String>> provisionAfterExtensions) {
            $.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        /**
         * @param provisionAfterExtensions Collection of extension names after which this extension needs to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(List<String> provisionAfterExtensions) {
            return provisionAfterExtensions(Output.of(provisionAfterExtensions));
        }

        /**
         * @param provisionAfterExtensions Collection of extension names after which this extension needs to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
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

        public VirtualMachineScaleSetExtensionArgs build() {
            return $;
        }
    }

}
