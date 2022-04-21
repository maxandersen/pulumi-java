// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.TargetSslProxyProxyHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetSslProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetSslProxyArgs Empty = new TargetSslProxyArgs();

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
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @Import(name="proxyHeader")
    private @Nullable Output<TargetSslProxyProxyHeader> proxyHeader;

    public Optional<Output<TargetSslProxyProxyHeader>> proxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * URL to the BackendService resource.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="sslCertificates")
    private @Nullable Output<List<String>> sslCertificates;

    public Optional<Output<List<String>>> sslCertificates() {
        return Optional.ofNullable(this.sslCertificates);
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set, the TargetSslProxy resource will not have any SSL policy configured.
     * 
     */
    @Import(name="sslPolicy")
    private @Nullable Output<String> sslPolicy;

    public Optional<Output<String>> sslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    private TargetSslProxyArgs() {}

    private TargetSslProxyArgs(TargetSslProxyArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.proxyHeader = $.proxyHeader;
        this.requestId = $.requestId;
        this.service = $.service;
        this.sslCertificates = $.sslCertificates;
        this.sslPolicy = $.sslPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetSslProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetSslProxyArgs $;

        public Builder() {
            $ = new TargetSslProxyArgs();
        }

        public Builder(TargetSslProxyArgs defaults) {
            $ = new TargetSslProxyArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
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

        public Builder proxyHeader(@Nullable Output<TargetSslProxyProxyHeader> proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        public Builder proxyHeader(TargetSslProxyProxyHeader proxyHeader) {
            return proxyHeader(Output.of(proxyHeader));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder sslCertificates(@Nullable Output<List<String>> sslCertificates) {
            $.sslCertificates = sslCertificates;
            return this;
        }

        public Builder sslCertificates(List<String> sslCertificates) {
            return sslCertificates(Output.of(sslCertificates));
        }

        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }

        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(String sslPolicy) {
            return sslPolicy(Output.of(sslPolicy));
        }

        public TargetSslProxyArgs build() {
            return $;
        }
    }

}
