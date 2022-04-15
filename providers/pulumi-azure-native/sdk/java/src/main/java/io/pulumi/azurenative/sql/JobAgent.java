// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.JobAgentArgs;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
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
 * An Azure SQL job agent.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:JobAgent agent1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobAgent")
public class JobAgent extends io.pulumi.resources.CustomResource {
    /**
     * Resource ID of the database to store job metadata in.
     * 
     */
    @Export(name="databaseId", type=String.class, parameters={})
    private Output<String> databaseId;

    /**
     * @return Resource ID of the database to store job metadata in.
     * 
     */
    public Output<String> databaseId() {
        return this.databaseId;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name and tier of the SKU.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The name and tier of the SKU.
     * 
     */
    public Output</* @Nullable */ SkuResponse> sku() {
        return this.sku;
    }
    /**
     * The state of the job agent.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the job agent.
     * 
     */
    public Output<String> state() {
        return this.state;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
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
    public JobAgent(String name) {
        this(name, JobAgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobAgent(String name, JobAgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobAgent(String name, JobAgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobAgent", name, args == null ? JobAgentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobAgent(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobAgent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:JobAgent").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:JobAgent").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:JobAgent").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:JobAgent").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:JobAgent").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:JobAgent").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:JobAgent").build())
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
    public static JobAgent get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobAgent(name, id, options);
    }
}
