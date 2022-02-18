// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.HTTPIngressRuleValueArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 * 
 */
public final class IngressRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressRuleArgs Empty = new IngressRuleArgs();

    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the "host" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to
     *    the IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     * Host can be "precise" which is a domain name without the terminating dot of a network host (e.g. "foo.bar.com") or "wildcard", which is a domain name prefixed with a single wildcard label (e.g. "*.foo.com"). The wildcard character '*' must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == "*"). Requests will be matched against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.
     * 
     */
    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    @InputImport(name="http")
    private final @Nullable Input<HTTPIngressRuleValueArgs> http;

    public Input<HTTPIngressRuleValueArgs> getHttp() {
        return this.http == null ? Input.empty() : this.http;
    }

    public IngressRuleArgs(
        @Nullable Input<String> host,
        @Nullable Input<HTTPIngressRuleValueArgs> http) {
        this.host = host;
        this.http = http;
    }

    private IngressRuleArgs() {
        this.host = Input.empty();
        this.http = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> host;
        private @Nullable Input<HTTPIngressRuleValueArgs> http;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.http = defaults.http;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setHttp(@Nullable Input<HTTPIngressRuleValueArgs> http) {
            this.http = http;
            return this;
        }

        public Builder setHttp(@Nullable HTTPIngressRuleValueArgs http) {
            this.http = Input.ofNullable(http);
            return this;
        }

        public IngressRuleArgs build() {
            return new IngressRuleArgs(host, http);
        }
    }
}
