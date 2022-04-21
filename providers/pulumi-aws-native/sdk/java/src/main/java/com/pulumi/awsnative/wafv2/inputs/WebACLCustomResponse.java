// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLCustomHTTPHeader;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom response.
 * 
 */
public final class WebACLCustomResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebACLCustomResponse Empty = new WebACLCustomResponse();

    /**
     * Custom response body key.
     * 
     */
    @Import(name="customResponseBodyKey")
    private @Nullable String customResponseBodyKey;

    public Optional<String> customResponseBodyKey() {
        return Optional.ofNullable(this.customResponseBodyKey);
    }

    @Import(name="responseCode", required=true)
    private Integer responseCode;

    public Integer responseCode() {
        return this.responseCode;
    }

    /**
     * Collection of HTTP headers.
     * 
     */
    @Import(name="responseHeaders")
    private @Nullable List<WebACLCustomHTTPHeader> responseHeaders;

    public Optional<List<WebACLCustomHTTPHeader>> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }

    private WebACLCustomResponse() {}

    private WebACLCustomResponse(WebACLCustomResponse $) {
        this.customResponseBodyKey = $.customResponseBodyKey;
        this.responseCode = $.responseCode;
        this.responseHeaders = $.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLCustomResponse $;

        public Builder() {
            $ = new WebACLCustomResponse();
        }

        public Builder(WebACLCustomResponse defaults) {
            $ = new WebACLCustomResponse(Objects.requireNonNull(defaults));
        }

        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            $.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder responseCode(Integer responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        public Builder responseHeaders(@Nullable List<WebACLCustomHTTPHeader> responseHeaders) {
            $.responseHeaders = responseHeaders;
            return this;
        }

        public Builder responseHeaders(WebACLCustomHTTPHeader... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }

        public WebACLCustomResponse build() {
            $.responseCode = Objects.requireNonNull($.responseCode, "expected parameter 'responseCode' to be non-null");
            return $;
        }
    }

}
