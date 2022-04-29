// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicebus.RuleArgs;
import com.pulumi.azurenative.servicebus.outputs.ActionResponse;
import com.pulumi.azurenative.servicebus.outputs.CorrelationFilterResponse;
import com.pulumi.azurenative.servicebus.outputs.SqlFilterResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Description of Rule Resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicebus:Rule sdk-Rules-6571 /subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ServiceBus/namespaces/sdk-Namespace-1319/topics/sdk-Topics-2081/subscriptions/sdk-Subscriptions-8691/rules/sdk-Rules-6571 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicebus:Rule")
public class Rule extends CustomResource {
    /**
     * Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
     */
    @Export(name="action", type=ActionResponse.class, parameters={})
    private Output</* @Nullable */ ActionResponse> action;

    /**
     * @return Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
     */
    public Output<Optional<ActionResponse>> action() {
        return Codegen.optional(this.action);
    }
    /**
     * Properties of correlationFilter
     * 
     */
    @Export(name="correlationFilter", type=CorrelationFilterResponse.class, parameters={})
    private Output</* @Nullable */ CorrelationFilterResponse> correlationFilter;

    /**
     * @return Properties of correlationFilter
     * 
     */
    public Output<Optional<CorrelationFilterResponse>> correlationFilter() {
        return Codegen.optional(this.correlationFilter);
    }
    /**
     * Filter type that is evaluated against a BrokeredMessage.
     * 
     */
    @Export(name="filterType", type=String.class, parameters={})
    private Output</* @Nullable */ String> filterType;

    /**
     * @return Filter type that is evaluated against a BrokeredMessage.
     * 
     */
    public Output<Optional<String>> filterType() {
        return Codegen.optional(this.filterType);
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
     * Properties of sqlFilter
     * 
     */
    @Export(name="sqlFilter", type=SqlFilterResponse.class, parameters={})
    private Output</* @Nullable */ SqlFilterResponse> sqlFilter;

    /**
     * @return Properties of sqlFilter
     * 
     */
    public Output<Optional<SqlFilterResponse>> sqlFilter() {
        return Codegen.optional(this.sqlFilter);
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
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:servicebus:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:servicebus:Rule", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicebus/v20170401:Rule").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20180101preview:Rule").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210101preview:Rule").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20210601preview:Rule").build()),
                Output.of(Alias.builder().type("azure-native:servicebus/v20211101:Rule").build())
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
    public static Rule get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Rule(name, id, options);
    }
}
