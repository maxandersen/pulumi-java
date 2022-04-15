// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PolicyArgs;
import io.pulumi.azurenative.network.outputs.CustomRuleListResponse;
import io.pulumi.azurenative.network.outputs.FrontDoorPolicySettingsResponse;
import io.pulumi.azurenative.network.outputs.FrontendEndpointLinkResponse;
import io.pulumi.azurenative.network.outputs.ManagedRuleSetListResponse;
import io.pulumi.azurenative.network.outputs.RoutingRuleLinkResponse;
import io.pulumi.azurenative.network.outputs.SecurityPolicyLinkResponse;
import io.pulumi.azurenative.network.outputs.SkuResponse;
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
 * Defines web application firewall policy.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:Policy Policy1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/FrontDoorWebApplicationFirewallPolicies/Policy1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * Describes custom rules inside the policy.
     * 
     */
    @Export(name="customRules", type=CustomRuleListResponse.class, parameters={})
    private Output</* @Nullable */ CustomRuleListResponse> customRules;

    /**
     * @return Describes custom rules inside the policy.
     * 
     */
    public Output</* @Nullable */ CustomRuleListResponse> customRules() {
        return this.customRules;
    }
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * Describes Frontend Endpoints associated with this Web Application Firewall policy.
     * 
     */
    @Export(name="frontendEndpointLinks", type=List.class, parameters={FrontendEndpointLinkResponse.class})
    private Output<List<FrontendEndpointLinkResponse>> frontendEndpointLinks;

    /**
     * @return Describes Frontend Endpoints associated with this Web Application Firewall policy.
     * 
     */
    public Output<List<FrontendEndpointLinkResponse>> frontendEndpointLinks() {
        return this.frontendEndpointLinks;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Describes managed rules inside the policy.
     * 
     */
    @Export(name="managedRules", type=ManagedRuleSetListResponse.class, parameters={})
    private Output</* @Nullable */ ManagedRuleSetListResponse> managedRules;

    /**
     * @return Describes managed rules inside the policy.
     * 
     */
    public Output</* @Nullable */ ManagedRuleSetListResponse> managedRules() {
        return this.managedRules;
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
     * Describes settings for the policy.
     * 
     */
    @Export(name="policySettings", type=FrontDoorPolicySettingsResponse.class, parameters={})
    private Output</* @Nullable */ FrontDoorPolicySettingsResponse> policySettings;

    /**
     * @return Describes settings for the policy.
     * 
     */
    public Output</* @Nullable */ FrontDoorPolicySettingsResponse> policySettings() {
        return this.policySettings;
    }
    /**
     * Provisioning state of the policy.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the policy.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    public Output<String> resourceState() {
        return this.resourceState;
    }
    /**
     * Describes Routing Rules associated with this Web Application Firewall policy.
     * 
     */
    @Export(name="routingRuleLinks", type=List.class, parameters={RoutingRuleLinkResponse.class})
    private Output<List<RoutingRuleLinkResponse>> routingRuleLinks;

    /**
     * @return Describes Routing Rules associated with this Web Application Firewall policy.
     * 
     */
    public Output<List<RoutingRuleLinkResponse>> routingRuleLinks() {
        return this.routingRuleLinks;
    }
    /**
     * Describes Security Policy associated with this Web Application Firewall policy.
     * 
     */
    @Export(name="securityPolicyLinks", type=List.class, parameters={SecurityPolicyLinkResponse.class})
    private Output<List<SecurityPolicyLinkResponse>> securityPolicyLinks;

    /**
     * @return Describes Security Policy associated with this Web Application Firewall policy.
     * 
     */
    public Output<List<SecurityPolicyLinkResponse>> securityPolicyLinks() {
        return this.securityPolicyLinks;
    }
    /**
     * The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    public Output</* @Nullable */ SkuResponse> sku() {
        return this.sku;
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
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Policy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190301:Policy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191001:Policy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:Policy").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:Policy").build())
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
    public static Policy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
