// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath;

    public Optional<Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs() {}

    private WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs $) {
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
    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs();
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs defaults) {
            $ = new WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementNotStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchGetArgs build() {
            return $;
        }
    }

}
