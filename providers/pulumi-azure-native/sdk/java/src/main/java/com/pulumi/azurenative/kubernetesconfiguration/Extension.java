// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kubernetesconfiguration.ExtensionArgs;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ConfigurationIdentityResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ErrorDefinitionResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ExtensionStatusResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.ScopeResponse;
import com.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Extension Instance object.
 * API Version: 2020-07-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kubernetesconfiguration:Extension ClusterMonitor /subscriptions/subId1/resourceGroups/rg1/providers/Microsoft.Kubernetes/connectedClusters/clusterName1/providers/Microsoft.KubernetesConfiguration/extensions/ClusterMonitor 
 * ```
 * 
 */
@ResourceType(type="azure-native:kubernetesconfiguration:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    @Export(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    public Output</* @Nullable */ Boolean> autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }
    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @Export(name="configurationProtectedSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationProtectedSettings;

    /**
     * @return Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> configurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }
    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @Export(name="configurationSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> configurationSettings;

    /**
     * @return Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> configurationSettings() {
        return this.configurationSettings;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return DateLiteral (per ISO8601) noting the time the resource was created by the client (user).
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * Error information from the Agent - e.g. errors during installation.
     * 
     */
    @Export(name="errorInfo", type=ErrorDefinitionResponse.class, parameters={})
    private Output<ErrorDefinitionResponse> errorInfo;

    /**
     * @return Error information from the Agent - e.g. errors during installation.
     * 
     */
    public Output<ErrorDefinitionResponse> errorInfo() {
        return this.errorInfo;
    }
    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    @Export(name="extensionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionType;

    /**
     * @return Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    public Output</* @Nullable */ String> extensionType() {
        return this.extensionType;
    }
    /**
     * The identity of the configuration.
     * 
     */
    @Export(name="identity", type=ConfigurationIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ConfigurationIdentityResponse> identity;

    /**
     * @return The identity of the configuration.
     * 
     */
    public Output</* @Nullable */ ConfigurationIdentityResponse> identity() {
        return this.identity;
    }
    /**
     * Status of installation of this instance of the extension.
     * 
     */
    @Export(name="installState", type=String.class, parameters={})
    private Output<String> installState;

    /**
     * @return Status of installation of this instance of the extension.
     * 
     */
    public Output<String> installState() {
        return this.installState;
    }
    /**
     * DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return DateLiteral (per ISO8601) noting the time the resource was modified by the client (user).
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
     */
    @Export(name="lastStatusTime", type=String.class, parameters={})
    private Output<String> lastStatusTime;

    /**
     * @return DateLiteral (per ISO8601) noting the time of last status from the agent.
     * 
     */
    public Output<String> lastStatusTime() {
        return this.lastStatusTime;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is &#39;true&#39;.
     * 
     */
    @Export(name="releaseTrain", type=String.class, parameters={})
    private Output</* @Nullable */ String> releaseTrain;

    /**
     * @return ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is &#39;true&#39;.
     * 
     */
    public Output</* @Nullable */ String> releaseTrain() {
        return this.releaseTrain;
    }
    /**
     * Scope at which the extension instance is installed.
     * 
     */
    @Export(name="scope", type=ScopeResponse.class, parameters={})
    private Output</* @Nullable */ ScopeResponse> scope;

    /**
     * @return Scope at which the extension instance is installed.
     * 
     */
    public Output</* @Nullable */ ScopeResponse> scope() {
        return this.scope;
    }
    /**
     * Status from this instance of the extension.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ExtensionStatusResponse.class})
    private Output</* @Nullable */ List<ExtensionStatusResponse>> statuses;

    /**
     * @return Status from this instance of the extension.
     * 
     */
    public Output</* @Nullable */ List<ExtensionStatusResponse>> statuses() {
        return this.statuses;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output</* @Nullable */ SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output</* @Nullable */ SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Version of the extension for this extension instance, if it is &#39;pinned&#39; to a specific version. autoUpgradeMinorVersion must be &#39;false&#39;.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version of the extension for this extension instance, if it is &#39;pinned&#39; to a specific version. autoUpgradeMinorVersion must be &#39;false&#39;.
     * 
     */
    public Output</* @Nullable */ String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kubernetesconfiguration:Extension", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20200701preview:Extension").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20210501preview:Extension").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20210901:Extension").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20211101preview:Extension").build()),
                Output.of(Alias.builder().type("azure-native:kubernetesconfiguration/v20220101preview:Extension").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Extension get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, options);
    }
}
