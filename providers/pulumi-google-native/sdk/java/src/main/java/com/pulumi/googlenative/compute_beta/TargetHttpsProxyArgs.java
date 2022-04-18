// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.TargetHttpsProxyQuicOverride;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetHttpsProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetHttpsProxyArgs Empty = new TargetHttpsProxyArgs();

    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
     */
    @Import(name="authorizationPolicy")
      private final @Nullable Output<String> authorizationPolicy;

    public Output<String> authorizationPolicy() {
        return this.authorizationPolicy == null ? Codegen.empty() : this.authorizationPolicy;
    }

    /**
     * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for global target proxies. If set, sslCertificates will be ignored.
     * 
     */
    @Import(name="certificateMap")
      private final @Nullable Output<String> certificateMap;

    public Output<String> certificateMap() {
        return this.certificateMap == null ? Codegen.empty() : this.certificateMap;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/beta/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
     */
    @Import(name="httpFilters")
      private final @Nullable Output<List<String>> httpFilters;

    public Output<List<String>> httpFilters() {
        return this.httpFilters == null ? Codegen.empty() : this.httpFilters;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    @Import(name="proxyBind")
      private final @Nullable Output<Boolean> proxyBind;

    public Output<Boolean> proxyBind() {
        return this.proxyBind == null ? Codegen.empty() : this.proxyBind;
    }

    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
     */
    @Import(name="quicOverride")
      private final @Nullable Output<TargetHttpsProxyQuicOverride> quicOverride;

    public Output<TargetHttpsProxyQuicOverride> quicOverride() {
        return this.quicOverride == null ? Codegen.empty() : this.quicOverride;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    @Import(name="serverTlsPolicy")
      private final @Nullable Output<String> serverTlsPolicy;

    public Output<String> serverTlsPolicy() {
        return this.serverTlsPolicy == null ? Codegen.empty() : this.serverTlsPolicy;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="sslCertificates")
      private final @Nullable Output<List<String>> sslCertificates;

    public Output<List<String>> sslCertificates() {
        return this.sslCertificates == null ? Codegen.empty() : this.sslCertificates;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
     */
    @Import(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> sslPolicy() {
        return this.sslPolicy == null ? Codegen.empty() : this.sslPolicy;
    }

    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
     */
    @Import(name="urlMap")
      private final @Nullable Output<String> urlMap;

    public Output<String> urlMap() {
        return this.urlMap == null ? Codegen.empty() : this.urlMap;
    }

    public TargetHttpsProxyArgs(
        @Nullable Output<String> authorizationPolicy,
        @Nullable Output<String> certificateMap,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> httpFilters,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> proxyBind,
        @Nullable Output<TargetHttpsProxyQuicOverride> quicOverride,
        @Nullable Output<String> requestId,
        @Nullable Output<String> serverTlsPolicy,
        @Nullable Output<List<String>> sslCertificates,
        @Nullable Output<String> sslPolicy,
        @Nullable Output<String> urlMap) {
        this.authorizationPolicy = authorizationPolicy;
        this.certificateMap = certificateMap;
        this.description = description;
        this.httpFilters = httpFilters;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.quicOverride = quicOverride;
        this.requestId = requestId;
        this.serverTlsPolicy = serverTlsPolicy;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
        this.urlMap = urlMap;
    }

    private TargetHttpsProxyArgs() {
        this.authorizationPolicy = Codegen.empty();
        this.certificateMap = Codegen.empty();
        this.description = Codegen.empty();
        this.httpFilters = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.proxyBind = Codegen.empty();
        this.quicOverride = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serverTlsPolicy = Codegen.empty();
        this.sslCertificates = Codegen.empty();
        this.sslPolicy = Codegen.empty();
        this.urlMap = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationPolicy;
        private @Nullable Output<String> certificateMap;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> httpFilters;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> proxyBind;
        private @Nullable Output<TargetHttpsProxyQuicOverride> quicOverride;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> serverTlsPolicy;
        private @Nullable Output<List<String>> sslCertificates;
        private @Nullable Output<String> sslPolicy;
        private @Nullable Output<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.certificateMap = defaults.certificateMap;
    	      this.description = defaults.description;
    	      this.httpFilters = defaults.httpFilters;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.requestId = defaults.requestId;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder authorizationPolicy(@Nullable Output<String> authorizationPolicy) {
            this.authorizationPolicy = authorizationPolicy;
            return this;
        }
        public Builder authorizationPolicy(@Nullable String authorizationPolicy) {
            this.authorizationPolicy = Codegen.ofNullable(authorizationPolicy);
            return this;
        }
        public Builder certificateMap(@Nullable Output<String> certificateMap) {
            this.certificateMap = certificateMap;
            return this;
        }
        public Builder certificateMap(@Nullable String certificateMap) {
            this.certificateMap = Codegen.ofNullable(certificateMap);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder httpFilters(@Nullable Output<List<String>> httpFilters) {
            this.httpFilters = httpFilters;
            return this;
        }
        public Builder httpFilters(@Nullable List<String> httpFilters) {
            this.httpFilters = Codegen.ofNullable(httpFilters);
            return this;
        }
        public Builder httpFilters(String... httpFilters) {
            return httpFilters(List.of(httpFilters));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder proxyBind(@Nullable Output<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }
        public Builder proxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Codegen.ofNullable(proxyBind);
            return this;
        }
        public Builder quicOverride(@Nullable Output<TargetHttpsProxyQuicOverride> quicOverride) {
            this.quicOverride = quicOverride;
            return this;
        }
        public Builder quicOverride(@Nullable TargetHttpsProxyQuicOverride quicOverride) {
            this.quicOverride = Codegen.ofNullable(quicOverride);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serverTlsPolicy(@Nullable Output<String> serverTlsPolicy) {
            this.serverTlsPolicy = serverTlsPolicy;
            return this;
        }
        public Builder serverTlsPolicy(@Nullable String serverTlsPolicy) {
            this.serverTlsPolicy = Codegen.ofNullable(serverTlsPolicy);
            return this;
        }
        public Builder sslCertificates(@Nullable Output<List<String>> sslCertificates) {
            this.sslCertificates = sslCertificates;
            return this;
        }
        public Builder sslCertificates(@Nullable List<String> sslCertificates) {
            this.sslCertificates = Codegen.ofNullable(sslCertificates);
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }
        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Codegen.ofNullable(sslPolicy);
            return this;
        }
        public Builder urlMap(@Nullable Output<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }
        public Builder urlMap(@Nullable String urlMap) {
            this.urlMap = Codegen.ofNullable(urlMap);
            return this;
        }        public TargetHttpsProxyArgs build() {
            return new TargetHttpsProxyArgs(authorizationPolicy, certificateMap, description, httpFilters, name, project, proxyBind, quicOverride, requestId, serverTlsPolicy, sslCertificates, sslPolicy, urlMap);
        }
    }
}
