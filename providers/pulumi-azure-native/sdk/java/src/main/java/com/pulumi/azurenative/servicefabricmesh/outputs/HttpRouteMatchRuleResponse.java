// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.azurenative.servicefabricmesh.outputs.HttpRouteMatchHeaderResponse;
import com.pulumi.azurenative.servicefabricmesh.outputs.HttpRouteMatchPathResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class HttpRouteMatchRuleResponse {
    /**
     * headers and their values to match in request.
     * 
     */
    private final @Nullable List<HttpRouteMatchHeaderResponse> headers;
    /**
     * Path to match for routing.
     * 
     */
    private final HttpRouteMatchPathResponse path;

    @CustomType.Constructor
    private HttpRouteMatchRuleResponse(
        @CustomType.Parameter("headers") @Nullable List<HttpRouteMatchHeaderResponse> headers,
        @CustomType.Parameter("path") HttpRouteMatchPathResponse path) {
        this.headers = headers;
        this.path = path;
    }

    /**
     * headers and their values to match in request.
     * 
    */
    public List<HttpRouteMatchHeaderResponse> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * Path to match for routing.
     * 
    */
    public HttpRouteMatchPathResponse path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HttpRouteMatchHeaderResponse> headers;
        private HttpRouteMatchPathResponse path;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.path = defaults.path;
        }

        public Builder headers(@Nullable List<HttpRouteMatchHeaderResponse> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(HttpRouteMatchHeaderResponse... headers) {
            return headers(List.of(headers));
        }
        public Builder path(HttpRouteMatchPathResponse path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public HttpRouteMatchRuleResponse build() {
            return new HttpRouteMatchRuleResponse(headers, path);
        }
    }
}
