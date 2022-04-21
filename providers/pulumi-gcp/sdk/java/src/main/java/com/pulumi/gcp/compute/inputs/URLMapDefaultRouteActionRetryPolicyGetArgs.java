// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyPerTryTimeoutGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionRetryPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionRetryPolicyGetArgs Empty = new URLMapDefaultRouteActionRetryPolicyGetArgs();

    /**
     * Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    @Import(name="numRetries")
    private @Nullable Output<Integer> numRetries;

    public Optional<Output<Integer>> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }

    /**
     * Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @Import(name="perTryTimeout")
    private @Nullable Output<URLMapDefaultRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout;

    public Optional<Output<URLMapDefaultRouteActionRetryPolicyPerTryTimeoutGetArgs>> perTryTimeout() {
        return Optional.ofNullable(this.perTryTimeout);
    }

    /**
     * Specfies one or more conditions when this retry rule applies. Valid values are:
     * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
     *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
     * * connection failure, and refused streams.
     * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
     *   for example due to connection timeouts.
     * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
     *   This reset type indicates that it is safe to retry.
     * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
     * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
     * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
     * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    @Import(name="retryConditions")
    private @Nullable Output<List<String>> retryConditions;

    public Optional<Output<List<String>>> retryConditions() {
        return Optional.ofNullable(this.retryConditions);
    }

    private URLMapDefaultRouteActionRetryPolicyGetArgs() {}

    private URLMapDefaultRouteActionRetryPolicyGetArgs(URLMapDefaultRouteActionRetryPolicyGetArgs $) {
        this.numRetries = $.numRetries;
        this.perTryTimeout = $.perTryTimeout;
        this.retryConditions = $.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapDefaultRouteActionRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapDefaultRouteActionRetryPolicyGetArgs $;

        public Builder() {
            $ = new URLMapDefaultRouteActionRetryPolicyGetArgs();
        }

        public Builder(URLMapDefaultRouteActionRetryPolicyGetArgs defaults) {
            $ = new URLMapDefaultRouteActionRetryPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        public Builder numRetries(Integer numRetries) {
            return numRetries(Output.of(numRetries));
        }

        public Builder perTryTimeout(@Nullable Output<URLMapDefaultRouteActionRetryPolicyPerTryTimeoutGetArgs> perTryTimeout) {
            $.perTryTimeout = perTryTimeout;
            return this;
        }

        public Builder perTryTimeout(URLMapDefaultRouteActionRetryPolicyPerTryTimeoutGetArgs perTryTimeout) {
            return perTryTimeout(Output.of(perTryTimeout));
        }

        public Builder retryConditions(@Nullable Output<List<String>> retryConditions) {
            $.retryConditions = retryConditions;
            return this;
        }

        public Builder retryConditions(List<String> retryConditions) {
            return retryConditions(Output.of(retryConditions));
        }

        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }

        public URLMapDefaultRouteActionRetryPolicyGetArgs build() {
            return $;
        }
    }

}
