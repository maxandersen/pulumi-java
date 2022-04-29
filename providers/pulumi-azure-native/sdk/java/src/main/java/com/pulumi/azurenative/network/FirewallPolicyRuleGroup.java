// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.FirewallPolicyRuleGroupArgs;
import com.pulumi.azurenative.network.outputs.FirewallPolicyFilterRuleResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicyNatRuleResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Rule Group resource.
 * API Version: 2020-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:FirewallPolicyRuleGroup firewallPolicy /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/firewallPolicies/firewallPolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:FirewallPolicyRuleGroup")
public class FirewallPolicyRuleGroup extends CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Priority of the Firewall Policy Rule Group resource.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the Firewall Policy Rule Group resource.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The provisioning state of the firewall policy rule group resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the firewall policy rule group resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Group of Firewall Policy rules.
     * 
     */
    @Export(name="rules", type=List.class, parameters={Either.class})
    private Output</* @Nullable */ List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>>> rules;

    /**
     * @return Group of Firewall Policy rules.
     * 
     */
    public Output<Optional<List<Either<FirewallPolicyFilterRuleResponse,FirewallPolicyNatRuleResponse>>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Rule Group type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Rule Group type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicyRuleGroup(String name) {
        this(name, FirewallPolicyRuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicyRuleGroup(String name, FirewallPolicyRuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicyRuleGroup(String name, FirewallPolicyRuleGroupArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:FirewallPolicyRuleGroup", name, args == null ? FirewallPolicyRuleGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallPolicyRuleGroup(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:FirewallPolicyRuleGroup", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190601:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:FirewallPolicyRuleGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:FirewallPolicyRuleGroup").build())
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
    public static FirewallPolicyRuleGroup get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new FirewallPolicyRuleGroup(name, id, options);
    }
}
