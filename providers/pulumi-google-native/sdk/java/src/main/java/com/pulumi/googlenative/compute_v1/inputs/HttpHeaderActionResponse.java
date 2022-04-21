// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.HttpHeaderOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The request and response header transformations that take effect before the request is passed along to the selected backendService.
 * 
 */
public final class HttpHeaderActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpHeaderActionResponse Empty = new HttpHeaderActionResponse();

    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToAdd", required=true)
    private List<HttpHeaderOptionResponse> requestHeadersToAdd;

    public List<HttpHeaderOptionResponse> requestHeadersToAdd() {
        return this.requestHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToRemove", required=true)
    private List<String> requestHeadersToRemove;

    public List<String> requestHeadersToRemove() {
        return this.requestHeadersToRemove;
    }

    /**
     * Headers to add the response before sending the response back to the client.
     * 
     */
    @Import(name="responseHeadersToAdd", required=true)
    private List<HttpHeaderOptionResponse> responseHeadersToAdd;

    public List<HttpHeaderOptionResponse> responseHeadersToAdd() {
        return this.responseHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    @Import(name="responseHeadersToRemove", required=true)
    private List<String> responseHeadersToRemove;

    public List<String> responseHeadersToRemove() {
        return this.responseHeadersToRemove;
    }

    private HttpHeaderActionResponse() {}

    private HttpHeaderActionResponse(HttpHeaderActionResponse $) {
        this.requestHeadersToAdd = $.requestHeadersToAdd;
        this.requestHeadersToRemove = $.requestHeadersToRemove;
        this.responseHeadersToAdd = $.responseHeadersToAdd;
        this.responseHeadersToRemove = $.responseHeadersToRemove;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpHeaderActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpHeaderActionResponse $;

        public Builder() {
            $ = new HttpHeaderActionResponse();
        }

        public Builder(HttpHeaderActionResponse defaults) {
            $ = new HttpHeaderActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder requestHeadersToAdd(List<HttpHeaderOptionResponse> requestHeadersToAdd) {
            $.requestHeadersToAdd = requestHeadersToAdd;
            return this;
        }

        public Builder requestHeadersToAdd(HttpHeaderOptionResponse... requestHeadersToAdd) {
            return requestHeadersToAdd(List.of(requestHeadersToAdd));
        }

        public Builder requestHeadersToRemove(List<String> requestHeadersToRemove) {
            $.requestHeadersToRemove = requestHeadersToRemove;
            return this;
        }

        public Builder requestHeadersToRemove(String... requestHeadersToRemove) {
            return requestHeadersToRemove(List.of(requestHeadersToRemove));
        }

        public Builder responseHeadersToAdd(List<HttpHeaderOptionResponse> responseHeadersToAdd) {
            $.responseHeadersToAdd = responseHeadersToAdd;
            return this;
        }

        public Builder responseHeadersToAdd(HttpHeaderOptionResponse... responseHeadersToAdd) {
            return responseHeadersToAdd(List.of(responseHeadersToAdd));
        }

        public Builder responseHeadersToRemove(List<String> responseHeadersToRemove) {
            $.responseHeadersToRemove = responseHeadersToRemove;
            return this;
        }

        public Builder responseHeadersToRemove(String... responseHeadersToRemove) {
            return responseHeadersToRemove(List.of(responseHeadersToRemove));
        }

        public HttpHeaderActionResponse build() {
            $.requestHeadersToAdd = Objects.requireNonNull($.requestHeadersToAdd, "expected parameter 'requestHeadersToAdd' to be non-null");
            $.requestHeadersToRemove = Objects.requireNonNull($.requestHeadersToRemove, "expected parameter 'requestHeadersToRemove' to be non-null");
            $.responseHeadersToAdd = Objects.requireNonNull($.responseHeadersToAdd, "expected parameter 'responseHeadersToAdd' to be non-null");
            $.responseHeadersToRemove = Objects.requireNonNull($.responseHeadersToRemove, "expected parameter 'responseHeadersToRemove' to be non-null");
            return $;
        }
    }

}
