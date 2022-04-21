// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.HttpHeaderActionResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * In contrast to a single BackendService in HttpRouteAction to which all matching traffic is directed to, WeightedBackendService allows traffic to be split across multiple backend services. The volume of traffic for each backend service is proportional to the weight specified in each WeightedBackendService
 * 
 */
public final class WeightedBackendServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final WeightedBackendServiceResponse Empty = new WeightedBackendServiceResponse();

    /**
     * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
     * 
     */
    @Import(name="backendService", required=true)
    private String backendService;

    public String backendService() {
        return this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction", required=true)
    private HttpHeaderActionResponse headerAction;

    public HttpHeaderActionResponse headerAction() {
        return this.headerAction;
    }

    /**
     * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) . The selection of a backend service is determined only for new traffic. Once a user&#39;s request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service&#39;s session affinity policy. The value must be from 0 to 1000.
     * 
     */
    @Import(name="weight", required=true)
    private Integer weight;

    public Integer weight() {
        return this.weight;
    }

    private WeightedBackendServiceResponse() {}

    private WeightedBackendServiceResponse(WeightedBackendServiceResponse $) {
        this.backendService = $.backendService;
        this.headerAction = $.headerAction;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeightedBackendServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeightedBackendServiceResponse $;

        public Builder() {
            $ = new WeightedBackendServiceResponse();
        }

        public Builder(WeightedBackendServiceResponse defaults) {
            $ = new WeightedBackendServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder backendService(String backendService) {
            $.backendService = backendService;
            return this;
        }

        public Builder headerAction(HttpHeaderActionResponse headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder weight(Integer weight) {
            $.weight = weight;
            return this;
        }

        public WeightedBackendServiceResponse build() {
            $.backendService = Objects.requireNonNull($.backendService, "expected parameter 'backendService' to be non-null");
            $.headerAction = Objects.requireNonNull($.headerAction, "expected parameter 'headerAction' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
