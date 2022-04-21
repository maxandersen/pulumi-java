// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rules to match an HTTP request and dispatch that request to a service.
 * 
 */
public final class UrlDispatchRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlDispatchRuleArgs Empty = new UrlDispatchRuleArgs();

    /**
     * Domain name to match against. The wildcard &#34;*&#34; is supported if specified before a period: &#34;*.&#34;.Defaults to matching all domains: &#34;*&#34;.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Pathname within the host. Must start with a &#34;/&#34;. A single &#34;*&#34; can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private UrlDispatchRuleArgs() {}

    private UrlDispatchRuleArgs(UrlDispatchRuleArgs $) {
        this.domain = $.domain;
        this.path = $.path;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlDispatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlDispatchRuleArgs $;

        public Builder() {
            $ = new UrlDispatchRuleArgs();
        }

        public Builder(UrlDispatchRuleArgs defaults) {
            $ = new UrlDispatchRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public UrlDispatchRuleArgs build() {
            return $;
        }
    }

}
