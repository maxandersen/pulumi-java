// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs>> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }

    /**
     * The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs>> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs>> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs>> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    /**
     * A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>>> weightedBackendServices() {
        return Optional.ofNullable(this.weightedBackendServices);
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionArgs() {}

    private RegionUrlMapPathMatcherRouteRuleRouteActionArgs(RegionUrlMapPathMatcherRouteRuleRouteActionArgs $) {
        this.corsPolicy = $.corsPolicy;
        this.faultInjectionPolicy = $.faultInjectionPolicy;
        this.requestMirrorPolicy = $.requestMirrorPolicy;
        this.retryPolicy = $.retryPolicy;
        this.timeout = $.timeout;
        this.urlRewrite = $.urlRewrite;
        this.weightedBackendServices = $.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleRouteActionArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder corsPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy) {
            $.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs corsPolicy) {
            return corsPolicy(Output.of(corsPolicy));
        }

        public Builder faultInjectionPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            $.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            return faultInjectionPolicy(Output.of(faultInjectionPolicy));
        }

        public Builder requestMirrorPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            $.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(RegionUrlMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            return requestMirrorPolicy(Output.of(requestMirrorPolicy));
        }

        public Builder retryPolicy(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        public Builder timeout(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(RegionUrlMapPathMatcherRouteRuleRouteActionTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder urlRewrite(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteArgs urlRewrite) {
            return urlRewrite(Output.of(urlRewrite));
        }

        public Builder weightedBackendServices(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            $.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(List<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            return weightedBackendServices(Output.of(weightedBackendServices));
        }

        public Builder weightedBackendServices(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionArgs build() {
            return $;
        }
    }

}
