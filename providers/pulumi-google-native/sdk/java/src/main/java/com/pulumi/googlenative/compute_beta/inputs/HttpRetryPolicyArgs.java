// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The retry policy associates with HttpRouteRule
 * 
 */
public final class HttpRetryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRetryPolicyArgs Empty = new HttpRetryPolicyArgs();

    /**
     * Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    @Import(name="numRetries")
      private final @Nullable Output<Integer> numRetries;

    public Output<Integer> numRetries() {
        return this.numRetries == null ? Codegen.empty() : this.numRetries;
    }

    /**
     * Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="perTryTimeout")
      private final @Nullable Output<DurationArgs> perTryTimeout;

    public Output<DurationArgs> perTryTimeout() {
        return this.perTryTimeout == null ? Codegen.empty() : this.perTryTimeout;
    }

    /**
     * Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
     * 
     */
    @Import(name="retryConditions")
      private final @Nullable Output<List<String>> retryConditions;

    public Output<List<String>> retryConditions() {
        return this.retryConditions == null ? Codegen.empty() : this.retryConditions;
    }

    public HttpRetryPolicyArgs(
        @Nullable Output<Integer> numRetries,
        @Nullable Output<DurationArgs> perTryTimeout,
        @Nullable Output<List<String>> retryConditions) {
        this.numRetries = numRetries;
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    private HttpRetryPolicyArgs() {
        this.numRetries = Codegen.empty();
        this.perTryTimeout = Codegen.empty();
        this.retryConditions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> numRetries;
        private @Nullable Output<DurationArgs> perTryTimeout;
        private @Nullable Output<List<String>> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        public Builder numRetries(@Nullable Integer numRetries) {
            this.numRetries = Codegen.ofNullable(numRetries);
            return this;
        }
        public Builder perTryTimeout(@Nullable Output<DurationArgs> perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        public Builder perTryTimeout(@Nullable DurationArgs perTryTimeout) {
            this.perTryTimeout = Codegen.ofNullable(perTryTimeout);
            return this;
        }
        public Builder retryConditions(@Nullable Output<List<String>> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }
        public Builder retryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = Codegen.ofNullable(retryConditions);
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }        public HttpRetryPolicyArgs build() {
            return new HttpRetryPolicyArgs(numRetries, perTryTimeout, retryConditions);
        }
    }
}
