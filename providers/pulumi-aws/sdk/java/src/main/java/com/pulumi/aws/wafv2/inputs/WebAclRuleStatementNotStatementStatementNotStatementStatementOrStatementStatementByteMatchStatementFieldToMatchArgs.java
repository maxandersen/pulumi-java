// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs() {}

    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
