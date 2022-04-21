// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs $) {
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
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
