// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.SslPolicyWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SslPolicyWarningsItemResponse {
    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    private final String code;
    /**
     * Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    private final List<SslPolicyWarningsItemDataItemResponse> data;
    /**
     * A human-readable description of the warning code.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private SslPolicyWarningsItemResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("data") List<SslPolicyWarningsItemDataItemResponse> data,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
    */
    public String code() {
        return this.code;
    }
    /**
     * Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
    */
    public List<SslPolicyWarningsItemDataItemResponse> data() {
        return this.data;
    }
    /**
     * A human-readable description of the warning code.
     * 
    */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslPolicyWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<SslPolicyWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(SslPolicyWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder data(List<SslPolicyWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(SslPolicyWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public SslPolicyWarningsItemResponse build() {
            return new SslPolicyWarningsItemResponse(code, data, message);
        }
    }
}
