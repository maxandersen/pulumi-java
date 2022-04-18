// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.HttpFilterConfigResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpHeaderActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpRedirectActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpRouteActionResponse;
import com.pulumi.googlenative.compute_beta.inputs.HttpRouteRuleMatchResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The HttpRouteRule setting specifies how to match an HTTP request and the corresponding routing action that load balancing proxies perform.
 * 
 */
public final class HttpRouteRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpRouteRuleResponse Empty = new HttpRouteRuleResponse();

    /**
     * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction", required=true)
      private final HttpHeaderActionResponse headerAction;

    public HttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }

    /**
     * Outbound route specific configuration for networkservices.HttpFilter resources enabled by Traffic Director. httpFilterConfigs only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="httpFilterConfigs", required=true)
      private final List<HttpFilterConfigResponse> httpFilterConfigs;

    public List<HttpFilterConfigResponse> httpFilterConfigs() {
        return this.httpFilterConfigs;
    }

    /**
     * Outbound route specific metadata supplied to networkservices.HttpFilter resources enabled by Traffic Director. httpFilterMetadata only applies for load balancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details. The only configTypeUrl supported is type.googleapis.com/google.protobuf.Struct Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="httpFilterMetadata", required=true)
      private final List<HttpFilterConfigResponse> httpFilterMetadata;

    public List<HttpFilterConfigResponse> httpFilterMetadata() {
        return this.httpFilterMetadata;
    }

    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * 
     */
    @Import(name="matchRules", required=true)
      private final List<HttpRouteRuleMatchResponse> matchRules;

    public List<HttpRouteRuleMatchResponse> matchRules() {
        return this.matchRules;
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
     * 
     */
    @Import(name="routeAction", required=true)
      private final HttpRouteActionResponse routeAction;

    public HttpRouteActionResponse routeAction() {
        return this.routeAction;
    }

    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String service() {
        return this.service;
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="urlRedirect", required=true)
      private final HttpRedirectActionResponse urlRedirect;

    public HttpRedirectActionResponse urlRedirect() {
        return this.urlRedirect;
    }

    public HttpRouteRuleResponse(
        String description,
        HttpHeaderActionResponse headerAction,
        List<HttpFilterConfigResponse> httpFilterConfigs,
        List<HttpFilterConfigResponse> httpFilterMetadata,
        List<HttpRouteRuleMatchResponse> matchRules,
        Integer priority,
        HttpRouteActionResponse routeAction,
        String service,
        HttpRedirectActionResponse urlRedirect) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.headerAction = Objects.requireNonNull(headerAction, "expected parameter 'headerAction' to be non-null");
        this.httpFilterConfigs = Objects.requireNonNull(httpFilterConfigs, "expected parameter 'httpFilterConfigs' to be non-null");
        this.httpFilterMetadata = Objects.requireNonNull(httpFilterMetadata, "expected parameter 'httpFilterMetadata' to be non-null");
        this.matchRules = Objects.requireNonNull(matchRules, "expected parameter 'matchRules' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeAction = Objects.requireNonNull(routeAction, "expected parameter 'routeAction' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.urlRedirect = Objects.requireNonNull(urlRedirect, "expected parameter 'urlRedirect' to be non-null");
    }

    private HttpRouteRuleResponse() {
        this.description = null;
        this.headerAction = null;
        this.httpFilterConfigs = List.of();
        this.httpFilterMetadata = List.of();
        this.matchRules = List.of();
        this.priority = null;
        this.routeAction = null;
        this.service = null;
        this.urlRedirect = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private HttpHeaderActionResponse headerAction;
        private List<HttpFilterConfigResponse> httpFilterConfigs;
        private List<HttpFilterConfigResponse> httpFilterMetadata;
        private List<HttpRouteRuleMatchResponse> matchRules;
        private Integer priority;
        private HttpRouteActionResponse routeAction;
        private String service;
        private HttpRedirectActionResponse urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.httpFilterConfigs = defaults.httpFilterConfigs;
    	      this.httpFilterMetadata = defaults.httpFilterMetadata;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder headerAction(HttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }
        public Builder httpFilterConfigs(List<HttpFilterConfigResponse> httpFilterConfigs) {
            this.httpFilterConfigs = Objects.requireNonNull(httpFilterConfigs);
            return this;
        }
        public Builder httpFilterConfigs(HttpFilterConfigResponse... httpFilterConfigs) {
            return httpFilterConfigs(List.of(httpFilterConfigs));
        }
        public Builder httpFilterMetadata(List<HttpFilterConfigResponse> httpFilterMetadata) {
            this.httpFilterMetadata = Objects.requireNonNull(httpFilterMetadata);
            return this;
        }
        public Builder httpFilterMetadata(HttpFilterConfigResponse... httpFilterMetadata) {
            return httpFilterMetadata(List.of(httpFilterMetadata));
        }
        public Builder matchRules(List<HttpRouteRuleMatchResponse> matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }
        public Builder matchRules(HttpRouteRuleMatchResponse... matchRules) {
            return matchRules(List.of(matchRules));
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeAction(HttpRouteActionResponse routeAction) {
            this.routeAction = Objects.requireNonNull(routeAction);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder urlRedirect(HttpRedirectActionResponse urlRedirect) {
            this.urlRedirect = Objects.requireNonNull(urlRedirect);
            return this;
        }        public HttpRouteRuleResponse build() {
            return new HttpRouteRuleResponse(description, headerAction, httpFilterConfigs, httpFilterMetadata, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
