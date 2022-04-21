// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupCustomHTTPHeader;
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
public final class RuleGroupCustomResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupCustomResponse Empty = new RuleGroupCustomResponse();

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
    private @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders;

    public Optional<List<RuleGroupCustomHTTPHeader>> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }

    private RuleGroupCustomResponse() {}

    private RuleGroupCustomResponse(RuleGroupCustomResponse $) {
        this.customResponseBodyKey = $.customResponseBodyKey;
        this.responseCode = $.responseCode;
        this.responseHeaders = $.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupCustomResponse $;

        public Builder() {
            $ = new RuleGroupCustomResponse();
        }

        public Builder(RuleGroupCustomResponse defaults) {
            $ = new RuleGroupCustomResponse(Objects.requireNonNull(defaults));
        }

        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            $.customResponseBodyKey = customResponseBodyKey;
            return this;
        }

        public Builder responseCode(Integer responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        public Builder responseHeaders(@Nullable List<RuleGroupCustomHTTPHeader> responseHeaders) {
            $.responseHeaders = responseHeaders;
            return this;
        }

        public Builder responseHeaders(RuleGroupCustomHTTPHeader... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }

        public RuleGroupCustomResponse build() {
            $.responseCode = Objects.requireNonNull($.responseCode, "expected parameter 'responseCode' to be non-null");
            return $;
        }
    }

}
