// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetHttpProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetHttpProxyArgs Empty = new TargetHttpProxyArgs();

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
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/v1alpha1/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
     */
    @Import(name="httpFilters")
    private @Nullable Output<List<String>> httpFilters;

    public Optional<Output<List<String>>> httpFilters() {
        return Optional.ofNullable(this.httpFilters);
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

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    @Import(name="proxyBind")
    private @Nullable Output<Boolean> proxyBind;

    public Optional<Output<Boolean>> proxyBind() {
        return Optional.ofNullable(this.proxyBind);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * URL to the UrlMap resource that defines the mapping from URL to the BackendService.
     * 
     */
    @Import(name="urlMap")
    private @Nullable Output<String> urlMap;

    public Optional<Output<String>> urlMap() {
        return Optional.ofNullable(this.urlMap);
    }

    private TargetHttpProxyArgs() {}

    private TargetHttpProxyArgs(TargetHttpProxyArgs $) {
        this.description = $.description;
        this.httpFilters = $.httpFilters;
        this.name = $.name;
        this.project = $.project;
        this.proxyBind = $.proxyBind;
        this.requestId = $.requestId;
        this.urlMap = $.urlMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetHttpProxyArgs $;

        public Builder() {
            $ = new TargetHttpProxyArgs();
        }

        public Builder(TargetHttpProxyArgs defaults) {
            $ = new TargetHttpProxyArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder httpFilters(@Nullable Output<List<String>> httpFilters) {
            $.httpFilters = httpFilters;
            return this;
        }

        public Builder httpFilters(List<String> httpFilters) {
            return httpFilters(Output.of(httpFilters));
        }

        public Builder httpFilters(String... httpFilters) {
            return httpFilters(List.of(httpFilters));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder proxyBind(@Nullable Output<Boolean> proxyBind) {
            $.proxyBind = proxyBind;
            return this;
        }

        public Builder proxyBind(Boolean proxyBind) {
            return proxyBind(Output.of(proxyBind));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder urlMap(@Nullable Output<String> urlMap) {
            $.urlMap = urlMap;
            return this;
        }

        public Builder urlMap(String urlMap) {
            return urlMap(Output.of(urlMap));
        }

        public TargetHttpProxyArgs build() {
            return $;
        }
    }

}
