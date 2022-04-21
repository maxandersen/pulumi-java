// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.HostRuleArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HttpHeaderActionArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HttpRedirectActionArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HttpRouteActionArgs;
import com.pulumi.googlenative.compute_alpha.inputs.PathMatcherArgs;
import com.pulumi.googlenative.compute_alpha.inputs.UrlMapTestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapArgs Empty = new RegionUrlMapArgs();

    /**
     * defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="defaultRouteAction")
    private @Nullable Output<HttpRouteActionArgs> defaultRouteAction;

    public Optional<Output<HttpRouteActionArgs>> defaultRouteAction() {
        return Optional.ofNullable(this.defaultRouteAction);
    }

    /**
     * The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="defaultService")
    private @Nullable Output<String> defaultService;

    public Optional<Output<String>> defaultService() {
        return Optional.ofNullable(this.defaultService);
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="defaultUrlRedirect")
    private @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect;

    public Optional<Output<HttpRedirectActionArgs>> defaultUrlRedirect() {
        return Optional.ofNullable(this.defaultUrlRedirect);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<HttpHeaderActionArgs> headerAction;

    public Optional<Output<HttpHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * The list of host rules to use against the URL.
     * 
     */
    @Import(name="hostRules")
    private @Nullable Output<List<HostRuleArgs>> hostRules;

    public Optional<Output<List<HostRuleArgs>>> hostRules() {
        return Optional.ofNullable(this.hostRules);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The list of named PathMatchers to use against the URL.
     * 
     */
    @Import(name="pathMatchers")
    private @Nullable Output<List<PathMatcherArgs>> pathMatchers;

    public Optional<Output<List<PathMatcherArgs>>> pathMatchers() {
        return Optional.ofNullable(this.pathMatchers);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="tests")
    private @Nullable Output<List<UrlMapTestArgs>> tests;

    public Optional<Output<List<UrlMapTestArgs>>> tests() {
        return Optional.ofNullable(this.tests);
    }

    private RegionUrlMapArgs() {}

    private RegionUrlMapArgs(RegionUrlMapArgs $) {
        this.defaultRouteAction = $.defaultRouteAction;
        this.defaultService = $.defaultService;
        this.defaultUrlRedirect = $.defaultUrlRedirect;
        this.description = $.description;
        this.headerAction = $.headerAction;
        this.hostRules = $.hostRules;
        this.name = $.name;
        this.pathMatchers = $.pathMatchers;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.tests = $.tests;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapArgs $;

        public Builder() {
            $ = new RegionUrlMapArgs();
        }

        public Builder(RegionUrlMapArgs defaults) {
            $ = new RegionUrlMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultRouteAction(@Nullable Output<HttpRouteActionArgs> defaultRouteAction) {
            $.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder defaultRouteAction(HttpRouteActionArgs defaultRouteAction) {
            return defaultRouteAction(Output.of(defaultRouteAction));
        }

        public Builder defaultService(@Nullable Output<String> defaultService) {
            $.defaultService = defaultService;
            return this;
        }

        public Builder defaultService(String defaultService) {
            return defaultService(Output.of(defaultService));
        }

        public Builder defaultUrlRedirect(@Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect) {
            $.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder defaultUrlRedirect(HttpRedirectActionArgs defaultUrlRedirect) {
            return defaultUrlRedirect(Output.of(defaultUrlRedirect));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder headerAction(@Nullable Output<HttpHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(HttpHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        public Builder hostRules(@Nullable Output<List<HostRuleArgs>> hostRules) {
            $.hostRules = hostRules;
            return this;
        }

        public Builder hostRules(List<HostRuleArgs> hostRules) {
            return hostRules(Output.of(hostRules));
        }

        public Builder hostRules(HostRuleArgs... hostRules) {
            return hostRules(List.of(hostRules));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pathMatchers(@Nullable Output<List<PathMatcherArgs>> pathMatchers) {
            $.pathMatchers = pathMatchers;
            return this;
        }

        public Builder pathMatchers(List<PathMatcherArgs> pathMatchers) {
            return pathMatchers(Output.of(pathMatchers));
        }

        public Builder pathMatchers(PathMatcherArgs... pathMatchers) {
            return pathMatchers(List.of(pathMatchers));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder tests(@Nullable Output<List<UrlMapTestArgs>> tests) {
            $.tests = tests;
            return this;
        }

        public Builder tests(List<UrlMapTestArgs> tests) {
            return tests(Output.of(tests));
        }

        public Builder tests(UrlMapTestArgs... tests) {
            return tests(List.of(tests));
        }

        public RegionUrlMapArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
