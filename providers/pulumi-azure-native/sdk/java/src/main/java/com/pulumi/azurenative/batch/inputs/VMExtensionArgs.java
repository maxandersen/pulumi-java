// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMExtensionArgs Empty = new VMExtensionArgs();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<Object> protectedSettings;

    public Optional<Output<Object>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    @Import(name="provisionAfterExtensions")
    private @Nullable Output<List<String>> provisionAfterExtensions;

    public Optional<Output<List<String>>> provisionAfterExtensions() {
        return Optional.ofNullable(this.provisionAfterExtensions);
    }

    @Import(name="publisher", required=true)
    private Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher;
    }

    @Import(name="settings")
    private @Nullable Output<Object> settings;

    public Optional<Output<Object>> settings() {
        return Optional.ofNullable(this.settings);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="typeHandlerVersion")
    private @Nullable Output<String> typeHandlerVersion;

    public Optional<Output<String>> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    private VMExtensionArgs() {}

    private VMExtensionArgs(VMExtensionArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
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
    public static Builder builder(VMExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMExtensionArgs $;

        public Builder() {
            $ = new VMExtensionArgs();
        }

        public Builder(VMExtensionArgs defaults) {
            $ = new VMExtensionArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder protectedSettings(@Nullable Output<Object> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        public Builder protectedSettings(Object protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        public Builder provisionAfterExtensions(@Nullable Output<List<String>> provisionAfterExtensions) {
            $.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        public Builder provisionAfterExtensions(List<String> provisionAfterExtensions) {
            return provisionAfterExtensions(Output.of(provisionAfterExtensions));
        }

        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }

        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public Builder settings(@Nullable Output<Object> settings) {
            $.settings = settings;
            return this;
        }

        public Builder settings(Object settings) {
            return settings(Output.of(settings));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        public VMExtensionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
