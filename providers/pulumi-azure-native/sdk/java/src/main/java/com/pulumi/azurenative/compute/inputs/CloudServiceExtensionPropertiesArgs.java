// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.CloudServiceVaultAndSecretReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Extension Properties.
 * 
 */
public final class CloudServiceExtensionPropertiesArgs extends ResourceArgs {

    public static final CloudServiceExtensionPropertiesArgs Empty = new CloudServiceExtensionPropertiesArgs();

    /**
     * Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Tag to force apply the provided public and protected settings.
     * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
     * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
     * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
     * it is up to handler implementation whether to re-run it or not
     * 
     */
    @Import(name="forceUpdateTag")
    private @Nullable Output<String> forceUpdateTag;

    /**
     * @return Tag to force apply the provided public and protected settings.
     * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
     * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
     * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
     * it is up to handler implementation whether to re-run it or not
     * 
     */
    public Optional<Output<String>> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * Protected settings for the extension which are encrypted before sent to the role instance.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<String> protectedSettings;

    /**
     * @return Protected settings for the extension which are encrypted before sent to the role instance.
     * 
     */
    public Optional<Output<String>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    @Import(name="protectedSettingsFromKeyVault")
    private @Nullable Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault;

    public Optional<Output<CloudServiceVaultAndSecretReferenceArgs>> protectedSettingsFromKeyVault() {
        return Optional.ofNullable(this.protectedSettingsFromKeyVault);
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
     * Optional list of roles to apply this extension. If property is not specified or &#39;*&#39; is specified, extension is applied to all roles in the cloud service.
     * 
     */
    @Import(name="rolesAppliedTo")
    private @Nullable Output<List<String>> rolesAppliedTo;

    /**
     * @return Optional list of roles to apply this extension. If property is not specified or &#39;*&#39; is specified, extension is applied to all roles in the cloud service.
     * 
     */
    public Optional<Output<List<String>>> rolesAppliedTo() {
        return Optional.ofNullable(this.rolesAppliedTo);
    }

    /**
     * Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Specifies the type of the extension.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of the extension.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
     * 
     */
    @Import(name="typeHandlerVersion")
    private @Nullable Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
     * 
     */
    public Optional<Output<String>> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    private CloudServiceExtensionPropertiesArgs() {}

    private CloudServiceExtensionPropertiesArgs(CloudServiceExtensionPropertiesArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.forceUpdateTag = $.forceUpdateTag;
        this.protectedSettings = $.protectedSettings;
        this.protectedSettingsFromKeyVault = $.protectedSettingsFromKeyVault;
        this.publisher = $.publisher;
        this.rolesAppliedTo = $.rolesAppliedTo;
        this.settings = $.settings;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceExtensionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceExtensionPropertiesArgs $;

        public Builder() {
            $ = new CloudServiceExtensionPropertiesArgs();
        }

        public Builder(CloudServiceExtensionPropertiesArgs defaults) {
            $ = new CloudServiceExtensionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param forceUpdateTag Tag to force apply the provided public and protected settings.
         * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
         * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
         * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
         * it is up to handler implementation whether to re-run it or not
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            $.forceUpdateTag = forceUpdateTag;
            return this;
        }

        /**
         * @param forceUpdateTag Tag to force apply the provided public and protected settings.
         * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
         * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
         * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
         * it is up to handler implementation whether to re-run it or not
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(String forceUpdateTag) {
            return forceUpdateTag(Output.of(forceUpdateTag));
        }

        /**
         * @param protectedSettings Protected settings for the extension which are encrypted before sent to the role instance.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings Protected settings for the extension which are encrypted before sent to the role instance.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(String protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        public Builder protectedSettingsFromKeyVault(@Nullable Output<CloudServiceVaultAndSecretReferenceArgs> protectedSettingsFromKeyVault) {
            $.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
            return this;
        }

        public Builder protectedSettingsFromKeyVault(CloudServiceVaultAndSecretReferenceArgs protectedSettingsFromKeyVault) {
            return protectedSettingsFromKeyVault(Output.of(protectedSettingsFromKeyVault));
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
         * @param rolesAppliedTo Optional list of roles to apply this extension. If property is not specified or &#39;*&#39; is specified, extension is applied to all roles in the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder rolesAppliedTo(@Nullable Output<List<String>> rolesAppliedTo) {
            $.rolesAppliedTo = rolesAppliedTo;
            return this;
        }

        /**
         * @param rolesAppliedTo Optional list of roles to apply this extension. If property is not specified or &#39;*&#39; is specified, extension is applied to all roles in the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder rolesAppliedTo(List<String> rolesAppliedTo) {
            return rolesAppliedTo(Output.of(rolesAppliedTo));
        }

        /**
         * @param rolesAppliedTo Optional list of roles to apply this extension. If property is not specified or &#39;*&#39; is specified, extension is applied to all roles in the cloud service.
         * 
         * @return builder
         * 
         */
        public Builder rolesAppliedTo(String... rolesAppliedTo) {
            return rolesAppliedTo(List.of(rolesAppliedTo));
        }

        /**
         * @param settings Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param type Specifies the type of the extension.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of the extension.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        public CloudServiceExtensionPropertiesArgs build() {
            return $;
        }
    }

}
