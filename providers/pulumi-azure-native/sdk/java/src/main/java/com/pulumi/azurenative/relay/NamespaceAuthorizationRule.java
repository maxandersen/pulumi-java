// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.relay.NamespaceAuthorizationRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Description of a namespace authorization rule.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:relay:NamespaceAuthorizationRule example-RelayAuthRules-01 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/resourcegroup/providers/Microsoft.Relay/namespaces/example-RelayNamespace-01/AuthorizationRules/example-RelayAuthRules-01 
 * ```
 * 
 */
@ResourceType(type="azure-native:relay:NamespaceAuthorizationRule")
public class NamespaceAuthorizationRule extends CustomResource {
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
     * The rights associated with the rule.
     * 
     */
    @Export(name="rights", type=List.class, parameters={String.class})
    private Output<List<String>> rights;

    /**
     * @return The rights associated with the rule.
     * 
     */
    public Output<List<String>> rights() {
        return this.rights;
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
    public NamespaceAuthorizationRule(String name) {
        this(name, NamespaceAuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:relay:NamespaceAuthorizationRule", name, args == null ? NamespaceAuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceAuthorizationRule(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:relay:NamespaceAuthorizationRule", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:relay/v20160701:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:relay/v20170401:NamespaceAuthorizationRule").build())
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
    public static NamespaceAuthorizationRule get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new NamespaceAuthorizationRule(name, id, options);
    }
}
