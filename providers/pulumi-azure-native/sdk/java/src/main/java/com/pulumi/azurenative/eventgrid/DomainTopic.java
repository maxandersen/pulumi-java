// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventgrid.DomainTopicArgs;
import com.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Domain Topic.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:DomainTopic exampledomaintopic1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/domains/exampledomain1/topics/exampledomaintopic1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:DomainTopic")
public class DomainTopic extends com.pulumi.resources.CustomResource {
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the domain topic.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the domain topic.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The system metadata relating to Domain Topic resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to Domain Topic resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainTopic(String name) {
        this(name, DomainTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainTopic(String name, DomainTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainTopic(String name, DomainTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:DomainTopic", name, args == null ? DomainTopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainTopic(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:DomainTopic", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventgrid/v20190201preview:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20190601:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20200101preview:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20200401preview:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20200601:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20201015preview:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20210601preview:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211015preview:DomainTopic").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211201:DomainTopic").build())
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
    public static DomainTopic get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainTopic(name, id, options);
    }
}
