// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.HttpHeaderActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpRedirectActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpRouteActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpRouteRuleResponse;
import com.pulumi.googlenative.compute_beta.inputs.PathRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A matcher for the path portion of the URL. The BackendService from the longest-matched rule will serve the URL. If no rule was matched, the default service is used.
 * 
 */
public final class PathMatcherResponse extends com.pulumi.resources.InvokeArgs {

    public static final PathMatcherResponse Empty = new PathMatcherResponse();

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher&#39;s defaultRouteAction.
     * 
     */
    @Import(name="defaultRouteAction", required=true)
    private HttpRouteActionResponse defaultRouteAction;

    public HttpRouteActionResponse defaultRouteAction() {
        return this.defaultRouteAction;
    }

    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    @Import(name="defaultService", required=true)
    private String defaultService;

    public String defaultService() {
        return this.defaultService;
    }

    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="defaultUrlRedirect", required=true)
    private HttpRedirectActionResponse defaultUrlRedirect;

    public HttpRedirectActionResponse defaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction", required=true)
    private HttpHeaderActionResponse headerAction;

    public HttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }

    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that&#39;s required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    @Import(name="pathRules", required=true)
    private List<PathRuleResponse> pathRules;

    public List<PathRuleResponse> pathRules() {
        return this.pathRules;
    }

    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    @Import(name="routeRules", required=true)
    private List<HttpRouteRuleResponse> routeRules;

    public List<HttpRouteRuleResponse> routeRules() {
        return this.routeRules;
    }

    private PathMatcherResponse() {}

    private PathMatcherResponse(PathMatcherResponse $) {
        this.defaultRouteAction = $.defaultRouteAction;
        this.defaultService = $.defaultService;
        this.defaultUrlRedirect = $.defaultUrlRedirect;
        this.description = $.description;
        this.headerAction = $.headerAction;
        this.name = $.name;
        this.pathRules = $.pathRules;
        this.routeRules = $.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PathMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PathMatcherResponse $;

        public Builder() {
            $ = new PathMatcherResponse();
        }

        public Builder(PathMatcherResponse defaults) {
            $ = new PathMatcherResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultRouteAction(HttpRouteActionResponse defaultRouteAction) {
            $.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder defaultService(String defaultService) {
            $.defaultService = defaultService;
            return this;
        }

        public Builder defaultUrlRedirect(HttpRedirectActionResponse defaultUrlRedirect) {
            $.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder headerAction(HttpHeaderActionResponse headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder pathRules(List<PathRuleResponse> pathRules) {
            $.pathRules = pathRules;
            return this;
        }

        public Builder pathRules(PathRuleResponse... pathRules) {
            return pathRules(List.of(pathRules));
        }

        public Builder routeRules(List<HttpRouteRuleResponse> routeRules) {
            $.routeRules = routeRules;
            return this;
        }

        public Builder routeRules(HttpRouteRuleResponse... routeRules) {
            return routeRules(List.of(routeRules));
        }

        public PathMatcherResponse build() {
            $.defaultRouteAction = Objects.requireNonNull($.defaultRouteAction, "expected parameter 'defaultRouteAction' to be non-null");
            $.defaultService = Objects.requireNonNull($.defaultService, "expected parameter 'defaultService' to be non-null");
            $.defaultUrlRedirect = Objects.requireNonNull($.defaultUrlRedirect, "expected parameter 'defaultUrlRedirect' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.headerAction = Objects.requireNonNull($.headerAction, "expected parameter 'headerAction' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.pathRules = Objects.requireNonNull($.pathRules, "expected parameter 'pathRules' to be non-null");
            $.routeRules = Objects.requireNonNull($.routeRules, "expected parameter 'routeRules' to be non-null");
            return $;
        }
    }

}
