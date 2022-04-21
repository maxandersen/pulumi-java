// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs Empty = new RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

    public Optional<Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs() {}

    private RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs $) {
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
    public static Builder builder(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs();
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
            $ = new RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        public Builder body(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body) {
            $.body = body;
            return this;
        }

        public Builder body(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyArgs body) {
            return body(Output.of(body));
        }

        public Builder method(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method) {
            $.method = method;
            return this;
        }

        public Builder method(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodArgs method) {
            return method(Output.of(method));
        }

        public Builder queryString(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public RuleGroupRuleStatementOrStatementStatementSizeConstraintStatementFieldToMatchArgs build() {
            return $;
        }
    }

}
