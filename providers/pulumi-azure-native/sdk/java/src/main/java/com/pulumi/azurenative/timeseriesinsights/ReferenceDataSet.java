// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.timeseriesinsights.ReferenceDataSetArgs;
import com.pulumi.azurenative.timeseriesinsights.outputs.ReferenceDataSetKeyPropertyResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A reference data set provides metadata about the events in an environment. Metadata in the reference data set will be joined with events as they are read from event sources. The metadata that makes up the reference data set is uploaded or modified through the Time Series Insights data plane APIs.
 * API Version: 2020-05-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:timeseriesinsights:ReferenceDataSet rds1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.TimeSeriesInsights/Environments/env1/referenceDataSets/rds1 
 * ```
 * 
 */
@ResourceType(type="azure-native:timeseriesinsights:ReferenceDataSet")
public class ReferenceDataSet extends com.pulumi.resources.CustomResource {
    /**
     * The time the resource was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the resource was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The reference data set key comparison behavior can be set using this property. By default, the value is &#39;Ordinal&#39; - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When &#39;OrdinalIgnoreCase&#39; is set, case insensitive comparison will be used.
     * 
     */
    @Export(name="dataStringComparisonBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataStringComparisonBehavior;

    /**
     * @return The reference data set key comparison behavior can be set using this property. By default, the value is &#39;Ordinal&#39; - which means case sensitive key comparison will be performed while joining reference data with events or while adding new reference data. When &#39;OrdinalIgnoreCase&#39; is set, case insensitive comparison will be used.
     * 
     */
    public Output</* @Nullable */ String> dataStringComparisonBehavior() {
        return this.dataStringComparisonBehavior;
    }
    /**
     * The list of key properties for the reference data set.
     * 
     */
    @Export(name="keyProperties", type=List.class, parameters={ReferenceDataSetKeyPropertyResponse.class})
    private Output<List<ReferenceDataSetKeyPropertyResponse>> keyProperties;

    /**
     * @return The list of key properties for the reference data set.
     * 
     */
    public Output<List<ReferenceDataSetKeyPropertyResponse>> keyProperties() {
        return this.keyProperties;
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
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReferenceDataSet(String name) {
        this(name, ReferenceDataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReferenceDataSet(String name, ReferenceDataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReferenceDataSet(String name, ReferenceDataSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:ReferenceDataSet", name, args == null ? ReferenceDataSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReferenceDataSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:ReferenceDataSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20170228preview:ReferenceDataSet").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20171115:ReferenceDataSet").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20180815preview:ReferenceDataSet").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20200515:ReferenceDataSet").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210331preview:ReferenceDataSet").build()),
                Output.of(Alias.builder().type("azure-native:timeseriesinsights/v20210630preview:ReferenceDataSet").build())
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
    public static ReferenceDataSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReferenceDataSet(name, id, options);
    }
}
