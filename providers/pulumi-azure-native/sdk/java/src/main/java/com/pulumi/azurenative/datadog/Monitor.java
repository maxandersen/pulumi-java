// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datadog.MonitorArgs;
import com.pulumi.azurenative.datadog.outputs.IdentityPropertiesResponse;
import com.pulumi.azurenative.datadog.outputs.MonitorPropertiesResponse;
import com.pulumi.azurenative.datadog.outputs.ResourceSkuResponse;
import com.pulumi.azurenative.datadog.outputs.SystemDataResponse;
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
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datadog:Monitor myMonitor /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/monitors/myMonitor 
 * ```
 * 
 */
@ResourceType(type="azure-native:datadog:Monitor")
public class Monitor extends CustomResource {
    @Export(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    public Output<Optional<IdentityPropertiesResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the monitor resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the monitor resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Properties specific to the monitor resource.
     * 
     */
    @Export(name="properties", type=MonitorPropertiesResponse.class, parameters={})
    private Output<MonitorPropertiesResponse> properties;

    /**
     * @return Properties specific to the monitor resource.
     * 
     */
    public Output<MonitorPropertiesResponse> properties() {
        return this.properties;
    }
    @Export(name="sku", type=ResourceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSkuResponse> sku;

    public Output<Optional<ResourceSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the monitor resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the monitor resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Monitor(String name) {
        this(name, MonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Monitor(String name, MonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Monitor(String name, MonitorArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:datadog:Monitor", name, args == null ? MonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Monitor(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:datadog:Monitor", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datadog/v20200201preview:Monitor").build()),
                Output.of(Alias.builder().type("azure-native:datadog/v20210301:Monitor").build())
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
    public static Monitor get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Monitor(name, id, options);
    }
}
