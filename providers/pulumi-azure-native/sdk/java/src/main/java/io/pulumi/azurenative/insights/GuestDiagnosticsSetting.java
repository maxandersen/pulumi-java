// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.GuestDiagnosticsSettingArgs;
import io.pulumi.azurenative.insights.outputs.DataSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Virtual machine guest diagnostics settings resource.
 * API Version: 2018-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:guestDiagnosticsSetting SampleDiagSetting /subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/Default-ResourceGroup/providers/microsoft.insights/guestDiagnosticSettings/SampleDiagSetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:guestDiagnosticsSetting")
public class GuestDiagnosticsSetting extends io.pulumi.resources.CustomResource {
    /**
     * the array of data source object which are configured to collect and send data
     * 
     */
    @Export(name="dataSources", type=List.class, parameters={DataSourceResponse.class})
    private Output</* @Nullable */ List<DataSourceResponse>> dataSources;

    /**
     * @return the array of data source object which are configured to collect and send data
     * 
     */
    public Output</* @Nullable */ List<DataSourceResponse>> dataSources() {
        return this.dataSources;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Operating system type for the configuration
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    /**
     * @return Operating system type for the configuration
     * 
     */
    public Output</* @Nullable */ String> osType() {
        return this.osType;
    }
    @Export(name="proxySetting", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxySetting;

    public Output</* @Nullable */ String> proxySetting() {
        return this.proxySetting;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestDiagnosticsSetting(String name) {
        this(name, GuestDiagnosticsSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestDiagnosticsSetting(String name, GuestDiagnosticsSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestDiagnosticsSetting(String name, GuestDiagnosticsSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:guestDiagnosticsSetting", name, args == null ? GuestDiagnosticsSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestDiagnosticsSetting(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:guestDiagnosticsSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20180601preview:guestDiagnosticsSetting").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GuestDiagnosticsSetting get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestDiagnosticsSetting(name, id, options);
    }
}
