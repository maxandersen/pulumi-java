// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.LoadBalancer.inputs.GetBackendHealthArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetBackendSetHealthArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetBackendSetsArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetBackendsArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetCertificatesArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetHealthArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetHostnamesArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetListenerRulesArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetLoadBalancerRoutingPoliciesArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetLoadBalancerRoutingPolicyArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetLoadBalancersArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetPathRouteSetsArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetPoliciesArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetProtocolsArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetRuleSetArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetRuleSetsArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetShapesArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetSslCipherSuiteArgs;
import com.pulumi.oci.LoadBalancer.inputs.GetSslCipherSuitesArgs;
import com.pulumi.oci.LoadBalancer.outputs.GetBackendHealthResult;
import com.pulumi.oci.LoadBalancer.outputs.GetBackendSetHealthResult;
import com.pulumi.oci.LoadBalancer.outputs.GetBackendSetsResult;
import com.pulumi.oci.LoadBalancer.outputs.GetBackendsResult;
import com.pulumi.oci.LoadBalancer.outputs.GetCertificatesResult;
import com.pulumi.oci.LoadBalancer.outputs.GetHealthResult;
import com.pulumi.oci.LoadBalancer.outputs.GetHostnamesResult;
import com.pulumi.oci.LoadBalancer.outputs.GetListenerRulesResult;
import com.pulumi.oci.LoadBalancer.outputs.GetLoadBalancerRoutingPoliciesResult;
import com.pulumi.oci.LoadBalancer.outputs.GetLoadBalancerRoutingPolicyResult;
import com.pulumi.oci.LoadBalancer.outputs.GetLoadBalancersResult;
import com.pulumi.oci.LoadBalancer.outputs.GetPathRouteSetsResult;
import com.pulumi.oci.LoadBalancer.outputs.GetPoliciesResult;
import com.pulumi.oci.LoadBalancer.outputs.GetProtocolsResult;
import com.pulumi.oci.LoadBalancer.outputs.GetRuleSetResult;
import com.pulumi.oci.LoadBalancer.outputs.GetRuleSetsResult;
import com.pulumi.oci.LoadBalancer.outputs.GetShapesResult;
import com.pulumi.oci.LoadBalancer.outputs.GetSslCipherSuiteResult;
import com.pulumi.oci.LoadBalancer.outputs.GetSslCipherSuitesResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class LoadBalancerFunctions {
    /**
     * This data source provides details about a specific Backend Health resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the current health status of the specified backend server.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendHealthResult> getBackendHealth(GetBackendHealthArgs args) {
        return getBackendHealth(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Backend Health resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the current health status of the specified backend server.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendHealthResult> getBackendHealth(GetBackendHealthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getBackendHealth:getBackendHealth", TypeShape.of(GetBackendHealthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Backend Set Health resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the health status for the specified backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetHealthResult> getBackendSetHealth(GetBackendSetHealthArgs args) {
        return getBackendSetHealth(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Backend Set Health resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the health status for the specified backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetHealthResult> getBackendSetHealth(GetBackendSetHealthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getBackendSetHealth:getBackendSetHealth", TypeShape.of(GetBackendSetHealthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Backend Sets in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all backend sets associated with a given load balancer.
     * 
     * ## Supported Aliases
     * 
     * * `oci_load_balancer_backendsets`
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetsResult> getBackendSets(GetBackendSetsArgs args) {
        return getBackendSets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Backend Sets in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all backend sets associated with a given load balancer.
     * 
     * ## Supported Aliases
     * 
     * * `oci_load_balancer_backendsets`
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendSetsResult> getBackendSets(GetBackendSetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getBackendSets:getBackendSets", TypeShape.of(GetBackendSetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Backends in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists the backend servers for a given load balancer and backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendsResult> getBackends(GetBackendsArgs args) {
        return getBackends(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Backends in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists the backend servers for a given load balancer and backend set.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBackendsResult> getBackends(GetBackendsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getBackends:getBackends", TypeShape.of(GetBackendsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Certificates in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all SSL certificates bundles associated with a given load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCertificatesResult> getCertificates(GetCertificatesArgs args) {
        return getCertificates(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Certificates in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all SSL certificates bundles associated with a given load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCertificatesResult> getCertificates(GetCertificatesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getCertificates:getCertificates", TypeShape.of(GetCertificatesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Load Balancer Health resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the health status for the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHealthResult> getHealth(GetHealthArgs args) {
        return getHealth(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Load Balancer Health resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the health status for the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHealthResult> getHealth(GetHealthArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getHealth:getHealth", TypeShape.of(GetHealthResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Hostnames in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all hostname resources associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHostnamesResult> getHostnames(GetHostnamesArgs args) {
        return getHostnames(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Hostnames in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all hostname resources associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHostnamesResult> getHostnames(GetHostnamesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getHostnames:getHostnames", TypeShape.of(GetHostnamesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Listener Rules in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all of the rules from all of the rule sets associated with the specified listener. The response organizes
     * the rules in the following order:
     * 
     * *  Access control rules
     * *  Allow method rules
     * *  Request header rules
     * *  Response header rules
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetListenerRulesResult> getListenerRules(GetListenerRulesArgs args) {
        return getListenerRules(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Listener Rules in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all of the rules from all of the rule sets associated with the specified listener. The response organizes
     * the rules in the following order:
     * 
     * *  Access control rules
     * *  Allow method rules
     * *  Request header rules
     * *  Response header rules
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetListenerRulesResult> getListenerRules(GetListenerRulesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getListenerRules:getListenerRules", TypeShape.of(GetListenerRulesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Load Balancer Routing Policies in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all routing policies associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLoadBalancerRoutingPoliciesResult> getLoadBalancerRoutingPolicies(GetLoadBalancerRoutingPoliciesArgs args) {
        return getLoadBalancerRoutingPolicies(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Load Balancer Routing Policies in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all routing policies associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLoadBalancerRoutingPoliciesResult> getLoadBalancerRoutingPolicies(GetLoadBalancerRoutingPoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getLoadBalancerRoutingPolicies:getLoadBalancerRoutingPolicies", TypeShape.of(GetLoadBalancerRoutingPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Load Balancer Routing Policy resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the specified routing policy.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLoadBalancerRoutingPolicyResult> getLoadBalancerRoutingPolicy(GetLoadBalancerRoutingPolicyArgs args) {
        return getLoadBalancerRoutingPolicy(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Load Balancer Routing Policy resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the specified routing policy.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLoadBalancerRoutingPolicyResult> getLoadBalancerRoutingPolicy(GetLoadBalancerRoutingPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getLoadBalancerRoutingPolicy:getLoadBalancerRoutingPolicy", TypeShape.of(GetLoadBalancerRoutingPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Load Balancers in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all load balancers in the specified compartment.
     * 
     * ## Supported Aliases
     * 
     * * `oci_load_balancers`
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLoadBalancersResult> getLoadBalancers(GetLoadBalancersArgs args) {
        return getLoadBalancers(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Load Balancers in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all load balancers in the specified compartment.
     * 
     * ## Supported Aliases
     * 
     * * `oci_load_balancers`
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLoadBalancersResult> getLoadBalancers(GetLoadBalancersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getLoadBalancers:getLoadBalancers", TypeShape.of(GetLoadBalancersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Path Route Sets in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all path route sets associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPathRouteSetsResult> getPathRouteSets(GetPathRouteSetsArgs args) {
        return getPathRouteSets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Path Route Sets in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all path route sets associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPathRouteSetsResult> getPathRouteSets(GetPathRouteSetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getPathRouteSets:getPathRouteSets", TypeShape.of(GetPathRouteSetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Load Balancer Policies in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists the available load balancer policies.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPoliciesResult> getPolicies(GetPoliciesArgs args) {
        return getPolicies(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Load Balancer Policies in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists the available load balancer policies.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPoliciesResult> getPolicies(GetPoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getPolicies:getPolicies", TypeShape.of(GetPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Load Balancer Protocols in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all supported traffic protocols.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProtocolsResult> getProtocols(GetProtocolsArgs args) {
        return getProtocols(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Load Balancer Protocols in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all supported traffic protocols.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetProtocolsResult> getProtocols(GetProtocolsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getProtocols:getProtocols", TypeShape.of(GetProtocolsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Rule Set resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the specified set of rules.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRuleSetResult> getRuleSet(GetRuleSetArgs args) {
        return getRuleSet(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Rule Set resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the specified set of rules.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRuleSetResult> getRuleSet(GetRuleSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getRuleSet:getRuleSet", TypeShape.of(GetRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Rule Sets in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all rule sets associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRuleSetsResult> getRuleSets(GetRuleSetsArgs args) {
        return getRuleSets(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Rule Sets in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all rule sets associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRuleSetsResult> getRuleSets(GetRuleSetsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getRuleSets:getRuleSets", TypeShape.of(GetRuleSetsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Load Balancer Shapes in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists the valid load balancer shapes.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetShapesResult> getShapes(GetShapesArgs args) {
        return getShapes(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Load Balancer Shapes in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists the valid load balancer shapes.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetShapesResult> getShapes(GetShapesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getShapes:getShapes", TypeShape.of(GetShapesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Ssl Cipher Suite resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the specified SSL cipher suite&#39;s configuration information.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSslCipherSuiteResult> getSslCipherSuite(GetSslCipherSuiteArgs args) {
        return getSslCipherSuite(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Ssl Cipher Suite resource in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Gets the specified SSL cipher suite&#39;s configuration information.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSslCipherSuiteResult> getSslCipherSuite(GetSslCipherSuiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getSslCipherSuite:getSslCipherSuite", TypeShape.of(GetSslCipherSuiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Ssl Cipher Suites in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all SSL cipher suites associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSslCipherSuitesResult> getSslCipherSuites() {
        return getSslCipherSuites(GetSslCipherSuitesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Ssl Cipher Suites in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all SSL cipher suites associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSslCipherSuitesResult> getSslCipherSuites(GetSslCipherSuitesArgs args) {
        return getSslCipherSuites(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Ssl Cipher Suites in Oracle Cloud Infrastructure Load Balancer service.
     * 
     * Lists all SSL cipher suites associated with the specified load balancer.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSslCipherSuitesResult> getSslCipherSuites(GetSslCipherSuitesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:LoadBalancer/getSslCipherSuites:getSslCipherSuites", TypeShape.of(GetSslCipherSuitesResult.class), args, Utilities.withVersion(options));
    }
}
