// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs Empty = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs() {}

    private RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs $) {
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
    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs();
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
            $ = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public RuleGroupRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
