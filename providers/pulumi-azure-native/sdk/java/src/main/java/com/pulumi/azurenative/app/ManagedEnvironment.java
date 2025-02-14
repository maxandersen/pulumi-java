// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.app.ManagedEnvironmentArgs;
import com.pulumi.azurenative.app.outputs.AppLogsConfigurationResponse;
import com.pulumi.azurenative.app.outputs.SystemDataResponse;
import com.pulumi.azurenative.app.outputs.VnetConfigurationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An environment for hosting container apps
 * API Version: 2022-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:app:ManagedEnvironment testcontainerenv /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/examplerg/providers/Microsoft.App/managedEnvironments/testcontainerenv 
 * ```
 * 
 */
@ResourceType(type="azure-native:app:ManagedEnvironment")
public class ManagedEnvironment extends com.pulumi.resources.CustomResource {
    /**
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only &#34;log-analytics&#34; is
     * supported
     * 
     */
    @Export(name="appLogsConfiguration", type=AppLogsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ AppLogsConfigurationResponse> appLogsConfiguration;

    /**
     * @return Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only &#34;log-analytics&#34; is
     * supported
     * 
     */
    public Output<Optional<AppLogsConfigurationResponse>> appLogsConfiguration() {
        return Codegen.optional(this.appLogsConfiguration);
    }
    /**
     * Application Insights connection string used by Dapr to export Service to Service communication telemetry
     * 
     */
    @Export(name="daprAIConnectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> daprAIConnectionString;

    /**
     * @return Application Insights connection string used by Dapr to export Service to Service communication telemetry
     * 
     */
    public Output<Optional<String>> daprAIConnectionString() {
        return Codegen.optional(this.daprAIConnectionString);
    }
    /**
     * Azure Monitor instrumentation key used by Dapr to export Service to Service communication telemetry
     * 
     */
    @Export(name="daprAIInstrumentationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> daprAIInstrumentationKey;

    /**
     * @return Azure Monitor instrumentation key used by Dapr to export Service to Service communication telemetry
     * 
     */
    public Output<Optional<String>> daprAIInstrumentationKey() {
        return Codegen.optional(this.daprAIInstrumentationKey);
    }
    /**
     * Default Domain Name for the cluster
     * 
     */
    @Export(name="defaultDomain", type=String.class, parameters={})
    private Output<String> defaultDomain;

    /**
     * @return Default Domain Name for the cluster
     * 
     */
    public Output<String> defaultDomain() {
        return this.defaultDomain;
    }
    /**
     * Any errors that occurred during deployment or deployment validation
     * 
     */
    @Export(name="deploymentErrors", type=String.class, parameters={})
    private Output<String> deploymentErrors;

    /**
     * @return Any errors that occurred during deployment or deployment validation
     * 
     */
    public Output<String> deploymentErrors() {
        return this.deploymentErrors;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the Environment.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Environment.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Static IP of the Environment
     * 
     */
    @Export(name="staticIp", type=String.class, parameters={})
    private Output<String> staticIp;

    /**
     * @return Static IP of the Environment
     * 
     */
    public Output<String> staticIp() {
        return this.staticIp;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Vnet configuration for the environment
     * 
     */
    @Export(name="vnetConfiguration", type=VnetConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VnetConfigurationResponse> vnetConfiguration;

    /**
     * @return Vnet configuration for the environment
     * 
     */
    public Output<Optional<VnetConfigurationResponse>> vnetConfiguration() {
        return Codegen.optional(this.vnetConfiguration);
    }
    /**
     * Whether or not this Managed Environment is zone-redundant.
     * 
     */
    @Export(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneRedundant;

    /**
     * @return Whether or not this Managed Environment is zone-redundant.
     * 
     */
    public Output<Optional<Boolean>> zoneRedundant() {
        return Codegen.optional(this.zoneRedundant);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedEnvironment(String name) {
        this(name, ManagedEnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedEnvironment(String name, ManagedEnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedEnvironment(String name, ManagedEnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:ManagedEnvironment", name, args == null ? ManagedEnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedEnvironment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:ManagedEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:app/v20220101preview:ManagedEnvironment").build()),
                Output.of(Alias.builder().type("azure-native:app/v20220301:ManagedEnvironment").build())
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
    public static ManagedEnvironment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedEnvironment(name, id, options);
    }
}
