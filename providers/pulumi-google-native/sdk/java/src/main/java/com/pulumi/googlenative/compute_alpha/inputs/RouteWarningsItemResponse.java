// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.RouteWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouteWarningsItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouteWarningsItemResponse Empty = new RouteWarningsItemResponse();

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    /**
     * Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    @Import(name="data", required=true)
      private final List<RouteWarningsItemDataItemResponse> data;

    public List<RouteWarningsItemDataItemResponse> data() {
        return this.data;
    }

    /**
     * A human-readable description of the warning code.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String message() {
        return this.message;
    }

    public RouteWarningsItemResponse(
        String code,
        List<RouteWarningsItemDataItemResponse> data,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private RouteWarningsItemResponse() {
        this.code = null;
        this.data = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<RouteWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder data(List<RouteWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(RouteWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public RouteWarningsItemResponse build() {
            return new RouteWarningsItemResponse(code, data, message);
        }
    }
}
