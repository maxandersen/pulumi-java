// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionTimeoutArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionArgs Empty = new URLMapPathMatcherPathRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy() {
        return this.corsPolicy == null ? Codegen.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Codegen.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Codegen.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy() {
        return this.retryPolicy == null ? Codegen.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;

    public Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite() {
        return this.urlRewrite == null ? Codegen.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
      private final @Nullable Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices() {
        return this.weightedBackendServices == null ? Codegen.empty() : this.weightedBackendServices;
    }

    public URLMapPathMatcherPathRuleRouteActionArgs(
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout,
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private URLMapPathMatcherPathRuleRouteActionArgs() {
        this.corsPolicy = Codegen.empty();
        this.faultInjectionPolicy = Codegen.empty();
        this.requestMirrorPolicy = Codegen.empty();
        this.retryPolicy = Codegen.empty();
        this.timeout = Codegen.empty();
        this.urlRewrite = Codegen.empty();
        this.weightedBackendServices = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder corsPolicy(@Nullable URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Codegen.ofNullable(corsPolicy);
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Codegen.ofNullable(faultInjectionPolicy);
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Codegen.ofNullable(requestMirrorPolicy);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable URLMapPathMatcherPathRuleRouteActionTimeoutArgs timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder urlRewrite(@Nullable Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder urlRewrite(@Nullable URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Codegen.ofNullable(urlRewrite);
            return this;
        }
        public Builder weightedBackendServices(@Nullable Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(@Nullable List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Codegen.ofNullable(weightedBackendServices);
            return this;
        }
        public Builder weightedBackendServices(URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public URLMapPathMatcherPathRuleRouteActionArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
