// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventhub.NamespaceNetworkRuleSetArgs;
import com.pulumi.azurenative.eventhub.outputs.NWRuleSetIpRulesResponse;
import com.pulumi.azurenative.eventhub.outputs.NWRuleSetVirtualNetworkRulesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Description of NetworkRuleSet resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:NamespaceNetworkRuleSet default /subscriptions/854d368f-1828-428f-8f3c-f2affa9b2f7d/resourceGroups/resourcegroupid/providers/Microsoft.EventHub/namespaces/sdk-Namespace-9659/networkrulesets/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:NamespaceNetworkRuleSet")
public class NamespaceNetworkRuleSet extends com.pulumi.resources.CustomResource {
    /**
     * Default Action for Network Rule Set
     * 
     */
    @Export(name="defaultAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAction;

    /**
     * @return Default Action for Network Rule Set
     * 
     */
    public Output</* @Nullable */ String> defaultAction() {
        return this.defaultAction;
    }
    /**
     * List of IpRules
     * 
     */
    @Export(name="ipRules", type=List.class, parameters={NWRuleSetIpRulesResponse.class})
    private Output</* @Nullable */ List<NWRuleSetIpRulesResponse>> ipRules;

    /**
     * @return List of IpRules
     * 
     */
    public Output</* @Nullable */ List<NWRuleSetIpRulesResponse>> ipRules() {
        return this.ipRules;
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
     * List VirtualNetwork Rules
     * 
     */
    @Export(name="virtualNetworkRules", type=List.class, parameters={NWRuleSetVirtualNetworkRulesResponse.class})
    private Output</* @Nullable */ List<NWRuleSetVirtualNetworkRulesResponse>> virtualNetworkRules;

    /**
     * @return List VirtualNetwork Rules
     * 
     */
    public Output</* @Nullable */ List<NWRuleSetVirtualNetworkRulesResponse>> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceNetworkRuleSet(String name) {
        this(name, NamespaceNetworkRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceNetworkRuleSet(String name, NamespaceNetworkRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceNetworkRuleSet(String name, NamespaceNetworkRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceNetworkRuleSet", name, args == null ? NamespaceNetworkRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceNetworkRuleSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceNetworkRuleSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20170401:NamespaceNetworkRuleSet").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:NamespaceNetworkRuleSet").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210101preview:NamespaceNetworkRuleSet").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210601preview:NamespaceNetworkRuleSet").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20211101:NamespaceNetworkRuleSet").build())
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
    public static NamespaceNetworkRuleSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceNetworkRuleSet(name, id, options);
    }
}
