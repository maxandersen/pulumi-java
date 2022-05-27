// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cdn.inputs.GetAFDCustomDomainArgs;
import com.pulumi.azurenative.cdn.inputs.GetAFDEndpointArgs;
import com.pulumi.azurenative.cdn.inputs.GetAFDOriginArgs;
import com.pulumi.azurenative.cdn.inputs.GetAFDOriginGroupArgs;
import com.pulumi.azurenative.cdn.inputs.GetCustomDomainArgs;
import com.pulumi.azurenative.cdn.inputs.GetEndpointArgs;
import com.pulumi.azurenative.cdn.inputs.GetOriginArgs;
import com.pulumi.azurenative.cdn.inputs.GetOriginGroupArgs;
import com.pulumi.azurenative.cdn.inputs.GetPolicyArgs;
import com.pulumi.azurenative.cdn.inputs.GetProfileArgs;
import com.pulumi.azurenative.cdn.inputs.GetProfileSupportedOptimizationTypesArgs;
import com.pulumi.azurenative.cdn.inputs.GetRouteArgs;
import com.pulumi.azurenative.cdn.inputs.GetRuleArgs;
import com.pulumi.azurenative.cdn.inputs.GetRuleSetArgs;
import com.pulumi.azurenative.cdn.inputs.GetSecretArgs;
import com.pulumi.azurenative.cdn.inputs.GetSecurityPolicyArgs;
import com.pulumi.azurenative.cdn.outputs.GetAFDCustomDomainResult;
import com.pulumi.azurenative.cdn.outputs.GetAFDEndpointResult;
import com.pulumi.azurenative.cdn.outputs.GetAFDOriginGroupResult;
import com.pulumi.azurenative.cdn.outputs.GetAFDOriginResult;
import com.pulumi.azurenative.cdn.outputs.GetCustomDomainResult;
import com.pulumi.azurenative.cdn.outputs.GetEndpointResult;
import com.pulumi.azurenative.cdn.outputs.GetOriginGroupResult;
import com.pulumi.azurenative.cdn.outputs.GetOriginResult;
import com.pulumi.azurenative.cdn.outputs.GetPolicyResult;
import com.pulumi.azurenative.cdn.outputs.GetProfileResult;
import com.pulumi.azurenative.cdn.outputs.GetProfileSupportedOptimizationTypesResult;
import com.pulumi.azurenative.cdn.outputs.GetRouteResult;
import com.pulumi.azurenative.cdn.outputs.GetRuleResult;
import com.pulumi.azurenative.cdn.outputs.GetRuleSetResult;
import com.pulumi.azurenative.cdn.outputs.GetSecretResult;
import com.pulumi.azurenative.cdn.outputs.GetSecurityPolicyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CdnFunctions {
    /**
     * Friendly domain name mapping to the endpoint hostname that the customer provides for branding purposes, e.g. www.contoso.com.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDCustomDomainResult> getAFDCustomDomain(GetAFDCustomDomainArgs args) {
        return getAFDCustomDomain(args, InvokeOptions.Empty);
    }
    /**
     * Friendly domain name mapping to the endpoint hostname that the customer provides for branding purposes, e.g. www.contoso.com.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDCustomDomainResult> getAFDCustomDomain(GetAFDCustomDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getAFDCustomDomain", TypeShape.of(GetAFDCustomDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The AzureFrontDoor endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDEndpointResult> getAFDEndpoint(GetAFDEndpointArgs args) {
        return getAFDEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The AzureFrontDoor endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDEndpointResult> getAFDEndpoint(GetAFDEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getAFDEndpoint", TypeShape.of(GetAFDEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDOriginResult> getAFDOrigin(GetAFDOriginArgs args) {
        return getAFDOrigin(args, InvokeOptions.Empty);
    }
    /**
     * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDOriginResult> getAFDOrigin(GetAFDOriginArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getAFDOrigin", TypeShape.of(GetAFDOriginResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDOriginGroupResult> getAFDOriginGroup(GetAFDOriginGroupArgs args) {
        return getAFDOriginGroup(args, InvokeOptions.Empty);
    }
    /**
     * AFDOrigin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetAFDOriginGroupResult> getAFDOriginGroup(GetAFDOriginGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getAFDOriginGroup", TypeShape.of(GetAFDOriginGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Friendly domain name mapping to the endpoint hostname that the customer provides for branding purposes, e.g. www.contoso.com.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetCustomDomainResult> getCustomDomain(GetCustomDomainArgs args) {
        return getCustomDomain(args, InvokeOptions.Empty);
    }
    /**
     * Friendly domain name mapping to the endpoint hostname that the customer provides for branding purposes, e.g. www.contoso.com.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetCustomDomainResult> getCustomDomain(GetCustomDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getCustomDomain", TypeShape.of(GetCustomDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The CDN endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpoint(GetEndpointArgs args) {
        return getEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The CDN endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpoint(GetEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetOriginResult> getOrigin(GetOriginArgs args) {
        return getOrigin(args, InvokeOptions.Empty);
    }
    /**
     * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetOriginResult> getOrigin(GetOriginArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getOrigin", TypeShape.of(GetOriginResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Origin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetOriginGroupResult> getOriginGroup(GetOriginGroupArgs args) {
        return getOriginGroup(args, InvokeOptions.Empty);
    }
    /**
     * Origin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetOriginGroupResult> getOriginGroup(GetOriginGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getOriginGroup", TypeShape.of(GetOriginGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Defines web application firewall policy for Azure CDN.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicy(GetPolicyArgs args) {
        return getPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Defines web application firewall policy for Azure CDN.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicy(GetPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * CDN profile is a logical grouping of endpoints that share the same settings, such as CDN provider and pricing tier.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetProfileResult> getProfile(GetProfileArgs args) {
        return getProfile(args, InvokeOptions.Empty);
    }
    /**
     * CDN profile is a logical grouping of endpoints that share the same settings, such as CDN provider and pricing tier.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetProfileResult> getProfile(GetProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getProfile", TypeShape.of(GetProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The result of the GetSupportedOptimizationTypes API
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetProfileSupportedOptimizationTypesResult> getProfileSupportedOptimizationTypes(GetProfileSupportedOptimizationTypesArgs args) {
        return getProfileSupportedOptimizationTypes(args, InvokeOptions.Empty);
    }
    /**
     * The result of the GetSupportedOptimizationTypes API
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetProfileSupportedOptimizationTypesResult> getProfileSupportedOptimizationTypes(GetProfileSupportedOptimizationTypesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getProfileSupportedOptimizationTypes", TypeShape.of(GetProfileSupportedOptimizationTypesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Friendly Routes name mapping to the any Routes or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetRouteResult> getRoute(GetRouteArgs args) {
        return getRoute(args, InvokeOptions.Empty);
    }
    /**
     * Friendly Routes name mapping to the any Routes or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetRouteResult> getRoute(GetRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getRoute", TypeShape.of(GetRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Friendly Rules name mapping to the any Rules or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetRuleResult> getRule(GetRuleArgs args) {
        return getRule(args, InvokeOptions.Empty);
    }
    /**
     * Friendly Rules name mapping to the any Rules or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetRuleResult> getRule(GetRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Friendly RuleSet name mapping to the any RuleSet or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetRuleSetResult> getRuleSet(GetRuleSetArgs args) {
        return getRuleSet(args, InvokeOptions.Empty);
    }
    /**
     * Friendly RuleSet name mapping to the any RuleSet or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetRuleSetResult> getRuleSet(GetRuleSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getRuleSet", TypeShape.of(GetRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Friendly Secret name mapping to the any Secret or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    /**
     * Friendly Secret name mapping to the any Secret or secret related information.
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * SecurityPolicy association for AzureFrontDoor profile
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetSecurityPolicyResult> getSecurityPolicy(GetSecurityPolicyArgs args) {
        return getSecurityPolicy(args, InvokeOptions.Empty);
    }
    /**
     * SecurityPolicy association for AzureFrontDoor profile
     * API Version: 2020-09-01.
     * 
     */
    public static CompletableFuture<GetSecurityPolicyResult> getSecurityPolicy(GetSecurityPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getSecurityPolicy", TypeShape.of(GetSecurityPolicyResult.class), args, Utilities.withVersion(options));
    }
}
