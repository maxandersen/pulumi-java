// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs $) {
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
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
