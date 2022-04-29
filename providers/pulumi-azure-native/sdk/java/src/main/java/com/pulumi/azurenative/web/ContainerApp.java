// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.ContainerAppArgs;
import com.pulumi.azurenative.web.outputs.ConfigurationResponse;
import com.pulumi.azurenative.web.outputs.TemplateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Container App.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:ContainerApp testcontainerApp0 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.Web/containerApps/testcontainerApp0 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:ContainerApp")
public class ContainerApp extends CustomResource {
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
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource ID of the Container App&#39;s KubeEnvironment.
     * 
     */
    @Export(name="kubeEnvironmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kubeEnvironmentId;

    /**
     * @return Resource ID of the Container App&#39;s KubeEnvironment.
     * 
     */
    public Output<Optional<String>> kubeEnvironmentId() {
        return Codegen.optional(this.kubeEnvironmentId);
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
     * Resource Location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
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
    public ContainerApp(String name, ContainerAppArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:web:ContainerApp", name, args == null ? ContainerAppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerApp(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:web:ContainerApp", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20210301:ContainerApp").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContainerApp get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ContainerApp(name, id, options);
    }
}
