// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineScaleSetExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineScaleSetExtensionArgs Empty = new WindowsVirtualMachineScaleSetExtensionArgs();

    /**
     * Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    @Import(name="automaticUpgradeEnabled")
    private @Nullable Output<Boolean> automaticUpgradeEnabled;

    /**
     * @return Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> automaticUpgradeEnabled() {
        return Optional.ofNullable(this.automaticUpgradeEnabled);
    }

    /**
     * A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    @Import(name="forceUpdateTag")
    private @Nullable Output<String> forceUpdateTag;

    /**
     * @return A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    public Optional<Output<String>> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * The name for the Virtual Machine Scale Set Extension.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name for the Virtual Machine Scale Set Extension.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<String> protectedSettings;

    /**
     * @return A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    public Optional<Output<String>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * An ordered list of Extension names which this should be provisioned after.
     * 
     */
    @Import(name="provisionAfterExtensions")
    private @Nullable Output<List<String>> provisionAfterExtensions;

    /**
     * @return An ordered list of Extension names which this should be provisioned after.
     * 
     */
    public Optional<Output<List<String>>> provisionAfterExtensions() {
        return Optional.ofNullable(this.provisionAfterExtensions);
    }

    /**
     * Specifies the Publisher of the Extension.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return Specifies the Publisher of the Extension.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * A JSON String which specifies Settings for the Extension.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return A JSON String which specifies Settings for the Extension.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Specifies the Type of the Extension.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the Type of the Extension.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    @Import(name="typeHandlerVersion", required=true)
    private Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    public Output<String> typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    private WindowsVirtualMachineScaleSetExtensionArgs() {}

    private WindowsVirtualMachineScaleSetExtensionArgs(WindowsVirtualMachineScaleSetExtensionArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.automaticUpgradeEnabled = $.automaticUpgradeEnabled;
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
    public static Builder builder(WindowsVirtualMachineScaleSetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineScaleSetExtensionArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineScaleSetExtensionArgs();
        }

        public Builder(WindowsVirtualMachineScaleSetExtensionArgs defaults) {
            $ = new WindowsVirtualMachineScaleSetExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param automaticUpgradeEnabled Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(@Nullable Output<Boolean> automaticUpgradeEnabled) {
            $.automaticUpgradeEnabled = automaticUpgradeEnabled;
            return this;
        }

        /**
         * @param automaticUpgradeEnabled Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(Boolean automaticUpgradeEnabled) {
            return automaticUpgradeEnabled(Output.of(automaticUpgradeEnabled));
        }

        /**
         * @param forceUpdateTag A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            $.forceUpdateTag = forceUpdateTag;
            return this;
        }

        /**
         * @param forceUpdateTag A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(String forceUpdateTag) {
            return forceUpdateTag(Output.of(forceUpdateTag));
        }

        /**
         * @param name The name for the Virtual Machine Scale Set Extension.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the Virtual Machine Scale Set Extension.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protectedSettings A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(String protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        /**
         * @param provisionAfterExtensions An ordered list of Extension names which this should be provisioned after.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(@Nullable Output<List<String>> provisionAfterExtensions) {
            $.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        /**
         * @param provisionAfterExtensions An ordered list of Extension names which this should be provisioned after.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(List<String> provisionAfterExtensions) {
            return provisionAfterExtensions(Output.of(provisionAfterExtensions));
        }

        /**
         * @param provisionAfterExtensions An ordered list of Extension names which this should be provisioned after.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }

        /**
         * @param publisher Specifies the Publisher of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher Specifies the Publisher of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param settings A JSON String which specifies Settings for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings A JSON String which specifies Settings for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param type Specifies the Type of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the Type of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        public WindowsVirtualMachineScaleSetExtensionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.typeHandlerVersion = Objects.requireNonNull($.typeHandlerVersion, "expected parameter 'typeHandlerVersion' to be non-null");
            return $;
        }
    }

}
