// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.app.ContainerAppArgs;
import com.pulumi.azurenative.app.outputs.ConfigurationResponse;
import com.pulumi.azurenative.app.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.app.outputs.SystemDataResponse;
import com.pulumi.azurenative.app.outputs.TemplateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Container App.
 * API Version: 2022-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:app:ContainerApp testcontainerApp0 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/containerApps/testcontainerApp0 
 * ```
 * 
 */
@ResourceType(type="azure-native:app:ContainerApp")
public class ContainerApp extends com.pulumi.resources.CustomResource {
    /**
     * Non versioned Container App configuration properties.
     * 
     */
    @Export(name="configuration", type=ConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ ConfigurationResponse> configuration;

    /**
     * @return Non versioned Container App configuration properties.
     * 
     */
    public Output<Optional<ConfigurationResponse>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * Id used to verify domain name ownership
     * 
     */
    @Export(name="customDomainVerificationId", type=String.class, parameters={})
    private Output<String> customDomainVerificationId;

    /**
     * @return Id used to verify domain name ownership
     * 
     */
    public Output<String> customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * managed identities for the Container App to interact with other Azure services without maintaining any secrets or credentials in code.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return managed identities for the Container App to interact with other Azure services without maintaining any secrets or credentials in code.
     * 
     */
    public Output<Optional<ManagedServiceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     */
    @Export(name="latestRevisionFqdn", type=String.class, parameters={})
    private Output<String> latestRevisionFqdn;

    /**
     * @return Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     */
    public Output<String> latestRevisionFqdn() {
        return this.latestRevisionFqdn;
    }
    /**
     * Name of the latest revision of the Container App.
     * 
     */
    @Export(name="latestRevisionName", type=String.class, parameters={})
    private Output<String> latestRevisionName;

    /**
     * @return Name of the latest revision of the Container App.
     * 
     */
    public Output<String> latestRevisionName() {
        return this.latestRevisionName;
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
     * Resource ID of the Container App&#39;s environment.
     * 
     */
    @Export(name="managedEnvironmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedEnvironmentId;

    /**
     * @return Resource ID of the Container App&#39;s environment.
     * 
     */
    public Output<Optional<String>> managedEnvironmentId() {
        return Codegen.optional(this.managedEnvironmentId);
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
     * Outbound IP Addresses for container app.
     * 
     */
    @Export(name="outboundIPAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> outboundIPAddresses;

    /**
     * @return Outbound IP Addresses for container app.
     * 
     */
    public Output<List<String>> outboundIPAddresses() {
        return this.outboundIPAddresses;
    }
    /**
     * Provisioning state of the Container App.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Container App.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
     * Container App versioned application definition.
     * 
     */
    @Export(name="template", type=TemplateResponse.class, parameters={})
    private Output</* @Nullable */ TemplateResponse> template;

    /**
     * @return Container App versioned application definition.
     * 
     */
    public Output<Optional<TemplateResponse>> template() {
        return Codegen.optional(this.template);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerApp(String name) {
        this(name, ContainerAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerApp(String name, ContainerAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerApp(String name, ContainerAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:ContainerApp", name, args == null ? ContainerAppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerApp(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:app:ContainerApp", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:app/v20220101preview:ContainerApp").build()),
                Output.of(Alias.builder().type("azure-native:app/v20220301:ContainerApp").build())
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
    public static ContainerApp get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerApp(name, id, options);
    }
}
