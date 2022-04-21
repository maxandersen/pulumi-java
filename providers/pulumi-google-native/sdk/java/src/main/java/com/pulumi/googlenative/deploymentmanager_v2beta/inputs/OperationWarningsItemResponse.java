// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.OperationWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OperationWarningsItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final OperationWarningsItemResponse Empty = new OperationWarningsItemResponse();

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    @Import(name="data", required=true)
    private List<OperationWarningsItemDataItemResponse> data;

    public List<OperationWarningsItemDataItemResponse> data() {
        return this.data;
    }

    /**
     * A human-readable description of the warning code.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    private OperationWarningsItemResponse() {}

    private OperationWarningsItemResponse(OperationWarningsItemResponse $) {
        this.code = $.code;
        this.data = $.data;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationWarningsItemResponse $;

        public Builder() {
            $ = new OperationWarningsItemResponse();
        }

        public Builder(OperationWarningsItemResponse defaults) {
            $ = new OperationWarningsItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder data(List<OperationWarningsItemDataItemResponse> data) {
            $.data = data;
            return this;
        }

        public Builder data(OperationWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public OperationWarningsItemResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.data = Objects.requireNonNull($.data, "expected parameter 'data' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
