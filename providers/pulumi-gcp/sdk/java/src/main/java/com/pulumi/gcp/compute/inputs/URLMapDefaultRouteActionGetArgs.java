// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCorsPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRequestMirrorPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionTimeoutGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionUrlRewriteGetArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionGetArgs Empty = new URLMapDefaultRouteActionGetArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<URLMapDefaultRouteActionCorsPolicyGetArgs> corsPolicy;

    public Output<URLMapDefaultRouteActionCorsPolicyGetArgs> corsPolicy() {
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
      private final @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;

    public Output<URLMapDefaultRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy() {
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
      private final @Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;

    public Output<URLMapDefaultRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Codegen.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<URLMapDefaultRouteActionRetryPolicyGetArgs> retryPolicy;

    public Output<URLMapDefaultRouteActionRetryPolicyGetArgs> retryPolicy() {
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
      private final @Nullable Output<URLMapDefaultRouteActionTimeoutGetArgs> timeout;

    public Output<URLMapDefaultRouteActionTimeoutGetArgs> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<URLMapDefaultRouteActionUrlRewriteGetArgs> urlRewrite;

    public Output<URLMapDefaultRouteActionUrlRewriteGetArgs> urlRewrite() {
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
      private final @Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

    public Output<List<URLMapDefaultRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices() {
        return this.weightedBackendServices == null ? Codegen.empty() : this.weightedBackendServices;
    }

    public URLMapDefaultRouteActionGetArgs(
        @Nullable Output<URLMapDefaultRouteActionCorsPolicyGetArgs> corsPolicy,
        @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy,
        @Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy,
        @Nullable Output<URLMapDefaultRouteActionRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<URLMapDefaultRouteActionTimeoutGetArgs> timeout,
        @Nullable Output<URLMapDefaultRouteActionUrlRewriteGetArgs> urlRewrite,
        @Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private URLMapDefaultRouteActionGetArgs() {
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

    public static Builder builder(URLMapDefaultRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapDefaultRouteActionCorsPolicyGetArgs> corsPolicy;
        private @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy;
        private @Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy;
        private @Nullable Output<URLMapDefaultRouteActionRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<URLMapDefaultRouteActionTimeoutGetArgs> timeout;
        private @Nullable Output<URLMapDefaultRouteActionUrlRewriteGetArgs> urlRewrite;
        private @Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<URLMapDefaultRouteActionCorsPolicyGetArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder corsPolicy(@Nullable URLMapDefaultRouteActionCorsPolicyGetArgs corsPolicy) {
            this.corsPolicy = Codegen.ofNullable(corsPolicy);
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyGetArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyGetArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Codegen.ofNullable(faultInjectionPolicy);
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyGetArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable URLMapDefaultRouteActionRequestMirrorPolicyGetArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Codegen.ofNullable(requestMirrorPolicy);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<URLMapDefaultRouteActionRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable URLMapDefaultRouteActionRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<URLMapDefaultRouteActionTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable URLMapDefaultRouteActionTimeoutGetArgs timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder urlRewrite(@Nullable Output<URLMapDefaultRouteActionUrlRewriteGetArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder urlRewrite(@Nullable URLMapDefaultRouteActionUrlRewriteGetArgs urlRewrite) {
            this.urlRewrite = Codegen.ofNullable(urlRewrite);
            return this;
        }
        public Builder weightedBackendServices(@Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceGetArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(@Nullable List<URLMapDefaultRouteActionWeightedBackendServiceGetArgs> weightedBackendServices) {
            this.weightedBackendServices = Codegen.ofNullable(weightedBackendServices);
            return this;
        }
        public Builder weightedBackendServices(URLMapDefaultRouteActionWeightedBackendServiceGetArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public URLMapDefaultRouteActionGetArgs build() {
            return new URLMapDefaultRouteActionGetArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
